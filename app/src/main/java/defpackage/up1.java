package defpackage;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class up1 implements Parcelable {
    public static final Parcelable.Creator<up1> CREATOR = new QnHx();
    public final IntentSender w;
    public final Intent x;
    public final int y;
    public final int z;

    public class QnHx implements Parcelable.Creator<up1> {
        @Override // android.os.Parcelable.Creator
        public final up1 createFromParcel(Parcel parcel) {
            return new up1(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final up1[] newArray(int i) {
            return new up1[i];
        }
    }

    public up1(IntentSender intentSender, Intent intent, int i, int i2) {
        this.w = intentSender;
        this.x = intent;
        this.y = i;
        this.z = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.w, i);
        parcel.writeParcelable(this.x, i);
        parcel.writeInt(this.y);
        parcel.writeInt(this.z);
    }

    public up1(Parcel parcel) {
        this.w = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.x = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.y = parcel.readInt();
        this.z = parcel.readInt();
    }
}
