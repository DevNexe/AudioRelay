package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.foundation.lazy.LazyListScrollingKt$doSmoothScrollToItem$3", f = "LazyListScrolling.kt", l = {114, 205}, m = "invokeSuspend")
public final class k12 extends px4 implements x81<l64, z80<? super sd5>, Object> {
    public fl3 A;
    public jl3 B;
    public hl3 C;
    public float D;
    public float E;
    public int F;
    public int G;
    public /* synthetic */ Object H;
    public final /* synthetic */ q12 I;
    public final /* synthetic */ int J;
    public final /* synthetic */ int K;

    public static final class CQf extends cx1 implements j81<rjr<Float, JW>, sd5> {
        public final /* synthetic */ float w;
        public final /* synthetic */ gl3 x;
        public final /* synthetic */ l64 y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(float f, gl3 gl3Var, l64 l64Var) {
            super(1);
            this.w = f;
            this.x = gl3Var;
            this.y = l64Var;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0055  */
        /* JADX WARN: Code duplicated, block: B:7:0x0018 A[PHI: r1
  0x0018: PHI (r1v7 float) = (r1v3 float), (r1v10 float) binds: [B:11:0x002a, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // defpackage.j81
        public final sd5 invoke(rjr<Float, JW> rjrVar) {
            float fFloatValue;
            rjr<Float, JW> rjrVar2 = rjrVar;
            float f = this.w;
            float f2 = 0.0f;
            if (f > 0.0f) {
                fFloatValue = rjrVar2.b().floatValue();
                if (fFloatValue <= f) {
                    f = fFloatValue;
                }
                f2 = f;
            } else if (f < 0.0f) {
                fFloatValue = rjrVar2.b().floatValue();
                if (fFloatValue >= f) {
                    f = fFloatValue;
                }
                f2 = f;
            }
            gl3 gl3Var = this.x;
            float f3 = f2 - gl3Var.w;
            if (f3 == this.y.a(f3)) {
                if (!(f2 == rjrVar2.b().floatValue())) {
                    rjrVar2.a();
                }
            } else {
                rjrVar2.a();
            }
            gl3Var.w += f3;
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements j81<rjr<Float, JW>, sd5> {
        public final /* synthetic */ boolean A;
        public final /* synthetic */ float B;
        public final /* synthetic */ hl3 C;
        public final /* synthetic */ int D;
        public final /* synthetic */ q12 E;
        public final /* synthetic */ int F;
        public final /* synthetic */ jl3<AOdm<Float, JW>> G;
        public final /* synthetic */ float w;
        public final /* synthetic */ gl3 x;
        public final /* synthetic */ l64 y;
        public final /* synthetic */ fl3 z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(float f, gl3 gl3Var, l64 l64Var, fl3 fl3Var, boolean z, float f2, hl3 hl3Var, int i, q12 q12Var, int i2, jl3<AOdm<Float, JW>> jl3Var) {
            super(1);
            this.w = f;
            this.x = gl3Var;
            this.y = l64Var;
            this.z = fl3Var;
            this.A = z;
            this.B = f2;
            this.C = hl3Var;
            this.D = i;
            this.E = q12Var;
            this.F = i2;
            this.G = jl3Var;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0038 A[PHI: r2
  0x0038: PHI (r2v16 float) = (r2v6 float), (r2v19 float) binds: [B:10:0x0035, B:7:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:47:0x00db  */
        /* JADX WARN: Code duplicated, block: B:48:0x00e4 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:51:0x00e9  */
        @Override // defpackage.j81
        public final sd5 invoke(rjr<Float, JW> rjrVar) {
            float fFloatValue;
            rjr<Float, JW> rjrVar2 = rjrVar;
            q12 q12Var = this.E;
            int i = this.D;
            k02 k02VarA = l12.a(q12Var, i);
            fl3 fl3Var = this.z;
            int i2 = this.F;
            boolean z = this.A;
            if (k02VarA == null) {
                float f = this.w;
                if (f > 0.0f) {
                    fFloatValue = rjrVar2.b().floatValue();
                    if (fFloatValue <= f) {
                        f = fFloatValue;
                    }
                } else {
                    fFloatValue = rjrVar2.b().floatValue();
                    if (fFloatValue >= f) {
                        f = fFloatValue;
                    }
                }
                gl3 gl3Var = this.x;
                float f2 = f - gl3Var.w;
                float fA = this.y.a(f2);
                k02 k02VarA2 = l12.a(q12Var, i);
                if (k02VarA2 == null && !k12.m(z, q12Var, i, i2)) {
                    if (f2 == fA) {
                        gl3Var.w += f2;
                        float f3 = this.B;
                        if (z) {
                            if (rjrVar2.b().floatValue() > f3) {
                                rjrVar2.a();
                            }
                        } else if (rjrVar2.b().floatValue() < (-f3)) {
                            rjrVar2.a();
                        }
                        hl3 hl3Var = this.C;
                        if (z) {
                            if (hl3Var.w >= 2 && i - ((k02) wu.N0(q12Var.g().e())).getIndex() > 100) {
                                q12Var.i(i - 100, 0);
                            }
                        } else if (hl3Var.w >= 2 && ((k02) wu.H0(q12Var.g().e())).getIndex() - i > 100) {
                            q12Var.i(i + 100, 0);
                        }
                    } else {
                        rjrVar2.a();
                        fl3Var.w = false;
                    }
                }
                k02VarA = k02VarA2;
                if (k12.m(z, q12Var, i, i2)) {
                    q12Var.i(i, i2);
                    fl3Var.w = false;
                    rjrVar2.a();
                } else if (k02VarA != null) {
                    throw new fs1(k02VarA, this.G.w);
                }
            } else if (k12.m(z, q12Var, i, i2)) {
                q12Var.i(i, i2);
                fl3Var.w = false;
                rjrVar2.a();
            } else if (k02VarA != null) {
                throw new fs1(k02VarA, this.G.w);
            }
            return sd5.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k12(q12 q12Var, int i, int i2, z80<? super k12> z80Var) {
        super(2, z80Var);
        this.I = q12Var;
        this.J = i;
        this.K = i2;
    }

    public static final boolean m(boolean z, q12 q12Var, int i, int i2) {
        return !z ? q12Var.e() >= i && (q12Var.e() != i || q12Var.f() >= i2) : q12Var.e() <= i && (q12Var.e() != i || q12Var.f() <= i2);
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        k12 k12Var = new k12(this.I, this.J, this.K, z80Var);
        k12Var.H = obj;
        return k12Var;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x009e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x00a8 A[Catch: fs1 -> 0x01bc, TRY_LEAVE, TryCatch #5 {fs1 -> 0x01bc, blocks: (B:25:0x009e, B:27:0x00a8, B:32:0x00c8, B:39:0x00f1, B:42:0x010b, B:49:0x012e, B:53:0x0137), top: B:103:0x009e }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b9 A[Catch: fs1 -> 0x01a4, TRY_ENTER, TRY_LEAVE, TryCatch #2 {fs1 -> 0x01a4, blocks: (B:64:0x0197, B:30:0x00b9), top: B:97:0x0197 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:44:0x0126  */
    /* JADX WARN: Code duplicated, block: B:45:0x0128  */
    /* JADX WARN: Code duplicated, block: B:47:0x012b  */
    /* JADX WARN: Code duplicated, block: B:48:0x012d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0132  */
    /* JADX WARN: Code duplicated, block: B:52:0x0135  */
    /* JADX WARN: Code duplicated, block: B:62:0x0190 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:63:0x0191  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [AOdm, T] */
    /* JADX WARN: Type inference failed for: r6v14, types: [AOdm, T] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0191 -> B:97:0x0197). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.m8
    public final java.lang.Object i(java.lang.Object r31) {
        /*
            Method dump skipped, instruction units count: 568
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k12.i(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.x81
    public final Object invoke(l64 l64Var, z80<? super sd5> z80Var) {
        return ((k12) a(l64Var, z80Var)).i(sd5.a);
    }
}
