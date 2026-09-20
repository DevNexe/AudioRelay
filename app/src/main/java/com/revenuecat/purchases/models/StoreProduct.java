package com.revenuecat.purchases.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.parceler.JSONObjectParceler;
import defpackage.ur1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class StoreProduct implements Parcelable {
    public static final Parcelable.Creator<StoreProduct> CREATOR = new Creator();
    private final String description;
    private final String freeTrialPeriod;
    private final String iconUrl;
    private final String introductoryPrice;
    private final long introductoryPriceAmountMicros;
    private final int introductoryPriceCycles;
    private final String introductoryPricePeriod;
    private final JSONObject originalJson;
    private final String originalPrice;
    private final long originalPriceAmountMicros;
    private final String price;
    private final long priceAmountMicros;
    private final String priceCurrencyCode;
    private final String sku;
    private final String subscriptionPeriod;
    private final String title;
    private final ProductType type;

    public static final class Creator implements Parcelable.Creator<StoreProduct> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StoreProduct createFromParcel(Parcel parcel) {
            return new StoreProduct(parcel.readString(), ProductType.valueOf(parcel.readString()), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readString(), JSONObjectParceler.INSTANCE.create(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StoreProduct[] newArray(int i) {
            return new StoreProduct[i];
        }
    }

    public StoreProduct(String str, ProductType productType, String str2, long j, String str3, String str4, long j2, String str5, String str6, String str7, String str8, String str9, long j3, String str10, int i, String str11, JSONObject jSONObject) {
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
        this.originalJson = jSONObject;
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

    public final JSONObject component17() {
        return this.originalJson;
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

    public final StoreProduct copy(String str, ProductType productType, String str2, long j, String str3, String str4, long j2, String str5, String str6, String str7, String str8, String str9, long j3, String str10, int i, String str11, JSONObject jSONObject) {
        return new StoreProduct(str, productType, str2, j, str3, str4, j2, str5, str6, str7, str8, str9, j3, str10, i, str11, jSONObject);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof StoreProduct) && ur1.a(new ComparableData(this), new ComparableData((StoreProduct) obj));
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

    public final JSONObject getOriginalJson() {
        return this.originalJson;
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
        return new ComparableData(this).hashCode();
    }

    public String toString() {
        return "StoreProduct(sku=" + this.sku + ", type=" + this.type + ", price=" + this.price + ", priceAmountMicros=" + this.priceAmountMicros + ", priceCurrencyCode=" + this.priceCurrencyCode + ", originalPrice=" + this.originalPrice + ", originalPriceAmountMicros=" + this.originalPriceAmountMicros + ", title=" + this.title + ", description=" + this.description + ", subscriptionPeriod=" + this.subscriptionPeriod + ", freeTrialPeriod=" + this.freeTrialPeriod + ", introductoryPrice=" + this.introductoryPrice + ", introductoryPriceAmountMicros=" + this.introductoryPriceAmountMicros + ", introductoryPricePeriod=" + this.introductoryPricePeriod + ", introductoryPriceCycles=" + this.introductoryPriceCycles + ", iconUrl=" + this.iconUrl + ", originalJson=" + this.originalJson + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.sku);
        parcel.writeString(this.type.name());
        parcel.writeString(this.price);
        parcel.writeLong(this.priceAmountMicros);
        parcel.writeString(this.priceCurrencyCode);
        parcel.writeString(this.originalPrice);
        parcel.writeLong(this.originalPriceAmountMicros);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.subscriptionPeriod);
        parcel.writeString(this.freeTrialPeriod);
        parcel.writeString(this.introductoryPrice);
        parcel.writeLong(this.introductoryPriceAmountMicros);
        parcel.writeString(this.introductoryPricePeriod);
        parcel.writeInt(this.introductoryPriceCycles);
        parcel.writeString(this.iconUrl);
        JSONObjectParceler.INSTANCE.write(this.originalJson, parcel, i);
    }
}
