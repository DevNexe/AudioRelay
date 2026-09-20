package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import com.azefsw.audioconnect.R;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class g20 {
    public static final sz a = X.n(-169896051, QnHx.w, false);
    public static final sz b = X.n(658305078, PRnFixed.w, false);
    public static final sz c = X.n(242978261, Xn1.w, false);
    public static final sz d = X.n(1605472021, ta.w, false);
    public static final sz e = X.n(1190145204, LPt9Fixed.w, false);
    public static final sz f = X.n(-1742328332, lPt3Fixed.w, false);
    public static final sz g = X.n(2137312147, ck32.w, false);
    public static final sz h = X.n(-91187065, SjP.w, false);
    public static final sz i = X.n(2046181460, Aa.w, false);
    public static final sz j = X.n(1549523126, CQf.w, false);
    public static final sz k = X.n(1378821151, F1.w, false);
    public static final sz l = X.n(-1555789470, LPt8Fixed.w, false);
    public static final sz m = X.n(-1705324391, NUlFixed.w, false);
    public static final sz n = X.n(1320972826, YKK.w, false);
    public static final sz o = X.n(775850202, auxFixed.w, false);
    public static final sz p = X.n(-492819877, T23.w, false);
    public static final sz q = X.n(-1755751640, byN.w, false);
    public static final sz r = X.n(-1037942501, EQ.w, false);
    public static final sz s = X.n(1443232092, FJCM.w, false);
    public static final sz t = X.n(-370560611, y.w, false);
    public static final sz u = X.n(-1639230690, RBi.w, false);
    public static final sz v = X.n(2110613982, MZ.w, false);
    public static final sz w = X.n(-557667297, LPt6Fixed.w, false);

    public static final class Aa extends cx1 implements x81<g30, Integer, sd5> {
        public static final Aa w = new Aa();

        public Aa() {
            super(2);
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                ej1 ej1VarD = NRt.y;
                if (ej1VarD == null) {
                    ej1.QnHx qnHx = new ej1.QnHx("Outlined.TextFormat");
                    int i = sg5.a;
                    jq4 jq4Var = new jq4(yu.b);
                    le3 le3Var = new le3();
                    le3Var.i(5.0f, 17.0f);
                    le3Var.n(2.0f);
                    le3Var.f(14.0f);
                    le3Var.n(-2.0f);
                    le3Var.g(5.0f, 17.0f);
                    le3Var.b();
                    le3Var.i(9.5f, 12.8f);
                    le3Var.f(5.0f);
                    le3Var.h(0.9f, 2.2f);
                    le3Var.f(2.1f);
                    le3Var.g(12.75f, 4.0f);
                    le3Var.f(-1.5f);
                    le3Var.g(6.5f, 15.0f);
                    le3Var.f(2.1f);
                    le3Var.h(0.9f, -2.2f);
                    le3Var.b();
                    le3Var.i(12.0f, 5.98f);
                    le3Var.g(13.87f, 11.0f);
                    le3Var.f(-3.74f);
                    le3Var.g(12.0f, 5.98f);
                    le3Var.b();
                    qnHx.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var, null, "", le3Var.a);
                    ej1VarD = qnHx.d();
                    NRt.y = ej1VarD;
                }
                rh1.a(ej1VarD, null, null, 0L, g30Var2, 48, 12);
            }
            return sd5.a;
        }
    }

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public static final CQf w = new CQf();

        public CQf() {
            super(2);
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                ej1 ej1VarD = ob.x;
                if (ej1VarD == null) {
                    ej1.QnHx qnHx = new ej1.QnHx("Outlined.DarkMode");
                    int i = sg5.a;
                    jq4 jq4Var = new jq4(yu.b);
                    le3 le3Var = new le3();
                    le3Var.i(9.37f, 5.51f);
                    le3Var.c(9.19f, 6.15f, 9.1f, 6.82f, 9.1f, 7.5f);
                    le3Var.d(0.0f, 4.08f, 3.32f, 7.4f, 7.4f, 7.4f);
                    le3Var.d(0.68f, 0.0f, 1.35f, -0.09f, 1.99f, -0.27f);
                    le3Var.c(17.45f, 17.19f, 14.93f, 19.0f, 12.0f, 19.0f);
                    le3Var.d(-3.86f, 0.0f, -7.0f, -3.14f, -7.0f, -7.0f);
                    le3Var.c(5.0f, 9.07f, 6.81f, 6.55f, 9.37f, 5.51f);
                    le3Var.b();
                    le3Var.i(12.0f, 3.0f);
                    le3Var.d(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
                    le3Var.k(4.03f, 9.0f, 9.0f, 9.0f);
                    le3Var.k(9.0f, -4.03f, 9.0f, -9.0f);
                    le3Var.d(0.0f, -0.46f, -0.04f, -0.92f, -0.1f, -1.36f);
                    le3Var.d(-0.98f, 1.37f, -2.58f, 2.26f, -4.4f, 2.26f);
                    le3Var.d(-2.98f, 0.0f, -5.4f, -2.42f, -5.4f, -5.4f);
                    le3Var.d(0.0f, -1.81f, 0.89f, -3.42f, 2.26f, -4.4f);
                    le3Var.c(12.92f, 3.04f, 12.46f, 3.0f, 12.0f, 3.0f);
                    le3Var.g(12.0f, 3.0f);
                    le3Var.b();
                    qnHx.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var, null, "", le3Var.a);
                    ej1VarD = qnHx.d();
                    ob.x = ej1VarD;
                }
                rh1.a(ej1VarD, null, null, 0L, g30Var2, 48, 12);
            }
            return sd5.a;
        }
    }

    public static final class EQ extends cx1 implements x81<g30, Integer, sd5> {
        public static final EQ w = new EQ();

        public EQ() {
            super(2);
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                ej1 ej1VarD = o70.y;
                if (ej1VarD == null) {
                    ej1.QnHx qnHx = new ej1.QnHx("Outlined.Group");
                    int i = sg5.a;
                    jq4 jq4Var = new jq4(yu.b);
                    le3 le3Var = new le3();
                    le3Var.i(9.0f, 13.75f);
                    le3Var.d(-2.34f, 0.0f, -7.0f, 1.17f, -7.0f, 3.5f);
                    le3Var.g(2.0f, 19.0f);
                    le3Var.f(14.0f);
                    le3Var.n(-1.75f);
                    le3Var.d(0.0f, -2.33f, -4.66f, -3.5f, -7.0f, -3.5f);
                    le3Var.b();
                    le3Var.i(4.34f, 17.0f);
                    le3Var.d(0.84f, -0.58f, 2.87f, -1.25f, 4.66f, -1.25f);
                    le3Var.k(3.82f, 0.67f, 4.66f, 1.25f);
                    le3Var.g(4.34f, 17.0f);
                    le3Var.b();
                    le3Var.i(9.0f, 12.0f);
                    le3Var.d(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
                    le3Var.j(10.93f, 5.0f, 9.0f, 5.0f);
                    le3Var.j(5.5f, 6.57f, 5.5f, 8.5f);
                    le3Var.j(7.07f, 12.0f, 9.0f, 12.0f);
                    le3Var.b();
                    le3Var.i(9.0f, 7.0f);
                    le3Var.d(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
                    le3Var.j(9.83f, 10.0f, 9.0f, 10.0f);
                    le3Var.k(-1.5f, -0.67f, -1.5f, -1.5f);
                    le3Var.j(8.17f, 7.0f, 9.0f, 7.0f);
                    le3Var.b();
                    le3Var.i(16.04f, 13.81f);
                    le3Var.d(1.16f, 0.84f, 1.96f, 1.96f, 1.96f, 3.44f);
                    le3Var.g(18.0f, 19.0f);
                    le3Var.f(4.0f);
                    le3Var.n(-1.75f);
                    le3Var.d(0.0f, -2.02f, -3.5f, -3.17f, -5.96f, -3.44f);
                    le3Var.b();
                    le3Var.i(15.0f, 12.0f);
                    le3Var.d(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
                    le3Var.j(16.93f, 5.0f, 15.0f, 5.0f);
                    le3Var.d(-0.54f, 0.0f, -1.04f, 0.13f, -1.5f, 0.35f);
                    le3Var.d(0.63f, 0.89f, 1.0f, 1.98f, 1.0f, 3.15f);
                    le3Var.k(-0.37f, 2.26f, -1.0f, 3.15f);
                    le3Var.d(0.46f, 0.22f, 0.96f, 0.35f, 1.5f, 0.35f);
                    le3Var.b();
                    qnHx.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var, null, "", le3Var.a);
                    ej1VarD = qnHx.d();
                    o70.y = ej1VarD;
                }
                rh1.a(ej1VarD, null, null, 0L, g30Var2, 48, 12);
            }
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements x81<g30, Integer, sd5> {
        public static final F1 w = new F1();

        public F1() {
            super(2);
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                ej1 ej1VarD = ix1.w;
                if (ej1VarD == null) {
                    ej1.QnHx qnHx = new ej1.QnHx("Outlined.Language");
                    int i = sg5.a;
                    jq4 jq4Var = new jq4(yu.b);
                    le3 le3Var = new le3();
                    le3Var.i(11.99f, 2.0f);
                    le3Var.c(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                    le3Var.k(4.47f, 10.0f, 9.99f, 10.0f);
                    le3Var.c(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
                    le3Var.j(17.52f, 2.0f, 11.99f, 2.0f);
                    le3Var.b();
                    le3Var.i(18.92f, 8.0f);
                    le3Var.f(-2.95f);
                    le3Var.d(-0.32f, -1.25f, -0.78f, -2.45f, -1.38f, -3.56f);
                    le3Var.d(1.84f, 0.63f, 3.37f, 1.91f, 4.33f, 3.56f);
                    le3Var.b();
                    le3Var.i(12.0f, 4.04f);
                    le3Var.d(0.83f, 1.2f, 1.48f, 2.53f, 1.91f, 3.96f);
                    le3Var.f(-3.82f);
                    le3Var.d(0.43f, -1.43f, 1.08f, -2.76f, 1.91f, -3.96f);
                    le3Var.b();
                    le3Var.i(4.26f, 14.0f);
                    le3Var.c(4.1f, 13.36f, 4.0f, 12.69f, 4.0f, 12.0f);
                    le3Var.k(0.1f, -1.36f, 0.26f, -2.0f);
                    le3Var.f(3.38f);
                    le3Var.d(-0.08f, 0.66f, -0.14f, 1.32f, -0.14f, 2.0f);
                    le3Var.k(0.06f, 1.34f, 0.14f, 2.0f);
                    le3Var.g(4.26f, 14.0f);
                    le3Var.b();
                    le3Var.i(5.08f, 16.0f);
                    le3Var.f(2.95f);
                    le3Var.d(0.32f, 1.25f, 0.78f, 2.45f, 1.38f, 3.56f);
                    le3Var.d(-1.84f, -0.63f, -3.37f, -1.9f, -4.33f, -3.56f);
                    le3Var.b();
                    le3Var.i(8.03f, 8.0f);
                    le3Var.g(5.08f, 8.0f);
                    le3Var.d(0.96f, -1.66f, 2.49f, -2.93f, 4.33f, -3.56f);
                    le3Var.c(8.81f, 5.55f, 8.35f, 6.75f, 8.03f, 8.0f);
                    le3Var.b();
                    le3Var.i(12.0f, 19.96f);
                    le3Var.d(-0.83f, -1.2f, -1.48f, -2.53f, -1.91f, -3.96f);
                    le3Var.f(3.82f);
                    le3Var.d(-0.43f, 1.43f, -1.08f, 2.76f, -1.91f, 3.96f);
                    le3Var.b();
                    le3Var.i(14.34f, 14.0f);
                    le3Var.g(9.66f, 14.0f);
                    le3Var.d(-0.09f, -0.66f, -0.16f, -1.32f, -0.16f, -2.0f);
                    le3Var.k(0.07f, -1.35f, 0.16f, -2.0f);
                    le3Var.f(4.68f);
                    le3Var.d(0.09f, 0.65f, 0.16f, 1.32f, 0.16f, 2.0f);
                    le3Var.k(-0.07f, 1.34f, -0.16f, 2.0f);
                    le3Var.b();
                    le3Var.i(14.59f, 19.56f);
                    le3Var.d(0.6f, -1.11f, 1.06f, -2.31f, 1.38f, -3.56f);
                    le3Var.f(2.95f);
                    le3Var.d(-0.96f, 1.65f, -2.49f, 2.93f, -4.33f, 3.56f);
                    le3Var.b();
                    le3Var.i(16.36f, 14.0f);
                    le3Var.d(0.08f, -0.66f, 0.14f, -1.32f, 0.14f, -2.0f);
                    le3Var.k(-0.06f, -1.34f, -0.14f, -2.0f);
                    le3Var.f(3.38f);
                    le3Var.d(0.16f, 0.64f, 0.26f, 1.31f, 0.26f, 2.0f);
                    le3Var.k(-0.1f, 1.36f, -0.26f, 2.0f);
                    le3Var.f(-3.38f);
                    le3Var.b();
                    qnHx.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var, null, "", le3Var.a);
                    ej1VarD = qnHx.d();
                    ix1.w = ej1VarD;
                }
                rh1.a(ej1VarD, null, null, 0L, g30Var2, 48, 12);
            }
            return sd5.a;
        }
    }

    public static final class FJCM extends cx1 implements x81<g30, Integer, sd5> {
        public static final FJCM w = new FJCM();

        public FJCM() {
            super(2);
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                ej1 ej1VarD = xApe.U;
                if (ej1VarD == null) {
                    ej1.QnHx qnHx = new ej1.QnHx("Outlined.Source");
                    int i = sg5.a;
                    jq4 jq4Var = new jq4(yu.b);
                    le3 le3Var = new le3();
                    le3Var.i(20.0f, 6.0f);
                    le3Var.f(-8.0f);
                    le3Var.h(-2.0f, -2.0f);
                    le3Var.e(4.0f);
                    le3Var.c(2.9f, 4.0f, 2.01f, 4.9f, 2.01f, 6.0f);
                    le3Var.g(2.0f, 18.0f);
                    le3Var.d(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                    le3Var.f(16.0f);
                    le3Var.d(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                    le3Var.m(8.0f);
                    le3Var.c(22.0f, 6.9f, 21.1f, 6.0f, 20.0f, 6.0f);
                    le3Var.b();
                    le3Var.i(20.0f, 18.0f);
                    le3Var.g(4.0f, 18.0f);
                    le3Var.m(6.0f);
                    le3Var.f(5.17f);
                    le3Var.h(2.0f, 2.0f);
                    le3Var.e(20.0f);
                    le3Var.m(18.0f);
                    le3Var.b();
                    le3Var.i(18.0f, 12.0f);
                    le3Var.e(6.0f);
                    le3Var.n(-2.0f);
                    le3Var.f(12.0f);
                    le3Var.m(12.0f);
                    le3Var.b();
                    le3Var.i(14.0f, 16.0f);
                    le3Var.e(6.0f);
                    le3Var.n(-2.0f);
                    le3Var.f(8.0f);
                    le3Var.m(16.0f);
                    le3Var.b();
                    qnHx.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var, null, "", le3Var.a);
                    ej1VarD = qnHx.d();
                    xApe.U = ej1VarD;
                }
                rh1.a(ej1VarD, null, null, 0L, g30Var2, 48, 12);
            }
            return sd5.a;
        }
    }

    public static final class LPt6Fixed extends cx1 implements x81<g30, Integer, sd5> {
        public static final LPt6Fixed w = new LPt6Fixed();

        public LPt6Fixed() {
            super(2);
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                rh1.a(hH.p(), null, null, 0L, g30Var2, 48, 12);
            }
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements x81<g30, Integer, sd5> {
        public static final LPt8Fixed w = new LPt8Fixed();

        public LPt8Fixed() {
            super(2);
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                ej1 ej1VarD = ko6.A;
                if (ej1VarD == null) {
                    ej1.QnHx qnHx = new ej1.QnHx("Outlined.Share");
                    int i = sg5.a;
                    jq4 jq4Var = new jq4(yu.b);
                    le3 le3Var = new le3();
                    le3Var.i(18.0f, 16.08f);
                    le3Var.d(-0.76f, 0.0f, -1.44f, 0.3f, -1.96f, 0.77f);
                    le3Var.g(8.91f, 12.7f);
                    le3Var.d(0.05f, -0.23f, 0.09f, -0.46f, 0.09f, -0.7f);
                    le3Var.k(-0.04f, -0.47f, -0.09f, -0.7f);
                    le3Var.h(7.05f, -4.11f);
                    le3Var.d(0.54f, 0.5f, 1.25f, 0.81f, 2.04f, 0.81f);
                    le3Var.d(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
                    le3Var.k(-1.34f, -3.0f, -3.0f, -3.0f);
                    le3Var.k(-3.0f, 1.34f, -3.0f, 3.0f);
                    le3Var.d(0.0f, 0.24f, 0.04f, 0.47f, 0.09f, 0.7f);
                    le3Var.g(8.04f, 9.81f);
                    le3Var.c(7.5f, 9.31f, 6.79f, 9.0f, 6.0f, 9.0f);
                    le3Var.d(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
                    le3Var.k(1.34f, 3.0f, 3.0f, 3.0f);
                    le3Var.d(0.79f, 0.0f, 1.5f, -0.31f, 2.04f, -0.81f);
                    le3Var.h(7.12f, 4.16f);
                    le3Var.d(-0.05f, 0.21f, -0.08f, 0.43f, -0.08f, 0.65f);
                    le3Var.d(0.0f, 1.61f, 1.31f, 2.92f, 2.92f, 2.92f);
                    le3Var.k(2.92f, -1.31f, 2.92f, -2.92f);
                    le3Var.d(0.0f, -1.61f, -1.31f, -2.92f, -2.92f, -2.92f);
                    le3Var.b();
                    le3Var.i(18.0f, 4.0f);
                    le3Var.d(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
                    le3Var.k(-0.45f, 1.0f, -1.0f, 1.0f);
                    le3Var.k(-1.0f, -0.45f, -1.0f, -1.0f);
                    le3Var.k(0.45f, -1.0f, 1.0f, -1.0f);
                    le3Var.b();
                    le3Var.i(6.0f, 13.0f);
                    le3Var.d(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
                    le3Var.k(0.45f, -1.0f, 1.0f, -1.0f);
                    le3Var.k(1.0f, 0.45f, 1.0f, 1.0f);
                    le3Var.k(-0.45f, 1.0f, -1.0f, 1.0f);
                    le3Var.b();
                    le3Var.i(18.0f, 20.02f);
                    le3Var.d(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
                    le3Var.k(0.45f, -1.0f, 1.0f, -1.0f);
                    le3Var.k(1.0f, 0.45f, 1.0f, 1.0f);
                    le3Var.k(-0.45f, 1.0f, -1.0f, 1.0f);
                    le3Var.b();
                    qnHx.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var, null, "", le3Var.a);
                    ej1VarD = qnHx.d();
                    ko6.A = ej1VarD;
                }
                rh1.a(ej1VarD, null, null, 0L, g30Var2, 48, 12);
            }
            return sd5.a;
        }
    }

    public static final class LPt9Fixed extends cx1 implements x81<g30, Integer, sd5> {
        public static final LPt9Fixed w = new LPt9Fixed();

        public LPt9Fixed() {
            super(2);
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                ci4.h(g30Var2, 0);
            }
            return sd5.a;
        }
    }

    public static final class MZ extends cx1 implements x81<g30, Integer, sd5> {
        public static final MZ w = new MZ();

        public MZ() {
            super(2);
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                ej1 ej1VarD = bx0.x;
                if (ej1VarD == null) {
                    ej1.QnHx qnHx = new ej1.QnHx("Outlined.SystemUpdate");
                    int i = sg5.a;
                    jq4 jq4Var = new jq4(yu.b);
                    le3 le3Var = new le3();
                    le3Var.i(17.0f, 1.01f);
                    le3Var.g(7.0f, 1.0f);
                    le3Var.d(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                    le3Var.n(18.0f);
                    le3Var.d(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                    le3Var.f(10.0f);
                    le3Var.d(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                    le3Var.g(19.0f, 3.0f);
                    le3Var.d(0.0f, -1.1f, -0.9f, -1.99f, -2.0f, -1.99f);
                    le3Var.b();
                    le3Var.i(17.0f, 19.0f);
                    le3Var.g(7.0f, 19.0f);
                    le3Var.g(7.0f, 5.0f);
                    le3Var.f(10.0f);
                    le3Var.n(14.0f);
                    le3Var.b();
                    le3Var.i(16.0f, 13.0f);
                    le3Var.f(-3.0f);
                    le3Var.g(13.0f, 8.0f);
                    le3Var.f(-2.0f);
                    le3Var.n(5.0f);
                    le3Var.g(8.0f, 13.0f);
                    le3Var.h(4.0f, 4.0f);
                    le3Var.h(4.0f, -4.0f);
                    le3Var.b();
                    qnHx.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var, null, "", le3Var.a);
                    ej1VarD = qnHx.d();
                    bx0.x = ej1VarD;
                }
                rh1.a(ej1VarD, null, null, 0L, g30Var2, 48, 12);
            }
            return sd5.a;
        }
    }

    public static final class NUlFixed extends cx1 implements x81<g30, Integer, sd5> {
        public static final NUlFixed w = new NUlFixed();

        public NUlFixed() {
            super(2);
        }

        /* JADX WARN: Code duplicated, block: B:121:0x02dd  */
        /* JADX WARN: Code duplicated, block: B:123:0x02e0  */
        /* JADX WARN: Code duplicated, block: B:124:0x02e3  */
        /* JADX WARN: Code duplicated, block: B:125:0x02e6  */
        /* JADX WARN: Code duplicated, block: B:128:0x0344  */
        /* JADX WARN: Code duplicated, block: B:129:0x0347  */
        /* JADX WARN: Code duplicated, block: B:60:0x0172  */
        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) throws XmlPullParserException, IOException {
            sy2 xaVar;
            g30 g30Var2;
            long jC;
            int i;
            int i2;
            int iE;
            int i3;
            int iE2;
            int i4;
            g30 g30Var3 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var3.t()) {
                g30Var3.x();
            } else {
                e40.CQf cQf = e40.a;
                g30Var3.e(473971343);
                Context context = (Context) g30Var3.E(Ll.b);
                Resources resources = context.getResources();
                g30Var3.e(-492369756);
                Object objF = g30Var3.f();
                g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
                if (objF == c0132QnHx) {
                    objF = new TypedValue();
                    g30Var3.B(objF);
                }
                g30Var3.G();
                TypedValue typedValue = (TypedValue) objF;
                int i5 = 1;
                resources.getValue(R.drawable.google_play, typedValue, true);
                CharSequence charSequence = typedValue.string;
                if (charSequence != null && mv4.A(charSequence, ".xml")) {
                    g30Var3.e(-738265321);
                    Resources.Theme theme = context.getTheme();
                    g30Var3.e(2112503116);
                    fj1 fj1Var = (fj1) g30Var3.E(Ll.c);
                    fj1.CQf cQf2 = new fj1.CQf(theme);
                    WeakReference<fj1.QnHx> weakReference = fj1Var.a.get(cQf2);
                    fj1.QnHx qnHx = weakReference != null ? weakReference.get() : null;
                    if (qnHx == null) {
                        XmlResourceParser xml = resources.getXml(R.drawable.google_play);
                        int next = xml.next();
                        while (next != 2 && next != 1) {
                            next = xml.next();
                        }
                        if (next != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        if (!ur1.a(xml.getName(), "vector")) {
                            throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG");
                        }
                        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                        ZOWb zOWb = new ZOWb(xml);
                        TypedArray typedArrayI = zb5.i(resources, theme, attributeSetAsAttributeSet, CXJ.a);
                        zOWb.c(typedArrayI.getChangingConfigurations());
                        boolean z = !zb5.h(xml, "autoMirrored") ? false : typedArrayI.getBoolean(5, false);
                        zOWb.c(typedArrayI.getChangingConfigurations());
                        float fA = zOWb.a(typedArrayI, "viewportWidth", 7, 0.0f);
                        float fA2 = zOWb.a(typedArrayI, "viewportHeight", 8, 0.0f);
                        if (fA <= 0.0f) {
                            throw new XmlPullParserException(typedArrayI.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
                        }
                        if (fA2 <= 0.0f) {
                            throw new XmlPullParserException(typedArrayI.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
                        }
                        int i6 = 3;
                        float dimension = typedArrayI.getDimension(3, 0.0f);
                        zOWb.c(typedArrayI.getChangingConfigurations());
                        float dimension2 = typedArrayI.getDimension(2, 0.0f);
                        zOWb.c(typedArrayI.getChangingConfigurations());
                        if (typedArrayI.hasValue(1)) {
                            TypedValue typedValue2 = new TypedValue();
                            typedArrayI.getValue(1, typedValue2);
                            if (typedValue2.type == 2) {
                                jC = yu.h;
                            } else {
                                ColorStateList colorStateListB = zb5.b(typedArrayI, xml, theme);
                                zOWb.c(typedArrayI.getChangingConfigurations());
                                jC = colorStateListB != null ? hH.c(colorStateListB.getDefaultColor()) : yu.h;
                            }
                        } else {
                            jC = yu.h;
                        }
                        int i7 = typedArrayI.getInt(6, -1);
                        zOWb.c(typedArrayI.getChangingConfigurations());
                        if (i7 == -1) {
                            i = 5;
                        } else if (i7 == 3) {
                            i = 3;
                        } else if (i7 == 5) {
                            i = 5;
                        } else if (i7 != 9) {
                            switch (i7) {
                                case 14:
                                    i = 13;
                                    break;
                                case 15:
                                    i = 14;
                                    break;
                                case 16:
                                    i = 12;
                                    break;
                                default:
                                    i = 5;
                                    break;
                            }
                        } else {
                            i = 9;
                        }
                        float f = dimension / resources.getDisplayMetrics().density;
                        float f2 = dimension2 / resources.getDisplayMetrics().density;
                        typedArrayI.recycle();
                        ej1.QnHx qnHx2 = new ej1.QnHx("", f, f2, fA, fA2, jC, i, z);
                        int i8 = 0;
                        while (true) {
                            if (xml.getEventType() == i5 || (xml.getDepth() < i5 && xml.getEventType() == i6)) {
                                g30Var2 = g30Var3;
                                fj1.QnHx qnHx3 = new fj1.QnHx(qnHx2.d(), zOWb.b);
                                fj1Var.a.put(cQf2, new WeakReference<>(qnHx3));
                                qnHx = qnHx3;
                            } else {
                                XmlPullParser xmlPullParser = zOWb.a;
                                int eventType = xmlPullParser.getEventType();
                                if (eventType != 2) {
                                    if (eventType == i6 && ur1.a("group", xmlPullParser.getName())) {
                                        int i9 = i8 + 1;
                                        for (int i10 = 0; i10 < i9; i10++) {
                                            qnHx2.e();
                                        }
                                        i8 = 0;
                                    }
                                    xml.next();
                                    g30Var3 = g30Var3;
                                    i5 = 1;
                                    i6 = 3;
                                } else {
                                    String name = xmlPullParser.getName();
                                    if (name != null) {
                                        int iHashCode = name.hashCode();
                                        if (iHashCode == -1649314686) {
                                            g30Var3 = g30Var3;
                                            if (name.equals("clip-path")) {
                                                TypedArray typedArrayI2 = zb5.i(resources, theme, attributeSetAsAttributeSet, CXJ.d);
                                                zOWb.c(typedArrayI2.getChangingConfigurations());
                                                String strB = zOWb.b(typedArrayI2, 0);
                                                String str = strB == null ? "" : strB;
                                                List<uz2> listA = sg5.a(zOWb.b(typedArrayI2, 1));
                                                typedArrayI2.recycle();
                                                qnHx2.a(str, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, listA);
                                                i8++;
                                            }
                                            xml.next();
                                            g30Var3 = g30Var3;
                                            i5 = 1;
                                            i6 = 3;
                                        } else if (iHashCode != 3433509) {
                                            if (iHashCode == 98629247 && name.equals("group")) {
                                                TypedArray typedArrayI3 = zb5.i(resources, theme, attributeSetAsAttributeSet, CXJ.b);
                                                zOWb.c(typedArrayI3.getChangingConfigurations());
                                                float fA3 = zOWb.a(typedArrayI3, "rotation", 5, 0.0f);
                                                float f3 = typedArrayI3.getFloat(1, 0.0f);
                                                zOWb.c(typedArrayI3.getChangingConfigurations());
                                                float f4 = typedArrayI3.getFloat(2, 0.0f);
                                                zOWb.c(typedArrayI3.getChangingConfigurations());
                                                float fA4 = zOWb.a(typedArrayI3, "scaleX", 3, 1.0f);
                                                float fA5 = zOWb.a(typedArrayI3, "scaleY", 4, 1.0f);
                                                float fA6 = zOWb.a(typedArrayI3, "translateX", 6, 0.0f);
                                                float fA7 = zOWb.a(typedArrayI3, "translateY", 7, 0.0f);
                                                String strB2 = zOWb.b(typedArrayI3, 0);
                                                String str2 = strB2 == null ? "" : strB2;
                                                typedArrayI3.recycle();
                                                int i11 = sg5.a;
                                                qnHx2.a(str2, fA3, f3, f4, fA4, fA5, fA6, fA7, cs0.w);
                                            }
                                        } else if (name.equals("path")) {
                                            TypedArray typedArrayI4 = zb5.i(resources, theme, attributeSetAsAttributeSet, CXJ.c);
                                            zOWb.c(typedArrayI4.getChangingConfigurations());
                                            if (!zb5.h(xmlPullParser, "pathData")) {
                                                throw new IllegalArgumentException("No path data available");
                                            }
                                            String strB3 = zOWb.b(typedArrayI4, 0);
                                            String str3 = strB3 == null ? "" : strB3;
                                            List<uz2> listA2 = sg5.a(zOWb.b(typedArrayI4, 2));
                                            my myVarC = zb5.c(typedArrayI4, xmlPullParser, theme, "fillColor", 1);
                                            zOWb.c(typedArrayI4.getChangingConfigurations());
                                            float fA8 = zOWb.a(typedArrayI4, "fillAlpha", 12, 1.0f);
                                            int iE3 = zb5.e(typedArrayI4, xmlPullParser, "strokeLineCap", 8, -1);
                                            zOWb.c(typedArrayI4.getChangingConfigurations());
                                            if (iE3 != 0) {
                                                if (iE3 == 1) {
                                                    i2 = 1;
                                                } else if (iE3 == 2) {
                                                    i2 = 2;
                                                }
                                                iE = zb5.e(typedArrayI4, xmlPullParser, "strokeLineJoin", 9, -1);
                                                zOWb.c(typedArrayI4.getChangingConfigurations());
                                                if (iE != 0) {
                                                    i3 = 0;
                                                } else if (iE != 1) {
                                                    i3 = 2;
                                                } else {
                                                    i3 = 1;
                                                }
                                                float fA9 = zOWb.a(typedArrayI4, "strokeMiterLimit", 10, 1.0f);
                                                my myVarC2 = zb5.c(typedArrayI4, xmlPullParser, theme, "strokeColor", 3);
                                                zOWb.c(typedArrayI4.getChangingConfigurations());
                                                g30Var3 = g30Var3;
                                                float fA10 = zOWb.a(typedArrayI4, "strokeAlpha", 11, 1.0f);
                                                float fA11 = zOWb.a(typedArrayI4, "strokeWidth", 4, 1.0f);
                                                float fA12 = zOWb.a(typedArrayI4, "trimPathEnd", 6, 1.0f);
                                                float fA13 = zOWb.a(typedArrayI4, "trimPathOffset", 7, 0.0f);
                                                float fA14 = zOWb.a(typedArrayI4, "trimPathStart", 5, 0.0f);
                                                iE2 = zb5.e(typedArrayI4, xmlPullParser, "fillType", 13, 0);
                                                zOWb.c(typedArrayI4.getChangingConfigurations());
                                                typedArrayI4.recycle();
                                                cg cgVarA = tt0.a(myVarC);
                                                cg cgVarA2 = tt0.a(myVarC2);
                                                if (iE2 == 0) {
                                                    i4 = 0;
                                                } else {
                                                    i4 = 1;
                                                }
                                                qnHx2.b(fA8, fA10, fA11, fA9, fA14, fA12, fA13, i4, i2, i3, cgVarA, cgVarA2, str3, listA2);
                                            }
                                            i2 = 0;
                                            iE = zb5.e(typedArrayI4, xmlPullParser, "strokeLineJoin", 9, -1);
                                            zOWb.c(typedArrayI4.getChangingConfigurations());
                                            if (iE != 0) {
                                                i3 = 0;
                                            } else if (iE != 1) {
                                                i3 = 2;
                                            } else {
                                                i3 = 1;
                                            }
                                            float fA15 = zOWb.a(typedArrayI4, "strokeMiterLimit", 10, 1.0f);
                                            my myVarC3 = zb5.c(typedArrayI4, xmlPullParser, theme, "strokeColor", 3);
                                            zOWb.c(typedArrayI4.getChangingConfigurations());
                                            g30Var3 = g30Var3;
                                            float fA16 = zOWb.a(typedArrayI4, "strokeAlpha", 11, 1.0f);
                                            float fA17 = zOWb.a(typedArrayI4, "strokeWidth", 4, 1.0f);
                                            float fA18 = zOWb.a(typedArrayI4, "trimPathEnd", 6, 1.0f);
                                            float fA19 = zOWb.a(typedArrayI4, "trimPathOffset", 7, 0.0f);
                                            float fA110 = zOWb.a(typedArrayI4, "trimPathStart", 5, 0.0f);
                                            iE2 = zb5.e(typedArrayI4, xmlPullParser, "fillType", 13, 0);
                                            zOWb.c(typedArrayI4.getChangingConfigurations());
                                            typedArrayI4.recycle();
                                            cg cgVarA3 = tt0.a(myVarC);
                                            cg cgVarA4 = tt0.a(myVarC3);
                                            if (iE2 == 0) {
                                                i4 = 0;
                                            } else {
                                                i4 = 1;
                                            }
                                            qnHx2.b(fA8, fA16, fA17, fA15, fA110, fA18, fA19, i4, i2, i3, cgVarA3, cgVarA4, str3, listA2);
                                        }
                                        xml.next();
                                        g30Var3 = g30Var3;
                                        i5 = 1;
                                        i6 = 3;
                                    }
                                }
                                xml.next();
                                g30Var3 = g30Var3;
                                i5 = 1;
                                i6 = 3;
                            }
                        }
                    } else {
                        g30Var2 = g30Var3;
                    }
                    g30Var2.G();
                    g30Var3 = g30Var2;
                    xaVar = xg5.b(qnHx.a, g30Var3);
                    g30Var3.G();
                } else {
                    g30Var3.e(-738265196);
                    Integer numValueOf = Integer.valueOf(R.drawable.google_play);
                    g30Var3.e(511388516);
                    boolean zI = g30Var3.I(numValueOf) | g30Var3.I(charSequence);
                    Object objF2 = g30Var3.f();
                    if (zI || objF2 == c0132QnHx) {
                        try {
                            Drawable drawable = resources.getDrawable(R.drawable.google_play, null);
                            if (drawable == null) {
                                throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                            }
                            objF2 = new ge(((BitmapDrawable) drawable).getBitmap());
                            g30Var3.B(objF2);
                        } catch (Throwable unused) {
                            throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG");
                        }
                    }
                    g30Var3.G();
                    xaVar = new xa((bj1) objF2);
                    g30Var3.G();
                }
                g30Var3.G();
                rh1.b(xaVar, null, null, 0L, g30Var3, 56, 12);
                e40.CQf cQf3 = e40.a;
            }
            return sd5.a;
        }
    }

    public static final class PRnFixed extends cx1 implements x81<g30, Integer, sd5> {
        public static final PRnFixed w = new PRnFixed();

        public PRnFixed() {
            super(2);
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                rh1.a(Th.k(), null, null, 0L, g30Var2, 48, 12);
            }
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(2);
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                ej1 ej1VarD = qLd.z;
                if (ej1VarD == null) {
                    ej1.QnHx qnHx = new ej1.QnHx("Outlined.Link");
                    int i = sg5.a;
                    jq4 jq4Var = new jq4(yu.b);
                    le3 le3Var = new le3();
                    le3Var.i(17.0f, 7.0f);
                    le3Var.f(-4.0f);
                    le3Var.n(2.0f);
                    le3Var.f(4.0f);
                    le3Var.d(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f);
                    le3Var.k(-1.35f, 3.0f, -3.0f, 3.0f);
                    le3Var.f(-4.0f);
                    le3Var.n(2.0f);
                    le3Var.f(4.0f);
                    le3Var.d(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
                    le3Var.k(-2.24f, -5.0f, -5.0f, -5.0f);
                    le3Var.b();
                    le3Var.i(11.0f, 15.0f);
                    le3Var.g(7.0f, 15.0f);
                    le3Var.d(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f);
                    le3Var.k(1.35f, -3.0f, 3.0f, -3.0f);
                    le3Var.f(4.0f);
                    le3Var.g(11.0f, 7.0f);
                    le3Var.g(7.0f, 7.0f);
                    le3Var.d(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
                    le3Var.k(2.24f, 5.0f, 5.0f, 5.0f);
                    le3Var.f(4.0f);
                    le3Var.n(-2.0f);
                    le3Var.b();
                    le3Var.i(8.0f, 11.0f);
                    le3Var.f(8.0f);
                    le3Var.n(2.0f);
                    le3Var.g(8.0f, 13.0f);
                    le3Var.b();
                    qnHx.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var, null, "", le3Var.a);
                    ej1VarD = qnHx.d();
                    qLd.z = ej1VarD;
                }
                rh1.a(ej1VarD, null, null, 0L, g30Var2, 48, 12);
            }
            return sd5.a;
        }
    }

    public static final class RBi extends cx1 implements x81<g30, Integer, sd5> {
        public static final RBi w = new RBi();

        public RBi() {
            super(2);
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                ci4.h(g30Var2, 0);
            }
            return sd5.a;
        }
    }

    public static final class SjP extends cx1 implements x81<g30, Integer, sd5> {
        public static final SjP w = new SjP();

        public SjP() {
            super(2);
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                ej1 ej1VarD = fTO$.B;
                if (ej1VarD == null) {
                    ej1.QnHx qnHx = new ej1.QnHx("Outlined.Usb");
                    int i = sg5.a;
                    jq4 jq4Var = new jq4(yu.b);
                    le3 le3Var = new le3();
                    le3Var.i(15.0f, 7.0f);
                    le3Var.n(4.0f);
                    le3Var.f(1.0f);
                    le3Var.n(2.0f);
                    le3Var.f(-3.0f);
                    le3Var.m(5.0f);
                    le3Var.f(2.0f);
                    le3Var.h(-3.0f, -4.0f);
                    le3Var.h(-3.0f, 4.0f);
                    le3Var.f(2.0f);
                    le3Var.n(8.0f);
                    le3Var.e(8.0f);
                    le3Var.n(-2.07f);
                    le3Var.d(0.7f, -0.37f, 1.2f, -1.08f, 1.2f, -1.93f);
                    le3Var.d(0.0f, -1.21f, -0.99f, -2.2f, -2.2f, -2.2f);
                    le3Var.j(4.8f, 7.79f, 4.8f, 9.0f);
                    le3Var.d(0.0f, 0.85f, 0.5f, 1.56f, 1.2f, 1.93f);
                    le3Var.m(13.0f);
                    le3Var.d(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
                    le3Var.f(3.0f);
                    le3Var.n(3.05f);
                    le3Var.d(-0.71f, 0.37f, -1.2f, 1.1f, -1.2f, 1.95f);
                    le3Var.d(0.0f, 1.22f, 0.99f, 2.2f, 2.2f, 2.2f);
                    le3Var.k(2.2f, -0.98f, 2.2f, -2.2f);
                    le3Var.d(0.0f, -0.85f, -0.49f, -1.58f, -1.2f, -1.95f);
                    le3Var.m(15.0f);
                    le3Var.f(3.0f);
                    le3Var.d(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
                    le3Var.n(-2.0f);
                    le3Var.f(1.0f);
                    le3Var.m(7.0f);
                    le3Var.f(-4.0f);
                    le3Var.b();
                    qnHx.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var, null, "", le3Var.a);
                    ej1VarD = qnHx.d();
                    fTO$.B = ej1VarD;
                }
                rh1.a(ej1VarD, null, null, 0L, g30Var2, 48, 12);
            }
            return sd5.a;
        }
    }

    public static final class T23 extends cx1 implements x81<g30, Integer, sd5> {
        public static final T23 w = new T23();

        public T23() {
            super(2);
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                ci4.h(g30Var2, 0);
            }
            return sd5.a;
        }
    }

    public static final class Xn1 extends cx1 implements x81<g30, Integer, sd5> {
        public static final Xn1 w = new Xn1();

        public Xn1() {
            super(2);
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                ci4.h(g30Var2, 0);
            }
            return sd5.a;
        }
    }

    public static final class YKK extends cx1 implements x81<g30, Integer, sd5> {
        public static final YKK w = new YKK();

        public YKK() {
            super(2);
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                ci4.h(g30Var2, 0);
            }
            return sd5.a;
        }
    }

    public static final class auxFixed extends cx1 implements x81<g30, Integer, sd5> {
        public static final auxFixed w = new auxFixed();

        public auxFixed() {
            super(2);
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                ej1 ej1VarD = X.w;
                if (ej1VarD == null) {
                    ej1.QnHx qnHx = new ej1.QnHx("Outlined.Translate");
                    int i = sg5.a;
                    jq4 jq4Var = new jq4(yu.b);
                    le3 le3Var = new le3();
                    le3Var.i(12.87f, 15.07f);
                    le3Var.h(-2.54f, -2.51f);
                    le3Var.h(0.03f, -0.03f);
                    le3Var.d(1.74f, -1.94f, 2.98f, -4.17f, 3.71f, -6.53f);
                    le3Var.g(17.0f, 6.0f);
                    le3Var.g(17.0f, 4.0f);
                    le3Var.f(-7.0f);
                    le3Var.g(10.0f, 2.0f);
                    le3Var.g(8.0f, 2.0f);
                    le3Var.n(2.0f);
                    le3Var.g(1.0f, 4.0f);
                    le3Var.n(1.99f);
                    le3Var.f(11.17f);
                    le3Var.c(11.5f, 7.92f, 10.44f, 9.75f, 9.0f, 11.35f);
                    le3Var.c(8.07f, 10.32f, 7.3f, 9.19f, 6.69f, 8.0f);
                    le3Var.f(-2.0f);
                    le3Var.d(0.73f, 1.63f, 1.73f, 3.17f, 2.98f, 4.56f);
                    le3Var.h(-5.09f, 5.02f);
                    le3Var.g(4.0f, 19.0f);
                    le3Var.h(5.0f, -5.0f);
                    le3Var.h(3.11f, 3.11f);
                    le3Var.h(0.76f, -2.04f);
                    le3Var.b();
                    le3Var.i(18.5f, 10.0f);
                    le3Var.f(-2.0f);
                    le3Var.g(12.0f, 22.0f);
                    le3Var.f(2.0f);
                    le3Var.h(1.12f, -3.0f);
                    le3Var.f(4.75f);
                    le3Var.g(21.0f, 22.0f);
                    le3Var.f(2.0f);
                    le3Var.h(-4.5f, -12.0f);
                    le3Var.b();
                    le3Var.i(15.88f, 17.0f);
                    le3Var.h(1.62f, -4.33f);
                    le3Var.g(19.12f, 17.0f);
                    le3Var.f(-3.24f);
                    le3Var.b();
                    qnHx.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var, null, "", le3Var.a);
                    ej1VarD = qnHx.d();
                    X.w = ej1VarD;
                }
                rh1.a(ej1VarD, null, null, 0L, g30Var2, 48, 12);
            }
            return sd5.a;
        }
    }

    public static final class byN extends cx1 implements x81<g30, Integer, sd5> {
        public static final byN w = new byN();

        public byN() {
            super(2);
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                ej1 ej1VarD = g7.w;
                if (ej1VarD == null) {
                    ej1.QnHx qnHx = new ej1.QnHx("Outlined.Engineering");
                    int i = sg5.a;
                    long j = yu.b;
                    jq4 jq4Var = new jq4(j);
                    le3 le3Var = new le3();
                    le3Var.i(9.0f, 15.0f);
                    le3Var.d(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
                    le3Var.n(2.0f);
                    le3Var.f(16.0f);
                    le3Var.n(-2.0f);
                    le3Var.c(17.0f, 16.34f, 11.67f, 15.0f, 9.0f, 15.0f);
                    le3Var.b();
                    le3Var.i(3.0f, 19.0f);
                    le3Var.d(0.22f, -0.72f, 3.31f, -2.0f, 6.0f, -2.0f);
                    le3Var.d(2.7f, 0.0f, 5.8f, 1.29f, 6.0f, 2.0f);
                    le3Var.e(3.0f);
                    le3Var.b();
                    qnHx.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var, null, "", le3Var.a);
                    jq4 jq4Var2 = new jq4(j);
                    le3 le3Var2 = new le3();
                    le3Var2.i(4.74f, 9.0f);
                    le3Var2.e(5.0f);
                    le3Var2.d(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
                    le3Var2.k(4.0f, -1.79f, 4.0f, -4.0f);
                    le3Var2.f(0.26f);
                    le3Var2.d(0.27f, 0.0f, 0.49f, -0.22f, 0.49f, -0.49f);
                    le3Var2.m(8.49f);
                    le3Var2.d(0.0f, -0.27f, -0.22f, -0.49f, -0.49f, -0.49f);
                    le3Var2.e(13.0f);
                    le3Var2.d(0.0f, -1.48f, -0.81f, -2.75f, -2.0f, -3.45f);
                    le3Var2.m(5.5f);
                    le3Var2.c(11.0f, 5.78f, 10.78f, 6.0f, 10.5f, 6.0f);
                    le3Var2.j(10.0f, 5.78f, 10.0f, 5.5f);
                    le3Var2.m(4.14f);
                    le3Var2.c(9.68f, 4.06f, 9.35f, 4.0f, 9.0f, 4.0f);
                    le3Var2.j(8.32f, 4.06f, 8.0f, 4.14f);
                    le3Var2.m(5.5f);
                    le3Var2.c(8.0f, 5.78f, 7.78f, 6.0f, 7.5f, 6.0f);
                    le3Var2.j(7.0f, 5.78f, 7.0f, 5.5f);
                    le3Var2.m(4.55f);
                    le3Var2.c(5.81f, 5.25f, 5.0f, 6.52f, 5.0f, 8.0f);
                    le3Var2.e(4.74f);
                    le3Var2.c(4.47f, 8.0f, 4.25f, 8.22f, 4.25f, 8.49f);
                    le3Var2.n(0.03f);
                    le3Var2.c(4.25f, 8.78f, 4.47f, 9.0f, 4.74f, 9.0f);
                    le3Var2.b();
                    le3Var2.i(11.0f, 9.0f);
                    le3Var2.d(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
                    le3Var2.k(-2.0f, -0.9f, -2.0f, -2.0f);
                    le3Var2.e(11.0f);
                    le3Var2.b();
                    qnHx.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var2, null, "", le3Var2.a);
                    jq4 jq4Var3 = new jq4(j);
                    le3 le3Var3 = new le3();
                    le3Var3.i(21.98f, 6.23f);
                    le3Var3.h(0.93f, -0.83f);
                    le3Var3.h(-0.75f, -1.3f);
                    le3Var3.h(-1.19f, 0.39f);
                    le3Var3.d(-0.14f, -0.11f, -0.3f, -0.2f, -0.47f, -0.27f);
                    le3Var3.g(20.25f, 3.0f);
                    le3Var3.f(-1.5f);
                    le3Var3.g(18.5f, 4.22f);
                    le3Var3.d(-0.17f, 0.07f, -0.33f, 0.16f, -0.48f, 0.27f);
                    le3Var3.g(16.84f, 4.1f);
                    le3Var3.h(-0.75f, 1.3f);
                    le3Var3.h(0.93f, 0.83f);
                    le3Var3.c(17.0f, 6.4f, 17.0f, 6.58f, 17.02f, 6.75f);
                    le3Var3.g(16.09f, 7.6f);
                    le3Var3.h(0.75f, 1.3f);
                    le3Var3.h(1.2f, -0.38f);
                    le3Var3.d(0.13f, 0.1f, 0.28f, 0.18f, 0.43f, 0.25f);
                    le3Var3.g(18.75f, 10.0f);
                    le3Var3.f(1.5f);
                    le3Var3.h(0.27f, -1.22f);
                    le3Var3.d(0.16f, -0.07f, 0.3f, -0.15f, 0.44f, -0.25f);
                    le3Var3.h(1.19f, 0.38f);
                    le3Var3.h(0.75f, -1.3f);
                    le3Var3.h(-0.93f, -0.85f);
                    le3Var3.c(22.0f, 6.57f, 21.99f, 6.4f, 21.98f, 6.23f);
                    le3Var3.b();
                    le3Var3.i(19.5f, 7.75f);
                    le3Var3.d(-0.69f, 0.0f, -1.25f, -0.56f, -1.25f, -1.25f);
                    le3Var3.k(0.56f, -1.25f, 1.25f, -1.25f);
                    le3Var3.k(1.25f, 0.56f, 1.25f, 1.25f);
                    le3Var3.j(20.19f, 7.75f, 19.5f, 7.75f);
                    le3Var3.b();
                    qnHx.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var3, null, "", le3Var3.a);
                    jq4 jq4Var4 = new jq4(j);
                    le3 le3Var4 = new le3();
                    le3Var4.i(19.4f, 10.79f);
                    le3Var4.h(-0.85f, 0.28f);
                    le3Var4.d(-0.1f, -0.08f, -0.21f, -0.14f, -0.33f, -0.19f);
                    le3Var4.g(18.04f, 10.0f);
                    le3Var4.f(-1.07f);
                    le3Var4.h(-0.18f, 0.87f);
                    le3Var4.d(-0.12f, 0.05f, -0.24f, 0.12f, -0.34f, 0.19f);
                    le3Var4.h(-0.84f, -0.28f);
                    le3Var4.h(-0.54f, 0.93f);
                    le3Var4.h(0.66f, 0.59f);
                    le3Var4.d(-0.01f, 0.13f, -0.01f, 0.25f, 0.0f, 0.37f);
                    le3Var4.h(-0.66f, 0.61f);
                    le3Var4.h(0.54f, 0.93f);
                    le3Var4.h(0.86f, -0.27f);
                    le3Var4.d(0.1f, 0.07f, 0.2f, 0.13f, 0.31f, 0.18f);
                    le3Var4.g(16.96f, 15.0f);
                    le3Var4.f(1.07f);
                    le3Var4.h(0.19f, -0.87f);
                    le3Var4.d(0.11f, -0.05f, 0.22f, -0.11f, 0.32f, -0.18f);
                    le3Var4.h(0.85f, 0.27f);
                    le3Var4.h(0.54f, -0.93f);
                    le3Var4.h(-0.66f, -0.61f);
                    le3Var4.d(0.01f, -0.13f, 0.01f, -0.25f, 0.0f, -0.37f);
                    le3Var4.h(0.66f, -0.59f);
                    le3Var4.g(19.4f, 10.79f);
                    le3Var4.b();
                    le3Var4.i(17.5f, 13.39f);
                    le3Var4.d(-0.49f, 0.0f, -0.89f, -0.4f, -0.89f, -0.89f);
                    le3Var4.d(0.0f, -0.49f, 0.4f, -0.89f, 0.89f, -0.89f);
                    le3Var4.k(0.89f, 0.4f, 0.89f, 0.89f);
                    le3Var4.c(18.39f, 12.99f, 17.99f, 13.39f, 17.5f, 13.39f);
                    le3Var4.b();
                    qnHx.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var4, null, "", le3Var4.a);
                    ej1VarD = qnHx.d();
                    g7.w = ej1VarD;
                }
                rh1.a(ej1VarD, null, null, 0L, g30Var2, 48, 12);
            }
            return sd5.a;
        }
    }

    public static final class ck32 extends cx1 implements x81<g30, Integer, sd5> {
        public static final ck32 w = new ck32();

        public ck32() {
            super(2);
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                ci4.h(g30Var2, 0);
            }
            return sd5.a;
        }
    }

    public static final class lPt3Fixed extends cx1 implements x81<g30, Integer, sd5> {
        public static final lPt3Fixed w = new lPt3Fixed();

        public lPt3Fixed() {
            super(2);
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                ej1 ej1VarD = defpackage.YKK.D;
                if (ej1VarD == null) {
                    ej1.QnHx qnHx = new ej1.QnHx("Outlined.Email");
                    int i = sg5.a;
                    jq4 jq4Var = new jq4(yu.b);
                    le3 le3Var = new le3();
                    le3Var.i(22.0f, 6.0f);
                    le3Var.d(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                    le3Var.g(4.0f, 4.0f);
                    le3Var.d(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                    le3Var.n(12.0f);
                    le3Var.d(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                    le3Var.f(16.0f);
                    le3Var.d(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                    le3Var.g(22.0f, 6.0f);
                    le3Var.b();
                    le3Var.i(20.0f, 6.0f);
                    le3Var.h(-8.0f, 5.0f);
                    le3Var.h(-8.0f, -5.0f);
                    le3Var.f(16.0f);
                    le3Var.b();
                    le3Var.i(20.0f, 18.0f);
                    le3Var.g(4.0f, 18.0f);
                    le3Var.g(4.0f, 8.0f);
                    le3Var.h(8.0f, 5.0f);
                    le3Var.h(8.0f, -5.0f);
                    le3Var.n(10.0f);
                    le3Var.b();
                    qnHx.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var, null, "", le3Var.a);
                    ej1VarD = qnHx.d();
                    defpackage.YKK.D = ej1VarD;
                }
                rh1.a(ej1VarD, null, null, 0L, g30Var2, 48, 12);
            }
            return sd5.a;
        }
    }

    public static final class ta extends cx1 implements x81<g30, Integer, sd5> {
        public static final ta w = new ta();

        public ta() {
            super(2);
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                ej1 ej1VarD = eu.A;
                if (ej1VarD == null) {
                    ej1.QnHx qnHx = new ej1.QnHx("Outlined.QuestionAnswer");
                    int i = sg5.a;
                    jq4 jq4Var = new jq4(yu.b);
                    le3 le3Var = new le3();
                    le3Var.i(15.0f, 4.0f);
                    le3Var.n(7.0f);
                    le3Var.g(5.17f, 11.0f);
                    le3Var.h(-0.59f, 0.59f);
                    le3Var.h(-0.58f, 0.58f);
                    le3Var.g(4.0f, 4.0f);
                    le3Var.f(11.0f);
                    uz2.RBi rBi = new uz2.RBi(1.0f, -2.0f);
                    List list = le3Var.a;
                    list.add(rBi);
                    le3Var.g(3.0f, 2.0f);
                    le3Var.d(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
                    le3Var.n(14.0f);
                    le3Var.h(4.0f, -4.0f);
                    le3Var.f(10.0f);
                    le3Var.d(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
                    le3Var.g(17.0f, 3.0f);
                    le3Var.d(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
                    le3Var.b();
                    le3Var.i(21.0f, 6.0f);
                    le3Var.f(-2.0f);
                    le3Var.n(9.0f);
                    le3Var.g(6.0f, 15.0f);
                    le3Var.n(2.0f);
                    le3Var.d(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
                    le3Var.f(11.0f);
                    le3Var.h(4.0f, 4.0f);
                    le3Var.g(22.0f, 7.0f);
                    le3Var.d(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
                    le3Var.b();
                    qnHx.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var, null, "", list);
                    ej1VarD = qnHx.d();
                    eu.A = ej1VarD;
                }
                rh1.a(ej1VarD, null, null, 0L, g30Var2, 48, 12);
            }
            return sd5.a;
        }
    }

    public static final class y extends cx1 implements x81<g30, Integer, sd5> {
        public static final y w = new y();

        public y() {
            super(2);
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                ej1 ej1VarD = FWT.A;
                if (ej1VarD == null) {
                    ej1.QnHx qnHx = new ej1.QnHx("Outlined.Verified");
                    int i = sg5.a;
                    long j = yu.b;
                    jq4 jq4Var = new jq4(j);
                    le3 le3Var = new le3();
                    le3Var.i(23.0f, 11.99f);
                    le3Var.h(-2.44f, -2.79f);
                    le3Var.h(0.34f, -3.69f);
                    le3Var.h(-3.61f, -0.82f);
                    le3Var.g(15.4f, 1.5f);
                    le3Var.g(12.0f, 2.96f);
                    le3Var.g(8.6f, 1.5f);
                    le3Var.g(6.71f, 4.69f);
                    le3Var.g(3.1f, 5.5f);
                    le3Var.g(3.44f, 9.2f);
                    le3Var.g(1.0f, 11.99f);
                    le3Var.h(2.44f, 2.79f);
                    le3Var.h(-0.34f, 3.7f);
                    le3Var.h(3.61f, 0.82f);
                    le3Var.g(8.6f, 22.5f);
                    le3Var.h(3.4f, -1.47f);
                    le3Var.h(3.4f, 1.46f);
                    le3Var.h(1.89f, -3.19f);
                    le3Var.h(3.61f, -0.82f);
                    le3Var.h(-0.34f, -3.69f);
                    le3Var.g(23.0f, 11.99f);
                    le3Var.b();
                    le3Var.i(19.05f, 13.47f);
                    le3Var.h(-0.56f, 0.65f);
                    le3Var.h(0.08f, 0.85f);
                    le3Var.h(0.18f, 1.95f);
                    le3Var.h(-1.9f, 0.43f);
                    le3Var.h(-0.84f, 0.19f);
                    le3Var.h(-0.44f, 0.74f);
                    le3Var.h(-0.99f, 1.68f);
                    le3Var.h(-1.78f, -0.77f);
                    le3Var.g(12.0f, 18.85f);
                    le3Var.h(-0.79f, 0.34f);
                    le3Var.h(-1.78f, 0.77f);
                    le3Var.h(-0.99f, -1.67f);
                    le3Var.h(-0.44f, -0.74f);
                    le3Var.h(-0.84f, -0.19f);
                    le3Var.h(-1.9f, -0.43f);
                    le3Var.h(0.18f, -1.96f);
                    le3Var.h(0.08f, -0.85f);
                    le3Var.h(-0.56f, -0.65f);
                    le3Var.h(-1.29f, -1.47f);
                    le3Var.h(1.29f, -1.48f);
                    le3Var.h(0.56f, -0.65f);
                    le3Var.g(5.43f, 9.01f);
                    le3Var.g(5.25f, 7.07f);
                    le3Var.h(1.9f, -0.43f);
                    le3Var.h(0.84f, -0.19f);
                    le3Var.h(0.44f, -0.74f);
                    le3Var.h(0.99f, -1.68f);
                    le3Var.h(1.78f, 0.77f);
                    le3Var.g(12.0f, 5.14f);
                    le3Var.h(0.79f, -0.34f);
                    le3Var.h(1.78f, -0.77f);
                    le3Var.h(0.99f, 1.68f);
                    le3Var.h(0.44f, 0.74f);
                    le3Var.h(0.84f, 0.19f);
                    le3Var.h(1.9f, 0.43f);
                    le3Var.h(-0.18f, 1.95f);
                    le3Var.h(-0.08f, 0.85f);
                    le3Var.h(0.56f, 0.65f);
                    le3Var.h(1.29f, 1.47f);
                    le3Var.g(19.05f, 13.47f);
                    le3Var.b();
                    qnHx.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var, null, "", le3Var.a);
                    jq4 jq4Var2 = new jq4(j);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new uz2.YKK(10.09f, 13.75f));
                    arrayList.add(new uz2.y(-2.32f, -2.33f));
                    arrayList.add(new uz2.y(-1.48f, 1.49f));
                    arrayList.add(new uz2.y(3.8f, 3.81f));
                    arrayList.add(new uz2.y(7.34f, -7.36f));
                    arrayList.add(new uz2.y(-1.48f, -1.49f));
                    arrayList.add(uz2.CQf.c);
                    qnHx.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var2, null, "", arrayList);
                    ej1VarD = qnHx.d();
                    FWT.A = ej1VarD;
                }
                rh1.a(ej1VarD, null, null, 0L, g30Var2, 48, 12);
            }
            return sd5.a;
        }
    }
}
