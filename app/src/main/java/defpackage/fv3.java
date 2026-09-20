package defpackage;

import com.google.android.gms.ads.AdRequest;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class fv3 {
    public final re2 a;
    public final ne2 b;
    public final String c;
    public final boolean d;
    public final nj1<df4> e;
    public final wb4 f;
    public final nj1<vz4.QnHx> g;
    public final cv3 h;
    public final kc4 i;
    public final kj1<qf4> j;
    public final nj1<Map<of4, gl0>> k;
    public final bv3 l;
    public final boolean m;
    public final dg2 n;
    public final te2 o;
    public final Boolean p;
    public final boolean q;
    public final Boolean r;

    public fv3() {
        this(0);
    }

    public fv3(re2 re2Var, ne2 ne2Var, String str, boolean z, nj1<df4> nj1Var, wb4 wb4Var, nj1<vz4.QnHx> nj1Var2, cv3 cv3Var, kc4 kc4Var, kj1<qf4> kj1Var, nj1<Map<of4, gl0>> nj1Var3, bv3 bv3Var, boolean z2, dg2 dg2Var, te2 te2Var, Boolean bool) {
        boolean z3;
        Boolean boolValueOf;
        this.a = re2Var;
        this.b = ne2Var;
        this.c = str;
        this.d = z;
        this.e = nj1Var;
        this.f = wb4Var;
        this.g = nj1Var2;
        this.h = cv3Var;
        this.i = kc4Var;
        this.j = kj1Var;
        
        // 1. ЗАПАТЧЕНО: обнуляем таймеры отключения (передаем null или пустую коллекцию)
        this.k = null; 
        
        this.l = bv3Var;
        this.m = z2;
        this.n = dg2Var;
        this.o = te2Var;
        
        // 2. ЗАПАТЧЕНО: принудительно устанавливаем isPremium = true
        this.p = Boolean.TRUE;

        wb4 wb4Var2 = wb4.Microphone;
        if (wb4Var != wb4Var2) {
            z3 = false;
        } else if (bv3Var instanceof bv3.QnHx) {
            z3 = true;
        } else {
            if (!ur1.a(bv3Var, bv3.CQf.a) && !ur1.a(bv3Var, bv3.F1.a)) {
                throw new NoWhenBranchMatchedException();
            }
            z3 = false;
        }
        this.q = z3;
        if (wb4Var != null) {
            boolValueOf = Boolean.valueOf(wb4Var == wb4Var2);
        } else {
            boolValueOf = null;
        }
        this.r = boolValueOf;
    }

    public static fv3 a(fv3 fv3Var, re2 re2Var, ne2 ne2Var, String str, wb4 wb4Var, nj1 nj1Var, cv3 cv3Var, kc4 kc4Var, kj1 kj1Var, nj1 nj1Var2, bv3 bv3Var, boolean z, dg2 dg2Var, te2 te2Var, Boolean bool, int i) {
        re2 re2Var2 = (i & 1) != 0 ? fv3Var.a : re2Var;
        ne2 ne2Var2 = (i & 2) != 0 ? fv3Var.b : ne2Var;
        String str2 = (i & 4) != 0 ? fv3Var.c : str;
        boolean z2 = (i & 8) != 0 ? fv3Var.d : false;
        nj1<df4> nj1Var3 = (i & 16) != 0 ? fv3Var.e : null;
        wb4 wb4Var2 = (i & 32) != 0 ? fv3Var.f : wb4Var;
        nj1 nj1Var4 = (i & 64) != 0 ? fv3Var.g : nj1Var;
        cv3 cv3Var2 = (i & 128) != 0 ? fv3Var.h : cv3Var;
        kc4 kc4Var2 = (i & 256) != 0 ? fv3Var.i : kc4Var;
        kj1 kj1Var2 = (i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? fv3Var.j : kj1Var;
        nj1 nj1Var5 = (i & 1024) != 0 ? fv3Var.k : nj1Var2;
        bv3 bv3Var2 = (i & 2048) != 0 ? fv3Var.l : bv3Var;
        boolean z3 = (i & 4096) != 0 ? fv3Var.m : z;
        dg2 dg2Var2 = (i & 8192) != 0 ? fv3Var.n : dg2Var;
        te2 te2Var2 = (i & 16384) != 0 ? fv3Var.o : te2Var;
        Boolean bool2 = Boolean.TRUE;
        fv3Var.getClass();
        return new fv3(re2Var2, ne2Var2, str2, z2, nj1Var3, wb4Var2, nj1Var4, cv3Var2, kc4Var2, kj1Var2, nj1Var5, bv3Var2, z3, dg2Var2, te2Var2, bool2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fv3)) {
            return false;
        }
        fv3 fv3Var = (fv3) obj;
        return ur1.a(this.a, fv3Var.a) && ur1.a(this.b, fv3Var.b) && ur1.a(this.c, fv3Var.c) && this.d == fv3Var.d && ur1.a(this.e, fv3Var.e) && this.f == fv3Var.f && ur1.a(this.g, fv3Var.g) && ur1.a(this.h, fv3Var.h) && ur1.a(this.i, fv3Var.i) && ur1.a(this.j, fv3Var.j) && ur1.a(this.k, fv3Var.k) && ur1.a(this.l, fv3Var.l) && this.m == fv3Var.m && ur1.a(this.n, fv3Var.n) && ur1.a(this.o, fv3Var.o) && ur1.a(this.p, fv3Var.p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43 */
    public final int hashCode() {
        re2 re2Var = this.a;
        int iHashCode = (re2Var == null ? 0 : re2Var.hashCode()) * 31;
        ne2 ne2Var = this.b;
        int iA = bl2.a(this.c, (iHashCode + (ne2Var == null ? 0 : ne2Var.hashCode())) * 31, 31);
        boolean z = this.d;
        ?? r3 = z;
        if (z) {
            r3 = 1;
        }
        int i = (iA + r3) * 31;
        nj1<df4> nj1Var = this.e;
        int iHashCode2 = (i + (nj1Var == null ? 0 : nj1Var.hashCode())) * 31;
        wb4 wb4Var = this.f;
        int iHashCode3 = (iHashCode2 + (wb4Var == null ? 0 : wb4Var.hashCode())) * 31;
        nj1<vz4.QnHx> nj1Var2 = this.g;
        int iHashCode4 = (iHashCode3 + (nj1Var2 == null ? 0 : nj1Var2.hashCode())) * 31;
        cv3 cv3Var = this.h;
        int iHashCode5 = (iHashCode4 + (cv3Var == null ? 0 : cv3Var.hashCode())) * 31;
        kc4 kc4Var = this.i;
        int iHashCode6 = (iHashCode5 + (kc4Var == null ? 0 : kc4Var.hashCode())) * 31;
        kj1<qf4> kj1Var = this.j;
        int iHashCode7 = (iHashCode6 + (kj1Var == null ? 0 : kj1Var.hashCode())) * 31;
        nj1<Map<of4, gl0>> nj1Var3 = this.k;
        int iHashCode8 = (this.l.hashCode() + ((iHashCode7 + (nj1Var3 == null ? 0 : nj1Var3.hashCode())) * 31)) * 31;
        boolean z2 = this.m;
        int i2 = (iHashCode8 + (z2 ? 1 : z2)) * 31;
        dg2 dg2Var = this.n;
        int iHashCode9 = (i2 + (dg2Var == null ? 0 : dg2Var.hashCode())) * 31;
        te2 te2Var = this.o;
        int iHashCode10 = (iHashCode9 + (te2Var == null ? 0 : te2Var.hashCode())) * 31;
        Boolean bool = this.p;
        return iHashCode10 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "State(micModeSettings=" + this.a + ", micEffectSettings=" + this.b + ", sessionDuration=" + this.c + ", isPlaybackCaptureAvailable=" + this.d + ", serverState=" + this.e + ", captureType=" + this.f + ", clientListenerError=" + this.g + ", captureLatency=" + this.h + ", serverInfo=" + this.i + ", sessions=" + this.j + ", disconnectTimers=" + this.k + ", bluetooth=" + this.l + ", shouldShowMicModesDialog=" + this.m + ", volumeSettings=" + this.n + ", noiseRemovalSettings=" + this.o + ", isPremium=" + this.p + ")";
    }

    public /* synthetic */ fv3(int i) {
        this(null, null, "", false, null, null, null, null, null, new kj1(cs0.w), null, bv3.CQf.a, false, null, null, null);
    }
}
