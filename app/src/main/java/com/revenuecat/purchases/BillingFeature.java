package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes3.dex */
public enum BillingFeature {
    SUBSCRIPTIONS("subscriptions"),
    SUBSCRIPTIONS_UPDATE("subscriptionsUpdate"),
    IN_APP_ITEMS_ON_VR("inAppItemsOnVr"),
    SUBSCRIPTIONS_ON_VR("subscriptionsOnVr"),
    PRICE_CHANGE_CONFIRMATION("priceChangeConfirmation");

    private final String playBillingClientName;

    BillingFeature(String str) {
        this.playBillingClientName = str;
    }

    public final String getPlayBillingClientName() {
        return this.playBillingClientName;
    }
}
