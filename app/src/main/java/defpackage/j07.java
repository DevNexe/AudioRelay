package defpackage;

import com.google.android.gms.internal.measurement.com5Fixed;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j07 extends sy4 {
    public static final Logger x = Logger.getLogger(j07.class.getName());
    public static final boolean y = e57.e;
    public l07 w;

    public j07() {
        super((Object) null);
    }

    public /* synthetic */ j07(int i) {
        super((Object) null);
    }

    public static int e(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int f(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    @Deprecated
    public static int v(int i, q37 q37Var, y37 y37Var) {
        int iE = e(i << 3);
        int i2 = iE + iE;
        com5Fixed com5Var = (com5Fixed) q37Var;
        int iB = com5Var.b();
        if (iB == -1) {
            iB = y37Var.zza(com5Var);
            com5Var.f(iB);
        }
        return i2 + iB;
    }

    public static int w(int i) {
        if (i >= 0) {
            return e(i);
        }
        return 10;
    }

    public static int x(String str) {
        int length;
        try {
            length = s57.c(str);
        } catch (r57 unused) {
            length = str.getBytes(f27.a).length;
        }
        return e(length) + length;
    }

    public static int y(int i) {
        return e(i << 3);
    }

    public abstract void g(byte b);

    public abstract void h(int i, boolean z);

    public abstract void i(int i, a07 a07Var);

    public abstract void j(int i, int i2);

    public abstract void k(int i);

    public abstract void l(int i, long j);

    public abstract void m(long j);

    public abstract void n(int i, int i2);

    public abstract void o(int i);

    public abstract void p(int i, String str);

    public abstract void q(int i, int i2);

    public abstract void r(int i, int i2);

    public abstract void s(int i);

    public abstract void t(int i, long j);

    public abstract void u(long j);
}
