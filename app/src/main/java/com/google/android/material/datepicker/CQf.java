package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class CQf implements com.google.android.material.datepicker.QnHx.F1 {
    public static final Parcelable.Creator<CQf> CREATOR = new QnHx();
    public final long w;

    public static class QnHx implements Parcelable.Creator<CQf> {
        @Override // android.os.Parcelable.Creator
        public final CQf createFromParcel(Parcel parcel) {
            return new CQf(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final CQf[] newArray(int i) {
            return new CQf[i];
        }
    }

    public CQf(long j) {
        this.w = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CQf) && this.w == ((CQf) obj).w;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.w)});
    }

    @Override // com.google.android.material.datepicker.QnHx.F1
    public final boolean p(long j) {
        return j >= this.w;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.w);
    }
}
