package defpackage;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes3.dex */
public final class jf3 implements nz2<Thread> {
    public static final jf3 a = new jf3();

    @Override // defpackage.nz2
    public final void a(long j) {
        throw new UnsupportedOperationException("Parking is prohibited on this thread. Most likely you are using blocking operation on the wrong thread/dispatcher that doesn't allow blocking. Consider wrapping you blocking code withContext(Dispatchers.IO) {...}.");
    }

    @Override // defpackage.nz2
    public final void b(Thread thread) {
        LockSupport.unpark(thread);
    }
}
