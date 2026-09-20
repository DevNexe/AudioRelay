package j$.util.concurrent.atomic;

import j$.util.function.UnaryOperator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public class DesugarAtomicReference {
    /* JADX WARN: Multi-variable type inference failed */
    public static <V> V getAndUpdate(AtomicReference<V> atomicReference, UnaryOperator<V> unaryOperator) {
        V v;
        boolean z;
        do {
            v = atomicReference.get();
            T tApply = unaryOperator.apply(v);
            while (true) {
                if (atomicReference.compareAndSet(v, tApply)) {
                    z = true;
                    break;
                }
                if (atomicReference.get() != v) {
                    z = false;
                    break;
                }
            }
        } while (!z);
        return v;
    }
}
