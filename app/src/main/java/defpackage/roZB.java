package defpackage;

import defpackage.z2n;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class roZB<S extends z2n<?>> {
    public S[] w;
    public int x;
    public int y;
    public pw4 z;

    public final pw4 g() {
        pw4 pw4Var;
        synchronized (this) {
            pw4Var = this.z;
            if (pw4Var == null) {
                pw4Var = new pw4(this.x);
                this.z = pw4Var;
            }
        }
        return pw4Var;
    }

    public final S h() {
        S s;
        pw4 pw4Var;
        synchronized (this) {
            S[] sArr = this.w;
            if (sArr == null) {
                sArr = (S[]) j();
                this.w = sArr;
            } else if (this.x >= sArr.length) {
                Object[] objArrCopyOf = Arrays.copyOf(sArr, sArr.length * 2);
                this.w = (S[]) ((z2n[]) objArrCopyOf);
                sArr = (S[]) ((z2n[]) objArrCopyOf);
            }
            int i = this.y;
            do {
                s = sArr[i];
                if (s == null) {
                    s = (S) i();
                    sArr[i] = s;
                }
                i++;
                if (i >= sArr.length) {
                    i = 0;
                }
            } while (!s.a(this));
            this.y = i;
            this.x++;
            pw4Var = this.z;
        }
        if (pw4Var != null) {
            synchronized (pw4Var) {
                Object[] objArr = pw4Var.D;
                pw4Var.e(Integer.valueOf(((Number) objArr[(objArr.length - 1) & ((int) ((pw4Var.E + ((long) ((int) ((pw4Var.r() + ((long) pw4Var.G)) - pw4Var.E)))) - 1))]).intValue() + 1));
            }
        }
        return s;
    }

    public abstract S i();

    public abstract z2n[] j();

    public final void k(S s) {
        pw4 pw4Var;
        int i;
        z80[] z80VarArrB;
        synchronized (this) {
            int i2 = this.x - 1;
            this.x = i2;
            pw4Var = this.z;
            if (i2 == 0) {
                this.y = 0;
            }
            z80VarArrB = s.b(this);
        }
        for (z80 z80Var : z80VarArrB) {
            if (z80Var != null) {
                z80Var.x(sd5.a);
            }
        }
        if (pw4Var != null) {
            synchronized (pw4Var) {
                Object[] objArr = pw4Var.D;
                pw4Var.e(Integer.valueOf(((Number) objArr[((int) ((pw4Var.E + ((long) ((int) ((pw4Var.r() + ((long) pw4Var.G)) - pw4Var.E)))) - 1)) & (objArr.length - 1)]).intValue() - 1));
            }
        }
    }
}
