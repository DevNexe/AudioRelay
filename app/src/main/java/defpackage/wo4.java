package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wo4 implements qy0 {
    public final zo4 a;
    public final nf0<Float> b;
    public final Ah<Float> c;
    public final y81<zo4, Integer, Integer, Integer> d;
    public final j81<zo4, Float> e;
    public final kz2 f;

    public static final class CQf extends cx1 implements j81<rjr<Float, JW>, sd5> {
        public final /* synthetic */ int A;
        public final /* synthetic */ gl3 w;
        public final /* synthetic */ l64 x;
        public final /* synthetic */ gl3 y;
        public final /* synthetic */ wo4 z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(gl3 gl3Var, l64 l64Var, gl3 gl3Var2, wo4 wo4Var, int i) {
            super(1);
            this.w = gl3Var;
            this.x = l64Var;
            this.y = gl3Var2;
            this.z = wo4Var;
            this.A = i;
        }

        @Override // defpackage.j81
        public final sd5 invoke(rjr<Float, JW> rjrVar) {
            rjr<Float, JW> rjrVar2 = rjrVar;
            float fFloatValue = rjrVar2.b().floatValue();
            gl3 gl3Var = this.w;
            float f = fFloatValue - gl3Var.w;
            l64 l64Var = this.x;
            float fA = l64Var.a(f);
            gl3Var.w = rjrVar2.b().floatValue();
            this.y.w = rjrVar2.c().floatValue();
            wo4 wo4Var = this.z;
            ap4 ap4VarE = wo4Var.a.e();
            if (ap4VarE == null) {
                rjrVar2.a();
            } else {
                if (wo4.b(wo4Var, rjrVar2, ap4VarE, this.A, new xo4(l64Var)) || Math.abs(f - fA) > 0.5f) {
                    rjrVar2.a();
                }
            }
            return sd5.a;
        }
    }

    @if0(c = "dev.chrisbanes.snapper.SnapperFlingBehavior", f = "SnapperFlingBehavior.kt", l = {551}, m = "performSpringFling")
    public static final class QnHx extends b90 {
        public gl3 A;
        public /* synthetic */ Object B;
        public int D;
        public wo4 z;

        public QnHx(z80<? super QnHx> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.B = obj;
            this.D |= Integer.MIN_VALUE;
            return wo4.this.f(null, null, 0, 0.0f, this);
        }
    }

    public wo4() {
        throw null;
    }

    public wo4(o12 o12Var, nf0 nf0Var, Ah ah) {
        hy2.QnHx qnHx = hy2.a;
        yo4.QnHx qnHx2 = yo4.b;
        this.a = o12Var;
        this.b = nf0Var;
        this.c = ah;
        this.d = qnHx;
        this.e = qnHx2;
        this.f = ps0.R(null);
    }

    public static final boolean b(wo4 wo4Var, rjr rjrVar, ap4 ap4Var, int i, j81 j81Var) {
        int iD;
        wo4Var.getClass();
        float fFloatValue = ((Number) rjrVar.c()).floatValue();
        zo4 zo4Var = wo4Var.a;
        if (fFloatValue <= 0.0f || ap4Var.a() < i) {
            iD = (fFloatValue >= 0.0f || ap4Var.a() > i + (-1)) ? 0 : zo4Var.d(ap4Var.a() + 1);
        } else {
            iD = zo4Var.d(ap4Var.a());
        }
        if (iD == 0) {
            return false;
        }
        j81Var.invoke(Float.valueOf(iD));
        return true;
    }

    @Override // defpackage.qy0
    public final Object a(z64.CQf.C0230CQf c0230CQf, float f, z80 z80Var) {
        zo4 zo4Var = this.a;
        if (!zo4Var.b() || !zo4Var.a()) {
            return new Float(f);
        }
        float fFloatValue = this.e.invoke(zo4Var).floatValue();
        boolean z = false;
        if (!(fFloatValue > 0.0f)) {
            throw new IllegalArgumentException("Distance returned by maximumFlingDistance should be greater than 0".toString());
        }
        ap4 ap4VarE = zo4Var.e();
        if (ap4VarE == null) {
            return new Float(f);
        }
        int iIntValue = this.d.invoke(zo4Var, new Integer(f < 0.0f ? ap4VarE.a() + 1 : ap4VarE.a()), new Integer(zo4Var.c(f, fFloatValue, this.b))).intValue();
        if (iIntValue >= 0 && iIntValue < zo4Var.h()) {
            z = true;
        }
        if (z) {
            return d(c0230CQf, iIntValue, f, z80Var);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final float c(float f) {
        zo4 zo4Var = this.a;
        if (f < 0.0f && !zo4Var.b()) {
            return f;
        }
        if (f <= 0.0f || zo4Var.a()) {
            return 0.0f;
        }
        return f;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:55:0x010d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(z64.CQf.C0230CQf c0230CQf, int i, float f, z80 z80Var) throws Throwable {
        so4 so4Var;
        boolean z;
        l64 l64Var;
        int i2;
        float fFloatValue;
        wo4 wo4Var;
        wo4 wo4Var2;
        ap4 ap4VarE;
        l64 l64Var2;
        if (z80Var instanceof so4) {
            so4Var = (so4) z80Var;
            int i3 = so4Var.F;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                so4Var.F = i3 - Integer.MIN_VALUE;
            } else {
                so4Var = new so4(this, z80Var);
            }
        } else {
            so4Var = new so4(this, z80Var);
        }
        Object objE = so4Var.D;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i4 = so4Var.F;
        if (i4 != 0) {
            if (i4 == 1) {
                float f2 = so4Var.C;
                i = so4Var.B;
                l64 l64Var3 = so4Var.A;
                wo4Var2 = so4Var.z;
                C0239D.H(objE);
                f = f2;
                l64Var2 = l64Var3;
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wo4Var = so4Var.z;
                C0239D.H(objE);
            }
            fFloatValue = ((Number) objE).floatValue();
            return new Float(wo4Var.c(fFloatValue));
        }
        C0239D.H(objE);
        zo4 zo4Var = this.a;
        ap4 ap4VarE2 = zo4Var.e();
        if (ap4VarE2 == null) {
            return new Float(f);
        }
        if (ap4VarE2.a() == i && zo4Var.d(ap4VarE2.a()) == 0) {
            return new Float(c(f));
        }
        if (Math.abs(f) < 0.5f) {
            z = false;
        } else {
            qb5 qb5Var = mg5.a;
            float f3 = ((JW) this.b.a().e(new JW(0.0f), new JW(f))).a;
            if (f >= 0.0f ? f3 < zo4Var.d(ap4VarE2.a() + 1) : f3 > zo4Var.d(ap4VarE2.a())) {
                z = false;
            } else {
                z = true;
            }
        }
        if (z) {
            so4Var.z = this;
            so4Var.A = c0230CQf;
            so4Var.B = i;
            so4Var.C = f;
            so4Var.F = 1;
            objE = e(c0230CQf, ap4VarE2, i, f, true, so4Var);
            if (objE == va0Var) {
                return va0Var;
            }
            wo4Var2 = this;
            l64Var2 = c0230CQf;
        } else {
            l64Var = c0230CQf;
            i2 = i;
            fFloatValue = f;
            wo4Var = this;
        }
        ap4VarE = wo4Var.a.e();
        if (ap4VarE == null) {
            return new Float(f);
        }
        if (ap4VarE.a() == i2 || wo4Var.a.d(i2) != 0) {
            so4Var.z = wo4Var;
            so4Var.A = null;
            so4Var.F = 2;
            objE = wo4Var.f(l64Var, ap4VarE, i2, fFloatValue, so4Var);
            if (objE == va0Var) {
                return va0Var;
            }
            fFloatValue = ((Number) objE).floatValue();
        }
        return new Float(wo4Var.c(fFloatValue));
        l64Var = l64Var2;
        i2 = i;
        fFloatValue = ((Number) objE).floatValue();
        wo4Var = wo4Var2;
        ap4VarE = wo4Var.a.e();
        if (ap4VarE == null) {
            return new Float(f);
        }
        if (ap4VarE.a() == i2) {
        }
        so4Var.z = wo4Var;
        so4Var.A = null;
        so4Var.F = 2;
        objE = wo4Var.f(l64Var, ap4VarE, i2, fFloatValue, so4Var);
        if (objE == va0Var) {
            return va0Var;
        }
        fFloatValue = ((Number) objE).floatValue();
        return new Float(wo4Var.c(fFloatValue));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object e(z64.CQf.C0230CQf c0230CQf, ap4 ap4Var, int i, float f, boolean z, z80 z80Var) throws Throwable {
        to4 to4Var;
        wo4 wo4Var;
        gl3 gl3Var;
        if (z80Var instanceof to4) {
            to4Var = (to4) z80Var;
            int i2 = to4Var.D;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                to4Var.D = i2 - Integer.MIN_VALUE;
            } else {
                to4Var = new to4(this, z80Var);
            }
        } else {
            to4Var = new to4(this, z80Var);
        }
        to4 to4Var2 = to4Var;
        Object obj = to4Var2.B;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i3 = to4Var2.D;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gl3Var = to4Var2.A;
            wo4Var = to4Var2.z;
            try {
                C0239D.H(obj);
                wo4Var.g(null);
                return new Float(gl3Var.w);
            } catch (Throwable th) {
                th = th;
                wo4Var.g(null);
                throw th;
            }
        }
        C0239D.H(obj);
        if (ap4Var.a() == i && this.a.d(ap4Var.a()) == 0) {
            return new Float(c(f));
        }
        gl3 gl3Var2 = new gl3();
        gl3Var2.w = f;
        gl3 gl3Var3 = new gl3();
        boolean z2 = z && Math.abs(i - ap4Var.a()) >= 2;
        try {
            g(new Integer(i));
            AOdm aOdmI = fp1.i(0.0f, f, 28);
            nf0<Float> nf0Var = this.b;
            vo4 vo4Var = new vo4(gl3Var3, c0230CQf, gl3Var2, this, z2, i);
            to4Var2.z = this;
            to4Var2.A = gl3Var2;
            to4Var2.D = 1;
            if (kx4.b(aOdmI, nf0Var, vo4Var, to4Var2) == va0Var) {
                return va0Var;
            }
            wo4Var = this;
            gl3Var = gl3Var2;
            wo4Var.g(null);
            return new Float(gl3Var.w);
        } catch (Throwable th2) {
            th = th2;
            wo4Var = this;
            wo4Var.g(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object f(l64 l64Var, ap4 ap4Var, int i, float f, z80<? super Float> z80Var) throws Throwable {
        QnHx qnHx;
        Integer num;
        wo4 wo4Var;
        gl3 gl3Var;
        wo4 wo4Var2;
        if (z80Var instanceof QnHx) {
            qnHx = (QnHx) z80Var;
            int i2 = qnHx.D;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qnHx.D = i2 - Integer.MIN_VALUE;
            } else {
                qnHx = new QnHx(z80Var);
            }
        } else {
            qnHx = new QnHx(z80Var);
        }
        QnHx qnHx2 = qnHx;
        Object obj = qnHx2.B;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i3 = qnHx2.D;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gl3Var = qnHx2.A;
            wo4 wo4Var3 = qnHx2.z;
            try {
                C0239D.H(obj);
                wo4Var2 = wo4Var3;
                num = null;
                wo4Var2.g(num);
                return new Float(gl3Var.w);
            } catch (Throwable th) {
                th = th;
                wo4Var = wo4Var3;
                num = null;
                wo4Var.g(num);
                throw th;
            }
        }
        C0239D.H(obj);
        gl3 gl3Var2 = new gl3();
        float f2 = 0.0f;
        if ((i > ap4Var.a() && f > 0.0f) || (i <= ap4Var.a() && f < 0.0f)) {
            f2 = f;
        }
        gl3Var2.w = f2;
        gl3 gl3Var3 = new gl3();
        try {
            g(new Integer(i));
            AOdm aOdmI = fp1.i(gl3Var3.w, gl3Var2.w, 28);
            Float f3 = new Float(this.a.d(i));
            Ah<Float> ah = this.c;
            CQf cQf = new CQf(gl3Var3, l64Var, gl3Var2, this, i);
            qnHx2.z = this;
            qnHx2.A = gl3Var2;
            qnHx2.D = 1;
            num = null;
            try {
                if (kx4.c(aOdmI, f3, ah, false, cQf, qnHx2, 4) == va0Var) {
                    return va0Var;
                }
                gl3Var = gl3Var2;
                wo4Var2 = this;
                wo4Var2.g(num);
                return new Float(gl3Var.w);
            } catch (Throwable th2) {
                th = th2;
                wo4Var = this;
                wo4Var.g(num);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            num = null;
        }
    }

    public final void g(Integer num) {
        this.f.setValue(num);
    }
}
