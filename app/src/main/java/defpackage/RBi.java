package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class RBi<T> implements mz0<T> {

    @if0(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {230}, m = "collect")
    public static final class QnHx extends b90 {
        public /* synthetic */ Object A;
        public final /* synthetic */ RBi<T> B;
        public int C;
        public z14 z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(RBi<T> rBi, z80<? super QnHx> z80Var) {
            super(z80Var);
            this.B = rBi;
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.A = obj;
            this.C |= Integer.MIN_VALUE;
            return this.B.a(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.mz0
    public final Object a(nz0<? super T> nz0Var, z80<? super sd5> z80Var) throws Throwable {
        QnHx qnHx;
        Throwable th;
        z14 z14Var;
        if (z80Var instanceof QnHx) {
            qnHx = (QnHx) z80Var;
            int i = qnHx.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                qnHx.C = i - Integer.MIN_VALUE;
            } else {
                qnHx = new QnHx(this, z80Var);
            }
        } else {
            qnHx = new QnHx(this, z80Var);
        }
        Object obj = qnHx.A;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = qnHx.C;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z14Var = qnHx.z;
            try {
                C0239D.H(obj);
                z14Var.j();
                return sd5.a;
            } catch (Throwable th2) {
                th = th2;
                z14Var.j();
                throw th;
            }
        }
        C0239D.H(obj);
        z14 z14Var2 = new z14(nz0Var, qnHx.x);
        try {
            qnHx.z = z14Var2;
            qnHx.C = 1;
            Object objInvoke = ((d24) this).w.invoke(z14Var2, qnHx);
            if (objInvoke != va0Var) {
                objInvoke = sd5.a;
            }
            if (objInvoke == va0Var) {
                return va0Var;
            }
            z14Var = z14Var2;
            z14Var.j();
            return sd5.a;
        } catch (Throwable th3) {
            th = th3;
            z14Var = z14Var2;
            z14Var.j();
            throw th;
        }
    }
}
