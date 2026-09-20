package com.revenuecat.purchases.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import defpackage.bl2;
import defpackage.ur1;
import java.util.Date;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class Transaction implements Parcelable {
    public static final Parcelable.Creator<Transaction> CREATOR = new Creator();
    private final String productId;
    private final String productIdentifier;
    private final Date purchaseDate;
    private final String revenuecatId;
    private final String transactionIdentifier;

    public static final class Creator implements Parcelable.Creator<Transaction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Transaction createFromParcel(Parcel parcel) {
            return new Transaction(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Date) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Transaction[] newArray(int i) {
            return new Transaction[i];
        }
    }

    public Transaction(String str, String str2, String str3, String str4, Date date) {
        this.transactionIdentifier = str;
        this.revenuecatId = str2;
        this.productIdentifier = str3;
        this.productId = str4;
        this.purchaseDate = date;
    }

    public static /* synthetic */ Transaction copy$default(Transaction transaction, String str, String str2, String str3, String str4, Date date, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transaction.transactionIdentifier;
        }
        if ((i & 2) != 0) {
            str2 = transaction.revenuecatId;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = transaction.productIdentifier;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = transaction.productId;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            date = transaction.purchaseDate;
        }
        return transaction.copy(str, str5, str6, str7, date);
    }

    public static /* synthetic */ void getProductId$annotations() {
    }

    public static /* synthetic */ void getRevenuecatId$annotations() {
    }

    public final String component1() {
        return this.transactionIdentifier;
    }

    public final String component2() {
        return this.revenuecatId;
    }

    public final String component3() {
        return this.productIdentifier;
    }

    public final String component4() {
        return this.productId;
    }

    public final Date component5() {
        return this.purchaseDate;
    }

    public final Transaction copy(String str, String str2, String str3, String str4, Date date) {
        return new Transaction(str, str2, str3, str4, date);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Transaction)) {
            return false;
        }
        Transaction transaction = (Transaction) obj;
        return ur1.a(this.transactionIdentifier, transaction.transactionIdentifier) && ur1.a(this.revenuecatId, transaction.revenuecatId) && ur1.a(this.productIdentifier, transaction.productIdentifier) && ur1.a(this.productId, transaction.productId) && ur1.a(this.purchaseDate, transaction.purchaseDate);
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getProductIdentifier() {
        return this.productIdentifier;
    }

    public final Date getPurchaseDate() {
        return this.purchaseDate;
    }

    public final String getRevenuecatId() {
        return this.revenuecatId;
    }

    public final String getTransactionIdentifier() {
        return this.transactionIdentifier;
    }

    public int hashCode() {
        return this.purchaseDate.hashCode() + bl2.a(this.productId, bl2.a(this.productIdentifier, bl2.a(this.revenuecatId, this.transactionIdentifier.hashCode() * 31, 31), 31), 31);
    }

    public String toString() {
        return "Transaction(transactionIdentifier=" + this.transactionIdentifier + ", revenuecatId=" + this.revenuecatId + ", productIdentifier=" + this.productIdentifier + ", productId=" + this.productId + ", purchaseDate=" + this.purchaseDate + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.transactionIdentifier);
        parcel.writeString(this.revenuecatId);
        parcel.writeString(this.productIdentifier);
        parcel.writeString(this.productId);
        parcel.writeSerializable(this.purchaseDate);
    }

    public Transaction(String str, JSONObject jSONObject) {
        this(jSONObject.getString(FacebookAdapter.KEY_ID), jSONObject.getString(FacebookAdapter.KEY_ID), str, str, JSONObjectExtensionsKt.getDate(jSONObject, "purchase_date"));
    }
}
