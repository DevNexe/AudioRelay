package com.revenuecat.purchases.google;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.SkuDetails;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.PurchaseExtensionsKt;
import com.revenuecat.purchases.common.PurchaseHistoryRecordExtensionsKt;
import com.revenuecat.purchases.common.ReplaceSkuInfo;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.google.BillingWrapper;
import com.revenuecat.purchases.models.PurchaseState;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreProductHelpers;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.BillingStrings;
import com.revenuecat.purchases.strings.OfferingStrings;
import com.revenuecat.purchases.strings.PurchaseStrings;
import com.revenuecat.purchases.strings.RestoreStrings;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import defpackage.Md5A;
import defpackage.ah3;
import defpackage.bh3;
import defpackage.cs0;
import defpackage.cx1;
import defpackage.es5;
import defpackage.fa;
import defpackage.fl3;
import defpackage.j81;
import defpackage.mu;
import defpackage.nm4;
import defpackage.om4;
import defpackage.qb7;
import defpackage.ra;
import defpackage.ra7;
import defpackage.sd5;
import defpackage.t92;
import defpackage.ty;
import defpackage.u85;
import defpackage.ur1;
import defpackage.uy2;
import defpackage.v9L;
import defpackage.wu;
import defpackage.x81;
import defpackage.xg3;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes3.dex */
public final class BillingWrapper extends BillingAbstract implements bh3, fa {
    private volatile com.android.billingclient.api.QnHx billingClient;
    private final ClientFactory clientFactory;
    private final DeviceCache deviceCache;
    private final Handler mainHandler;
    private final Map<String, ProductType> productTypes = new LinkedHashMap();
    private final Map<String, String> presentedOfferingsByProductIdentifier = new LinkedHashMap();
    private final ConcurrentLinkedQueue<j81<PurchasesError, sd5>> serviceRequests = new ConcurrentLinkedQueue<>();
    private long reconnectMilliseconds = 1000;

    public static final class ClientFactory {
        private final Context context;

        public ClientFactory(Context context) {
            this.context = context;
        }

        public final com.android.billingclient.api.QnHx buildClient(bh3 bh3Var) {
            Context context = this.context;
            if (context == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            }
            if (bh3Var != null) {
                return bh3Var != null ? new com.android.billingclient.api.CQf(true, context, bh3Var) : new com.android.billingclient.api.CQf(true, context);
            }
            throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$findPurchaseInPurchaseHistory$1, reason: invalid class name and case insensitive filesystem */
    public static final class C14311 extends cx1 implements j81<com.android.billingclient.api.QnHx, sd5> {
        final /* synthetic */ j81<StoreTransaction, sd5> $onCompletion;
        final /* synthetic */ j81<PurchasesError, sd5> $onError;
        final /* synthetic */ ProductType $productType;
        final /* synthetic */ String $sku;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14311(String str, ProductType productType, j81<? super PurchasesError, sd5> j81Var, j81<? super StoreTransaction, sd5> j81Var2) {
            super(1);
            this.$sku = str;
            this.$productType = productType;
            this.$onError = j81Var;
            this.$onCompletion = j81Var2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: invoke$lambda-2$lambda-1, reason: not valid java name */
        public static final void m23invoke$lambda2$lambda1(ProductType productType, j81 j81Var, String str, j81 j81Var2, com.android.billingclient.api.NUlFixed nUl, List list) {
            Object next;
            if (!BillingResultExtensionsKt.isSuccessful(nUl)) {
                j81Var2.invoke(ErrorsKt.billingResponseToPurchasesError(nUl.a, String.format(PurchaseStrings.ERROR_FINDING_PURCHASE, Arrays.copyOf(new Object[]{str}, 1))));
                return;
            }
            StoreTransaction storeTransaction = null;
            if (list != null) {
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!PurchaseHistoryRecordExtensionsKt.getListOfSkus((PurchaseHistoryRecord) next).contains(str));
                PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) next;
                if (purchaseHistoryRecord != null) {
                    storeTransaction = PaymenTransactionConversionsKt.toStoreTransaction(purchaseHistoryRecord, productType);
                }
            }
            if (storeTransaction != null) {
                j81Var.invoke(storeTransaction);
            } else {
                j81Var2.invoke(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, String.format(PurchaseStrings.NO_EXISTING_PURCHASE, Arrays.copyOf(new Object[]{str}, 1))));
            }
        }

