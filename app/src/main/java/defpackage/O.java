package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O {
    public static final /* synthetic */ int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48};

    public static sb2 a(tr1 tr1Var, vb2 vb2Var, ob2 ob2Var, long j) {
        long jW0 = tr1Var.w0(ob2Var, j);
        tr1Var.r0();
        b43 b43VarY = ob2Var.y(FWT.u(j, jW0));
        return vb2Var.K(b43VarY.w, b43VarY.x, ds0.w, new sr1(b43VarY));
    }

    public static /* synthetic */ int b(int i, int i2) {
        if (i == 0 || i2 == 0) {
            throw null;
        }
        return i - i2;
    }

    public static /* synthetic */ boolean c(int i, int i2) {
        if (i != 0) {
            return i == i2;
        }
        throw null;
    }

    public static /* synthetic */ int d(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        throw null;
    }

    public static /* synthetic */ Iterator e() {
        try {
            return Arrays.asList(new EwET()).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static /* bridge */ /* synthetic */ void f(int i, int i2, Class cls) {
        throw null;
    }

    public static void g(j30 j30Var, boolean z, boolean z2, boolean z3, boolean z4) {
        j30Var.R(z);
        j30Var.R(z2);
        j30Var.R(z3);
        j30Var.R(z4);
    }

    public static /* synthetic */ int h(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ String i(int i) {
        if (i == 1) {
            return "VoIp";
        }
        return i == 2 ? "Audio" : "null";
    }

    public static /* synthetic */ int[] j(int i) {
        int[] iArr = new int[i];
        System.arraycopy(a, 0, iArr, 0, i);
        return iArr;
    }
}
