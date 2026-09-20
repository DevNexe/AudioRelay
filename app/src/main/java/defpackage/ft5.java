package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class ft5 extends com5Fixed {
    public static final Parcelable.Creator<ft5> CREATOR = new ut5();
    public boolean A;
    public String B;
    public final m16 C;
    public long D;
    public m16 E;
    public final long F;
    public final m16 G;
    public String w;
    public String x;
    public d37 y;
    public long z;

    public ft5(ft5 ft5Var) {
        oa3.h(ft5Var);
        this.w = ft5Var.w;
        this.x = ft5Var.x;
        this.y = ft5Var.y;
        this.z = ft5Var.z;
        this.A = ft5Var.A;
        this.B = ft5Var.B;
        this.C = ft5Var.C;
        this.D = ft5Var.D;
        this.E = ft5Var.E;
        this.F = ft5Var.F;
        this.G = ft5Var.G;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.J(parcel, 2, this.w);
        Th.J(parcel, 3, this.x);
        Th.I(parcel, 4, this.y, i);
        Th.H(parcel, 5, this.z);
        Th.z(parcel, 6, this.A);
        Th.J(parcel, 7, this.B);
        Th.I(parcel, 8, this.C, i);
        Th.H(parcel, 9, this.D);
        Th.I(parcel, 10, this.E, i);
        Th.H(parcel, 11, this.F);
        Th.I(parcel, 12, this.G, i);
        Th.X(parcel, iP);
    }

    public ft5(String str, String str2, d37 d37Var, long j, boolean z, String str3, m16 m16Var, long j2, m16 m16Var2, long j3, m16 m16Var3) {
        this.w = str;
        this.x = str2;
        this.y = d37Var;
        this.z = j;
        this.A = z;
        this.B = str3;
        this.C = m16Var;
        this.D = j2;
        this.E = m16Var2;
        this.F = j3;
        this.G = m16Var3;
    }
}
