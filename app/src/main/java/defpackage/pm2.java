package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pm2 implements rg2, tg2<pm2>, lm2 {
    public final mm2 w;
    public final lm2 x;
    public final kz2 y;

    @if0(c = "androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal", f = "NestedScrollModifierLocal.kt", l = {88, 89}, m = "onPreFling-QWom1Mo")
    public static final class CQf extends b90 {
        public long A;
        public /* synthetic */ Object B;
        public int D;
        public pm2 z;

        public CQf(z80<? super CQf> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.B = obj;
            this.D |= Integer.MIN_VALUE;
            return pm2.this.e(0L, this);
        }
    }

    @if0(c = "androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal", f = "NestedScrollModifierLocal.kt", l = {94, 96}, m = "onPostFling-RZ2iAVY")
    public static final class QnHx extends b90 {
        public long A;
        public long B;
        public /* synthetic */ Object C;
        public int E;
        public pm2 z;

        public QnHx(z80<? super QnHx> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.C = obj;
            this.E |= Integer.MIN_VALUE;
            return pm2.this.a(0L, 0L, this);
        }
    }

    public pm2(lm2 lm2Var, mm2 mm2Var) {
        this.w = mm2Var;
        this.x = lm2Var;
        mm2Var.a = new om2(this);
        this.y = ps0.R(null);
    }

    @Override // defpackage.pg2
    public final /* synthetic */ boolean B(f30.F1 f1) {
        return dj.a(this, f1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // defpackage.lm2
    public final Object a(long j, long j2, z80<? super mh5> z80Var) throws Throwable {
        QnHx qnHx;
        long j3;
        long j4;
        pm2 pm2Var;
        long j5;
        long j6;
        long j7;
        if (z80Var instanceof QnHx) {
            qnHx = (QnHx) z80Var;
            int i = qnHx.E;
            if ((i & Integer.MIN_VALUE) != 0) {
                qnHx.E = i - Integer.MIN_VALUE;
            } else {
                qnHx = new QnHx(z80Var);
            }
        } else {
            qnHx = new QnHx(z80Var);
        }
        Object objA = qnHx.C;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = qnHx.E;
        if (i2 != 0) {
            if (i2 == 1) {
                long j8 = qnHx.B;
                long j9 = qnHx.A;
                pm2Var = qnHx.z;
                C0239D.H(objA);
                j4 = j8;
                j3 = j9;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j7 = qnHx.A;
                C0239D.H(objA);
            }
            j5 = ((mh5) objA).a;
            j6 = j7;
            return new mh5(mh5.e(j6, j5));
        }
        C0239D.H(objA);
        lm2 lm2Var = this.x;
        qnHx.z = this;
        j3 = j;
        qnHx.A = j3;
        j4 = j2;
        qnHx.B = j4;
        qnHx.E = 1;
        objA = lm2Var.a(j, j2, qnHx);
        if (objA == va0Var) {
            return va0Var;
        }
        pm2Var = this;
        long j10 = ((mh5) objA).a;
        pm2 pm2VarG = pm2Var.g();
        if (pm2VarG != null) {
            long jE = mh5.e(j3, j10);
            long jD = mh5.d(j4, j10);
            qnHx.z = null;
            qnHx.A = j10;
            qnHx.E = 2;
            objA = pm2VarG.a(jE, jD, qnHx);
            if (objA == va0Var) {
                return va0Var;
            }
            j7 = j10;
            j5 = ((mh5) objA).a;
            j6 = j7;
        } else {
            j5 = mh5.b;
            j6 = j10;
        }
        return new mh5(mh5.e(j6, j5));
    }

    @Override // defpackage.lm2
    public final long b(int i, long j) {
        long jB;
        pm2 pm2VarG = g();
        if (pm2VarG != null) {
            jB = pm2VarG.b(i, j);
        } else {
            int i2 = kt2.e;
            jB = kt2.b;
        }
        return kt2.g(jB, this.x.b(i, kt2.f(j, jB)));
    }

    @Override // defpackage.rg2
    public final void c(vg2 vg2Var) {
        this.y.setValue((pm2) vg2Var.a(qm2.a));
        this.w.c = g();
    }

    @Override // defpackage.lm2
    public final long d(int i, long j, long j2) {
        long jD;
        long jD2 = this.x.d(i, j, j2);
        pm2 pm2VarG = g();
        if (pm2VarG != null) {
            jD = pm2VarG.d(i, kt2.g(j, jD2), kt2.f(j2, jD2));
        } else {
            int i2 = kt2.e;
            jD = kt2.b;
        }
        return kt2.g(jD2, jD);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x006f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lm2
    public final Object e(long j, z80<? super mh5> z80Var) throws Throwable {
        CQf cQf;
        long j2;
        pm2 pm2Var;
        long j3;
        if (z80Var instanceof CQf) {
            cQf = (CQf) z80Var;
            int i = cQf.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                cQf.D = i - Integer.MIN_VALUE;
            } else {
                cQf = new CQf(z80Var);
            }
        } else {
            cQf = new CQf(z80Var);
        }
        Object objE = cQf.B;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = cQf.D;
        if (i2 != 0) {
            if (i2 == 1) {
                j = cQf.A;
                pm2Var = cQf.z;
                C0239D.H(objE);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j3 = cQf.A;
                C0239D.H(objE);
            }
            return new mh5(mh5.e(j3, ((mh5) objE).a));
        }
        C0239D.H(objE);
        pm2 pm2VarG = g();
        if (pm2VarG != null) {
            cQf.z = this;
            cQf.A = j;
            cQf.D = 1;
            objE = pm2VarG.e(j, cQf);
            if (objE == va0Var) {
                return va0Var;
            }
            pm2Var = this;
        } else {
            j2 = mh5.b;
            pm2Var = this;
        }
        lm2 lm2Var = pm2Var.x;
        long jD = mh5.d(j, j2);
        cQf.z = null;
        cQf.A = j2;
        cQf.D = 2;
        objE = lm2Var.e(jD, cQf);
        if (objE == va0Var) {
            return va0Var;
        }
        j3 = j2;
        return new mh5(mh5.e(j3, ((mh5) objE).a));
        j2 = ((mh5) objE).a;
        lm2 lm2Var2 = pm2Var.x;
        long jD2 = mh5.d(j, j2);
        cQf.z = null;
        cQf.A = j2;
        cQf.D = 2;
        objE = lm2Var2.e(jD2, cQf);
        if (objE == va0Var) {
            return va0Var;
        }
        j3 = j2;
        return new mh5(mh5.e(j3, ((mh5) objE).a));
    }

    public final ua0 f() {
        ua0 ua0VarF;
        pm2 pm2VarG = g();
        if ((pm2VarG == null || (ua0VarF = pm2VarG.f()) == null) && (ua0VarF = this.w.b) == null) {
            throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
        return ua0VarF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final pm2 g() {
        return (pm2) this.y.getValue();
    }

    @Override // defpackage.tg2
    public final mg3<pm2> getKey() {
        return qm2.a;
    }

    @Override // defpackage.tg2
    public final pm2 getValue() {
        return this;
    }

    @Override // defpackage.pg2
    public final Object m0(Object obj, x81 x81Var) {
        return x81Var.invoke(obj, this);
    }

    @Override // defpackage.pg2
    public final /* synthetic */ pg2 y(pg2 pg2Var) {
        return hj0.b(this, pg2Var);
    }

    @Override // defpackage.pg2
    public final Object z(Object obj, x81 x81Var) {
        return x81Var.invoke(this, obj);
    }
}
