package defpackage;

import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class xg5 {

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ rg5 w;
        public final /* synthetic */ Map<String, lg5> x;
        public final /* synthetic */ int y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CQf(rg5 rg5Var, Map<String, ? extends lg5> map, int i, int i2) {
            super(2);
            this.w = rg5Var;
            this.x = map;
            this.y = i;
            this.z = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            xg5.a(this.w, this.x, g30Var, i, this.z);
            return sd5.a;
        }
    }

    public static final class F1 implements lg5 {
        @Override // defpackage.lg5
        public final Object a(Object obj) {
            return obj;
        }
    }

    public static final class LPt8Fixed implements lg5 {
        @Override // defpackage.lg5
        public final Object a(Object obj) {
            return obj;
        }
    }

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ tg5 w;
        public final /* synthetic */ Map<String, lg5> x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(tg5 tg5Var, Map<String, ? extends lg5> map) {
            super(2);
            this.w = tg5Var;
            this.x = map;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                xg5.a((rg5) this.w, this.x, g30Var2, 64, 0);
            }
            return sd5.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:43:0x014a  */
    /* JADX WARN: Code duplicated, block: B:45:0x015f  */
    /* JADX WARN: Code duplicated, block: B:47:0x020c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0076 A[SYNTHETIC] */
    public static final void a(rg5 rg5Var, Map<String, ? extends lg5> map, g30 g30Var, int i, int i2) {
        int i3;
        Map<String, ? extends lg5> map2;
        Map<String, ? extends lg5> map3;
        lg5 f1;
        Map<String, ? extends lg5> map4;
        Map<String, ? extends lg5> map5;
        lg5 lPt8;
        j30 j30VarQ = g30Var.q(-446179233);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.I(rg5Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 16;
        }
        if (i4 == 2 && (i3 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
            map3 = map;
        } else {
            j30VarQ.t0();
            if ((i & 1) == 0 || j30VarQ.Y()) {
                if (i4 != 0) {
                    map2 = ds0.w;
                }
                j30VarQ.S();
                for (tg5 tg5Var : rg5Var.F) {
                    if (tg5Var instanceof zg5) {
                        j30VarQ.e(-326285835);
                        zg5 zg5Var = (zg5) tg5Var;
                        f1 = map2.get(zg5Var.w);
                        if (f1 == null) {
                            f1 = new F1();
                        }
                        lg5 lg5Var = f1;
                        int i5 = ah5.F1.a;
                        List list = (List) lg5Var.a(zg5Var.x);
                        int i6 = zg5Var.y;
                        String str = zg5Var.w;
                        int i7 = ah5.QnHx.a;
                        cg cgVar = (cg) lg5Var.a(zg5Var.z);
                        int i8 = ah5.CQf.a;
                        float fFloatValue = ((Number) lg5Var.a(Float.valueOf(zg5Var.A))).floatValue();
                        int i9 = ah5.byN.a;
                        cg cgVar2 = (cg) lg5Var.a(zg5Var.B);
                        int i10 = ah5.EQ.a;
                        float fFloatValue2 = ((Number) lg5Var.a(Float.valueOf(zg5Var.C))).floatValue();
                        int i11 = ah5.FJCM.a;
                        float fFloatValue3 = ((Number) lg5Var.a(Float.valueOf(zg5Var.D))).floatValue();
                        int i12 = zg5Var.E;
                        int i13 = zg5Var.F;
                        float f = zg5Var.G;
                        int i14 = ah5.LPt6Fixed.a;
                        float fFloatValue4 = ((Number) lg5Var.a(Float.valueOf(zg5Var.H))).floatValue();
                        int i15 = ah5.RBi.a;
                        float fFloatValue5 = ((Number) lg5Var.a(Float.valueOf(zg5Var.I))).floatValue();
                        int i16 = ah5.MZ.a;
                        kg5.b(list, i6, str, cgVar, fFloatValue, cgVar2, fFloatValue2, fFloatValue3, i12, i13, f, fFloatValue4, fFloatValue5, ((Number) lg5Var.a(Float.valueOf(zg5Var.J))).floatValue(), j30VarQ, 8, 0, 0);
                        j30VarQ.R(false);
                        map2 = map2;
                    } else {
                        map4 = map2;
                        if (tg5Var instanceof rg5) {
                            j30VarQ.e(-326283977);
                            rg5 rg5Var2 = (rg5) tg5Var;
                            map5 = map4;
                            lPt8 = map5.get(rg5Var2.w);
                            if (lPt8 == null) {
                                lPt8 = new LPt8Fixed();
                            }
                            String str2 = rg5Var2.w;
                            int i17 = ah5.YKK.a;
                            float fFloatValue6 = ((Number) lPt8.a(Float.valueOf(rg5Var2.x))).floatValue();
                            int i18 = ah5.auxFixed.a;
                            float fFloatValue7 = ((Number) lPt8.a(Float.valueOf(rg5Var2.A))).floatValue();
                            int i19 = ah5.T23.a;
                            float fFloatValue8 = ((Number) lPt8.a(Float.valueOf(rg5Var2.B))).floatValue();
                            int i20 = ah5.PRnFixed.a;
                            float fFloatValue9 = ((Number) lPt8.a(Float.valueOf(rg5Var2.C))).floatValue();
                            int i21 = ah5.y.a;
                            float fFloatValue10 = ((Number) lPt8.a(Float.valueOf(rg5Var2.D))).floatValue();
                            int i22 = ah5.LPt8Fixed.a;
                            float fFloatValue11 = ((Number) lPt8.a(Float.valueOf(rg5Var2.y))).floatValue();
                            int i23 = ah5.NUlFixed.a;
                            float fFloatValue12 = ((Number) lPt8.a(Float.valueOf(rg5Var2.z))).floatValue();
                            int i24 = ah5.F1.a;
                            kg5.a(str2, fFloatValue6, fFloatValue11, fFloatValue12, fFloatValue7, fFloatValue8, fFloatValue9, fFloatValue10, (List) lPt8.a(rg5Var2.E), X.m(j30VarQ, 1450046638, new QnHx(tg5Var, map5)), j30VarQ, 939524096, 0);
                            j30VarQ.R(false);
                        } else {
                            map5 = map4;
                            j30VarQ.e(-326282507);
                            j30VarQ.R(false);
                        }
                        map2 = map5;
                    }
                }
                map3 = map2;
            } else {
                j30VarQ.x();
            }
            map2 = map;
            j30VarQ.S();
            while (r22.hasNext()) {
                if (tg5Var instanceof zg5) {
                    j30VarQ.e(-326285835);
                    zg5 zg5Var2 = (zg5) tg5Var;
                    f1 = map2.get(zg5Var2.w);
                    if (f1 == null) {
                        f1 = new F1();
                    }
                    lg5 lg5Var2 = f1;
                    int i25 = ah5.F1.a;
                    List list2 = (List) lg5Var2.a(zg5Var2.x);
                    int i26 = zg5Var2.y;
                    String str3 = zg5Var2.w;
                    int i27 = ah5.QnHx.a;
                    cg cgVar3 = (cg) lg5Var2.a(zg5Var2.z);
                    int i28 = ah5.CQf.a;
                    float fFloatValue13 = ((Number) lg5Var2.a(Float.valueOf(zg5Var2.A))).floatValue();
                    int i29 = ah5.byN.a;
                    cg cgVar4 = (cg) lg5Var2.a(zg5Var2.B);
                    int i110 = ah5.EQ.a;
                    float fFloatValue14 = ((Number) lg5Var2.a(Float.valueOf(zg5Var2.C))).floatValue();
                    int i111 = ah5.FJCM.a;
                    float fFloatValue15 = ((Number) lg5Var2.a(Float.valueOf(zg5Var2.D))).floatValue();
                    int i112 = zg5Var2.E;
                    int i113 = zg5Var2.F;
                    float f2 = zg5Var2.G;
                    int i114 = ah5.LPt6Fixed.a;
                    float fFloatValue16 = ((Number) lg5Var2.a(Float.valueOf(zg5Var2.H))).floatValue();
                    int i115 = ah5.RBi.a;
                    float fFloatValue17 = ((Number) lg5Var2.a(Float.valueOf(zg5Var2.I))).floatValue();
                    int i116 = ah5.MZ.a;
                    kg5.b(list2, i26, str3, cgVar3, fFloatValue13, cgVar4, fFloatValue14, fFloatValue15, i112, i113, f2, fFloatValue16, fFloatValue17, ((Number) lg5Var2.a(Float.valueOf(zg5Var2.J))).floatValue(), j30VarQ, 8, 0, 0);
                    j30VarQ.R(false);
                    map2 = map2;
                } else {
                    map4 = map2;
                    if (tg5Var instanceof rg5) {
                        j30VarQ.e(-326283977);
                        rg5 rg5Var3 = (rg5) tg5Var;
                        map5 = map4;
                        lPt8 = map5.get(rg5Var3.w);
                        if (lPt8 == null) {
                            lPt8 = new LPt8Fixed();
                        }
                        String str4 = rg5Var3.w;
                        int i117 = ah5.YKK.a;
                        float fFloatValue18 = ((Number) lPt8.a(Float.valueOf(rg5Var3.x))).floatValue();
                        int i118 = ah5.auxFixed.a;
                        float fFloatValue19 = ((Number) lPt8.a(Float.valueOf(rg5Var3.A))).floatValue();
                        int i119 = ah5.T23.a;
                        float fFloatValue20 = ((Number) lPt8.a(Float.valueOf(rg5Var3.B))).floatValue();
                        int i210 = ah5.PRnFixed.a;
                        float fFloatValue21 = ((Number) lPt8.a(Float.valueOf(rg5Var3.C))).floatValue();
                        int i211 = ah5.y.a;
                        float fFloatValue110 = ((Number) lPt8.a(Float.valueOf(rg5Var3.D))).floatValue();
                        int i212 = ah5.LPt8Fixed.a;
                        float fFloatValue111 = ((Number) lPt8.a(Float.valueOf(rg5Var3.y))).floatValue();
                        int i213 = ah5.NUlFixed.a;
                        float fFloatValue112 = ((Number) lPt8.a(Float.valueOf(rg5Var3.z))).floatValue();
                        int i214 = ah5.F1.a;
                        kg5.a(str4, fFloatValue18, fFloatValue111, fFloatValue112, fFloatValue19, fFloatValue20, fFloatValue21, fFloatValue110, (List) lPt8.a(rg5Var3.E), X.m(j30VarQ, 1450046638, new QnHx(tg5Var, map5)), j30VarQ, 939524096, 0);
                        j30VarQ.R(false);
                    } else {
                        map5 = map4;
                        j30VarQ.e(-326282507);
                        j30VarQ.R(false);
                    }
                    map2 = map5;
                }
            }
            map3 = map2;
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(rg5Var, map3, i, i2);
    }

    public static final vg5 b(ej1 ej1Var, g30 g30Var) {
        g30Var.e(1413834416);
        String str = ej1Var.a;
        sz szVarM = X.m(g30Var, 1873274766, new yg5(ej1Var));
        g30Var.e(1068590786);
        ij0 ij0Var = (ij0) g30Var.E(r40.e);
        float fB0 = ij0Var.b0(ej1Var.b);
        float fB1 = ij0Var.b0(ej1Var.c);
        float f = ej1Var.d;
        if (Float.isNaN(f)) {
            f = fB0;
        }
        float f2 = ej1Var.e;
        if (Float.isNaN(f2)) {
            f2 = fB1;
        }
        long j = ej1Var.g;
        yu yuVar = new yu(j);
        int i = ej1Var.h;
        za zaVar = new za(i);
        g30Var.e(511388516);
        boolean zI = g30Var.I(yuVar) | g30Var.I(zaVar);
        Object objF = g30Var.f();
        g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
        if (zI || objF == c0132QnHx) {
            if (yu.c(j, yu.h)) {
                objF = null;
            } else {
                objF = new av(Build.VERSION.SDK_INT >= 29 ? bb.a.a(j, i) : new PorterDuffColorFilter(hH.A(j), fp1.z0(i)));
            }
            g30Var.B(objF);
        }
        g30Var.G();
        av avVar = (av) objF;
        g30Var.e(-492369756);
        Object objF2 = g30Var.f();
        if (objF2 == c0132QnHx) {
            objF2 = new vg5();
            g30Var.B(objF2);
        }
        g30Var.G();
        vg5 vg5Var = (vg5) objF2;
        vg5Var.B.setValue(new cm4(ps0.e(fB0, fB1)));
        vg5Var.C.setValue(Boolean.valueOf(ej1Var.i));
        vg5Var.D.f.setValue(avVar);
        vg5Var.i(str, f, f2, szVarM, g30Var, 35840);
        g30Var.G();
        g30Var.G();
        return vg5Var;
    }
}
