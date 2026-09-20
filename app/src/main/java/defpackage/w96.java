package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class w96 extends com5Fixed {
    public static final Parcelable.Creator<w96> CREATOR = new da6();
    public final String A;
    public final String B;
    public final Bundle C;
    public final String D;
    public final long w;
    public final long x;
    public final boolean y;
    public final String z;

    public w96(long j, long j2, boolean z, String str, String str2, String str3, Bundle bundle, String str4) {
        this.w = j;
        this.x = j2;
        this.y = z;
        this.z = str;
        this.A = str2;
        this.B = str3;
        this.C = bundle;
        this.D = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.H(parcel, 1, this.w);
        Th.H(parcel, 2, this.x);
        Th.z(parcel, 3, this.y);
        Th.J(parcel, 4, this.z);
        Th.J(parcel, 5, this.A);
        Th.J(parcel, 6, this.B);
        Th.A(parcel, 7, this.C);
        Th.J(parcel, 8, this.D);
        Th.X(parcel, iP);
    }
}
