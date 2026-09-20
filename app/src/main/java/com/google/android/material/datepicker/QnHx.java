package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.AdError;
import defpackage.lf5;
import defpackage.uq2;
import defpackage.zg2;
import java.util.Arrays;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes3.dex */
public final class QnHx implements Parcelable {
    public static final Parcelable.Creator<QnHx> CREATOR = new C0080QnHx();
    public final int A;
    public final int B;
    public final zg2 w;
    public final zg2 x;
    public final F1 y;
    public final zg2 z;

    public static final class CQf {
        public static final long e = lf5.a(zg2.a(1900, 0).B);
        public static final long f = lf5.a(zg2.a(AdError.BROKEN_MEDIA_ERROR_CODE, 11).B);
        public final long a;
        public final long b;
        public Long c;
        public final F1 d;

        public CQf(QnHx qnHx) {
            this.a = e;
            this.b = f;
            this.d = new com.google.android.material.datepicker.CQf(Long.MIN_VALUE);
            this.a = qnHx.w.B;
            this.b = qnHx.x.B;
            this.c = Long.valueOf(qnHx.z.B);
            this.d = qnHx.y;
        }
    }

    public interface F1 extends Parcelable {
        boolean p(long j);
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.QnHx$QnHx, reason: collision with other inner class name */
    public static class C0080QnHx implements Parcelable.Creator<QnHx> {
        @Override // android.os.Parcelable.Creator
        public final QnHx createFromParcel(Parcel parcel) {
            return new QnHx((zg2) parcel.readParcelable(zg2.class.getClassLoader()), (zg2) parcel.readParcelable(zg2.class.getClassLoader()), (F1) parcel.readParcelable(F1.class.getClassLoader()), (zg2) parcel.readParcelable(zg2.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final QnHx[] newArray(int i) {
            return new QnHx[i];
        }
    }

    public QnHx(zg2 zg2Var, zg2 zg2Var2, F1 f1, zg2 zg2Var3) {
        this.w = zg2Var;
        this.x = zg2Var2;
        this.z = zg2Var3;
        this.y = f1;
        if (zg2Var3 != null && zg2Var.w.compareTo(zg2Var3.w) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (zg2Var3 != null && zg2Var3.w.compareTo(zg2Var2.w) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (!(zg2Var.w instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        int i = zg2Var2.y;
        int i2 = zg2Var.y;
        this.B = (zg2Var2.x - zg2Var.x) + ((i - i2) * 12) + 1;
        this.A = (i - i2) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QnHx)) {
            return false;
        }
        QnHx qnHx = (QnHx) obj;
        return this.w.equals(qnHx.w) && this.x.equals(qnHx.x) && uq2.a(this.z, qnHx.z) && this.y.equals(qnHx.y);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.w, this.x, this.z, this.y});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.w, 0);
        parcel.writeParcelable(this.x, 0);
        parcel.writeParcelable(this.z, 0);
        parcel.writeParcelable(this.y, 0);
    }
}
