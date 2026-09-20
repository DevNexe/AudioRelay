package defpackage;

import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: classes3.dex */
public final class n01 implements nz0<Object> {
    public final /* synthetic */ x81 w;
    public final /* synthetic */ jl3 x;

    @if0(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2", f = "Reduce.kt", l = {142}, m = "emit")
    public static final class QnHx extends b90 {
        public /* synthetic */ Object A;
        public int B;
        public Object D;
        public n01 z;

        public QnHx(z80 z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.A = obj;
            this.B |= Integer.MIN_VALUE;
            return n01.this.f(null, this);
        }
    }

    public n01(v70 v70Var, jl3 jl3Var) {
        this.w = v70Var;
        this.x = jl3Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nz0
    public final Object f(Object obj, z80<? super sd5> z80Var) throws Throwable {
        QnHx qnHx;
        n01 n01Var;
        T t;
        if (z80Var instanceof QnHx) {
            qnHx = (QnHx) z80Var;
            int i = qnHx.B;
            if ((i & Integer.MIN_VALUE) != 0) {
                qnHx.B = i - Integer.MIN_VALUE;
            } else {
                qnHx = new QnHx(z80Var);
            }
        } else {
            qnHx = new QnHx(z80Var);
        }
        Object objInvoke = qnHx.A;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = qnHx.B;
        boolean z = true;
        if (i2 == 0) {
            C0239D.H(objInvoke);
            qnHx.z = this;
            qnHx.D = obj;
            qnHx.B = 1;
            objInvoke = this.w.invoke(obj, qnHx);
            if (objInvoke == va0Var) {
                return va0Var;
            }
            n01Var = this;
            t = obj;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj2 = qnHx.D;
            n01Var = qnHx.z;
            C0239D.H(objInvoke);
            t = obj2;
        }
        if (((Boolean) objInvoke).booleanValue()) {
            n01Var.x.w = t;
            z = false;
        }
        if (z) {
            return sd5.a;
        }
        throw new AbortFlowException(n01Var);
    }
}
