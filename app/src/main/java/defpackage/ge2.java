package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class ge2 extends com5Fixed {
    public static final Parcelable.Creator<ge2> CREATOR = new hr5();
    public final long A;
    public final String B;
    public final String C;
    public final int D;
    public final int E;
    public final int w;
    public final int x;
    public final int y;
    public final long z;

    public ge2(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.w = i;
        this.x = i2;
        this.y = i3;
        this.z = j;
        this.A = j2;
        this.B = str;
        this.C = str2;
        this.D = i4;
        this.E = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.G(parcel, 1, this.w);
        Th.G(parcel, 2, this.x);
        Th.G(parcel, 3, this.y);
        Th.H(parcel, 4, this.z);
        Th.H(parcel, 5, this.A);
        Th.J(parcel, 6, this.B);
        Th.J(parcel, 7, this.C);
        Th.G(parcel, 8, this.D);
        Th.G(parcel, 9, this.E);
        Th.X(parcel, iP);
    }
}
