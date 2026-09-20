package com.revenuecat.purchases;

import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.models.StoreProduct;
import defpackage.bl2;
import defpackage.ur1;

/* JADX INFO: loaded from: classes3.dex */
public final class Package implements Parcelable {
    public static final Parcelable.Creator<Package> CREATOR = new Creator();
    private final String identifier;
    private final String offering;
    private final PackageType packageType;
    private final StoreProduct product;

    public static final class Creator implements Parcelable.Creator<Package> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Package createFromParcel(Parcel parcel) {
            return new Package(parcel.readString(), PackageType.valueOf(parcel.readString()), StoreProduct.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Package[] newArray(int i) {
            return new Package[i];
        }
    }

    public Package(String str, PackageType packageType, StoreProduct storeProduct, String str2) {
        this.identifier = str;
        this.packageType = packageType;
        this.product = storeProduct;
        this.offering = str2;
    }

    public static /* synthetic */ Package copy$default(Package r0, String str, PackageType packageType, StoreProduct storeProduct, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = r0.identifier;
        }
        if ((i & 2) != 0) {
            packageType = r0.packageType;
        }
        if ((i & 4) != 0) {
            storeProduct = r0.product;
        }
        if ((i & 8) != 0) {
            str2 = r0.offering;
        }
        return r0.copy(str, packageType, storeProduct, str2);
    }

    public final String component1() {
        return this.identifier;
    }

    public final PackageType component2() {
        return this.packageType;
    }

    public final StoreProduct component3() {
        return this.product;
    }

    public final String component4() {
        return this.offering;
    }

    public final Package copy(String str, PackageType packageType, StoreProduct storeProduct, String str2) {
        return new Package(str, packageType, storeProduct, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Package)) {
            return false;
        }
        Package r5 = (Package) obj;
        return ur1.a(this.identifier, r5.identifier) && this.packageType == r5.packageType && ur1.a(this.product, r5.product) && ur1.a(this.offering, r5.offering);
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getOffering() {
        return this.offering;
    }

    public final PackageType getPackageType() {
        return this.packageType;
    }

    public final StoreProduct getProduct() {
        return this.product;
    }

    public int hashCode() {
        return this.offering.hashCode() + ((this.product.hashCode() + ((this.packageType.hashCode() + (this.identifier.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Package(identifier=");
        sb.append(this.identifier);
        sb.append(", packageType=");
        sb.append(this.packageType);
        sb.append(", product=");
        sb.append(this.product);
        sb.append(", offering=");
        return bl2.c(sb, this.offering, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.identifier);
        parcel.writeString(this.packageType.name());
        this.product.writeToParcel(parcel, i);
        parcel.writeString(this.offering);
    }
}
