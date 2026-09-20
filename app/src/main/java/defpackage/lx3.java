package defpackage;

import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public final class lx3 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ bv3.QnHx w;
    public final /* synthetic */ j81<ev3, sd5> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lx3(bv3.QnHx qnHx, j81<? super ev3, sd5> j81Var, int i) {
        super(2);
        this.w = qnHx;
        this.x = j81Var;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 11) == 2 && g30Var2.t()) {
            g30Var2.x();
        } else {
            e40.CQf cQf = e40.a;
            bv3.QnHx qnHx = this.w;
            boolean z = qnHx.b;
            ej1 ej1VarD = YKK.C;
            if (ej1VarD == null) {
                ej1.QnHx qnHx2 = new ej1.QnHx("Outlined.BluetoothAudio");
                int i = sg5.a;
                jq4 jq4Var = new jq4(yu.b);
                le3 le3Var = new le3();
                le3Var.i(14.24f, 12.01f);
                le3Var.h(2.32f, 2.32f);
                le3Var.d(0.28f, -0.72f, 0.44f, -1.51f, 0.44f, -2.33f);
                le3Var.k(-0.16f, -1.59f, -0.43f, -2.31f);
                le3Var.h(-2.33f, 2.32f);
                le3Var.b();
                le3Var.i(19.53f, 6.71f);
                le3Var.h(-1.26f, 1.26f);
                le3Var.d(0.63f, 1.21f, 0.98f, 2.57f, 0.98f, 4.02f);
                le3Var.k(-0.36f, 2.82f, -0.98f, 4.02f);
                le3Var.h(1.2f, 1.2f);
                le3Var.d(0.97f, -1.54f, 1.54f, -3.36f, 1.54f, -5.31f);
                le3Var.d(-0.01f, -1.89f, -0.55f, -3.67f, -1.48f, -5.19f);
                le3Var.b();
                le3Var.i(15.71f, 7.71f);
                le3Var.g(10.0f, 2.0f);
                le3Var.g(9.0f, 2.0f);
                le3Var.n(7.59f);
                le3Var.g(4.41f, 5.0f);
                le3Var.g(3.0f, 6.41f);
                le3Var.g(8.59f, 12.0f);
                le3Var.g(3.0f, 17.59f);
                le3Var.g(4.41f, 19.0f);
                le3Var.g(9.0f, 14.41f);
                le3Var.g(9.0f, 22.0f);
                le3Var.f(1.0f);
                le3Var.h(5.71f, -5.71f);
                le3Var.h(-4.3f, -4.29f);
                le3Var.h(4.3f, -4.29f);
                le3Var.b();
                le3Var.i(11.0f, 5.83f);
                le3Var.h(1.88f, 1.88f);
                le3Var.g(11.0f, 9.59f);
                le3Var.g(11.0f, 5.83f);
                le3Var.b();
                le3Var.i(12.88f, 16.29f);
                le3Var.g(11.0f, 18.17f);
                le3Var.n(-3.76f);
                le3Var.h(1.88f, 1.88f);
                le3Var.b();
                qnHx2.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var, null, "", le3Var.a);
                ej1VarD = qnHx2.d();
                YKK.C = ej1VarD;
            }
            String str = qnHx.d;
            g30Var2.e(1157296644);
            j81<ev3, sd5> j81Var = this.x;
            boolean zI = g30Var2.I(j81Var);
            Object objF = g30Var2.f();
            g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
            if (zI || objF == c0132QnHx) {
                objF = new jx3(j81Var);
                g30Var2.B(objF);
            }
            g30Var2.G();
            ix3.m(z, ej1VarD, str, (h81) objF, g30Var2, 0);
            pq4.c(2, g30Var2, 6);
            boolean z2 = !qnHx.b;
            ej1 ej1VarG = qLd.g();
            String strX = hH.x(R.string.server_bluetooth_communication_off_option, g30Var2);
            g30Var2.e(1157296644);
            boolean zI2 = g30Var2.I(j81Var);
            Object objF2 = g30Var2.f();
            if (zI2 || objF2 == c0132QnHx) {
                objF2 = new kx3(j81Var);
                g30Var2.B(objF2);
            }
            g30Var2.G();
            ix3.m(z2, ej1VarG, strX, (h81) objF2, g30Var2, 0);
            pq4.c(8, g30Var2, 6);
        }
        return sd5.a;
    }
}
