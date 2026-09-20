package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class a01<T> implements nz0 {
    public final /* synthetic */ hl3 w;
    public final /* synthetic */ int x;
    public final /* synthetic */ nz0<T> y;

    @if0(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1", f = "Limit.kt", l = {25}, m = "emit")
    public static final class QnHx extends b90 {
        public final /* synthetic */ a01<T> A;
        public int B;
        public /* synthetic */ Object z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(a01<? super T> a01Var, z80<? super QnHx> z80Var) {
            super(z80Var);
            this.A = a01Var;
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.z = obj;
            this.B |= Integer.MIN_VALUE;
            return this.A.f(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a01(hl3 hl3Var, int i, nz0<? super T> nz0Var) {
        this.w = hl3Var;
        this.x = i;
        this.y = nz0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.nz0
    public final Object f(T t, z80<? super sd5> z80Var) throws Throwable {
        QnHx qnHx;
        if (z80Var instanceof QnHx) {
            qnHx = (QnHx) z80Var;
            int i = qnHx.B;
            if ((i & Integer.MIN_VALUE) != 0) {
                qnHx.B = i - Integer.MIN_VALUE;
            } else {
                qnHx = new QnHx(this, z80Var);
            }
        } else {
            qnHx = new QnHx(this, z80Var);
        }
        Object obj = qnHx.z;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = qnHx.B;
        if (i2 == 0) {
            C0239D.H(obj);
            hl3 hl3Var = this.w;
            int i3 = hl3Var.w;
            if (i3 < this.x) {
                hl3Var.w = i3 + 1;
                return sd5.a;
            }
            qnHx.B = 1;
            if (this.y.f(t, qnHx) == va0Var) {
                return va0Var;
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
