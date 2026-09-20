package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class nb0 implements Callable<Void> {
    public final /* synthetic */ long w;
    public final /* synthetic */ String x;
    public final /* synthetic */ rb0 y;

    public nb0(rb0 rb0Var, long j, String str) {
        this.y = rb0Var;
        this.w = j;
        this.x = str;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        rb0 rb0Var = this.y;
        hc0 hc0Var = rb0Var.m;
        if (hc0Var != null && hc0Var.e.get()) {
            return null;
        }
        rb0Var.i.b.e(this.x, this.w);
        return null;
    }
}
