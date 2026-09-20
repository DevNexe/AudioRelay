package com.revenuecat.purchases;

import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.ReceiptInfo;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.RestoreStrings;
import com.revenuecat.purchases.subscriberattributes.BackendHelpersKt;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttribute;
import defpackage.Md5A;
import defpackage.cx1;
import defpackage.h81;
import defpackage.j81;
import defpackage.sd5;
import defpackage.ur1;
import defpackage.wu;
import defpackage.x81;
import defpackage.y81;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class Purchases$restorePurchases$1$1$2$1$1 extends cx1 implements j81<Map<String, ? extends SubscriberAttribute>, sd5> {
    final /* synthetic */ String $appUserID;
    final /* synthetic */ ReceiveCustomerInfoCallback $callback;
    final /* synthetic */ boolean $finishTransactions;
    final /* synthetic */ StoreTransaction $purchase;
    final /* synthetic */ List<StoreTransaction> $sortedByTime;
    final /* synthetic */ Purchases this$0;

    /* JADX INFO: renamed from: com.revenuecat.purchases.Purchases$restorePurchases$1$1$2$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends cx1 implements x81<CustomerInfo, JSONObject, sd5> {
        final /* synthetic */ String $appUserID;
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;
        final /* synthetic */ boolean $finishTransactions;
        final /* synthetic */ StoreTransaction $purchase;
        final /* synthetic */ List<StoreTransaction> $sortedByTime;
        final /* synthetic */ Map<String, SubscriberAttribute> $unsyncedSubscriberAttributesByKey;
        final /* synthetic */ Purchases this$0;

        /* JADX INFO: renamed from: com.revenuecat.purchases.Purchases$restorePurchases$1$1$2$1$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C01081 extends cx1 implements h81<sd5> {
            final /* synthetic */ ReceiveCustomerInfoCallback $callback;
            final /* synthetic */ CustomerInfo $info;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01081(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, CustomerInfo customerInfo) {
                super(0);
                this.$callback = receiveCustomerInfoCallback;
                this.$info = customerInfo;
            }

            @Override // defpackage.h81
            public /* bridge */ /* synthetic */ sd5 invoke() {
                invoke2();
                return sd5.a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.$callback.onReceived(this.$info);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Purchases purchases, String str, Map<String, SubscriberAttribute> map, boolean z, StoreTransaction storeTransaction, List<StoreTransaction> list, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
            super(2);
            this.this$0 = purchases;
            this.$appUserID = str;
            this.$unsyncedSubscriberAttributesByKey = map;
            this.$finishTransactions = z;
            this.$purchase = storeTransaction;
            this.$sortedByTime = list;
            this.$callback = receiveCustomerInfoCallback;
        }

        @Override // defpackage.x81
        public /* bridge */ /* synthetic */ sd5 invoke(CustomerInfo customerInfo, JSONObject jSONObject) {
            invoke2(customerInfo, jSONObject);
            return sd5.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CustomerInfo customerInfo, JSONObject jSONObject) {
            this.this$0.subscriberAttributesManager.markAsSynced(this.$appUserID, this.$unsyncedSubscriberAttributesByKey, BackendHelpersKt.getAttributeErrors(jSONObject));
            this.this$0.billing.consumeAndSave(this.$finishTransactions, this.$purchase);
            this.this$0.customerInfoHelper.cacheCustomerInfo(customerInfo);
            this.this$0.customerInfoHelper.sendUpdatedCustomerInfoToDelegateIfChanged(customerInfo);
            Md5A.h(new Object[]{this.$purchase}, 1, RestoreStrings.PURCHASE_RESTORED, LogIntent.DEBUG);
            if (ur1.a(wu.N0(this.$sortedByTime), this.$purchase)) {
                this.this$0.dispatch(new C01081(this.$callback, customerInfo));
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.Purchases$restorePurchases$1$1$2$1$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends cx1 implements y81<PurchasesError, Boolean, JSONObject, sd5> {
        final /* synthetic */ String $appUserID;
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;
        final /* synthetic */ boolean $finishTransactions;
        final /* synthetic */ StoreTransaction $purchase;
        final /* synthetic */ List<StoreTransaction> $sortedByTime;
        final /* synthetic */ Map<String, SubscriberAttribute> $unsyncedSubscriberAttributesByKey;
        final /* synthetic */ Purchases this$0;

        /* JADX INFO: renamed from: com.revenuecat.purchases.Purchases$restorePurchases$1$1$2$1$1$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends cx1 implements h81<sd5> {
            final /* synthetic */ ReceiveCustomerInfoCallback $callback;
            final /* synthetic */ PurchasesError $error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, PurchasesError purchasesError) {
                super(0);
                this.$callback = receiveCustomerInfoCallback;
                this.$error = purchasesError;
            }

            @Override // defpackage.h81
            public /* bridge */ /* synthetic */ sd5 invoke() {
                invoke2();
                return sd5.a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.$callback.onError(this.$error);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Purchases purchases, String str, Map<String, SubscriberAttribute> map, boolean z, StoreTransaction storeTransaction, List<StoreTransaction> list, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
            super(3);
            this.this$0 = purchases;
            this.$appUserID = str;
            this.$unsyncedSubscriberAttributesByKey = map;
            this.$finishTransactions = z;
            this.$purchase = storeTransaction;
            this.$sortedByTime = list;
            this.$callback = receiveCustomerInfoCallback;
        }

        @Override // defpackage.y81
        public /* bridge */ /* synthetic */ sd5 invoke(PurchasesError purchasesError, Boolean bool, JSONObject jSONObject) {
            invoke(purchasesError, bool.booleanValue(), jSONObject);
            return sd5.a;
        }

        public final void invoke(PurchasesError purchasesError, boolean z, JSONObject jSONObject) {
            if (z) {
                this.this$0.subscriberAttributesManager.markAsSynced(this.$appUserID, this.$unsyncedSubscriberAttributesByKey, BackendHelpersKt.getAttributeErrors(jSONObject));
                this.this$0.billing.consumeAndSave(this.$finishTransactions, this.$purchase);
            }
            Md5A.h(new Object[]{this.$purchase, purchasesError}, 2, RestoreStrings.RESTORING_PURCHASE_ERROR, LogIntent.RC_ERROR);
            if (ur1.a(wu.N0(this.$sortedByTime), this.$purchase)) {
                this.this$0.dispatch(new AnonymousClass1(this.$callback, purchasesError));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Purchases$restorePurchases$1$1$2$1$1(StoreTransaction storeTransaction, Purchases purchases, String str, boolean z, List<StoreTransaction> list, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        super(1);
        this.$purchase = storeTransaction;
        this.this$0 = purchases;
        this.$appUserID = str;
        this.$finishTransactions = z;
        this.$sortedByTime = list;
        this.$callback = receiveCustomerInfoCallback;
    }

    @Override // defpackage.j81
    public /* bridge */ /* synthetic */ sd5 invoke(Map<String, ? extends SubscriberAttribute> map) {
        invoke2((Map<String, SubscriberAttribute>) map);
        return sd5.a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Map<String, SubscriberAttribute> map) {
        this.this$0.backend.postReceiptData(this.$purchase.getPurchaseToken(), this.$appUserID, true, !this.$finishTransactions, BackendHelpersKt.toBackendMap(map), new ReceiptInfo(this.$purchase.getSkus(), null, null, null, null, 30, null), this.$purchase.getStoreUserID(), this.$purchase.getMarketplace(), new AnonymousClass1(this.this$0, this.$appUserID, map, this.$finishTransactions, this.$purchase, this.$sortedByTime, this.$callback), new AnonymousClass2(this.this$0, this.$appUserID, map, this.$finishTransactions, this.$purchase, this.$sortedByTime, this.$callback));
    }
}
