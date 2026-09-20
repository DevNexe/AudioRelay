package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vz0 implements mz0<Object> {
    public final /* synthetic */ mz0 w;
    public final /* synthetic */ y81 x;

    @if0(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {114, 121, 128}, m = "collect")
    public static final class QnHx extends b90 {
        public int A;
        public Object C;
        public nz0 D;
        public /* synthetic */ Object z;

        public QnHx(z80 z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.z = obj;
            this.A |= Integer.MIN_VALUE;
            return vz0.this.a(null, this);
        }
    }

    public vz0(mz0 mz0Var, y81 y81Var) {
        this.w = mz0Var;
        this.x = y81Var;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0078 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x009d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.mz0
    public final Object a(nz0<? super Object> nz0Var, z80<? super sd5> z80Var) {
        QnHx qnHx;
        vz0 vz0Var;
        o75 o75Var;
        y81 y81Var;
        z14 z14Var;
        Throwable th;
        z14 z14Var2;
        y81 y81Var2;
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
            try {
                mz0 mz0Var = this.w;
                qnHx.C = this;
                qnHx.D = nz0Var;
                qnHx.A = 1;
                if (mz0Var.a(nz0Var, qnHx) == va0Var) {
                    return va0Var;
                }
                vz0Var = this;
                z14Var = new z14(nz0Var, qnHx.x);
                y81Var2 = vz0Var.x;
                qnHx.C = z14Var;
                qnHx.D = null;
                qnHx.A = 3;
                if (y81Var2.invoke(z14Var, null, qnHx) == va0Var) {
                    return va0Var;
                }
                z14Var2 = z14Var;
                z14Var2.j();
                return sd5.a;
            } catch (Throwable th2) {
                th = th2;
                vz0Var = this;
                o75Var = new o75(th);
                y81Var = vz0Var.x;
                qnHx.C = th;
                qnHx.D = null;
                qnHx.A = 2;
                if (xnX3.a(o75Var, y81Var, th, qnHx) == va0Var) {
                    return va0Var;
                }
                throw th;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                Throwable th3 = (Throwable) qnHx.C;
                C0239D.H(obj);
                throw th3;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z14Var2 = (z14) qnHx.C;
            try {
                C0239D.H(obj);
                z14Var2.j();
                return sd5.a;
            } catch (Throwable th4) {
                th = th4;
                z14Var2.j();
                throw th;
            }
        }
        nz0Var = qnHx.D;
        vz0Var = (vz0) qnHx.C;
        try {
            C0239D.H(obj);
            z14Var = new z14(nz0Var, qnHx.x);
            try {
                y81Var2 = vz0Var.x;
                qnHx.C = z14Var;
                qnHx.D = null;
                qnHx.A = 3;
                if (y81Var2.invoke(z14Var, null, qnHx) == va0Var) {
                    return va0Var;
                }
                z14Var2 = z14Var;
                z14Var2.j();
                return sd5.a;
            } catch (Throwable th5) {
                th = th5;
                z14Var2 = z14Var;
                z14Var2.j();
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            o75Var = new o75(th);
            y81Var = vz0Var.x;
            qnHx.C = th;
            qnHx.D = null;
            qnHx.A = 2;
            if (xnX3.a(o75Var, y81Var, th, qnHx) == va0Var) {
                return va0Var;
            }
            throw th;
        }
    }
}
