package com.revenuecat.purchases.strings;

/* JADX INFO: loaded from: classes3.dex */
public final class BillingStrings {
    public static final String BILLING_CLIENT_DISCONNECTED = "Billing is disconnected and purchase methods won't work. Stacktrace: %s";
    public static final String BILLING_CLIENT_ENDING = "Ending connection for %s";
    public static final String BILLING_CLIENT_ERROR = "Billing Service Setup finished with error code: %s";
    public static final String BILLING_CLIENT_RETRY = "Retrying BillingClient connection after backoff of %s milliseconds.";
    public static final String BILLING_CLIENT_STARTING = "Starting connection for %s";
    public static final String BILLING_INTENT_FAILED = "Failed to launch billing intent. %s";
    public static final String BILLING_PURCHASE_HISTORY_RECORD_MORE_THAN_ONE_SKU = "There's more than one sku in the PurchaseHistoryRecord, but only one will be used.";
    public static final String BILLING_PURCHASE_MORE_THAN_ONE_SKU = "There's more than one sku in the PurchaseHistoryRecord, but only one will be used.";
    public static final String BILLING_SERVICE_DISCONNECTED = "Billing Service disconnected for %s";
    public static final String BILLING_SERVICE_SETUP_FINISHED = "Billing Service Setup finished for %s";
    public static final String BILLING_UNAVAILABLE = "Billing is not available in this device. %s";
    public static final String BILLING_WRAPPER_PURCHASES_ERROR = "BillingWrapper purchases failed to update: %s";
    public static final String BILLING_WRAPPER_PURCHASES_UPDATED = "BillingWrapper purchases updated: %s";
    public static final String CANNOT_CALL_CAN_MAKE_PAYMENTS = "canMakePayments requires the Google Play Store. Skipping any checks and returning true.";
    public static final BillingStrings INSTANCE = new BillingStrings();
    public static final String NULL_ACTIVITY_INTENT = "Activity passed into launchBillingFlow has a null intent, which may cause a crash. See https://github.com/RevenueCat/purchases-android/issues/381 for more information.";

    private BillingStrings() {
    }
}
