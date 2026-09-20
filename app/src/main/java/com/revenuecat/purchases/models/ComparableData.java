package com.revenuecat.purchases.models;

import com.revenuecat.purchases.ProductType;
import defpackage.bl2;
import defpackage.ur1;

/* JADX INFO: loaded from: classes3.dex */
final class ComparableData {
    private final String description;
    private final String freeTrialPeriod;
    private final String iconUrl;
    private final String introductoryPrice;
    private final long introductoryPriceAmountMicros;
    private final int introductoryPriceCycles;
    private final String introductoryPricePeriod;
    private final String originalPrice;
    private final long originalPriceAmountMicros;
    private final String price;
    private final long priceAmountMicros;
    private final String priceCurrencyCode;
    private final String sku;
    private final String subscriptionPeriod;
    private final String title;
    private final ProductType type;

    public ComparableData(String str, ProductType productType, String str2, long j, String str3, String str4, long j2, String str5, String str6, String str7, String str8, String str9, long j3, String str10, int i, String str11) {
        this.sku = str;
        this.type = productType;
        this.price = str2;
        this.priceAmountMicros = j;
        this.priceCurrencyCode = str3;
        this.originalPrice = str4;
        this.originalPriceAmountMicros = j2;
        this.title = str5;
        this.description = str6;
        this.subscriptionPeriod = str7;
        this.freeTrialPeriod = str8;
        this.introductoryPrice = str9;
        this.introductoryPriceAmountMicros = j3;
        this.introductoryPricePeriod = str10;
        this.introductoryPriceCycles = i;
        this.iconUrl = str11;
    }

    public final String component1() {
        return this.sku;
    }

    public final String component10() {
        return this.subscriptionPeriod;
    }

    public final String component11() {
        return this.freeTrialPeriod;
    }

    public final String component12() {
        return this.introductoryPrice;
    }

    public final long component13() {
        return this.introductoryPriceAmountMicros;
    }

    public final String component14() {
        return this.introductoryPricePeriod;
    }

    public final int component15() {
        return this.introductoryPriceCycles;
    }

    public final String component16() {
        return this.iconUrl;
    }

    public final ProductType component2() {
        return this.type;
    }

    public final String component3() {
        return this.price;
    }

    public final long component4() {
        return this.priceAmountMicros;
    }

    public final String component5() {
        return this.priceCurrencyCode;
    }

    public final String component6() {
        return this.originalPrice;
    }

    public final long component7() {
        return this.originalPriceAmountMicros;
    }

    public final String component8() {
        return this.title;
    }

    public final String component9() {
        return this.description;
    }

