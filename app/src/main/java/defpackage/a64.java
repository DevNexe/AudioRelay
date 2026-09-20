package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a64 {

    @if0(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2", f = "ScrollExtensions.kt", l = {41}, m = "invokeSuspend")
    public static final class CQf extends px4 implements x81<l64, z80<? super sd5>, Object> {
        public int A;
        public /* synthetic */ Object B;
        public final /* synthetic */ float C;
        public final /* synthetic */ Ah<Float> D;
        public final /* synthetic */ gl3 E;

        public static final class QnHx extends cx1 implements x81<Float, Float, sd5> {
            public final /* synthetic */ gl3 w;
            public final /* synthetic */ l64 x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public QnHx(gl3 gl3Var, l64 l64Var) {
                super(2);
                this.w = gl3Var;
                this.x = l64Var;
            }

            @Override // defpackage.x81
            public final sd5 invoke(Float f, Float f2) {
                float fFloatValue = f.floatValue();
                f2.floatValue();
                gl3 gl3Var = this.w;
                float f3 = gl3Var.w;
                gl3Var.w = this.x.a(fFloatValue - f3) + f3;
                return sd5.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(float f, Ah<Float> ah, gl3 gl3Var, z80<? super CQf> z80Var) {
            super(2, z80Var);
            this.C = f;
            this.D = ah;
            this.E = gl3Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            CQf cQf = new CQf(this.C, this.D, this.E, z80Var);
            cQf.B = obj;
            return cQf;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            Object obj2 = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i == 0) {
                C0239D.H(obj);
                l64 l64Var = (l64) this.B;
                Ah<Float> ah = this.D;
                QnHx qnHx = new QnHx(this.E, l64Var);
                this.A = 1;
                qb5 qb5Var = mg5.a;
                Object f = new Float(0.0f);
                Float f2 = new Float(this.C);
                z_Mm z_mmC = (z_Mm) qb5Var.a.invoke((T) new Float(0.0f));
                if (z_mmC == null) {
                    z_mmC = ((z_Mm) qb5Var.a.invoke((T) f)).c();
                }
                Object objA = kx4.a(new AOdm(qb5Var, f, z_mmC, 56), new t05(ah, qb5Var, f, f2, z_mmC), Long.MIN_VALUE, new jx4(qnHx), this);
                if (objA != obj2) {
                    objA = sd5.a;
                }
                if (objA != obj2) {
                    objA = sd5.a;
                }
                if (objA == obj2) {
                    return obj2;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
            return sd5.a;
        }

        @Override // defpackage.x81
        public final Object invoke(l64 l64Var, z80<? super sd5> z80Var) {
            return ((CQf) a(l64Var, z80Var)).i(sd5.a);
        }
    }

    @if0(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", f = "ScrollExtensions.kt", l = {40}, m = "animateScrollBy")
    public static final class QnHx extends b90 {
        public /* synthetic */ Object A;
        public int B;
        public gl3 z;

        public QnHx(z80<? super QnHx> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.A = obj;
            this.B |= Integer.MIN_VALUE;
            return a64.a(null, 0.0f, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(w64 w64Var, float f, Ah<Float> ah, z80<? super Float> z80Var) throws Throwable {
        QnHx qnHx;
        gl3 gl3Var;
        if (z80Var instanceof QnHx) {
            qnHx = (QnHx) z80Var;
            int i = qnHx.B;
            if ((i & Integer.MIN_VALUE) != 0) {
                qnHx.B = i - Integer.MIN_VALUE;
            } else {
                qnHx = new QnHx(z80Var);
            }
        } else {
            qnHx = new QnHx(z80Var);
        }
        Object obj = qnHx.A;
        Object obj2 = va0.COROUTINE_SUSPENDED;
        int i2 = qnHx.B;
        if (i2 == 0) {
            C0239D.H(obj);
            gl3 gl3Var2 = new gl3();
            x81<? super l64, ? super z80<? super sd5>, ? extends Object> cQf = new CQf(f, ah, gl3Var2, null);
            qnHx.z = gl3Var2;
            qnHx.B = 1;
            if (w64Var.b(vi2.Default, cQf, qnHx) == obj2) {
                return obj2;
            }
            gl3Var = gl3Var2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gl3Var = qnHx.z;
            C0239D.H(obj);
        }
        return new Float(gl3Var.w);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(m64 m64Var, float f, z80 z80Var) throws Throwable {
        b64 b64Var;
        gl3 gl3Var;
        if (z80Var instanceof b64) {
            b64Var = (b64) z80Var;
            int i = b64Var.B;
            if ((i & Integer.MIN_VALUE) != 0) {
                b64Var.B = i - Integer.MIN_VALUE;
            } else {
                b64Var = new b64(z80Var);
            }
        } else {
            b64Var = new b64(z80Var);
        }
        Object obj = b64Var.A;
        Object obj2 = va0.COROUTINE_SUSPENDED;
        int i2 = b64Var.B;
        if (i2 == 0) {
            C0239D.H(obj);
            gl3 gl3Var2 = new gl3();
            x81<? super l64, ? super z80<? super sd5>, ? extends Object> c64Var = new c64(gl3Var2, f, null);
            b64Var.z = gl3Var2;
            b64Var.B = 1;
            if (m64Var.b(vi2.Default, c64Var, b64Var) == obj2) {
                return obj2;
            }
            gl3Var = gl3Var2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gl3Var = b64Var.z;
            C0239D.H(obj);
        }
        return new Float(gl3Var.w);
    }
}
