package defpackage;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class com9Fixed implements Parcelable {
    public static final Parcelable.Creator<com9Fixed> CREATOR = new QnHx();
    public final int w;
    public final Intent x;

    public class QnHx implements Parcelable.Creator<com9Fixed> {
        @Override // android.os.Parcelable.Creator
        public final com9Fixed createFromParcel(Parcel parcel) {
            return new com9Fixed(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final com9Fixed[] newArray(int i) {
            return new com9Fixed[i];
        }
    }

    public com9Fixed(Intent intent, int i) {
        this.w = i;
        this.x = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String strValueOf;
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.w;
        if (i != -1) {
            strValueOf = i != 0 ? String.valueOf(i) : "RESULT_CANCELED";
        } else {
            strValueOf = "RESULT_OK";
        }
        sb.append(strValueOf);
        sb.append(", data=");
        sb.append(this.x);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.w);
        Intent intent = this.x;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }

    public com9Fixed(Parcel parcel) {
        this.w = parcel.readInt();
        this.x = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
