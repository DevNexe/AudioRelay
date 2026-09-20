package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wg0 implements dz0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public wg0(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // defpackage.dz0
    public final AOdm a(ci2 ci2Var, g30 g30Var, int i) {
        float f;
        g30Var.e(-478475335);
        g30Var.e(-492369756);
        Object objF = g30Var.f();
        g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
        if (objF == c0132QnHx) {
            objF = new wp4();
            g30Var.B(objF);
        }
        g30Var.G();
        wp4 wp4Var = (wp4) objF;
        wq0.d(ci2Var, new ug0(ci2Var, wp4Var, null), g30Var);
        vp1 vp1Var = (vp1) wu.O0(wp4Var);
        if (vp1Var instanceof qd3) {
            f = this.b;
        } else if (vp1Var instanceof hd1) {
            f = this.c;
        } else {
            f = vp1Var instanceof j21 ? this.d : this.a;
        }
        float f2 = f;
        g30Var.e(-492369756);
        Object objF2 = g30Var.f();
        if (objF2 == c0132QnHx) {
            objF2 = new OVbg(new wm0(f2), mg5.c, null);
            g30Var.B(objF2);
        }
        g30Var.G();
        OVbg oVbg = (OVbg) objF2;
        wq0.d(new wm0(f2), new vg0(oVbg, this, f2, vp1Var, null), g30Var);
        AOdm<T, V> aOdm = oVbg.c;
        g30Var.G();
        return aOdm;
    }
}
