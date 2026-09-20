package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CompletionHandlerException;

/* JADX INFO: loaded from: classes3.dex */
public class xm<T> extends kl0<T> implements wm<T>, wa0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater C = AtomicIntegerFieldUpdater.newUpdater(xm.class, "_decision");
    public static final /* synthetic */ AtomicReferenceFieldUpdater D = AtomicReferenceFieldUpdater.newUpdater(xm.class, Object.class, "_state");
    public final la0 A;
    public am0 B;
    private volatile /* synthetic */ int _decision;
    private volatile /* synthetic */ Object _state;
    public final z80<T> z;

    public xm(int i, z80 z80Var) {
        super(i);
        this.z = z80Var;
        this.A = z80Var.getContext();
        this._decision = 0;
        this._state = gHzM.w;
    }

    public static Object C(jp2 jp2Var, Object obj, int i, j81 j81Var, Object obj2) {
        if (obj instanceof iy) {
            return obj;
        }
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        if (!z && obj2 == null) {
            return obj;
        }
        if (j81Var != null || (((jp2Var instanceof lm) && !(jp2Var instanceof u9)) || obj2 != null)) {
            return new fy(obj, jp2Var instanceof lm ? (lm) jp2Var : null, j81Var, obj2, null, 16);
        }
        return obj;
    }

    public static void w(Object obj, j81 j81Var) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + j81Var + ", already has " + obj).toString());
    }

    public final void A(Object obj, int i, j81<? super Throwable, sd5> j81Var) {
        boolean z;
        do {
            Object obj2 = this._state;
            z = true;
            if (!(obj2 instanceof jp2)) {
                if (obj2 instanceof cn) {
                    cn cnVar = (cn) obj2;
                    cnVar.getClass();
                    if (cn.c.compareAndSet(cnVar, 0, 1)) {
                        if (j81Var != null) {
                            j(j81Var, cnVar.a);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            Object objC = C((jp2) obj2, obj, i, j81Var, null);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = D;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objC)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    z = false;
                    break;
                }
            }
        } while (!z);
        if (!v()) {
            m();
        }
        n(i);
    }

    @Override // defpackage.wm
    public final void B(j81<? super Throwable, sd5> j81Var) {
        lm im0Var = j81Var instanceof lm ? (lm) j81Var : new im0(j81Var, 1);
        while (true) {
            Object obj = this._state;
            boolean z = false;
            if (obj instanceof gHzM) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = D;
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, im0Var)) {
                        z = true;
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj);
                if (z) {
                    return;
                }
            } else {
                if (obj instanceof lm) {
                    w(obj, j81Var);
                    throw null;
                }
                boolean z2 = obj instanceof iy;
                if (z2) {
                    iy iyVar = (iy) obj;
                    iyVar.getClass();
                    if (!iy.b.compareAndSet(iyVar, 0, 1)) {
                        w(obj, j81Var);
                        throw null;
                    }
                    if (obj instanceof cn) {
                        if (!z2) {
                            iyVar = null;
                        }
                        i(j81Var, iyVar != null ? iyVar.a : null);
                        return;
                    }
                    return;
                }
                if (obj instanceof fy) {
                    fy fyVar = (fy) obj;
                    if (fyVar.b != null) {
                        w(obj, j81Var);
                        throw null;
                    }
                    if (im0Var instanceof u9) {
                        return;
                    }
                    Throwable th = fyVar.e;
                    if (th != null) {
                        i(j81Var, th);
                        return;
                    }
                    fy fyVarA = fy.a(fyVar, im0Var, null, 29);
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = D;
                    do {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, fyVarA)) {
                            z = true;
                            break;
                        }
                    } while (atomicReferenceFieldUpdater2.get(this) == obj);
                    if (z) {
                        return;
                    }
                } else {
                    if (im0Var instanceof u9) {
                        return;
                    }
                    fy fyVar2 = new fy(obj, im0Var, null, null, null, 28);
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = D;
                    do {
                        if (atomicReferenceFieldUpdater3.compareAndSet(this, obj, fyVar2)) {
                            z = true;
                            break;
                        }
                    } while (atomicReferenceFieldUpdater3.get(this) == obj);
                    if (z) {
                        return;
                    }
                }
            }
        }
    }

    public final py4 D(Object obj, Object obj2, j81<? super Throwable, sd5> j81Var) {
        py4 py4Var;
        boolean z;
        do {
            Object obj3 = this._state;
            boolean z2 = obj3 instanceof jp2;
            py4Var = ym.w;
            if (!z2) {
                if (!(obj3 instanceof fy)) {
                    return null;
                }
                if (obj2 == null || ((fy) obj3).d != obj2) {
                    return null;
                }
                return py4Var;
            }
            Object objC = C((jp2) obj3, obj, this.y, j81Var, obj2);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = D;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, objC)) {
                    z = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != obj3) {
                    z = false;
                    break;
                }
            }
        } while (!z);
        if (!v()) {
            m();
        }
        return py4Var;
    }

    @Override // defpackage.wm
    public final py4 J(Object obj, j81 j81Var) {
        return D(obj, null, j81Var);
    }

    @Override // defpackage.wm
    public final void N(oa0 oa0Var, sd5 sd5Var) {
        z80<T> z80Var = this.z;
        il0 il0Var = z80Var instanceof il0 ? (il0) z80Var : null;
        A(sd5Var, (il0Var != null ? il0Var.z : null) == oa0Var ? 4 : this.y, null);
    }

    @Override // defpackage.wm
    public final py4 O(Throwable th) {
        return D(new iy(th, false), null, null);
    }

    @Override // defpackage.kl0
    public final void a(Object obj, CancellationException cancellationException) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof jp2) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof iy) {
                return;
            }
            boolean z = false;
            if (obj2 instanceof fy) {
                fy fyVar = (fy) obj2;
                if (!(!(fyVar.e != null))) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                fy fyVarA = fy.a(fyVar, null, cancellationException, 15);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = D;
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, fyVarA)) {
                        z = true;
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj2);
                if (z) {
                    lm lmVar = fyVar.b;
                    if (lmVar != null) {
                        h(lmVar, cancellationException);
                    }
                    j81<Throwable, sd5> j81Var = fyVar.c;
                    if (j81Var != null) {
                        j(j81Var, cancellationException);
                        return;
                    }
                    return;
                }
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = D;
                fy fyVar2 = new fy(obj2, null, null, null, cancellationException, 14);
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, fyVar2)) {
                        z = true;
                        break;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj2);
                if (z) {
                    return;
                }
            }
        }
    }

    @Override // defpackage.kl0
    public final z80<T> b() {
        return this.z;
    }

    @Override // defpackage.wm
    public final boolean c() {
        return this._state instanceof jp2;
    }

    @Override // defpackage.kl0
    public final Throwable d(Object obj) {
        Throwable thD = super.d(obj);
        if (thD != null) {
            return thD;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kl0
    public final <T> T e(Object obj) {
        return obj instanceof fy ? (T) ((fy) obj).a : obj;
    }

    @Override // defpackage.kl0
    public final Object g() {
        return this._state;
    }

    @Override // defpackage.z80
    public final la0 getContext() {
        return this.A;
    }

    public final void h(lm lmVar, Throwable th) {
        try {
            lmVar.a(th);
        } catch (Throwable th2) {
            ps0.K(this.A, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void i(j81<? super Throwable, sd5> j81Var, Throwable th) {
        try {
            j81Var.invoke(th);
        } catch (Throwable th2) {
            ps0.K(this.A, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // defpackage.wm
    public final boolean isCancelled() {
        return this._state instanceof cn;
    }

    public final void j(j81<? super Throwable, sd5> j81Var, Throwable th) {
        try {
            j81Var.invoke(th);
        } catch (Throwable th2) {
            ps0.K(this.A, new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // defpackage.wa0
    public final wa0 k() {
        z80<T> z80Var = this.z;
        if (z80Var instanceof wa0) {
            return (wa0) z80Var;
        }
        return null;
    }

    @Override // defpackage.wm
    public final boolean l(Throwable th) {
        Object obj;
        boolean z;
        boolean z2;
        do {
            obj = this._state;
            z = false;
            if (!(obj instanceof jp2)) {
                return false;
            }
            z2 = obj instanceof lm;
            cn cnVar = new cn(this, th, z2);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = D;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, cnVar)) {
                    z = true;
                    break;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        } while (!z);
        lm lmVar = z2 ? (lm) obj : null;
        if (lmVar != null) {
            h(lmVar, th);
        }
        if (!v()) {
            m();
        }
        n(this.y);
        return true;
    }

    public final void m() {
        am0 am0Var = this.B;
        if (am0Var == null) {
            return;
        }
        am0Var.a();
        this.B = cp2.w;
    }

    public final void n(int i) {
        boolean z;
        while (true) {
            int i2 = this._decision;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("Already resumed".toString());
                }
                z = false;
                break;
            } else if (C.compareAndSet(this, 0, 2)) {
                z = true;
                break;
            }
        }
        if (z) {
            return;
        }
        z80<T> z80Var = this.z;
        boolean z2 = i == 4;
        if (!z2 && (z80Var instanceof il0)) {
            boolean z3 = i == 1 || i == 2;
            int i3 = this.y;
            if (z3 == (i3 == 1 || i3 == 2)) {
                oa0 oa0Var = ((il0) z80Var).z;
                la0 context = z80Var.getContext();
                if (oa0Var.o()) {
                    oa0Var.g(context, this);
                    return;
                }
                gu0 gu0VarA = f75.a();
                if (gu0VarA.h0()) {
                    gu0VarA.T(this);
                    return;
                }
                gu0VarA.Z(true);
                try {
                    ps0.g0(this, this.z, true);
                    do {
                    } while (gu0VarA.l0());
                } catch (Throwable th) {
                    try {
                        f(th, null);
                    } finally {
                        gu0VarA.I(true);
                    }
                }
                return;
            }
        }
        ps0.g0(this, z80Var, z2);
    }

    public Throwable o(ss1 ss1Var) {
        return ss1Var.P();
    }

    public final Object p() {
        boolean z;
        ms1 ms1Var;
        il0 il0Var;
        Throwable thN;
        Throwable thN2;
        boolean zV = v();
        while (true) {
            int i = this._decision;
            if (i != 0) {
                if (i != 2) {
                    throw new IllegalStateException("Already suspended".toString());
                }
                z = false;
                break;
            }
            if (C.compareAndSet(this, 0, 1)) {
                z = true;
                break;
            }
        }
        if (z) {
            if (this.B == null) {
                s();
            }
            if (zV) {
                z80<T> z80Var = this.z;
                il0Var = z80Var instanceof il0 ? (il0) z80Var : null;
                if (il0Var != null && (thN2 = il0Var.n(this)) != null) {
                    m();
                    l(thN2);
                }
            }
            return va0.COROUTINE_SUSPENDED;
        }
        if (zV) {
            z80<T> z80Var2 = this.z;
            il0Var = z80Var2 instanceof il0 ? (il0) z80Var2 : null;
            if (il0Var != null && (thN = il0Var.n(this)) != null) {
                m();
                l(thN);
            }
        }
        Object obj = this._state;
        if (obj instanceof iy) {
            throw ((iy) obj).a;
        }
        int i2 = this.y;
        if (!(i2 == 1 || i2 == 2) || (ms1Var = (ms1) this.A.j(ms1.CQf.w)) == null || ms1Var.c()) {
            return e(obj);
        }
        CancellationException cancellationExceptionP = ms1Var.P();
        a(obj, cancellationExceptionP);
        throw cancellationExceptionP;
    }

    @Override // defpackage.wm
    public final py4 q(Object obj, Object obj2) {
        return D(obj, obj2, null);
    }

    public final void r() {
        am0 am0VarS = s();
        if (am0VarS != null && t()) {
            am0VarS.a();
            this.B = cp2.w;
        }
    }

    public final am0 s() {
        ms1 ms1Var = (ms1) this.A.j(ms1.CQf.w);
        if (ms1Var == null) {
            return null;
        }
        am0 am0VarA = ms1.QnHx.a(ms1Var, true, new cq(this), 2);
        this.B = am0VarA;
        return am0VarA;
    }

    public final boolean t() {
        return !(this._state instanceof jp2);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(y());
        sb.append('(');
        sb.append(lf0.b(this.z));
        sb.append("){");
        Object obj = this._state;
        if (obj instanceof jp2) {
            str = "Active";
        } else {
            str = obj instanceof cn ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(lf0.a(this));
        return sb.toString();
    }

    @Override // defpackage.wm
    public final void u() {
        n(this.y);
    }

    public final boolean v() {
        return (this.y == 2) && ((il0) this.z).i();
    }

    @Override // defpackage.z80
    public final void x(Object obj) {
        Throwable thA = fq3.a(obj);
        if (thA != null) {
            obj = new iy(thA, false);
        }
        A(obj, this.y, null);
    }

    public String y() {
        return "CancellableContinuation";
    }

    public final boolean z() {
        Object obj = this._state;
        if ((obj instanceof fy) && ((fy) obj).d != null) {
            m();
            return false;
        }
        this._decision = 0;
        this._state = gHzM.w;
        return true;
    }
}
