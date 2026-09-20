package com.revenuecat.purchases;

import android.app.Activity;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.revenuecat.purchases.interfaces.MakePurchaseListener;
import com.revenuecat.purchases.interfaces.ProductChangeListener;
import defpackage.j81;
import defpackage.sd5;
import defpackage.x81;
import kotlin.jvm.internal.QnHx;

/* JADX INFO: loaded from: classes3.dex */
public final class DeprecatedListenerConversionsKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.DeprecatedListenerConversionsKt$getPurchaserInfoWith$1, reason: invalid class name and case insensitive filesystem */
    public /* synthetic */ class C14061 extends QnHx implements j81<CustomerInfo, sd5> {
        public static final C14061 INSTANCE = new C14061();

        public C14061() {
            super(1, PurchaserInfo.class, "<init>", "<init>(Lcom/revenuecat/purchases/CustomerInfo;)V", 8);
        }

        @Override // defpackage.j81
        public /* bridge */ /* synthetic */ sd5 invoke(CustomerInfo customerInfo) {
            invoke2(customerInfo);
            return sd5.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CustomerInfo customerInfo) {
            new PurchaserInfo(customerInfo);
        }
    }

    private static /* synthetic */ void DeprecatedProductChangeCompletedFunction$annotations() {
    }

    private static /* synthetic */ void DeprecatedPurchaseCompletedFunction$annotations() {
    }

    public static final ProductChangeListener deprecatedProductChangeCompletedListener(final x81<? super Purchase, ? super PurchaserInfo, sd5> x81Var, final x81<? super PurchasesError, ? super Boolean, sd5> x81Var2) {
        return new ProductChangeListener() { // from class: com.revenuecat.purchases.DeprecatedListenerConversionsKt.deprecatedProductChangeCompletedListener.1
            @Override // com.revenuecat.purchases.interfaces.ProductChangeListener
            public void onCompleted(Purchase purchase, PurchaserInfo purchaserInfo) {
                x81Var.invoke(purchase, purchaserInfo);
            }

            @Override // com.revenuecat.purchases.interfaces.PurchaseErrorListener
            public void onError(PurchasesError purchasesError, boolean z) {
                x81Var2.invoke(purchasesError, Boolean.valueOf(z));
            }
        };
    }

    public static final MakePurchaseListener deprecatedPurchaseCompletedListener(final x81<? super Purchase, ? super PurchaserInfo, sd5> x81Var, final x81<? super PurchasesError, ? super Boolean, sd5> x81Var2) {
        return new MakePurchaseListener() { // from class: com.revenuecat.purchases.DeprecatedListenerConversionsKt.deprecatedPurchaseCompletedListener.1
            @Override // com.revenuecat.purchases.interfaces.MakePurchaseListener
            public void onCompleted(Purchase purchase, PurchaserInfo purchaserInfo) {
                x81Var.invoke(purchase, purchaserInfo);
            }

            @Override // com.revenuecat.purchases.interfaces.PurchaseErrorListener
            public void onError(PurchasesError purchasesError, boolean z) {
                x81Var2.invoke(purchasesError, Boolean.valueOf(z));
            }
        };
    }

    public static final void getPurchaserInfoWith(Purchases purchases, j81<? super PurchasesError, sd5> j81Var, j81<? super PurchaserInfo, sd5> j81Var2) {
        ListenerConversionsKt.getCustomerInfoWith(purchases, j81Var, C14061.INSTANCE);
    }

    public static /* synthetic */ void getPurchaserInfoWith$default(Purchases purchases, j81 j81Var, j81 j81Var2, int i, Object obj) {
        if ((i & 1) != 0) {
            j81Var = ListenerConversionsKt.getON_ERROR_STUB();
        }
        getPurchaserInfoWith(purchases, j81Var, j81Var2);
    }

    public static final void purchaseProductWith(Purchases purchases, Activity activity, SkuDetails skuDetails, x81<? super PurchasesError, ? super Boolean, sd5> x81Var, x81<? super Purchase, ? super PurchaserInfo, sd5> x81Var2) {
        purchases.purchaseProduct(activity, skuDetails, deprecatedPurchaseCompletedListener(x81Var2, x81Var));
    }

    public static /* synthetic */ void purchaseProductWith$default(Purchases purchases, Activity activity, SkuDetails skuDetails, x81 x81Var, x81 x81Var2, int i, Object obj) {
        if ((i & 4) != 0) {
            x81Var = ListenerConversionsKt.getON_PURCHASE_ERROR_STUB();
        }
        purchaseProductWith(purchases, activity, skuDetails, x81Var, x81Var2);
    }

    public static final void purchaseProductWith(Purchases purchases, Activity activity, SkuDetails skuDetails, UpgradeInfo upgradeInfo, x81<? super PurchasesError, ? super Boolean, sd5> x81Var, x81<? super Purchase, ? super PurchaserInfo, sd5> x81Var2) {
        purchases.purchaseProduct(activity, skuDetails, upgradeInfo, deprecatedProductChangeCompletedListener(x81Var2, x81Var));
    }

    public static /* synthetic */ void purchaseProductWith$default(Purchases purchases, Activity activity, SkuDetails skuDetails, UpgradeInfo upgradeInfo, x81 x81Var, x81 x81Var2, int i, Object obj) {
        if ((i & 8) != 0) {
            x81Var = ListenerConversionsKt.getON_PURCHASE_ERROR_STUB();
        }
        purchaseProductWith(purchases, activity, skuDetails, upgradeInfo, x81Var, x81Var2);
    }
}
