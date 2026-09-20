package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class bp2 extends FJCM implements ms1 {
    public static final bp2 x = new bp2();

    public bp2() {
        super(ms1.CQf.w);
    }

    @Override // defpackage.ms1
    public final fq C(ss1 ss1Var) {
        return cp2.w;
    }

    @Override // defpackage.ms1
    public final Object K(z80<? super sd5> z80Var) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.ms1
    public final CancellationException P() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // defpackage.ms1
    public final boolean c() {
        return true;
    }

    @Override // defpackage.ms1
    public final boolean isCancelled() {
        return false;
    }

    @Override // defpackage.ms1
    public final void m(CancellationException cancellationException) {
    }

    @Override // defpackage.ms1
    public final am0 r0(j81<? super Throwable, sd5> j81Var) {
        return cp2.w;
    }

    @Override // defpackage.ms1
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // defpackage.ms1
    public final am0 w(boolean z, boolean z2, j81<? super Throwable, sd5> j81Var) {
        return cp2.w;
    }
}
