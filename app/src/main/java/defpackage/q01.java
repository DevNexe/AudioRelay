package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class q01<T> implements nz0 {
    public final /* synthetic */ nz0 w;

    @if0(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {223}, m = "emit")
    public static final class QnHx extends b90 {
        public int A;
        public /* synthetic */ Object z;

        public QnHx(z80 z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.z = obj;
            this.A |= Integer.MIN_VALUE;
            return q01.this.f(null, this);
        }
    }

    public q01(nz0 nz0Var) {
        this.w = nz0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.nz0
    public final Object f(T t, z80<? super sd5> z80Var) throws Throwable {
        QnHx qnHx;
        if (z80Var instanceof QnHx) {
            qnHx = (QnHx) z80Var;
            int i = qnHx.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                qnHx.A = i - Integer.MIN_VALUE;
            } else {
                qnHx = new QnHx(z80Var);
            }
        } else {
            qnHx = new QnHx(z80Var);
        }
        Object obj = qnHx.z;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = qnHx.A;
        if (i2 == 0) {
            C0239D.H(obj);
            if (t != null) {
                qnHx.A = 1;
                if (this.w.f(t, qnHx) == va0Var) {
                    return va0Var;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0239D.H(obj);
        }
        return sd5.a;
    }
}
