package defpackage;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes3.dex */
public final class hh0 implements nz2<Thread> {
    public static final hh0 a = new hh0();

    @Override // defpackage.nz2
    public final void a(long j) {
        if (!(j >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        LockSupport.parkNanos(j);
    }

    @Override // defpackage.nz2
    public final void b(Thread thread) {
        LockSupport.unpark(thread);
    }
}
