package defpackage;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NUlFixed<E> extends mw0t<E> implements jo<E> {

    public static class CQf<E> extends mk3<E> {
        public final int A;
        public final wm<Object> z;

        public CQf(int i, xm xmVar) {
            this.z = xmVar;
            this.A = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ok3
        public final py4 b(Object obj) {
            if (this.z.J(this.A == 1 ? new ap(obj) : obj, s(obj)) == null) {
                return null;
            }
            return ym.w;
        }

        @Override // defpackage.ok3
        public final void g(E e) {
            this.z.u();
        }

        @Override // defpackage.mk3
        public final void t(nt<?> ntVar) {
            int i = this.A;
            wm<Object> wmVar = this.z;
            if (i == 1) {
                wmVar.x(new ap(new ap.QnHx(ntVar.z)));
            } else {
                wmVar.x(new fq3.QnHx(ntVar.x()));
            }
        }

        @Override // kotlinx.coroutines.internal.QnHx
        public final String toString() {
            StringBuilder sb = new StringBuilder("ReceiveElement@");
            sb.append(lf0.a(this));
            sb.append("[receiveMode=");
            return qc0.a(sb, this.A, ']');
        }
    }

    public static final class F1<E> extends CQf<E> {
        public final j81<E, sd5> B;

        public F1(xm xmVar, int i, j81 j81Var) {
            super(i, xmVar);
            this.B = j81Var;
        }

        @Override // defpackage.mk3
        public final j81<Throwable, sd5> s(E e) {
            return new zu2(this.B, e, this.z.getContext());
        }
    }

    public static class LPt8Fixed<E> extends mk3<E> {
        public final wm<Boolean> A;
        public final QnHx<E> z;

        public LPt8Fixed(QnHx qnHx, xm xmVar) {
            this.z = qnHx;
            this.A = xmVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ok3
        public final py4 b(Object obj) {
            if (this.A.J(Boolean.TRUE, s(obj)) == null) {
                return null;
            }
            return ym.w;
        }

        @Override // defpackage.ok3
        public final void g(E e) {
            this.z.b = e;
            this.A.u();
        }

        @Override // defpackage.mk3
        public final j81<Throwable, sd5> s(E e) {
            j81<E, sd5> j81Var = this.z.a.w;
            if (j81Var != null) {
                return new zu2(j81Var, e, this.A.getContext());
            }
            return null;
        }

        @Override // defpackage.mk3
        public final void t(nt<?> ntVar) {
            Throwable th = ntVar.z;
            wm<Boolean> wmVar = this.A;
            if ((th == null ? wmVar.q(Boolean.FALSE, null) : wmVar.O(ntVar.x())) != null) {
                this.z.b = ntVar;
                wmVar.u();
            }
        }

        @Override // kotlinx.coroutines.internal.QnHx
        public final String toString() {
            return "ReceiveHasNext@" + lf0.a(this);
        }
    }

    /* JADX INFO: renamed from: NUl$NUl, reason: collision with other inner class name */
    public final class C0005NUl extends u9 {
        public final mk3<?> w;

        public C0005NUl(mk3<?> mk3Var) {
            this.w = mk3Var;
        }

        @Override // defpackage.mm
        public final void a(Throwable th) {
            if (this.w.p()) {
                NUlFixed.this.getClass();
            }
        }

        @Override // defpackage.j81
        public final /* bridge */ /* synthetic */ sd5 invoke(Throwable th) {
            a(th);
            return sd5.a;
        }

        public final String toString() {
            return "RemoveReceiveOnCancel[" + this.w + ']';
        }
    }

    public static final class QnHx<E> implements wo<E> {
        public final NUlFixed<E> a;
        public Object b = defpackage.YKK.z;

        public QnHx(NUlFixed<E> nUl) {
            this.a = nUl;
        }

        @Override // defpackage.wo
        public final Object a(b90 b90Var) throws Throwable {
            Object obj = this.b;
            py4 py4Var = defpackage.YKK.z;
            boolean z = false;
            if (obj != py4Var) {
                if (obj instanceof nt) {
                    nt ntVar = (nt) obj;
                    if (ntVar.z != null) {
                        Throwable thX = ntVar.x();
                        int i = mr4.a;
                        throw thX;
                    }
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
            NUlFixed<E> nUl = this.a;
            Object objB = nUl.B();
            this.b = objB;
            if (objB != py4Var) {
                if (objB instanceof nt) {
                    nt ntVar2 = (nt) objB;
                    if (ntVar2.z != null) {
                        Throwable thX2 = ntVar2.x();
                        int i2 = mr4.a;
                        throw thX2;
                    }
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
            xm xmVarD = AY.D(ps0.L(b90Var));
            LPt8Fixed lPt8 = new LPt8Fixed(this, xmVarD);
            while (!nUl.v(lPt8)) {
                Object objB2 = nUl.B();
                this.b = objB2;
                if (objB2 instanceof nt) {
                    nt ntVar3 = (nt) objB2;
                    if (ntVar3.z == null) {
                        xmVarD.x(Boolean.FALSE);
                    } else {
                        xmVarD.x(new fq3.QnHx(ntVar3.x()));
                    }
                } else if (objB2 != py4Var) {
                    Boolean bool = Boolean.TRUE;
                    j81<E, sd5> j81Var = nUl.w;
                    xmVarD.A(bool, xmVarD.y, j81Var != null ? new zu2(j81Var, objB2, xmVarD.A) : null);
                }
                return xmVarD.p();
            }
            xmVarD.B(nUl.new C0005NUl(lPt8));
            return xmVarD.p();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.wo
        public final E next() throws Throwable {
            E e = (E) this.b;
            if (e instanceof nt) {
                Throwable thX = ((nt) e).x();
                int i = mr4.a;
                throw thX;
            }
            py4 py4Var = defpackage.YKK.z;
            if (e == py4Var) {
                throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
            }
            this.b = py4Var;
            return e;
        }
    }

    public static final class YKK extends kotlinx.coroutines.internal.QnHx.AbstractC0158QnHx {
        public final /* synthetic */ NUlFixed d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public YKK(kotlinx.coroutines.internal.QnHx qnHx, NUlFixed nUl) {
            super(qnHx);
            this.d = nUl;
        }

        @Override // defpackage.Ej
        public final py4 c(Object obj) {
            if (this.d.x()) {
                return null;
            }
            return r1.x;
        }
    }

    @if0(c = "kotlinx.coroutines.channels.AbstractChannel", f = "AbstractChannel.kt", l = {633}, m = "receiveCatching-JP2dKIU")
    public static final class auxFixed extends b90 {
        public final /* synthetic */ NUlFixed<E> A;
        public int B;
        public /* synthetic */ Object z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public auxFixed(NUlFixed<E> nUl, z80<? super auxFixed> z80Var) {
            super(z80Var);
            this.A = nUl;
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            this.z = obj;
            this.B |= Integer.MIN_VALUE;
            Object objD = this.A.d(this);
            return objD == va0.COROUTINE_SUSPENDED ? objD : new ap(objD);
        }
    }

    public NUlFixed(j81<? super E, sd5> j81Var) {
        super(j81Var);
    }

    public void A(Object obj, nt<?> ntVar) {
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                ((p94) obj).u(ntVar);
                return;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                ((p94) arrayList.get(size)).u(ntVar);
            }
        }
    }

    public Object B() {
        while (true) {
            p94 p94VarU = u();
            if (p94VarU == null) {
                return defpackage.YKK.z;
            }
            if (p94VarU.v() != null) {
                p94VarU.s();
                return p94VarU.t();
            }
            p94VarU.w();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> Object C(int i, z80<? super R> z80Var) {
        xm xmVarD = AY.D(ps0.L(z80Var));
        j81<E, sd5> j81Var = this.w;
        CQf cQf = j81Var == null ? new CQf(i, xmVarD) : new F1(xmVarD, i, j81Var);
        while (!v(cQf)) {
            Object objB = B();
            if (objB instanceof nt) {
                cQf.t((nt) objB);
            } else if (objB != defpackage.YKK.z) {
                xmVarD.A(cQf.A == 1 ? new ap(objB) : objB, xmVarD.y, cQf.s(objB));
            }
            return xmVarD.p();
        }
        xmVarD.B(new C0005NUl(cQf));
        return xmVarD.p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nk3
    public final Object E(z80<? super E> z80Var) {
        Object objB = B();
        return (objB == defpackage.YKK.z || (objB instanceof nt)) ? C(0, z80Var) : objB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.nk3
    public final Object d(z80<? super ap<? extends E>> z80Var) throws Throwable {
        auxFixed auxVar;
        if (z80Var instanceof auxFixed) {
            auxVar = (auxFixed) z80Var;
            int i = auxVar.B;
            if ((i & Integer.MIN_VALUE) != 0) {
                auxVar.B = i - Integer.MIN_VALUE;
            } else {
                auxVar = new auxFixed(this, z80Var);
            }
        } else {
            auxVar = new auxFixed(this, z80Var);
        }
        Object objC = auxVar.z;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = auxVar.B;
        if (i2 == 0) {
            C0239D.H(objC);
            Object objB = B();
            if (objB != defpackage.YKK.z) {
                return objB instanceof nt ? new ap.QnHx(((nt) objB).z) : objB;
            }
            auxVar.B = 1;
            objC = C(1, auxVar);
            if (objC == va0Var) {
                return va0Var;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0239D.H(objC);
        }
        return ((ap) objC).a;
    }

    @Override // defpackage.nk3
    public final wo<E> iterator() {
        return new QnHx(this);
    }

    @Override // defpackage.nk3
    public final void m(CancellationException cancellationException) {
        if (y()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new CancellationException(getClass().getSimpleName().concat(" was cancelled"));
        }
        z(a(cancellationException));
    }

    @Override // defpackage.nk3
    public final Object r() {
        Object objB = B();
        if (objB == defpackage.YKK.z) {
            return ap.b;
        }
        return objB instanceof nt ? new ap.QnHx(((nt) objB).z) : objB;
    }

    @Override // defpackage.mw0t
    public final ok3<E> s() {
        ok3<E> ok3VarS = super.s();
        if (ok3VarS != null) {
            boolean z = ok3VarS instanceof nt;
        }
        return ok3VarS;
    }

    public boolean v(mk3<? super E> mk3Var) {
        int iR;
        kotlinx.coroutines.internal.QnHx qnHxM;
        boolean zW = w();
        h52 h52Var = this.x;
        if (!zW) {
            YKK ykk = new YKK(mk3Var, this);
            do {
                kotlinx.coroutines.internal.QnHx qnHxM2 = h52Var.m();
                if (!(!(qnHxM2 instanceof p94))) {
                    break;
                }
                iR = qnHxM2.r(mk3Var, h52Var, ykk);
                if (iR == 1) {
                    return true;
                }
            } while (iR != 2);
        } else {
            do {
                qnHxM = h52Var.m();
                if (!(!(qnHxM instanceof p94))) {
                }
            } while (!qnHxM.h(mk3Var, h52Var));
            return true;
        }
        return false;
    }

    public abstract boolean w();

    public abstract boolean x();

    public boolean y() {
        kotlinx.coroutines.internal.QnHx qnHxL = this.x.l();
        nt<?> ntVar = null;
        nt<?> ntVar2 = qnHxL instanceof nt ? (nt) qnHxL : null;
        if (ntVar2 != null) {
            k(ntVar2);
            ntVar = ntVar2;
        }
        return ntVar != null && x();
    }

    public void z(boolean z) {
        nt<?> ntVarJ = j();
        if (ntVarJ == null) {
            throw new IllegalStateException("Cannot happen".toString());
        }
        Object objA0 = null;
        while (true) {
            kotlinx.coroutines.internal.QnHx qnHxM = ntVarJ.m();
            if (qnHxM instanceof h52) {
                A(objA0, ntVarJ);
                return;
            } else if (qnHxM.p()) {
                objA0 = ps0.a0(objA0, (p94) qnHxM);
            } else {
                ((mo3) qnHxM.k()).a.n();
            }
        }
    }
}
