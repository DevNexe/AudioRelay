package com.revenuecat.purchases;

import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.models.RawDataContainer;
import com.revenuecat.purchases.parceler.JSONObjectParceler;
import defpackage.bl2;
import defpackage.ur1;
import java.util.Date;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class EntitlementInfo implements Parcelable, RawDataContainer<JSONObject> {
    public static final Parcelable.Creator<EntitlementInfo> CREATOR = new Creator();
    private final Date billingIssueDetectedAt;
    private final Date expirationDate;
    private final String identifier;
    private final boolean isActive;
    private final boolean isSandbox;
    private final JSONObject jsonObject;
    private final Date latestPurchaseDate;
    private final Date originalPurchaseDate;
    private final OwnershipType ownershipType;
    private final PeriodType periodType;
    private final String productIdentifier;
    private final Store store;
    private final Date unsubscribeDetectedAt;
    private final boolean willRenew;

    public static final class Creator implements Parcelable.Creator<EntitlementInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EntitlementInfo createFromParcel(Parcel parcel) {
            return new EntitlementInfo(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, PeriodType.valueOf(parcel.readString()), (Date) parcel.readSerializable(), (Date) parcel.readSerializable(), (Date) parcel.readSerializable(), Store.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0, (Date) parcel.readSerializable(), (Date) parcel.readSerializable(), OwnershipType.valueOf(parcel.readString()), JSONObjectParceler.INSTANCE.create(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EntitlementInfo[] newArray(int i) {
            return new EntitlementInfo[i];
        }
    }

    public EntitlementInfo(String str, boolean z, boolean z2, PeriodType periodType, Date date, Date date2, Date date3, Store store, String str2, boolean z3, Date date4, Date date5, OwnershipType ownershipType, JSONObject jSONObject) {
        this.identifier = str;
        this.isActive = z;
        this.willRenew = z2;
        this.periodType = periodType;
        this.latestPurchaseDate = date;
        this.originalPurchaseDate = date2;
        this.expirationDate = date3;
        this.store = store;
        this.productIdentifier = str2;
        this.isSandbox = z3;
        this.unsubscribeDetectedAt = date4;
        this.billingIssueDetectedAt = date5;
        this.ownershipType = ownershipType;
        this.jsonObject = jSONObject;
    }

    public static /* synthetic */ void getJsonObject$annotations() {
    }

    public static /* synthetic */ void getRawData$annotations() {
    }

    public final String component1() {
        return this.identifier;
    }

    public final boolean component10() {
        return this.isSandbox;
    }

    public final Date component11() {
        return this.unsubscribeDetectedAt;
    }

    public final Date component12() {
        return this.billingIssueDetectedAt;
    }

    public final OwnershipType component13() {
        return this.ownershipType;
    }

    public final JSONObject component14() {
        return this.jsonObject;
    }

    public final boolean component2() {
        return this.isActive;
    }

    public final boolean component3() {
        return this.willRenew;
    }

    public final PeriodType component4() {
        return this.periodType;
    }

    public final Date component5() {
        return this.latestPurchaseDate;
    }

    public final Date component6() {
        return this.originalPurchaseDate;
    }

    public final Date component7() {
        return this.expirationDate;
    }

    public final Store component8() {
        return this.store;
    }

    public final String component9() {
        return this.productIdentifier;
    }

    public final EntitlementInfo copy(String str, boolean z, boolean z2, PeriodType periodType, Date date, Date date2, Date date3, Store store, String str2, boolean z3, Date date4, Date date5, OwnershipType ownershipType, JSONObject jSONObject) {
        return new EntitlementInfo(str, z, z2, periodType, date, date2, date3, store, str2, z3, date4, date5, ownershipType, jSONObject);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ur1.a(EntitlementInfo.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.revenuecat.purchases.EntitlementInfo");
        }
        EntitlementInfo entitlementInfo = (EntitlementInfo) obj;
        return ur1.a(this.identifier, entitlementInfo.identifier) && this.isActive == entitlementInfo.isActive && this.willRenew == entitlementInfo.willRenew && this.periodType == entitlementInfo.periodType && ur1.a(this.latestPurchaseDate, entitlementInfo.latestPurchaseDate) && ur1.a(this.originalPurchaseDate, entitlementInfo.originalPurchaseDate) && ur1.a(this.expirationDate, entitlementInfo.expirationDate) && this.store == entitlementInfo.store && ur1.a(this.productIdentifier, entitlementInfo.productIdentifier) && this.isSandbox == entitlementInfo.isSandbox && ur1.a(this.unsubscribeDetectedAt, entitlementInfo.unsubscribeDetectedAt) && ur1.a(this.billingIssueDetectedAt, entitlementInfo.billingIssueDetectedAt) && this.ownershipType == entitlementInfo.ownershipType;
    }

    public final Date getBillingIssueDetectedAt() {
        return this.billingIssueDetectedAt;
    }

    public final Date getExpirationDate() {
        return this.expirationDate;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final JSONObject getJsonObject() {
        return this.jsonObject;
    }

    public final Date getLatestPurchaseDate() {
        return this.latestPurchaseDate;
    }

    public final Date getOriginalPurchaseDate() {
        return this.originalPurchaseDate;
    }

    public final OwnershipType getOwnershipType() {
        return this.ownershipType;
    }

    public final PeriodType getPeriodType() {
        return this.periodType;
    }

    public final String getProductIdentifier() {
        return this.productIdentifier;
    }

    public final Store getStore() {
        return this.store;
    }

    public final Date getUnsubscribeDetectedAt() {
        return this.unsubscribeDetectedAt;
    }

    public final boolean getWillRenew() {
        return this.willRenew;
    }

    public int hashCode() {
        int iHashCode = (this.originalPurchaseDate.hashCode() + ((this.latestPurchaseDate.hashCode() + ((this.periodType.hashCode() + (((((this.identifier.hashCode() * 31) + (this.isActive ? 1231 : 1237)) * 31) + (this.willRenew ? 1231 : 1237)) * 31)) * 31)) * 31)) * 31;
        Date date = this.expirationDate;
        int iA = (bl2.a(this.productIdentifier, (this.store.hashCode() + ((iHashCode + (date != null ? date.hashCode() : 0)) * 31)) * 31, 31) + (this.isSandbox ? 1231 : 1237)) * 31;
        Date date2 = this.unsubscribeDetectedAt;
        int iHashCode2 = (iA + (date2 != null ? date2.hashCode() : 0)) * 31;
        Date date3 = this.billingIssueDetectedAt;
        return this.ownershipType.hashCode() + ((iHashCode2 + (date3 != null ? date3.hashCode() : 0)) * 31);
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final boolean isSandbox() {
        return this.isSandbox;
    }

    public String toString() {
        return "EntitlementInfo(identifier='" + this.identifier + "', isActive=" + this.isActive + ", willRenew=" + this.willRenew + ", periodType=" + this.periodType + ", latestPurchaseDate=" + this.latestPurchaseDate + ", originalPurchaseDate=" + this.originalPurchaseDate + ", expirationDate=" + this.expirationDate + ", store=" + this.store + ", productIdentifier='" + this.productIdentifier + "', isSandbox=" + this.isSandbox + ", unsubscribeDetectedAt=" + this.unsubscribeDetectedAt + ", billingIssueDetectedAt=" + this.billingIssueDetectedAt + ", ownershipType=" + this.ownershipType + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.identifier);
        parcel.writeInt(this.isActive ? 1 : 0);
        parcel.writeInt(this.willRenew ? 1 : 0);
        parcel.writeString(this.periodType.name());
        parcel.writeSerializable(this.latestPurchaseDate);
        parcel.writeSerializable(this.originalPurchaseDate);
        parcel.writeSerializable(this.expirationDate);
        parcel.writeString(this.store.name());
        parcel.writeString(this.productIdentifier);
        parcel.writeInt(this.isSandbox ? 1 : 0);
        parcel.writeSerializable(this.unsubscribeDetectedAt);
        parcel.writeSerializable(this.billingIssueDetectedAt);
        parcel.writeString(this.ownershipType.name());
        JSONObjectParceler.INSTANCE.write(this.jsonObject, parcel, i);
    }

    @Override // com.revenuecat.purchases.models.RawDataContainer
    public JSONObject getRawData() {
        return this.jsonObject;
    }
}
