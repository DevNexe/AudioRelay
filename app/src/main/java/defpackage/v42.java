package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class v42 {
    public static final lq0 a = q40.b(QnHx.w);

    public static final class QnHx extends cx1 implements h81<iu2> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(0);
        }

        @Override // defpackage.h81
        public final /* bridge */ /* synthetic */ iu2 invoke() {
            return null;
        }
    }

    public static iu2 a(g30 g30Var) {
        g30Var.e(-2068013981);
        iu2 iu2Var = (iu2) g30Var.E(a);
        g30Var.e(1680121597);
        Context context = null;
        if (iu2Var == null) {
            jx0.QnHx qnHx = new jx0.QnHx(new jx0(new q95(ba4.G0((View) g30Var.E(Ll.f), rj5.w), sj5.w), false, ja4.w));
            iu2Var = (iu2) (!qnHx.hasNext() ? null : qnHx.next());
        }
        g30Var.G();
        if (iu2Var == null) {
            for (Context baseContext = (Context) g30Var.E(Ll.b); baseContext instanceof ContextWrapper; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
                if (baseContext instanceof iu2) {
                    context = baseContext;
                    break;
                }
            }
            iu2Var = (iu2) context;
        }
        g30Var.G();
        return iu2Var;
    }
}
