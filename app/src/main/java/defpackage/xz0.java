package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xz0 implements mz0<Object> {
    public final /* synthetic */ mz0 w;
    public final /* synthetic */ y81 x;

    @if0(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", f = "Errors.kt", l = {113, 114}, m = "collect")
    public static final class QnHx extends b90 {
        public int A;
        public xz0 C;
        public nz0 D;
        public /* synthetic */ Object z;

        public QnHx(z80 z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.z = obj;
            this.A |= Integer.MIN_VALUE;
            return xz0.this.a(null, this);
        }
    }

    public xz0(mz0 mz0Var, y81 y81Var) {
        this.w = mz0Var;
        this.x = y81Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.mz0
    public final Object a(nz0<? super Object> nz0Var, z80<? super sd5> z80Var) throws Throwable {
        QnHx qnHx;
        xz0 xz0Var;
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
        Object objC = qnHx.z;
        Object obj = va0.COROUTINE_SUSPENDED;
        int i2 = qnHx.A;
        if (i2 != 0) {
            if (i2 == 1) {
                nz0Var = qnHx.D;
                xz0Var = qnHx.C;
                C0239D.H(objC);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(objC);
            }
            return sd5.a;
        }
        C0239D.H(objC);
        qnHx.C = this;
        qnHx.D = nz0Var;
        qnHx.A = 1;
        objC = kd.c(qnHx, this.w, nz0Var);
        if (objC == obj) {
            return obj;
        }
        xz0Var = this;
        Throwable th = (Throwable) objC;
        if (th != null) {
            y81 y81Var = xz0Var.x;
            qnHx.C = null;
            qnHx.D = null;
            qnHx.A = 2;
            if (y81Var.invoke(nz0Var, th, qnHx) == obj) {
                return obj;
            }
        }
        return sd5.a;
    }
}
