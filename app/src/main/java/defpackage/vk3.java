package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class vk3 extends cx1 implements j81<Throwable, sd5> {
    public final /* synthetic */ uk3 w;
    public final /* synthetic */ Throwable x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk3(uk3 uk3Var, Throwable th) {
        super(1);
        this.w = uk3Var;
        this.x = th;
    }

    @Override // defpackage.j81
    public final sd5 invoke(Throwable th) {
        Throwable th2 = th;
        uk3 uk3Var = this.w;
        Object obj = uk3Var.d;
        Throwable th3 = this.x;
        synchronized (obj) {
            if (th3 == null) {
                th3 = null;
            } else if (th2 != null) {
                if (!(!(th2 instanceof CancellationException))) {
                    th2 = null;
                }
                if (th2 != null) {
                    Th.a(th3, th2);
                }
            }
            uk3Var.f = th3;
            uk3Var.o.setValue(uk3.F1.ShutDown);
        }
        return sd5.a;
    }
}
