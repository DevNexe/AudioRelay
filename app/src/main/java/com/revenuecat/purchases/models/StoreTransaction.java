package com.revenuecat.purchases.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.parceler.JSONObjectParceler;
import defpackage.bl2;
import defpackage.qg5;
import defpackage.ur1;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class StoreTransaction implements Parcelable {
    public static final Parcelable.Creator<StoreTransaction> CREATOR = new Creator();
    private final Boolean isAutoRenewing;
    private final String marketplace;
    private final String orderId;
    private final JSONObject originalJson;
    private final String presentedOfferingIdentifier;
    private final PurchaseState purchaseState;
    private final long purchaseTime;
    private final String purchaseToken;
    private final PurchaseType purchaseType;
    private final String signature;
    private final List<String> skus;
    private final String storeUserID;
    private final ProductType type;

    public static final class Creator implements Parcelable.Creator<StoreTransaction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StoreTransaction createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            ProductType productTypeValueOf = ProductType.valueOf(parcel.readString());
            long j = parcel.readLong();
            String string2 = parcel.readString();
            PurchaseState purchaseStateValueOf = PurchaseState.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new StoreTransaction(string, arrayListCreateStringArrayList, productTypeValueOf, j, string2, purchaseStateValueOf, boolValueOf, parcel.readString(), JSONObjectParceler.INSTANCE.create(parcel), parcel.readString(), parcel.readString(), PurchaseType.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StoreTransaction[] newArray(int i) {
            return new StoreTransaction[i];
        }
    }

    public StoreTransaction(String str, List<String> list, ProductType productType, long j, String str2, PurchaseState purchaseState, Boolean bool, String str3, JSONObject jSONObject, String str4, String str5, PurchaseType purchaseType, String str6) {
        this.orderId = str;
        this.skus = list;
        this.type = productType;
        this.purchaseTime = j;
        this.purchaseToken = str2;
        this.purchaseState = purchaseState;
        this.isAutoRenewing = bool;
        this.signature = str3;
        this.originalJson = jSONObject;
        this.presentedOfferingIdentifier = str4;
        this.storeUserID = str5;
        this.purchaseType = purchaseType;
        this.marketplace = str6;
    }

    public static /* synthetic */ void getSku$annotations() {
    }

    public final String component1() {
        return this.orderId;
    }

    public final String component10() {
        return this.presentedOfferingIdentifier;
    }

    public final String component11() {
        return this.storeUserID;
    }

    public final PurchaseType component12() {
        return this.purchaseType;
    }

    public final String component13() {
        return this.marketplace;
    }

    public final List<String> component2() {
        return this.skus;
    }

    public final ProductType component3() {
        return this.type;
    }

    public final long component4() {
        return this.purchaseTime;
    }

    public final String component5() {
        return this.purchaseToken;
    }

    public final PurchaseState component6() {
        return this.purchaseState;
    }

    public final Boolean component7() {
        return this.isAutoRenewing;
    }

    public final String component8() {
        return this.signature;
    }

    public final JSONObject component9() {
        return this.originalJson;
    }

    public final StoreTransaction copy(String str, List<String> list, ProductType productType, long j, String str2, PurchaseState purchaseState, Boolean bool, String str3, JSONObject jSONObject, String str4, String str5, PurchaseType purchaseType, String str6) {
        return new StoreTransaction(str, list, productType, j, str2, purchaseState, bool, str3, jSONObject, str4, str5, purchaseType, str6);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreTransaction)) {
            return false;
        }
        StoreTransaction storeTransaction = (StoreTransaction) obj;
        return ur1.a(this.orderId, storeTransaction.orderId) && ur1.a(this.skus, storeTransaction.skus) && this.type == storeTransaction.type && this.purchaseTime == storeTransaction.purchaseTime && ur1.a(this.purchaseToken, storeTransaction.purchaseToken) && this.purchaseState == storeTransaction.purchaseState && ur1.a(this.isAutoRenewing, storeTransaction.isAutoRenewing) && ur1.a(this.signature, storeTransaction.signature) && ur1.a(this.originalJson, storeTransaction.originalJson) && ur1.a(this.presentedOfferingIdentifier, storeTransaction.presentedOfferingIdentifier) && ur1.a(this.storeUserID, storeTransaction.storeUserID) && this.purchaseType == storeTransaction.purchaseType && ur1.a(this.marketplace, storeTransaction.marketplace);
    }

    public final String getMarketplace() {
        return this.marketplace;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final JSONObject getOriginalJson() {
        return this.originalJson;
    }

    public final String getPresentedOfferingIdentifier() {
        return this.presentedOfferingIdentifier;
    }

    public final PurchaseState getPurchaseState() {
        return this.purchaseState;
    }

    public final long getPurchaseTime() {
        return this.purchaseTime;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final PurchaseType getPurchaseType() {
        return this.purchaseType;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final String getSku() {
        return this.skus.get(0);
    }

    public final List<String> getSkus() {
        return this.skus;
    }

    public final String getStoreUserID() {
        return this.storeUserID;
    }

    public final ProductType getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.orderId;
        int iHashCode = (this.type.hashCode() + qg5.a(this.skus, (str == null ? 0 : str.hashCode()) * 31, 31)) * 31;
        long j = this.purchaseTime;
        int iHashCode2 = (this.purchaseState.hashCode() + bl2.a(this.purchaseToken, (iHashCode + ((int) (j ^ (j >>> 32)))) * 31, 31)) * 31;
        Boolean bool = this.isAutoRenewing;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.signature;
        int iHashCode4 = (this.originalJson.hashCode() + ((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.presentedOfferingIdentifier;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.storeUserID;
        int iHashCode6 = (this.purchaseType.hashCode() + ((iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
        String str5 = this.marketplace;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public final Boolean isAutoRenewing() {
        return this.isAutoRenewing;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StoreTransaction(orderId=");
        sb.append(this.orderId);
        sb.append(", skus=");
        sb.append(this.skus);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", purchaseTime=");
        sb.append(this.purchaseTime);
        sb.append(", purchaseToken=");
        sb.append(this.purchaseToken);
        sb.append(", purchaseState=");
        sb.append(this.purchaseState);
        sb.append(", isAutoRenewing=");
        sb.append(this.isAutoRenewing);
        sb.append(", signature=");
        sb.append(this.signature);
        sb.append(", originalJson=");
        sb.append(this.originalJson);
        sb.append(", presentedOfferingIdentifier=");
        sb.append(this.presentedOfferingIdentifier);
        sb.append(", storeUserID=");
        sb.append(this.storeUserID);
        sb.append(", purchaseType=");
        sb.append(this.purchaseType);
        sb.append(", marketplace=");
        return bl2.c(sb, this.marketplace, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        parcel.writeString(this.orderId);
        parcel.writeStringList(this.skus);
        parcel.writeString(this.type.name());
        parcel.writeLong(this.purchaseTime);
        parcel.writeString(this.purchaseToken);
        parcel.writeString(this.purchaseState.name());
        Boolean bool = this.isAutoRenewing;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
        parcel.writeString(this.signature);
        JSONObjectParceler.INSTANCE.write(this.originalJson, (Parcel) parcel, i);
        parcel.writeString(this.presentedOfferingIdentifier);
        parcel.writeString(this.storeUserID);
        parcel.writeString(this.purchaseType.name());
        parcel.writeString(this.marketplace);
    }
}
