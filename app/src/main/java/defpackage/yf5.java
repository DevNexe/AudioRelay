package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class yf5 extends cx1 implements j81<Throwable, sd5> {
    public final /* synthetic */ ms1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf5(os1 os1Var) {
        super(1);
        this.w = os1Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(Throwable th) {
        Throwable th2 = th;
        if (th2 != null) {
            this.w.m(new CancellationException(th2.getMessage()));
        }
        return sd5.a;
    }
}
