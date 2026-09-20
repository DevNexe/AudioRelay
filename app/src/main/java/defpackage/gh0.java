package defpackage;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class gh0 implements Parcelable {
    public static final Parcelable.Creator<gh0> CREATOR = new QnHx();
    public final int w;

    public static final class QnHx implements Parcelable.Creator<gh0> {
        @Override // android.os.Parcelable.Creator
        public final gh0 createFromParcel(Parcel parcel) {
            return new gh0(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final gh0[] newArray(int i) {
            return new gh0[i];
        }
    }

    public gh0(int i) {
        this.w = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gh0) && this.w == ((gh0) obj).w;
    }

    public final int hashCode() {
        return this.w;
    }

    public final String toString() {
        return qc0.a(new StringBuilder("DefaultLazyKey(index="), this.w, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.w);
    }
}
