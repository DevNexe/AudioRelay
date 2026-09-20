package defpackage;

import com.google.android.gms.internal.ads.zzgnf;
import com.google.android.gms.internal.ads.zzgnu;
import com.google.android.gms.internal.ads.zzgox;
import com.google.android.gms.internal.ads.zzgpx;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class ot6 {
    public final zzgnu a;

    public ot6(zzgnu zzgnuVar) {
        Charset charset = zzgox.a;
        if (zzgnuVar == null) {
            throw new NullPointerException("output");
        }
        this.a = zzgnuVar;
        zzgnuVar.a = this;
    }

    public final void a(int i, int i2) {
        this.a.zzr(i, (i2 >> 31) ^ (i2 + i2));
    }

    public final void b(int i, long j) {
        this.a.zzt(i, (j >> 63) ^ (j + j));
    }

    public final void c(int i, int i2) {
        this.a.zzr(i, i2);
    }

    public final void d(int i, long j) {
        this.a.zzt(i, j);
    }

    public final void e(int i, boolean z) {
        this.a.zzP(i, z);
    }

    public final void f(int i, zzgnf zzgnfVar) {
        this.a.zzQ(i, zzgnfVar);
    }

    public final void g(double d, int i) {
        this.a.zzj(i, Double.doubleToRawLongBits(d));
    }

    public final void h(int i, int i2) {
        this.a.zzl(i, i2);
    }

    public final void i(int i, int i2) {
        this.a.zzh(i, i2);
    }

    public final void j(int i, long j) {
        this.a.zzj(i, j);
    }

    public final void k(float f, int i) {
        this.a.zzh(i, Float.floatToRawIntBits(f));
    }

    public final void l(int i, wu6 wu6Var, Object obj) {
        zzgnu zzgnuVar = this.a;
        zzgnuVar.zzq(i, 3);
        wu6Var.d((zzgpx) obj, zzgnuVar.a);
        zzgnuVar.zzq(i, 4);
    }

    public final void m(int i, int i2) {
        this.a.zzl(i, i2);
    }

    public final void n(int i, long j) {
        this.a.zzt(i, j);
    }

    public final void o(int i, wu6 wu6Var, Object obj) {
        this.a.b(i, (zzgpx) obj, wu6Var);
    }

    public final void p(int i, int i2) {
        this.a.zzh(i, i2);
    }

    public final void q(int i, long j) {
        this.a.zzj(i, j);
    }
}
