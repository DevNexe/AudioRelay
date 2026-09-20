package kotlinx.coroutines.sync;

import defpackage.AY;
import defpackage.Cz;
import defpackage.Ej;
import defpackage.am0;
import defpackage.bj2;
import defpackage.cj2;
import defpackage.cx1;
import defpackage.fv2;
import defpackage.h52;
import defpackage.j81;
import defpackage.lo3;
import defpackage.mo3;
import defpackage.o5;
import defpackage.ps0;
import defpackage.py4;
import defpackage.qr0;
import defpackage.sd5;
import defpackage.va0;
import defpackage.wm;
import defpackage.xm;
import defpackage.z80;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class QnHx implements bj2 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(QnHx.class, Object.class, "_state");
    volatile /* synthetic */ Object _state;

    public abstract class CQf extends kotlinx.coroutines.internal.QnHx implements am0 {
        public static final /* synthetic */ AtomicIntegerFieldUpdater A = AtomicIntegerFieldUpdater.newUpdater(CQf.class, "isTaken");
        private volatile /* synthetic */ int isTaken = 0;
        public final Object z;

        public CQf(Object obj) {
            this.z = obj;
        }

        @Override // defpackage.am0
        public final void a() {
            p();
        }

        public abstract void s();

        public abstract boolean t();
    }

    public static final class F1 extends h52 {
        public volatile Object owner;

        public F1(Object obj) {
            this.owner = obj;
        }

        @Override // kotlinx.coroutines.internal.QnHx
        public final String toString() {
            return o5.d(new StringBuilder("LockedQueue["), this.owner, ']');
        }
    }

    public static final class LPt8Fixed extends Ej<QnHx> {
        public final F1 b;

        public LPt8Fixed(F1 f1) {
            this.b = f1;
        }

        @Override // defpackage.Ej
        public final void b(QnHx qnHx, Object obj) {
            QnHx qnHx2 = qnHx;
            Object obj2 = obj == null ? Cz.A : this.b;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = QnHx.a;
            while (!atomicReferenceFieldUpdater.compareAndSet(qnHx2, this, obj2) && atomicReferenceFieldUpdater.get(qnHx2) == this) {
            }
        }

        @Override // defpackage.Ej
        public final py4 c(Object obj) {
            F1 f1 = this.b;
            if (f1.k() == f1) {
                return null;
            }
            return Cz.w;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.sync.QnHx$QnHx, reason: collision with other inner class name */
    public final class C0160QnHx extends CQf {
        public final wm<sd5> B;

        /* JADX INFO: renamed from: kotlinx.coroutines.sync.QnHx$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0161QnHx extends cx1 implements j81<Throwable, sd5> {
            public final /* synthetic */ QnHx w;
            public final /* synthetic */ C0160QnHx x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0161QnHx(QnHx qnHx, C0160QnHx c0160QnHx) {
                super(1);
                this.w = qnHx;
                this.x = c0160QnHx;
            }

            @Override // defpackage.j81
            public final sd5 invoke(Throwable th) {
                this.w.a(this.x.z);
                return sd5.a;
            }
        }

        public C0160QnHx(Object obj, xm xmVar) {
            super(obj);
            this.B = xmVar;
        }

        @Override // kotlinx.coroutines.sync.QnHx.CQf
        public final void s() {
            this.B.u();
        }

        @Override // kotlinx.coroutines.sync.QnHx.CQf
        public final boolean t() {
            if (CQf.A.compareAndSet(this, 0, 1)) {
                return this.B.J(sd5.a, new C0161QnHx(QnHx.this, this)) != null;
            }
            return false;
        }

        @Override // kotlinx.coroutines.internal.QnHx
        public final String toString() {
            return "LockCont[" + this.z + ", " + this.B + "] for " + QnHx.this;
        }
    }

    public QnHx(boolean z) {
        this._state = z ? Cz.z : Cz.A;
    }

    @Override // defpackage.bj2
    public final void a(Object obj) {
        kotlinx.coroutines.internal.QnHx qnHx;
        while (true) {
            Object obj2 = this._state;
            boolean z = true;
            if (obj2 instanceof qr0) {
                if (obj == null) {
                    if (!(((qr0) obj2).a != Cz.y)) {
                        throw new IllegalStateException("Mutex is not locked".toString());
                    }
                } else {
                    qr0 qr0Var = (qr0) obj2;
                    if (!(qr0Var.a == obj)) {
                        throw new IllegalStateException(("Mutex is locked by " + qr0Var.a + " but expected " + obj).toString());
                    }
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
                qr0 qr0Var2 = Cz.A;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, qr0Var2)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    return;
                }
            } else if (obj2 instanceof fv2) {
                ((fv2) obj2).a(this);
            } else {
                if (!(obj2 instanceof F1)) {
                    throw new IllegalStateException(("Illegal state " + obj2).toString());
                }
                if (obj != null) {
                    F1 f1 = (F1) obj2;
                    if (!(f1.owner == obj)) {
                        throw new IllegalStateException(("Mutex is locked by " + f1.owner + " but expected " + obj).toString());
                    }
                }
                F1 f2 = (F1) obj2;
                while (true) {
                    qnHx = (kotlinx.coroutines.internal.QnHx) f2.k();
                    if (qnHx == f2) {
                        qnHx = null;
                        break;
                    } else if (qnHx.p()) {
                        break;
                    } else {
                        ((mo3) qnHx.k()).a.n();
                    }
                }
                if (qnHx == null) {
                    LPt8Fixed lPt8 = new LPt8Fixed(f2);
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, lPt8)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                            z = false;
                            break;
                        }
                    }
                    if (z && lPt8.a(this) == null) {
                        return;
                    }
                } else {
                    CQf cQf = (CQf) qnHx;
                    if (cQf.t()) {
                        Object obj3 = cQf.z;
                        if (obj3 == null) {
                            obj3 = Cz.x;
                        }
                        f2.owner = obj3;
                        cQf.s();
                        return;
                    }
                }
            }
        }
    }

    @Override // defpackage.bj2
    public final Object b(Object obj, z80<? super sd5> z80Var) {
        if (c(obj)) {
            return sd5.a;
        }
        xm xmVarD = AY.D(ps0.L(z80Var));
        C0160QnHx c0160QnHx = new C0160QnHx(obj, xmVarD);
        while (true) {
            Object obj2 = this._state;
            boolean z = false;
            if (obj2 instanceof qr0) {
                qr0 qr0Var = (qr0) obj2;
                if (qr0Var.a != Cz.y) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
                    F1 f1 = new F1(qr0Var.a);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, f1) && atomicReferenceFieldUpdater.get(this) == obj2) {
                    }
                } else {
                    qr0 qr0Var2 = obj == null ? Cz.z : new qr0(obj);
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a;
                    do {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, qr0Var2)) {
                            z = true;
                            break;
                        }
                    } while (atomicReferenceFieldUpdater2.get(this) == obj2);
                    if (z) {
                        xmVarD.A(sd5.a, xmVarD.y, new cj2(this, obj));
                        break;
                    }
                }
            } else if (obj2 instanceof F1) {
                F1 f2 = (F1) obj2;
                if (!(f2.owner != obj)) {
                    throw new IllegalStateException(("Already locked by " + obj).toString());
                }
                while (!f2.m().h(c0160QnHx, f2)) {
                }
                if (this._state == obj2 || !CQf.A.compareAndSet(c0160QnHx, 0, 1)) {
                    xmVarD.B(new lo3(c0160QnHx));
                    break;
                }
                c0160QnHx = new C0160QnHx(obj, xmVarD);
            } else {
                if (!(obj2 instanceof fv2)) {
                    throw new IllegalStateException(("Illegal state " + obj2).toString());
                }
                ((fv2) obj2).a(this);
            }
        }
        Object objP = xmVarD.p();
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        if (objP != va0Var) {
            objP = sd5.a;
        }
        return objP == va0Var ? objP : sd5.a;
    }

    public final boolean c(Object obj) {
        while (true) {
            Object obj2 = this._state;
            boolean z = false;
            if (obj2 instanceof qr0) {
                if (((qr0) obj2).a != Cz.y) {
                    return false;
                }
                qr0 qr0Var = obj == null ? Cz.z : new qr0(obj);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, qr0Var)) {
                        z = true;
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj2);
                if (z) {
                    return true;
                }
            } else {
                if (obj2 instanceof F1) {
                    if (((F1) obj2).owner != obj) {
                        return false;
                    }
                    throw new IllegalStateException(("Already locked by " + obj).toString());
                }
                if (!(obj2 instanceof fv2)) {
                    throw new IllegalStateException(("Illegal state " + obj2).toString());
                }
                ((fv2) obj2).a(this);
            }
        }
    }

    public final String toString() {
        while (true) {
            Object obj = this._state;
            if (obj instanceof qr0) {
                return o5.d(new StringBuilder("Mutex["), ((qr0) obj).a, ']');
            }
            if (!(obj instanceof fv2)) {
                if (obj instanceof F1) {
                    return o5.d(new StringBuilder("Mutex["), ((F1) obj).owner, ']');
                }
                throw new IllegalStateException(("Illegal state " + obj).toString());
            }
            ((fv2) obj).a(this);
        }
    }
}
