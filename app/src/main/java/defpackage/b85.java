package defpackage;

import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class b85 {

    @if0(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", l = {100}, m = "withTimeoutOrNull")
    public static final class QnHx<T> extends b90 {
        public jl3 A;
        public /* synthetic */ Object B;
        public int C;
        public x81 z;

        public QnHx(z80<? super QnHx> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.B = obj;
            this.C |= Integer.MIN_VALUE;
            return b85.b(0L, null, this);
        }
    }

    public static final <U, T extends U> Object a(a85<U, ? super T> a85Var, x81<? super ua0, ? super z80<? super T>, ? extends Object> x81Var) throws Throwable {
        Object iyVar;
        Object objH0;
        a85Var.r0(new km0(S12N.g(a85Var.y.getContext()).b(a85Var.z, a85Var, a85Var.x), 0));
        try {
            sb5.d(2, x81Var);
            iyVar = x81Var.invoke(a85Var, a85Var);
        } catch (Throwable th) {
            iyVar = new iy(th, false);
        }
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        if (iyVar == va0Var || (objH0 = a85Var.H0(iyVar)) == ym.y) {
            return va0Var;
        }
        if (objH0 instanceof iy) {
            Throwable th2 = ((iy) objH0).a;
            if (((th2 instanceof TimeoutCancellationException) && ((TimeoutCancellationException) th2).w == a85Var) ? false : true) {
                throw th2;
            }
            if (iyVar instanceof iy) {
                throw ((iy) iyVar).a;
            }
        } else {
            iyVar = ym.g(objH0);
        }
        return iyVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0061 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x0062  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, a85] */
    public static final <T> Object b(long j, x81<? super ua0, ? super z80<? super T>, ? extends Object> x81Var, z80<? super T> z80Var) throws Throwable {
        QnHx qnHx;
        TimeoutCancellationException e;
        jl3 jl3Var;
        if (z80Var instanceof QnHx) {
            qnHx = (QnHx) z80Var;
            int i = qnHx.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                qnHx.C = i - Integer.MIN_VALUE;
            } else {
                qnHx = new QnHx(z80Var);
            }
        } else {
            qnHx = new QnHx(z80Var);
        }
        Object objA = qnHx.B;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = qnHx.C;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jl3Var = qnHx.A;
            try {
                C0239D.H(objA);
            } catch (TimeoutCancellationException e2) {
                e = e2;
                if (e.w == jl3Var.w) {
                    return null;
                }
                throw e;
            }
        }
        C0239D.H(objA);
        if (j <= 0) {
            return null;
        }
        jl3 jl3Var2 = new jl3();
        try {
            qnHx.z = x81Var;
            qnHx.A = jl3Var2;
            qnHx.C = 1;
            ?? r2 = (T) new a85(j, qnHx);
            jl3Var2.w = r2;
            objA = a(r2, x81Var);
            return objA == va0Var ? va0Var : objA;
        } catch (TimeoutCancellationException e3) {
            e = e3;
            jl3Var = jl3Var2;
            if (e.w == jl3Var.w) {
                return null;
            }
            throw e;
        }
    }
}
