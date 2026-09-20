package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class vu4 implements Parcelable {
    public static final Parcelable.Creator<vu4> CREATOR = new QnHx();
    public final int w;

    public static final class QnHx implements Parcelable.Creator<vu4> {
        @Override // android.os.Parcelable.Creator
        public final vu4 createFromParcel(Parcel parcel) {
            return new vu4(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final vu4[] newArray(int i) {
            return new vu4[i];
        }
    }

    public vu4(int i) {
        this.w = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.w);
    }
}
