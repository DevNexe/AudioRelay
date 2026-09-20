package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class un3<V> implements Callable {
    public final /* synthetic */ sm3 w;
    public final /* synthetic */ String x;

    public un3(sm3 sm3Var, String str) {
        this.w = sm3Var;
        this.x = str;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [hu1, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final hu1 call() {
        ws1 ws1Var = (ws1) this.w.b.x;
        return ws1Var.c(ib4.serializer(ws1Var.b, nl3.c(hu1.class)), this.x);
    }
}
