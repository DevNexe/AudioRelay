package com.revenuecat.purchases.common;

import com.revenuecat.purchases.models.StoreProduct;
import defpackage.bl2;
import defpackage.kg0;
import defpackage.ur1;
import defpackage.wu;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ReceiptInfo {
    private final String currency;
    private final String duration;
    private final String introDuration;
    private final String offeringIdentifier;
    private final Double price;
    private final List<String> productIDs;
    private final StoreProduct storeProduct;
    private final String trialDuration;

    /* JADX WARN: Code duplicated, block: B:12:0x0024  */
    /* JADX WARN: Code duplicated, block: B:23:0x003b  */
    public ReceiptInfo(List<String> list, String str, StoreProduct storeProduct, Double d, String str2) {
        String subscriptionPeriod;
        String introductoryPricePeriod;
        String freeTrialPeriod;
        this.productIDs = list;
        this.offeringIdentifier = str;
        this.storeProduct = storeProduct;
        this.price = d;
        this.currency = str2;
        String str3 = null;
        if (storeProduct != null && (subscriptionPeriod = storeProduct.getSubscriptionPeriod()) != null) {
            subscriptionPeriod = subscriptionPeriod.length() == 0 ? null : subscriptionPeriod;
        }
        this.duration = subscriptionPeriod;
        if (storeProduct != null && (introductoryPricePeriod = storeProduct.getIntroductoryPricePeriod()) != null) {
            introductoryPricePeriod = introductoryPricePeriod.length() == 0 ? null : introductoryPricePeriod;
        }
        this.introDuration = introductoryPricePeriod;
        if (storeProduct != null && (freeTrialPeriod = storeProduct.getFreeTrialPeriod()) != null) {
            if (!(freeTrialPeriod.length() == 0)) {
                str3 = freeTrialPeriod;
            }
        }
        this.trialDuration = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ur1.a(ReceiptInfo.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.revenuecat.purchases.common.ReceiptInfo");
        }
        ReceiptInfo receiptInfo = (ReceiptInfo) obj;
        if (!ur1.a(this.productIDs, receiptInfo.productIDs) || !ur1.a(this.offeringIdentifier, receiptInfo.offeringIdentifier)) {
            return false;
        }
        Double d = this.price;
        Double d2 = receiptInfo.price;
        return (d != null ? !(d2 == null || (d.doubleValue() > d2.doubleValue() ? 1 : (d.doubleValue() == d2.doubleValue() ? 0 : -1)) != 0) : d2 == null) && ur1.a(this.currency, receiptInfo.currency) && ur1.a(this.duration, receiptInfo.duration) && ur1.a(this.introDuration, receiptInfo.introDuration) && ur1.a(this.trialDuration, receiptInfo.trialDuration);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final String getIntroDuration() {
        return this.introDuration;
    }

    public final String getOfferingIdentifier() {
        return this.offeringIdentifier;
    }

    public final Double getPrice() {
        return this.price;
    }

    public final List<String> getProductIDs() {
        return this.productIDs;
    }

    public final StoreProduct getStoreProduct() {
        return this.storeProduct;
    }

    public final String getTrialDuration() {
        return this.trialDuration;
    }

    public int hashCode() {
        int iHashCode = this.productIDs.hashCode() * 31;
        String str = this.offeringIdentifier;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        StoreProduct storeProduct = this.storeProduct;
        return iHashCode2 + (storeProduct != null ? storeProduct.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ReceiptInfo(productIDs='");
        sb.append(wu.M0(this.productIDs, null, null, null, null, 63));
        sb.append("', offeringIdentifier=");
        sb.append(this.offeringIdentifier);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", currency=");
        sb.append(this.currency);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", introDuration=");
        sb.append(this.introDuration);
        sb.append(", trialDuration=");
        return bl2.c(sb, this.trialDuration, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ReceiptInfo(List list, String str, StoreProduct storeProduct, Double d, String str2, int i, kg0 kg0Var) {
        String str3 = (i & 2) != 0 ? null : str;
        StoreProduct storeProduct2 = (i & 4) != 0 ? null : storeProduct;
        this(list, str3, storeProduct2, (i & 8) != 0 ? storeProduct2 != null ? Double.valueOf(storeProduct2.getPriceAmountMicros() / 1000000.0d) : null : d, (i & 16) != 0 ? storeProduct2 != null ? storeProduct2.getPriceCurrencyCode() : null : str2);
    }
}