    public final ComparableData copy(String str, ProductType productType, String str2, long j, String str3, String str4, long j2, String str5, String str6, String str7, String str8, String str9, long j3, String str10, int i, String str11) {
        return new ComparableData(str, productType, str2, j, str3, str4, j2, str5, str6, str7, str8, str9, j3, str10, i, str11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComparableData)) {
            return false;
        }
        ComparableData comparableData = (ComparableData) obj;
        return ur1.a(this.sku, comparableData.sku) && this.type == comparableData.type && ur1.a(this.price, comparableData.price) && this.priceAmountMicros == comparableData.priceAmountMicros && ur1.a(this.priceCurrencyCode, comparableData.priceCurrencyCode) && ur1.a(this.originalPrice, comparableData.originalPrice) && this.originalPriceAmountMicros == comparableData.originalPriceAmountMicros && ur1.a(this.title, comparableData.title) && ur1.a(this.description, comparableData.description) && ur1.a(this.subscriptionPeriod, comparableData.subscriptionPeriod) && ur1.a(this.freeTrialPeriod, comparableData.freeTrialPeriod) && ur1.a(this.introductoryPrice, comparableData.introductoryPrice) && this.introductoryPriceAmountMicros == comparableData.introductoryPriceAmountMicros && ur1.a(this.introductoryPricePeriod, comparableData.introductoryPricePeriod) && this.introductoryPriceCycles == comparableData.introductoryPriceCycles && ur1.a(this.iconUrl, comparableData.iconUrl);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getFreeTrialPeriod() {
        return this.freeTrialPeriod;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getIntroductoryPrice() {
        return this.introductoryPrice;
    }

    public final long getIntroductoryPriceAmountMicros() {
        return this.introductoryPriceAmountMicros;
    }

    public final int getIntroductoryPriceCycles() {
        return this.introductoryPriceCycles;
    }

    public final String getIntroductoryPricePeriod() {
        return this.introductoryPricePeriod;
    }

    public final String getOriginalPrice() {
        return this.originalPrice;
    }

    public final long getOriginalPriceAmountMicros() {
        return this.originalPriceAmountMicros;
    }

    public final String getPrice() {
        return this.price;
    }

    public final long getPriceAmountMicros() {
        return this.priceAmountMicros;
    }

    public final String getPriceCurrencyCode() {
        return this.priceCurrencyCode;
    }

    public final String getSku() {
        return this.sku;
    }

    public final String getSubscriptionPeriod() {
        return this.subscriptionPeriod;
    }

    public final String getTitle() {
        return this.title;
    }

    public final ProductType getType() {
        return this.type;
    }

    public int hashCode() {
        int iA = bl2.a(this.price, (this.type.hashCode() + (this.sku.hashCode() * 31)) * 31, 31);
        long j = this.priceAmountMicros;
        int iA2 = bl2.a(this.priceCurrencyCode, (iA + ((int) (j ^ (j >>> 32)))) * 31, 31);
        String str = this.originalPrice;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j2 = this.originalPriceAmountMicros;
        int iA3 = bl2.a(this.description, bl2.a(this.title, (((iA2 + iHashCode) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31), 31);
        String str2 = this.subscriptionPeriod;
        int iHashCode2 = (iA3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.freeTrialPeriod;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.introductoryPrice;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        long j3 = this.introductoryPriceAmountMicros;
        int i = (((iHashCode3 + iHashCode4) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        String str5 = this.introductoryPricePeriod;
        return this.iconUrl.hashCode() + ((((i + (str5 != null ? str5.hashCode() : 0)) * 31) + this.introductoryPriceCycles) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ComparableData(sku=");
        sb.append(this.sku);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", priceAmountMicros=");
        sb.append(this.priceAmountMicros);
        sb.append(", priceCurrencyCode=");
        sb.append(this.priceCurrencyCode);
        sb.append(", originalPrice=");
        sb.append(this.originalPrice);
        sb.append(", originalPriceAmountMicros=");
        sb.append(this.originalPriceAmountMicros);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", subscriptionPeriod=");
        sb.append(this.subscriptionPeriod);
        sb.append(", freeTrialPeriod=");
        sb.append(this.freeTrialPeriod);
        sb.append(", introductoryPrice=");
        sb.append(this.introductoryPrice);
        sb.append(", introductoryPriceAmountMicros=");
        sb.append(this.introductoryPriceAmountMicros);
        sb.append(", introductoryPricePeriod=");
        sb.append(this.introductoryPricePeriod);
        sb.append(", introductoryPriceCycles=");
        sb.append(this.introductoryPriceCycles);
        sb.append(", iconUrl=");
        return bl2.c(sb, this.iconUrl, ')');
    }

    public ComparableData(StoreProduct storeProduct) {
        this(storeProduct.getSku(), storeProduct.getType(), storeProduct.getPrice(), storeProduct.getPriceAmountMicros(), storeProduct.getPriceCurrencyCode(), storeProduct.getOriginalPrice(), storeProduct.getOriginalPriceAmountMicros(), storeProduct.getTitle(), storeProduct.getDescription(), storeProduct.getSubscriptionPeriod(), storeProduct.getFreeTrialPeriod(), storeProduct.getIntroductoryPrice(), storeProduct.getIntroductoryPriceAmountMicros(), storeProduct.getIntroductoryPricePeriod(), storeProduct.getIntroductoryPriceCycles(), storeProduct.getIconUrl());
    }
}
