package defpackage;

import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dm0<T> implements ht2<T>, vl0 {
    public final AtomicReference<vl0> w = new AtomicReference<>();

    @Override // defpackage.vl0
    public final void a() {
        bm0.c(this.w);
    }

    @Override // defpackage.ht2
    public final void c(vl0 vl0Var) {
        boolean z;
        AtomicReference<vl0> atomicReference = this.w;
        Class<?> cls = getClass();
        if (vl0Var == null) {
            throw new NullPointerException("next is null");
        }
        while (true) {
            if (atomicReference.compareAndSet(null, vl0Var)) {
                z = true;
                break;
            } else if (atomicReference.get() != null) {
                z = false;
                break;
            }
        }
        if (z) {
            return;
        }
        vl0Var.a();
        if (atomicReference.get() != bm0.DISPOSED) {
            String name = cls.getName();
            m14.b(new ProtocolViolationException("It is not allowed to subscribe with a(n) " + name + " multiple times. Please create a fresh instance of " + name + " and subscribe that to the target source instead."));
        }
    }

    @Override // defpackage.vl0
    public final boolean e() {
        return this.w.get() == bm0.DISPOSED;
    }
}
