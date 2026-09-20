package com.revenuecat.purchases;

import android.app.Activity;
import com.revenuecat.purchases.interfaces.GetStoreProductsCallback;
import com.revenuecat.purchases.interfaces.LogInCallback;
import com.revenuecat.purchases.interfaces.ProductChangeCallback;
import com.revenuecat.purchases.interfaces.PurchaseCallback;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import defpackage.j81;
import defpackage.sd5;
import defpackage.x81;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ListenerConversionsKt {
    private static final j81<PurchasesError, sd5> ON_ERROR_STUB = ListenerConversionsKt$ON_ERROR_STUB$1.INSTANCE;
    private static final x81<PurchasesError, Boolean, sd5> ON_PURCHASE_ERROR_STUB = ListenerConversionsKt$ON_PURCHASE_ERROR_STUB$1.INSTANCE;

    public static final void getCustomerInfoWith(Purchases purchases, j81<? super PurchasesError, sd5> j81Var, j81<? super CustomerInfo, sd5> j81Var2) {
        purchases.getCustomerInfo(receiveCustomerInfoCallback(j81Var2, j81Var));
    }

    public static /* synthetic */ void getCustomerInfoWith$default(Purchases purchases, j81 j81Var, j81 j81Var2, int i, Object obj) {
        if ((i & 1) != 0) {
            j81Var = ON_ERROR_STUB;
        }
        getCustomerInfoWith(purchases, j81Var, j81Var2);
    }

    public static final void getNonSubscriptionSkusWith(Purchases purchases, List<String> list, j81<? super PurchasesError, sd5> j81Var, j81<? super List<StoreProduct>, sd5> j81Var2) {
        purchases.getNonSubscriptionSkus(list, getStoreProductsCallback(j81Var2, j81Var));
    }

    public static final j81<PurchasesError, sd5> getON_ERROR_STUB() {
        return ON_ERROR_STUB;
    }

    public static final x81<PurchasesError, Boolean, sd5> getON_PURCHASE_ERROR_STUB() {
        return ON_PURCHASE_ERROR_STUB;
    }

    public static final void getOfferingsWith(Purchases purchases, j81<? super PurchasesError, sd5> j81Var, j81<? super Offerings, sd5> j81Var2) {
        purchases.getOfferings(receiveOfferingsCallback(j81Var2, j81Var));
    }

    public static /* synthetic */ void getOfferingsWith$default(Purchases purchases, j81 j81Var, j81 j81Var2, int i, Object obj) {
        if ((i & 1) != 0) {
            j81Var = ON_ERROR_STUB;
        }
        getOfferingsWith(purchases, j81Var, j81Var2);
    }

    public static final GetStoreProductsCallback getStoreProductsCallback(final j81<? super List<StoreProduct>, sd5> j81Var, final j81<? super PurchasesError, sd5> j81Var2) {
        return new GetStoreProductsCallback() { // from class: com.revenuecat.purchases.ListenerConversionsKt.getStoreProductsCallback.1
            @Override // com.revenuecat.purchases.interfaces.GetStoreProductsCallback
            public void onError(PurchasesError purchasesError) {
                j81Var2.invoke(purchasesError);
            }

            @Override // com.revenuecat.purchases.interfaces.GetStoreProductsCallback
            public void onReceived(List<StoreProduct> list) {
                j81Var.invoke(list);
            }
        };
    }

    public static final void getSubscriptionSkusWith(Purchases purchases, List<String> list, j81<? super PurchasesError, sd5> j81Var, j81<? super List<StoreProduct>, sd5> j81Var2) {
        purchases.getSubscriptionSkus(list, getStoreProductsCallback(j81Var2, j81Var));
    }

    public static /* synthetic */ void getSubscriptionSkusWith$default(Purchases purchases, List list, j81 j81Var, j81 j81Var2, int i, Object obj) {
        if ((i & 2) != 0) {
            j81Var = ON_ERROR_STUB;
        }
        getSubscriptionSkusWith(purchases, list, j81Var, j81Var2);
    }

    public static final LogInCallback logInSuccessListener(final x81<? super CustomerInfo, ? super Boolean, sd5> x81Var, final j81<? super PurchasesError, sd5> j81Var) {
        return new LogInCallback() { // from class: com.revenuecat.purchases.ListenerConversionsKt.logInSuccessListener.1
            @Override // com.revenuecat.purchases.interfaces.LogInCallback
            public void onError(PurchasesError purchasesError) {
                j81<PurchasesError, sd5> j81Var2 = j81Var;
                if (j81Var2 != null) {
                    j81Var2.invoke(purchasesError);
                }
            }

            @Override // com.revenuecat.purchases.interfaces.LogInCallback
            public void onReceived(CustomerInfo customerInfo, boolean z) {
                x81<CustomerInfo, Boolean, sd5> x81Var2 = x81Var;
                if (x81Var2 != null) {
                    x81Var2.invoke(customerInfo, Boolean.valueOf(z));
                }
            }
        };
    }

    public static final void logInWith(Purchases purchases, String str, j81<? super PurchasesError, sd5> j81Var, x81<? super CustomerInfo, ? super Boolean, sd5> x81Var) {
        purchases.logIn(str, logInSuccessListener(x81Var, j81Var));
    }

    public static /* synthetic */ void logInWith$default(Purchases purchases, String str, j81 j81Var, x81 x81Var, int i, Object obj) {
        if ((i & 2) != 0) {
            j81Var = ON_ERROR_STUB;
        }
        logInWith(purchases, str, j81Var, x81Var);
    }

    public static final void logOutWith(Purchases purchases, j81<? super PurchasesError, sd5> j81Var, j81<? super CustomerInfo, sd5> j81Var2) {
        purchases.logOut(receiveCustomerInfoCallback(j81Var2, j81Var));
    }

    public static /* synthetic */ void logOutWith$default(Purchases purchases, j81 j81Var, j81 j81Var2, int i, Object obj) {
        if ((i & 1) != 0) {
            j81Var = ON_ERROR_STUB;
        }
        logOutWith(purchases, j81Var, j81Var2);
    }

    public static final ProductChangeCallback productChangeCompletedListener(final x81<? super StoreTransaction, ? super CustomerInfo, sd5> x81Var, final x81<? super PurchasesError, ? super Boolean, sd5> x81Var2) {
        return new ProductChangeCallback() { // from class: com.revenuecat.purchases.ListenerConversionsKt.productChangeCompletedListener.1
            @Override // com.revenuecat.purchases.interfaces.ProductChangeCallback
            public void onCompleted(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
                x81Var.invoke(storeTransaction, customerInfo);
            }

            @Override // com.revenuecat.purchases.interfaces.PurchaseErrorCallback
            public void onError(PurchasesError purchasesError, boolean z) {
                x81Var2.invoke(purchasesError, Boolean.valueOf(z));
            }
        };
    }

    public static final PurchaseCallback purchaseCompletedCallback(final x81<? super StoreTransaction, ? super CustomerInfo, sd5> x81Var, final x81<? super PurchasesError, ? super Boolean, sd5> x81Var2) {
        return new PurchaseCallback() { // from class: com.revenuecat.purchases.ListenerConversionsKt.purchaseCompletedCallback.1
            @Override // com.revenuecat.purchases.interfaces.PurchaseCallback
            public void onCompleted(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
                x81Var.invoke(storeTransaction, customerInfo);
            }

            @Override // com.revenuecat.purchases.interfaces.PurchaseErrorCallback
            public void onError(PurchasesError purchasesError, boolean z) {
                x81Var2.invoke(purchasesError, Boolean.valueOf(z));
            }
        };
    }

    public static final void purchasePackageWith(Purchases purchases, Activity activity, Package r2, UpgradeInfo upgradeInfo, x81<? super PurchasesError, ? super Boolean, sd5> x81Var, x81<? super StoreTransaction, ? super CustomerInfo, sd5> x81Var2) {
        purchases.purchasePackage(activity, r2, upgradeInfo, productChangeCompletedListener(x81Var2, x81Var));
    }

    public static /* synthetic */ void purchasePackageWith$default(Purchases purchases, Activity activity, Package r8, UpgradeInfo upgradeInfo, x81 x81Var, x81 x81Var2, int i, Object obj) {
        if ((i & 8) != 0) {
            x81Var = ON_PURCHASE_ERROR_STUB;
        }
        purchasePackageWith(purchases, activity, r8, upgradeInfo, x81Var, x81Var2);
    }

    public static final void purchaseProductWith(Purchases purchases, Activity activity, StoreProduct storeProduct, x81<? super PurchasesError, ? super Boolean, sd5> x81Var, x81<? super StoreTransaction, ? super CustomerInfo, sd5> x81Var2) {
        purchases.purchaseProduct(activity, storeProduct, purchaseCompletedCallback(x81Var2, x81Var));
    }

    public static /* synthetic */ void purchaseProductWith$default(Purchases purchases, Activity activity, StoreProduct storeProduct, x81 x81Var, x81 x81Var2, int i, Object obj) {
        if ((i & 4) != 0) {
            x81Var = ON_PURCHASE_ERROR_STUB;
        }
        purchaseProductWith(purchases, activity, storeProduct, x81Var, x81Var2);
    }

    public static final ReceiveCustomerInfoCallback receiveCustomerInfoCallback(final j81<? super CustomerInfo, sd5> j81Var, final j81<? super PurchasesError, sd5> j81Var2) {
        return new ReceiveCustomerInfoCallback() { // from class: com.revenuecat.purchases.ListenerConversionsKt.receiveCustomerInfoCallback.1
            @Override // com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback
            public void onError(PurchasesError purchasesError) {
                j81<PurchasesError, sd5> j81Var3 = j81Var2;
                if (j81Var3 != null) {
                    j81Var3.invoke(purchasesError);
                }
            }

            @Override // com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback
            public void onReceived(CustomerInfo customerInfo) {
                j81<CustomerInfo, sd5> j81Var3 = j81Var;
                if (j81Var3 != null) {
                    j81Var3.invoke(customerInfo);
                }
            }
        };
    }

    public static final ReceiveOfferingsCallback receiveOfferingsCallback(final j81<? super Offerings, sd5> j81Var, final j81<? super PurchasesError, sd5> j81Var2) {
        return new ReceiveOfferingsCallback() { // from class: com.revenuecat.purchases.ListenerConversionsKt.receiveOfferingsCallback.1
            @Override // com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback
            public void onError(PurchasesError purchasesError) {
                j81Var2.invoke(purchasesError);
            }

            @Override // com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback
            public void onReceived(Offerings offerings) {
                j81Var.invoke(offerings);
            }
        };
    }

    public static final void restorePurchasesWith(Purchases purchases, j81<? super PurchasesError, sd5> j81Var, j81<? super CustomerInfo, sd5> j81Var2) {
        purchases.restorePurchases(receiveCustomerInfoCallback(j81Var2, j81Var));
    }

    public static /* synthetic */ void restorePurchasesWith$default(Purchases purchases, j81 j81Var, j81 j81Var2, int i, Object obj) {
        if ((i & 1) != 0) {
            j81Var = ON_ERROR_STUB;
        }
        restorePurchasesWith(purchases, j81Var, j81Var2);
    }

    public static final void getCustomerInfoWith(Purchases purchases, CacheFetchPolicy cacheFetchPolicy, j81<? super PurchasesError, sd5> j81Var, j81<? super CustomerInfo, sd5> j81Var2) {
        purchases.getCustomerInfo(cacheFetchPolicy, receiveCustomerInfoCallback(j81Var2, j81Var));
    }

    public static final void purchasePackageWith(Purchases purchases, Activity activity, Package r2, x81<? super PurchasesError, ? super Boolean, sd5> x81Var, x81<? super StoreTransaction, ? super CustomerInfo, sd5> x81Var2) {
        purchases.purchasePackage(activity, r2, purchaseCompletedCallback(x81Var2, x81Var));
    }

    public static final void purchaseProductWith(Purchases purchases, Activity activity, StoreProduct storeProduct, UpgradeInfo upgradeInfo, x81<? super PurchasesError, ? super Boolean, sd5> x81Var, x81<? super StoreTransaction, ? super CustomerInfo, sd5> x81Var2) {
        purchases.purchaseProduct(activity, storeProduct, upgradeInfo, productChangeCompletedListener(x81Var2, x81Var));
    }

    public static /* synthetic */ void getCustomerInfoWith$default(Purchases purchases, CacheFetchPolicy cacheFetchPolicy, j81 j81Var, j81 j81Var2, int i, Object obj) {
        if ((i & 2) != 0) {
            j81Var = ON_ERROR_STUB;
        }
        getCustomerInfoWith(purchases, cacheFetchPolicy, j81Var, j81Var2);
    }

    public static /* synthetic */ void purchasePackageWith$default(Purchases purchases, Activity activity, Package r2, x81 x81Var, x81 x81Var2, int i, Object obj) {
        if ((i & 4) != 0) {
            x81Var = ON_PURCHASE_ERROR_STUB;
        }
        purchasePackageWith(purchases, activity, r2, x81Var, x81Var2);
    }

    public static /* synthetic */ void purchaseProductWith$default(Purchases purchases, Activity activity, StoreProduct storeProduct, UpgradeInfo upgradeInfo, x81 x81Var, x81 x81Var2, int i, Object obj) {
        if ((i & 8) != 0) {
            x81Var = ON_PURCHASE_ERROR_STUB;
        }
        purchaseProductWith(purchases, activity, storeProduct, upgradeInfo, x81Var, x81Var2);
    }
}
