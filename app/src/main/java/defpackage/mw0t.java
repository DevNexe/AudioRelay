package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.internal.UndeliveredElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mw0t<E> implements q94<E> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater y = AtomicReferenceFieldUpdater.newUpdater(mw0t.class, Object.class, "onCloseHandler");
    public final j81<E, sd5> w;
    public final h52 x = new h52();
    private volatile /* synthetic */ Object onCloseHandler = null;

    public static final class QnHx<E> extends p94 {
        public final E z;

        public QnHx(E e) {
            this.z = e;
        }

        @Override // defpackage.p94
        public final void s() {
        }

        @Override // defpackage.p94
        public final Object t() {
            return this.z;
        }

        @Override // kotlinx.coroutines.internal.QnHx
        public final String toString() {
            StringBuilder sb = new StringBuilder("SendBuffered@");
            sb.append(lf0.a(this));
            sb.append('(');
            return o5.d(sb, this.z, ')');
        }

        @Override // defpackage.p94
        public final void u(nt<?> ntVar) {
        }

        @Override // defpackage.p94
        public final py4 v() {
            return ym.w;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public mw0t(j81<? super E, sd5> j81Var) {
        this.w = j81Var;
    }

    public static final void e(mw0t mw0tVar, xm xmVar, Object obj, nt ntVar) {
        UndeliveredElementException undeliveredElementExceptionG;
        mw0tVar.k(ntVar);
        Throwable closedSendChannelException = ntVar.z;
        if (closedSendChannelException == null) {
            closedSendChannelException = new ClosedSendChannelException();
        }
        j81<E, sd5> j81Var = mw0tVar.w;
        if (j81Var == null || (undeliveredElementExceptionG = fp1.G(j81Var, obj, null)) == null) {
            xmVar.x(new fq3.QnHx(closedSendChannelException));
        } else {
            Th.a(undeliveredElementExceptionG, closedSendChannelException);
            xmVar.x(new fq3.QnHx(undeliveredElementExceptionG));
        }
    }

    @Override // defpackage.q94
    public final Object H(E e) {
        ap.QnHx qnHx;
        Object objO = o(e);
        if (objO == YKK.x) {
            return sd5.a;
        }
        if (objO == YKK.y) {
            nt<?> ntVarJ = j();
            if (ntVarJ == null) {
                return ap.b;
            }
            k(ntVarJ);
            Throwable closedSendChannelException = ntVarJ.z;
            if (closedSendChannelException == null) {
                closedSendChannelException = new ClosedSendChannelException();
            }
            qnHx = new ap.QnHx(closedSendChannelException);
        } else {
            if (!(objO instanceof nt)) {
                throw new IllegalStateException(("trySend returned " + objO).toString());
            }
            nt<?> ntVar = (nt) objO;
            k(ntVar);
            Throwable closedSendChannelException2 = ntVar.z;
            if (closedSendChannelException2 == null) {
                closedSendChannelException2 = new ClosedSendChannelException();
            }
            qnHx = new ap.QnHx(closedSendChannelException2);
        }
        return qnHx;
    }

    @Override // defpackage.q94
    public final boolean Q() {
        return j() != null;
    }

    @Override // defpackage.q94
    public final boolean a(Throwable th) {
        boolean z;
        boolean z2;
        Object obj;
        py4 py4Var;
        nt<?> ntVar = new nt<>(th);
        h52 h52Var = this.x;
        while (true) {
            kotlinx.coroutines.internal.QnHx qnHxM = h52Var.m();
            z = false;
            if (!(!(qnHxM instanceof nt))) {
                z2 = false;
                break;
            }
            if (qnHxM.h(ntVar, h52Var)) {
                z2 = true;
                break;
            }
        }
        if (!z2) {
            ntVar = (nt) this.x.m();
        }
        k(ntVar);
        if (z2 && (obj = this.onCloseHandler) != null && obj != (py4Var = YKK.B)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = y;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, py4Var)) {
                    z = true;
                    break;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
            if (z) {
                sb5.d(1, obj);
                ((j81) obj).invoke(th);
            }
        }
        return z2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:23:0x0037 A[ORIG_RETURN, RETURN] */
    public Object h(r94 r94Var) {
        int iR;
        boolean z;
        kotlinx.coroutines.internal.QnHx qnHxM;
        boolean zL = l();
        h52 h52Var = this.x;
        if (zL) {
            do {
                qnHxM = h52Var.m();
                if (qnHxM instanceof ok3) {
                    return qnHxM;
                }
            } while (!qnHxM.h(r94Var, h52Var));
            return null;
        }
        DzVS dzVS = new DzVS(r94Var, this);
        do {
            kotlinx.coroutines.internal.QnHx qnHxM2 = h52Var.m();
            if (qnHxM2 instanceof ok3) {
                return qnHxM2;
            }
            iR = qnHxM2.r(r94Var, h52Var, dzVS);
            z = true;
            if (iR != 1) {
            }
            if (z) {
                return null;
            }
            return YKK.A;
        } while (iR != 2);
        z = false;
        if (z) {
            return YKK.A;
        }
        return null;
    }

    public String i() {
        return "";
    }

    public final nt<?> j() {
        kotlinx.coroutines.internal.QnHx qnHxM = this.x.m();
        nt<?> ntVar = qnHxM instanceof nt ? (nt) qnHxM : null;
        if (ntVar == null) {
            return null;
        }
        k(ntVar);
        return ntVar;
    }

    public final void k(nt<?> ntVar) {
        Object objA0 = null;
        while (true) {
            kotlinx.coroutines.internal.QnHx qnHxM = ntVar.m();
            mk3 mk3Var = qnHxM instanceof mk3 ? (mk3) qnHxM : null;
            if (mk3Var == null) {
                break;
            } else if (mk3Var.p()) {
                objA0 = ps0.a0(objA0, mk3Var);
            } else {
                ((mo3) mk3Var.k()).a.n();
            }
        }
        if (objA0 != null) {
            if (objA0 instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) objA0;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    ((mk3) arrayList.get(size)).t(ntVar);
                }
            } else {
                ((mk3) objA0).t(ntVar);
            }
        }
        q();
    }

    public abstract boolean l();

    public abstract boolean n();

    public Object o(E e) {
        ok3<E> ok3VarS;
        do {
            ok3VarS = s();
            if (ok3VarS == null) {
                return YKK.y;
            }
        } while (ok3VarS.b(e) == null);
        ok3VarS.g(e);
        return ok3VarS.d();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0086 A[EDGE_INSN: B:38:0x0086->B:39:0x008b BREAK  A[LOOP:0: B:7:0x0013->B:54:?]] */
    /* JADX WARN: Code duplicated, block: B:47:0x009c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:? A[LOOP:0: B:7:0x0013->B:54:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:47:0x009c, please report this as an issue */
    @Override // defpackage.q94
    public final Object p(E e, z80<? super sd5> z80Var) {
        Object objO;
        Object objO2 = o(e);
        py4 py4Var = YKK.x;
        if (objO2 == py4Var) {
            return sd5.a;
        }
        xm xmVarD = AY.D(ps0.L(z80Var));
        while (true) {
            if (!(this.x.l() instanceof ok3) && n()) {
                j81<E, sd5> j81Var = this.w;
                r94 r94Var = j81Var == null ? new r94(e, xmVarD) : new s94(e, xmVarD, j81Var);
                Object objH = h(r94Var);
                if (objH == null) {
                    xmVarD.B(new lo3(r94Var));
                    break;
                }
                if (objH instanceof nt) {
                    e(this, xmVarD, e, (nt) objH);
                    break;
                }
                if (objH != YKK.A && !(objH instanceof mk3)) {
                    throw new IllegalStateException(("enqueueSend returned " + objH).toString());
                }
                objO = o(e);
                if (objO == py4Var) {
                    xmVarD.x(sd5.a);
                    break;
                }
                if (objO != YKK.y) {
                    if (objO instanceof nt) {
                        e(this, xmVarD, e, (nt) objO);
                        break;
                    }
                    throw new IllegalStateException(("offerInternal returned " + objO).toString());
                }
            } else {
                objO = o(e);
                if (objO == py4Var) {
                    xmVarD.x(sd5.a);
                    break;
                }
                if (objO != YKK.y) {
                    if (objO instanceof nt) {
                        e(this, xmVarD, e, (nt) objO);
                        break;
                    }
                    throw new IllegalStateException(("offerInternal returned " + objO).toString());
                }
            }
        }
        Object objP = xmVarD.p();
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        if (objP != va0Var) {
            objP = sd5.a;
        }
        return objP == va0Var ? objP : sd5.a;
    }

    public void q() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.internal.QnHx] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public ok3<E> s() {
        ?? r1;
        kotlinx.coroutines.internal.QnHx qnHxQ;
        h52 h52Var = this.x;
        while (true) {
            r1 = (kotlinx.coroutines.internal.QnHx) h52Var.k();
            if (r1 == h52Var || !(r1 instanceof ok3)) {
                break;
            }
            if ((!(((ok3) r1) instanceof nt) || r1.o()) && (qnHxQ = r1.q()) != null) {
                qnHxQ.n();
            }
            return (ok3) r1;
        }
        r1 = 0;
        return (ok3) r1;
    }

    @Override // defpackage.q94
    public final void t(pe3.CQf cQf) {
        boolean z;
        boolean z2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = y;
        while (true) {
            z = true;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, cQf)) {
                z2 = true;
                break;
            } else if (atomicReferenceFieldUpdater.get(this) != null) {
                z2 = false;
                break;
            }
        }
        py4 py4Var = YKK.B;
        if (!z2) {
            Object obj = this.onCloseHandler;
            if (obj == py4Var) {
                throw new IllegalStateException("Another handler was already registered and successfully invoked");
            }
            throw new IllegalStateException("Another handler was already registered: " + obj);
        }
        nt<?> ntVarJ = j();
        if (ntVarJ != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = y;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, cQf, py4Var)) {
                if (atomicReferenceFieldUpdater2.get(this) != cQf) {
                    z = false;
                    break;
                }
            }
            if (z) {
                cQf.invoke(ntVarJ.z);
            }
        }
    }

    public final String toString() {
        String string;
        String string2;
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(lf0.a(this));
        sb.append('{');
        kotlinx.coroutines.internal.QnHx qnHx = this.x;
        kotlinx.coroutines.internal.QnHx qnHxL = qnHx.l();
        if (qnHxL == qnHx) {
            string2 = "EmptyQueue";
        } else {
            if (qnHxL instanceof nt) {
                string = qnHxL.toString();
            } else if (qnHxL instanceof mk3) {
                string = "ReceiveQueued";
            } else if (qnHxL instanceof p94) {
                string = "SendQueued";
            } else {
                string = "UNEXPECTED:" + qnHxL;
            }
            kotlinx.coroutines.internal.QnHx qnHxM = qnHx.m();
            if (qnHxM != qnHxL) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(",queueSize=");
                int i = 0;
                for (kotlinx.coroutines.internal.QnHx qnHxL2 = (kotlinx.coroutines.internal.QnHx) qnHx.k(); !ur1.a(qnHxL2, qnHx); qnHxL2 = qnHxL2.l()) {
                    if (qnHxL2 instanceof kotlinx.coroutines.internal.QnHx) {
                        i++;
                    }
                }
                sb2.append(i);
                string2 = sb2.toString();
                if (qnHxM instanceof nt) {
                    string2 = string2 + ",closedForSend=" + qnHxM;
                }
            } else {
                string2 = string;
            }
        }
        sb.append(string2);
        sb.append('}');
        sb.append(i());
        return sb.toString();
    }

    public final p94 u() {
        kotlinx.coroutines.internal.QnHx qnHx;
        kotlinx.coroutines.internal.QnHx qnHxQ;
        h52 h52Var = this.x;
        while (true) {
            qnHx = (kotlinx.coroutines.internal.QnHx) h52Var.k();
            if (qnHx == h52Var || !(qnHx instanceof p94)) {
                break;
            }
            if ((!(((p94) qnHx) instanceof nt) || qnHx.o()) && (qnHxQ = qnHx.q()) != null) {
                qnHxQ.n();
            }
            return (p94) qnHx;
        }
        qnHx = null;
        return (p94) qnHx;
    }
}
