package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class p97 extends com5Fixed {
    public static final Parcelable.Creator<p97> CREATOR = new fa7();
    public final long A;
    public final long B;
    public final String C;
    public final boolean D;
    public final boolean E;
    public final long F;
    public final String G;

    @Deprecated
    public final long H;
    public final long I;
    public final int J;
    public final boolean K;
    public final boolean L;
    public final String M;
    public final Boolean N;
    public final long O;
    public final List P;
    public final String Q;
    public final String R;
    public final String S;
    public final String T;
    public final String w;
    public final String x;
    public final String y;
    public final String z;

    public p97(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, int i, boolean z3, boolean z4, String str7, Boolean bool, long j5, List list, String str8, String str9, String str10) {
        oa3.e(str);
        this.w = str;
        this.x = true != TextUtils.isEmpty(str2) ? str2 : null;
        this.y = str3;
        this.F = j;
        this.z = str4;
        this.A = j2;
        this.B = j3;
        this.C = str5;
        this.D = z;
        this.E = z2;
        this.G = str6;
        this.H = 0L;
        this.I = j4;
        this.J = i;
        this.K = z3;
        this.L = z4;
        this.M = str7;
        this.N = bool;
        this.O = j5;
        this.P = list;
        this.Q = null;
        this.R = str8;
        this.S = str9;
        this.T = str10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.J(parcel, 2, this.w);
        Th.J(parcel, 3, this.x);
        Th.J(parcel, 4, this.y);
        Th.J(parcel, 5, this.z);
        Th.H(parcel, 6, this.A);
        Th.H(parcel, 7, this.B);
        Th.J(parcel, 8, this.C);
        Th.z(parcel, 9, this.D);
        Th.z(parcel, 10, this.E);
        Th.H(parcel, 11, this.F);
        Th.J(parcel, 12, this.G);
        Th.H(parcel, 13, this.H);
        Th.H(parcel, 14, this.I);
        Th.G(parcel, 15, this.J);
        Th.z(parcel, 16, this.K);
        Th.z(parcel, 18, this.L);
        Th.J(parcel, 19, this.M);
        Boolean bool = this.N;
        if (bool != null) {
            parcel.writeInt(262165);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Th.H(parcel, 22, this.O);
        Th.L(parcel, 23, this.P);
        Th.J(parcel, 24, this.Q);
        Th.J(parcel, 25, this.R);
        Th.J(parcel, 26, this.S);
        Th.J(parcel, 27, this.T);
        Th.X(parcel, iP);
    }

    public p97(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, long j5, int i, boolean z3, boolean z4, String str7, Boolean bool, long j6, ArrayList arrayList, String str8, String str9, String str10, String str11) {
        this.w = str;
        this.x = str2;
        this.y = str3;
        this.F = j3;
        this.z = str4;
        this.A = j;
        this.B = j2;
        this.C = str5;
        this.D = z;
        this.E = z2;
        this.G = str6;
        this.H = j4;
        this.I = j5;
        this.J = i;
        this.K = z3;
        this.L = z4;
        this.M = str7;
        this.N = bool;
        this.O = j6;
        this.P = arrayList;
        this.Q = str8;
        this.R = str9;
        this.S = str10;
        this.T = str11;
    }
}
