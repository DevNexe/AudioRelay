package defpackage;

import com.google.android.gms.internal.ads.zzdd;
import com.google.android.gms.internal.ads.zzel;
import com.google.android.gms.internal.ads.zzsg;

/* JADX INFO: loaded from: classes3.dex */
public final class g07 {
    public final zzsg a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public g07(zzsg zzsgVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3) {
        zzdd.zzd(!z3 || z);
        zzdd.zzd(!z2 || z);
        this.a = zzsgVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
        this.h = z3;
    }

    public final g07 a(long j) {
        return j == this.c ? this : new g07(this.a, this.b, j, this.d, this.e, this.f, this.g, this.h);
    }

    public final g07 b(long j) {
        return j == this.b ? this : new g07(this.a, j, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g07.class == obj.getClass()) {
            g07 g07Var = (g07) obj;
            if (this.b == g07Var.b && this.c == g07Var.c && this.d == g07Var.d && this.e == g07Var.e && this.f == g07Var.f && this.g == g07Var.g && this.h == g07Var.h && zzel.zzT(this.a, g07Var.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() + 527) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 961) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
