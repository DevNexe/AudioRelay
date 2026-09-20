package com.revenuecat.purchases;

import com.revenuecat.purchases.common.ReceiptInfo;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.subscriberattributes.BackendHelpersKt;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttribute;
import defpackage.cx1;
import defpackage.j81;
import defpackage.sd5;
import defpackage.x81;
import defpackage.y81;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class Purchases$postToBackend$1 extends cx1 implements j81<Map<String, ? extends SubscriberAttribute>, sd5> {
    final /* synthetic */ boolean $allowSharingPlayStoreAccount;
    final /* synthetic */ String $appUserID;
    final /* synthetic */ boolean $consumeAllTransactions;
    final /* synthetic */ x81<StoreTransaction, PurchasesError, sd5> $onError;
    final /* synthetic */ x81<StoreTransaction, CustomerInfo, sd5> $onSuccess;
    final /* synthetic */ StoreTransaction $purchase;
    final /* synthetic */ StoreProduct $storeProduct;
    final /* synthetic */ Purchases this$0;

    /* JADX INFO: renamed from: com.revenuecat.purchases.Purchases$postToBackend$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends cx1 implements x81<CustomerInfo, JSONObject, sd5> {
        final /* synthetic */ String $appUserID;
        final /* synthetic */ boolean $consumeAllTransactions;
        final /* synthetic */ x81<StoreTransaction, CustomerInfo, sd5> $onSuccess;
        final /* synthetic */ StoreTransaction $purchase;
        final /* synthetic */ Map<String, SubscriberAttribute> $unsyncedSubscriberAttributesByKey;
        final /* synthetic */ Purchases this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Purchases purchases, String str, Map<String, SubscriberAttribute> map, boolean z, StoreTransaction storeTransaction, x81<? super StoreTransaction, ? super CustomerInfo, sd5> x81Var) {
            super(2);
            this.this$0 = purchases;
            this.$appUserID = str;
            this.$unsyncedSubscriberAttributesByKey = map;
            this.$consumeAllTransactions = z;
            this.$purchase = storeTransaction;
            this.$onSuccess = x81Var;
        }

        @Override // defpackage.x81
        public /* bridge */ /* synthetic */ sd5 invoke(CustomerInfo customerInfo, JSONObject jSONObject) {
            invoke2(customerInfo, jSONObject);
            return sd5.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CustomerInfo customerInfo, JSONObject jSONObject) {
            this.this$0.subscriberAttributesManager.markAsSynced(this.$appUserID, this.$unsyncedSubscriberAttributesByKey, BackendHelpersKt.getAttributeErrors(jSONObject));
            this.this$0.billing.consumeAndSave(this.$consumeAllTransactions, this.$purchase);
            this.this$0.customerInfoHelper.cacheCustomerInfo(customerInfo);
            this.this$0.customerInfoHelper.sendUpdatedCustomerInfoToDelegateIfChanged(customerInfo);
            x81<StoreTransaction, CustomerInfo, sd5> x81Var = this.$onSuccess;
            if (x81Var != null) {
                x81Var.invoke(this.$purchase, customerInfo);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.Purchases$postToBackend$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends cx1 implements y81<PurchasesError, Boolean, JSONObject, sd5> {
        final /* synthetic */ String $appUserID;
        final /* synthetic */ boolean $consumeAllTransactions;
        final /* synthetic */ x81<StoreTransaction, PurchasesError, sd5> $onError;
        final /* synthetic */ StoreTransaction $purchase;
        final /* synthetic */ Map<String, SubscriberAttribute> $unsyncedSubscriberAttributesByKey;
        final /* synthetic */ Purchases this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Purchases purchases, String str, Map<String, SubscriberAttribute> map, boolean z, StoreTransaction storeTransaction, x81<? super StoreTransaction, ? super PurchasesError, sd5> x81Var) {
            super(3);
            this.this$0 = purchases;
            this.$appUserID = str;
            this.$unsyncedSubscriberAttributesByKey = map;
            this.$consumeAllTransactions = z;
            this.$purchase = storeTransaction;
            this.$onError = x81Var;
        }

        @Override // defpackage.y81
        public /* bridge */ /* synthetic */ sd5 invoke(PurchasesError purchasesError, Boolean bool, JSONObject jSONObject) {
            invoke(purchasesError, bool.booleanValue(), jSONObject);
            return sd5.a;
        }

        public final void invoke(PurchasesError purchasesError, boolean z, JSONObject jSONObject) {
            if (z) {
                this.this$0.subscriberAttributesManager.markAsSynced(this.$appUserID, this.$unsyncedSubscriberAttributesByKey, BackendHelpersKt.getAttributeErrors(jSONObject));
                this.this$0.billing.consumeAndSave(this.$consumeAllTransactions, this.$purchase);
            }
            x81<StoreTransaction, PurchasesError, sd5> x81Var = this.$onError;
            if (x81Var != null) {
                x81Var.invoke(this.$purchase, purchasesError);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Purchases$postToBackend$1(StoreTransaction storeTransaction, StoreProduct storeProduct, Purchases purchases, String str, boolean z, boolean z2, x81<? super StoreTransaction, ? super CustomerInfo, sd5> x81Var, x81<? super StoreTransaction, ? super PurchasesError, sd5> x81Var2) {
        super(1);
        this.$purchase = storeTransaction;
        this.$storeProduct = storeProduct;
        this.this$0 = purchases;
        this.$appUserID = str;
        this.$allowSharingPlayStoreAccount = z;
        this.$consumeAllTransactions = z2;
        this.$onSuccess = x81Var;
        this.$onError = x81Var2;
    }

    @Override // defpackage.j81
    public /* bridge */ /* synthetic */ sd5 invoke(Map<String, ? extends SubscriberAttribute> map) {
        invoke2((Map<String, SubscriberAttribute>) map);
        return sd5.a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Map<String, SubscriberAttribute> map) {
        this.this$0.backend.postReceiptData(this.$purchase.getPurchaseToken(), this.$appUserID, this.$allowSharingPlayStoreAccount, !this.$consumeAllTransactions, BackendHelpersKt.toBackendMap(map), new ReceiptInfo(this.$purchase.getSkus(), this.$purchase.getPresentedOfferingIdentifier(), this.$storeProduct, null, null, 24, null), this.$purchase.getStoreUserID(), this.$purchase.getMarketplace(), new AnonymousClass1(this.this$0, this.$appUserID, map, this.$consumeAllTransactions, this.$purchase, this.$onSuccess), new AnonymousClass2(this.this$0, this.$appUserID, map, this.$consumeAllTransactions, this.$purchase, this.$onError));
    }
}