        @Override // defpackage.j81
        public /* bridge */ /* synthetic */ sd5 invoke(com.android.billingclient.api.QnHx qnHx) {
            invoke2(qnHx);
            return sd5.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(com.android.billingclient.api.QnHx qnHx) {
            sd5 sd5Var;
            Md5A.h(new Object[]{this.$sku, this.$productType.name()}, 2, RestoreStrings.QUERYING_PURCHASE_WITH_TYPE, LogIntent.DEBUG);
            String sKUType = ProductTypeConversionsKt.toSKUType(this.$productType);
            if (sKUType != null) {
                qnHx.g(sKUType, new F1(this.$sku, this.$productType, this.$onCompletion, this.$onError));
                sd5Var = sd5.a;
            } else {
                sd5Var = null;
            }
            if (sd5Var == null) {
                this.$onError.invoke(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, PurchaseStrings.NOT_RECOGNIZED_PRODUCT_TYPE));
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$launchBillingFlow$1, reason: invalid class name and case insensitive filesystem */
    public static final class C14321 extends cx1 implements j81<com.android.billingclient.api.QnHx, sd5> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ com.android.billingclient.api.F1 $params;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14321(Activity activity, com.android.billingclient.api.F1 f1) {
            super(1);
            this.$activity = activity;
            this.$params = f1;
        }

        @Override // defpackage.j81
        public /* bridge */ /* synthetic */ sd5 invoke(com.android.billingclient.api.QnHx qnHx) {
            invoke2(qnHx);
            return sd5.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(com.android.billingclient.api.QnHx qnHx) {
            com.android.billingclient.api.NUlFixed nUlF = qnHx.f(this.$activity, this.$params);
            if (!(nUlF.a != 0)) {
                nUlF = null;
            }
            if (nUlF != null) {
                Md5A.h(new Object[]{BillingResultExtensionsKt.toHumanReadableDescription(nUlF)}, 1, BillingStrings.BILLING_INTENT_FAILED, LogIntent.GOOGLE_ERROR);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryAllPurchases$1, reason: invalid class name and case insensitive filesystem */
    public static final class C14341 extends cx1 implements j81<List<? extends PurchaseHistoryRecord>, sd5> {
        final /* synthetic */ j81<List<StoreTransaction>, sd5> $onReceivePurchaseHistory;
        final /* synthetic */ j81<PurchasesError, sd5> $onReceivePurchaseHistoryError;

        /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryAllPurchases$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C01101 extends cx1 implements j81<List<? extends PurchaseHistoryRecord>, sd5> {
            final /* synthetic */ j81<List<StoreTransaction>, sd5> $onReceivePurchaseHistory;
            final /* synthetic */ List<PurchaseHistoryRecord> $subsPurchasesList;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C01101(j81<? super List<StoreTransaction>, sd5> j81Var, List<? extends PurchaseHistoryRecord> list) {
                super(1);
                this.$onReceivePurchaseHistory = j81Var;
                this.$subsPurchasesList = list;
            }

            @Override // defpackage.j81
            public /* bridge */ /* synthetic */ sd5 invoke(List<? extends PurchaseHistoryRecord> list) {
                invoke2(list);
                return sd5.a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<? extends PurchaseHistoryRecord> list) {
                j81<List<StoreTransaction>, sd5> j81Var = this.$onReceivePurchaseHistory;
                List<PurchaseHistoryRecord> list2 = this.$subsPurchasesList;
                ArrayList arrayList = new ArrayList(mu.w0(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(PaymenTransactionConversionsKt.toStoreTransaction((PurchaseHistoryRecord) it.next(), ProductType.SUBS));
                }
                List<? extends PurchaseHistoryRecord> list3 = list;
                ArrayList arrayList2 = new ArrayList(mu.w0(list3, 10));
                Iterator<T> it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(PaymenTransactionConversionsKt.toStoreTransaction((PurchaseHistoryRecord) it2.next(), ProductType.INAPP));
                }
                j81Var.invoke(wu.U0(arrayList2, arrayList));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14341(j81<? super PurchasesError, sd5> j81Var, j81<? super List<StoreTransaction>, sd5> j81Var2) {
            super(1);
            this.$onReceivePurchaseHistoryError = j81Var;
            this.$onReceivePurchaseHistory = j81Var2;
        }

        @Override // defpackage.j81
        public /* bridge */ /* synthetic */ sd5 invoke(List<? extends PurchaseHistoryRecord> list) {
            invoke2(list);
            return sd5.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends PurchaseHistoryRecord> list) {
            BillingWrapper.this.queryPurchaseHistoryAsync("inapp", new C01101(this.$onReceivePurchaseHistory, list), this.$onReceivePurchaseHistoryError);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryPurchaseHistoryAsync$1, reason: invalid class name and case insensitive filesystem */
    public static final class C14351 extends cx1 implements j81<PurchasesError, sd5> {
        final /* synthetic */ j81<List<? extends PurchaseHistoryRecord>, sd5> $onReceivePurchaseHistory;
        final /* synthetic */ j81<PurchasesError, sd5> $onReceivePurchaseHistoryError;
        final /* synthetic */ String $skuType;

        /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryPurchaseHistoryAsync$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C01111 extends cx1 implements j81<com.android.billingclient.api.QnHx, sd5> {
            final /* synthetic */ j81<List<? extends PurchaseHistoryRecord>, sd5> $onReceivePurchaseHistory;
            final /* synthetic */ j81<PurchasesError, sd5> $onReceivePurchaseHistoryError;
            final /* synthetic */ String $skuType;
            final /* synthetic */ BillingWrapper this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C01111(BillingWrapper billingWrapper, String str, j81<? super List<? extends PurchaseHistoryRecord>, sd5> j81Var, j81<? super PurchasesError, sd5> j81Var2) {
                super(1);
                this.this$0 = billingWrapper;
                this.$skuType = str;
                this.$onReceivePurchaseHistory = j81Var;
                this.$onReceivePurchaseHistoryError = j81Var2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: invoke$lambda-3, reason: not valid java name */
            public static final void m24invoke$lambda3(j81 j81Var, j81 j81Var2, com.android.billingclient.api.NUlFixed nUl, List list) {
                int i = nUl.a;
                if (i != 0) {
                    PurchasesError purchasesErrorBillingResponseToPurchasesError = ErrorsKt.billingResponseToPurchasesError(i, "Error receiving purchase history. " + BillingResultExtensionsKt.toHumanReadableDescription(nUl));
                    LogUtilsKt.errorLog(purchasesErrorBillingResponseToPurchasesError);
                    j81Var2.invoke(purchasesErrorBillingResponseToPurchasesError);
                    return;
                }
                List list2 = list;
                sd5 sd5Var = null;
                List list3 = !(list2 == null || list2.isEmpty()) ? list : null;
                if (list3 != null) {
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        Md5A.h(new Object[]{PurchaseHistoryRecordExtensionsKt.toHumanReadableDescription((PurchaseHistoryRecord) it.next())}, 1, RestoreStrings.PURCHASE_HISTORY_RETRIEVED, LogIntent.RC_PURCHASE_SUCCESS);
                    }
                    sd5Var = sd5.a;
                }
                if (sd5Var == null) {
                    LogWrapperKt.log(LogIntent.DEBUG, RestoreStrings.PURCHASE_HISTORY_EMPTY);
                }
                if (list == null) {
                    list = cs0.w;
                }
                j81Var.invoke(list);
            }

            @Override // defpackage.j81
            public /* bridge */ /* synthetic */ sd5 invoke(com.android.billingclient.api.QnHx qnHx) {
                invoke2(qnHx);
                return sd5.a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(com.android.billingclient.api.QnHx qnHx) {
                this.this$0.queryPurchaseHistoryAsyncEnsuringOneResponse(qnHx, this.$skuType, new QnHx(this.$onReceivePurchaseHistory, this.$onReceivePurchaseHistoryError));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14351(j81<? super PurchasesError, sd5> j81Var, String str, j81<? super List<? extends PurchaseHistoryRecord>, sd5> j81Var2) {
            super(1);
            this.$onReceivePurchaseHistoryError = j81Var;
            this.$skuType = str;
            this.$onReceivePurchaseHistory = j81Var2;
        }

        @Override // defpackage.j81
        public /* bridge */ /* synthetic */ sd5 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return sd5.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            if (purchasesError != null) {
                this.$onReceivePurchaseHistoryError.invoke(purchasesError);
            } else {
                BillingWrapper billingWrapper = BillingWrapper.this;
                billingWrapper.withConnectedClient(new C01111(billingWrapper, this.$skuType, this.$onReceivePurchaseHistory, this.$onReceivePurchaseHistoryError));
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryPurchases$1, reason: invalid class name and case insensitive filesystem */
    public static final class C14361 extends cx1 implements j81<com.android.billingclient.api.QnHx, sd5> {
        final /* synthetic */ j81<PurchasesError, sd5> $onError;
        final /* synthetic */ j81<Map<String, StoreTransaction>, sd5> $onSuccess;
        final /* synthetic */ BillingWrapper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14361(j81<? super PurchasesError, sd5> j81Var, BillingWrapper billingWrapper, j81<? super Map<String, StoreTransaction>, sd5> j81Var2) {
            super(1);
            this.$onError = j81Var;
            this.this$0 = billingWrapper;
            this.$onSuccess = j81Var2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: invoke$lambda-1, reason: not valid java name */
        public static final void m25invoke$lambda1(final j81 j81Var, final BillingWrapper billingWrapper, com.android.billingclient.api.QnHx qnHx, final j81 j81Var2, com.android.billingclient.api.NUlFixed nUl, List list) {
            if (!BillingResultExtensionsKt.isSuccessful(nUl)) {
                j81Var.invoke(ErrorsKt.billingResponseToPurchasesError(nUl.a, String.format(RestoreStrings.QUERYING_SUBS_ERROR, Arrays.copyOf(new Object[]{BillingResultExtensionsKt.toHumanReadableDescription(nUl)}, 1))));
            } else {
                final Map mapOfGooglePurchaseWrapper = billingWrapper.toMapOfGooglePurchaseWrapper(list, "subs");
                qnHx.h("inapp", new ah3() { // from class: com.revenuecat.purchases.google.LPt8Fixed
                    @Override // defpackage.ah3
                    public final void b(com.android.billingclient.api.NUlFixed nUl2, List list2) {
                        BillingWrapper.C14361.m26invoke$lambda1$lambda0(j81Var, billingWrapper, j81Var2, mapOfGooglePurchaseWrapper, nUl2, list2);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: invoke$lambda-1$lambda-0, reason: not valid java name */
        public static final void m26invoke$lambda1$lambda0(j81 j81Var, BillingWrapper billingWrapper, j81 j81Var2, Map map, com.android.billingclient.api.NUlFixed nUl, List list) {
            if (BillingResultExtensionsKt.isSuccessful(nUl)) {
                j81Var2.invoke(t92.S(map, billingWrapper.toMapOfGooglePurchaseWrapper(list, "inapp")));
            } else {
                j81Var.invoke(ErrorsKt.billingResponseToPurchasesError(nUl.a, String.format(RestoreStrings.QUERYING_INAPP_ERROR, Arrays.copyOf(new Object[]{BillingResultExtensionsKt.toHumanReadableDescription(nUl)}, 1))));
            }
        }

        @Override // defpackage.j81
        public /* bridge */ /* synthetic */ sd5 invoke(com.android.billingclient.api.QnHx qnHx) {
            invoke2(qnHx);
            return sd5.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(com.android.billingclient.api.QnHx qnHx) {
            LogWrapperKt.log(LogIntent.DEBUG, RestoreStrings.QUERYING_PURCHASE);
            qnHx.h("subs", new F1(this.$onError, this.this$0, qnHx, this.$onSuccess));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$querySkuDetailsAsync$1, reason: invalid class name and case insensitive filesystem */
    public static final class C14371 extends cx1 implements j81<PurchasesError, sd5> {
        final /* synthetic */ List<String> $nonEmptySkus;
        final /* synthetic */ j81<PurchasesError, sd5> $onError;
        final /* synthetic */ j81<List<StoreProduct>, sd5> $onReceive;
        final /* synthetic */ ProductType $productType;
        final /* synthetic */ Set<String> $skus;
        final /* synthetic */ BillingWrapper this$0;

        /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$querySkuDetailsAsync$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C01121 extends cx1 implements j81<com.android.billingclient.api.QnHx, sd5> {
            final /* synthetic */ j81<PurchasesError, sd5> $onError;
            final /* synthetic */ j81<List<StoreProduct>, sd5> $onReceive;
            final /* synthetic */ nm4 $params;
            final /* synthetic */ Set<String> $skus;
            final /* synthetic */ BillingWrapper this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C01121(BillingWrapper billingWrapper, nm4 nm4Var, Set<String> set, j81<? super List<StoreProduct>, sd5> j81Var, j81<? super PurchasesError, sd5> j81Var2) {
                super(1);
                this.this$0 = billingWrapper;
                this.$params = nm4Var;
                this.$skus = set;
                this.$onReceive = j81Var;
                this.$onError = j81Var2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r9v7, types: [cs0] */
            /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r9v9, types: [java.util.ArrayList] */
            /* JADX INFO: renamed from: invoke$lambda-4, reason: not valid java name */
            public static final void m27invoke$lambda4(Set set, j81 j81Var, j81 j81Var2, com.android.billingclient.api.NUlFixed nUl, List list) {
                ?? arrayList;
                if (nUl.a != 0) {
                    Md5A.h(new Object[]{BillingResultExtensionsKt.toHumanReadableDescription(nUl)}, 1, OfferingStrings.FETCHING_PRODUCTS_ERROR, LogIntent.GOOGLE_ERROR);
                    PurchasesError purchasesErrorBillingResponseToPurchasesError = ErrorsKt.billingResponseToPurchasesError(nUl.a, "Error when fetching products. " + BillingResultExtensionsKt.toHumanReadableDescription(nUl));
                    LogUtilsKt.errorLog(purchasesErrorBillingResponseToPurchasesError);
                    j81Var2.invoke(purchasesErrorBillingResponseToPurchasesError);
                    return;
                }
                Md5A.h(new Object[]{wu.M0(set, null, null, null, null, 63)}, 1, OfferingStrings.FETCHING_PRODUCTS_FINISHED, LogIntent.DEBUG);
                LogIntent logIntent = LogIntent.PURCHASE;
                Object[] objArr = new Object[1];
                objArr[0] = list != null ? wu.M0(list, null, null, null, BillingWrapper$querySkuDetailsAsync$1$1$1$1.INSTANCE, 31) : null;
                Md5A.h(objArr, 1, OfferingStrings.RETRIEVED_PRODUCTS, logIntent);
                if (list != null) {
                    List<SkuDetails> list2 = list.isEmpty() ? null : list;
                    if (list2 != null) {
                        for (SkuDetails skuDetails : list2) {
                            Md5A.h(new Object[]{skuDetails.b.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID), skuDetails}, 2, OfferingStrings.LIST_PRODUCTS, LogIntent.PURCHASE);
                        }
                    }
                }
                if (list != null) {
                    List list3 = list;
                    arrayList = new ArrayList(mu.w0(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(StoreProductConversionsKt.toStoreProduct((SkuDetails) it.next()));
                    }
                } else {
                    arrayList = cs0.w;
                }
                j81Var.invoke(arrayList);
            }

            @Override // defpackage.j81
            public /* bridge */ /* synthetic */ sd5 invoke(com.android.billingclient.api.QnHx qnHx) {
                invoke2(qnHx);
                return sd5.a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(com.android.billingclient.api.QnHx qnHx) {
                this.this$0.querySkuDetailsAsyncEnsuringOneResponse(qnHx, this.$params, new NUlFixed(this.$skus, this.$onReceive, this.$onError));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14371(ProductType productType, List<String> list, BillingWrapper billingWrapper, j81<? super PurchasesError, sd5> j81Var, Set<String> set, j81<? super List<StoreProduct>, sd5> j81Var2) {
            super(1);
            this.$productType = productType;
            this.$nonEmptySkus = list;
            this.this$0 = billingWrapper;
            this.$onError = j81Var;
            this.$skus = set;
            this.$onReceive = j81Var2;
        }

        @Override // defpackage.j81
        public /* bridge */ /* synthetic */ sd5 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return sd5.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            if (purchasesError != null) {
                this.$onError.invoke(purchasesError);
                return;
            }
            String sKUType = ProductTypeConversionsKt.toSKUType(this.$productType);
            if (sKUType == null) {
                sKUType = "inapp";
            }
            ArrayList arrayList = new ArrayList(this.$nonEmptySkus);
            nm4 nm4Var = new nm4();
            nm4Var.a = sKUType;
            nm4Var.b = arrayList;
            BillingWrapper billingWrapper = this.this$0;
            billingWrapper.withConnectedClient(new C01121(billingWrapper, nm4Var, this.$skus, this.$onReceive, this.$onError));
        }
    }

    public BillingWrapper(ClientFactory clientFactory, Handler handler, DeviceCache deviceCache) {
        this.clientFactory = clientFactory;
        this.mainHandler = handler;
        this.deviceCache = deviceCache;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: endConnection$lambda-8, reason: not valid java name */
    public static final void m11endConnection$lambda8(BillingWrapper billingWrapper) {
        synchronized (billingWrapper) {
            com.android.billingclient.api.QnHx qnHx = billingWrapper.billingClient;
            if (qnHx != null) {
                LogWrapperKt.log(LogIntent.DEBUG, String.format(BillingStrings.BILLING_CLIENT_ENDING, Arrays.copyOf(new Object[]{qnHx}, 1)));
                qnHx.c();
            }
            billingWrapper.billingClient = null;
            sd5 sd5Var = sd5.a;
        }
    }

    private final void executePendingRequests() {
        synchronized (this) {
            while (true) {
                com.android.billingclient.api.QnHx qnHx = this.billingClient;
                boolean z = false;
                int i = 1;
                if (qnHx != null && qnHx.e()) {
                    z = true;
                }
                if (!z || this.serviceRequests.isEmpty()) {
                    break;
                }
                this.mainHandler.post(new ra(this.serviceRequests.remove(), i));
            }
            sd5 sd5Var = sd5.a;
        }
    }

    private final synchronized void executeRequestOnUIThread(j81<? super PurchasesError, sd5> j81Var) {
        if (getPurchasesUpdatedListener() != null) {
            this.serviceRequests.add(j81Var);
            com.android.billingclient.api.QnHx qnHx = this.billingClient;
            boolean z = false;
            if (qnHx != null && !qnHx.e()) {
                z = true;
            }
            if (z) {
                BillingAbstract.startConnectionOnMainThread$default(this, 0L, 1, null);
            } else {
                executePendingRequests();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getPurchaseType$lambda-16$lambda-15, reason: not valid java name */
    public static final void m13getPurchaseType$lambda16$lambda15(j81 j81Var, com.android.billingclient.api.QnHx qnHx, String str, com.android.billingclient.api.NUlFixed nUl, List list) {
        boolean z = true;
        boolean z2 = nUl.a == 0;
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            do {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
            } while (!ur1.a(((Purchase) it.next()).a(), str));
        } else {
            z = false;
            break;
        }
        if (z2 && z) {
            j81Var.invoke(ProductType.SUBS);
        } else {
            qnHx.h("inapp", new QnHx(j81Var, str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getPurchaseType$lambda-16$lambda-15$lambda-14, reason: not valid java name */
    public static final void m14getPurchaseType$lambda16$lambda15$lambda14(j81 j81Var, String str, com.android.billingclient.api.NUlFixed nUl, List list) {
        boolean z = true;
        boolean z2 = nUl.a == 0;
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            do {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
            } while (!ur1.a(((Purchase) it.next()).a(), str));
        } else {
            z = false;
            break;
        }
        if (z2 && z) {
            j81Var.invoke(ProductType.INAPP);
        } else {
            j81Var.invoke(ProductType.UNKNOWN);
        }
    }

    private final String getStackTrace() {
        StringWriter stringWriter = new StringWriter();
        new Throwable().printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    private final void getStoreTransaction(Purchase purchase, j81<? super StoreTransaction, sd5> j81Var) {
        Md5A.h(new Object[]{PurchaseExtensionsKt.toHumanReadableDescription(purchase)}, 1, BillingStrings.BILLING_WRAPPER_PURCHASES_UPDATED, LogIntent.DEBUG);
        synchronized (this) {
            String str = this.presentedOfferingsByProductIdentifier.get(PurchaseExtensionsKt.getFirstSku(purchase));
            ProductType productType = this.productTypes.get(PurchaseExtensionsKt.getFirstSku(purchase));
            if (productType != null) {
                j81Var.invoke(PaymenTransactionConversionsKt.toStoreTransaction(purchase, productType, str));
            } else {
                getPurchaseType$google_latestDependenciesRelease(purchase.a(), new BillingWrapper$getStoreTransaction$1$2(j81Var, purchase, str));
                sd5 sd5Var = sd5.a;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchBillingFlow(Activity activity, com.android.billingclient.api.F1 f1) {
        if (activity.getIntent() == null) {
            LogWrapperKt.log(LogIntent.WARNING, BillingStrings.NULL_ACTIVITY_INTENT);
        }
        withConnectedClient(new C14321(activity, f1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onBillingServiceDisconnected$lambda-26, reason: not valid java name */
    public static final void m15onBillingServiceDisconnected$lambda26(BillingWrapper billingWrapper) {
        Md5A.h(new Object[]{String.valueOf(billingWrapper.billingClient)}, 1, BillingStrings.BILLING_SERVICE_DISCONNECTED, LogIntent.DEBUG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onBillingSetupFinished$lambda-25, reason: not valid java name */
    public static final void m16onBillingSetupFinished$lambda25(final com.android.billingclient.api.NUlFixed nUl, BillingWrapper billingWrapper) {
        switch (nUl.a) {
            case -3:
            case -1:
            case 1:
            case 2:
            case 6:
                Md5A.h(new Object[]{BillingResultExtensionsKt.toHumanReadableDescription(nUl)}, 1, BillingStrings.BILLING_CLIENT_ERROR, LogIntent.GOOGLE_WARNING);
                billingWrapper.retryBillingServiceConnectionWithExponentialBackoff();
                return;
            case -2:
            case 3:
                final String str = String.format(BillingStrings.BILLING_UNAVAILABLE, Arrays.copyOf(new Object[]{BillingResultExtensionsKt.toHumanReadableDescription(nUl)}, 1));
                LogWrapperKt.log(LogIntent.GOOGLE_WARNING, str);
                synchronized (billingWrapper) {
                    while (!billingWrapper.serviceRequests.isEmpty()) {
                        final j81<PurchasesError, sd5> j81VarRemove = billingWrapper.serviceRequests.remove();
                        billingWrapper.mainHandler.post(new Runnable() { // from class: sa
                            @Override // java.lang.Runnable
                            public final void run() {
                                BillingWrapper.m17onBillingSetupFinished$lambda25$lambda24$lambda23$lambda22(j81VarRemove, nUl, str);
                            }
                        });
                        break;
                    }
                    sd5 sd5Var = sd5.a;
                }
                return;
            case 0:
                LogIntent logIntent = LogIntent.DEBUG;
                Object[] objArr = new Object[1];
                com.android.billingclient.api.QnHx qnHx = billingWrapper.billingClient;
                objArr[0] = qnHx != null ? qnHx.toString() : null;
                LogWrapperKt.log(logIntent, String.format(BillingStrings.BILLING_SERVICE_SETUP_FINISHED, Arrays.copyOf(objArr, 1)));
                BillingAbstract.StateListener stateListener = billingWrapper.getStateListener();
                if (stateListener != null) {
                    stateListener.onConnected();
                }
                billingWrapper.executePendingRequests();
                billingWrapper.reconnectMilliseconds = 1000L;
                return;
            case 4:
            case 7:
            case 8:
                Md5A.h(new Object[]{BillingResultExtensionsKt.toHumanReadableDescription(nUl)}, 1, BillingStrings.BILLING_CLIENT_ERROR, LogIntent.GOOGLE_WARNING);
                return;
            case 5:
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onBillingSetupFinished$lambda-25$lambda-24$lambda-23$lambda-22, reason: not valid java name */
    public static final void m17onBillingSetupFinished$lambda25$lambda24$lambda23$lambda22(j81 j81Var, com.android.billingclient.api.NUlFixed nUl, String str) {
        PurchasesError purchasesErrorBillingResponseToPurchasesError = ErrorsKt.billingResponseToPurchasesError(nUl.a, str);
        LogUtilsKt.errorLog(purchasesErrorBillingResponseToPurchasesError);
        j81Var.invoke(purchasesErrorBillingResponseToPurchasesError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void queryPurchaseHistoryAsyncEnsuringOneResponse(com.android.billingclient.api.QnHx qnHx, String str, xg3 xg3Var) {
        qnHx.g(str, new v9L(this, xg3Var, new fl3(), 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: queryPurchaseHistoryAsyncEnsuringOneResponse$lambda-34, reason: not valid java name */
    public static final void m18queryPurchaseHistoryAsyncEnsuringOneResponse$lambda34(BillingWrapper billingWrapper, xg3 xg3Var, fl3 fl3Var, com.android.billingclient.api.NUlFixed nUl, List list) {
        synchronized (billingWrapper) {
            if (fl3Var.w) {
                LogWrapperKt.log(LogIntent.GOOGLE_ERROR, String.format(RestoreStrings.EXTRA_QUERY_PURCHASE_HISTORY_RESPONSE, Arrays.copyOf(new Object[]{Integer.valueOf(nUl.a)}, 1)));
                return;
            }
            fl3Var.w = true;
            sd5 sd5Var = sd5.a;
            xg3Var.e(nUl, list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void querySkuDetailsAsyncEnsuringOneResponse(com.android.billingclient.api.QnHx qnHx, nm4 nm4Var, om4 om4Var) {
        qnHx.i(nm4Var, new v9L(this, om4Var, new fl3(), 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: querySkuDetailsAsyncEnsuringOneResponse$lambda-32, reason: not valid java name */
    public static final void m19querySkuDetailsAsyncEnsuringOneResponse$lambda32(BillingWrapper billingWrapper, om4 om4Var, fl3 fl3Var, com.android.billingclient.api.NUlFixed nUl, List list) {
        synchronized (billingWrapper) {
            if (fl3Var.w) {
                LogWrapperKt.log(LogIntent.GOOGLE_ERROR, String.format(OfferingStrings.EXTRA_QUERY_SKU_DETAILS_RESPONSE, Arrays.copyOf(new Object[]{Integer.valueOf(nUl.a)}, 1)));
                return;
            }
            fl3Var.w = true;
            sd5 sd5Var = sd5.a;
            om4Var.a(nUl, list);
        }
    }

    private final void retryBillingServiceConnectionWithExponentialBackoff() {
        Md5A.h(new Object[]{Long.valueOf(this.reconnectMilliseconds)}, 1, BillingStrings.BILLING_CLIENT_RETRY, LogIntent.DEBUG);
        startConnectionOnMainThread(this.reconnectMilliseconds);
        this.reconnectMilliseconds = Math.min(this.reconnectMilliseconds * ((long) 2), 900000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, StoreTransaction> toMapOfGooglePurchaseWrapper(List<? extends Purchase> list, String str) {
        List<? extends Purchase> list2 = list;
        ArrayList arrayList = new ArrayList(mu.w0(list2, 10));
        for (Purchase purchase : list2) {
            arrayList.add(new uy2(UtilsKt.sha1(purchase.a()), PaymenTransactionConversionsKt.toStoreTransaction(purchase, ProductTypeConversionsKt.toProductType(str), null)));
        }
        return t92.V(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void withConnectedClient(j81<? super com.android.billingclient.api.QnHx, sd5> j81Var) {
        com.android.billingclient.api.QnHx qnHx = this.billingClient;
        sd5 sd5Var = null;
        if (qnHx != null) {
            if (!qnHx.e()) {
                qnHx = null;
            }
            if (qnHx != null) {
                j81Var.invoke(qnHx);
                sd5Var = sd5.a;
            }
        }
        if (sd5Var == null) {
            Md5A.h(new Object[]{getStackTrace()}, 1, BillingStrings.BILLING_CLIENT_DISCONNECTED, LogIntent.GOOGLE_WARNING);
        }
    }

    public final void acknowledge$google_latestDependenciesRelease(String str, x81<? super com.android.billingclient.api.NUlFixed, ? super String, sd5> x81Var) {
        LogWrapperKt.log(LogIntent.PURCHASE, String.format(PurchaseStrings.ACKNOWLEDGING_PURCHASE, Arrays.copyOf(new Object[]{str}, 1)));
        executeRequestOnUIThread(new BillingWrapper$acknowledge$1(this, str, x81Var));
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void consumeAndSave(boolean z, StoreTransaction storeTransaction) {
        if (storeTransaction.getType() == ProductType.UNKNOWN || storeTransaction.getPurchaseState() == PurchaseState.PENDING) {
            return;
        }
        Purchase originalGooglePurchase = PaymenTransactionConversionsKt.getOriginalGooglePurchase(storeTransaction);
        boolean zOptBoolean = originalGooglePurchase != null ? originalGooglePurchase.c.optBoolean("acknowledged", true) : false;
        if (z && storeTransaction.getType() == ProductType.INAPP) {
            consumePurchase$google_latestDependenciesRelease(storeTransaction.getPurchaseToken(), new AnonymousClass1());
        } else if (!z || zOptBoolean) {
            this.deviceCache.addSuccessfullyPostedToken(storeTransaction.getPurchaseToken());
        } else {
            acknowledge$google_latestDependenciesRelease(storeTransaction.getPurchaseToken(), new AnonymousClass2());
        }
    }

    public final void consumePurchase$google_latestDependenciesRelease(String str, x81<? super com.android.billingclient.api.NUlFixed, ? super String, sd5> x81Var) {
        LogWrapperKt.log(LogIntent.PURCHASE, String.format(PurchaseStrings.CONSUMING_PURCHASE, Arrays.copyOf(new Object[]{str}, 1)));
        executeRequestOnUIThread(new BillingWrapper$consumePurchase$1(this, str, x81Var));
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void endConnection() {
        this.mainHandler.post(new ra(this, 0));
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void findPurchaseInPurchaseHistory(String str, ProductType productType, String str2, j81<? super StoreTransaction, sd5> j81Var, j81<? super PurchasesError, sd5> j81Var2) {
        withConnectedClient(new C14311(str2, productType, j81Var2, j81Var));
    }

    public final synchronized com.android.billingclient.api.QnHx getBillingClient() {
        return this.billingClient;
    }

    public final void getPurchaseType$google_latestDependenciesRelease(String str, j81<? super ProductType, sd5> j81Var) {
        sd5 sd5Var;
        com.android.billingclient.api.QnHx qnHx = this.billingClient;
        if (qnHx != null) {
            qnHx.h("subs", new NUlFixed(j81Var, qnHx, str));
            sd5Var = sd5.a;
        } else {
            sd5Var = null;
        }
        if (sd5Var == null) {
            j81Var.invoke(ProductType.UNKNOWN);
        }
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public boolean isConnected() {
        com.android.billingclient.api.QnHx qnHx = this.billingClient;
        if (qnHx != null) {
            return qnHx.e();
        }
        return false;
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void makePurchaseAsync(Activity activity, String str, StoreProduct storeProduct, ReplaceSkuInfo replaceSkuInfo, String str2) {
        if (replaceSkuInfo != null) {
            Md5A.h(new Object[]{replaceSkuInfo.getOldPurchase().getSkus().get(0), storeProduct.getSku()}, 2, PurchaseStrings.UPGRADING_SKU, LogIntent.PURCHASE);
        } else {
            Md5A.h(new Object[]{storeProduct.getSku()}, 1, PurchaseStrings.PURCHASING_PRODUCT, LogIntent.PURCHASE);
        }
        synchronized (this) {
            this.productTypes.put(storeProduct.getSku(), storeProduct.getType());
            this.presentedOfferingsByProductIdentifier.put(storeProduct.getSku(), str2);
            sd5 sd5Var = sd5.a;
        }
        executeRequestOnUIThread(new C14332(storeProduct, this, activity, replaceSkuInfo, str));
    }

    @Override // defpackage.fa
    public void onBillingServiceDisconnected() {
        this.mainHandler.post(new ty(this, 9));
        retryBillingServiceConnectionWithExponentialBackoff();
    }

    @Override // defpackage.fa
    public void onBillingSetupFinished(final com.android.billingclient.api.NUlFixed nUl) {
        this.mainHandler.post(new Runnable() { // from class: ua
            @Override // java.lang.Runnable
            public final void run() {
                BillingWrapper.m16onBillingSetupFinished$lambda25(nUl, this);
            }
        });
    }

    @Override // defpackage.bh3
    public void onPurchasesUpdated(com.android.billingclient.api.NUlFixed nUl, List<? extends Purchase> list) {
        cs0 cs0Var = cs0.w;
        List<? extends Purchase> list2 = list == null ? cs0Var : list;
        if (nUl.a == 0 && (!list2.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                getStoreTransaction((Purchase) it.next(), new BillingWrapper$onPurchasesUpdated$1$1(arrayList, list2, this));
            }
            return;
        }
        if (nUl.a == 0) {
            BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = getPurchasesUpdatedListener();
            if (purchasesUpdatedListener != null) {
                purchasesUpdatedListener.onPurchasesUpdated(cs0Var);
                return;
            }
            return;
        }
        LogIntent logIntent = LogIntent.GOOGLE_ERROR;
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(BillingStrings.BILLING_WRAPPER_PURCHASES_ERROR, Arrays.copyOf(new Object[]{BillingResultExtensionsKt.toHumanReadableDescription(nUl)}, 1)));
        if (list2.isEmpty()) {
            list2 = null;
        }
        sb.append(list2 != null ? "Purchases:".concat(wu.M0(list2, ", ", null, null, BillingWrapper$onPurchasesUpdated$3$1.INSTANCE, 30)) : null);
        LogWrapperKt.log(logIntent, sb.toString());
        PurchasesError purchasesErrorBillingResponseToPurchasesError = ErrorsKt.billingResponseToPurchasesError((list == null && nUl.a == 0) ? 6 : nUl.a, "Error updating purchases. " + BillingResultExtensionsKt.toHumanReadableDescription(nUl));
        LogUtilsKt.errorLog(purchasesErrorBillingResponseToPurchasesError);
        BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener2 = getPurchasesUpdatedListener();
        if (purchasesUpdatedListener2 != null) {
            purchasesUpdatedListener2.onPurchasesFailedToUpdate(purchasesErrorBillingResponseToPurchasesError);
        }
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void queryAllPurchases(String str, j81<? super List<StoreTransaction>, sd5> j81Var, j81<? super PurchasesError, sd5> j81Var2) {
        queryPurchaseHistoryAsync("subs", new C14341(j81Var2, j81Var), j81Var2);
    }

    public final void queryPurchaseHistoryAsync(String str, j81<? super List<? extends PurchaseHistoryRecord>, sd5> j81Var, j81<? super PurchasesError, sd5> j81Var2) {
        LogWrapperKt.log(LogIntent.DEBUG, String.format(RestoreStrings.QUERYING_PURCHASE_HISTORY, Arrays.copyOf(new Object[]{str}, 1)));
        executeRequestOnUIThread(new C14351(j81Var2, str, j81Var));
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void queryPurchases(String str, j81<? super Map<String, StoreTransaction>, sd5> j81Var, j81<? super PurchasesError, sd5> j81Var2) {
        withConnectedClient(new C14361(j81Var2, this, j81Var));
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void querySkuDetailsAsync(ProductType productType, Set<String> set, j81<? super List<StoreProduct>, sd5> j81Var, j81<? super PurchasesError, sd5> j81Var2) {
        Set<String> set2 = set;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = set2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((String) next).length() > 0) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            LogWrapperKt.log(LogIntent.DEBUG, OfferingStrings.EMPTY_SKU_LIST);
            j81Var.invoke(cs0.w);
        } else {
            LogWrapperKt.log(LogIntent.DEBUG, String.format(OfferingStrings.FETCHING_PRODUCTS, Arrays.copyOf(new Object[]{wu.M0(set2, null, null, null, null, 63)}, 1)));
            executeRequestOnUIThread(new C14371(productType, arrayList, this, j81Var2, set, j81Var));
        }
    }

    public final synchronized void setBillingClient(com.android.billingclient.api.QnHx qnHx) {
        this.billingClient = qnHx;
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void startConnection() {
        synchronized (this) {
            if (this.billingClient == null) {
                this.billingClient = this.clientFactory.buildClient(this);
            }
            com.android.billingclient.api.QnHx qnHx = this.billingClient;
            if (qnHx != null) {
                if (!qnHx.e()) {
                    LogWrapperKt.log(LogIntent.DEBUG, String.format(BillingStrings.BILLING_CLIENT_STARTING, Arrays.copyOf(new Object[]{qnHx}, 1)));
                    qnHx.j(this);
                }
                sd5 sd5Var = sd5.a;
            }
        }
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void startConnectionOnMainThread(long j) {
        this.mainHandler.postDelayed(new u85(this, 8), j);
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$consumeAndSave$1, reason: invalid class name */
    public static final class AnonymousClass1 extends cx1 implements x81<com.android.billingclient.api.NUlFixed, String, sd5> {
        public AnonymousClass1() {
            super(2);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(com.android.billingclient.api.NUlFixed nUl, String str) {
            if (nUl.a == 0) {
                BillingWrapper.this.deviceCache.addSuccessfullyPostedToken(str);
            } else {
                Md5A.h(new Object[]{BillingResultExtensionsKt.toHumanReadableDescription(nUl)}, 1, PurchaseStrings.CONSUMING_PURCHASE_ERROR, LogIntent.GOOGLE_ERROR);
            }
        }

        @Override // defpackage.x81
        public /* bridge */ /* synthetic */ sd5 invoke(com.android.billingclient.api.NUlFixed nUl, String str) {
            invoke2(nUl, str);
            return sd5.a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$consumeAndSave$2, reason: invalid class name */
    public static final class AnonymousClass2 extends cx1 implements x81<com.android.billingclient.api.NUlFixed, String, sd5> {
        public AnonymousClass2() {
            super(2);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(com.android.billingclient.api.NUlFixed nUl, String str) {
            if (nUl.a == 0) {
                BillingWrapper.this.deviceCache.addSuccessfullyPostedToken(str);
            } else {
                Md5A.h(new Object[]{BillingResultExtensionsKt.toHumanReadableDescription(nUl)}, 1, PurchaseStrings.ACKNOWLEDGING_PURCHASE_ERROR, LogIntent.GOOGLE_ERROR);
            }
        }

        @Override // defpackage.x81
        public /* bridge */ /* synthetic */ sd5 invoke(com.android.billingclient.api.NUlFixed nUl, String str) {
            invoke2(nUl, str);
            return sd5.a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$makePurchaseAsync$2, reason: invalid class name and case insensitive filesystem */
    public static final class C14332 extends cx1 implements j81<PurchasesError, sd5> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ String $appUserID;
        final /* synthetic */ ReplaceSkuInfo $replaceSkuInfo;
        final /* synthetic */ StoreProduct $storeProduct;
        final /* synthetic */ BillingWrapper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14332(StoreProduct storeProduct, BillingWrapper billingWrapper, Activity activity, ReplaceSkuInfo replaceSkuInfo, String str) {
            super(1);
            this.$storeProduct = storeProduct;
            this.this$0 = billingWrapper;
            this.$activity = activity;
            this.$replaceSkuInfo = replaceSkuInfo;
            this.$appUserID = str;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            com.android.billingclient.api.F1.QnHx qnHx = new com.android.billingclient.api.F1.QnHx();
            SkuDetails skuDetails = StoreProductHelpers.getSkuDetails(this.$storeProduct);
            ArrayList arrayList = new ArrayList();
            arrayList.add(skuDetails);
            qnHx.d = arrayList;
            ReplaceSkuInfo replaceSkuInfo = this.$replaceSkuInfo;
            String str = this.$appUserID;
            if (replaceSkuInfo != null) {
                BillingFlowParamsExtensionsKt.setUpgradeInfo(qnHx, replaceSkuInfo);
                sd5 sd5Var = sd5.a;
            } else {
                qnHx.a = UtilsKt.sha256(str);
            }
            ArrayList arrayList2 = qnHx.d;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                throw new IllegalArgumentException("Details of the products must be provided.");
            }
            if (qnHx.d.contains(null)) {
                throw new IllegalArgumentException("SKU cannot be null.");
            }
            if (qnHx.d.size() > 1) {
                SkuDetails skuDetails2 = (SkuDetails) qnHx.d.get(0);
                String strA = skuDetails2.a();
                ArrayList arrayList3 = qnHx.d;
                int size = arrayList3.size();
                for (int i = 0; i < size; i++) {
                    SkuDetails skuDetails3 = (SkuDetails) arrayList3.get(i);
                    if (!strA.equals("play_pass_subs") && !skuDetails3.a().equals("play_pass_subs") && !strA.equals(skuDetails3.a())) {
                        throw new IllegalArgumentException("SKUs should have the same type.");
                    }
                }
                String strOptString = skuDetails2.b.optString("packageName");
                ArrayList arrayList4 = qnHx.d;
                int size2 = arrayList4.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    SkuDetails skuDetails4 = (SkuDetails) arrayList4.get(i2);
                    if (!strA.equals("play_pass_subs") && !skuDetails4.a().equals("play_pass_subs") && !strOptString.equals(skuDetails4.b.optString("packageName"))) {
                        throw new IllegalArgumentException("All SKUs must have the same package name.");
                    }
                }
            }
            com.android.billingclient.api.F1 f1 = new com.android.billingclient.api.F1();
            f1.a = !((SkuDetails) qnHx.d.get(0)).b.optString("packageName").isEmpty();
            f1.b = qnHx.a;
            f1.d = null;
            f1.c = qnHx.b;
            f1.e = qnHx.c;
            ArrayList arrayList5 = qnHx.d;
            f1.g = arrayList5 != null ? new ArrayList(arrayList5) : new ArrayList();
            f1.h = false;
            ra7 ra7Var = qb7.x;
            f1.f = es5.A;
            this.this$0.launchBillingFlow(this.$activity, f1);
        }

        @Override // defpackage.j81
        public /* bridge */ /* synthetic */ sd5 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return sd5.a;
        }
    }
}
