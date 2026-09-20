package defpackage;

import android.graphics.Canvas;

/* JADX INFO: loaded from: classes.dex */
public final class ukJW {

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ long w;
        public final /* synthetic */ gb1 x;
        public final /* synthetic */ x81<g30, Integer, sd5> y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CQf(long j, gb1 gb1Var, x81<? super g30, ? super Integer, sd5> x81Var, int i) {
            super(2);
            this.w = j;
            this.x = gb1Var;
            this.y = x81Var;
            this.z = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            ukJW.b(this.w, this.x, this.y, g30Var, this.z | 1);
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int A;
        public final /* synthetic */ np3 B;
        public final /* synthetic */ boolean C;
        public final /* synthetic */ x81<g30, Integer, sd5> w;
        public final /* synthetic */ pg2 x;
        public final /* synthetic */ boolean y;
        public final /* synthetic */ long z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(int i, long j, pg2 pg2Var, np3 np3Var, x81 x81Var, boolean z, boolean z2) {
            super(2);
            this.w = x81Var;
            this.x = pg2Var;
            this.y = z;
            this.z = j;
            this.A = i;
            this.B = np3Var;
            this.C = z2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                int i = this.A;
                x81<g30, Integer, sd5> x81Var = this.w;
                if (x81Var == null) {
                    g30Var2.e(386443790);
                    boolean z = this.y;
                    Boolean boolValueOf = Boolean.valueOf(z);
                    long j = this.z;
                    kt2 kt2Var = new kt2(j);
                    g30Var2.e(511388516);
                    boolean zI = g30Var2.I(boolValueOf) | g30Var2.I(kt2Var);
                    Object objF = g30Var2.f();
                    if (zI || objF == g30.QnHx.a) {
                        objF = new M5(j, z);
                        g30Var2.B(objF);
                    }
                    g30Var2.G();
                    ukJW.a(c94.a(this.x, false, (j81) objF), this.y, this.B, this.C, g30Var2, (i & 112) | (i & 896) | (i & 7168));
                    g30Var2.G();
                } else {
                    g30Var2.e(386444465);
                    x81Var.invoke(g30Var2, Integer.valueOf((i >> 15) & 14));
                    g30Var2.G();
                }
            }
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ pg2 A;
        public final /* synthetic */ x81<g30, Integer, sd5> B;
        public final /* synthetic */ int C;
        public final /* synthetic */ long w;
        public final /* synthetic */ boolean x;
        public final /* synthetic */ np3 y;
        public final /* synthetic */ boolean z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LPt8Fixed(int i, long j, pg2 pg2Var, np3 np3Var, x81 x81Var, boolean z, boolean z2) {
            super(2);
            this.w = j;
            this.x = z;
            this.y = np3Var;
            this.z = z2;
            this.A = pg2Var;
            this.B = x81Var;
            this.C = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            ukJW.c(this.w, this.x, this.y, this.z, this.A, this.B, g30Var, this.C | 1);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int A;
        public final /* synthetic */ pg2 w;
        public final /* synthetic */ boolean x;
        public final /* synthetic */ np3 y;
        public final /* synthetic */ boolean z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(pg2 pg2Var, boolean z, np3 np3Var, boolean z2, int i) {
            super(2);
            this.w = pg2Var;
            this.x = z;
            this.y = np3Var;
            this.z = z2;
            this.A = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            ukJW.a(this.w, this.x, this.y, this.z, g30Var, this.A | 1);
            return sd5.a;
        }
    }

    public static final void a(pg2 pg2Var, boolean z, np3 np3Var, boolean z2, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(47957398);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(pg2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.c(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= j30VarQ.I(np3Var) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= j30VarQ.c(z2) ? 2048 : 1024;
        }
        if ((i2 & 5851) == 1170 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            hH.i(f30.a(gm4.i(pg2Var, v74.a, v74.b), wo1.a, new xf7D(z, np3Var, z2)), j30VarQ, 0);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new QnHx(pg2Var, z, np3Var, z2, i);
    }

    public static final void b(long j, gb1 gb1Var, x81<? super g30, ? super Integer, sd5> x81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(-1409050158);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.j(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(gb1Var) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= j30VarQ.I(x81Var) ? 256 : 128;
        }
        if ((i2 & 731) == 146 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            long jD = C0239D.d(sy4.c(kt2.c(j)), sy4.c(kt2.d(j)));
            mp1 mp1Var = new mp1(jD);
            j30VarQ.e(511388516);
            boolean zI = j30VarQ.I(mp1Var) | j30VarQ.I(gb1Var);
            Object objB0 = j30VarQ.b0();
            if (zI || objB0 == g30.QnHx.a) {
                objB0 = new fb1(gb1Var, jD);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            thju.a((fb1) objB0, null, new ha3(true, 15), x81Var, j30VarQ, (i2 << 3) & 7168, 2);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(j, gb1Var, x81Var, i);
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00af  */
    public static final void c(long j, boolean z, np3 np3Var, boolean z2, pg2 pg2Var, x81<? super g30, ? super Integer, sd5> x81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(-616295642);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.j(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.c(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= j30VarQ.I(np3Var) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= j30VarQ.c(z2) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= j30VarQ.I(pg2Var) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= j30VarQ.I(x81Var) ? 131072 : 65536;
        }
        int i3 = i2;
        if ((i3 & 374491) == 74898 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            np3 np3Var2 = np3.Rtl;
            np3 np3Var3 = np3.Ltr;
            boolean z3 = false;
            if (!z) {
                if (!((np3Var == np3Var3 && !z2) || (np3Var == np3Var2 && z2))) {
                    z3 = true;
                }
            } else if ((np3Var == np3Var3 && !z2) || (np3Var == np3Var2 && z2)) {
                z3 = true;
            }
            b(j, z3 ? gb1.TopRight : gb1.TopLeft, X.m(j30VarQ, 732099485, new F1(i3, j, pg2Var, np3Var, x81Var, z, z2)), j30VarQ, (i3 & 14) | 384);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new LPt8Fixed(i, j, pg2Var, np3Var, x81Var, z, z2);
    }

    public static final bj1 d(uk ukVar, float f) {
        dn dnVar;
        int iCeil = ((int) Math.ceil(f)) * 2;
        bj1 bj1VarC = AY.x;
        dn dnVar2 = AY.y;
        en enVar = AY.z;
        if (bj1VarC == null || dnVar2 == null || iCeil > bj1VarC.getWidth() || iCeil > bj1VarC.getHeight()) {
            dnVar = dnVar2;
            bj1VarC = ps0.c(iCeil, iCeil, 1, 24);
            AY.x = bj1VarC;
            Canvas canvas = F6mt.a;
            ZCR zcr = new ZCR();
            zcr.a = new Canvas(fp1.C(bj1VarC));
            AY.y = zcr;
            dnVar = zcr;
        }
        dnVar = dnVar2;
        bj1 bj1Var = bj1VarC;
        dn dnVar3 = dnVar;
        if (enVar == null) {
            enVar = new en();
            AY.z = enVar;
        }
        en enVar2 = enVar;
        jy1 layoutDirection = ukVar.w.getLayoutDirection();
        long jE = ps0.e(bj1Var.getWidth(), bj1Var.getHeight());
        en.QnHx qnHx = enVar2.w;
        ij0 ij0Var = qnHx.a;
        jy1 jy1Var = qnHx.b;
        dn dnVar4 = qnHx.c;
        long j = qnHx.d;
        qnHx.a = ukVar;
        qnHx.b = layoutDirection;
        qnHx.c = dnVar3;
        qnHx.d = jE;
        dnVar3.e();
        qo0.i(enVar2, yu.b, 0L, enVar2.d(), 0.0f, null, 58);
        qo0.i(enVar2, hH.d(4278190080L), kt2.b, ps0.e(f, f), 0.0f, null, 120);
        enVar2.V(hH.d(4278190080L), (124 & 2) != 0 ? cm4.d(enVar2.d()) / 2.0f : f, (124 & 4) != 0 ? enVar2.t0() : X.a(f, f), (124 & 8) != 0 ? 1.0f : 0.0f, (124 & 16) != 0 ? gx0.w : null, null, (124 & 64) != 0 ? 3 : 0);
        dnVar3.r();
        en.QnHx qnHx2 = enVar2.w;
        qnHx2.a = ij0Var;
        qnHx2.b = jy1Var;
        qnHx2.c = dnVar4;
        qnHx2.d = j;
        return bj1Var;
    }
}
