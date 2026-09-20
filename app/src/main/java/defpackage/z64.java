package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z64 {
    public final aw2 a;
    public final boolean b;
    public final is4<mm2> c;
    public final w64 d;
    public final qy0 e;
    public final tw2 f;

    @if0(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", l = {412}, m = "invokeSuspend")
    public static final class CQf extends px4 implements x81<l64, z80<? super sd5>, Object> {
        public z64 A;
        public il3 B;
        public long C;
        public int D;
        public /* synthetic */ Object E;
        public final /* synthetic */ il3 G;
        public final /* synthetic */ long H;

        /* JADX INFO: renamed from: z64$CQf$CQf, reason: collision with other inner class name */
        public static final class C0230CQf implements l64 {
            public final /* synthetic */ z64 a;
            public final /* synthetic */ j81<kt2, kt2> b;

            public C0230CQf(z64 z64Var, QnHx qnHx) {
                this.a = z64Var;
                this.b = qnHx;
            }

            @Override // defpackage.l64
            public final float a(float f) {
                z64 z64Var = this.a;
                return z64Var.d(this.b.invoke(new kt2(z64Var.e(f))).a);
            }
        }

        public static final class QnHx extends cx1 implements j81<kt2, kt2> {
            public final /* synthetic */ z64 w;
            public final /* synthetic */ l64 x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public QnHx(z64 z64Var, l64 l64Var) {
                super(1);
                this.w = z64Var;
                this.x = l64Var;
            }

            @Override // defpackage.j81
            public final kt2 invoke(kt2 kt2Var) {
                long j = kt2Var.a;
                l64 l64Var = this.x;
                z64 z64Var = this.w;
                long jA = z64Var.a(l64Var, z64Var.b ? kt2.h(j, -1.0f) : j, null, 2);
                if (z64Var.b) {
                    jA = kt2.h(jA, -1.0f);
                }
                return new kt2(kt2.f(j, jA));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(il3 il3Var, long j, z80<? super CQf> z80Var) {
            super(2, z80Var);
            this.G = il3Var;
            this.H = j;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            CQf cQf = z64.this.new CQf(this.G, this.H, z80Var);
            cQf.E = obj;
            return cQf;
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            z64 z64Var;
            il3 il3Var;
            long j;
            z64 z64Var2;
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.D;
            aw2 aw2Var = aw2.Horizontal;
            int i2 = 1;
            if (i == 0) {
                C0239D.H(obj);
                l64 l64Var = (l64) this.E;
                z64Var = z64.this;
                C0230CQf c0230CQf = new C0230CQf(z64Var, new QnHx(z64Var, l64Var));
                qy0 qy0Var = z64Var.e;
                il3Var = this.G;
                long j2 = il3Var.w;
                aw2 aw2Var2 = z64Var.a;
                long j3 = this.H;
                float fB = aw2Var2 == aw2Var ? mh5.b(j3) : mh5.c(j3);
                if (z64Var.b) {
                    fB *= -1;
                }
                this.E = z64Var;
                this.A = z64Var;
                this.B = il3Var;
                this.C = j2;
                this.D = 1;
                obj = qy0Var.a(c0230CQf, fB, this);
                if (obj == va0Var) {
                    return va0Var;
                }
                j = j2;
                z64Var2 = z64Var;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.C;
                il3Var = this.B;
                z64Var = this.A;
                z64Var2 = (z64) this.E;
                C0239D.H(obj);
            }
            float fFloatValue = ((Number) obj).floatValue();
            if (z64Var2.b) {
                fFloatValue *= -1;
            }
            aw2 aw2Var3 = z64Var.a;
            float f = 0.0f;
            if (aw2Var3 == aw2Var) {
                i2 = 2;
            } else {
                f = fFloatValue;
                fFloatValue = 0.0f;
            }
            il3Var.w = mh5.a(j, fFloatValue, f, i2);
            return sd5.a;
        }

        @Override // defpackage.x81
        public final Object invoke(l64 l64Var, z80<? super sd5> z80Var) {
            return ((CQf) a(l64Var, z80Var)).i(sd5.a);
        }
    }

    @if0(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", l = {378, 383, 385, 387, 393}, m = "onDragStopped")
    public static final class F1 extends b90 {
        public z64 A;
        public float B;
        public long C;
        public /* synthetic */ Object D;
        public int F;
        public z64 z;

        public F1(z80<? super F1> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.D = obj;
            this.F |= Integer.MIN_VALUE;
            return z64.this.c(0.0f, this);
        }
    }

    @if0(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", l = {399}, m = "doFlingAnimation-QWom1Mo")
    public static final class QnHx extends b90 {
        public /* synthetic */ Object A;
        public int C;
        public il3 z;

        public QnHx(z80<? super QnHx> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.A = obj;
            this.C |= Integer.MIN_VALUE;
            return z64.this.b(0L, this);
        }
    }

    public z64(aw2 aw2Var, boolean z, ri2 ri2Var, w64 w64Var, qy0 qy0Var, tw2 tw2Var) {
        this.a = aw2Var;
        this.b = z;
        this.c = ri2Var;
        this.d = w64Var;
        this.e = qy0Var;
        this.f = tw2Var;
    }

    public final long a(l64 l64Var, long j, kt2 kt2Var, int i) {
        tw2 tw2Var = this.f;
        long jF = kt2.f(j, (tw2Var == null || !tw2Var.isEnabled()) ? kt2.b : tw2Var.a(j, kt2Var));
        mm2 value = this.c.getValue();
        lm2 lm2Var = value.c;
        long jF2 = kt2.f(jF, lm2Var != null ? lm2Var.b(i, jF) : kt2.b);
        boolean z = this.b;
        long jE = e(l64Var.a(d(z ? kt2.h(jF2, -1.0f) : jF2)));
        if (z) {
            jE = kt2.h(jE, -1.0f);
        }
        long jF3 = kt2.f(jF2, jE);
        long jB = value.b(i, jE, jF3);
        if (tw2Var != null && tw2Var.isEnabled()) {
            this.f.d(jF2, kt2.f(jF3, jB), kt2Var, i);
        }
        return jF3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j, z80<? super mh5> z80Var) throws Throwable {
        QnHx qnHx;
        il3 il3Var;
        if (z80Var instanceof QnHx) {
            qnHx = (QnHx) z80Var;
            int i = qnHx.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                qnHx.C = i - Integer.MIN_VALUE;
            } else {
                qnHx = new QnHx(z80Var);
            }
        } else {
            qnHx = new QnHx(z80Var);
        }
        Object obj = qnHx.A;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = qnHx.C;
        if (i2 == 0) {
            C0239D.H(obj);
            il3 il3Var2 = new il3();
            il3Var2.w = j;
            CQf cQf = new CQf(il3Var2, j, null);
            qnHx.z = il3Var2;
            qnHx.C = 1;
            if (this.d.b(vi2.Default, cQf, qnHx) == va0Var) {
                return va0Var;
            }
            il3Var = il3Var2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            il3Var = qnHx.z;
            C0239D.H(obj);
        }
        return new mh5(il3Var.w);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00bd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00be  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:49:0x0106  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object c(float f, z80<? super sd5> z80Var) throws Throwable {
        F1 f1;
        float f2;
        float fB;
        z64 z64Var;
        z64 z64Var2;
        long jF;
        z64 z64Var3;
        long j;
        long jD;
        z64 z64Var4;
        long j2;
        long j3;
        z64 z64Var5;
        long j4;
        tw2 tw2Var;
        if (z80Var instanceof F1) {
            f1 = (F1) z80Var;
            int i = f1.F;
            if ((i & Integer.MIN_VALUE) != 0) {
                f1.F = i - Integer.MIN_VALUE;
            } else {
                f1 = new F1(z80Var);
            }
        } else {
            f1 = new F1(z80Var);
        }
        Object objB = f1.D;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = f1.F;
        aw2 aw2Var = aw2.Horizontal;
        if (i2 == 0) {
            C0239D.H(objB);
            tw2 tw2Var2 = this.f;
            if (tw2Var2 == null || !tw2Var2.isEnabled()) {
                f2 = f;
                fB = 0.0f;
                z64Var = this;
            } else {
                long jF2 = f(f);
                f1.z = this;
                f1.A = this;
                f2 = f;
                f1.B = f2;
                f1.F = 1;
                objB = tw2Var2.b(jF2);
                if (objB == va0Var) {
                    return va0Var;
                }
                z64Var2 = this;
                z64Var = z64Var2;
            }
            jF = z64Var.f(f2 - fB);
            mm2 value = z64Var.c.getValue();
            f1.z = z64Var;
            f1.A = null;
            f1.C = jF;
            f1.F = 2;
            objB = value.c(jF, f1);
            if (objB == va0Var) {
                return va0Var;
            }
            z64Var3 = z64Var;
            j = jF;
            jD = mh5.d(j, ((mh5) objB).a);
            f1.z = z64Var3;
            f1.C = jD;
            f1.F = 3;
            objB = z64Var3.b(jD, f1);
            if (objB == va0Var) {
                return va0Var;
            }
            z64Var4 = z64Var3;
            j2 = jD;
            j3 = ((mh5) objB).a;
            mm2 value2 = z64Var4.c.getValue();
            long jD2 = mh5.d(j2, j3);
            f1.z = z64Var4;
            f1.C = j3;
            f1.F = 4;
            objB = value2.a(jD2, j3, f1);
            if (objB == va0Var) {
                return va0Var;
            }
            z64Var5 = z64Var4;
            j4 = j3;
            long jD3 = mh5.d(j4, ((mh5) objB).a);
            tw2Var = z64Var5.f;
            if (tw2Var != null) {
            }
            return sd5.a;
        }
        if (i2 == 1) {
            f2 = f1.B;
            z64Var2 = f1.A;
            z64Var = f1.z;
            C0239D.H(objB);
        } else {
            if (i2 == 2) {
                j = f1.C;
                z64Var3 = f1.z;
                C0239D.H(objB);
                jD = mh5.d(j, ((mh5) objB).a);
                f1.z = z64Var3;
                f1.C = jD;
                f1.F = 3;
                objB = z64Var3.b(jD, f1);
                if (objB == va0Var) {
                    return va0Var;
                }
                z64Var4 = z64Var3;
                j2 = jD;
                j3 = ((mh5) objB).a;
                mm2 value3 = z64Var4.c.getValue();
                long jD4 = mh5.d(j2, j3);
                f1.z = z64Var4;
                f1.C = j3;
                f1.F = 4;
                objB = value3.a(jD4, j3, f1);
                if (objB == va0Var) {
                    return va0Var;
                }
                z64Var5 = z64Var4;
                j4 = j3;
                long jD5 = mh5.d(j4, ((mh5) objB).a);
                tw2Var = z64Var5.f;
                if (tw2Var != null) {
                }
                return sd5.a;
            }
            if (i2 == 3) {
                j2 = f1.C;
                z64 z64Var6 = f1.z;
                C0239D.H(objB);
                z64Var4 = z64Var6;
                j3 = ((mh5) objB).a;
                mm2 value4 = z64Var4.c.getValue();
                long jD6 = mh5.d(j2, j3);
                f1.z = z64Var4;
                f1.C = j3;
                f1.F = 4;
                objB = value4.a(jD6, j3, f1);
                if (objB == va0Var) {
                    return va0Var;
                }
                z64Var5 = z64Var4;
                j4 = j3;
                long jD7 = mh5.d(j4, ((mh5) objB).a);
                tw2Var = z64Var5.f;
                if (tw2Var != null) {
                }
                return sd5.a;
            }
            if (i2 == 4) {
                j4 = f1.C;
                z64Var5 = f1.z;
                C0239D.H(objB);
                long jD8 = mh5.d(j4, ((mh5) objB).a);
                tw2Var = z64Var5.f;
                if (tw2Var != null || !tw2Var.isEnabled()) {
                    return sd5.a;
                }
                long jF3 = z64Var5.f(z64Var5.a == aw2Var ? mh5.b(jD8) : mh5.c(jD8));
                f1.z = null;
                f1.F = 5;
                if (z64Var5.f.f(jF3) == va0Var) {
                    return va0Var;
                }
            } else {
                if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(objB);
            }
        }
        return sd5.a;
        long j5 = ((mh5) objB).a;
        fB = z64Var2.a == aw2Var ? mh5.b(j5) : mh5.c(j5);
        jF = z64Var.f(f2 - fB);
        mm2 value5 = z64Var.c.getValue();
        f1.z = z64Var;
        f1.A = null;
        f1.C = jF;
        f1.F = 2;
        objB = value5.c(jF, f1);
        if (objB == va0Var) {
            return va0Var;
        }
        z64Var3 = z64Var;
        j = jF;
        jD = mh5.d(j, ((mh5) objB).a);
        f1.z = z64Var3;
        f1.C = jD;
        f1.F = 3;
        objB = z64Var3.b(jD, f1);
        if (objB == va0Var) {
            return va0Var;
        }
        z64Var4 = z64Var3;
        j2 = jD;
        j3 = ((mh5) objB).a;
        mm2 value6 = z64Var4.c.getValue();
        long jD9 = mh5.d(j2, j3);
        f1.z = z64Var4;
        f1.C = j3;
        f1.F = 4;
        objB = value6.a(jD9, j3, f1);
        if (objB == va0Var) {
            return va0Var;
        }
        z64Var5 = z64Var4;
        j4 = j3;
        long jD10 = mh5.d(j4, ((mh5) objB).a);
        tw2Var = z64Var5.f;
        if (tw2Var != null) {
        }
        return sd5.a;
    }

    public final float d(long j) {
        return this.a == aw2.Horizontal ? kt2.c(j) : kt2.d(j);
    }

    public final long e(float f) {
        if (!(f == 0.0f)) {
            return this.a == aw2.Horizontal ? X.a(f, 0.0f) : X.a(0.0f, f);
        }
        int i = kt2.e;
        return kt2.b;
    }

    public final long f(float f) {
        return this.a == aw2.Horizontal ? XTd3.c(f, 0.0f) : XTd3.c(0.0f, f);
    }
}
