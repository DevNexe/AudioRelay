package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ey2<T> implements nz0 {
    public final /* synthetic */ nz0 w;

    @if0(c = "com.google.accompanist.pager.Pager$Pager$4$1$invokeSuspend$$inlined$filter$1$2", f = "Pager.kt", l = {224}, m = "emit")
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
            return ey2.this.f(null, this);
        }
    }

    public ey2(nz0 nz0Var) {
        this.w = nz0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.nz0
    public final Object f(Object obj, z80 z80Var) throws Throwable {
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
        Object obj2 = qnHx.z;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = qnHx.A;
        if (i2 == 0) {
            C0239D.H(obj2);
            if (!((Boolean) obj).booleanValue()) {
                qnHx.A = 1;
                if (this.w.f(obj, qnHx) == va0Var) {
                    return va0Var;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0239D.H(obj2);
        }
        return sd5.a;
    }
}
