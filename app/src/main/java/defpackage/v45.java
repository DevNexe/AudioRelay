package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class v45 {
    public static final v45 a = new v45();

    public static final class CQf extends cx1 implements y81<t95.CQf<oo1>, g30, Integer, lx0<yu>> {
        public static final CQf w = new CQf();

        public CQf() {
            super(3);
        }

        @Override // defpackage.y81
        public final lx0<yu> invoke(t95.CQf<oo1> cQf, g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            num.intValue();
            g30Var2.e(-32667848);
            nb5 nb5VarE = hH.E(150, 0, null, 6);
            g30Var2.G();
            return nb5VarE;
        }
    }

    public static final class F1 extends cx1 implements y81<t95.CQf<oo1>, g30, Integer, lx0<Float>> {
        public static final F1 w = new F1();

        public F1() {
            super(3);
        }

        @Override // defpackage.y81
        public final lx0<Float> invoke(t95.CQf<oo1> cQf, g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            num.intValue();
            g30Var2.e(-611722692);
            nb5 nb5VarE = hH.E(150, 0, null, 6);
            g30Var2.G();
            return nb5VarE;
        }
    }

    public static final class LPt8Fixed extends cx1 implements y81<t95.CQf<oo1>, g30, Integer, lx0<yu>> {
        public static final LPt8Fixed w = new LPt8Fixed();

        public LPt8Fixed() {
            super(3);
        }

        @Override // defpackage.y81
        public final lx0<yu> invoke(t95.CQf<oo1> cQf, g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            num.intValue();
            g30Var2.e(-130058045);
            nb5 nb5VarE = hH.E(150, 0, null, 6);
            g30Var2.G();
            return nb5VarE;
        }
    }

    public static final class NUlFixed extends cx1 implements y81<t95.CQf<oo1>, g30, Integer, lx0<Float>> {
        public static final NUlFixed w = new NUlFixed();

        public NUlFixed() {
            super(3);
        }

        @Override // defpackage.y81
        public final lx0<Float> invoke(t95.CQf<oo1> cQf, g30 g30Var, Integer num) {
            lx0<Float> nb5Var;
            t95.CQf<oo1> cQf2 = cQf;
            g30 g30Var2 = g30Var;
            num.intValue();
            g30Var2.e(-1079955085);
            oo1 oo1Var = oo1.Focused;
            oo1 oo1Var2 = oo1.UnfocusedEmpty;
            boolean zB = cQf2.b(oo1Var, oo1Var2);
            nq0.QnHx qnHx = nq0.QnHx.a;
            if (zB) {
                nb5Var = hH.E(67, 0, qnHx, 2);
            } else {
                nb5Var = (cQf2.b(oo1Var2, oo1Var) || cQf2.b(oo1.UnfocusedNotEmpty, oo1Var2)) ? new nb5<>(83, 67, qnHx) : hH.w(0.0f, null, 7);
            }
            g30Var2.G();
            return nb5Var;
        }
    }

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ y81<oo1, g30, Integer, yu> A;
        public final /* synthetic */ boolean B;
        public final /* synthetic */ e91<Float, yu, yu, Float, g30, Integer, sd5> C;
        public final /* synthetic */ int D;
        public final /* synthetic */ oo1 x;
        public final /* synthetic */ long y;
        public final /* synthetic */ long z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(oo1 oo1Var, long j, long j2, y81<? super oo1, ? super g30, ? super Integer, yu> y81Var, boolean z, e91<? super Float, ? super yu, ? super yu, ? super Float, ? super g30, ? super Integer, sd5> e91Var, int i) {
            super(2);
            this.x = oo1Var;
            this.y = j;
            this.z = j2;
            this.A = y81Var;
            this.B = z;
            this.C = e91Var;
            this.D = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            v45.this.a(this.x, this.y, this.z, this.A, this.B, this.C, g30Var, this.D | 1);
            return sd5.a;
        }
    }

    public /* synthetic */ class YKK {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[oo1.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
            a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:81:0x015e  */
    public final void a(oo1 oo1Var, long j, long j2, y81<? super oo1, ? super g30, ? super Integer, yu> y81Var, boolean z, e91<? super Float, ? super yu, ? super yu, ? super Float, ? super g30, ? super Integer, sd5> e91Var, g30 g30Var, int i) {
        int i2;
        long j3;
        float f;
        float f2;
        float f3;
        j30 j30VarQ = g30Var.q(1988729962);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(oo1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            j3 = j;
            i2 |= j30VarQ.j(j3) ? 32 : 16;
        } else {
            j3 = j;
        }
        if ((i & 896) == 0) {
            i2 |= j30VarQ.j(j2) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= j30VarQ.I(y81Var) ? 2048 : 1024;
        }
        if ((i & 57344) == 0) {
            i2 |= j30VarQ.c(z) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= j30VarQ.I(e91Var) ? 131072 : 65536;
        }
        if ((374491 & i2) == 74898 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            t95 t95VarC = da5.c(oo1Var, "TextFieldInputState", j30VarQ, (i2 & 14) | 48, 0);
            F1 f1 = F1.w;
            j30VarQ.e(1399891485);
            qb5 qb5Var = mg5.a;
            j30VarQ.e(1847725064);
            oo1 oo1Var2 = (oo1) t95VarC.b();
            j30VarQ.e(-1158004136);
            int iOrdinal = oo1Var2.ordinal();
            float f4 = 1.0f;
            if (iOrdinal == 0) {
                f = 1.0f;
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            j30VarQ.R(false);
            Float fValueOf = Float.valueOf(f);
            oo1 oo1Var3 = (oo1) t95VarC.d();
            j30VarQ.e(-1158004136);
            int iOrdinal2 = oo1Var3.ordinal();
            if (iOrdinal2 == 0) {
                f2 = 1.0f;
            } else if (iOrdinal2 != 1) {
                if (iOrdinal2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            j30VarQ.R(false);
            t95.LPt8Fixed lPt8B = da5.b(t95VarC, fValueOf, Float.valueOf(f2), f1.invoke(t95VarC.c(), j30VarQ, 0), qb5Var, "LabelProgress", j30VarQ);
            j30VarQ.R(false);
            j30VarQ.R(false);
            NUlFixed nUl = NUlFixed.w;
            j30VarQ.e(1399891485);
            j30VarQ.e(1847725064);
            oo1 oo1Var4 = (oo1) t95VarC.b();
            j30VarQ.e(-1376159017);
            int iOrdinal3 = oo1Var4.ordinal();
            if (iOrdinal3 == 0) {
                f3 = 1.0f;
            } else {
                if (iOrdinal3 != 1) {
                    if (iOrdinal3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (!z) {
                    f3 = 1.0f;
                }
                f3 = 0.0f;
            }
            j30VarQ.R(false);
            Float fValueOf2 = Float.valueOf(f3);
            oo1 oo1Var5 = (oo1) t95VarC.d();
            j30VarQ.e(-1376159017);
            int iOrdinal4 = oo1Var5.ordinal();
            if (iOrdinal4 != 0) {
                if (iOrdinal4 != 1) {
                    if (iOrdinal4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (z) {
                }
                f4 = 0.0f;
            }
            j30VarQ.R(false);
            t95.LPt8Fixed lPt8B2 = da5.b(t95VarC, fValueOf2, Float.valueOf(f4), nUl.invoke(t95VarC.c(), j30VarQ, 0), qb5Var, "PlaceholderOpacity", j30VarQ);
            j30VarQ.R(false);
            j30VarQ.R(false);
            LPt8Fixed lPt8 = LPt8Fixed.w;
            j30VarQ.e(-1462136984);
            oo1 oo1Var6 = (oo1) t95VarC.d();
            j30VarQ.e(-1490209928);
            int[] iArr = YKK.a;
            long j4 = iArr[oo1Var6.ordinal()] == 1 ? j3 : j2;
            j30VarQ.R(false);
            fv fvVarF = yu.f(j4);
            j30VarQ.e(-3686930);
            boolean zI = j30VarQ.I(fvVarF);
            Object objB0 = j30VarQ.b0();
            g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
            if (zI || objB0 == c0132QnHx) {
                objB0 = (pb5) qv.a.invoke(fvVarF);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            pb5 pb5Var = (pb5) objB0;
            j30VarQ.e(1847725064);
            oo1 oo1Var7 = (oo1) t95VarC.b();
            j30VarQ.e(-1490209928);
            long j5 = iArr[oo1Var7.ordinal()] == 1 ? j3 : j2;
            j30VarQ.R(false);
            yu yuVar = new yu(j5);
            oo1 oo1Var8 = (oo1) t95VarC.d();
            j30VarQ.e(-1490209928);
            long j6 = iArr[oo1Var8.ordinal()] == 1 ? j3 : j2;
            j30VarQ.R(false);
            t95.LPt8Fixed lPt8B3 = da5.b(t95VarC, yuVar, new yu(j6), lPt8.invoke(t95VarC.c(), j30VarQ, 0), pb5Var, "LabelTextStyleColor", j30VarQ);
            j30VarQ.R(false);
            j30VarQ.R(false);
            CQf cQf = CQf.w;
            int i3 = (i2 & 7168) | 384;
            j30VarQ.e(-1462136984);
            fv fvVarF2 = yu.f(y81Var.invoke(t95VarC.d(), j30VarQ, Integer.valueOf((i3 >> 6) & 112)).a);
            j30VarQ.e(-3686930);
            boolean zI2 = j30VarQ.I(fvVarF2);
            Object objB1 = j30VarQ.b0();
            if (zI2 || objB1 == c0132QnHx) {
                objB1 = (pb5) qv.a.invoke(fvVarF2);
                j30VarQ.F0(objB1);
            }
            j30VarQ.R(false);
            int i4 = i3 << 3;
            int i5 = (i3 & 14) | 64 | (i4 & 896) | (i4 & 7168) | (i4 & 57344);
            j30VarQ.e(1847725064);
            int i6 = (i5 >> 9) & 112;
            t95.LPt8Fixed lPt8B4 = da5.b(t95VarC, y81Var.invoke(t95VarC.b(), j30VarQ, Integer.valueOf(i6)), y81Var.invoke(t95VarC.d(), j30VarQ, Integer.valueOf(i6)), cQf.invoke(t95VarC.c(), j30VarQ, Integer.valueOf((i5 >> 3) & 112)), (pb5) objB1, "LabelContentColor", j30VarQ);
            j30VarQ.R(false);
            j30VarQ.R(false);
            e91Var.Z(Float.valueOf(((Number) lPt8B.getValue()).floatValue()), new yu(((yu) lPt8B3.getValue()).a), new yu(((yu) lPt8B4.getValue()).a), Float.valueOf(((Number) lPt8B2.getValue()).floatValue()), j30VarQ, Integer.valueOf((i2 >> 3) & 57344));
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new QnHx(oo1Var, j, j2, y81Var, z, e91Var, i);
    }
}
