package defpackage;

import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class CO {

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ lv0 A;
        public final /* synthetic */ y81<lcO, g30, Integer, sd5> B;
        public final /* synthetic */ int C;
        public final /* synthetic */ t95<T> w;
        public final /* synthetic */ j81<T, Boolean> x;
        public final /* synthetic */ pg2 y;
        public final /* synthetic */ kt0 z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CQf(t95<T> t95Var, j81<? super T, Boolean> j81Var, pg2 pg2Var, kt0 kt0Var, lv0 lv0Var, y81<? super lcO, ? super g30, ? super Integer, sd5> y81Var, int i) {
            super(2);
            this.w = t95Var;
            this.x = j81Var;
            this.y = pg2Var;
            this.z = kt0Var;
            this.A = lv0Var;
            this.B = y81Var;
            this.C = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            CO.a(this.w, this.x, this.y, this.z, this.A, this.B, g30Var, this.C | 1);
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements j81<Boolean, Boolean> {
        public static final F1 w = new F1();

        public F1() {
            super(1);
        }

        @Override // defpackage.j81
        public final Boolean invoke(Boolean bool) {
            return Boolean.valueOf(bool.booleanValue());
        }
    }

    public static final class LPt8Fixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ String A;
        public final /* synthetic */ y81<lcO, g30, Integer, sd5> B;
        public final /* synthetic */ int C;
        public final /* synthetic */ int D;
        public final /* synthetic */ boolean w;
        public final /* synthetic */ pg2 x;
        public final /* synthetic */ kt0 y;
        public final /* synthetic */ lv0 z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public LPt8Fixed(boolean z, pg2 pg2Var, kt0 kt0Var, lv0 lv0Var, String str, y81<? super lcO, ? super g30, ? super Integer, sd5> y81Var, int i, int i2) {
            super(2);
            this.w = z;
            this.x = pg2Var;
            this.y = kt0Var;
            this.z = lv0Var;
            this.A = str;
            this.B = y81Var;
            this.C = i;
            this.D = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            CO.c(this.w, this.x, this.y, this.z, this.A, this.B, g30Var, this.C | 1, this.D);
            return sd5.a;
        }
    }

    public static final class NUlFixed extends cx1 implements j81<Boolean, Boolean> {
        public static final NUlFixed w = new NUlFixed();

        public NUlFixed() {
            super(1);
        }

        @Override // defpackage.j81
        public final Boolean invoke(Boolean bool) {
            return Boolean.valueOf(bool.booleanValue());
        }
    }

    @if0(c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1", f = "AnimatedVisibility.kt", l = {748}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<ua0, z80<? super sd5>, Object> {
        public int A;
        public final /* synthetic */ t95<ts0> B;
        public final /* synthetic */ ri2<Boolean> C;

        public static final class CQf implements nz0<Boolean> {
            public final /* synthetic */ ri2<Boolean> w;

            public CQf(ri2<Boolean> ri2Var) {
                this.w = ri2Var;
            }

            @Override // defpackage.nz0
            public final Object f(Boolean bool, z80 z80Var) {
                this.w.setValue(Boolean.valueOf(bool.booleanValue()));
                return sd5.a;
            }
        }

        /* JADX INFO: renamed from: CO$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0001QnHx extends cx1 implements h81<Boolean> {
            public final /* synthetic */ t95<ts0> w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0001QnHx(t95<ts0> t95Var) {
                super(0);
                this.w = t95Var;
            }

            @Override // defpackage.h81
            public final Boolean invoke() {
                t95<ts0> t95Var = this.w;
                ts0 ts0VarB = t95Var.b();
                ts0 ts0Var = ts0.Visible;
                return Boolean.valueOf(ts0VarB == ts0Var || t95Var.d() == ts0Var);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(t95<ts0> t95Var, ri2<Boolean> ri2Var, z80<? super QnHx> z80Var) {
            super(2, z80Var);
            this.B = t95Var;
            this.C = ri2Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            return new QnHx(this.B, this.C, z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i == 0) {
                C0239D.H(obj);
                d24 d24VarH0 = ps0.h0(new C0001QnHx(this.B));
                CQf cQf = new CQf(this.C);
                this.A = 1;
                if (d24VarH0.a(cQf, this) == va0Var) {
                    return va0Var;
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
        public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
            return ((QnHx) a(ua0Var, z80Var)).i(sd5.a);
        }
    }

    public static final class YKK extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ lv0 A;
        public final /* synthetic */ String B;
        public final /* synthetic */ y81<lcO, g30, Integer, sd5> C;
        public final /* synthetic */ int D;
        public final /* synthetic */ int E;
        public final /* synthetic */ wv w;
        public final /* synthetic */ boolean x;
        public final /* synthetic */ pg2 y;
        public final /* synthetic */ kt0 z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public YKK(wv wvVar, boolean z, pg2 pg2Var, kt0 kt0Var, lv0 lv0Var, String str, y81<? super lcO, ? super g30, ? super Integer, sd5> y81Var, int i, int i2) {
            super(2);
            this.w = wvVar;
            this.x = z;
            this.y = pg2Var;
            this.z = kt0Var;
            this.A = lv0Var;
            this.B = str;
            this.C = y81Var;
            this.D = i;
            this.E = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            CO.b(this.w, this.x, this.y, this.z, this.A, this.B, this.C, g30Var, this.D | 1, this.E);
            return sd5.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:132:0x036c  */
    /* JADX WARN: Code duplicated, block: B:147:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:169:0x047d  */
    /* JADX WARN: Code duplicated, block: B:199:0x052e  */
    /* JADX WARN: Code duplicated, block: B:220:0x05ac A[PHI: r16 r30
  0x05ac: PHI (r16v3 t95$LPt8) = (r16v2 t95$LPt8), (r16v6 t95$LPt8) binds: [B:218:0x05a2, B:209:0x0572] A[DONT_GENERATE, DONT_INLINE]
  0x05ac: PHI (r30v4 zdtF) = (r30v3 zdtF), (r30v7 zdtF) binds: [B:218:0x05a2, B:209:0x0572] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:245:0x061b  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final <T> void a(t95<T> t95Var, j81<? super T, Boolean> j81Var, pg2 pg2Var, kt0 kt0Var, lv0 lv0Var, y81<? super lcO, ? super g30, ? super Integer, sd5> y81Var, g30 g30Var, int i) {
        int i2;
        String str;
        ri2 ri2Var;
        ri2 ri2Var2;
        is4 is4VarB;
        boolean z;
        zdtF zdtf;
        pg2 pg2VarY;
        boolean z2;
        zdtF zdtf2;
        float f;
        float f2;
        m95 m95Var;
        t95.LPt8Fixed lPt8;
        m95 m95Var2;
        m95 m95Var3;
        float f3;
        float f4;
        j30 j30VarQ = g30Var.q(808253933);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(t95Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(j81Var) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= j30VarQ.I(pg2Var) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= j30VarQ.I(kt0Var) ? 2048 : 1024;
        }
        if ((i & 57344) == 0) {
            i2 |= j30VarQ.I(lv0Var) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= j30VarQ.I(y81Var) ? 131072 : 65536;
        }
        if ((374491 & i2) == 74898 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            int i3 = i2 & 14;
            j30VarQ.e(1157296644);
            boolean zI = j30VarQ.I(t95Var);
            Object objB0 = j30VarQ.b0();
            g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
            if (zI || objB0 == c0132QnHx) {
                objB0 = ps0.R(j81Var.invoke(t95Var.b()));
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            ri2 ri2Var3 = (ri2) objB0;
            if (j81Var.invoke(t95Var.d()).booleanValue() || ((Boolean) ri2Var3.getValue()).booleanValue() || t95Var.e()) {
                int i4 = i3 | 48;
                j30VarQ.e(1215497572);
                int i5 = i4 & 14;
                j30VarQ.e(1157296644);
                boolean zI2 = j30VarQ.I(t95Var);
                Object objB1 = j30VarQ.b0();
                if (zI2 || objB1 == c0132QnHx) {
                    objB1 = t95Var.b();
                    j30VarQ.F0(objB1);
                }
                j30VarQ.R(false);
                if (t95Var.e()) {
                    objB1 = t95Var.b();
                }
                j30VarQ.e(-1220581778);
                Object objD = d(t95Var, j81Var, objB1, j30VarQ);
                j30VarQ.R(false);
                T tD = t95Var.d();
                j30VarQ.e(-1220581778);
                ts0 ts0VarD = d(t95Var, j81Var, tD, j30VarQ);
                j30VarQ.R(false);
                int i6 = ((i4 << 6) & 7168) | i5;
                j30VarQ.e(-198307638);
                j30VarQ.e(1157296644);
                boolean zI3 = j30VarQ.I(t95Var);
                Object objB2 = j30VarQ.b0();
                if (zI3 || objB2 == c0132QnHx) {
                    objB2 = new t95(new ti2(objD), i5.b(new StringBuilder(), t95Var.b, " > EnterExitTransition"));
                    j30VarQ.F0(objB2);
                }
                j30VarQ.R(false);
                t95 t95Var2 = (t95) objB2;
                wq0.a(t95Var2, new x95(t95Var, t95Var2), j30VarQ);
                if (t95Var.e()) {
                    t95Var2.h(t95Var.k, objD, ts0VarD);
                } else {
                    t95Var2.i(ts0VarD, j30VarQ, ((i6 >> 3) & 8) | ((i6 >> 6) & 14));
                    t95Var2.j.setValue(Boolean.FALSE);
                }
                j30VarQ.R(false);
                j30VarQ.R(false);
                j30VarQ.e(511388516);
                boolean zI4 = j30VarQ.I(t95Var2) | j30VarQ.I(ri2Var3);
                Object objB3 = j30VarQ.b0();
                if (zI4 || objB3 == c0132QnHx) {
                    objB3 = new QnHx(t95Var2, ri2Var3, null);
                    j30VarQ.F0(objB3);
                }
                j30VarQ.R(false);
                wq0.d(t95Var2, (x81) objB3, j30VarQ);
                int i7 = i2 >> 3;
                int i8 = (i7 & 57344) | (i7 & 112) | (i7 & 896) | (i7 & 7168);
                j30VarQ.e(-1967270694);
                Object objB = t95Var2.b();
                ts0 ts0Var = ts0.Visible;
                if (objB == ts0Var || t95Var2.d() == ts0Var) {
                    int i9 = i8 & 14;
                    j30VarQ.e(1157296644);
                    boolean zI5 = j30VarQ.I(t95Var2);
                    Object objB4 = j30VarQ.b0();
                    if (zI5 || objB4 == c0132QnHx) {
                        objB4 = new zdtF();
                        j30VarQ.F0(objB4);
                    }
                    j30VarQ.R(false);
                    zdtF zdtf3 = (zdtF) objB4;
                    int i10 = i8 >> 3;
                    int i11 = i9 | 3072 | (i10 & 112) | (i10 & 896);
                    qb5 qb5Var = us0.a;
                    j30VarQ.e(914000546);
                    pg2 pg2VarA = f30.a(f30.a(pg2.QnHx.w, wo1.a, new ht0(t95Var2, ps0.f0(kt0Var.a().b, j30VarQ), ps0.f0(lv0Var.a().b, j30VarQ))), wo1.a, new dt0(t95Var2, ps0.f0(kt0Var.a().c, j30VarQ), ps0.f0(lv0Var.a().c, j30VarQ)));
                    int i12 = i11 & 14;
                    j30VarQ.e(1157296644);
                    boolean zI6 = j30VarQ.I(t95Var2);
                    Object objB5 = j30VarQ.b0();
                    if (zI6 || objB5 == c0132QnHx) {
                        objB5 = ps0.R(Boolean.FALSE);
                        j30VarQ.F0(objB5);
                    }
                    j30VarQ.R(false);
                    ri2 ri2Var4 = (ri2) objB5;
                    j30VarQ.e(1157296644);
                    boolean zI7 = j30VarQ.I(t95Var2);
                    Object objB6 = j30VarQ.b0();
                    if (zI7 || objB6 == c0132QnHx) {
                        objB6 = ps0.R(Boolean.FALSE);
                        j30VarQ.F0(objB6);
                    }
                    j30VarQ.R(false);
                    ri2 ri2Var5 = (ri2) objB6;
                    if (t95Var2.b() != t95Var2.d() || t95Var2.e()) {
                        if (kt0Var.a().a != null || lv0Var.a().a != null) {
                            ri2Var4.setValue(Boolean.TRUE);
                        }
                        if (kt0Var.a().d != null || lv0Var.a().d != null) {
                            ri2Var5.setValue(Boolean.TRUE);
                        }
                    } else {
                        Boolean bool = Boolean.FALSE;
                        ri2Var4.setValue(bool);
                        ri2Var5.setValue(bool);
                    }
                    j30VarQ.e(1657240548);
                    float f5 = 1.0f;
                    if (((Boolean) ri2Var4.getValue()).booleanValue()) {
                        ys0 ys0Var = new ys0(kt0Var, lv0Var);
                        j30VarQ.e(-492369756);
                        Object objB7 = j30VarQ.b0();
                        if (objB7 == c0132QnHx) {
                            objB7 = "Built-in".concat(" alpha");
                            j30VarQ.F0(objB7);
                        }
                        j30VarQ.R(false);
                        String str2 = (String) objB7;
                        int i13 = i12 | 384;
                        j30VarQ.e(-1338768149);
                        qb5 qb5Var2 = mg5.a;
                        int i14 = i13 & 14;
                        int i15 = i13 << 3;
                        int i16 = (i15 & 57344) | i14 | (i15 & 896) | (i15 & 7168);
                        j30VarQ.e(-142660079);
                        ts0 ts0Var2 = (ts0) t95Var2.b();
                        j30VarQ.e(755689166);
                        int iOrdinal = ts0Var2.ordinal();
                        if (iOrdinal == 0) {
                            mw0 mw0Var = kt0Var.a().a;
                            if (mw0Var != null) {
                                f3 = mw0Var.a;
                            } else {
                                f3 = 1.0f;
                            }
                        } else if (iOrdinal == 1) {
                            f3 = 1.0f;
                        } else {
                            if (iOrdinal != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            mw0 mw0Var2 = lv0Var.a().a;
                            if (mw0Var2 != null) {
                                f3 = mw0Var2.a;
                            } else {
                                f3 = 1.0f;
                            }
                        }
                        j30VarQ.R(false);
                        Float fValueOf = Float.valueOf(f3);
                        ts0 ts0Var3 = (ts0) t95Var2.d();
                        j30VarQ.e(755689166);
                        int iOrdinal2 = ts0Var3.ordinal();
                        if (iOrdinal2 == 0) {
                            mw0 mw0Var3 = kt0Var.a().a;
                            if (mw0Var3 != null) {
                                f4 = mw0Var3.a;
                            } else {
                                f4 = 1.0f;
                            }
                        } else if (iOrdinal2 == 1) {
                            f4 = 1.0f;
                        } else {
                            if (iOrdinal2 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            mw0 mw0Var4 = lv0Var.a().a;
                            if (mw0Var4 != null) {
                                f4 = mw0Var4.a;
                            } else {
                                f4 = 1.0f;
                            }
                        }
                        j30VarQ.R(false);
                        str = "Built-in";
                        ri2Var = ri2Var5;
                        ri2Var2 = ri2Var4;
                        is4VarB = da5.b(t95Var2, fValueOf, Float.valueOf(f4), ys0Var.invoke(t95Var2.c(), j30VarQ, Integer.valueOf((i16 >> 3) & 112)), qb5Var2, str2, j30VarQ);
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                    } else {
                        str = "Built-in";
                        ri2Var = ri2Var5;
                        ri2Var2 = ri2Var4;
                        is4VarB = us0.b;
                    }
                    is4 is4Var = is4VarB;
                    j30VarQ.R(false);
                    if (((Boolean) ri2Var.getValue()).booleanValue()) {
                        zs0 zs0Var = new zs0(kt0Var, lv0Var);
                        j30VarQ.e(-492369756);
                        Object objB8 = j30VarQ.b0();
                        if (objB8 == c0132QnHx) {
                            objB8 = str.concat(" scale");
                            j30VarQ.F0(objB8);
                        }
                        j30VarQ.R(false);
                        String str3 = (String) objB8;
                        int i17 = i12 | 384;
                        j30VarQ.e(-1338768149);
                        qb5 qb5Var3 = mg5.a;
                        int i18 = i17 & 14;
                        int i19 = i17 << 3;
                        int i20 = (i19 & 57344) | i18 | (i19 & 896) | (i19 & 7168);
                        j30VarQ.e(-142660079);
                        ts0 ts0Var4 = (ts0) t95Var2.b();
                        j30VarQ.e(-596129937);
                        int iOrdinal3 = ts0Var4.ordinal();
                        if (iOrdinal3 == 0) {
                            u34 u34Var = kt0Var.a().d;
                            if (u34Var != null) {
                                f = u34Var.a;
                            } else {
                                f = 1.0f;
                            }
                        } else if (iOrdinal3 == 1) {
                            f = 1.0f;
                        } else {
                            if (iOrdinal3 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            u34 u34Var2 = lv0Var.a().d;
                            if (u34Var2 != null) {
                                f = u34Var2.a;
                            } else {
                                f = 1.0f;
                            }
                        }
                        j30VarQ.R(false);
                        Float fValueOf2 = Float.valueOf(f);
                        ts0 ts0Var5 = (ts0) t95Var2.d();
                        j30VarQ.e(-596129937);
                        int iOrdinal4 = ts0Var5.ordinal();
                        if (iOrdinal4 == 0) {
                            u34 u34Var3 = kt0Var.a().d;
                            if (u34Var3 != null) {
                                f2 = u34Var3.a;
                                f5 = f2;
                            }
                        } else if (iOrdinal4 != 1) {
                            if (iOrdinal4 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            u34 u34Var4 = lv0Var.a().d;
                            if (u34Var4 != null) {
                                f2 = u34Var4.a;
                                f5 = f2;
                            }
                        }
                        j30VarQ.R(false);
                        z = false;
                        t95.LPt8Fixed lPt8B = da5.b(t95Var2, fValueOf2, Float.valueOf(f5), zs0Var.invoke(t95Var2.c(), j30VarQ, Integer.valueOf((i20 >> 3) & 112)), qb5Var3, str3, j30VarQ);
                        j30VarQ.R(false);
                        j30VarQ.R(false);
                        if (t95Var2.b() == ts0.PreEnter) {
                            u34 u34Var5 = kt0Var.a().d;
                            if (u34Var5 != null) {
                                m95Var = new m95(u34Var5.b);
                            } else {
                                u34 u34Var6 = lv0Var.a().d;
                                if (u34Var6 != null) {
                                    m95Var = new m95(u34Var6.b);
                                } else {
                                    m95Var = null;
                                }
                            }
                        } else {
                            u34 u34Var7 = lv0Var.a().d;
                            if (u34Var7 != null) {
                                m95Var = new m95(u34Var7.b);
                            } else {
                                u34 u34Var8 = kt0Var.a().d;
                                if (u34Var8 != null) {
                                    m95Var = new m95(u34Var8.b);
                                } else {
                                    m95Var = null;
                                }
                            }
                        }
                        qb5 qb5Var4 = us0.a;
                        int i21 = i12 | 3136;
                        j30VarQ.e(-142660079);
                        vs0 vs0Var = vs0.w;
                        ts0 ts0Var6 = (ts0) t95Var2.b();
                        j30VarQ.e(-288165413);
                        int iOrdinal5 = ts0Var6.ordinal();
                        if (iOrdinal5 == 0) {
                            lPt8 = lPt8B;
                            zdtf = zdtf3;
                            u34 u34Var9 = kt0Var.a().d;
                            if (u34Var9 != null) {
                                m95Var2 = new m95(u34Var9.b);
                            } else {
                                u34 u34Var10 = lv0Var.a().d;
                                if (u34Var10 != null) {
                                    m95Var2 = new m95(u34Var10.b);
                                } else {
                                    m95Var2 = null;
                                }
                            }
                        } else if (iOrdinal5 == 1) {
                            lPt8 = lPt8B;
                            zdtf = zdtf3;
                            m95Var2 = m95Var;
                        } else {
                            if (iOrdinal5 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            u34 u34Var11 = lv0Var.a().d;
                            if (u34Var11 != null) {
                                lPt8 = lPt8B;
                                zdtf = zdtf3;
                                m95Var2 = new m95(u34Var11.b);
                            } else {
                                lPt8 = lPt8B;
                                zdtf = zdtf3;
                                u34 u34Var12 = kt0Var.a().d;
                                if (u34Var12 != null) {
                                    m95Var2 = new m95(u34Var12.b);
                                } else {
                                    m95Var2 = null;
                                }
                            }
                        }
                        long j = m95Var2 != null ? m95Var2.a : m95.b;
                        j30VarQ.R(false);
                        m95 m95Var4 = new m95(j);
                        ts0 ts0Var7 = (ts0) t95Var2.d();
                        j30VarQ.e(-288165413);
                        int iOrdinal6 = ts0Var7.ordinal();
                        if (iOrdinal6 == 0) {
                            u34 u34Var13 = kt0Var.a().d;
                            if (u34Var13 != null) {
                                m95Var3 = new m95(u34Var13.b);
                            } else {
                                u34 u34Var14 = lv0Var.a().d;
                                if (u34Var14 != null) {
                                    m95Var3 = new m95(u34Var14.b);
                                } else {
                                    m95Var = null;
                                }
                            }
                            m95Var = m95Var3;
                        } else if (iOrdinal6 != 1) {
                            if (iOrdinal6 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            u34 u34Var15 = lv0Var.a().d;
                            if (u34Var15 != null) {
                                m95Var3 = new m95(u34Var15.b);
                            } else {
                                u34 u34Var16 = kt0Var.a().d;
                                if (u34Var16 != null) {
                                    m95Var3 = new m95(u34Var16.b);
                                } else {
                                    m95Var = null;
                                }
                            }
                            m95Var = m95Var3;
                        }
                        long j2 = m95Var != null ? m95Var.a : m95.b;
                        j30VarQ.R(false);
                        t95.LPt8Fixed lPt8B2 = da5.b(t95Var2, m95Var4, new m95(j2), vs0Var.invoke(t95Var2.c(), j30VarQ, Integer.valueOf((i21 >> 3) & 112)), qb5Var4, "TransformOriginInterruptionHandling", j30VarQ);
                        j30VarQ.R(false);
                        ws0 ws0Var = new ws0(is4Var, lPt8, lPt8B2);
                        wo1.QnHx qnHx = wo1.a;
                        pg2VarY = pg2VarA.y(new cb(ws0Var));
                    } else {
                        z = false;
                        zdtf = zdtf3;
                        if (((Boolean) ri2Var2.getValue()).booleanValue()) {
                            xs0 xs0Var = new xs0(is4Var);
                            wo1.QnHx qnHx2 = wo1.a;
                            pg2VarY = pg2VarA.y(new cb(xs0Var));
                        } else {
                            pg2VarY = pg2VarA;
                        }
                    }
                    j30VarQ.R(z);
                    z2 = false;
                    pg2 pg2VarY2 = pg2Var.y(pg2VarY);
                    j30VarQ.e(-492369756);
                    Object objB9 = j30VarQ.b0();
                    if (objB9 == c0132QnHx) {
                        zdtf2 = zdtf;
                        objB9 = new XsuS(zdtf2);
                        j30VarQ.F0(objB9);
                    } else {
                        zdtf2 = zdtf;
                    }
                    j30VarQ.R(false);
                    rb2 rb2Var = (rb2) objB9;
                    j30VarQ.e(-1323940314);
                    ij0 ij0Var = (ij0) j30VarQ.E(r40.e);
                    jy1 jy1Var = (jy1) j30VarQ.E(r40.k);
                    ti5 ti5Var = (ti5) j30VarQ.E(r40.o);
                    a30.e.getClass();
                    yy1.QnHx qnHx3 = a30.QnHx.b;
                    sz szVarJ = S12N.j(pg2VarY2);
                    if (!(j30VarQ.a instanceof jE)) {
                        fp1.c0();
                        throw null;
                    }
                    j30VarQ.s();
                    if (j30VarQ.K) {
                        j30VarQ.l(qnHx3);
                    } else {
                        j30VarQ.A();
                    }
                    j30VarQ.x = false;
                    hH.u(j30VarQ, rb2Var, a30.QnHx.e);
                    hH.u(j30VarQ, ij0Var, a30.QnHx.d);
                    hH.u(j30VarQ, jy1Var, a30.QnHx.f);
                    Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, 1797450476);
                    y81Var.invoke(zdtf2, j30VarQ, Integer.valueOf(((i8 >> 9) & 112) | 8));
                    j30VarQ.R(false);
                    j30VarQ.R(false);
                    j30VarQ.R(true);
                    j30VarQ.R(false);
                } else {
                    z2 = false;
                }
                j30VarQ.R(z2);
            }
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(t95Var, j81Var, pg2Var, kt0Var, lv0Var, y81Var, i);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00df  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:81:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:84:0x0102  */
    /* JADX WARN: Code duplicated, block: B:89:0x013d  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    public static final void b(wv wvVar, boolean z, pg2 pg2Var, kt0 kt0Var, lv0 lv0Var, String str, y81<? super lcO, ? super g30, ? super Integer, sd5> y81Var, g30 g30Var, int i, int i2) {
        int i3;
        pg2 pg2Var2;
        int i4;
        kt0 kt0VarB;
        int i5;
        int i6;
        lv0 lv0Var2;
        int i7;
        int i8;
        String str2;
        int i9;
        int i10;
        pg2 pg2Var3;
        lv0 lv0VarB;
        String str3;
        lv0 lv0Var3;
        kt0 kt0Var2;
        String str4;
        tk3 tk3VarU;
        j30 j30VarQ = g30Var.q(1766503102);
        if ((i2 & 1) != 0) {
            i3 = i | 48;
        } else if ((i & 112) == 0) {
            i3 = (j30VarQ.c(z) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 896) == 0) {
                pg2Var2 = pg2Var;
                i3 |= j30VarQ.I(pg2Var2) ? 256 : 128;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 7168) == 0) {
                    kt0VarB = kt0Var;
                    if (j30VarQ.I(kt0VarB)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 57344) == 0) {
                        lv0Var2 = lv0Var;
                        if (j30VarQ.I(lv0Var2)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((i & 458752) == 0) {
                            str2 = str;
                            if (j30VarQ.I(str2)) {
                                i9 = 131072;
                            } else {
                                i9 = 65536;
                            }
                            i3 |= i9;
                        }
                        if ((i2 & 32) != 0) {
                            i3 |= 1572864;
                        } else if ((3670016 & i) == 0) {
                            if (j30VarQ.I(y81Var)) {
                                i10 = 1048576;
                            } else {
                                i10 = 524288;
                            }
                            i3 |= i10;
                        }
                        if ((2995921 & i3) == 599184 || !j30VarQ.t()) {
                            if (i11 != 0) {
                                pg2Var3 = pg2.QnHx.w;
                            } else {
                                pg2Var3 = pg2Var2;
                            }
                            if (i4 != 0) {
                                kt0VarB = us0.b(null, 3).b(us0.a(null, 15));
                            }
                            if (i6 != 0) {
                                lv0VarB = us0.c().b(us0.d(null, 15));
                            } else {
                                lv0VarB = lv0Var2;
                            }
                            if (i8 != 0) {
                                str3 = "AnimatedVisibility";
                            } else {
                                str3 = str2;
                            }
                            int i12 = i3 >> 3;
                            a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i12 & 14) | ((i3 >> 12) & 112), 0), NUlFixed.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (458752 & i12));
                            String str5 = str3;
                            lv0Var3 = lv0VarB;
                            kt0Var2 = kt0VarB;
                            str4 = str5;
                        } else {
                            j30VarQ.x();
                            pg2Var3 = pg2Var2;
                            kt0Var2 = kt0VarB;
                            lv0Var3 = lv0Var2;
                            str4 = str2;
                        }
                        tk3VarU = j30VarQ.U();
                        if (tk3VarU == null) {
                            return;
                        }
                        tk3VarU.d = new YKK(wvVar, z, pg2Var3, kt0Var2, lv0Var3, str4, y81Var, i, i2);
                    }
                    i3 |= 196608;
                    str2 = str;
                    if ((i2 & 32) != 0) {
                        i3 |= 1572864;
                    } else if ((3670016 & i) == 0) {
                        if (j30VarQ.I(y81Var)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                    if ((2995921 & i3) == 599184) {
                        if (i11 != 0) {
                            pg2Var3 = pg2.QnHx.w;
                        } else {
                            pg2Var3 = pg2Var2;
                        }
                        if (i4 != 0) {
                            kt0VarB = us0.b(null, 3).b(us0.a(null, 15));
                        }
                        if (i6 != 0) {
                            lv0VarB = us0.c().b(us0.d(null, 15));
                        } else {
                            lv0VarB = lv0Var2;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        int i13 = i3 >> 3;
                        a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i13 & 14) | ((i3 >> 12) & 112), 0), NUlFixed.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (458752 & i13));
                        String str6 = str3;
                        lv0Var3 = lv0VarB;
                        kt0Var2 = kt0VarB;
                        str4 = str6;
                    } else {
                        if (i11 != 0) {
                            pg2Var3 = pg2.QnHx.w;
                        } else {
                            pg2Var3 = pg2Var2;
                        }
                        if (i4 != 0) {
                            kt0VarB = us0.b(null, 3).b(us0.a(null, 15));
                        }
                        if (i6 != 0) {
                            lv0VarB = us0.c().b(us0.d(null, 15));
                        } else {
                            lv0VarB = lv0Var2;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        int i14 = i3 >> 3;
                        a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i14 & 14) | ((i3 >> 12) & 112), 0), NUlFixed.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (458752 & i14));
                        String str7 = str3;
                        lv0Var3 = lv0VarB;
                        kt0Var2 = kt0VarB;
                        str4 = str7;
                    }
                    tk3VarU = j30VarQ.U();
                    if (tk3VarU == null) {
                        return;
                    }
                    tk3VarU.d = new YKK(wvVar, z, pg2Var3, kt0Var2, lv0Var3, str4, y81Var, i, i2);
                }
                i3 |= 24576;
                lv0Var2 = lv0Var;
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 458752) == 0) {
                        str2 = str;
                        if (j30VarQ.I(str2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & 32) != 0) {
                        i3 |= 1572864;
                    } else if ((3670016 & i) == 0) {
                        if (j30VarQ.I(y81Var)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                    if ((2995921 & i3) == 599184) {
                        if (i11 != 0) {
                            pg2Var3 = pg2.QnHx.w;
                        } else {
                            pg2Var3 = pg2Var2;
                        }
                        if (i4 != 0) {
                            kt0VarB = us0.b(null, 3).b(us0.a(null, 15));
                        }
                        if (i6 != 0) {
                            lv0VarB = us0.c().b(us0.d(null, 15));
                        } else {
                            lv0VarB = lv0Var2;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        int i15 = i3 >> 3;
                        a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i15 & 14) | ((i3 >> 12) & 112), 0), NUlFixed.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (458752 & i15));
                        String str8 = str3;
                        lv0Var3 = lv0VarB;
                        kt0Var2 = kt0VarB;
                        str4 = str8;
                    } else {
                        if (i11 != 0) {
                            pg2Var3 = pg2.QnHx.w;
                        } else {
                            pg2Var3 = pg2Var2;
                        }
                        if (i4 != 0) {
                            kt0VarB = us0.b(null, 3).b(us0.a(null, 15));
                        }
                        if (i6 != 0) {
                            lv0VarB = us0.c().b(us0.d(null, 15));
                        } else {
                            lv0VarB = lv0Var2;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        int i16 = i3 >> 3;
                        a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i16 & 14) | ((i3 >> 12) & 112), 0), NUlFixed.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (458752 & i16));
                        String str9 = str3;
                        lv0Var3 = lv0VarB;
                        kt0Var2 = kt0VarB;
                        str4 = str9;
                    }
                    tk3VarU = j30VarQ.U();
                    if (tk3VarU == null) {
                        return;
                    }
                    tk3VarU.d = new YKK(wvVar, z, pg2Var3, kt0Var2, lv0Var3, str4, y81Var, i, i2);
                }
                i3 |= 196608;
                str2 = str;
                if ((i2 & 32) != 0) {
                    i3 |= 1572864;
                } else if ((3670016 & i) == 0) {
                    if (j30VarQ.I(y81Var)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                if ((2995921 & i3) == 599184) {
                    if (i11 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    if (i4 != 0) {
                        kt0VarB = us0.b(null, 3).b(us0.a(null, 15));
                    }
                    if (i6 != 0) {
                        lv0VarB = us0.c().b(us0.d(null, 15));
                    } else {
                        lv0VarB = lv0Var2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    int i17 = i3 >> 3;
                    a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i17 & 14) | ((i3 >> 12) & 112), 0), NUlFixed.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (458752 & i17));
                    String str10 = str3;
                    lv0Var3 = lv0VarB;
                    kt0Var2 = kt0VarB;
                    str4 = str10;
                } else {
                    if (i11 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    if (i4 != 0) {
                        kt0VarB = us0.b(null, 3).b(us0.a(null, 15));
                    }
                    if (i6 != 0) {
                        lv0VarB = us0.c().b(us0.d(null, 15));
                    } else {
                        lv0VarB = lv0Var2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    int i18 = i3 >> 3;
                    a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i18 & 14) | ((i3 >> 12) & 112), 0), NUlFixed.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (458752 & i18));
                    String str11 = str3;
                    lv0Var3 = lv0VarB;
                    kt0Var2 = kt0VarB;
                    str4 = str11;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new YKK(wvVar, z, pg2Var3, kt0Var2, lv0Var3, str4, y81Var, i, i2);
            }
            i3 |= 3072;
            kt0VarB = kt0Var;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 57344) == 0) {
                    lv0Var2 = lv0Var;
                    if (j30VarQ.I(lv0Var2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 458752) == 0) {
                        str2 = str;
                        if (j30VarQ.I(str2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & 32) != 0) {
                        i3 |= 1572864;
                    } else if ((3670016 & i) == 0) {
                        if (j30VarQ.I(y81Var)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                    if ((2995921 & i3) == 599184) {
                        if (i11 != 0) {
                            pg2Var3 = pg2.QnHx.w;
                        } else {
                            pg2Var3 = pg2Var2;
                        }
                        if (i4 != 0) {
                            kt0VarB = us0.b(null, 3).b(us0.a(null, 15));
                        }
                        if (i6 != 0) {
                            lv0VarB = us0.c().b(us0.d(null, 15));
                        } else {
                            lv0VarB = lv0Var2;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        int i19 = i3 >> 3;
                        a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i19 & 14) | ((i3 >> 12) & 112), 0), NUlFixed.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (458752 & i19));
                        String str12 = str3;
                        lv0Var3 = lv0VarB;
                        kt0Var2 = kt0VarB;
                        str4 = str12;
                    } else {
                        if (i11 != 0) {
                            pg2Var3 = pg2.QnHx.w;
                        } else {
                            pg2Var3 = pg2Var2;
                        }
                        if (i4 != 0) {
                            kt0VarB = us0.b(null, 3).b(us0.a(null, 15));
                        }
                        if (i6 != 0) {
                            lv0VarB = us0.c().b(us0.d(null, 15));
                        } else {
                            lv0VarB = lv0Var2;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        int i110 = i3 >> 3;
                        a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i110 & 14) | ((i3 >> 12) & 112), 0), NUlFixed.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (458752 & i110));
                        String str13 = str3;
                        lv0Var3 = lv0VarB;
                        kt0Var2 = kt0VarB;
                        str4 = str13;
                    }
                    tk3VarU = j30VarQ.U();
                    if (tk3VarU == null) {
                        return;
                    }
                    tk3VarU.d = new YKK(wvVar, z, pg2Var3, kt0Var2, lv0Var3, str4, y81Var, i, i2);
                }
                i3 |= 196608;
                str2 = str;
                if ((i2 & 32) != 0) {
                    i3 |= 1572864;
                } else if ((3670016 & i) == 0) {
                    if (j30VarQ.I(y81Var)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                if ((2995921 & i3) == 599184) {
                    if (i11 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    if (i4 != 0) {
                        kt0VarB = us0.b(null, 3).b(us0.a(null, 15));
                    }
                    if (i6 != 0) {
                        lv0VarB = us0.c().b(us0.d(null, 15));
                    } else {
                        lv0VarB = lv0Var2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    int i111 = i3 >> 3;
                    a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i111 & 14) | ((i3 >> 12) & 112), 0), NUlFixed.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (458752 & i111));
                    String str14 = str3;
                    lv0Var3 = lv0VarB;
                    kt0Var2 = kt0VarB;
                    str4 = str14;
                } else {
                    if (i11 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    if (i4 != 0) {
                        kt0VarB = us0.b(null, 3).b(us0.a(null, 15));
                    }
                    if (i6 != 0) {
                        lv0VarB = us0.c().b(us0.d(null, 15));
                    } else {
                        lv0VarB = lv0Var2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    int i112 = i3 >> 3;
                    a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i112 & 14) | ((i3 >> 12) & 112), 0), NUlFixed.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (458752 & i112));
                    String str15 = str3;
                    lv0Var3 = lv0VarB;
                    kt0Var2 = kt0VarB;
                    str4 = str15;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new YKK(wvVar, z, pg2Var3, kt0Var2, lv0Var3, str4, y81Var, i, i2);
            }
            i3 |= 24576;
            lv0Var2 = lv0Var;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 458752) == 0) {
                    str2 = str;
                    if (j30VarQ.I(str2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 1572864;
                } else if ((3670016 & i) == 0) {
                    if (j30VarQ.I(y81Var)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                if ((2995921 & i3) == 599184) {
                    if (i11 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    if (i4 != 0) {
                        kt0VarB = us0.b(null, 3).b(us0.a(null, 15));
                    }
                    if (i6 != 0) {
                        lv0VarB = us0.c().b(us0.d(null, 15));
                    } else {
                        lv0VarB = lv0Var2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    int i113 = i3 >> 3;
                    a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i113 & 14) | ((i3 >> 12) & 112), 0), NUlFixed.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (458752 & i113));
                    String str16 = str3;
                    lv0Var3 = lv0VarB;
                    kt0Var2 = kt0VarB;
                    str4 = str16;
                } else {
                    if (i11 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    if (i4 != 0) {
                        kt0VarB = us0.b(null, 3).b(us0.a(null, 15));
                    }
                    if (i6 != 0) {
                        lv0VarB = us0.c().b(us0.d(null, 15));
                    } else {
                        lv0VarB = lv0Var2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    int i114 = i3 >> 3;
                    a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i114 & 14) | ((i3 >> 12) & 112), 0), NUlFixed.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (458752 & i114));
                    String str17 = str3;
                    lv0Var3 = lv0VarB;
                    kt0Var2 = kt0VarB;
                    str4 = str17;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new YKK(wvVar, z, pg2Var3, kt0Var2, lv0Var3, str4, y81Var, i, i2);
            }
            i3 |= 196608;
            str2 = str;
            if ((i2 & 32) != 0) {
                i3 |= 1572864;
            } else if ((3670016 & i) == 0) {
                if (j30VarQ.I(y81Var)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i3 |= i10;
            }
            if ((2995921 & i3) == 599184) {
                if (i11 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                if (i4 != 0) {
                    kt0VarB = us0.b(null, 3).b(us0.a(null, 15));
                }
                if (i6 != 0) {
                    lv0VarB = us0.c().b(us0.d(null, 15));
                } else {
                    lv0VarB = lv0Var2;
                }
                if (i8 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                int i115 = i3 >> 3;
                a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i115 & 14) | ((i3 >> 12) & 112), 0), NUlFixed.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (458752 & i115));
                String str18 = str3;
                lv0Var3 = lv0VarB;
                kt0Var2 = kt0VarB;
                str4 = str18;
            } else {
                if (i11 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                if (i4 != 0) {
                    kt0VarB = us0.b(null, 3).b(us0.a(null, 15));
                }
                if (i6 != 0) {
                    lv0VarB = us0.c().b(us0.d(null, 15));
                } else {
                    lv0VarB = lv0Var2;
                }
                if (i8 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                int i116 = i3 >> 3;
                a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i116 & 14) | ((i3 >> 12) & 112), 0), NUlFixed.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (458752 & i116));
                String str19 = str3;
                lv0Var3 = lv0VarB;
                kt0Var2 = kt0VarB;
                str4 = str19;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new YKK(wvVar, z, pg2Var3, kt0Var2, lv0Var3, str4, y81Var, i, i2);
        }
        i3 |= 384;
        pg2Var2 = pg2Var;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 7168) == 0) {
                kt0VarB = kt0Var;
                if (j30VarQ.I(kt0VarB)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 57344) == 0) {
                    lv0Var2 = lv0Var;
                    if (j30VarQ.I(lv0Var2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 458752) == 0) {
                        str2 = str;
                        if (j30VarQ.I(str2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & 32) != 0) {
                        i3 |= 1572864;
                    } else if ((3670016 & i) == 0) {
                        if (j30VarQ.I(y81Var)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                    if ((2995921 & i3) == 599184) {
                        if (i11 != 0) {
                            pg2Var3 = pg2.QnHx.w;
                        } else {
                            pg2Var3 = pg2Var2;
                        }
                        if (i4 != 0) {
                            kt0VarB = us0.b(null, 3).b(us0.a(null, 15));
                        }
                        if (i6 != 0) {
                            lv0VarB = us0.c().b(us0.d(null, 15));
                        } else {
                            lv0VarB = lv0Var2;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        int i117 = i3 >> 3;
                        a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i117 & 14) | ((i3 >> 12) & 112), 0), NUlFixed.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (458752 & i117));
                        String str110 = str3;
                        lv0Var3 = lv0VarB;
                        kt0Var2 = kt0VarB;
                        str4 = str110;
                    } else {
                        if (i11 != 0) {
                            pg2Var3 = pg2.QnHx.w;
                        } else {
                            pg2Var3 = pg2Var2;
                        }
                        if (i4 != 0) {
                            kt0VarB = us0.b(null, 3).b(us0.a(null, 15));
                        }
                        if (i6 != 0) {
                            lv0VarB = us0.c().b(us0.d(null, 15));
                        } else {
                            lv0VarB = lv0Var2;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        int i118 = i3 >> 3;
                        a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i118 & 14) | ((i3 >> 12) & 112), 0), NUlFixed.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (458752 & i118));
                        String str111 = str3;
                        lv0Var3 = lv0VarB;
                        kt0Var2 = kt0VarB;
                        str4 = str111;
                    }
                    tk3VarU = j30VarQ.U();
                    if (tk3VarU == null) {
                        return;
                    }
                    tk3VarU.d = new YKK(wvVar, z, pg2Var3, kt0Var2, lv0Var3, str4, y81Var, i, i2);
                }
                i3 |= 196608;
                str2 = str;
                if ((i2 & 32) != 0) {
                    i3 |= 1572864;
                } else if ((3670016 & i) == 0) {
                    if (j30VarQ.I(y81Var)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                if ((2995921 & i3) == 599184) {
                    if (i11 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    if (i4 != 0) {
                        kt0VarB = us0.b(null, 3).b(us0.a(null, 15));
                    }
                    if (i6 != 0) {
                        lv0VarB = us0.c().b(us0.d(null, 15));
                    } else {
                        lv0VarB = lv0Var2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    int i119 = i3 >> 3;
                    a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i119 & 14) | ((i3 >> 12) & 112), 0), NUlFixed.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (458752 & i119));
                    String str112 = str3;
                    lv0Var3 = lv0VarB;
                    kt0Var2 = kt0VarB;
                    str4 = str112;
                } else {
                    if (i11 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    if (i4 != 0) {
                        kt0VarB = us0.b(null, 3).b(us0.a(null, 15));
                    }
                    if (i6 != 0) {
                        lv0VarB = us0.c().b(us0.d(null, 15));
                    } else {
                        lv0VarB = lv0Var2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    int i1110 = i3 >> 3;
                    a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i1110 & 14) | ((i3 >> 12) & 112), 0), NUlFixed.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (458752 & i1110));
                    String str113 = str3;
                    lv0Var3 = lv0VarB;
                    kt0Var2 = kt0VarB;
                    str4 = str113;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new YKK(wvVar, z, pg2Var3, kt0Var2, lv0Var3, str4, y81Var, i, i2);
            }
            i3 |= 24576;
            lv0Var2 = lv0Var;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 458752) == 0) {
                    str2 = str;
                    if (j30VarQ.I(str2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 1572864;
                } else if ((3670016 & i) == 0) {
                    if (j30VarQ.I(y81Var)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                if ((2995921 & i3) == 599184) {
                    if (i11 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    if (i4 != 0) {
                        kt0VarB = us0.b(null, 3).b(us0.a(null, 15));
                    }
                    if (i6 != 0) {
                        lv0VarB = us0.c().b(us0.d(null, 15));
                    } else {
                        lv0VarB = lv0Var2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    int i1111 = i3 >> 3;
                    a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i1111 & 14) | ((i3 >> 12) & 112), 0), NUlFixed.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (458752 & i1111));
                    String str114 = str3;
                    lv0Var3 = lv0VarB;
                    kt0Var2 = kt0VarB;
                    str4 = str114;
                } else {
                    if (i11 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    if (i4 != 0) {
                        kt0VarB = us0.b(null, 3).b(us0.a(null, 15));
                    }
                    if (i6 != 0) {
                        lv0VarB = us0.c().b(us0.d(null, 15));
                    } else {
                        lv0VarB = lv0Var2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    int i1112 = i3 >> 3;
                    a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i1112 & 14) | ((i3 >> 12) & 112), 0), NUlFixed.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (458752 & i1112));
                    String str115 = str3;
                    lv0Var3 = lv0VarB;
                    kt0Var2 = kt0VarB;
                    str4 = str115;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new YKK(wvVar, z, pg2Var3, kt0Var2, lv0Var3, str4, y81Var, i, i2);
            }
            i3 |= 196608;
            str2 = str;
            if ((i2 & 32) != 0) {
                i3 |= 1572864;
            } else if ((3670016 & i) == 0) {
                if (j30VarQ.I(y81Var)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i3 |= i10;
            }
            if ((2995921 & i3) == 599184) {
                if (i11 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                if (i4 != 0) {
                    kt0VarB = us0.b(null, 3).b(us0.a(null, 15));
                }
                if (i6 != 0) {
                    lv0VarB = us0.c().b(us0.d(null, 15));
                } else {
                    lv0VarB = lv0Var2;
                }
                if (i8 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                int i1113 = i3 >> 3;
                a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i1113 & 14) | ((i3 >> 12) & 112), 0), NUlFixed.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (458752 & i1113));
                String str116 = str3;
                lv0Var3 = lv0VarB;
                kt0Var2 = kt0VarB;
                str4 = str116;
            } else {
                if (i11 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                if (i4 != 0) {
                    kt0VarB = us0.b(null, 3).b(us0.a(null, 15));
                }
                if (i6 != 0) {
                    lv0VarB = us0.c().b(us0.d(null, 15));
                } else {
                    lv0VarB = lv0Var2;
                }
                if (i8 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                int i1114 = i3 >> 3;
                a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i1114 & 14) | ((i3 >> 12) & 112), 0), NUlFixed.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (458752 & i1114));
                String str117 = str3;
                lv0Var3 = lv0VarB;
                kt0Var2 = kt0VarB;
                str4 = str117;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new YKK(wvVar, z, pg2Var3, kt0Var2, lv0Var3, str4, y81Var, i, i2);
        }
        i3 |= 3072;
        kt0VarB = kt0Var;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 57344) == 0) {
                lv0Var2 = lv0Var;
                if (j30VarQ.I(lv0Var2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 458752) == 0) {
                    str2 = str;
                    if (j30VarQ.I(str2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 1572864;
                } else if ((3670016 & i) == 0) {
                    if (j30VarQ.I(y81Var)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                if ((2995921 & i3) == 599184) {
                    if (i11 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    if (i4 != 0) {
                        kt0VarB = us0.b(null, 3).b(us0.a(null, 15));
                    }
                    if (i6 != 0) {
                        lv0VarB = us0.c().b(us0.d(null, 15));
                    } else {
                        lv0VarB = lv0Var2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    int i1115 = i3 >> 3;
                    a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i1115 & 14) | ((i3 >> 12) & 112), 0), NUlFixed.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (458752 & i1115));
                    String str118 = str3;
                    lv0Var3 = lv0VarB;
                    kt0Var2 = kt0VarB;
                    str4 = str118;
                } else {
                    if (i11 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    if (i4 != 0) {
                        kt0VarB = us0.b(null, 3).b(us0.a(null, 15));
                    }
                    if (i6 != 0) {
                        lv0VarB = us0.c().b(us0.d(null, 15));
                    } else {
                        lv0VarB = lv0Var2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    int i1116 = i3 >> 3;
                    a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i1116 & 14) | ((i3 >> 12) & 112), 0), NUlFixed.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (458752 & i1116));
                    String str119 = str3;
                    lv0Var3 = lv0VarB;
                    kt0Var2 = kt0VarB;
                    str4 = str119;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new YKK(wvVar, z, pg2Var3, kt0Var2, lv0Var3, str4, y81Var, i, i2);
            }
            i3 |= 196608;
            str2 = str;
            if ((i2 & 32) != 0) {
                i3 |= 1572864;
            } else if ((3670016 & i) == 0) {
                if (j30VarQ.I(y81Var)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i3 |= i10;
            }
            if ((2995921 & i3) == 599184) {
                if (i11 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                if (i4 != 0) {
                    kt0VarB = us0.b(null, 3).b(us0.a(null, 15));
                }
                if (i6 != 0) {
                    lv0VarB = us0.c().b(us0.d(null, 15));
                } else {
                    lv0VarB = lv0Var2;
                }
                if (i8 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                int i1117 = i3 >> 3;
                a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i1117 & 14) | ((i3 >> 12) & 112), 0), NUlFixed.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (458752 & i1117));
                String str1110 = str3;
                lv0Var3 = lv0VarB;
                kt0Var2 = kt0VarB;
                str4 = str1110;
            } else {
                if (i11 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                if (i4 != 0) {
                    kt0VarB = us0.b(null, 3).b(us0.a(null, 15));
                }
                if (i6 != 0) {
                    lv0VarB = us0.c().b(us0.d(null, 15));
                } else {
                    lv0VarB = lv0Var2;
                }
                if (i8 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                int i1118 = i3 >> 3;
                a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i1118 & 14) | ((i3 >> 12) & 112), 0), NUlFixed.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (458752 & i1118));
                String str1111 = str3;
                lv0Var3 = lv0VarB;
                kt0Var2 = kt0VarB;
                str4 = str1111;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new YKK(wvVar, z, pg2Var3, kt0Var2, lv0Var3, str4, y81Var, i, i2);
        }
        i3 |= 24576;
        lv0Var2 = lv0Var;
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((i & 458752) == 0) {
                str2 = str;
                if (j30VarQ.I(str2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            if ((i2 & 32) != 0) {
                i3 |= 1572864;
            } else if ((3670016 & i) == 0) {
                if (j30VarQ.I(y81Var)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i3 |= i10;
            }
            if ((2995921 & i3) == 599184) {
                if (i11 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                if (i4 != 0) {
                    kt0VarB = us0.b(null, 3).b(us0.a(null, 15));
                }
                if (i6 != 0) {
                    lv0VarB = us0.c().b(us0.d(null, 15));
                } else {
                    lv0VarB = lv0Var2;
                }
                if (i8 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                int i1119 = i3 >> 3;
                a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i1119 & 14) | ((i3 >> 12) & 112), 0), NUlFixed.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (458752 & i1119));
                String str1112 = str3;
                lv0Var3 = lv0VarB;
                kt0Var2 = kt0VarB;
                str4 = str1112;
            } else {
                if (i11 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                if (i4 != 0) {
                    kt0VarB = us0.b(null, 3).b(us0.a(null, 15));
                }
                if (i6 != 0) {
                    lv0VarB = us0.c().b(us0.d(null, 15));
                } else {
                    lv0VarB = lv0Var2;
                }
                if (i8 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                int i11110 = i3 >> 3;
                a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i11110 & 14) | ((i3 >> 12) & 112), 0), NUlFixed.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (458752 & i11110));
                String str1113 = str3;
                lv0Var3 = lv0VarB;
                kt0Var2 = kt0VarB;
                str4 = str1113;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new YKK(wvVar, z, pg2Var3, kt0Var2, lv0Var3, str4, y81Var, i, i2);
        }
        i3 |= 196608;
        str2 = str;
        if ((i2 & 32) != 0) {
            i3 |= 1572864;
        } else if ((3670016 & i) == 0) {
            if (j30VarQ.I(y81Var)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i3 |= i10;
        }
        if ((2995921 & i3) == 599184) {
            if (i11 != 0) {
                pg2Var3 = pg2.QnHx.w;
            } else {
                pg2Var3 = pg2Var2;
            }
            if (i4 != 0) {
                kt0VarB = us0.b(null, 3).b(us0.a(null, 15));
            }
            if (i6 != 0) {
                lv0VarB = us0.c().b(us0.d(null, 15));
            } else {
                lv0VarB = lv0Var2;
            }
            if (i8 != 0) {
                str3 = "AnimatedVisibility";
            } else {
                str3 = str2;
            }
            int i11111 = i3 >> 3;
            a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i11111 & 14) | ((i3 >> 12) & 112), 0), NUlFixed.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (458752 & i11111));
            String str1114 = str3;
            lv0Var3 = lv0VarB;
            kt0Var2 = kt0VarB;
            str4 = str1114;
        } else {
            if (i11 != 0) {
                pg2Var3 = pg2.QnHx.w;
            } else {
                pg2Var3 = pg2Var2;
            }
            if (i4 != 0) {
                kt0VarB = us0.b(null, 3).b(us0.a(null, 15));
            }
            if (i6 != 0) {
                lv0VarB = us0.c().b(us0.d(null, 15));
            } else {
                lv0VarB = lv0Var2;
            }
            if (i8 != 0) {
                str3 = "AnimatedVisibility";
            } else {
                str3 = str2;
            }
            int i11112 = i3 >> 3;
            a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i11112 & 14) | ((i3 >> 12) & 112), 0), NUlFixed.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (458752 & i11112));
            String str1115 = str3;
            lv0Var3 = lv0VarB;
            kt0Var2 = kt0VarB;
            str4 = str1115;
        }
        tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new YKK(wvVar, z, pg2Var3, kt0Var2, lv0Var3, str4, y81Var, i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:79:0x0117  */
    /* JADX WARN: Code duplicated, block: B:81:0x011a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0153  */
    /* JADX WARN: Code duplicated, block: B:84:0x0156  */
    /* JADX WARN: Code duplicated, block: B:85:0x0159  */
    /* JADX WARN: Code duplicated, block: B:90:0x0192  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    public static final void c(boolean z, pg2 pg2Var, kt0 kt0Var, lv0 lv0Var, String str, y81<? super lcO, ? super g30, ? super Integer, sd5> y81Var, g30 g30Var, int i, int i2) {
        int i3;
        pg2 pg2Var2;
        int i4;
        kt0 kt0Var2;
        int i5;
        int i6;
        lv0 lv0Var2;
        int i7;
        int i8;
        String str2;
        int i9;
        int i10;
        pg2 pg2Var3;
        da daVar;
        kt0 kt0VarB;
        lv0 lv0VarB;
        String str3;
        pg2 pg2Var4;
        kt0 kt0Var3;
        tk3 tk3VarU;
        j30 j30VarQ = g30Var.q(2088733774);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.c(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 112) == 0) {
                pg2Var2 = pg2Var;
                i3 |= j30VarQ.I(pg2Var2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    kt0Var2 = kt0Var;
                    if (j30VarQ.I(kt0Var2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 7168) == 0) {
                        lv0Var2 = lv0Var;
                        if (j30VarQ.I(lv0Var2)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((i & 57344) == 0) {
                            str2 = str;
                            if (j30VarQ.I(str2)) {
                                i9 = 16384;
                            } else {
                                i9 = 8192;
                            }
                            i3 |= i9;
                        }
                        if ((i2 & 32) != 0) {
                            i3 |= 196608;
                        } else if ((i & 458752) == 0) {
                            if (j30VarQ.I(y81Var)) {
                                i10 = 131072;
                            } else {
                                i10 = 65536;
                            }
                            i3 |= i10;
                        }
                        if ((374491 & i3) == 74898 || !j30VarQ.t()) {
                            if (i11 != 0) {
                                pg2Var3 = pg2.QnHx.w;
                            } else {
                                pg2Var3 = pg2Var2;
                            }
                            daVar = One.QnHx.i;
                            if (i4 != 0) {
                                lt0 lt0VarB = us0.b(null, 3);
                                Map<pb5<?, ?>, Float> map = kk5.a;
                                kt0VarB = lt0VarB.b(new lt0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, at0.w, true), null, 11)));
                            } else {
                                kt0VarB = kt0Var2;
                            }
                            if (i6 != 0) {
                                qb5 qb5Var = us0.a;
                                Map<pb5<?, ?>, Float> map2 = kk5.a;
                                lv0VarB = new mv0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, et0.w, true), null, 11)).b(us0.c());
                            } else {
                                lv0VarB = lv0Var2;
                            }
                            if (i8 != 0) {
                                str3 = "AnimatedVisibility";
                            } else {
                                str3 = str;
                            }
                            int i12 = i3 << 3;
                            a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i3 & 14) | ((i3 >> 9) & 112), 0), F1.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 458752) | (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168));
                            pg2Var4 = pg2Var3;
                            kt0Var3 = kt0VarB;
                        } else {
                            j30VarQ.x();
                            pg2Var4 = pg2Var2;
                            kt0Var3 = kt0Var2;
                            lv0VarB = lv0Var2;
                            str3 = str2;
                        }
                        tk3VarU = j30VarQ.U();
                        if (tk3VarU == null) {
                            return;
                        }
                        tk3VarU.d = new LPt8Fixed(z, pg2Var4, kt0Var3, lv0VarB, str3, y81Var, i, i2);
                    }
                    i3 |= 24576;
                    str2 = str;
                    if ((i2 & 32) != 0) {
                        i3 |= 196608;
                    } else if ((i & 458752) == 0) {
                        if (j30VarQ.I(y81Var)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                    if ((374491 & i3) == 74898) {
                        if (i11 != 0) {
                            pg2Var3 = pg2.QnHx.w;
                        } else {
                            pg2Var3 = pg2Var2;
                        }
                        daVar = One.QnHx.i;
                        if (i4 != 0) {
                            lt0 lt0VarB2 = us0.b(null, 3);
                            Map<pb5<?, ?>, Float> map3 = kk5.a;
                            kt0VarB = lt0VarB2.b(new lt0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, at0.w, true), null, 11)));
                        } else {
                            kt0VarB = kt0Var2;
                        }
                        if (i6 != 0) {
                            qb5 qb5Var2 = us0.a;
                            Map<pb5<?, ?>, Float> map4 = kk5.a;
                            lv0VarB = new mv0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, et0.w, true), null, 11)).b(us0.c());
                        } else {
                            lv0VarB = lv0Var2;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        int i13 = i3 << 3;
                        a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i3 & 14) | ((i3 >> 9) & 112), 0), F1.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 458752) | (i13 & 57344) | (i13 & 896) | 48 | (i13 & 7168));
                        pg2Var4 = pg2Var3;
                        kt0Var3 = kt0VarB;
                    } else {
                        if (i11 != 0) {
                            pg2Var3 = pg2.QnHx.w;
                        } else {
                            pg2Var3 = pg2Var2;
                        }
                        daVar = One.QnHx.i;
                        if (i4 != 0) {
                            lt0 lt0VarB3 = us0.b(null, 3);
                            Map<pb5<?, ?>, Float> map5 = kk5.a;
                            kt0VarB = lt0VarB3.b(new lt0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, at0.w, true), null, 11)));
                        } else {
                            kt0VarB = kt0Var2;
                        }
                        if (i6 != 0) {
                            qb5 qb5Var3 = us0.a;
                            Map<pb5<?, ?>, Float> map6 = kk5.a;
                            lv0VarB = new mv0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, et0.w, true), null, 11)).b(us0.c());
                        } else {
                            lv0VarB = lv0Var2;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        int i14 = i3 << 3;
                        a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i3 & 14) | ((i3 >> 9) & 112), 0), F1.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 458752) | (i14 & 57344) | (i14 & 896) | 48 | (i14 & 7168));
                        pg2Var4 = pg2Var3;
                        kt0Var3 = kt0VarB;
                    }
                    tk3VarU = j30VarQ.U();
                    if (tk3VarU == null) {
                        return;
                    }
                    tk3VarU.d = new LPt8Fixed(z, pg2Var4, kt0Var3, lv0VarB, str3, y81Var, i, i2);
                }
                i3 |= 3072;
                lv0Var2 = lv0Var;
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 57344) == 0) {
                        str2 = str;
                        if (j30VarQ.I(str2)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & 32) != 0) {
                        i3 |= 196608;
                    } else if ((i & 458752) == 0) {
                        if (j30VarQ.I(y81Var)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                    if ((374491 & i3) == 74898) {
                        if (i11 != 0) {
                            pg2Var3 = pg2.QnHx.w;
                        } else {
                            pg2Var3 = pg2Var2;
                        }
                        daVar = One.QnHx.i;
                        if (i4 != 0) {
                            lt0 lt0VarB4 = us0.b(null, 3);
                            Map<pb5<?, ?>, Float> map7 = kk5.a;
                            kt0VarB = lt0VarB4.b(new lt0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, at0.w, true), null, 11)));
                        } else {
                            kt0VarB = kt0Var2;
                        }
                        if (i6 != 0) {
                            qb5 qb5Var4 = us0.a;
                            Map<pb5<?, ?>, Float> map8 = kk5.a;
                            lv0VarB = new mv0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, et0.w, true), null, 11)).b(us0.c());
                        } else {
                            lv0VarB = lv0Var2;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        int i15 = i3 << 3;
                        a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i3 & 14) | ((i3 >> 9) & 112), 0), F1.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 458752) | (i15 & 57344) | (i15 & 896) | 48 | (i15 & 7168));
                        pg2Var4 = pg2Var3;
                        kt0Var3 = kt0VarB;
                    } else {
                        if (i11 != 0) {
                            pg2Var3 = pg2.QnHx.w;
                        } else {
                            pg2Var3 = pg2Var2;
                        }
                        daVar = One.QnHx.i;
                        if (i4 != 0) {
                            lt0 lt0VarB5 = us0.b(null, 3);
                            Map<pb5<?, ?>, Float> map9 = kk5.a;
                            kt0VarB = lt0VarB5.b(new lt0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, at0.w, true), null, 11)));
                        } else {
                            kt0VarB = kt0Var2;
                        }
                        if (i6 != 0) {
                            qb5 qb5Var5 = us0.a;
                            Map<pb5<?, ?>, Float> map10 = kk5.a;
                            lv0VarB = new mv0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, et0.w, true), null, 11)).b(us0.c());
                        } else {
                            lv0VarB = lv0Var2;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        int i16 = i3 << 3;
                        a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i3 & 14) | ((i3 >> 9) & 112), 0), F1.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 458752) | (i16 & 57344) | (i16 & 896) | 48 | (i16 & 7168));
                        pg2Var4 = pg2Var3;
                        kt0Var3 = kt0VarB;
                    }
                    tk3VarU = j30VarQ.U();
                    if (tk3VarU == null) {
                        return;
                    }
                    tk3VarU.d = new LPt8Fixed(z, pg2Var4, kt0Var3, lv0VarB, str3, y81Var, i, i2);
                }
                i3 |= 24576;
                str2 = str;
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else if ((i & 458752) == 0) {
                    if (j30VarQ.I(y81Var)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    daVar = One.QnHx.i;
                    if (i4 != 0) {
                        lt0 lt0VarB6 = us0.b(null, 3);
                        Map<pb5<?, ?>, Float> map11 = kk5.a;
                        kt0VarB = lt0VarB6.b(new lt0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, at0.w, true), null, 11)));
                    } else {
                        kt0VarB = kt0Var2;
                    }
                    if (i6 != 0) {
                        qb5 qb5Var6 = us0.a;
                        Map<pb5<?, ?>, Float> map12 = kk5.a;
                        lv0VarB = new mv0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, et0.w, true), null, 11)).b(us0.c());
                    } else {
                        lv0VarB = lv0Var2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    int i17 = i3 << 3;
                    a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i3 & 14) | ((i3 >> 9) & 112), 0), F1.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 458752) | (i17 & 57344) | (i17 & 896) | 48 | (i17 & 7168));
                    pg2Var4 = pg2Var3;
                    kt0Var3 = kt0VarB;
                } else {
                    if (i11 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    daVar = One.QnHx.i;
                    if (i4 != 0) {
                        lt0 lt0VarB7 = us0.b(null, 3);
                        Map<pb5<?, ?>, Float> map13 = kk5.a;
                        kt0VarB = lt0VarB7.b(new lt0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, at0.w, true), null, 11)));
                    } else {
                        kt0VarB = kt0Var2;
                    }
                    if (i6 != 0) {
                        qb5 qb5Var7 = us0.a;
                        Map<pb5<?, ?>, Float> map14 = kk5.a;
                        lv0VarB = new mv0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, et0.w, true), null, 11)).b(us0.c());
                    } else {
                        lv0VarB = lv0Var2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    int i18 = i3 << 3;
                    a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i3 & 14) | ((i3 >> 9) & 112), 0), F1.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 458752) | (i18 & 57344) | (i18 & 896) | 48 | (i18 & 7168));
                    pg2Var4 = pg2Var3;
                    kt0Var3 = kt0VarB;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new LPt8Fixed(z, pg2Var4, kt0Var3, lv0VarB, str3, y81Var, i, i2);
            }
            i3 |= 384;
            kt0Var2 = kt0Var;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 7168) == 0) {
                    lv0Var2 = lv0Var;
                    if (j30VarQ.I(lv0Var2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 57344) == 0) {
                        str2 = str;
                        if (j30VarQ.I(str2)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & 32) != 0) {
                        i3 |= 196608;
                    } else if ((i & 458752) == 0) {
                        if (j30VarQ.I(y81Var)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                    if ((374491 & i3) == 74898) {
                        if (i11 != 0) {
                            pg2Var3 = pg2.QnHx.w;
                        } else {
                            pg2Var3 = pg2Var2;
                        }
                        daVar = One.QnHx.i;
                        if (i4 != 0) {
                            lt0 lt0VarB8 = us0.b(null, 3);
                            Map<pb5<?, ?>, Float> map15 = kk5.a;
                            kt0VarB = lt0VarB8.b(new lt0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, at0.w, true), null, 11)));
                        } else {
                            kt0VarB = kt0Var2;
                        }
                        if (i6 != 0) {
                            qb5 qb5Var8 = us0.a;
                            Map<pb5<?, ?>, Float> map16 = kk5.a;
                            lv0VarB = new mv0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, et0.w, true), null, 11)).b(us0.c());
                        } else {
                            lv0VarB = lv0Var2;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        int i19 = i3 << 3;
                        a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i3 & 14) | ((i3 >> 9) & 112), 0), F1.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 458752) | (i19 & 57344) | (i19 & 896) | 48 | (i19 & 7168));
                        pg2Var4 = pg2Var3;
                        kt0Var3 = kt0VarB;
                    } else {
                        if (i11 != 0) {
                            pg2Var3 = pg2.QnHx.w;
                        } else {
                            pg2Var3 = pg2Var2;
                        }
                        daVar = One.QnHx.i;
                        if (i4 != 0) {
                            lt0 lt0VarB9 = us0.b(null, 3);
                            Map<pb5<?, ?>, Float> map17 = kk5.a;
                            kt0VarB = lt0VarB9.b(new lt0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, at0.w, true), null, 11)));
                        } else {
                            kt0VarB = kt0Var2;
                        }
                        if (i6 != 0) {
                            qb5 qb5Var9 = us0.a;
                            Map<pb5<?, ?>, Float> map18 = kk5.a;
                            lv0VarB = new mv0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, et0.w, true), null, 11)).b(us0.c());
                        } else {
                            lv0VarB = lv0Var2;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        int i110 = i3 << 3;
                        a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i3 & 14) | ((i3 >> 9) & 112), 0), F1.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 458752) | (i110 & 57344) | (i110 & 896) | 48 | (i110 & 7168));
                        pg2Var4 = pg2Var3;
                        kt0Var3 = kt0VarB;
                    }
                    tk3VarU = j30VarQ.U();
                    if (tk3VarU == null) {
                        return;
                    }
                    tk3VarU.d = new LPt8Fixed(z, pg2Var4, kt0Var3, lv0VarB, str3, y81Var, i, i2);
                }
                i3 |= 24576;
                str2 = str;
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else if ((i & 458752) == 0) {
                    if (j30VarQ.I(y81Var)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    daVar = One.QnHx.i;
                    if (i4 != 0) {
                        lt0 lt0VarB10 = us0.b(null, 3);
                        Map<pb5<?, ?>, Float> map19 = kk5.a;
                        kt0VarB = lt0VarB10.b(new lt0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, at0.w, true), null, 11)));
                    } else {
                        kt0VarB = kt0Var2;
                    }
                    if (i6 != 0) {
                        qb5 qb5Var10 = us0.a;
                        Map<pb5<?, ?>, Float> map110 = kk5.a;
                        lv0VarB = new mv0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, et0.w, true), null, 11)).b(us0.c());
                    } else {
                        lv0VarB = lv0Var2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    int i111 = i3 << 3;
                    a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i3 & 14) | ((i3 >> 9) & 112), 0), F1.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 458752) | (i111 & 57344) | (i111 & 896) | 48 | (i111 & 7168));
                    pg2Var4 = pg2Var3;
                    kt0Var3 = kt0VarB;
                } else {
                    if (i11 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    daVar = One.QnHx.i;
                    if (i4 != 0) {
                        lt0 lt0VarB11 = us0.b(null, 3);
                        Map<pb5<?, ?>, Float> map111 = kk5.a;
                        kt0VarB = lt0VarB11.b(new lt0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, at0.w, true), null, 11)));
                    } else {
                        kt0VarB = kt0Var2;
                    }
                    if (i6 != 0) {
                        qb5 qb5Var11 = us0.a;
                        Map<pb5<?, ?>, Float> map112 = kk5.a;
                        lv0VarB = new mv0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, et0.w, true), null, 11)).b(us0.c());
                    } else {
                        lv0VarB = lv0Var2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    int i112 = i3 << 3;
                    a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i3 & 14) | ((i3 >> 9) & 112), 0), F1.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 458752) | (i112 & 57344) | (i112 & 896) | 48 | (i112 & 7168));
                    pg2Var4 = pg2Var3;
                    kt0Var3 = kt0VarB;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new LPt8Fixed(z, pg2Var4, kt0Var3, lv0VarB, str3, y81Var, i, i2);
            }
            i3 |= 3072;
            lv0Var2 = lv0Var;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 57344) == 0) {
                    str2 = str;
                    if (j30VarQ.I(str2)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else if ((i & 458752) == 0) {
                    if (j30VarQ.I(y81Var)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    daVar = One.QnHx.i;
                    if (i4 != 0) {
                        lt0 lt0VarB12 = us0.b(null, 3);
                        Map<pb5<?, ?>, Float> map113 = kk5.a;
                        kt0VarB = lt0VarB12.b(new lt0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, at0.w, true), null, 11)));
                    } else {
                        kt0VarB = kt0Var2;
                    }
                    if (i6 != 0) {
                        qb5 qb5Var12 = us0.a;
                        Map<pb5<?, ?>, Float> map114 = kk5.a;
                        lv0VarB = new mv0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, et0.w, true), null, 11)).b(us0.c());
                    } else {
                        lv0VarB = lv0Var2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    int i113 = i3 << 3;
                    a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i3 & 14) | ((i3 >> 9) & 112), 0), F1.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 458752) | (i113 & 57344) | (i113 & 896) | 48 | (i113 & 7168));
                    pg2Var4 = pg2Var3;
                    kt0Var3 = kt0VarB;
                } else {
                    if (i11 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    daVar = One.QnHx.i;
                    if (i4 != 0) {
                        lt0 lt0VarB13 = us0.b(null, 3);
                        Map<pb5<?, ?>, Float> map115 = kk5.a;
                        kt0VarB = lt0VarB13.b(new lt0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, at0.w, true), null, 11)));
                    } else {
                        kt0VarB = kt0Var2;
                    }
                    if (i6 != 0) {
                        qb5 qb5Var13 = us0.a;
                        Map<pb5<?, ?>, Float> map116 = kk5.a;
                        lv0VarB = new mv0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, et0.w, true), null, 11)).b(us0.c());
                    } else {
                        lv0VarB = lv0Var2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    int i114 = i3 << 3;
                    a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i3 & 14) | ((i3 >> 9) & 112), 0), F1.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 458752) | (i114 & 57344) | (i114 & 896) | 48 | (i114 & 7168));
                    pg2Var4 = pg2Var3;
                    kt0Var3 = kt0VarB;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new LPt8Fixed(z, pg2Var4, kt0Var3, lv0VarB, str3, y81Var, i, i2);
            }
            i3 |= 24576;
            str2 = str;
            if ((i2 & 32) != 0) {
                i3 |= 196608;
            } else if ((i & 458752) == 0) {
                if (j30VarQ.I(y81Var)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i3 |= i10;
            }
            if ((374491 & i3) == 74898) {
                if (i11 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                daVar = One.QnHx.i;
                if (i4 != 0) {
                    lt0 lt0VarB14 = us0.b(null, 3);
                    Map<pb5<?, ?>, Float> map117 = kk5.a;
                    kt0VarB = lt0VarB14.b(new lt0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, at0.w, true), null, 11)));
                } else {
                    kt0VarB = kt0Var2;
                }
                if (i6 != 0) {
                    qb5 qb5Var14 = us0.a;
                    Map<pb5<?, ?>, Float> map118 = kk5.a;
                    lv0VarB = new mv0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, et0.w, true), null, 11)).b(us0.c());
                } else {
                    lv0VarB = lv0Var2;
                }
                if (i8 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                int i115 = i3 << 3;
                a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i3 & 14) | ((i3 >> 9) & 112), 0), F1.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 458752) | (i115 & 57344) | (i115 & 896) | 48 | (i115 & 7168));
                pg2Var4 = pg2Var3;
                kt0Var3 = kt0VarB;
            } else {
                if (i11 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                daVar = One.QnHx.i;
                if (i4 != 0) {
                    lt0 lt0VarB15 = us0.b(null, 3);
                    Map<pb5<?, ?>, Float> map119 = kk5.a;
                    kt0VarB = lt0VarB15.b(new lt0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, at0.w, true), null, 11)));
                } else {
                    kt0VarB = kt0Var2;
                }
                if (i6 != 0) {
                    qb5 qb5Var15 = us0.a;
                    Map<pb5<?, ?>, Float> map1110 = kk5.a;
                    lv0VarB = new mv0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, et0.w, true), null, 11)).b(us0.c());
                } else {
                    lv0VarB = lv0Var2;
                }
                if (i8 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                int i116 = i3 << 3;
                a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i3 & 14) | ((i3 >> 9) & 112), 0), F1.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 458752) | (i116 & 57344) | (i116 & 896) | 48 | (i116 & 7168));
                pg2Var4 = pg2Var3;
                kt0Var3 = kt0VarB;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new LPt8Fixed(z, pg2Var4, kt0Var3, lv0VarB, str3, y81Var, i, i2);
        }
        i3 |= 48;
        pg2Var2 = pg2Var;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                kt0Var2 = kt0Var;
                if (j30VarQ.I(kt0Var2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 7168) == 0) {
                    lv0Var2 = lv0Var;
                    if (j30VarQ.I(lv0Var2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 57344) == 0) {
                        str2 = str;
                        if (j30VarQ.I(str2)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & 32) != 0) {
                        i3 |= 196608;
                    } else if ((i & 458752) == 0) {
                        if (j30VarQ.I(y81Var)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                    if ((374491 & i3) == 74898) {
                        if (i11 != 0) {
                            pg2Var3 = pg2.QnHx.w;
                        } else {
                            pg2Var3 = pg2Var2;
                        }
                        daVar = One.QnHx.i;
                        if (i4 != 0) {
                            lt0 lt0VarB16 = us0.b(null, 3);
                            Map<pb5<?, ?>, Float> map1111 = kk5.a;
                            kt0VarB = lt0VarB16.b(new lt0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, at0.w, true), null, 11)));
                        } else {
                            kt0VarB = kt0Var2;
                        }
                        if (i6 != 0) {
                            qb5 qb5Var16 = us0.a;
                            Map<pb5<?, ?>, Float> map1112 = kk5.a;
                            lv0VarB = new mv0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, et0.w, true), null, 11)).b(us0.c());
                        } else {
                            lv0VarB = lv0Var2;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        int i117 = i3 << 3;
                        a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i3 & 14) | ((i3 >> 9) & 112), 0), F1.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 458752) | (i117 & 57344) | (i117 & 896) | 48 | (i117 & 7168));
                        pg2Var4 = pg2Var3;
                        kt0Var3 = kt0VarB;
                    } else {
                        if (i11 != 0) {
                            pg2Var3 = pg2.QnHx.w;
                        } else {
                            pg2Var3 = pg2Var2;
                        }
                        daVar = One.QnHx.i;
                        if (i4 != 0) {
                            lt0 lt0VarB17 = us0.b(null, 3);
                            Map<pb5<?, ?>, Float> map1113 = kk5.a;
                            kt0VarB = lt0VarB17.b(new lt0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, at0.w, true), null, 11)));
                        } else {
                            kt0VarB = kt0Var2;
                        }
                        if (i6 != 0) {
                            qb5 qb5Var17 = us0.a;
                            Map<pb5<?, ?>, Float> map1114 = kk5.a;
                            lv0VarB = new mv0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, et0.w, true), null, 11)).b(us0.c());
                        } else {
                            lv0VarB = lv0Var2;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        int i118 = i3 << 3;
                        a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i3 & 14) | ((i3 >> 9) & 112), 0), F1.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 458752) | (i118 & 57344) | (i118 & 896) | 48 | (i118 & 7168));
                        pg2Var4 = pg2Var3;
                        kt0Var3 = kt0VarB;
                    }
                    tk3VarU = j30VarQ.U();
                    if (tk3VarU == null) {
                        return;
                    }
                    tk3VarU.d = new LPt8Fixed(z, pg2Var4, kt0Var3, lv0VarB, str3, y81Var, i, i2);
                }
                i3 |= 24576;
                str2 = str;
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else if ((i & 458752) == 0) {
                    if (j30VarQ.I(y81Var)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    daVar = One.QnHx.i;
                    if (i4 != 0) {
                        lt0 lt0VarB18 = us0.b(null, 3);
                        Map<pb5<?, ?>, Float> map1115 = kk5.a;
                        kt0VarB = lt0VarB18.b(new lt0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, at0.w, true), null, 11)));
                    } else {
                        kt0VarB = kt0Var2;
                    }
                    if (i6 != 0) {
                        qb5 qb5Var18 = us0.a;
                        Map<pb5<?, ?>, Float> map1116 = kk5.a;
                        lv0VarB = new mv0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, et0.w, true), null, 11)).b(us0.c());
                    } else {
                        lv0VarB = lv0Var2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    int i119 = i3 << 3;
                    a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i3 & 14) | ((i3 >> 9) & 112), 0), F1.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 458752) | (i119 & 57344) | (i119 & 896) | 48 | (i119 & 7168));
                    pg2Var4 = pg2Var3;
                    kt0Var3 = kt0VarB;
                } else {
                    if (i11 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    daVar = One.QnHx.i;
                    if (i4 != 0) {
                        lt0 lt0VarB19 = us0.b(null, 3);
                        Map<pb5<?, ?>, Float> map1117 = kk5.a;
                        kt0VarB = lt0VarB19.b(new lt0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, at0.w, true), null, 11)));
                    } else {
                        kt0VarB = kt0Var2;
                    }
                    if (i6 != 0) {
                        qb5 qb5Var19 = us0.a;
                        Map<pb5<?, ?>, Float> map1118 = kk5.a;
                        lv0VarB = new mv0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, et0.w, true), null, 11)).b(us0.c());
                    } else {
                        lv0VarB = lv0Var2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    int i1110 = i3 << 3;
                    a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i3 & 14) | ((i3 >> 9) & 112), 0), F1.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 458752) | (i1110 & 57344) | (i1110 & 896) | 48 | (i1110 & 7168));
                    pg2Var4 = pg2Var3;
                    kt0Var3 = kt0VarB;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new LPt8Fixed(z, pg2Var4, kt0Var3, lv0VarB, str3, y81Var, i, i2);
            }
            i3 |= 3072;
            lv0Var2 = lv0Var;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 57344) == 0) {
                    str2 = str;
                    if (j30VarQ.I(str2)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else if ((i & 458752) == 0) {
                    if (j30VarQ.I(y81Var)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    daVar = One.QnHx.i;
                    if (i4 != 0) {
                        lt0 lt0VarB110 = us0.b(null, 3);
                        Map<pb5<?, ?>, Float> map1119 = kk5.a;
                        kt0VarB = lt0VarB110.b(new lt0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, at0.w, true), null, 11)));
                    } else {
                        kt0VarB = kt0Var2;
                    }
                    if (i6 != 0) {
                        qb5 qb5Var110 = us0.a;
                        Map<pb5<?, ?>, Float> map11110 = kk5.a;
                        lv0VarB = new mv0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, et0.w, true), null, 11)).b(us0.c());
                    } else {
                        lv0VarB = lv0Var2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    int i1111 = i3 << 3;
                    a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i3 & 14) | ((i3 >> 9) & 112), 0), F1.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 458752) | (i1111 & 57344) | (i1111 & 896) | 48 | (i1111 & 7168));
                    pg2Var4 = pg2Var3;
                    kt0Var3 = kt0VarB;
                } else {
                    if (i11 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    daVar = One.QnHx.i;
                    if (i4 != 0) {
                        lt0 lt0VarB111 = us0.b(null, 3);
                        Map<pb5<?, ?>, Float> map11111 = kk5.a;
                        kt0VarB = lt0VarB111.b(new lt0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, at0.w, true), null, 11)));
                    } else {
                        kt0VarB = kt0Var2;
                    }
                    if (i6 != 0) {
                        qb5 qb5Var111 = us0.a;
                        Map<pb5<?, ?>, Float> map11112 = kk5.a;
                        lv0VarB = new mv0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, et0.w, true), null, 11)).b(us0.c());
                    } else {
                        lv0VarB = lv0Var2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    int i1112 = i3 << 3;
                    a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i3 & 14) | ((i3 >> 9) & 112), 0), F1.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 458752) | (i1112 & 57344) | (i1112 & 896) | 48 | (i1112 & 7168));
                    pg2Var4 = pg2Var3;
                    kt0Var3 = kt0VarB;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new LPt8Fixed(z, pg2Var4, kt0Var3, lv0VarB, str3, y81Var, i, i2);
            }
            i3 |= 24576;
            str2 = str;
            if ((i2 & 32) != 0) {
                i3 |= 196608;
            } else if ((i & 458752) == 0) {
                if (j30VarQ.I(y81Var)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i3 |= i10;
            }
            if ((374491 & i3) == 74898) {
                if (i11 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                daVar = One.QnHx.i;
                if (i4 != 0) {
                    lt0 lt0VarB112 = us0.b(null, 3);
                    Map<pb5<?, ?>, Float> map11113 = kk5.a;
                    kt0VarB = lt0VarB112.b(new lt0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, at0.w, true), null, 11)));
                } else {
                    kt0VarB = kt0Var2;
                }
                if (i6 != 0) {
                    qb5 qb5Var112 = us0.a;
                    Map<pb5<?, ?>, Float> map11114 = kk5.a;
                    lv0VarB = new mv0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, et0.w, true), null, 11)).b(us0.c());
                } else {
                    lv0VarB = lv0Var2;
                }
                if (i8 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                int i1113 = i3 << 3;
                a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i3 & 14) | ((i3 >> 9) & 112), 0), F1.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 458752) | (i1113 & 57344) | (i1113 & 896) | 48 | (i1113 & 7168));
                pg2Var4 = pg2Var3;
                kt0Var3 = kt0VarB;
            } else {
                if (i11 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                daVar = One.QnHx.i;
                if (i4 != 0) {
                    lt0 lt0VarB113 = us0.b(null, 3);
                    Map<pb5<?, ?>, Float> map11115 = kk5.a;
                    kt0VarB = lt0VarB113.b(new lt0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, at0.w, true), null, 11)));
                } else {
                    kt0VarB = kt0Var2;
                }
                if (i6 != 0) {
                    qb5 qb5Var113 = us0.a;
                    Map<pb5<?, ?>, Float> map11116 = kk5.a;
                    lv0VarB = new mv0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, et0.w, true), null, 11)).b(us0.c());
                } else {
                    lv0VarB = lv0Var2;
                }
                if (i8 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                int i1114 = i3 << 3;
                a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i3 & 14) | ((i3 >> 9) & 112), 0), F1.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 458752) | (i1114 & 57344) | (i1114 & 896) | 48 | (i1114 & 7168));
                pg2Var4 = pg2Var3;
                kt0Var3 = kt0VarB;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new LPt8Fixed(z, pg2Var4, kt0Var3, lv0VarB, str3, y81Var, i, i2);
        }
        i3 |= 384;
        kt0Var2 = kt0Var;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 7168) == 0) {
                lv0Var2 = lv0Var;
                if (j30VarQ.I(lv0Var2)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 57344) == 0) {
                    str2 = str;
                    if (j30VarQ.I(str2)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else if ((i & 458752) == 0) {
                    if (j30VarQ.I(y81Var)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    daVar = One.QnHx.i;
                    if (i4 != 0) {
                        lt0 lt0VarB114 = us0.b(null, 3);
                        Map<pb5<?, ?>, Float> map11117 = kk5.a;
                        kt0VarB = lt0VarB114.b(new lt0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, at0.w, true), null, 11)));
                    } else {
                        kt0VarB = kt0Var2;
                    }
                    if (i6 != 0) {
                        qb5 qb5Var114 = us0.a;
                        Map<pb5<?, ?>, Float> map11118 = kk5.a;
                        lv0VarB = new mv0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, et0.w, true), null, 11)).b(us0.c());
                    } else {
                        lv0VarB = lv0Var2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    int i1115 = i3 << 3;
                    a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i3 & 14) | ((i3 >> 9) & 112), 0), F1.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 458752) | (i1115 & 57344) | (i1115 & 896) | 48 | (i1115 & 7168));
                    pg2Var4 = pg2Var3;
                    kt0Var3 = kt0VarB;
                } else {
                    if (i11 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    daVar = One.QnHx.i;
                    if (i4 != 0) {
                        lt0 lt0VarB115 = us0.b(null, 3);
                        Map<pb5<?, ?>, Float> map11119 = kk5.a;
                        kt0VarB = lt0VarB115.b(new lt0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, at0.w, true), null, 11)));
                    } else {
                        kt0VarB = kt0Var2;
                    }
                    if (i6 != 0) {
                        qb5 qb5Var115 = us0.a;
                        Map<pb5<?, ?>, Float> map111110 = kk5.a;
                        lv0VarB = new mv0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, et0.w, true), null, 11)).b(us0.c());
                    } else {
                        lv0VarB = lv0Var2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    int i1116 = i3 << 3;
                    a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i3 & 14) | ((i3 >> 9) & 112), 0), F1.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 458752) | (i1116 & 57344) | (i1116 & 896) | 48 | (i1116 & 7168));
                    pg2Var4 = pg2Var3;
                    kt0Var3 = kt0VarB;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new LPt8Fixed(z, pg2Var4, kt0Var3, lv0VarB, str3, y81Var, i, i2);
            }
            i3 |= 24576;
            str2 = str;
            if ((i2 & 32) != 0) {
                i3 |= 196608;
            } else if ((i & 458752) == 0) {
                if (j30VarQ.I(y81Var)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i3 |= i10;
            }
            if ((374491 & i3) == 74898) {
                if (i11 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                daVar = One.QnHx.i;
                if (i4 != 0) {
                    lt0 lt0VarB116 = us0.b(null, 3);
                    Map<pb5<?, ?>, Float> map111111 = kk5.a;
                    kt0VarB = lt0VarB116.b(new lt0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, at0.w, true), null, 11)));
                } else {
                    kt0VarB = kt0Var2;
                }
                if (i6 != 0) {
                    qb5 qb5Var116 = us0.a;
                    Map<pb5<?, ?>, Float> map111112 = kk5.a;
                    lv0VarB = new mv0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, et0.w, true), null, 11)).b(us0.c());
                } else {
                    lv0VarB = lv0Var2;
                }
                if (i8 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                int i1117 = i3 << 3;
                a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i3 & 14) | ((i3 >> 9) & 112), 0), F1.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 458752) | (i1117 & 57344) | (i1117 & 896) | 48 | (i1117 & 7168));
                pg2Var4 = pg2Var3;
                kt0Var3 = kt0VarB;
            } else {
                if (i11 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                daVar = One.QnHx.i;
                if (i4 != 0) {
                    lt0 lt0VarB117 = us0.b(null, 3);
                    Map<pb5<?, ?>, Float> map111113 = kk5.a;
                    kt0VarB = lt0VarB117.b(new lt0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, at0.w, true), null, 11)));
                } else {
                    kt0VarB = kt0Var2;
                }
                if (i6 != 0) {
                    qb5 qb5Var117 = us0.a;
                    Map<pb5<?, ?>, Float> map111114 = kk5.a;
                    lv0VarB = new mv0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, et0.w, true), null, 11)).b(us0.c());
                } else {
                    lv0VarB = lv0Var2;
                }
                if (i8 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                int i1118 = i3 << 3;
                a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i3 & 14) | ((i3 >> 9) & 112), 0), F1.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 458752) | (i1118 & 57344) | (i1118 & 896) | 48 | (i1118 & 7168));
                pg2Var4 = pg2Var3;
                kt0Var3 = kt0VarB;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new LPt8Fixed(z, pg2Var4, kt0Var3, lv0VarB, str3, y81Var, i, i2);
        }
        i3 |= 3072;
        lv0Var2 = lv0Var;
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((i & 57344) == 0) {
                str2 = str;
                if (j30VarQ.I(str2)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
            }
            if ((i2 & 32) != 0) {
                i3 |= 196608;
            } else if ((i & 458752) == 0) {
                if (j30VarQ.I(y81Var)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i3 |= i10;
            }
            if ((374491 & i3) == 74898) {
                if (i11 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                daVar = One.QnHx.i;
                if (i4 != 0) {
                    lt0 lt0VarB118 = us0.b(null, 3);
                    Map<pb5<?, ?>, Float> map111115 = kk5.a;
                    kt0VarB = lt0VarB118.b(new lt0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, at0.w, true), null, 11)));
                } else {
                    kt0VarB = kt0Var2;
                }
                if (i6 != 0) {
                    qb5 qb5Var118 = us0.a;
                    Map<pb5<?, ?>, Float> map111116 = kk5.a;
                    lv0VarB = new mv0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, et0.w, true), null, 11)).b(us0.c());
                } else {
                    lv0VarB = lv0Var2;
                }
                if (i8 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                int i1119 = i3 << 3;
                a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i3 & 14) | ((i3 >> 9) & 112), 0), F1.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 458752) | (i1119 & 57344) | (i1119 & 896) | 48 | (i1119 & 7168));
                pg2Var4 = pg2Var3;
                kt0Var3 = kt0VarB;
            } else {
                if (i11 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                daVar = One.QnHx.i;
                if (i4 != 0) {
                    lt0 lt0VarB119 = us0.b(null, 3);
                    Map<pb5<?, ?>, Float> map111117 = kk5.a;
                    kt0VarB = lt0VarB119.b(new lt0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, at0.w, true), null, 11)));
                } else {
                    kt0VarB = kt0Var2;
                }
                if (i6 != 0) {
                    qb5 qb5Var119 = us0.a;
                    Map<pb5<?, ?>, Float> map111118 = kk5.a;
                    lv0VarB = new mv0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, et0.w, true), null, 11)).b(us0.c());
                } else {
                    lv0VarB = lv0Var2;
                }
                if (i8 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                int i11110 = i3 << 3;
                a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i3 & 14) | ((i3 >> 9) & 112), 0), F1.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 458752) | (i11110 & 57344) | (i11110 & 896) | 48 | (i11110 & 7168));
                pg2Var4 = pg2Var3;
                kt0Var3 = kt0VarB;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new LPt8Fixed(z, pg2Var4, kt0Var3, lv0VarB, str3, y81Var, i, i2);
        }
        i3 |= 24576;
        str2 = str;
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 458752) == 0) {
            if (j30VarQ.I(y81Var)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i3 |= i10;
        }
        if ((374491 & i3) == 74898) {
            if (i11 != 0) {
                pg2Var3 = pg2.QnHx.w;
            } else {
                pg2Var3 = pg2Var2;
            }
            daVar = One.QnHx.i;
            if (i4 != 0) {
                lt0 lt0VarB1110 = us0.b(null, 3);
                Map<pb5<?, ?>, Float> map111119 = kk5.a;
                kt0VarB = lt0VarB1110.b(new lt0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, at0.w, true), null, 11)));
            } else {
                kt0VarB = kt0Var2;
            }
            if (i6 != 0) {
                qb5 qb5Var1110 = us0.a;
                Map<pb5<?, ?>, Float> map1111110 = kk5.a;
                lv0VarB = new mv0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, et0.w, true), null, 11)).b(us0.c());
            } else {
                lv0VarB = lv0Var2;
            }
            if (i8 != 0) {
                str3 = "AnimatedVisibility";
            } else {
                str3 = str;
            }
            int i11111 = i3 << 3;
            a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i3 & 14) | ((i3 >> 9) & 112), 0), F1.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 458752) | (i11111 & 57344) | (i11111 & 896) | 48 | (i11111 & 7168));
            pg2Var4 = pg2Var3;
            kt0Var3 = kt0VarB;
        } else {
            if (i11 != 0) {
                pg2Var3 = pg2.QnHx.w;
            } else {
                pg2Var3 = pg2Var2;
            }
            daVar = One.QnHx.i;
            if (i4 != 0) {
                lt0 lt0VarB1111 = us0.b(null, 3);
                Map<pb5<?, ?>, Float> map1111111 = kk5.a;
                kt0VarB = lt0VarB1111.b(new lt0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, at0.w, true), null, 11)));
            } else {
                kt0VarB = kt0Var2;
            }
            if (i6 != 0) {
                qb5 qb5Var1111 = us0.a;
                Map<pb5<?, ?>, Float> map1111112 = kk5.a;
                lv0VarB = new mv0(new v95(null, null, new io(hH.w(400.0f, new sp1(C0239D.e(1, 1)), 1), daVar, et0.w, true), null, 11)).b(us0.c());
            } else {
                lv0VarB = lv0Var2;
            }
            if (i8 != 0) {
                str3 = "AnimatedVisibility";
            } else {
                str3 = str;
            }
            int i11112 = i3 << 3;
            a(da5.c(Boolean.valueOf(z), str3, j30VarQ, (i3 & 14) | ((i3 >> 9) & 112), 0), F1.w, pg2Var3, kt0VarB, lv0VarB, y81Var, j30VarQ, (i3 & 458752) | (i11112 & 57344) | (i11112 & 896) | 48 | (i11112 & 7168));
            pg2Var4 = pg2Var3;
            kt0Var3 = kt0VarB;
        }
        tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new LPt8Fixed(z, pg2Var4, kt0Var3, lv0VarB, str3, y81Var, i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0073  */
    /* JADX WARN: Code duplicated, block: B:22:0x0082  */
    public static final ts0 d(t95 t95Var, j81 j81Var, Object obj, g30 g30Var) {
        g30Var.e(361571134);
        g30Var.r(-721837481, t95Var);
        boolean zE = t95Var.e();
        ts0 ts0Var = ts0.PostExit;
        ts0 ts0Var2 = ts0.PreEnter;
        ts0 ts0Var3 = ts0.Visible;
        if (!zE) {
            g30Var.e(-492369756);
            Object objF = g30Var.f();
            if (objF == g30.QnHx.a) {
                objF = ps0.R(Boolean.FALSE);
                g30Var.B(objF);
            }
            g30Var.G();
            ri2 ri2Var = (ri2) objF;
            if (((Boolean) j81Var.invoke(t95Var.b())).booleanValue()) {
                ri2Var.setValue(Boolean.TRUE);
            }
            if (((Boolean) j81Var.invoke(obj)).booleanValue()) {
                ts0Var = ts0Var3;
            } else if (!((Boolean) ri2Var.getValue()).booleanValue()) {
                ts0Var = ts0Var2;
            }
        } else if (((Boolean) j81Var.invoke(obj)).booleanValue()) {
            ts0Var = ts0Var3;
        } else if (!((Boolean) j81Var.invoke(t95Var.b())).booleanValue()) {
            ts0Var = ts0Var2;
        }
        g30Var.F();
        g30Var.G();
        return ts0Var;
    }
}
