package defpackage;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public final class V9Re {

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ pg2 w;
        public final /* synthetic */ int x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(pg2 pg2Var, int i, int i2) {
            super(2);
            this.w = pg2Var;
            this.x = i;
            this.y = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.x | 1;
            int i2 = this.y;
            V9Re.a(this.w, g30Var, i, i2);
            return sd5.a;
        }
    }

    public static final void a(pg2 pg2Var, g30 g30Var, int i, int i2) {
        int i3;
        Object evVar;
        j30 j30VarQ = g30Var.q(137867262);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.I(pg2Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 11) == 2 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            if (i4 != 0) {
                pg2Var = pg2.QnHx.w;
            }
            e40.CQf cQf = e40.a;
            pg2 pg2VarK = fp1.K(pg2Var, mu3.a);
            j30VarQ.e(-1789430982);
            Context context = (Context) j30VarQ.E(Ll.b);
            j30VarQ.e(1157296644);
            boolean zI = j30VarQ.I(context);
            Object objB0 = j30VarQ.b0();
            g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
            if (zI || objB0 == c0132QnHx) {
                objB0 = XTd3.l(context, R.mipmap.ic_launcher_round);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            Drawable drawable = (Drawable) objB0;
            j30VarQ.R(false);
            oz1 oz1Var = ap0.a;
            j30VarQ.e(1756822313);
            j30VarQ.e(1157296644);
            boolean zI2 = j30VarQ.I(drawable);
            Object objB1 = j30VarQ.b0();
            if (zI2 || objB1 == c0132QnHx) {
                if (drawable == null) {
                    evVar = es0.B;
                } else if (drawable instanceof BitmapDrawable) {
                    evVar = new xa(new ge(((BitmapDrawable) drawable).getBitmap()));
                } else {
                    evVar = drawable instanceof ColorDrawable ? new ev(hH.c(((ColorDrawable) drawable).getColor())) : new zo0(drawable.mutate());
                }
                objB1 = evVar;
                j30VarQ.F0(objB1);
            }
            j30VarQ.R(false);
            j30VarQ.R(false);
            cj1.a((sy2) objB1, null, pg2VarK, null, null, 0.0f, null, j30VarQ, 56, 120);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new QnHx(pg2Var, i, i2);
    }
}
