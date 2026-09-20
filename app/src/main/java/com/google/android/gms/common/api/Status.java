package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.AdError;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.C1638jw;
import defpackage.Th;
import defpackage.com5Fixed;
import defpackage.gq3;
import defpackage.tq2;
import defpackage.w26;
import defpackage.z50;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class Status extends com5Fixed implements gq3, ReflectedParcelable {
    public static final Status B;
    public static final Status C;
    public static final Parcelable.Creator<Status> CREATOR;
    public final z50 A;
    public final int w;
    public final int x;
    public final String y;
    public final PendingIntent z;

    static {
        new Status(-1, null);
        B = new Status(0, null);
        new Status(14, null);
        new Status(8, null);
        new Status(15, null);
        C = new Status(16, null);
        new Status(17, null);
        new Status(18, null);
        CREATOR = new w26();
    }

    public Status() {
        throw null;
    }

    public Status(int i, int i2, String str, PendingIntent pendingIntent, z50 z50Var) {
        this.w = i;
        this.x = i2;
        this.y = str;
        this.z = pendingIntent;
        this.A = z50Var;
    }

    public Status(int i, String str) {
        this(1, i, str, null, null);
    }

    @Override // defpackage.gq3
    public final Status a() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.w == status.w && this.x == status.x && tq2.a(this.y, status.y) && tq2.a(this.z, status.z) && tq2.a(this.A, status.A);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.w), Integer.valueOf(this.x), this.y, this.z, this.A});
    }

    public final String toString() {
        tq2.QnHx qnHx = new tq2.QnHx(this);
        String strA = this.y;
        if (strA == null) {
            strA = C1638jw.a(this.x);
        }
        qnHx.a(strA, "statusCode");
        qnHx.a(this.z, "resolution");
        return qnHx.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.G(parcel, 1, this.x);
        Th.J(parcel, 2, this.y);
        Th.I(parcel, 3, this.z, i);
        Th.I(parcel, 4, this.A, i);
        Th.G(parcel, AdError.NETWORK_ERROR_CODE, this.w);
        Th.X(parcel, iP);
    }
}
