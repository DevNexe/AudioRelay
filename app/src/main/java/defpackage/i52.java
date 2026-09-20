package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public class i52<E> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(i52.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur = new j52(8, false);

    public final boolean a(E e) {
        while (true) {
            j52 j52Var = (j52) this._cur;
            int iA = j52Var.a(e);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
                j52<E> j52VarE = j52Var.e();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, j52Var, j52VarE) && atomicReferenceFieldUpdater.get(this) == j52Var) {
                }
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            j52 j52Var = (j52) this._cur;
            if (j52Var.b()) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            j52<E> j52VarE = j52Var.e();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, j52Var, j52VarE) && atomicReferenceFieldUpdater.get(this) == j52Var) {
            }
        }
    }

    public final int c() {
        return ((j52) this._cur).c();
    }

    public final E d() {
        while (true) {
            j52 j52Var = (j52) this._cur;
            E e = (E) j52Var.f();
            if (e != j52.g) {
                return e;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            j52<E> j52VarE = j52Var.e();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, j52Var, j52VarE) && atomicReferenceFieldUpdater.get(this) == j52Var) {
            }
        }
    }
}
