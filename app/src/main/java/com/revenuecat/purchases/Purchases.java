package com.revenuecat.purchases;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.lifecycle.EQ;
import com.android.billingclient.api.CQf;
import com.android.billingclient.api.NUlFixed;
import com.android.billingclient.api.SkuDetails;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.CustomerInfoFactoriesKt;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.PlatformInfo;
import com.revenuecat.purchases.common.ReceiptInfo;
import com.revenuecat.purchases.common.ReplaceSkuInfo;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey;
import com.revenuecat.purchases.google.ProductTypeConversionsKt;
import com.revenuecat.purchases.google.StoreProductConversionsKt;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.interfaces.Callback;
import com.revenuecat.purchases.interfaces.GetSkusResponseListener;
import com.revenuecat.purchases.interfaces.GetStoreProductsCallback;
import com.revenuecat.purchases.interfaces.GetStoreProductsCallbackKt;
import com.revenuecat.purchases.interfaces.LogInCallback;
import com.revenuecat.purchases.interfaces.MakePurchaseListener;
import com.revenuecat.purchases.interfaces.ProductChangeCallback;
import com.revenuecat.purchases.interfaces.ProductChangeCallbackKt;
import com.revenuecat.purchases.interfaces.ProductChangeListener;
import com.revenuecat.purchases.interfaces.PurchaseCallback;
import com.revenuecat.purchases.interfaces.PurchaseCallbackKt;
import com.revenuecat.purchases.interfaces.PurchaseErrorCallback;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallbackKt;
import com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback;
import com.revenuecat.purchases.interfaces.ReceiveOfferingsCallbackKt;
import com.revenuecat.purchases.interfaces.ReceiveOfferingsListener;
import com.revenuecat.purchases.interfaces.ReceivePurchaserInfoListener;
import com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener;
import com.revenuecat.purchases.interfaces.UpdatedPurchaserInfoListener;
import com.revenuecat.purchases.models.PurchaseState;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.AttributionStrings;
import com.revenuecat.purchases.strings.BillingStrings;
import com.revenuecat.purchases.strings.ConfigureStrings;
import com.revenuecat.purchases.strings.CustomerInfoStrings;
import com.revenuecat.purchases.strings.OfferingStrings;
import com.revenuecat.purchases.strings.PurchaseStrings;
import com.revenuecat.purchases.strings.RestoreStrings;
import com.revenuecat.purchases.subscriberattributes.BackendHelpersKt;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttribute;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager;
import defpackage.Md5A;
import defpackage.OBMt;
import defpackage.Th;
import defpackage.b70;
import defpackage.br3;
import defpackage.cs0;
import defpackage.cx1;
import defpackage.ddf;
import defpackage.eLUR;
import defpackage.h81;
import defpackage.iv4;
import defpackage.j81;
import defpackage.jl3;
import defpackage.kg0;
import defpackage.mu;
import defpackage.oz1;
import defpackage.ry4;
import defpackage.sd5;
import defpackage.su;
import defpackage.t92;
import defpackage.ur1;
import defpackage.uy2;
import defpackage.wu;
import defpackage.x81;
import defpackage.y81;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.UninitializedPropertyAccessException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class Purchases implements LifecycleDelegate {
    private static /* synthetic */ Purchases backingFieldSharedInstance;
    private static URL proxyURL;
    private UpdatedPurchaserInfoListener _updatedPurchaserInfoListener;
    private AppConfig appConfig;
    private final Application application;
    private final Backend backend;
    private final BillingAbstract billing;
    private final CustomerInfoHelper customerInfoHelper;
    private final DeviceCache deviceCache;
    private final Dispatcher dispatcher;
    private final IdentityManager identityManager;
    private final oz1 lifecycleHandler$delegate;
    private final Handler mainHandler;
    private volatile /* synthetic */ PurchasesState state;
    private final SubscriberAttributesManager subscriberAttributesManager;
    public static final Companion Companion = new Companion(null);
    private static PlatformInfo platformInfo = new PlatformInfo("native", null);
    private static final String frameworkVersion = Config.frameworkVersion;

    /* JADX INFO: renamed from: com.revenuecat.purchases.Purchases$dispatch$1, reason: invalid class name and case insensitive filesystem */
    public static final class C14131 extends cx1 implements h81<sd5> {
        final /* synthetic */ PurchasesError $error;
        final /* synthetic */ PurchaseErrorCallback $this_dispatch;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14131(PurchaseErrorCallback purchaseErrorCallback, PurchasesError purchasesError) {
            super(0);
            this.$this_dispatch = purchaseErrorCallback;
            this.$error = purchasesError;
        }

        @Override // defpackage.h81
        public /* bridge */ /* synthetic */ sd5 invoke() {
            invoke2();
            return sd5.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            PurchaseErrorCallback purchaseErrorCallback = this.$this_dispatch;
            PurchasesError purchasesError = this.$error;
            purchaseErrorCallback.onError(purchasesError, purchasesError.getCode() == PurchasesErrorCode.PurchaseCancelledError);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.Purchases$fetchAndCacheOfferings$1, reason: invalid class name and case insensitive filesystem */
    public static final class C14141 extends cx1 implements j81<JSONObject, sd5> {
        final /* synthetic */ ReceiveOfferingsCallback $completion;

        /* JADX INFO: renamed from: com.revenuecat.purchases.Purchases$fetchAndCacheOfferings$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C01051 extends cx1 implements j81<HashMap<String, StoreProduct>, sd5> {
            final /* synthetic */ ReceiveOfferingsCallback $completion;
            final /* synthetic */ JSONObject $offeringsJSON;
            final /* synthetic */ Purchases this$0;

            /* JADX INFO: renamed from: com.revenuecat.purchases.Purchases$fetchAndCacheOfferings$1$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends cx1 implements h81<sd5> {
                final /* synthetic */ ReceiveOfferingsCallback $completion;
                final /* synthetic */ Offerings $offerings;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(ReceiveOfferingsCallback receiveOfferingsCallback, Offerings offerings) {
                    super(0);
                    this.$completion = receiveOfferingsCallback;
                    this.$offerings = offerings;
                }

                @Override // defpackage.h81
                public /* bridge */ /* synthetic */ sd5 invoke() {
                    invoke2();
                    return sd5.a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ReceiveOfferingsCallback receiveOfferingsCallback = this.$completion;
                    if (receiveOfferingsCallback != null) {
                        receiveOfferingsCallback.onReceived(this.$offerings);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01051(JSONObject jSONObject, Purchases purchases, ReceiveOfferingsCallback receiveOfferingsCallback) {
                super(1);
                this.$offeringsJSON = jSONObject;
                this.this$0 = purchases;
                this.$completion = receiveOfferingsCallback;
            }

            @Override // defpackage.j81
            public /* bridge */ /* synthetic */ sd5 invoke(HashMap<String, StoreProduct> map) {
                invoke2(map);
                return sd5.a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(HashMap<String, StoreProduct> map) {
                Offerings offeringsCreateOfferings = CustomerInfoFactoriesKt.createOfferings(this.$offeringsJSON, map);
                this.this$0.logMissingProducts(offeringsCreateOfferings, map);
                if (offeringsCreateOfferings.getAll().isEmpty()) {
                    this.this$0.handleErrorFetchingOfferings(new PurchasesError(PurchasesErrorCode.ConfigurationError, OfferingStrings.CONFIGURATION_ERROR_PRODUCTS_NOT_FOUND), this.$completion);
                    return;
                }
                Purchases purchases = this.this$0;
                synchronized (purchases) {
                    purchases.deviceCache.cacheOfferings(offeringsCreateOfferings);
                    sd5 sd5Var = sd5.a;
                }
                this.this$0.dispatch(new AnonymousClass2(this.$completion, offeringsCreateOfferings));
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.Purchases$fetchAndCacheOfferings$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends cx1 implements j81<PurchasesError, sd5> {
            final /* synthetic */ ReceiveOfferingsCallback $completion;
            final /* synthetic */ Purchases this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(Purchases purchases, ReceiveOfferingsCallback receiveOfferingsCallback) {
                super(1);
                this.this$0 = purchases;
                this.$completion = receiveOfferingsCallback;
            }

            @Override // defpackage.j81
            public /* bridge */ /* synthetic */ sd5 invoke(PurchasesError purchasesError) {
                invoke2(purchasesError);
                return sd5.a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(PurchasesError purchasesError) {
                this.this$0.handleErrorFetchingOfferings(purchasesError, this.$completion);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14141(ReceiveOfferingsCallback receiveOfferingsCallback) {
            super(1);
            this.$completion = receiveOfferingsCallback;
        }

        @Override // defpackage.j81
        public /* bridge */ /* synthetic */ sd5 invoke(JSONObject jSONObject) {
            invoke2(jSONObject);
            return sd5.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(JSONObject jSONObject) {
            try {
                Set setExtractSkus = Purchases.this.extractSkus(jSONObject);
                if (setExtractSkus.isEmpty()) {
                    Purchases.this.handleErrorFetchingOfferings(new PurchasesError(PurchasesErrorCode.ConfigurationError, OfferingStrings.CONFIGURATION_ERROR_NO_PRODUCTS_FOR_OFFERINGS), this.$completion);
                } else {
                    Purchases purchases = Purchases.this;
                    purchases.getSkuDetails(setExtractSkus, new C01051(jSONObject, purchases, this.$completion), new AnonymousClass2(Purchases.this, this.$completion));
                }
            } catch (JSONException e) {
                Md5A.h(new Object[]{e.getLocalizedMessage()}, 1, OfferingStrings.JSON_EXCEPTION_ERROR, LogIntent.RC_ERROR);
                Purchases.this.handleErrorFetchingOfferings(new PurchasesError(PurchasesErrorCode.UnexpectedBackendResponseError, e.getLocalizedMessage()), this.$completion);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.Purchases$fetchAndCacheOfferings$2, reason: invalid class name and case insensitive filesystem */
    public static final class C14152 extends cx1 implements j81<PurchasesError, sd5> {
        final /* synthetic */ ReceiveOfferingsCallback $completion;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14152(ReceiveOfferingsCallback receiveOfferingsCallback) {
            super(1);
            this.$completion = receiveOfferingsCallback;
        }

        @Override // defpackage.j81
        public /* bridge */ /* synthetic */ sd5 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return sd5.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            Purchases.this.handleErrorFetchingOfferings(purchasesError, this.$completion);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.Purchases$getOfferings$2, reason: invalid class name and case insensitive filesystem */
    public static final class C14162 extends cx1 implements h81<sd5> {
        final /* synthetic */ Offerings $cachedOfferings;
        final /* synthetic */ ReceiveOfferingsCallback $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14162(ReceiveOfferingsCallback receiveOfferingsCallback, Offerings offerings) {
            super(0);
            this.$listener = receiveOfferingsCallback;
            this.$cachedOfferings = offerings;
        }

        @Override // defpackage.h81
        public /* bridge */ /* synthetic */ sd5 invoke() {
            invoke2();
            return sd5.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$listener.onReceived(this.$cachedOfferings);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.Purchases$getSkuDetails$1, reason: invalid class name and case insensitive filesystem */
    public static final class C14181 extends cx1 implements j81<List<? extends StoreProduct>, sd5> {
        final /* synthetic */ j81<HashMap<String, StoreProduct>, sd5> $onCompleted;
        final /* synthetic */ j81<PurchasesError, sd5> $onError;
        final /* synthetic */ Set<String> $skus;
        final /* synthetic */ Purchases this$0;

        /* JADX INFO: renamed from: com.revenuecat.purchases.Purchases$getSkuDetails$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C01061 extends cx1 implements j81<List<? extends StoreProduct>, sd5> {
            final /* synthetic */ HashMap<String, StoreProduct> $detailsByID;
            final /* synthetic */ j81<HashMap<String, StoreProduct>, sd5> $onCompleted;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C01061(HashMap<String, StoreProduct> map, j81<? super HashMap<String, StoreProduct>, sd5> j81Var) {
                super(1);
                this.$detailsByID = map;
                this.$onCompleted = j81Var;
            }

            @Override // defpackage.j81
            public /* bridge */ /* synthetic */ sd5 invoke(List<? extends StoreProduct> list) {
                invoke2((List<StoreProduct>) list);
                return sd5.a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<StoreProduct> list) {
                HashMap<String, StoreProduct> map = this.$detailsByID;
                List<StoreProduct> list2 = list;
                ArrayList arrayList = new ArrayList(mu.w0(list2, 10));
                for (StoreProduct storeProduct : list2) {
                    arrayList.add(new uy2(storeProduct.getSku(), storeProduct));
                }
                t92.U(arrayList, map);
                this.$onCompleted.invoke(this.$detailsByID);
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.Purchases$getSkuDetails$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends cx1 implements j81<PurchasesError, sd5> {
            final /* synthetic */ j81<PurchasesError, sd5> $onError;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(j81<? super PurchasesError, sd5> j81Var) {
                super(1);
                this.$onError = j81Var;
            }

            @Override // defpackage.j81
            public /* bridge */ /* synthetic */ sd5 invoke(PurchasesError purchasesError) {
                invoke2(purchasesError);
                return sd5.a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(PurchasesError purchasesError) {
                this.$onError.invoke(purchasesError);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14181(Set<String> set, Purchases purchases, j81<? super HashMap<String, StoreProduct>, sd5> j81Var, j81<? super PurchasesError, sd5> j81Var2) {
            super(1);
            this.$skus = set;
            this.this$0 = purchases;
            this.$onCompleted = j81Var;
            this.$onError = j81Var2;
        }

        @Override // defpackage.j81
        public /* bridge */ /* synthetic */ sd5 invoke(List<? extends StoreProduct> list) {
            invoke2((List<StoreProduct>) list);
            return sd5.a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<StoreProduct> list) {
            Set<String> setH1;
            HashMap<String, StoreProduct> map = new HashMap<>();
            Set<String> set = this.$skus;
            List<StoreProduct> list2 = list;
            ArrayList arrayList = new ArrayList(mu.w0(list2, 10));
            for (StoreProduct storeProduct : list2) {
                arrayList.add(new uy2(storeProduct.getSku(), storeProduct));
            }
            t92.U(arrayList, map);
            ArrayList arrayList2 = new ArrayList(mu.w0(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((String) ((uy2) it.next()).w);
            }
            Set<String> set2 = set;
            Collection<?> collectionG = ddf.g(arrayList2, set2);
            if (collectionG.isEmpty()) {
                setH1 = wu.h1(set2);
            } else if (collectionG instanceof Set) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (Object obj : set2) {
                    if (!collectionG.contains(obj)) {
                        linkedHashSet.add(obj);
                    }
                }
                setH1 = linkedHashSet;
            } else {
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(set);
                linkedHashSet2.removeAll(collectionG);
                setH1 = linkedHashSet2;
            }
            if (!setH1.isEmpty()) {
                this.this$0.billing.querySkuDetailsAsync(ProductType.INAPP, setH1, new C01061(map, this.$onCompleted), new AnonymousClass2(this.$onError));
            } else {
                this.$onCompleted.invoke(map);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.Purchases$getSkuDetails$2, reason: invalid class name and case insensitive filesystem */
    public static final class C14192 extends cx1 implements j81<PurchasesError, sd5> {
        final /* synthetic */ j81<PurchasesError, sd5> $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14192(j81<? super PurchasesError, sd5> j81Var) {
            super(1);
            this.$onError = j81Var;
        }

        @Override // defpackage.j81
        public /* bridge */ /* synthetic */ sd5 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return sd5.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            this.$onError.invoke(purchasesError);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.Purchases$getSkus$1, reason: invalid class name and case insensitive filesystem */
    public static final class C14201 extends cx1 implements j81<List<? extends StoreProduct>, sd5> {
        final /* synthetic */ GetStoreProductsCallback $callback;

        /* JADX INFO: renamed from: com.revenuecat.purchases.Purchases$getSkus$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C01071 extends cx1 implements h81<sd5> {
            final /* synthetic */ GetStoreProductsCallback $callback;
            final /* synthetic */ List<StoreProduct> $storeProducts;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01071(GetStoreProductsCallback getStoreProductsCallback, List<StoreProduct> list) {
                super(0);
                this.$callback = getStoreProductsCallback;
                this.$storeProducts = list;
            }

            @Override // defpackage.h81
            public /* bridge */ /* synthetic */ sd5 invoke() {
                invoke2();
                return sd5.a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.$callback.onReceived(this.$storeProducts);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14201(GetStoreProductsCallback getStoreProductsCallback) {
            super(1);
            this.$callback = getStoreProductsCallback;
        }

        @Override // defpackage.j81
        public /* bridge */ /* synthetic */ sd5 invoke(List<? extends StoreProduct> list) {
            invoke2((List<StoreProduct>) list);
            return sd5.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<StoreProduct> list) {
            Purchases.this.dispatch(new C01071(this.$callback, list));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.Purchases$getSkus$2, reason: invalid class name and case insensitive filesystem */
    public static final class C14212 extends cx1 implements j81<PurchasesError, sd5> {
        final /* synthetic */ GetStoreProductsCallback $callback;

        /* JADX INFO: renamed from: com.revenuecat.purchases.Purchases$getSkus$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends cx1 implements h81<sd5> {
            final /* synthetic */ GetStoreProductsCallback $callback;
            final /* synthetic */ PurchasesError $it;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(GetStoreProductsCallback getStoreProductsCallback, PurchasesError purchasesError) {
                super(0);
                this.$callback = getStoreProductsCallback;
                this.$it = purchasesError;
            }

            @Override // defpackage.h81
            public /* bridge */ /* synthetic */ sd5 invoke() {
                invoke2();
                return sd5.a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.$callback.onError(this.$it);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14212(GetStoreProductsCallback getStoreProductsCallback) {
            super(1);
            this.$callback = getStoreProductsCallback;
        }

        @Override // defpackage.j81
        public /* bridge */ /* synthetic */ sd5 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return sd5.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            Purchases.this.dispatch(new AnonymousClass1(this.$callback, purchasesError));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.Purchases$handleErrorFetchingOfferings$1, reason: invalid class name and case insensitive filesystem */
    public static final class C14221 extends cx1 implements h81<sd5> {
        final /* synthetic */ ReceiveOfferingsCallback $completion;
        final /* synthetic */ PurchasesError $error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14221(ReceiveOfferingsCallback receiveOfferingsCallback, PurchasesError purchasesError) {
            super(0);
            this.$completion = receiveOfferingsCallback;
            this.$error = purchasesError;
        }

        @Override // defpackage.h81
        public /* bridge */ /* synthetic */ sd5 invoke() {
            invoke2();
            return sd5.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ReceiveOfferingsCallback receiveOfferingsCallback = this.$completion;
            if (receiveOfferingsCallback != null) {
                receiveOfferingsCallback.onError(this.$error);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.Purchases$logIn$3, reason: invalid class name */
    public static final class AnonymousClass3 extends cx1 implements j81<CustomerInfo, sd5> {
        final /* synthetic */ LogInCallback $callback;

        /* JADX INFO: renamed from: com.revenuecat.purchases.Purchases$logIn$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends cx1 implements h81<sd5> {
            final /* synthetic */ LogInCallback $callback;
            final /* synthetic */ CustomerInfo $customerInfo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LogInCallback logInCallback, CustomerInfo customerInfo) {
                super(0);
                this.$callback = logInCallback;
                this.$customerInfo = customerInfo;
            }

            @Override // defpackage.h81
            public /* bridge */ /* synthetic */ sd5 invoke() {
                invoke2();
                return sd5.a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                LogInCallback logInCallback = this.$callback;
                if (logInCallback != null) {
                    logInCallback.onReceived(this.$customerInfo, false);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(LogInCallback logInCallback) {
            super(1);
            this.$callback = logInCallback;
        }

        @Override // defpackage.j81
        public /* bridge */ /* synthetic */ sd5 invoke(CustomerInfo customerInfo) {
            invoke2(customerInfo);
            return sd5.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CustomerInfo customerInfo) {
            Purchases.this.dispatch(new AnonymousClass1(this.$callback, customerInfo));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.Purchases$logIn$4, reason: invalid class name */
    public static final class AnonymousClass4 extends cx1 implements j81<PurchasesError, sd5> {
        final /* synthetic */ LogInCallback $callback;

        /* JADX INFO: renamed from: com.revenuecat.purchases.Purchases$logIn$4$1, reason: invalid class name */
        public static final class AnonymousClass1 extends cx1 implements h81<sd5> {
            final /* synthetic */ LogInCallback $callback;
            final /* synthetic */ PurchasesError $error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LogInCallback logInCallback, PurchasesError purchasesError) {
                super(0);
                this.$callback = logInCallback;
                this.$error = purchasesError;
            }

            @Override // defpackage.h81
            public /* bridge */ /* synthetic */ sd5 invoke() {
                invoke2();
                return sd5.a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                LogInCallback logInCallback = this.$callback;
                if (logInCallback != null) {
                    logInCallback.onError(this.$error);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(LogInCallback logInCallback) {
            super(1);
            this.$callback = logInCallback;
        }

        @Override // defpackage.j81
        public /* bridge */ /* synthetic */ sd5 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return sd5.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            Purchases.this.dispatch(new AnonymousClass1(this.$callback, purchasesError));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.Purchases$logOut$1, reason: invalid class name and case insensitive filesystem */
    public static final class C14231 extends cx1 implements j81<PurchasesError, sd5> {
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;
        final /* synthetic */ Purchases this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14231(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, Purchases purchases) {
            super(1);
            this.$callback = receiveCustomerInfoCallback;
            this.this$0 = purchases;
        }

        @Override // defpackage.j81
        public /* bridge */ /* synthetic */ sd5 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return sd5.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            if (purchasesError != null) {
                ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callback;
                if (receiveCustomerInfoCallback != null) {
                    receiveCustomerInfoCallback.onError(purchasesError);
                    return;
                }
                return;
            }
            this.this$0.backend.clearCaches();
            Purchases purchases = this.this$0;
            synchronized (purchases) {
                purchases.setState$purchases_latestDependenciesRelease(PurchasesState.copy$default(purchases.getState$purchases_latestDependenciesRelease(), null, Collections.emptyMap(), null, false, false, 29, null));
                sd5 sd5Var = sd5.a;
            }
            Purchases purchases2 = this.this$0;
            purchases2.updateAllCaches(purchases2.identityManager.getCurrentAppUserID(), this.$callback);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.Purchases$replaceOldPurchaseWithNewProduct$1, reason: invalid class name and case insensitive filesystem */
    public static final class C14241 extends cx1 implements j81<StoreTransaction, sd5> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ String $appUserID;
        final /* synthetic */ String $presentedOfferingIdentifier;
        final /* synthetic */ StoreProduct $storeProduct;
        final /* synthetic */ UpgradeInfo $upgradeInfo;
        final /* synthetic */ Purchases this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14241(UpgradeInfo upgradeInfo, Purchases purchases, Activity activity, String str, StoreProduct storeProduct, String str2) {
            super(1);
            this.$upgradeInfo = upgradeInfo;
            this.this$0 = purchases;
            this.$activity = activity;
            this.$appUserID = str;
            this.$storeProduct = storeProduct;
            this.$presentedOfferingIdentifier = str2;
        }

        @Override // defpackage.j81
        public /* bridge */ /* synthetic */ sd5 invoke(StoreTransaction storeTransaction) {
            invoke2(storeTransaction);
            return sd5.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(StoreTransaction storeTransaction) {
            Md5A.h(new Object[]{this.$upgradeInfo.getOldSku()}, 1, PurchaseStrings.FOUND_EXISTING_PURCHASE, LogIntent.PURCHASE);
            this.this$0.billing.makePurchaseAsync(this.$activity, this.$appUserID, this.$storeProduct, new ReplaceSkuInfo(storeTransaction, this.$upgradeInfo.getProrationMode()), this.$presentedOfferingIdentifier);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.Purchases$replaceOldPurchaseWithNewProduct$2, reason: invalid class name and case insensitive filesystem */
    public static final class C14252 extends cx1 implements j81<PurchasesError, sd5> {
        final /* synthetic */ PurchaseErrorCallback $listener;

        /* JADX INFO: renamed from: com.revenuecat.purchases.Purchases$replaceOldPurchaseWithNewProduct$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends cx1 implements h81<sd5> {
            final /* synthetic */ PurchasesError $error;
            final /* synthetic */ PurchaseErrorCallback $listener;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PurchaseErrorCallback purchaseErrorCallback, PurchasesError purchasesError) {
                super(0);
                this.$listener = purchaseErrorCallback;
                this.$error = purchasesError;
            }

            @Override // defpackage.h81
            public /* bridge */ /* synthetic */ sd5 invoke() {
                invoke2();
                return sd5.a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.$listener.onError(this.$error, false);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14252(PurchaseErrorCallback purchaseErrorCallback) {
            super(1);
            this.$listener = purchaseErrorCallback;
        }

        @Override // defpackage.j81
        public /* bridge */ /* synthetic */ sd5 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return sd5.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            LogWrapperKt.log(LogIntent.GOOGLE_ERROR, purchasesError.getMessage());
            Purchases.this.dispatch(new AnonymousClass1(this.$listener, purchasesError));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.Purchases$syncObserverModeAmazonPurchase$4, reason: invalid class name and case insensitive filesystem */
    public static final class C14274 extends cx1 implements j81<PurchasesError, sd5> {
        final /* synthetic */ String $amazonUserID;
        final /* synthetic */ String $receiptID;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14274(String str, String str2) {
            super(1);
            this.$receiptID = str;
            this.$amazonUserID = str2;
        }

        @Override // defpackage.j81
        public /* bridge */ /* synthetic */ sd5 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return sd5.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            LogWrapperKt.log(LogIntent.RC_ERROR, String.format(PurchaseStrings.SYNCING_PURCHASE_ERROR_DETAILS_USER_ID, Arrays.copyOf(new Object[]{this.$receiptID, this.$amazonUserID, purchasesError}, 3)));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.Purchases$syncPurchaseWithBackend$1, reason: invalid class name and case insensitive filesystem */
    public static final class C14281 extends cx1 implements j81<Map<String, ? extends SubscriberAttribute>, sd5> {
        final /* synthetic */ String $appUserID;
        final /* synthetic */ String $marketplace;
        final /* synthetic */ j81<PurchasesError, sd5> $onError;
        final /* synthetic */ h81<sd5> $onSuccess;
        final /* synthetic */ ReceiptInfo $productInfo;
        final /* synthetic */ String $purchaseToken;
        final /* synthetic */ String $storeUserID;

        /* JADX INFO: renamed from: com.revenuecat.purchases.Purchases$syncPurchaseWithBackend$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C01091 extends cx1 implements x81<CustomerInfo, JSONObject, sd5> {
            final /* synthetic */ String $appUserID;
            final /* synthetic */ h81<sd5> $onSuccess;
            final /* synthetic */ String $purchaseToken;
            final /* synthetic */ Map<String, SubscriberAttribute> $unsyncedSubscriberAttributesByKey;
            final /* synthetic */ Purchases this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01091(Purchases purchases, String str, Map<String, SubscriberAttribute> map, String str2, h81<sd5> h81Var) {
                super(2);
                this.this$0 = purchases;
                this.$appUserID = str;
                this.$unsyncedSubscriberAttributesByKey = map;
                this.$purchaseToken = str2;
                this.$onSuccess = h81Var;
            }

            @Override // defpackage.x81
            public /* bridge */ /* synthetic */ sd5 invoke(CustomerInfo customerInfo, JSONObject jSONObject) {
                invoke2(customerInfo, jSONObject);
                return sd5.a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CustomerInfo customerInfo, JSONObject jSONObject) {
                this.this$0.subscriberAttributesManager.markAsSynced(this.$appUserID, this.$unsyncedSubscriberAttributesByKey, BackendHelpersKt.getAttributeErrors(jSONObject));
                this.this$0.deviceCache.addSuccessfullyPostedToken(this.$purchaseToken);
                this.this$0.customerInfoHelper.cacheCustomerInfo(customerInfo);
                this.this$0.customerInfoHelper.sendUpdatedCustomerInfoToDelegateIfChanged(customerInfo);
                this.$onSuccess.invoke();
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.Purchases$syncPurchaseWithBackend$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends cx1 implements y81<PurchasesError, Boolean, JSONObject, sd5> {
            final /* synthetic */ String $appUserID;
            final /* synthetic */ j81<PurchasesError, sd5> $onError;
            final /* synthetic */ String $purchaseToken;
            final /* synthetic */ Map<String, SubscriberAttribute> $unsyncedSubscriberAttributesByKey;
            final /* synthetic */ Purchases this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(Purchases purchases, String str, Map<String, SubscriberAttribute> map, String str2, j81<? super PurchasesError, sd5> j81Var) {
                super(3);
                this.this$0 = purchases;
                this.$appUserID = str;
                this.$unsyncedSubscriberAttributesByKey = map;
                this.$purchaseToken = str2;
                this.$onError = j81Var;
            }

            @Override // defpackage.y81
            public /* bridge */ /* synthetic */ sd5 invoke(PurchasesError purchasesError, Boolean bool, JSONObject jSONObject) {
                invoke(purchasesError, bool.booleanValue(), jSONObject);
                return sd5.a;
            }

            public final void invoke(PurchasesError purchasesError, boolean z, JSONObject jSONObject) {
                if (z) {
                    this.this$0.subscriberAttributesManager.markAsSynced(this.$appUserID, this.$unsyncedSubscriberAttributesByKey, BackendHelpersKt.getAttributeErrors(jSONObject));
                    this.this$0.deviceCache.addSuccessfullyPostedToken(this.$purchaseToken);
                }
                this.$onError.invoke(purchasesError);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14281(String str, String str2, ReceiptInfo receiptInfo, String str3, String str4, h81<sd5> h81Var, j81<? super PurchasesError, sd5> j81Var) {
            super(1);
            this.$purchaseToken = str;
            this.$appUserID = str2;
            this.$productInfo = receiptInfo;
            this.$storeUserID = str3;
            this.$marketplace = str4;
            this.$onSuccess = h81Var;
            this.$onError = j81Var;
        }

        @Override // defpackage.j81
        public /* bridge */ /* synthetic */ sd5 invoke(Map<String, ? extends SubscriberAttribute> map) {
            invoke2((Map<String, SubscriberAttribute>) map);
            return sd5.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Map<String, SubscriberAttribute> map) {
            Purchases.this.backend.postReceiptData(this.$purchaseToken, this.$appUserID, Purchases.this.getAllowSharingPlayStoreAccount(), !Purchases.this.getFinishTransactions(), BackendHelpersKt.toBackendMap(map), this.$productInfo, this.$storeUserID, this.$marketplace, new C01091(Purchases.this, this.$appUserID, map, this.$purchaseToken, this.$onSuccess), new AnonymousClass2(Purchases.this, this.$appUserID, map, this.$purchaseToken, this.$onError));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.Purchases$syncPurchases$1, reason: invalid class name and case insensitive filesystem */
    public static final class C14291 extends cx1 implements j81<List<? extends StoreTransaction>, sd5> {
        final /* synthetic */ String $appUserID;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14291(String str) {
            super(1);
            this.$appUserID = str;
        }

        @Override // defpackage.j81
        public /* bridge */ /* synthetic */ sd5 invoke(List<? extends StoreTransaction> list) {
            invoke2((List<StoreTransaction>) list);
            return sd5.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<StoreTransaction> list) {
            if (!list.isEmpty()) {
                Purchases purchases = Purchases.this;
                String str = this.$appUserID;
                for (StoreTransaction storeTransaction : list) {
                    purchases.syncPurchaseWithBackend(storeTransaction.getPurchaseToken(), storeTransaction.getStoreUserID(), str, new ReceiptInfo(storeTransaction.getSkus(), null, null, null, null, 30, null), storeTransaction.getMarketplace(), new Purchases$syncPurchases$1$1$1(storeTransaction), new Purchases$syncPurchases$1$1$2(storeTransaction));
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.Purchases$syncPurchases$2, reason: invalid class name and case insensitive filesystem */
    public static final class C14302 extends cx1 implements j81<PurchasesError, sd5> {
        public static final C14302 INSTANCE = new C14302();

        public C14302() {
            super(1);
        }

        @Override // defpackage.j81
        public /* bridge */ /* synthetic */ sd5 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return sd5.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            Md5A.h(new Object[]{purchasesError}, 1, PurchaseStrings.SYNCING_PURCHASES_ERROR, LogIntent.RC_ERROR);
        }
    }

    public Purchases(Application application, String str, Backend backend, BillingAbstract billingAbstract, DeviceCache deviceCache, Dispatcher dispatcher, IdentityManager identityManager, SubscriberAttributesManager subscriberAttributesManager, AppConfig appConfig, CustomerInfoHelper customerInfoHelper, Handler handler) {
        this.application = application;
        this.backend = backend;
        this.billing = billingAbstract;
        this.deviceCache = deviceCache;
        this.dispatcher = dispatcher;
        this.identityManager = identityManager;
        this.subscriberAttributesManager = subscriberAttributesManager;
        this.appConfig = appConfig;
        this.customerInfoHelper = customerInfoHelper;
        this.mainHandler = handler;
        this.state = new PurchasesState(null, null, null, false, false, 31, null);
        this.lifecycleHandler$delegate = new ry4(new Purchases$lifecycleHandler$2(this));
        LogIntent logIntent = LogIntent.DEBUG;
        LogWrapperKt.log(logIntent, ConfigureStrings.DEBUG_ENABLED);
        Md5A.h(new Object[]{frameworkVersion}, 1, ConfigureStrings.SDK_VERSION, logIntent);
        LogWrapperKt.log(LogIntent.USER, String.format(ConfigureStrings.INITIAL_APP_USER_ID, Arrays.copyOf(new Object[]{str}, 1)));
        identityManager.configure(str);
        dispatch(new AnonymousClass1());
        billingAbstract.setStateListener(new BillingAbstract.StateListener() { // from class: com.revenuecat.purchases.Purchases.2
            @Override // com.revenuecat.purchases.common.BillingAbstract.StateListener
            public void onConnected() {
                Purchases.this.updatePendingPurchaseQueue$purchases_latestDependenciesRelease();
            }
        });
        billingAbstract.setPurchasesUpdatedListener(getPurchasesUpdatedListener());
        if (this.appConfig.getDangerousSettings().getAutoSyncPurchases()) {
            return;
        }
        LogWrapperKt.log(LogIntent.WARNING, ConfigureStrings.AUTO_SYNC_PURCHASES_DISABLED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _set_updatedPurchaserInfoListener_$lambda-33$lambda-32, reason: not valid java name */
    public static final void m4_set_updatedPurchaserInfoListener_$lambda33$lambda32(UpdatedPurchaserInfoListener updatedPurchaserInfoListener, CustomerInfo customerInfo) {
        updatedPurchaserInfoListener.onReceived(new PurchaserInfo(customerInfo));
    }

    public static final void canMakePayments(Context context, Callback<Boolean> callback) {
        Companion.canMakePayments(context, callback);
    }

    public static final void canMakePayments(Context context, List<? extends BillingFeature> list, Callback<Boolean> callback) {
        Companion.canMakePayments(context, list, callback);
    }

    public static final Purchases configure(Context context, String str) {
        return Companion.configure(context, str);
    }

    public static final Purchases configure(Context context, String str, String str2) {
        return Companion.configure(context, str, str2);
    }

    public static final Purchases configure(Context context, String str, String str2, boolean z) {
        return Companion.configure(context, str, str2, z);
    }

    public static final Purchases configure(Context context, String str, String str2, boolean z, ExecutorService executorService) {
        return Companion.configure(context, str, str2, z, executorService);
    }

    public static final Purchases configure(PurchasesConfiguration purchasesConfiguration) {
        return Companion.configure(purchasesConfiguration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatch(h81<sd5> h81Var) {
        if (ur1.a(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            h81Var.invoke();
            return;
        }
        Handler handler = this.mainHandler;
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new OBMt(h81Var, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set<String> extractSkus(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray("offerings");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONArray jSONArray2 = jSONArray.getJSONObject(i).getJSONArray("packages");
            int length2 = jSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                linkedHashSet.add(jSONArray2.getJSONObject(i2).getString("platform_product_identifier"));
            }
        }
        return linkedHashSet;
    }

    private final void fetchAndCacheOfferings(String str, boolean z, ReceiveOfferingsCallback receiveOfferingsCallback) {
        this.deviceCache.setOfferingsCacheTimestampToNow();
        this.backend.getOfferings(str, z, new C14141(receiveOfferingsCallback), new C14152(receiveOfferingsCallback));
    }

    public static /* synthetic */ void fetchAndCacheOfferings$default(Purchases purchases, String str, boolean z, ReceiveOfferingsCallback receiveOfferingsCallback, int i, Object obj) {
        if ((i & 4) != 0) {
            receiveOfferingsCallback = null;
        }
        purchases.fetchAndCacheOfferings(str, z, receiveOfferingsCallback);
    }

    public static /* synthetic */ void getAllowSharingPlayStoreAccount$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProductChangeCallback getAndClearProductChangeCallback() {
        ProductChangeCallback productChangeCallback = getState$purchases_latestDependenciesRelease().getProductChangeCallback();
        setState$purchases_latestDependenciesRelease(PurchasesState.copy$default(getState$purchases_latestDependenciesRelease(), null, null, null, false, false, 27, null));
        return productChangeCallback;
    }

    public static final boolean getDebugLogsEnabled() {
        return Companion.getDebugLogsEnabled();
    }

    public static final String getFrameworkVersion() {
        return Companion.getFrameworkVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppLifecycleHandler getLifecycleHandler() {
        return (AppLifecycleHandler) this.lifecycleHandler$delegate.getValue();
    }

    public static final synchronized LogHandler getLogHandler() {
        return Companion.getLogHandler();
    }

    public static final PlatformInfo getPlatformInfo() {
        return Companion.getPlatformInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<x81<StoreTransaction, CustomerInfo, sd5>, x81<StoreTransaction, PurchasesError, sd5>> getProductChangeCompletedCallbacks(ProductChangeCallback productChangeCallback) {
        return new Pair<>(new Purchases$getProductChangeCompletedCallbacks$onSuccess$1(productChangeCallback, this), new Purchases$getProductChangeCompletedCallbacks$onError$1(productChangeCallback, this));
    }

    public static final URL getProxyURL() {
        return Companion.getProxyURL();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PurchaseCallback getPurchaseCallback(String str) {
        PurchaseCallback purchaseCallback = getState$purchases_latestDependenciesRelease().getPurchaseCallbacks().get(str);
        PurchasesState state$purchases_latestDependenciesRelease = getState$purchases_latestDependenciesRelease();
        Map<String, PurchaseCallback> purchaseCallbacks = getState$purchases_latestDependenciesRelease().getPurchaseCallbacks();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, PurchaseCallback> entry : purchaseCallbacks.entrySet()) {
            if (!ur1.a(entry.getKey(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        setState$purchases_latestDependenciesRelease(PurchasesState.copy$default(state$purchases_latestDependenciesRelease, null, linkedHashMap, null, false, false, 29, null));
        return purchaseCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<x81<StoreTransaction, CustomerInfo, sd5>, x81<StoreTransaction, PurchasesError, sd5>> getPurchaseCompletedCallbacks() {
        return new Pair<>(new Purchases$getPurchaseCompletedCallbacks$onSuccess$1(this), new Purchases$getPurchaseCompletedCallbacks$onError$1(this));
    }

    private final BillingAbstract.PurchasesUpdatedListener getPurchasesUpdatedListener() {
        return new BillingAbstract.PurchasesUpdatedListener() { // from class: com.revenuecat.purchases.Purchases.getPurchasesUpdatedListener.1
            @Override // com.revenuecat.purchases.common.BillingAbstract.PurchasesUpdatedListener
            public void onPurchasesFailedToUpdate(PurchasesError purchasesError) {
                sd5 sd5Var;
                Purchases purchases = Purchases.this;
                synchronized (purchases) {
                    ProductChangeCallback productChangeCallback = purchases.getState$purchases_latestDependenciesRelease().getProductChangeCallback();
                    if (productChangeCallback != null) {
                        purchases.setState$purchases_latestDependenciesRelease(PurchasesState.copy$default(purchases.getState$purchases_latestDependenciesRelease(), null, null, null, false, false, 27, null));
                        purchases.dispatch(productChangeCallback, purchasesError);
                        sd5Var = sd5.a;
                    } else {
                        sd5Var = null;
                    }
                    if (sd5Var == null) {
                        Map<String, PurchaseCallback> purchaseCallbacks = purchases.getState$purchases_latestDependenciesRelease().getPurchaseCallbacks();
                        purchases.setState$purchases_latestDependenciesRelease(PurchasesState.copy$default(purchases.getState$purchases_latestDependenciesRelease(), null, Collections.emptyMap(), null, false, false, 29, null));
                        Iterator<T> it = purchaseCallbacks.values().iterator();
                        while (it.hasNext()) {
                            purchases.dispatch((PurchaseCallback) it.next(), purchasesError);
                        }
                    }
                    sd5 sd5Var2 = sd5.a;
                }
            }

            /* JADX WARN: Type inference failed for: r5v3, types: [T, com.revenuecat.purchases.interfaces.ProductChangeCallback] */
            @Override // com.revenuecat.purchases.common.BillingAbstract.PurchasesUpdatedListener
            public void onPurchasesUpdated(List<StoreTransaction> list) {
                boolean z;
                Pair purchaseCompletedCallbacks;
                jl3 jl3Var = new jl3();
                Purchases purchases = Purchases.this;
                synchronized (purchases) {
                    z = purchases.getState$purchases_latestDependenciesRelease().getProductChangeCallback() != null;
                    if (z) {
                        ?? andClearProductChangeCallback = purchases.getAndClearProductChangeCallback();
                        jl3Var.w = andClearProductChangeCallback;
                        purchaseCompletedCallbacks = purchases.getProductChangeCompletedCallbacks((ProductChangeCallback) andClearProductChangeCallback);
                    } else {
                        jl3Var.w = null;
                        purchaseCompletedCallbacks = purchases.getPurchaseCompletedCallbacks();
                    }
                    sd5 sd5Var = sd5.a;
                }
                if (!z || !list.isEmpty()) {
                    Purchases purchases2 = Purchases.this;
                    purchases2.postPurchases(list, purchases2.getAllowSharingPlayStoreAccount(), Purchases.this.getFinishTransactions(), Purchases.this.getAppUserID(), (x81) purchaseCompletedCallbacks.first, (x81) purchaseCompletedCallbacks.second);
                } else {
                    Purchases.this.invalidateCustomerInfoCache();
                    Purchases purchases3 = Purchases.this;
                    ListenerConversionsKt.getCustomerInfoWith$default(purchases3, null, new Purchases$getPurchasesUpdatedListener$1$onPurchasesUpdated$2(jl3Var, purchases3), 1, null);
                }
            }
        };
    }

    public static final Purchases getSharedInstance() {
        return Companion.getSharedInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getSkuDetails(Set<String> set, j81<? super HashMap<String, StoreProduct>, sd5> j81Var, j81<? super PurchasesError, sd5> j81Var2) {
        this.billing.querySkuDetailsAsync(ProductType.SUBS, set, new C14181(set, this, j81Var, j81Var2), new C14192(j81Var2));
    }

    private final void getSkus(Set<String> set, ProductType productType, GetStoreProductsCallback getStoreProductsCallback) {
        this.billing.querySkuDetailsAsync(productType, set, new C14201(getStoreProductsCallback), new C14212(getStoreProductsCallback));
    }

    public static /* synthetic */ void getState$purchases_latestDependenciesRelease$annotations() {
    }

    public static /* synthetic */ void getUpdatedPurchaserInfoListener$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleErrorFetchingOfferings(PurchasesError purchasesError, ReceiveOfferingsCallback receiveOfferingsCallback) {
        Md5A.h(new Object[]{purchasesError}, 1, OfferingStrings.FETCHING_OFFERINGS_ERROR, Th.u(PurchasesErrorCode.ConfigurationError, PurchasesErrorCode.UnexpectedBackendResponseError).contains(purchasesError.getCode()) ? LogIntent.RC_ERROR : LogIntent.GOOGLE_ERROR);
        this.deviceCache.clearOfferingsCacheTimestamp();
        dispatch(new C14221(receiveOfferingsCallback, purchasesError));
    }

    public static final boolean isConfigured() {
        return Companion.isConfigured();
    }

    public static /* synthetic */ void logIn$default(Purchases purchases, String str, LogInCallback logInCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            logInCallback = null;
        }
        purchases.logIn(str, logInCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final sd5 logMissingProducts(Offerings offerings, HashMap<String, StoreProduct> map) {
        Collection<Offering> collectionValues = offerings.getAll().values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            su.x0(((Offering) it.next()).getAvailablePackages(), arrayList);
        }
        ArrayList arrayList2 = new ArrayList(mu.w0(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((Package) it2.next()).getProduct().getSku());
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (!map.containsKey((String) obj)) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = arrayList3.isEmpty() ^ true ? arrayList3 : null;
        if (arrayList4 == null) {
            return null;
        }
        Md5A.h(new Object[]{wu.M0(arrayList4, ", ", null, null, null, 62)}, 1, OfferingStrings.CANNOT_FIND_PRODUCT_CONFIGURATION_ERROR, LogIntent.GOOGLE_WARNING);
        return sd5.a;
    }

    public static /* synthetic */ void logOut$default(Purchases purchases, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i, Object obj) {
        if ((i & 1) != 0) {
            receiveCustomerInfoCallback = null;
        }
        purchases.logOut(receiveCustomerInfoCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void postPurchases(List<StoreTransaction> list, boolean z, boolean z2, String str, x81<? super StoreTransaction, ? super CustomerInfo, sd5> x81Var, x81<? super StoreTransaction, ? super PurchasesError, sd5> x81Var2) {
        for (StoreTransaction storeTransaction : list) {
            if (storeTransaction.getPurchaseState() != PurchaseState.PENDING) {
                this.billing.querySkuDetailsAsync(storeTransaction.getType(), wu.h1(storeTransaction.getSkus()), new Purchases$postPurchases$1$1(this, storeTransaction, z, z2, str, x81Var, x81Var2), new Purchases$postPurchases$1$2(this, storeTransaction, z, z2, str, x81Var, x81Var2));
            } else if (x81Var2 != null) {
                PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.PaymentPendingError, null, 2, 0 == true ? 1 : 0);
                LogUtilsKt.errorLog(purchasesError);
                sd5 sd5Var = sd5.a;
                x81Var2.invoke(storeTransaction, purchasesError);
            }
        }
    }

    private final void replaceOldPurchaseWithNewProduct(StoreProduct storeProduct, UpgradeInfo upgradeInfo, Activity activity, String str, String str2, PurchaseErrorCallback purchaseErrorCallback) {
        this.billing.findPurchaseInPurchaseHistory(str, storeProduct.getType(), upgradeInfo.getOldSku(), new C14241(upgradeInfo, this, activity, str, storeProduct, str2), new C14252(purchaseErrorCallback));
    }

    public static final void setDebugLogsEnabled(boolean z) {
        Companion.setDebugLogsEnabled(z);
    }

    public static final synchronized void setLogHandler(LogHandler logHandler) {
        Companion.setLogHandler(logHandler);
    }

    public static final void setPlatformInfo(PlatformInfo platformInfo2) {
        Companion.setPlatformInfo(platformInfo2);
    }

    public static final void setProxyURL(URL url) {
        Companion.setProxyURL(url);
    }

    private final void startProductChange(Activity activity, StoreProduct storeProduct, String str, UpgradeInfo upgradeInfo, ProductChangeCallback productChangeCallback) {
        String currentAppUserID;
        sd5 sd5Var;
        LogIntent logIntent = LogIntent.PURCHASE;
        Object[] objArr = new Object[1];
        StringBuilder sb = new StringBuilder(" ");
        sb.append(storeProduct);
        sb.append(' ');
        String str2 = null;
        byte b = 0;
        sb.append(str != null ? PurchaseStrings.OFFERING.concat(str) : null);
        sb.append(" UpgradeInfo: ");
        sb.append(upgradeInfo);
        objArr[0] = sb.toString();
        Md5A.h(objArr, 1, PurchaseStrings.PRODUCT_CHANGE_STARTED, logIntent);
        synchronized (this) {
            if (!this.appConfig.getFinishTransactions()) {
                LogWrapperKt.log(LogIntent.WARNING, PurchaseStrings.PURCHASE_FINISH_TRANSACTION_FALSE);
            }
            if (getState$purchases_latestDependenciesRelease().getProductChangeCallback() == null) {
                setState$purchases_latestDependenciesRelease(PurchasesState.copy$default(getState$purchases_latestDependenciesRelease(), null, null, productChangeCallback, false, false, 27, null));
                currentAppUserID = this.identityManager.getCurrentAppUserID();
            } else {
                currentAppUserID = null;
            }
            sd5 sd5Var2 = sd5.a;
        }
        if (currentAppUserID != null) {
            replaceOldPurchaseWithNewProduct(storeProduct, upgradeInfo, activity, currentAppUserID, str, productChangeCallback);
            sd5Var = sd5.a;
        } else {
            sd5Var = null;
        }
        if (sd5Var == null) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.OperationAlreadyInProgressError, str2, 2, b == true ? 1 : 0);
            LogUtilsKt.errorLog(purchasesError);
            dispatch(productChangeCallback, purchasesError);
        }
    }

    private final void startPurchase(Activity activity, StoreProduct storeProduct, String str, PurchaseCallback purchaseCallback) {
        String currentAppUserID;
        sd5 sd5Var;
        LogIntent logIntent = LogIntent.PURCHASE;
        Object[] objArr = new Object[1];
        StringBuilder sb = new StringBuilder(" ");
        sb.append(storeProduct);
        sb.append(' ');
        String str2 = null;
        byte b = 0;
        sb.append(str != null ? PurchaseStrings.OFFERING.concat(str) : null);
        objArr[0] = sb.toString();
        Md5A.h(objArr, 1, PurchaseStrings.PURCHASE_STARTED, logIntent);
        synchronized (this) {
            if (!this.appConfig.getFinishTransactions()) {
                LogWrapperKt.log(LogIntent.WARNING, PurchaseStrings.PURCHASE_FINISH_TRANSACTION_FALSE);
            }
            if (getState$purchases_latestDependenciesRelease().getPurchaseCallbacks().containsKey(storeProduct.getSku())) {
                currentAppUserID = null;
            } else {
                setState$purchases_latestDependenciesRelease(PurchasesState.copy$default(getState$purchases_latestDependenciesRelease(), null, t92.S(getState$purchases_latestDependenciesRelease().getPurchaseCallbacks(), Collections.singletonMap(storeProduct.getSku(), purchaseCallback)), null, false, false, 29, null));
                currentAppUserID = this.identityManager.getCurrentAppUserID();
            }
            sd5 sd5Var2 = sd5.a;
        }
        if (currentAppUserID != null) {
            this.billing.makePurchaseAsync(activity, currentAppUserID, storeProduct, null, str);
            sd5Var = sd5.a;
        } else {
            sd5Var = null;
        }
        if (sd5Var == null) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.OperationAlreadyInProgressError, str2, 2, b == true ? 1 : 0);
            LogUtilsKt.errorLog(purchasesError);
            dispatch(purchaseCallback, purchasesError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncPurchaseWithBackend(String str, String str2, String str3, ReceiptInfo receiptInfo, String str4, h81<sd5> h81Var, j81<? super PurchasesError, sd5> j81Var) {
        this.subscriberAttributesManager.getUnsyncedSubscriberAttributes(str3, new C14281(str, str3, receiptInfo, str2, str4, h81Var, j81Var));
    }

    private final void synchronizeSubscriberAttributesIfNeeded() {
        SubscriberAttributesManager.synchronizeSubscriberAttributesForAllUsers$default(this.subscriberAttributesManager, getAppUserID(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAllCaches(String str, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        boolean appInBackground = getState$purchases_latestDependenciesRelease().getAppInBackground();
        this.customerInfoHelper.retrieveCustomerInfo(str, CacheFetchPolicy.FETCH_CURRENT, appInBackground, receiveCustomerInfoCallback);
        fetchAndCacheOfferings$default(this, str, appInBackground, null, 4, null);
    }

    public static /* synthetic */ void updateAllCaches$default(Purchases purchases, String str, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            receiveCustomerInfoCallback = null;
        }
        purchases.updateAllCaches(str, receiveCustomerInfoCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: updatePendingPurchaseQueue$lambda-31, reason: not valid java name */
    public static final void m6updatePendingPurchaseQueue$lambda31(Purchases purchases) {
        String appUserID = purchases.getAppUserID();
        purchases.billing.queryPurchases(appUserID, new Purchases$updatePendingPurchaseQueue$1$1$1(purchases, appUserID), Purchases$updatePendingPurchaseQueue$1$1$2.INSTANCE);
    }

    public final void close() {
        synchronized (this) {
            setState$purchases_latestDependenciesRelease(PurchasesState.copy$default(getState$purchases_latestDependenciesRelease(), null, Collections.emptyMap(), null, false, false, 29, null));
            sd5 sd5Var = sd5.a;
        }
        this.backend.close();
        this.billing.close();
        setUpdatedCustomerInfoListener(null);
        dispatch(new C14122());
    }

    public final void collectDeviceIdentifiers() {
        Md5A.h(new Object[]{"collectDeviceIdentifiers"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.collectDeviceIdentifiers(getAppUserID(), this.application);
    }

    public final synchronized boolean getAllowSharingPlayStoreAccount() {
        Boolean allowSharingPlayStoreAccount;
        allowSharingPlayStoreAccount = getState$purchases_latestDependenciesRelease().getAllowSharingPlayStoreAccount();
        return allowSharingPlayStoreAccount != null ? allowSharingPlayStoreAccount.booleanValue() : this.identityManager.currentUserIsAnonymous();
    }

    public final /* synthetic */ AppConfig getAppConfig$purchases_latestDependenciesRelease() {
        return this.appConfig;
    }

    public final synchronized String getAppUserID() {
        return this.identityManager.getCurrentAppUserID();
    }

    public final void getCustomerInfo(ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        getCustomerInfo(CacheFetchPolicy.Companion.m2default(), receiveCustomerInfoCallback);
    }

    public final synchronized boolean getFinishTransactions() {
        return this.appConfig.getFinishTransactions();
    }

    public final void getNonSubscriptionSkus(List<String> list, GetStoreProductsCallback getStoreProductsCallback) {
        getSkus(wu.h1(list), ProductType.INAPP, getStoreProductsCallback);
    }

    public final void getOfferings(ReceiveOfferingsCallback receiveOfferingsCallback) {
        String currentAppUserID;
        Offerings cachedOfferings;
        synchronized (this) {
            currentAppUserID = this.identityManager.getCurrentAppUserID();
            cachedOfferings = this.deviceCache.getCachedOfferings();
        }
        if (cachedOfferings == null) {
            LogWrapperKt.log(LogIntent.DEBUG, OfferingStrings.NO_CACHED_OFFERINGS_FETCHING_NETWORK);
            fetchAndCacheOfferings(currentAppUserID, getState$purchases_latestDependenciesRelease().getAppInBackground(), receiveOfferingsCallback);
            return;
        }
        LogIntent logIntent = LogIntent.DEBUG;
        LogWrapperKt.log(logIntent, OfferingStrings.VENDING_OFFERINGS_CACHE);
        dispatch(new C14162(receiveOfferingsCallback, cachedOfferings));
        boolean appInBackground = getState$purchases_latestDependenciesRelease().getAppInBackground();
        if (this.deviceCache.isOfferingsCacheStale(appInBackground)) {
            LogWrapperKt.log(logIntent, appInBackground ? OfferingStrings.OFFERINGS_STALE_UPDATING_IN_BACKGROUND : OfferingStrings.OFFERINGS_STALE_UPDATING_IN_FOREGROUND);
            fetchAndCacheOfferings$default(this, currentAppUserID, appInBackground, null, 4, null);
            LogWrapperKt.log(LogIntent.RC_SUCCESS, OfferingStrings.OFFERINGS_UPDATED_FROM_NETWORK);
        }
    }

    public final void getPurchaserInfo(ReceivePurchaserInfoListener receivePurchaserInfoListener) {
        getPurchaserInfo(ReceiveCustomerInfoCallbackKt.toReceiveCustomerInfoCallback(receivePurchaserInfoListener));
    }

    public final synchronized /* synthetic */ PurchasesState getState$purchases_latestDependenciesRelease() {
        return this.state;
    }

    public final void getSubscriptionSkus(List<String> list, GetStoreProductsCallback getStoreProductsCallback) {
        getSkus(wu.h1(list), ProductType.SUBS, getStoreProductsCallback);
    }

    public final synchronized UpdatedCustomerInfoListener getUpdatedCustomerInfoListener() {
        return this.customerInfoHelper.getUpdatedCustomerInfoListener();
    }

    public final synchronized UpdatedPurchaserInfoListener getUpdatedPurchaserInfoListener() {
        return this._updatedPurchaserInfoListener;
    }

    public final void invalidateCustomerInfoCache() {
        LogWrapperKt.log(LogIntent.DEBUG, CustomerInfoStrings.INVALIDATING_CUSTOMERINFO_CACHE);
        this.deviceCache.clearCustomerInfoCache(getAppUserID());
    }

    public final void invalidatePurchaserInfoCache() {
        invalidateCustomerInfoCache();
    }

    public final boolean isAnonymous() {
        return this.identityManager.currentUserIsAnonymous();
    }

    public final void logIn(String str) {
        logIn$default(this, str, null, 2, null);
    }

    public final void logIn(String str, LogInCallback logInCallback) {
        String currentAppUserID = this.identityManager.getCurrentAppUserID();
        sd5 sd5Var = null;
        if (ur1.a(currentAppUserID, str)) {
            currentAppUserID = null;
        }
        if (currentAppUserID != null) {
            this.identityManager.logIn(str, new Purchases$logIn$2$1(this, str, logInCallback), new Purchases$logIn$2$2(this, logInCallback));
            sd5Var = sd5.a;
        }
        if (sd5Var == null) {
            this.customerInfoHelper.retrieveCustomerInfo(this.identityManager.getCurrentAppUserID(), CacheFetchPolicy.Companion.m2default(), getState$purchases_latestDependenciesRelease().getAppInBackground(), ListenerConversionsKt.receiveCustomerInfoCallback(new AnonymousClass3(logInCallback), new AnonymousClass4(logInCallback)));
        }
    }

    public final void logOut() {
        logOut$default(this, null, 1, null);
    }

    public final void logOut(ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        this.identityManager.logOut(new C14231(receiveCustomerInfoCallback, this));
    }

    @Override // com.revenuecat.purchases.LifecycleDelegate
    public void onAppBackgrounded() {
        synchronized (this) {
            setState$purchases_latestDependenciesRelease(PurchasesState.copy$default(getState$purchases_latestDependenciesRelease(), null, null, null, true, false, 23, null));
            sd5 sd5Var = sd5.a;
        }
        LogWrapperKt.log(LogIntent.DEBUG, ConfigureStrings.APP_BACKGROUNDED);
        synchronizeSubscriberAttributesIfNeeded();
    }

    @Override // com.revenuecat.purchases.LifecycleDelegate
    public void onAppForegrounded() {
        boolean firstTimeInForeground;
        synchronized (this) {
            firstTimeInForeground = getState$purchases_latestDependenciesRelease().getFirstTimeInForeground();
            setState$purchases_latestDependenciesRelease(PurchasesState.copy$default(getState$purchases_latestDependenciesRelease(), null, null, null, false, false, 7, null));
            sd5 sd5Var = sd5.a;
        }
        LogIntent logIntent = LogIntent.DEBUG;
        LogWrapperKt.log(logIntent, ConfigureStrings.APP_FOREGROUNDED);
        if (firstTimeInForeground || this.deviceCache.isCustomerInfoCacheStale(getAppUserID(), false)) {
            LogWrapperKt.log(logIntent, CustomerInfoStrings.CUSTOMERINFO_STALE_UPDATING_FOREGROUND);
            CustomerInfoHelper.retrieveCustomerInfo$default(this.customerInfoHelper, this.identityManager.getCurrentAppUserID(), CacheFetchPolicy.FETCH_CURRENT, false, null, 8, null);
        }
        if (this.deviceCache.isOfferingsCacheStale(false)) {
            LogWrapperKt.log(logIntent, OfferingStrings.OFFERINGS_STALE_UPDATING_IN_FOREGROUND);
            fetchAndCacheOfferings$default(this, this.identityManager.getCurrentAppUserID(), false, null, 4, null);
            LogWrapperKt.log(LogIntent.RC_SUCCESS, OfferingStrings.OFFERINGS_UPDATED_FROM_NETWORK);
        }
        updatePendingPurchaseQueue$purchases_latestDependenciesRelease();
        synchronizeSubscriberAttributesIfNeeded();
    }

    public final /* synthetic */ void postToBackend$purchases_latestDependenciesRelease(StoreTransaction storeTransaction, StoreProduct storeProduct, boolean z, boolean z2, String str, x81 x81Var, x81 x81Var2) {
        this.subscriberAttributesManager.getUnsyncedSubscriberAttributes(str, new Purchases$postToBackend$1(storeTransaction, storeProduct, this, str, z, z2, x81Var, x81Var2));
    }

    public final void purchasePackage(Activity activity, Package r8, UpgradeInfo upgradeInfo, ProductChangeCallback productChangeCallback) {
        startProductChange(activity, r8.getProduct(), r8.getOffering(), upgradeInfo, productChangeCallback);
    }

    public final void purchaseProduct(Activity activity, StoreProduct storeProduct, UpgradeInfo upgradeInfo, ProductChangeCallback productChangeCallback) {
        startProductChange(activity, storeProduct, null, upgradeInfo, productChangeCallback);
    }

    public final void removeUpdatedCustomerInfoListener() {
        setUpdatedCustomerInfoListener(null);
    }

    public final void removeUpdatedPurchaserInfoListener() {
        this._updatedPurchaserInfoListener = null;
        removeUpdatedCustomerInfoListener();
    }

    public final void restorePurchases(ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        LogWrapperKt.log(LogIntent.DEBUG, RestoreStrings.RESTORING_PURCHASE);
        if (!getAllowSharingPlayStoreAccount()) {
            LogWrapperKt.log(LogIntent.WARNING, RestoreStrings.SHARING_ACC_RESTORE_FALSE);
        }
        String currentAppUserID = this.identityManager.getCurrentAppUserID();
        this.billing.queryAllPurchases(currentAppUserID, new Purchases$restorePurchases$1$1(this, receiveCustomerInfoCallback, currentAppUserID, getFinishTransactions()), new Purchases$restorePurchases$1$2(this, receiveCustomerInfoCallback));
    }

    public final void setAd(String str) {
        Md5A.h(new Object[]{"setAd"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.Ad.INSTANCE, str, getAppUserID());
    }

    public final void setAdGroup(String str) {
        Md5A.h(new Object[]{"setAdGroup"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.AdGroup.INSTANCE, str, getAppUserID());
    }

    public final void setAdjustID(String str) {
        Md5A.h(new Object[]{"setAdjustID"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.Adjust.INSTANCE, str, getAppUserID(), this.application);
    }

    public final void setAirshipChannelID(String str) {
        Md5A.h(new Object[]{"setAirshipChannelID"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.IntegrationIds.Airship.INSTANCE, str, getAppUserID());
    }

    public final synchronized void setAllowSharingPlayStoreAccount(boolean z) {
        setState$purchases_latestDependenciesRelease(PurchasesState.copy$default(getState$purchases_latestDependenciesRelease(), Boolean.valueOf(z), null, null, false, false, 30, null));
    }

    public final /* synthetic */ void setAppConfig$purchases_latestDependenciesRelease(AppConfig appConfig) {
        this.appConfig = appConfig;
    }

    public final void setAppsflyerID(String str) {
        Md5A.h(new Object[]{"setAppsflyerID"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.AppsFlyer.INSTANCE, str, getAppUserID(), this.application);
    }

    public final void setAttributes(Map<String, String> map) {
        Md5A.h(new Object[]{"setAttributes"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttributes(map, getAppUserID());
    }

    public final void setCampaign(String str) {
        Md5A.h(new Object[]{"setCampaign"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.Campaign.INSTANCE, str, getAppUserID());
    }

    public final void setCleverTapID(String str) {
        Md5A.h(new Object[]{"setCleverTapID"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.CleverTap.INSTANCE, str, getAppUserID(), this.application);
    }

    public final void setCreative(String str) {
        Md5A.h(new Object[]{"setCreative"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.Creative.INSTANCE, str, getAppUserID());
    }

    public final void setDisplayName(String str) {
        Md5A.h(new Object[]{"setDisplayName"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.DisplayName.INSTANCE, str, getAppUserID());
    }

    public final void setEmail(String str) {
        Md5A.h(new Object[]{"setEmail"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.Email.INSTANCE, str, getAppUserID());
    }

    public final void setFBAnonymousID(String str) {
        Md5A.h(new Object[]{"setFBAnonymousID"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.Facebook.INSTANCE, str, getAppUserID(), this.application);
    }

    public final synchronized void setFinishTransactions(boolean z) {
        this.appConfig.setFinishTransactions(z);
    }

    public final void setFirebaseAppInstanceID(String str) {
        Md5A.h(new Object[]{"setFirebaseAppInstanceID"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.IntegrationIds.FirebaseAppInstanceId.INSTANCE, str, getAppUserID());
    }

    public final void setKeyword(String str) {
        Md5A.h(new Object[]{"seKeyword"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.Keyword.INSTANCE, str, getAppUserID());
    }

    public final void setMediaSource(String str) {
        Md5A.h(new Object[]{"setMediaSource"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.MediaSource.INSTANCE, str, getAppUserID());
    }

    public final void setMixpanelDistinctID(String str) {
        Md5A.h(new Object[]{"setMixpanelDistinctID"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.IntegrationIds.MixpanelDistinctId.INSTANCE, str, getAppUserID());
    }

    public final void setMparticleID(String str) {
        Md5A.h(new Object[]{"setMparticleID"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.Mparticle.INSTANCE, str, getAppUserID(), this.application);
    }

    public final void setOnesignalID(String str) {
        Md5A.h(new Object[]{"setOnesignalID"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.IntegrationIds.OneSignal.INSTANCE, str, getAppUserID());
    }

    public final void setPhoneNumber(String str) {
        Md5A.h(new Object[]{"setPhoneNumber"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.PhoneNumber.INSTANCE, str, getAppUserID());
    }

    public final void setPushToken(String str) {
        Md5A.h(new Object[]{"setPushToken"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.FCMTokens.INSTANCE, str, getAppUserID());
    }

    public final synchronized /* synthetic */ void setState$purchases_latestDependenciesRelease(PurchasesState purchasesState) {
        this.state = purchasesState;
    }

    public final synchronized void setUpdatedCustomerInfoListener(UpdatedCustomerInfoListener updatedCustomerInfoListener) {
        this.customerInfoHelper.setUpdatedCustomerInfoListener(updatedCustomerInfoListener);
    }

    public final void setUpdatedPurchaserInfoListener(UpdatedPurchaserInfoListener updatedPurchaserInfoListener) {
        this._updatedPurchaserInfoListener = updatedPurchaserInfoListener;
        br3 br3Var = updatedPurchaserInfoListener != null ? new br3(updatedPurchaserInfoListener, 1) : null;
        synchronized (this) {
            this.customerInfoHelper.setUpdatedCustomerInfoListener(br3Var);
            sd5 sd5Var = sd5.a;
        }
    }

    public final void syncObserverModeAmazonPurchase(String str, String str2, String str3, String str4, Double d) {
        LogIntent logIntent = LogIntent.DEBUG;
        Md5A.h(new Object[]{str2, str3}, 2, PurchaseStrings.SYNCING_PURCHASE_STORE_USER_ID, logIntent);
        Set<String> previouslySentHashedTokens = this.deviceCache.getPreviouslySentHashedTokens();
        if (!previouslySentHashedTokens.contains(UtilsKt.sha1(str2))) {
            previouslySentHashedTokens = null;
        }
        if (previouslySentHashedTokens != null) {
            Md5A.h(new Object[]{str2, str3}, 2, PurchaseStrings.SYNCING_PURCHASE_SKIPPING, logIntent);
        } else {
            this.billing.normalizePurchaseData(str, str2, str3, new C14263(d, str4, this, str2, str3, this.identityManager.getCurrentAppUserID()), new C14274(str2, str3));
        }
    }

    public final void syncPurchases() {
        LogWrapperKt.log(LogIntent.DEBUG, PurchaseStrings.SYNCING_PURCHASES);
        String currentAppUserID = this.identityManager.getCurrentAppUserID();
        this.billing.queryAllPurchases(currentAppUserID, new C14291(currentAppUserID), C14302.INSTANCE);
    }

    public final /* synthetic */ void updatePendingPurchaseQueue$purchases_latestDependenciesRelease() {
        if (!this.appConfig.getDangerousSettings().getAutoSyncPurchases()) {
            LogWrapperKt.log(LogIntent.DEBUG, PurchaseStrings.SKIPPING_AUTOMATIC_SYNC);
        } else if (!this.billing.isConnected()) {
            LogWrapperKt.log(LogIntent.DEBUG, PurchaseStrings.BILLING_CLIENT_NOT_CONNECTED);
        } else {
            LogWrapperKt.log(LogIntent.DEBUG, PurchaseStrings.UPDATING_PENDING_PURCHASE_QUEUE);
            Dispatcher.enqueue$default(this.dispatcher, new eLUR(this, 3), false, 2, null);
        }
    }

    public final void getCustomerInfo(CacheFetchPolicy cacheFetchPolicy, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        this.customerInfoHelper.retrieveCustomerInfo(this.identityManager.getCurrentAppUserID(), cacheFetchPolicy, getState$purchases_latestDependenciesRelease().getAppInBackground(), receiveCustomerInfoCallback);
    }

    public final void getNonSubscriptionSkus(List<String> list, GetSkusResponseListener getSkusResponseListener) {
        getSkus(wu.h1(list), ProductTypeConversionsKt.toProductType("inapp"), GetStoreProductsCallbackKt.toGetStoreProductsCallback(getSkusResponseListener));
    }

    public final void getPurchaserInfo(ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        getCustomerInfo(receiveCustomerInfoCallback);
    }

    public final void getSubscriptionSkus(List<String> list, GetSkusResponseListener getSkusResponseListener) {
        getSkus(wu.h1(list), ProductTypeConversionsKt.toProductType("subs"), GetStoreProductsCallbackKt.toGetStoreProductsCallback(getSkusResponseListener));
    }

    public final void logOut(ReceivePurchaserInfoListener receivePurchaserInfoListener) {
        logOut(ReceiveCustomerInfoCallbackKt.toReceiveCustomerInfoCallback(receivePurchaserInfoListener));
    }

    public final void purchaseProduct(Activity activity, StoreProduct storeProduct, PurchaseCallback purchaseCallback) {
        startPurchase(activity, storeProduct, null, purchaseCallback);
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.Purchases$1, reason: invalid class name */
    public static final class AnonymousClass1 extends cx1 implements h81<sd5> {
        public AnonymousClass1() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            EQ.E.B.a(Purchases.this.getLifecycleHandler());
        }

        @Override // defpackage.h81
        public /* bridge */ /* synthetic */ sd5 invoke() {
            invoke2();
            return sd5.a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.Purchases$close$2, reason: invalid class name and case insensitive filesystem */
    public static final class C14122 extends cx1 implements h81<sd5> {
        public C14122() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            EQ.E.B.c(Purchases.this.getLifecycleHandler());
        }

        @Override // defpackage.h81
        public /* bridge */ /* synthetic */ sd5 invoke() {
            invoke2();
            return sd5.a;
        }
    }

    public final void purchaseProduct(Activity activity, SkuDetails skuDetails, UpgradeInfo upgradeInfo, ProductChangeListener productChangeListener) {
        purchaseProduct(activity, StoreProductConversionsKt.toStoreProduct(skuDetails), upgradeInfo, ProductChangeCallbackKt.toProductChangeCallback(productChangeListener));
    }

    public final void purchasePackage(Activity activity, Package r3, PurchaseCallback purchaseCallback) {
        startPurchase(activity, r3.getProduct(), r3.getOffering(), purchaseCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatch(PurchaseErrorCallback purchaseErrorCallback, PurchasesError purchasesError) {
        dispatch(new C14131(purchaseErrorCallback, purchasesError));
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kg0 kg0Var) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void canMakePayments$default(Companion companion, Context context, List list, Callback callback, int i, Object obj) {
            if ((i & 2) != 0) {
                list = cs0.w;
            }
            companion.canMakePayments(context, list, callback);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: canMakePayments$lambda-1, reason: not valid java name */
        public static final void m7canMakePayments$lambda1(NUlFixed nUl, List list) {
        }

        public static /* synthetic */ Purchases configure$default(Companion companion, Context context, String str, String str2, boolean z, ExecutorService executorService, int i, Object obj) {
            if ((i & 4) != 0) {
                str2 = null;
            }
            String str3 = str2;
            boolean z2 = (i & 8) != 0 ? false : z;
            if ((i & 16) != 0) {
                executorService = companion.createDefaultExecutor();
            }
            return companion.configure(context, str, str3, z2, executorService);
        }

        private final ExecutorService createDefaultExecutor() {
            return Executors.newSingleThreadScheduledExecutor();
        }

        public static /* synthetic */ void getDebugLogsEnabled$annotations() {
        }

        public static /* synthetic */ void getFrameworkVersion$annotations() {
        }

        public static /* synthetic */ void getLogHandler$annotations() {
        }

        public static /* synthetic */ void getPlatformInfo$annotations() {
        }

        public static /* synthetic */ void getProxyURL$annotations() {
        }

        public static /* synthetic */ void getSharedInstance$annotations() {
        }

        public static /* synthetic */ void isConfigured$annotations() {
        }

        public final void canMakePayments(Context context, Callback<Boolean> callback) {
            canMakePayments$default(this, context, null, callback, 2, null);
        }

        public final void canMakePayments(Context context, List<? extends BillingFeature> list, Callback<Boolean> callback) {
            if (getSharedInstance().getAppConfig$purchases_latestDependenciesRelease().getStore() != Store.PLAY_STORE) {
                LogWrapperKt.log(LogIntent.RC_ERROR, BillingStrings.CANNOT_CALL_CAN_MAKE_PAYMENTS);
                callback.onReceived(Boolean.TRUE);
                return;
            }
            b70 b70Var = new b70();
            if (context == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            }
            CQf cQf = new CQf(true, context, b70Var);
            cQf.j(new Purchases$Companion$canMakePayments$2$1(new Handler(context.getMainLooper()), callback, cQf, list));
        }

        public final Purchases configure(Context context, String str) {
            return configure$default(this, context, str, null, false, null, 28, null);
        }

        public final Purchases configure(Context context, String str, String str2) {
            return configure$default(this, context, str, str2, false, null, 24, null);
        }

        public final Purchases configure(Context context, String str, String str2, boolean z) {
            return configure$default(this, context, str, str2, z, null, 16, null);
        }

        public final Purchases configure(Context context, String str, String str2, boolean z, ExecutorService executorService) {
            return configure(new PurchasesConfiguration.Builder(context, str).appUserID(str2).observerMode(z).service(executorService).build());
        }

        public final Purchases getBackingFieldSharedInstance$purchases_latestDependenciesRelease() {
            return Purchases.backingFieldSharedInstance;
        }

        public final boolean getDebugLogsEnabled() {
            return Config.INSTANCE.getDebugLogsEnabled();
        }

        public final String getFrameworkVersion() {
            return Purchases.frameworkVersion;
        }

        public final synchronized LogHandler getLogHandler() {
            return LogWrapperKt.getCurrentLogHandler();
        }

        public final PlatformInfo getPlatformInfo() {
            return Purchases.platformInfo;
        }

        public final URL getProxyURL() {
            return Purchases.proxyURL;
        }

        public final Purchases getSharedInstance() {
            Purchases backingFieldSharedInstance$purchases_latestDependenciesRelease = getBackingFieldSharedInstance$purchases_latestDependenciesRelease();
            if (backingFieldSharedInstance$purchases_latestDependenciesRelease != null) {
                return backingFieldSharedInstance$purchases_latestDependenciesRelease;
            }
            throw new UninitializedPropertyAccessException(ConfigureStrings.NO_SINGLETON_INSTANCE);
        }

        public final boolean isConfigured() {
            return getBackingFieldSharedInstance$purchases_latestDependenciesRelease() != null;
        }

        public final void setBackingFieldSharedInstance$purchases_latestDependenciesRelease(Purchases purchases) {
            Purchases.backingFieldSharedInstance = purchases;
        }

        public final void setDebugLogsEnabled(boolean z) {
            Config.INSTANCE.setDebugLogsEnabled(z);
        }

        public final synchronized void setLogHandler(LogHandler logHandler) {
            LogWrapperKt.setCurrentLogHandler(logHandler);
        }

        public final void setPlatformInfo(PlatformInfo platformInfo) {
            Purchases.platformInfo = platformInfo;
        }

        public final void setProxyURL(URL url) {
            Purchases.proxyURL = url;
        }

        public final void setSharedInstance$purchases_latestDependenciesRelease(Purchases purchases) {
            Purchases backingFieldSharedInstance$purchases_latestDependenciesRelease = getBackingFieldSharedInstance$purchases_latestDependenciesRelease();
            if (backingFieldSharedInstance$purchases_latestDependenciesRelease != null) {
                backingFieldSharedInstance$purchases_latestDependenciesRelease.close();
            }
            setBackingFieldSharedInstance$purchases_latestDependenciesRelease(purchases);
        }

        public final Purchases configure(PurchasesConfiguration purchasesConfiguration) {
            Purchases purchasesCreatePurchases = new PurchasesFactory(null, 1, 0 == true ? 1 : 0).createPurchases(purchasesConfiguration, getPlatformInfo(), getProxyURL());
            Purchases.Companion.setSharedInstance$purchases_latestDependenciesRelease(purchasesCreatePurchases);
            return purchasesCreatePurchases;
        }
    }

    public final void getCustomerInfo(ReceivePurchaserInfoListener receivePurchaserInfoListener) {
        getCustomerInfo(ReceiveCustomerInfoCallbackKt.toReceiveCustomerInfoCallback(receivePurchaserInfoListener));
    }

    public final void purchaseProduct(Activity activity, StoreProduct storeProduct, UpgradeInfo upgradeInfo, ProductChangeListener productChangeListener) {
        purchaseProduct(activity, storeProduct, upgradeInfo, ProductChangeCallbackKt.toProductChangeCallback(productChangeListener));
    }

    public final void purchasePackage(Activity activity, Package r2, UpgradeInfo upgradeInfo, ProductChangeListener productChangeListener) {
        purchasePackage(activity, r2, upgradeInfo, ProductChangeCallbackKt.toProductChangeCallback(productChangeListener));
    }

    public final void restorePurchases(ReceivePurchaserInfoListener receivePurchaserInfoListener) {
        restorePurchases(ReceiveCustomerInfoCallbackKt.toReceiveCustomerInfoCallback(receivePurchaserInfoListener));
    }

    public final void purchaseProduct(Activity activity, SkuDetails skuDetails, UpgradeInfo upgradeInfo, ProductChangeCallback productChangeCallback) {
        purchaseProduct(activity, StoreProductConversionsKt.toStoreProduct(skuDetails), upgradeInfo, productChangeCallback);
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.Purchases$syncObserverModeAmazonPurchase$3, reason: invalid class name and case insensitive filesystem */
    public static final class C14263 extends cx1 implements j81<String, sd5> {
        final /* synthetic */ String $amazonUserID;
        final /* synthetic */ String $appUserID;
        final /* synthetic */ String $isoCurrencyCode;
        final /* synthetic */ Double $price;
        final /* synthetic */ String $receiptID;
        final /* synthetic */ Purchases this$0;

        /* JADX INFO: renamed from: com.revenuecat.purchases.Purchases$syncObserverModeAmazonPurchase$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends cx1 implements h81<sd5> {
            final /* synthetic */ String $amazonUserID;
            final /* synthetic */ String $receiptID;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(String str, String str2) {
                super(0);
                this.$receiptID = str;
                this.$amazonUserID = str2;
            }

            @Override // defpackage.h81
            public /* bridge */ /* synthetic */ sd5 invoke() {
                invoke2();
                return sd5.a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                LogWrapperKt.log(LogIntent.PURCHASE, String.format(PurchaseStrings.PURCHASE_SYNCED_USER_ID, Arrays.copyOf(new Object[]{this.$receiptID, this.$amazonUserID}, 2)));
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.Purchases$syncObserverModeAmazonPurchase$3$2, reason: invalid class name */
        public static final class AnonymousClass2 extends cx1 implements j81<PurchasesError, sd5> {
            final /* synthetic */ String $amazonUserID;
            final /* synthetic */ String $receiptID;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(String str, String str2) {
                super(1);
                this.$receiptID = str;
                this.$amazonUserID = str2;
            }

            @Override // defpackage.j81
            public /* bridge */ /* synthetic */ sd5 invoke(PurchasesError purchasesError) {
                invoke2(purchasesError);
                return sd5.a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(PurchasesError purchasesError) {
                LogWrapperKt.log(LogIntent.RC_ERROR, String.format(PurchaseStrings.SYNCING_PURCHASE_ERROR_DETAILS_USER_ID, Arrays.copyOf(new Object[]{this.$receiptID, this.$amazonUserID, purchasesError}, 3)));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14263(Double d, String str, Purchases purchases, String str2, String str3, String str4) {
            super(1);
            this.$price = d;
            this.$isoCurrencyCode = str;
            this.this$0 = purchases;
            this.$receiptID = str2;
            this.$amazonUserID = str3;
            this.$appUserID = str4;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001e  */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            Double d;
            List listSingletonList = Collections.singletonList(str);
            String str2 = null;
            StoreProduct storeProduct = null;
            Double d2 = this.$price;
            if (d2 == null) {
                d = null;
            } else {
                if (d2.doubleValue() == 0.0d) {
                    d = null;
                } else {
                    d = d2;
                }
            }
            String str3 = this.$isoCurrencyCode;
            ReceiptInfo receiptInfo = new ReceiptInfo(listSingletonList, str2, storeProduct, d, (str3 == null || iv4.s(str3)) ? null : str3, 6, null);
            Purchases purchases = this.this$0;
            String str4 = this.$receiptID;
            String str5 = this.$amazonUserID;
            purchases.syncPurchaseWithBackend(str4, str5, this.$appUserID, receiptInfo, null, new AnonymousClass1(str4, str5), new AnonymousClass2(this.$receiptID, this.$amazonUserID));
        }

        @Override // defpackage.j81
        public /* bridge */ /* synthetic */ sd5 invoke(String str) {
            invoke2(str);
            return sd5.a;
        }
    }

    public final void purchasePackage(Activity activity, Package r2, MakePurchaseListener makePurchaseListener) {
        purchasePackage(activity, r2, PurchaseCallbackKt.toPurchaseCallback(makePurchaseListener));
    }

    public final void purchaseProduct(Activity activity, SkuDetails skuDetails, MakePurchaseListener makePurchaseListener) {
        purchaseProduct(activity, skuDetails, PurchaseCallbackKt.toPurchaseCallback(makePurchaseListener));
    }

    public final void purchaseProduct(Activity activity, StoreProduct storeProduct, MakePurchaseListener makePurchaseListener) {
        purchaseProduct(activity, storeProduct, PurchaseCallbackKt.toPurchaseCallback(makePurchaseListener));
    }

    public final void getOfferings(ReceiveOfferingsListener receiveOfferingsListener) {
        getOfferings(ReceiveOfferingsCallbackKt.toReceiveOfferingsCallback(receiveOfferingsListener));
    }

    public final void purchaseProduct(Activity activity, SkuDetails skuDetails, PurchaseCallback purchaseCallback) {
        purchaseProduct(activity, StoreProductConversionsKt.toStoreProduct(skuDetails), purchaseCallback);
    }

    public /* synthetic */ Purchases(Application application, String str, Backend backend, BillingAbstract billingAbstract, DeviceCache deviceCache, Dispatcher dispatcher, IdentityManager identityManager, SubscriberAttributesManager subscriberAttributesManager, AppConfig appConfig, CustomerInfoHelper customerInfoHelper, Handler handler, int i, kg0 kg0Var) {
        this(application, str, backend, billingAbstract, deviceCache, dispatcher, identityManager, subscriberAttributesManager, appConfig, customerInfoHelper, (i & 1024) != 0 ? new Handler(Looper.getMainLooper()) : handler);
    }
}
