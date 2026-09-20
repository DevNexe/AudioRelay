package defpackage;

import android.os.Build;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class tg {
    public final df4 a;
    public final Boolean b;
    public final ffo c;
    public final TJon d;
    public final boolean e;
    public final Iyje f;

    public tg() {
        this(0);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0034  */
    public tg(df4 df4Var, Boolean bool, ffo ffoVar, TJon tJon, boolean z) {
        Iyje iyje;
        this.a = df4Var;
        this.b = bool;
        this.c = ffoVar;
        this.d = tJon;
        this.e = z;
        if (df4Var == null || bool == null || ffoVar == null) {
            iyje = null;
        } else {
            if (df4Var instanceof df4.F1 ? true : df4Var instanceof df4.CQf) {
                iyje = Iyje.F1.b;
            } else {
                boolean z2 = df4Var instanceof df4.LPt8Fixed;
                Iyje.QnHx qnHx = Iyje.QnHx.b;
                if (z2) {
                    iyje = qnHx;
                } else {
                    if (!ur1.a(df4Var, df4.QnHx.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (tJon == null) {
                        iyje = qnHx;
                    } else {
                        iyje = Iyje.CQf.b;
                        if (!tJon.b && !tJon.d && ffoVar.c && !ffoVar.a) {
                            wb4 wb4Var = tJon.a;
                            Iyje.LPt8Fixed lPt8 = (ffoVar.b || tJon.c) ? new Iyje.LPt8Fixed(false, wb4Var) : new Iyje.LPt8Fixed(true, wb4Var);
                            iyje = lPt8;
                        }
                    }
                }
            }
        }
        this.f = iyje;
    }

    public static tg a(tg tgVar, df4 df4Var, Boolean bool, ffo ffoVar, TJon tJon, int i) {
        if ((i & 1) != 0) {
            df4Var = tgVar.a;
        }
        df4 df4Var2 = df4Var;
        if ((i & 2) != 0) {
            bool = tgVar.b;
        }
        Boolean bool2 = bool;
        if ((i & 4) != 0) {
            ffoVar = tgVar.c;
        }
        ffo ffoVar2 = ffoVar;
        if ((i & 8) != 0) {
            tJon = tgVar.d;
        }
        TJon tJon2 = tJon;
        boolean z = (i & 16) != 0 ? tgVar.e : false;
        tgVar.getClass();
        return new tg(df4Var2, bool2, ffoVar2, tJon2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tg)) {
            return false;
        }
        tg tgVar = (tg) obj;
        return ur1.a(this.a, tgVar.a) && ur1.a(this.b, tgVar.b) && ur1.a(this.c, tgVar.c) && ur1.a(this.d, tgVar.d) && this.e == tgVar.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    public final int hashCode() {
        df4 df4Var = this.a;
        int iHashCode = (df4Var == null ? 0 : df4Var.hashCode()) * 31;
        Boolean bool = this.b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        ffo ffoVar = this.c;
        int iHashCode3 = (iHashCode2 + (ffoVar == null ? 0 : ffoVar.hashCode())) * 31;
        TJon tJon = this.d;
        int iHashCode4 = (iHashCode3 + (tJon != null ? tJon.hashCode() : 0)) * 31;
        boolean z = this.e;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return iHashCode4 + r0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(serverState=");
        sb.append(this.a);
        sb.append(", shouldShowSetupCard=");
        sb.append(this.b);
        sb.append(", permissionState=");
        sb.append(this.c);
        sb.append(", pendingCaptureState=");
        sb.append(this.d);
        sb.append(", isPlaybackCaptureAvailable=");
        return Md5A.f(sb, this.e, ")");
    }

    public tg(int i) {
        this(null, null, null, null, Build.VERSION.SDK_INT >= 29);
    }
}
