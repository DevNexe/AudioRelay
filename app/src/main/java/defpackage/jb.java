package defpackage;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes3.dex */
public final class jb<T> extends CountDownLatch implements ml4<T>, nx, gb2<T> {
    public T w;
    public Throwable x;
    public vl0 y;
    public volatile boolean z;

    public jb() {
        super(1);
    }

    @Override // defpackage.nx
    public final void b() {
        countDown();
    }

    @Override // defpackage.ml4
    public final void c(vl0 vl0Var) {
        this.y = vl0Var;
        if (this.z) {
            vl0Var.a();
        }
    }

    @Override // defpackage.ml4
    public final void onError(Throwable th) {
        this.x = th;
        countDown();
    }

    @Override // defpackage.ml4
    public final void onSuccess(T t) {
        this.w = t;
        countDown();
    }
}
