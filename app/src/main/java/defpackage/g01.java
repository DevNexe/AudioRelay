package defpackage;

import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1", f = "Limit.kt", l = {152}, m = "invokeSuspend")
public final class g01 extends px4 implements x81<nz0<Object>, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ mz0<Object> C;
    public final /* synthetic */ y81<nz0<Object>, Object, z80<? super Boolean>, Object> D;

    public static final class QnHx implements nz0<Object> {
        public final /* synthetic */ y81 w;
        public final /* synthetic */ nz0 x;

        /* JADX INFO: renamed from: g01$QnHx$QnHx, reason: collision with other inner class name */
        @if0(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1", f = "Limit.kt", l = {142}, m = "emit")
        public static final class C0131QnHx extends b90 {
            public /* synthetic */ Object A;
            public int B;
            public QnHx z;

            public C0131QnHx(z80 z80Var) {
                super(z80Var);
            }

            @Override // defpackage.m8
            public final Object i(Object obj) {
                this.A = obj;
                this.B |= Integer.MIN_VALUE;
                return QnHx.this.f(null, this);
            }
        }

        public QnHx(y81 y81Var, nz0 nz0Var) {
            this.w = y81Var;
            this.x = nz0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.nz0
        public final Object f(Object obj, z80<? super sd5> z80Var) throws Throwable {
            C0131QnHx c0131QnHx;
            QnHx qnHx;
            if (z80Var instanceof C0131QnHx) {
                c0131QnHx = (C0131QnHx) z80Var;
                int i = c0131QnHx.B;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0131QnHx.B = i - Integer.MIN_VALUE;
                } else {
                    c0131QnHx = new C0131QnHx(z80Var);
                }
            } else {
                c0131QnHx = new C0131QnHx(z80Var);
            }
            Object objInvoke = c0131QnHx.A;
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i2 = c0131QnHx.B;
            if (i2 == 0) {
                C0239D.H(objInvoke);
                c0131QnHx.z = this;
                c0131QnHx.B = 1;
                objInvoke = this.w.invoke(this.x, obj, c0131QnHx);
                if (objInvoke == va0Var) {
                    return va0Var;
                }
                qnHx = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                qnHx = c0131QnHx.z;
                C0239D.H(objInvoke);
            }
            if (((Boolean) objInvoke).booleanValue()) {
                return sd5.a;
            }
            throw new AbortFlowException(qnHx);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g01(mz0<Object> mz0Var, y81<? super nz0<Object>, Object, ? super z80<? super Boolean>, ? extends Object> y81Var, z80<? super g01> z80Var) {
        super(2, z80Var);
        this.C = mz0Var;
        this.D = y81Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        g01 g01Var = new g01(this.C, this.D, z80Var);
        g01Var.B = obj;
        return g01Var;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003f  */
    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        QnHx qnHx;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            nz0 nz0Var = (nz0) this.B;
            mz0<Object> mz0Var = this.C;
            QnHx qnHx2 = new QnHx(this.D, nz0Var);
            try {
                this.B = qnHx2;
                this.A = 1;
                if (mz0Var.a(qnHx2, this) == va0Var) {
                    return va0Var;
                }
            } catch (AbortFlowException e) {
                e = e;
                qnHx = qnHx2;
                if (e.w != qnHx) {
                    throw e;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qnHx = (QnHx) this.B;
            try {
                C0239D.H(obj);
            } catch (AbortFlowException e2) {
                e = e2;
                if (e.w != qnHx) {
                    throw e;
                }
            }
        }
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(nz0<Object> nz0Var, z80<? super sd5> z80Var) {
        return ((g01) a(nz0Var, z80Var)).i(sd5.a);
    }
}
