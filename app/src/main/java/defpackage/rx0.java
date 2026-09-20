package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class rx0 implements Callable<Void> {
    public final /* synthetic */ boolean w;
    public final /* synthetic */ vb0 x;
    public final /* synthetic */ xg4 y;

    public rx0(boolean z, vb0 vb0Var, xg4 xg4Var) {
        this.w = z;
        this.x = vb0Var;
        this.y = xg4Var;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        if (!this.w) {
            return null;
        }
        vb0 vb0Var = this.x;
        vb0Var.getClass();
        tb0 tb0Var = new tb0(vb0Var, this.y);
        ExecutorService executorService = tf5.a;
        vb0Var.m.execute(new rf5(tb0Var, new z05()));
        return null;
    }
}
