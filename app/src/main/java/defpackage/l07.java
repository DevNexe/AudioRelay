package defpackage;

import com.google.android.gms.internal.measurement.com5Fixed;
import com.google.android.gms.internal.measurement.zzjj;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class l07 {
    public final j07 a;

    public l07(e07 e07Var) {
        Charset charset = f27.a;
        this.a = e07Var;
        e07Var.w = this;
    }

    public final void a(int i, int i2) {
        this.a.r(i, (i2 >> 31) ^ (i2 + i2));
    }

    public final void b(int i, long j) {
        this.a.t(i, (j >> 63) ^ (j + j));
    }

    public final void c(int i, int i2) {
        this.a.r(i, i2);
    }

    public final void d(int i, long j) {
        this.a.t(i, j);
    }

    public final void e(int i, boolean z) {
        this.a.h(i, z);
    }

    public final void f(int i, a07 a07Var) {
        this.a.i(i, a07Var);
    }

    public final void g(double d, int i) {
        this.a.l(i, Double.doubleToRawLongBits(d));
    }

    public final void h(int i, int i2) {
        this.a.n(i, i2);
    }

    public final void i(int i, int i2) {
        this.a.j(i, i2);
    }

    public final void j(int i, long j) {
        this.a.l(i, j);
    }

    public final void k(float f, int i) {
        this.a.j(i, Float.floatToRawIntBits(f));
    }

    public final void l(int i, y37 y37Var, Object obj) {
        j07 j07Var = this.a;
        j07Var.q(i, 3);
        y37Var.e((q37) obj, j07Var.w);
        j07Var.q(i, 4);
    }

    public final void m(int i, int i2) {
        this.a.n(i, i2);
    }

    public final void n(int i, long j) {
        this.a.t(i, j);
    }

    public final void o(int i, y37 y37Var, Object obj) throws zzjj {
        Object obj2 = (q37) obj;
        e07 e07Var = (e07) this.a;
        e07Var.s((i << 3) | 2);
        com5Fixed com5Var = (com5Fixed) obj2;
        int iB = com5Var.b();
        if (iB == -1) {
            iB = y37Var.zza(com5Var);
            com5Var.f(iB);
        }
        e07Var.s(iB);
        y37Var.e(obj2, e07Var.w);
    }

    public final void p(int i, int i2) {
        this.a.j(i, i2);
    }

    public final void q(int i, long j) {
        this.a.l(i, j);
    }
}
