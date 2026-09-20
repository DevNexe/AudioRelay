package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes3.dex */
public class ss1 implements ms1, hq, mz2 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater w = AtomicReferenceFieldUpdater.newUpdater(ss1.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    public static final class CQf extends rs1 {
        public final ss1 A;
        public final F1 B;
        public final gq C;
        public final Object D;

        public CQf(ss1 ss1Var, F1 f1, gq gqVar, Object obj) {
            this.A = ss1Var;
            this.B = f1;
            this.C = gqVar;
            this.D = obj;
        }

        @Override // defpackage.j81
        public final /* bridge */ /* synthetic */ sd5 invoke(Throwable th) {
            s(th);
            return sd5.a;
        }

        @Override // defpackage.ly
        public final void s(Throwable th) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ss1.w;
            ss1 ss1Var = this.A;
            ss1Var.getClass();
            gq gqVarJ0 = ss1.J0(this.C);
            F1 f1 = this.B;
            Object obj = this.D;
            if (gqVarJ0 == null || !ss1Var.S0(f1, gqVarJ0, obj)) {
                ss1Var.S(ss1Var.j0(f1, obj));
            }
        }
    }

    public static final class F1 implements pj1 {
        private volatile /* synthetic */ Object _rootCause;
        public final vo2 w;
        private volatile /* synthetic */ int _isCompleting = 0;
        private volatile /* synthetic */ Object _exceptionsHolder = null;

        public F1(vo2 vo2Var, Throwable th) {
            this.w = vo2Var;
            this._rootCause = th;
        }

        public final void a(Throwable th) {
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 == null) {
                this._rootCause = th;
                return;
            }
            if (th == th2) {
                return;
            }
            Object obj = this._exceptionsHolder;
            if (obj == null) {
                this._exceptionsHolder = th;
                return;
            }
            if (!(obj instanceof Throwable)) {
                if (obj instanceof ArrayList) {
                    ((ArrayList) obj).add(th);
                    return;
                } else {
                    throw new IllegalStateException(("State is " + obj).toString());
                }
            }
            if (th == obj) {
                return;
            }
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(obj);
            arrayList.add(th);
            this._exceptionsHolder = arrayList;
        }

        public final Throwable b() {
            return (Throwable) this._rootCause;
        }

        @Override // defpackage.pj1
        public final boolean c() {
            return ((Throwable) this._rootCause) == null;
        }

        public final boolean d() {
            return ((Throwable) this._rootCause) != null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
        public final boolean e() {
            return this._isCompleting;
        }

        @Override // defpackage.pj1
        public final vo2 f() {
            return this.w;
        }

        public final boolean g() {
            return this._exceptionsHolder == ym.B;
        }

        public final ArrayList h(Throwable th) {
            ArrayList arrayList;
            Object obj = this._exceptionsHolder;
            if (obj == null) {
                arrayList = new ArrayList(4);
            } else if (obj instanceof Throwable) {
                ArrayList arrayList2 = new ArrayList(4);
                arrayList2.add(obj);
                arrayList = arrayList2;
            } else {
                if (!(obj instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + obj).toString());
                }
                arrayList = (ArrayList) obj;
            }
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 != null) {
                arrayList.add(0, th2);
            }
            if (th != null && !ur1.a(th, th2)) {
                arrayList.add(th);
            }
            this._exceptionsHolder = ym.B;
            return arrayList;
        }

        public final void i() {
            this._isCompleting = 1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
        public final String toString() {
            return "Finishing[cancelling=" + d() + ", completing=" + ((boolean) this._isCompleting) + ", rootCause=" + ((Throwable) this._rootCause) + ", exceptions=" + this._exceptionsHolder + ", list=" + this.w + ']';
        }
    }

    public static final class QnHx<T> extends xm<T> {
        public final ss1 E;

        public QnHx(z80<? super T> z80Var, ss1 ss1Var) {
            super(1, z80Var);
            this.E = ss1Var;
        }

        @Override // defpackage.xm
        public final Throwable o(ss1 ss1Var) {
            Throwable thB;
            Object objB0 = this.E.B0();
            if (!(objB0 instanceof F1) || (thB = ((F1) objB0).b()) == null) {
                return objB0 instanceof iy ? ((iy) objB0).a : ss1Var.P();
            }
            return thB;
        }

        @Override // defpackage.xm
        public final String y() {
            return "AwaitContinuation";
        }
    }

    public ss1(boolean z) {
        this._state = z ? ym.D : ym.C;
        this._parentHandle = null;
    }

    public static gq J0(kotlinx.coroutines.internal.QnHx qnHx) {
        while (qnHx.o()) {
            qnHx = qnHx.m();
        }
        while (true) {
            qnHx = qnHx.l();
            if (!qnHx.o()) {
                if (qnHx instanceof gq) {
                    return (gq) qnHx;
                }
                if (qnHx instanceof vo2) {
                    return null;
                }
            }
        }
    }

    public static String Q0(Object obj) {
        if (obj instanceof F1) {
            F1 f1 = (F1) obj;
            if (f1.d()) {
                return "Cancelling";
            }
            if (f1.e()) {
                return "Completing";
            }
        } else {
            if (!(obj instanceof pj1)) {
                return obj instanceof iy ? "Cancelled" : "Completed";
            }
            if (!((pj1) obj).c()) {
                return "New";
            }
        }
        return "Active";
    }

    public final fq A0() {
        return (fq) this._parentHandle;
    }

    public final Object B0() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof fv2)) {
                return obj;
            }
            ((fv2) obj).a(this);
        }
    }

    @Override // defpackage.ms1
    public final fq C(ss1 ss1Var) {
        return (fq) ms1.QnHx.a(this, true, new gq(ss1Var), 2);
    }

    public boolean C0(Throwable th) {
        return false;
    }

    public void D0(CompletionHandlerException completionHandlerException) {
        throw completionHandlerException;
    }

    public final void E0(ms1 ms1Var) {
        cp2 cp2Var = cp2.w;
        if (ms1Var == null) {
            this._parentHandle = cp2Var;
            return;
        }
        ms1Var.start();
        fq fqVarC = ms1Var.C(this);
        this._parentHandle = fqVarC;
        if (!(B0() instanceof pj1)) {
            fqVarC.a();
            this._parentHandle = cp2Var;
        }
    }

    @Override // defpackage.hq
    public final void F(ss1 ss1Var) {
        V(ss1Var);
    }

    public boolean F0() {
        return this instanceof fb;
    }

    public final boolean G0(Object obj) {
        Object objR0;
        do {
            objR0 = R0(B0(), obj);
            if (objR0 == ym.x) {
                return false;
            }
            if (objR0 == ym.y) {
                return true;
            }
        } while (objR0 == ym.z);
        S(objR0);
        return true;
    }

    public final Object H0(Object obj) {
        Object objR0;
        do {
            objR0 = R0(B0(), obj);
            if (objR0 == ym.x) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                iy iyVar = obj instanceof iy ? (iy) obj : null;
                throw new IllegalStateException(str, iyVar != null ? iyVar.a : null);
            }
        } while (objR0 == ym.z);
        return objR0;
    }

    public String I0() {
        return getClass().getSimpleName();
    }

    @Override // defpackage.ms1
    public final Object K(z80<? super sd5> z80Var) {
        boolean z;
        while (true) {
            Object objB0 = B0();
            if (!(objB0 instanceof pj1)) {
                z = false;
                break;
            }
            if (P0(objB0) >= 0) {
                z = true;
                break;
            }
        }
        if (!z) {
            AY.v(z80Var.getContext());
            return sd5.a;
        }
        xm xmVar = new xm(1, ps0.L(z80Var));
        xmVar.r();
        xmVar.B(new im0(r0(new km0(xmVar, 2)), 0));
        Object objP = xmVar.p();
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        if (objP != va0Var) {
            objP = sd5.a;
        }
        return objP == va0Var ? objP : sd5.a;
    }

    public final void K0(vo2 vo2Var, Throwable th) {
        L0(th);
        CompletionHandlerException completionHandlerException = null;
        for (kotlinx.coroutines.internal.QnHx qnHxL = (kotlinx.coroutines.internal.QnHx) vo2Var.k(); !ur1.a(qnHxL, vo2Var); qnHxL = qnHxL.l()) {
            if (qnHxL instanceof ns1) {
                rs1 rs1Var = (rs1) qnHxL;
                try {
                    rs1Var.s(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        Th.a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + rs1Var + " for " + this, th2);
                        sd5 sd5Var = sd5.a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            D0(completionHandlerException);
        }
        X(th);
    }

    public void L0(Throwable th) {
    }

    public void M0(Object obj) {
    }

    public void N0() {
    }

    public final void O0(rs1 rs1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z;
        vo2 vo2Var = new vo2();
        rs1Var.getClass();
        kotlinx.coroutines.internal.QnHx.x.lazySet(vo2Var, rs1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = kotlinx.coroutines.internal.QnHx.w;
        atomicReferenceFieldUpdater2.lazySet(vo2Var, rs1Var);
        while (rs1Var.k() == rs1Var) {
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(rs1Var, rs1Var, vo2Var)) {
                    z = true;
                    break;
                } else if (atomicReferenceFieldUpdater2.get(rs1Var) != rs1Var) {
                    z = false;
                    break;
                }
            }
            if (z) {
                vo2Var.j(rs1Var);
                break;
            }
        }
        kotlinx.coroutines.internal.QnHx qnHxL = rs1Var.l();
        do {
            atomicReferenceFieldUpdater = w;
            if (atomicReferenceFieldUpdater.compareAndSet(this, rs1Var, qnHxL)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == rs1Var);
    }

    @Override // defpackage.ms1
    public final CancellationException P() {
        CancellationException cancellationException;
        Object objB0 = B0();
        if (!(objB0 instanceof F1)) {
            if (objB0 instanceof pj1) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(objB0 instanceof iy)) {
                return new JobCancellationException(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((iy) objB0).a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new JobCancellationException(Y(), th, this) : cancellationException;
        }
        Throwable thB = ((F1) objB0).b();
        if (thB == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thB instanceof CancellationException ? (CancellationException) thB : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = Y();
        }
        return new JobCancellationException(strConcat, thB, this);
    }

    public final int P0(Object obj) {
        boolean z = obj instanceof rr0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w;
        boolean z2 = false;
        if (z) {
            if (((rr0) obj).w) {
                return 0;
            }
            rr0 rr0Var = ym.D;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, rr0Var)) {
                    z2 = true;
                    break;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
            if (!z2) {
                return -1;
            }
            N0();
            return 1;
        }
        if (!(obj instanceof oj1)) {
            return 0;
        }
        vo2 vo2Var = ((oj1) obj).w;
        do {
            if (atomicReferenceFieldUpdater.compareAndSet(this, obj, vo2Var)) {
                z2 = true;
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == obj);
        if (!z2) {
            return -1;
        }
        N0();
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [T, java.lang.Throwable] */
    public final Object R0(Object obj, Object obj2) {
        boolean z;
        if (!(obj instanceof pj1)) {
            return ym.x;
        }
        boolean z2 = false;
        gq gqVarJ0 = null;
        if (((obj instanceof rr0) || (obj instanceof rs1)) && !(obj instanceof gq) && !(obj2 instanceof iy)) {
            pj1 pj1Var = (pj1) obj;
            Object qj1Var = obj2 instanceof pj1 ? new qj1((pj1) obj2) : obj2;
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w;
                if (atomicReferenceFieldUpdater.compareAndSet(this, pj1Var, qj1Var)) {
                    z = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != pj1Var) {
                    z = false;
                    break;
                }
            }
            if (z) {
                L0(null);
                M0(obj2);
                d0(pj1Var, obj2);
                z2 = true;
            }
            return z2 ? obj2 : ym.z;
        }
        pj1 pj1Var2 = (pj1) obj;
        vo2 vo2VarZ0 = z0(pj1Var2);
        if (vo2VarZ0 == null) {
            return ym.z;
        }
        F1 f1 = pj1Var2 instanceof F1 ? (F1) pj1Var2 : null;
        if (f1 == null) {
            f1 = new F1(vo2VarZ0, null);
        }
        jl3 jl3Var = new jl3();
        synchronized (f1) {
            if (f1.e()) {
                return ym.x;
            }
            f1.i();
            if (f1 != pj1Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = w;
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, pj1Var2, f1)) {
                        z2 = true;
                        break;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == pj1Var2);
                if (!z2) {
                    return ym.z;
                }
            }
            boolean zD = f1.d();
            iy iyVar = obj2 instanceof iy ? (iy) obj2 : null;
            if (iyVar != null) {
                f1.a(iyVar.a);
            }
            ?? B = Boolean.valueOf(zD ^ true).booleanValue() ? f1.b() : 0;
            jl3Var.w = B;
            sd5 sd5Var = sd5.a;
            if (B != 0) {
                K0(vo2VarZ0, B);
            }
            gq gqVar = pj1Var2 instanceof gq ? (gq) pj1Var2 : null;
            if (gqVar == null) {
                vo2 vo2VarF = pj1Var2.f();
                if (vo2VarF != null) {
                    gqVarJ0 = J0(vo2VarF);
                }
            } else {
                gqVarJ0 = gqVar;
            }
            return (gqVarJ0 == null || !S0(f1, gqVarJ0, obj2)) ? j0(f1, obj2) : ym.y;
        }
    }

    public void S(Object obj) {
    }

    public final boolean S0(F1 f1, gq gqVar, Object obj) {
        while (ms1.QnHx.a(gqVar.A, false, new CQf(this, f1, gqVar, obj), 1) == cp2.w) {
            gqVar = J0(gqVar);
            if (gqVar == null) {
                return false;
            }
        }
        return true;
    }

    public final Object U(z80<Object> z80Var) throws Throwable {
        Object objB0;
        do {
            objB0 = B0();
            if (!(objB0 instanceof pj1)) {
                if (objB0 instanceof iy) {
                    throw ((iy) objB0).a;
                }
                return ym.g(objB0);
            }
        } while (P0(objB0) < 0);
        QnHx qnHx = new QnHx(ps0.L(z80Var), this);
        qnHx.r();
        qnHx.B(new im0(r0(new iq3(qnHx)), 0));
        return qnHx.p();
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00bc  */
    public final boolean V(Object obj) {
        py4 py4Var;
        boolean z;
        boolean z2;
        Object objR0 = ym.x;
        if (w0()) {
            do {
                Object objB0 = B0();
                if (!(objB0 instanceof pj1) || ((objB0 instanceof F1) && ((F1) objB0).e())) {
                    objR0 = ym.x;
                    break;
                }
                objR0 = R0(objB0, new iy(f0(obj), false));
            } while (objR0 == ym.z);
            if (objR0 == ym.y) {
                return true;
            }
        }
        if (objR0 == ym.x) {
            Throwable thF0 = null;
            while (true) {
                Object objB1 = B0();
                if (objB1 instanceof F1) {
                    synchronized (objB1) {
                        if (((F1) objB1).g()) {
                            py4Var = ym.A;
                        } else {
                            boolean zD = ((F1) objB1).d();
                            if (obj != null || !zD) {
                                if (thF0 == null) {
                                    thF0 = f0(obj);
                                }
                                ((F1) objB1).a(thF0);
                            }
                            Throwable thB = zD ^ true ? ((F1) objB1).b() : null;
                            if (thB != null) {
                                K0(((F1) objB1).w, thB);
                            }
                            py4Var = ym.x;
                        }
                    }
                } else if (objB1 instanceof pj1) {
                    if (thF0 == null) {
                        thF0 = f0(obj);
                    }
                    pj1 pj1Var = (pj1) objB1;
                    if (pj1Var.c()) {
                        vo2 vo2VarZ0 = z0(pj1Var);
                        if (vo2VarZ0 == null) {
                            z = false;
                        } else {
                            F1 f1 = new F1(vo2VarZ0, thF0);
                            while (true) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w;
                                if (atomicReferenceFieldUpdater.compareAndSet(this, pj1Var, f1)) {
                                    z2 = true;
                                    break;
                                }
                                if (atomicReferenceFieldUpdater.get(this) != pj1Var) {
                                    z2 = false;
                                    break;
                                }
                            }
                            if (z2) {
                                K0(vo2VarZ0, thF0);
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (z) {
                            py4Var = ym.x;
                        }
                    } else {
                        Object objR1 = R0(objB1, new iy(thF0, false));
                        if (objR1 == ym.x) {
                            throw new IllegalStateException(("Cannot happen in " + objB1).toString());
                        }
                        if (objR1 != ym.z) {
                            objR0 = objR1;
                            break;
                        }
                    }
                } else {
                    py4Var = ym.A;
                }
                objR0 = py4Var;
                break;
            }
        }
        if (objR0 != ym.x && objR0 != ym.y) {
            if (objR0 == ym.A) {
                return false;
            }
            S(objR0);
        }
        return true;
    }

    public void W(CancellationException cancellationException) {
        V(cancellationException);
    }

    public final boolean X(Throwable th) {
        if (F0()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        fq fqVar = (fq) this._parentHandle;
        if (fqVar == null || fqVar == cp2.w) {
            return z;
        }
        return fqVar.e(th) || z;
    }

    public String Y() {
        return "Job was cancelled";
    }

    @Override // defpackage.ms1
    public boolean c() {
        Object objB0 = B0();
        return (objB0 instanceof pj1) && ((pj1) objB0).c();
    }

    public boolean c0(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return V(th) && v0();
    }

    public final void d0(pj1 pj1Var, Object obj) {
        fq fqVar = (fq) this._parentHandle;
        if (fqVar != null) {
            fqVar.a();
            this._parentHandle = cp2.w;
        }
        CompletionHandlerException completionHandlerException = null;
        iy iyVar = obj instanceof iy ? (iy) obj : null;
        Throwable th = iyVar != null ? iyVar.a : null;
        if (pj1Var instanceof rs1) {
            try {
                ((rs1) pj1Var).s(th);
                return;
            } catch (Throwable th2) {
                D0(new CompletionHandlerException("Exception in completion handler " + pj1Var + " for " + this, th2));
                return;
            }
        }
        vo2 vo2VarF = pj1Var.f();
        if (vo2VarF != null) {
            for (kotlinx.coroutines.internal.QnHx qnHxL = (kotlinx.coroutines.internal.QnHx) vo2VarF.k(); !ur1.a(qnHxL, vo2VarF); qnHxL = qnHxL.l()) {
                if (qnHxL instanceof rs1) {
                    rs1 rs1Var = (rs1) qnHxL;
                    try {
                        rs1Var.s(th);
                    } catch (Throwable th3) {
                        if (completionHandlerException != null) {
                            Th.a(completionHandlerException, th3);
                        } else {
                            completionHandlerException = new CompletionHandlerException("Exception in completion handler " + rs1Var + " for " + this, th3);
                            sd5 sd5Var = sd5.a;
                        }
                    }
                }
            }
            if (completionHandlerException != null) {
                D0(completionHandlerException);
            }
        }
    }

    @Override // la0.CQf, defpackage.la0
    public final la0 e(la0.F1<?> f1) {
        return la0.CQf.QnHx.b(this, f1);
    }

    public final Throwable f0(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new JobCancellationException(Y(), null, this) : th;
        }
        if (obj != null) {
            return ((mz2) obj).n0();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
    }

    @Override // defpackage.la0
    public final la0 g0(la0 la0Var) {
        return la0.QnHx.a(this, la0Var);
    }

    @Override // la0.CQf
    public final la0.F1<?> getKey() {
        return ms1.CQf.w;
    }

    @Override // la0.CQf, defpackage.la0
    public final <R> R i(R r, x81<? super R, ? super la0.CQf, ? extends R> x81Var) {
        return x81Var.invoke(r, this);
    }

    @Override // defpackage.ms1
    public final boolean isCancelled() {
        Object objB0 = B0();
        return (objB0 instanceof iy) || ((objB0 instanceof F1) && ((F1) objB0).d());
    }

    @Override // la0.CQf, defpackage.la0
    public final <E extends la0.CQf> E j(la0.F1<E> f1) {
        return (E) la0.CQf.QnHx.a(this, f1);
    }

    public final Object j0(F1 f1, Object obj) {
        boolean zD;
        Throwable thU0;
        iy iyVar = obj instanceof iy ? (iy) obj : null;
        Throwable th = iyVar != null ? iyVar.a : null;
        synchronized (f1) {
            zD = f1.d();
            ArrayList<Throwable> arrayListH = f1.h(th);
            thU0 = u0(f1, arrayListH);
            if (thU0 != null && arrayListH.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListH.size()));
                for (Throwable th2 : arrayListH) {
                    if (th2 != thU0 && th2 != thU0 && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        Th.a(thU0, th2);
                    }
                }
            }
        }
        if (thU0 != null && thU0 != th) {
            obj = new iy(thU0, false);
        }
        if (thU0 != null) {
            if (X(thU0) || C0(thU0)) {
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                }
                iy.b.compareAndSet((iy) obj, 0, 1);
            }
        }
        if (!zD) {
            L0(thU0);
        }
        M0(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w;
        Object qj1Var = obj instanceof pj1 ? new qj1((pj1) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, f1, qj1Var) && atomicReferenceFieldUpdater.get(this) == f1) {
        }
        d0(f1, obj);
        return obj;
    }

    @Override // defpackage.ms1
    public void m(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(Y(), null, this);
        }
        W(cancellationException);
    }

    @Override // defpackage.mz2
    public final CancellationException n0() {
        Throwable thB;
        Object objB0 = B0();
        if (objB0 instanceof F1) {
            thB = ((F1) objB0).b();
        } else if (objB0 instanceof iy) {
            thB = ((iy) objB0).a;
        } else {
            if (objB0 instanceof pj1) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objB0).toString());
            }
            thB = null;
        }
        CancellationException cancellationException = thB instanceof CancellationException ? (CancellationException) thB : null;
        return cancellationException == null ? new JobCancellationException("Parent job is ".concat(Q0(objB0)), thB, this) : cancellationException;
    }

    public final Object p0() throws Throwable {
        Object objB0 = B0();
        if (!(!(objB0 instanceof pj1))) {
            throw new IllegalStateException("This job has not completed yet".toString());
        }
        if (objB0 instanceof iy) {
            throw ((iy) objB0).a;
        }
        return ym.g(objB0);
    }

    @Override // defpackage.ms1
    public final am0 r0(j81<? super Throwable, sd5> j81Var) {
        return w(false, true, j81Var);
    }

    @Override // defpackage.ms1
    public final boolean start() {
        int iP0;
        do {
            iP0 = P0(B0());
            if (iP0 == 0) {
                return false;
            }
        } while (iP0 != 1);
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(I0() + '{' + Q0(B0()) + '}');
        sb.append('@');
        sb.append(lf0.a(this));
        return sb.toString();
    }

    public final Throwable u0(F1 f1, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (f1.d()) {
                return new JobCancellationException(Y(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(!(((Throwable) next) instanceof CancellationException)));
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            for (Object obj2 : arrayList) {
                Throwable th3 = (Throwable) obj2;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    obj = obj2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean v0() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x0028 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:84:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e6 A[ADDED_TO_REGION] */
    @Override // defpackage.ms1
    public final am0 w(boolean z, boolean z2, j81<? super Throwable, sd5> j81Var) {
        rs1 km0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Throwable thB;
        ts1 ts1Var;
        int iR;
        boolean z3;
        int i = 1;
        if (z) {
            km0Var = j81Var instanceof ns1 ? (ns1) j81Var : null;
            if (km0Var == null) {
                km0Var = new ds1(j81Var);
            }
        } else {
            km0Var = j81Var instanceof rs1 ? (rs1) j81Var : null;
            if (km0Var == null) {
                km0Var = new km0(j81Var, i);
            }
        }
        km0Var.z = this;
        while (true) {
            Object objB0 = B0();
            boolean z4 = false;
            if (objB0 instanceof rr0) {
                rr0 rr0Var = (rr0) objB0;
                if (rr0Var.w) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = w;
                    do {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, objB0, km0Var)) {
                            z4 = true;
                            break;
                        }
                    } while (atomicReferenceFieldUpdater2.get(this) == objB0);
                    if (z4) {
                        return km0Var;
                    }
                } else {
                    vo2 vo2Var = new vo2();
                    Object oj1Var = vo2Var;
                    if (!rr0Var.w) {
                        oj1Var = new oj1(vo2Var);
                    }
                    do {
                        atomicReferenceFieldUpdater = w;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, rr0Var, oj1Var)) {
                            break;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == rr0Var);
                }
            } else {
                if (!(objB0 instanceof pj1)) {
                    if (z2) {
                        iy iyVar = objB0 instanceof iy ? (iy) objB0 : null;
                        j81Var.invoke(iyVar != null ? iyVar.a : null);
                    }
                    return cp2.w;
                }
                vo2 vo2VarF = ((pj1) objB0).f();
                if (vo2VarF != null) {
                    am0 am0Var = cp2.w;
                    if (z && (objB0 instanceof F1)) {
                        synchronized (objB0) {
                            thB = ((F1) objB0).b();
                            if (thB == null || ((j81Var instanceof gq) && !((F1) objB0).e())) {
                                ts1 ts1Var2 = new ts1(km0Var, this, objB0);
                                while (true) {
                                    int iR2 = vo2VarF.m().r(km0Var, vo2VarF, ts1Var2);
                                    if (iR2 == 1) {
                                        z3 = true;
                                        break;
                                    }
                                    if (iR2 == 2) {
                                        z3 = false;
                                        break;
                                    }
                                }
                                if (z3) {
                                    if (thB == null) {
                                        return km0Var;
                                    }
                                    am0Var = km0Var;
                                }
                            }
                            sd5 sd5Var = sd5.a;
                        }
                        if (thB != null) {
                            if (z2) {
                                j81Var.invoke(thB);
                            }
                            return am0Var;
                        }
                        ts1Var = new ts1(km0Var, this, objB0);
                        do {
                            iR = vo2VarF.m().r(km0Var, vo2VarF, ts1Var);
                            if (iR != 1) {
                                z4 = true;
                                break;
                            }
                        } while (iR != 2);
                        if (z4) {
                            return km0Var;
                        }
                    } else {
                        thB = null;
                        if (thB != null) {
                            if (z2) {
                                j81Var.invoke(thB);
                            }
                            return am0Var;
                        }
                        ts1Var = new ts1(km0Var, this, objB0);
                        do {
                            iR = vo2VarF.m().r(km0Var, vo2VarF, ts1Var);
                            if (iR != 1) {
                                z4 = true;
                                break;
                            }
                        } while (iR != 2);
                        if (z4) {
                            return km0Var;
                        }
                    }
                } else {
                    if (objB0 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    }
                    O0((rs1) objB0);
                }
            }
        }
    }

    public boolean w0() {
        return this instanceof yw;
    }

    public final vo2 z0(pj1 pj1Var) {
        vo2 vo2VarF = pj1Var.f();
        if (vo2VarF != null) {
            return vo2VarF;
        }
        if (pj1Var instanceof rr0) {
            return new vo2();
        }
        if (pj1Var instanceof rs1) {
            O0((rs1) pj1Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + pj1Var).toString());
    }
}
