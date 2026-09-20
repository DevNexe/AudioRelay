package defpackage;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes3.dex */
public final class fb<T> extends EQ<T> {
    public final Thread y;
    public final gu0 z;

    public fb(la0 la0Var, Thread thread, gu0 gu0Var) {
        super(la0Var, true, true);
        this.y = thread;
        this.z = gu0Var;
    }

    @Override // defpackage.ss1
    public final void S(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.y;
        if (ur1.a(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
