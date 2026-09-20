package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class tv0 extends CQf {
    public static final Parcelable.Creator<tv0> CREATOR = new QnHx();
    public final ok4<String, Bundle> y;

    public static class QnHx implements Parcelable.ClassLoaderCreator<tv0> {
        @Override // android.os.Parcelable.ClassLoaderCreator
        public final tv0 createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new tv0(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new tv0[i];
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return new tv0(parcel, null);
        }
    }

    public tv0() {
        throw null;
    }

    public tv0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i = parcel.readInt();
        String[] strArr = new String[i];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[i];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.y = new ok4<>(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.y.put(strArr[i2], bundleArr[i2]);
        }
    }

    public final String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.y + "}";
    }

    @Override // defpackage.CQf, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.w, i);
        ok4<String, Bundle> ok4Var = this.y;
        int i2 = ok4Var.y;
        parcel.writeInt(i2);
        String[] strArr = new String[i2];
        Bundle[] bundleArr = new Bundle[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = ok4Var.i(i3);
            bundleArr[i3] = ok4Var.k(i3);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
