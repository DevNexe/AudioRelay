package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public interface ms1 extends la0.CQf {
    public static final /* synthetic */ int j = 0;

    public static final class CQf implements la0.F1<ms1> {
        public static final /* synthetic */ CQf w = new CQf();
    }

    public static final class QnHx {
        public static /* synthetic */ am0 a(ms1 ms1Var, boolean z, j81 j81Var, int i) {
            if ((i & 1) != 0) {
                z = false;
            }
            return ms1Var.w(z, (i & 2) != 0, j81Var);
        }
    }

    fq C(ss1 ss1Var);

    Object K(z80<? super sd5> z80Var);

    CancellationException P();

    boolean c();

    boolean isCancelled();

    void m(CancellationException cancellationException);

    am0 r0(j81<? super Throwable, sd5> j81Var);

    boolean start();

    am0 w(boolean z, boolean z2, j81<? super Throwable, sd5> j81Var);
}
