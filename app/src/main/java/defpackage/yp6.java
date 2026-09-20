package defpackage;

import com.google.android.gms.internal.ads.ct;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class yp6 extends B8C {
    public final AtomicReferenceFieldUpdater w;
    public final AtomicIntegerFieldUpdater x;

    public yp6(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.w = atomicReferenceFieldUpdater;
        this.x = atomicIntegerFieldUpdater;
    }

    @Override // defpackage.B8C
    public final int T0(ct ctVar) {
        return this.x.decrementAndGet(ctVar);
    }

    @Override // defpackage.B8C
    public final void U0(ct ctVar, Set set) {
        boolean z;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = this.w;
            if (atomicReferenceFieldUpdater.compareAndSet(ctVar, null, set)) {
                z = true;
            } else if (atomicReferenceFieldUpdater.get(ctVar) != null) {
                z = false;
            } else {
                continue;
            }
            if (z || atomicReferenceFieldUpdater.get(ctVar) != null) {
                return;
            }
        }
    }
}
