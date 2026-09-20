package kotlinx.coroutines.internal;

import defpackage.Ej;
import defpackage.fv2;
import defpackage.h52;
import defpackage.kf3;
import defpackage.lf0;
import defpackage.mo3;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public class QnHx {
    public static final /* synthetic */ AtomicReferenceFieldUpdater w = AtomicReferenceFieldUpdater.newUpdater(QnHx.class, Object.class, "_next");
    public static final /* synthetic */ AtomicReferenceFieldUpdater x = AtomicReferenceFieldUpdater.newUpdater(QnHx.class, Object.class, "_prev");
    public static final /* synthetic */ AtomicReferenceFieldUpdater y = AtomicReferenceFieldUpdater.newUpdater(QnHx.class, Object.class, "_removedRef");
    volatile /* synthetic */ Object _next = this;
    volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    /* JADX INFO: renamed from: kotlinx.coroutines.internal.QnHx$QnHx, reason: collision with other inner class name */
    public static abstract class AbstractC0158QnHx extends Ej<QnHx> {
        public final QnHx b;
        public QnHx c;

        public AbstractC0158QnHx(QnHx qnHx) {
            this.b = qnHx;
        }

        @Override // defpackage.Ej
        public final void b(QnHx qnHx, Object obj) {
            QnHx qnHx2 = qnHx;
            boolean z = false;
            boolean z2 = obj == null;
            QnHx qnHx3 = this.b;
            QnHx qnHx4 = z2 ? qnHx3 : this.c;
            if (qnHx4 != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = QnHx.w;
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(qnHx2, this, qnHx4)) {
                        z = true;
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(qnHx2) == this);
                if (z && z2) {
                    qnHx3.j(this.c);
                }
            }
        }
    }

    public final boolean h(QnHx qnHx, h52 h52Var) {
        boolean z;
        x.lazySet(qnHx, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w;
        atomicReferenceFieldUpdater.lazySet(qnHx, h52Var);
        while (true) {
            if (atomicReferenceFieldUpdater.compareAndSet(this, h52Var, qnHx)) {
                z = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != h52Var) {
                z = false;
                break;
            }
        }
        if (!z) {
            return false;
        }
        qnHx.j(h52Var);
        return true;
    }

    public final QnHx i() {
        Object obj;
        boolean z;
        while (true) {
            QnHx qnHx = (QnHx) this._prev;
            QnHx qnHx2 = qnHx;
            while (true) {
                QnHx qnHx3 = null;
                while (true) {
                    obj = qnHx2._next;
                    z = true;
                    if (obj == this) {
                        if (qnHx == qnHx2) {
                            return qnHx2;
                        }
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = x;
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, qnHx, qnHx2)) {
                            if (atomicReferenceFieldUpdater.get(this) != qnHx) {
                                z = false;
                                break;
                            }
                        }
                        if (!z) {
                            break;
                        }
                        return qnHx2;
                    }
                    if (o()) {
                        return null;
                    }
                    if (obj == null) {
                        return qnHx2;
                    }
                    if (obj instanceof fv2) {
                        ((fv2) obj).a(qnHx2);
                        break;
                    }
                    if (!(obj instanceof mo3)) {
                        qnHx3 = qnHx2;
                        qnHx2 = (QnHx) obj;
                    } else {
                        if (qnHx3 != null) {
                            break;
                        }
                        qnHx2 = (QnHx) qnHx2._prev;
                    }
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = w;
                QnHx qnHx4 = ((mo3) obj).a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(qnHx3, qnHx2, qnHx4)) {
                    if (atomicReferenceFieldUpdater2.get(qnHx3) != qnHx2) {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    break;
                }
                qnHx2 = qnHx3;
            }
        }
    }

    public final void j(QnHx qnHx) {
        boolean z;
        do {
            QnHx qnHx2 = (QnHx) qnHx._prev;
            if (k() != qnHx) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = x;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(qnHx, qnHx2, this)) {
                    z = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(qnHx) != qnHx2) {
                    z = false;
                    break;
                }
            }
        } while (!z);
        if (o()) {
            qnHx.i();
        }
    }

    public final Object k() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof fv2)) {
                return obj;
            }
            ((fv2) obj).a(this);
        }
    }

    public final QnHx l() {
        QnHx qnHx;
        Object objK = k();
        mo3 mo3Var = objK instanceof mo3 ? (mo3) objK : null;
        return (mo3Var == null || (qnHx = mo3Var.a) == null) ? (QnHx) objK : qnHx;
    }

    public final QnHx m() {
        QnHx qnHxI = i();
        if (qnHxI == null) {
            Object obj = this._prev;
            while (true) {
                qnHxI = (QnHx) obj;
                if (!qnHxI.o()) {
                    break;
                }
                obj = qnHxI._prev;
            }
        }
        return qnHxI;
    }

    public final void n() {
        QnHx qnHx = this;
        while (true) {
            Object objK = qnHx.k();
            if (!(objK instanceof mo3)) {
                qnHx.i();
                return;
            }
            qnHx = ((mo3) objK).a;
        }
    }

    public boolean o() {
        return k() instanceof mo3;
    }

    public boolean p() {
        return q() == null;
    }

    public final QnHx q() {
        QnHx qnHx;
        boolean z;
        do {
            Object objK = k();
            if (objK instanceof mo3) {
                return ((mo3) objK).a;
            }
            if (objK == this) {
                return (QnHx) objK;
            }
            qnHx = (QnHx) objK;
            mo3 mo3Var = (mo3) qnHx._removedRef;
            if (mo3Var == null) {
                mo3Var = new mo3(qnHx);
                y.lazySet(qnHx, mo3Var);
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, objK, mo3Var)) {
                    z = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != objK) {
                    z = false;
                    break;
                }
            }
        } while (!z);
        qnHx.i();
        return null;
    }

    public final int r(QnHx qnHx, QnHx qnHx2, AbstractC0158QnHx abstractC0158QnHx) {
        boolean z;
        x.lazySet(qnHx, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w;
        atomicReferenceFieldUpdater.lazySet(qnHx, qnHx2);
        abstractC0158QnHx.c = qnHx2;
        while (true) {
            if (atomicReferenceFieldUpdater.compareAndSet(this, qnHx2, abstractC0158QnHx)) {
                z = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != qnHx2) {
                z = false;
                break;
            }
        }
        if (z) {
            return abstractC0158QnHx.a(this) == null ? 1 : 2;
        }
        return 0;
    }

    public String toString() {
        return new kf3(this) { // from class: kotlinx.coroutines.internal.QnHx.CQf
        } + '@' + lf0.a(this);
    }
}
