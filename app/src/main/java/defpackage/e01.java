package defpackage;

import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: classes3.dex */
public final class e01 implements mz0<Object> {
    public final /* synthetic */ mz0 w;
    public final /* synthetic */ int x = 1;

    @if0(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", f = "Limit.kt", l = {115}, m = "collect")
    public static final class QnHx extends b90 {
        public int A;
        public nz0 C;
        public /* synthetic */ Object z;

        public QnHx(z80 z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.z = obj;
            this.A |= Integer.MIN_VALUE;
            return e01.this.a(null, this);
        }
    }

    public e01(mz0 mz0Var) {
        this.w = mz0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [nz0, nz0<? super java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    @Override // defpackage.mz0
    public final Object a(nz0<? super Object> nz0Var, z80<? super sd5> z80Var) throws Throwable {
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
        try {
            if (i2 == 0) {
                C0239D.H(obj);
                hl3 hl3Var = new hl3();
                mz0 mz0Var = this.w;
                f01 f01Var = new f01(hl3Var, this.x, nz0Var);
                qnHx.C = nz0Var;
                qnHx.A = 1;
                Object objA = mz0Var.a(f01Var, qnHx);
                nz0Var = objA;
                if (objA == va0Var) {
                    return va0Var;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nz0 nz0Var2 = qnHx.C;
                C0239D.H(obj);
                nz0Var = nz0Var2;
            }
        } catch (AbortFlowException e) {
            if (e.w != nz0Var) {
                throw e;
            }
        }
        return sd5.a;
    }
}
