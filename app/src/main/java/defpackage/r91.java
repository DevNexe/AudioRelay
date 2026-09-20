package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class r91 extends AtomicReference<Future<?>> implements vl0 {
    public final boolean w;

    public r91(Future future) {
        super(future);
        this.w = true;
    }

    @Override // defpackage.vl0
    public final void a() {
        Future<?> andSet = getAndSet(null);
        if (andSet != null) {
            andSet.cancel(this.w);
        }
    }

    @Override // defpackage.vl0
    public final boolean e() {
        Future<?> future = get();
        return future == null || future.isDone();
    }
}
