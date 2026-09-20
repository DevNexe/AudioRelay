package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class ds1 extends ns1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater B = AtomicIntegerFieldUpdater.newUpdater(ds1.class, "_invoked");
    public final j81<Throwable, sd5> A;
    private volatile /* synthetic */ int _invoked = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public ds1(j81<? super Throwable, sd5> j81Var) {
        this.A = j81Var;
    }

    @Override // defpackage.j81
    public final /* bridge */ /* synthetic */ sd5 invoke(Throwable th) {
        s(th);
        return sd5.a;
    }

    @Override // defpackage.ly
    public final void s(Throwable th) {
        if (B.compareAndSet(this, 0, 1)) {
            this.A.invoke(th);
        }
    }
}
