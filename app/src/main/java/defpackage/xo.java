package defpackage;

import io.ktor.utils.io.QnHx;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class xo implements ms1 {
    public final ms1 w;
    public final oj x;

    public xo(qr4 qr4Var, QnHx qnHx) {
        this.w = qr4Var;
        this.x = qnHx;
    }

    @Override // defpackage.ms1
    public final fq C(ss1 ss1Var) {
        return this.w.C(ss1Var);
    }

    @Override // defpackage.ms1
    public final Object K(z80<? super sd5> z80Var) {
        return this.w.K(z80Var);
    }

    @Override // defpackage.ms1
    public final CancellationException P() {
        return this.w.P();
    }

    @Override // defpackage.ms1
    public final boolean c() {
        return this.w.c();
    }

    @Override // la0.CQf, defpackage.la0
    public final la0 e(la0.F1<?> f1) {
        return this.w.e(f1);
    }

    @Override // defpackage.la0
    public final la0 g0(la0 la0Var) {
        return this.w.g0(la0Var);
    }

    @Override // la0.CQf
    public final la0.F1<?> getKey() {
        return this.w.getKey();
    }

    @Override // la0.CQf, defpackage.la0
    public final <R> R i(R r, x81<? super R, ? super la0.CQf, ? extends R> x81Var) {
        return (R) this.w.i(r, x81Var);
    }

    @Override // defpackage.ms1
    public final boolean isCancelled() {
        return this.w.isCancelled();
    }

    @Override // la0.CQf, defpackage.la0
    public final <E extends la0.CQf> E j(la0.F1<E> f1) {
        return (E) this.w.j(f1);
    }

    @Override // defpackage.ms1
    public final void m(CancellationException cancellationException) {
        this.w.m(cancellationException);
    }

    @Override // defpackage.ms1
    public final am0 r0(j81<? super Throwable, sd5> j81Var) {
        return this.w.r0(j81Var);
    }

    @Override // defpackage.ms1
    public final boolean start() {
        return this.w.start();
    }

    public final String toString() {
        return "ChannelJob[" + this.w + ']';
    }

    @Override // defpackage.ms1
    public final am0 w(boolean z, boolean z2, j81<? super Throwable, sd5> j81Var) {
        return this.w.w(z, z2, j81Var);
    }
}
