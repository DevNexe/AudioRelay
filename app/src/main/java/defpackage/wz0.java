package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wz0 implements mz0<Object> {
    public final /* synthetic */ x81 w;
    public final /* synthetic */ mz0 x;

    @if0(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {116, 120}, m = "collect")
    public static final class QnHx extends b90 {
        public int A;
        public wz0 C;
        public nz0 D;
        public z14 E;
        public /* synthetic */ Object z;

        public QnHx(z80 z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.z = obj;
            this.A |= Integer.MIN_VALUE;
            return wz0.this.a(null, this);
        }
    }

    public wz0(x81 x81Var, mz0 mz0Var) {
        this.w = x81Var;
        this.x = mz0Var;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0070 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.mz0
    public final Object a(nz0<? super Object> nz0Var, z80<? super sd5> z80Var) throws Throwable {
        QnHx qnHx;
        Throwable th;
        z14 z14Var;
        wz0 wz0Var;
        nz0<? super Object> nz0Var2;
        mz0 mz0Var;
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
            z14 z14Var2 = new z14(nz0Var, qnHx.x);
            try {
                x81 x81Var = this.w;
                qnHx.C = this;
                qnHx.D = nz0Var;
                qnHx.E = z14Var2;
                qnHx.A = 1;
                if (x81Var.invoke(z14Var2, qnHx) == va0Var) {
                    return va0Var;
                }
                wz0Var = this;
                nz0Var2 = nz0Var;
                z14Var = z14Var2;
                z14Var.j();
                mz0Var = wz0Var.x;
                qnHx.C = null;
                qnHx.D = null;
                qnHx.E = null;
                qnHx.A = 2;
                if (mz0Var.a(nz0Var2, qnHx) == va0Var) {
                    return va0Var;
                }
            } catch (Throwable th2) {
                th = th2;
                z14Var = z14Var2;
                z14Var.j();
                throw th;
            }
        } else if (i2 == 1) {
            z14Var = qnHx.E;
            nz0Var2 = qnHx.D;
            wz0Var = qnHx.C;
            try {
                C0239D.H(obj);
                z14Var.j();
                mz0Var = wz0Var.x;
                qnHx.C = null;
                qnHx.D = null;
                qnHx.E = null;
                qnHx.A = 2;
                if (mz0Var.a(nz0Var2, qnHx) == va0Var) {
                    return va0Var;
                }
            } catch (Throwable th3) {
                th = th3;
                z14Var.j();
                throw th;
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0239D.H(obj);
        }
        return sd5.a;
    }
}
