package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.TypedValue;
import android.widget.TextView;
import com.azefsw.audioconnect.R;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zr1 {

    public static final class CQf extends cx1 implements h81<sd5> {
        public final /* synthetic */ h81<sd5> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(h81<sd5> h81Var) {
            super(0);
            this.w = h81Var;
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            this.w.invoke();
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ h81<sd5> w;
        public final /* synthetic */ int x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(h81<sd5> h81Var, int i) {
            super(2);
            this.w = h81Var;
            this.x = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.x | 1;
            zr1.b(this.w, g30Var, i);
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ h81<sd5> w;
        public final /* synthetic */ int x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LPt8Fixed(h81<sd5> h81Var, int i) {
            super(2);
            this.w = h81Var;
            this.x = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.x | 1;
            zr1.c(this.w, g30Var, i);
            return sd5.a;
        }
    }

    public static final class NUlFixed extends cx1 implements j81<Context, TextView> {
        public final /* synthetic */ String w;
        public final /* synthetic */ long x;
        public final /* synthetic */ float y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NUlFixed(String str, long j, float f) {
            super(1);
            this.w = str;
            this.x = j;
            this.y = f;
        }

        @Override // defpackage.j81
        public final TextView invoke(Context context) {
            TextView textView = new TextView(context);
            textView.setGravity(17);
            int i = Build.VERSION.SDK_INT;
            String str = this.w;
            textView.setText(i >= 24 ? ud1.a(str, 0) : Html.fromHtml(str));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setTextColor(hH.A(this.x));
            textView.setAlpha(this.y);
            return textView;
        }
    }

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(int i) {
            super(2);
            this.w = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            zr1.a(g30Var, this.w | 1);
            return sd5.a;
        }
    }

    public static final class YKK extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public YKK(int i) {
            super(2);
            this.w = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            zr1.d(g30Var, this.w | 1);
            return sd5.a;
        }
    }

    public static final void a(g30 g30Var, int i) {
        Object obj;
        j30 j30VarQ = g30Var.q(-2028764120);
        if (i == 0 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            jt4 jt4Var = Ll.b;
            Resources resources = ((Context) j30VarQ.E(jt4Var)).getResources();
            Resources.Theme theme = ((Context) j30VarQ.E(jt4Var)).getTheme();
            ThreadLocal<TypedValue> threadLocal = sp3.a;
            Drawable drawableA = sp3.QnHx.a(resources, R.mipmap.ic_launcher, theme);
            if (drawableA != null) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawableA.getIntrinsicWidth(), drawableA.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableA.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawableA.draw(canvas);
                ge geVar = new ge(bitmapCreateBitmap);
                float f = 64;
                wo1.QnHx qnHx = wo1.a;
                lm4 lm4Var = new lm4(f, f, f, f, false);
                j30VarQ.e(-1396260732);
                da daVar = One.QnHx.e;
                m80.QnHx.C0166QnHx c0166QnHx = m80.QnHx.a;
                j30VarQ.e(1157296644);
                boolean zI = j30VarQ.I(geVar);
                Object objB0 = j30VarQ.b0();
                if (zI || objB0 == g30.QnHx.a) {
                    obj = objB0;
                    xa xaVar = new xa(geVar, mp1.b, C0239D.e(geVar.getWidth(), geVar.getHeight()));
                    xaVar.E = 1;
                    j30VarQ.F0(xaVar);
                    obj = xaVar;
                }
                obj = objB0;
                j30VarQ.R(false);
                cj1.a((xa) obj, null, lm4Var, daVar, c0166QnHx, 1.0f, null, j30VarQ, 440, 0);
                j30VarQ.R(false);
            }
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new QnHx(i);
    }

    public static final void b(h81<sd5> h81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(-852657057);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(h81Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            j30VarQ.e(1157296644);
            boolean zI = j30VarQ.I(h81Var);
            Object objB0 = j30VarQ.b0();
            if (zI || objB0 == g30.QnHx.a) {
                objB0 = new CQf(h81Var);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            ti.c(3072, 6, j30VarQ, null, (h81) objB0, u00.a, false);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new F1(h81Var, i);
    }

    public static final void c(h81<sd5> h81Var, g30 g30Var, int i) {
        int i2;
        h81<sd5> h81Var2;
        j30 j30VarQ = g30Var.q(-584160473);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(h81Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && j30VarQ.t()) {
            j30VarQ.x();
            h81Var2 = h81Var;
        } else {
            e40.CQf cQf = e40.a;
            pg2.QnHx qnHx = pg2.QnHx.w;
            float f = 48;
            pg2 pg2VarF = gm4.f(ps0.T(qnHx, f));
            da.QnHx qnHx2 = One.QnHx.n;
            j30VarQ.e(-483455358);
            rb2 rb2VarA = tv.a(CZ9P.c, qnHx2, j30VarQ);
            j30VarQ.e(-1323940314);
            ij0 ij0Var = (ij0) j30VarQ.E(r40.e);
            jy1 jy1Var = (jy1) j30VarQ.E(r40.k);
            ti5 ti5Var = (ti5) j30VarQ.E(r40.o);
            a30.e.getClass();
            yy1.QnHx qnHx3 = a30.QnHx.b;
            sz szVarJ = S12N.j(pg2VarF);
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
            hH.u(j30VarQ, rb2VarA, a30.QnHx.e);
            hH.u(j30VarQ, ij0Var, a30.QnHx.d);
            hH.u(j30VarQ, jy1Var, a30.QnHx.f);
            Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, -1163856341);
            zv zvVar = zv.a;
            a(j30VarQ, 0);
            hH.i(gm4.g(qnHx, f), j30VarQ, 6);
            String strX = hH.x(R.string.intro_welcome_audiorelay, j30VarQ);
            jt4 jt4Var = sc5.a;
            j55.b(strX, null, 0L, 0L, null, null, null, 0L, null, new q15(3), 0L, 0, false, 0, null, ((rc5) j30VarQ.E(jt4Var)).d, j30VarQ, 0, 0, 32254);
            float f2 = 24;
            hH.i(gm4.g(qnHx, f2), j30VarQ, 6);
            j55.b(hH.x(R.string.intro_audiorelay_description, j30VarQ), null, 0L, 0L, null, null, null, 0L, null, new q15(3), 0L, 0, false, 0, null, ((rc5) j30VarQ.E(jt4Var)).j, j30VarQ, 0, 0, 32254);
            hH.i(gm4.g(qnHx, f2), j30VarQ, 6);
            d(j30VarQ, 0);
            pq4.d(zvVar, j30VarQ, 6);
            h81Var2 = h81Var;
            b(h81Var2, j30VarQ, i2 & 14);
            pq4.d(zvVar, j30VarQ, 6);
            j30VarQ.R(false);
            j30VarQ.R(false);
            j30VarQ.R(true);
            j30VarQ.R(false);
            j30VarQ.R(false);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new LPt8Fixed(h81Var2, i);
    }

    public static final void d(g30 g30Var, int i) {
        j30 j30VarQ = g30Var.q(-284358384);
        if (i == 0 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            String strX = hH.x(R.string.intro_privacy_policy, j30VarQ);
            j30VarQ.e(1157296644);
            boolean zI = j30VarQ.I(strX);
            Object objB0 = j30VarQ.b0();
            g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
            if (zI || objB0 == c0132QnHx) {
                objB0 = "<a href=\"http://privacy.audiorelay.net\">" + strX + "</a>";
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            String str = (String) objB0;
            String strX2 = hH.x(R.string.intro_privacy, j30VarQ);
            j30VarQ.e(511388516);
            boolean zI2 = j30VarQ.I(strX2) | j30VarQ.I(str);
            Object objB1 = j30VarQ.b0();
            if (zI2 || objB1 == c0132QnHx) {
                objB1 = String.format(strX2, Arrays.copyOf(new Object[]{str}, 1));
                j30VarQ.F0(objB1);
            }
            j30VarQ.R(false);
            String str2 = (String) objB1;
            long j = ((yu) j30VarQ.E(r70.a)).a;
            float fFloatValue = ((Number) j30VarQ.E(p70.a)).floatValue();
            hx0 hx0Var = gm4.a;
            yu yuVar = new yu(j);
            Float fValueOf = Float.valueOf(fFloatValue);
            j30VarQ.e(1618982084);
            boolean zI3 = j30VarQ.I(yuVar) | j30VarQ.I(str2) | j30VarQ.I(fValueOf);
            Object objB2 = j30VarQ.b0();
            if (zI3 || objB2 == c0132QnHx) {
                objB2 = new NUlFixed(str2, j, fFloatValue);
                j30VarQ.F0(objB2);
            }
            j30VarQ.R(false);
            rG.a((j81) objB2, hx0Var, null, j30VarQ, 48, 4);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new YKK(i);
    }
}
