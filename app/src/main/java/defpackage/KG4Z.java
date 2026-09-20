package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes3.dex */
public final class KG4Z extends AtomicReferenceArray<vl0> implements vl0 {
    public KG4Z() {
        super(2);
    }

    @Override // defpackage.vl0
    public final void a() {
        vl0 andSet;
        vl0 vl0Var = get(0);
        bm0 bm0Var = bm0.DISPOSED;
        if (vl0Var != bm0Var) {
            int length = length();
            for (int i = 0; i < length; i++) {
                if (get(i) != bm0Var && (andSet = getAndSet(i, bm0Var)) != bm0Var && andSet != null) {
                    andSet.a();
                }
            }
        }
    }

    @Override // defpackage.vl0
    public final boolean e() {
        return get(0) == bm0.DISPOSED;
    }
}
