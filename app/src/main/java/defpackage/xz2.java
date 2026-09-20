package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xz2 implements yg2 {
    public final yg2 w;
    public final dy1 x = new dy1();

    @if0(c = "androidx.compose.runtime.PausableMonotonicFrameClock", f = "PausableMonotonicFrameClock.kt", l = {62, 63}, m = "withFrameNanos")
    public static final class QnHx<R> extends b90 {
        public j81 A;
        public /* synthetic */ Object B;
        public int D;
        public xz2 z;

        public QnHx(z80<? super QnHx> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.B = obj;
            this.D |= Integer.MIN_VALUE;
            return xz2.this.z(null, this);
        }
    }

    public xz2(yg2 yg2Var) {
        this.w = yg2Var;
    }

    @Override // la0.CQf, defpackage.la0
    public final la0 e(la0.F1<?> f1) {
        return la0.CQf.QnHx.b(this, f1);
    }

    @Override // defpackage.la0
    public final la0 g0(la0 la0Var) {
        return la0.QnHx.a(this, la0Var);
    }

    @Override // la0.CQf
    public final la0.F1 getKey() {
        return yg2.QnHx.w;
    }

    @Override // la0.CQf, defpackage.la0
    public final <R> R i(R r, x81<? super R, ? super la0.CQf, ? extends R> x81Var) {
        return x81Var.invoke(r, this);
    }

    @Override // la0.CQf, defpackage.la0
    public final <E extends la0.CQf> E j(la0.F1<E> f1) {
        return (E) la0.CQf.QnHx.a(this, f1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.yg2
    public final <R> Object z(j81<? super Long, ? extends R> j81Var, z80<? super R> z80Var) throws Throwable {
        QnHx qnHx;
        boolean z;
        Object objP;
        xz2 xz2Var;
        if (z80Var instanceof QnHx) {
            qnHx = (QnHx) z80Var;
            int i = qnHx.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                qnHx.D = i - Integer.MIN_VALUE;
            } else {
                qnHx = new QnHx(z80Var);
            }
        } else {
            qnHx = new QnHx(z80Var);
        }
        Object objZ = qnHx.B;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = qnHx.D;
        if (i2 != 0) {
            if (i2 == 1) {
                j81Var = qnHx.A;
                xz2Var = qnHx.z;
                C0239D.H(objZ);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(objZ);
            }
        }
        C0239D.H(objZ);
        dy1 dy1Var = this.x;
        qnHx.z = this;
        qnHx.A = j81Var;
        qnHx.D = 1;
        synchronized (dy1Var.a) {
            z = dy1Var.d;
        }
        if (z) {
            objP = sd5.a;
        } else {
            xm xmVar = new xm(1, ps0.L(qnHx));
            xmVar.r();
            synchronized (dy1Var.a) {
                dy1Var.b.add(xmVar);
            }
            xmVar.B(new cy1(dy1Var, xmVar));
            objP = xmVar.p();
            if (objP != va0Var) {
                objP = sd5.a;
            }
        }
        if (objP == va0Var) {
            return va0Var;
        }
        xz2Var = this;
        yg2 yg2Var = xz2Var.w;
        qnHx.z = null;
        qnHx.A = null;
        qnHx.D = 2;
        objZ = yg2Var.z(j81Var, qnHx);
        return objZ == va0Var ? va0Var : objZ;
    }
}
