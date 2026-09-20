package defpackage;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public final class mw1 {

    public static final class QnHx extends cx1 implements j81<xv1, Boolean> {
        public final /* synthetic */ h81<sd5> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(h81<sd5> h81Var) {
            super(1);
            this.w = h81Var;
        }

        @Override // defpackage.j81
        public final Boolean invoke(xv1 xv1Var) {
            KeyEvent keyEvent = xv1Var.a;
            if (!(zv1.c(keyEvent) == 1)) {
                return Boolean.FALSE;
            }
            if (!wv1.a(zv1.b(keyEvent), wv1.h)) {
                return Boolean.FALSE;
            }
            this.w.invoke();
            return Boolean.TRUE;
        }
    }

    public static final pg2 a(pg2 pg2Var, h81<sd5> h81Var) {
        return w53.a ? cw1.a(pg2Var, new QnHx(h81Var)) : pg2Var;
    }
}
