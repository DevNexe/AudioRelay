package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class fi {

    public static final class CQf extends cx1 implements j81<zl0, yl0> {
        public final /* synthetic */ wz4 w;
        public final /* synthetic */ boolean x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(Nam1 nam1, boolean z) {
            super(1);
            this.w = nam1;
            this.x = z;
        }

        @Override // defpackage.j81
        public final yl0 invoke(zl0 zl0Var) {
            long j = this.x ? Zr_O.a : Zr_O.k;
            this.w.a(j, hH.s(j) > 0.5f, xz4.b);
            return new wQLN();
        }
    }

    public static final class F1 extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ boolean w;
        public final /* synthetic */ int x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(boolean z, int i) {
            super(2);
            this.w = z;
            this.x = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.x | 1;
            fi.b(this.w, g30Var, i);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ boolean w;
        public final /* synthetic */ x81<g30, Integer, sd5> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(boolean z, x81<? super g30, ? super Integer, sd5> x81Var, int i) {
            super(2);
            this.w = z;
            this.x = x81Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            fi.a(this.w, this.x, g30Var, i);
            return sd5.a;
        }
    }

    public static final void a(boolean z, x81<? super g30, ? super Integer, sd5> x81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(-1893306651);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.c(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(x81Var) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            int i3 = i2 & 14;
            b(z, j30VarQ, i3);
            o65.a(z, x81Var, j30VarQ, (i2 & 112) | i3);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new QnHx(z, x81Var, i);
    }

    public static final void b(boolean z, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(-1836913325);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.c(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            xz4.QnHx qnHx = xz4.b;
            j30VarQ.e(-715745933);
            j30VarQ.e(1009281237);
            jt4 jt4Var = Ll.f;
            ViewParent parent = ((View) j30VarQ.E(jt4Var)).getParent();
            Window window = null;
            xk0 xk0Var = parent instanceof xk0 ? (xk0) parent : null;
            Window window2 = xk0Var != null ? xk0Var.getWindow() : null;
            if (window2 == null) {
                Context context = ((View) j30VarQ.E(jt4Var)).getContext();
                while (true) {
                    if (!(context instanceof Activity)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        window = ((Activity) context).getWindow();
                        break;
                    }
                }
                window2 = window;
            }
            e40.CQf cQf2 = e40.a;
            j30VarQ.R(false);
            View view = (View) j30VarQ.E(Ll.f);
            j30VarQ.e(511388516);
            boolean zI = j30VarQ.I(view) | j30VarQ.I(window2);
            Object objB0 = j30VarQ.b0();
            g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
            if (zI || objB0 == c0132QnHx) {
                objB0 = new Nam1(view, window2);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            Nam1 nam1 = (Nam1) objB0;
            j30VarQ.R(false);
            Boolean boolValueOf = Boolean.valueOf(z);
            Boolean boolValueOf2 = Boolean.valueOf(z);
            j30VarQ.e(511388516);
            boolean zI2 = j30VarQ.I(boolValueOf2) | j30VarQ.I(nam1);
            Object objB1 = j30VarQ.b0();
            if (zI2 || objB1 == c0132QnHx) {
                objB1 = new CQf(nam1, z);
                j30VarQ.F0(objB1);
            }
            j30VarQ.R(false);
            wq0.b(nam1, boolValueOf, (j81) objB1, j30VarQ);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new F1(z, i);
    }
}
