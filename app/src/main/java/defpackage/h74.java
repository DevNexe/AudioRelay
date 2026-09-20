package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class h74 {
    public static final g74 a = new g74(new byte[0], 0, 0, false, false);
    public static final int b;
    public static final AtomicReference<g74>[] c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = iHighestOneBit;
        AtomicReference<g74>[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference<>();
        }
        c = atomicReferenceArr;
    }

    public static final void a(g74 g74Var) {
        boolean z = true;
        if (!(g74Var.f == null && g74Var.g == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (g74Var.d) {
            return;
        }
        AtomicReference<g74> atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        g74 g74Var2 = atomicReference.get();
        if (g74Var2 == a) {
            return;
        }
        int i = g74Var2 == null ? 0 : g74Var2.c;
        if (i >= 65536) {
            return;
        }
        g74Var.f = g74Var2;
        g74Var.b = 0;
        g74Var.c = i + 8192;
        while (!atomicReference.compareAndSet(g74Var2, g74Var)) {
            if (atomicReference.get() != g74Var2) {
                z = false;
                break;
            }
        }
        if (z) {
            return;
        }
        g74Var.f = null;
    }

    public static final g74 b() {
        AtomicReference<g74> atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        g74 g74Var = a;
        g74 andSet = atomicReference.getAndSet(g74Var);
        if (andSet == g74Var) {
            return new g74();
        }
        if (andSet == null) {
            atomicReference.set(null);
            return new g74();
        }
        atomicReference.set(andSet.f);
        andSet.f = null;
        andSet.c = 0;
        return andSet;
    }
}
