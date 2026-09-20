package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public abstract class rs1 extends ly implements am0, pj1 {
    public ss1 z;

    @Override // defpackage.am0
    public final void a() {
        boolean z;
        ss1 ss1VarT = t();
        do {
            Object objB0 = ss1VarT.B0();
            if (!(objB0 instanceof rs1)) {
                if (!(objB0 instanceof pj1) || ((pj1) objB0).f() == null) {
                    return;
                }
                p();
                return;
            }
            if (objB0 != this) {
                return;
            }
            rr0 rr0Var = ym.D;
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ss1.w;
                if (atomicReferenceFieldUpdater.compareAndSet(ss1VarT, objB0, rr0Var)) {
                    z = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(ss1VarT) != objB0) {
                    z = false;
                    break;
                }
            }
        } while (!z);
    }

    @Override // defpackage.pj1
    public final boolean c() {
        return true;
    }

    @Override // defpackage.pj1
    public final vo2 f() {
        return null;
    }

    public final ss1 t() {
        ss1 ss1Var = this.z;
        if (ss1Var != null) {
            return ss1Var;
        }
        ur1.e("job");
        throw null;
    }

    @Override // kotlinx.coroutines.internal.QnHx
    public final String toString() {
        return getClass().getSimpleName() + '@' + lf0.a(this) + "[job@" + lf0.a(t()) + ']';
    }
}
