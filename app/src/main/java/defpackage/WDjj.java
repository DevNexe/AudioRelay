package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class WDjj {
    public static final hr4<Float> a = hH.w(0.0f, null, 7);
    public static final hr4<wm0> b;

    static {
        Map<pb5<?, ?>, Float> map = kk5.a;
        b = hH.w(0.0f, new wm0(0.1f), 3);
        int i = cm4.d;
        ps0.e(0.5f, 0.5f);
        int i2 = kt2.e;
        X.a(0.5f, 0.5f);
        int i3 = mp1.c;
        C0239D.d(1, 1);
    }

    public static final AOdm a(float f, nb5 nb5Var, g30 g30Var, int i, int i2) {
        g30Var.e(704104481);
        Ah ah = nb5Var;
        if ((i2 & 2) != 0) {
            ah = b;
        }
        AOdm aOdmC = c(new wm0(f), mg5.c, ah, null, null, g30Var, (i & 14) | ((i << 3) & 896) | ((i << 6) & 57344), 8);
        g30Var.G();
        return aOdmC;
    }

    public static final AOdm b(float f, nb5 nb5Var, g30 g30Var, int i) {
        g30Var.e(1091643291);
        int i2 = i & 2;
        hr4<Float> hr4Var = a;
        Ah ah = nb5Var;
        if (i2 != 0) {
            ah = hr4Var;
        }
        float f2 = (i & 4) != 0 ? 0.01f : 0.0f;
        g30Var.e(841393485);
        Ah ah2 = ah;
        if (ah == hr4Var) {
            Float fValueOf = Float.valueOf(f2);
            g30Var.e(1157296644);
            boolean zI = g30Var.I(fValueOf);
            Object objF = g30Var.f();
            if (zI || objF == g30.QnHx.a) {
                objF = hH.w(0.0f, Float.valueOf(f2), 3);
                g30Var.B(objF);
            }
            g30Var.G();
            ah2 = (Ah) objF;
        }
        g30Var.G();
        AOdm aOdmC = c(Float.valueOf(f), mg5.a, ah2, Float.valueOf(f2), null, g30Var, 0, 0);
        g30Var.G();
        return aOdmC;
    }

    public static final AOdm c(Object obj, pb5 pb5Var, Ah ah, Float f, j81 j81Var, g30 g30Var, int i, int i2) {
        g30Var.e(-846382129);
        int i3 = i2 & 4;
        g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
        if (i3 != 0) {
            g30Var.e(-492369756);
            Object objF = g30Var.f();
            if (objF == c0132QnHx) {
                objF = hH.w(0.0f, f, 3);
                g30Var.B(objF);
            }
            g30Var.G();
            ah = (Ah) objF;
        }
        if ((i2 & 16) != 0) {
            j81Var = null;
        }
        g30Var.e(-492369756);
        Object objF2 = g30Var.f();
        if (objF2 == c0132QnHx) {
            objF2 = new OVbg(obj, pb5Var, null);
            g30Var.B(objF2);
        }
        g30Var.G();
        OVbg oVbg = (OVbg) objF2;
        ri2 ri2VarF0 = ps0.f0(j81Var, g30Var);
        ri2 ri2VarF1 = ps0.f0(ah, g30Var);
        g30Var.e(-492369756);
        Object objF3 = g30Var.f();
        if (objF3 == c0132QnHx) {
            objF3 = AY.a(-1, null, 6);
            g30Var.B(objF3);
        }
        g30Var.G();
        jo joVar = (jo) objF3;
        wq0.h(new dx(joVar, obj), g30Var);
        wq0.d(joVar, new Qj(joVar, oVbg, ri2VarF1, ri2VarF0, null), g30Var);
        AOdm<T, V> aOdm = oVbg.c;
        g30Var.G();
        return aOdm;
    }
}
