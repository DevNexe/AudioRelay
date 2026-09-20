package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class wq2<T> extends vq2<T> {
    public final r50<? extends T> w;
    public final int x;
    public final m70<? super vl0> y;
    public final AtomicInteger z;

    public wq2(ks2 ks2Var) {
        m91.byN byn = m91.d;
        this.w = ks2Var;
        this.x = 1;
        this.y = byn;
        this.z = new AtomicInteger();
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super T> ht2Var) {
        r50<? extends T> r50Var = this.w;
        r50Var.a(ht2Var);
        if (this.z.incrementAndGet() == this.x) {
            r50Var.G(this.y);
        }
    }
}
