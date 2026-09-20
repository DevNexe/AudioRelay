package defpackage;

import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
public final class ju0 implements t52 {
    public final String w;
    public final rw4 x;
    public final Queue<tw4> y;

    public ju0(rw4 rw4Var, Queue<tw4> queue) {
        this.x = rw4Var;
        this.w = rw4Var.w;
        this.y = queue;
    }

    @Override // defpackage.t52
    public final void a(String str) {
        tw4 tw4Var = new tw4();
        System.currentTimeMillis();
        tw4Var.a = this.x;
        Thread.currentThread().getName();
        this.y.add(tw4Var);
    }

    @Override // defpackage.t52
    public final String getName() {
        return this.w;
    }
}
