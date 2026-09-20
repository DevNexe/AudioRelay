package defpackage;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public final class ew1 {
    public static final CQf a;

    public static final class CQf implements dw1 {
        public final /* synthetic */ dw1 a;

        public CQf(po0 po0Var) {
            this.a = po0Var;
        }

        /* JADX WARN: Code duplicated, block: B:52:0x00bf  */
        @Override // defpackage.dw1
        public final int a(KeyEvent keyEvent) {
            int i;
            if (keyEvent.isShiftPressed() && keyEvent.isCtrlPressed()) {
                long jB = zv1.b(keyEvent);
                if (wv1.a(jB, s92.h)) {
                    i = 35;
                } else if (wv1.a(jB, s92.i)) {
                    i = 36;
                } else if (wv1.a(jB, s92.j)) {
                    i = 38;
                } else if (wv1.a(jB, s92.k)) {
                    i = 37;
                } else {
                    i = 0;
                }
            } else if (keyEvent.isCtrlPressed()) {
                long jB2 = zv1.b(keyEvent);
                if (wv1.a(jB2, s92.h)) {
                    i = 4;
                } else if (wv1.a(jB2, s92.i)) {
                    i = 3;
                } else if (wv1.a(jB2, s92.j)) {
                    i = 6;
                } else if (wv1.a(jB2, s92.k)) {
                    i = 5;
                } else if (wv1.a(jB2, s92.c)) {
                    i = 20;
                } else if (wv1.a(jB2, s92.s)) {
                    i = 23;
                } else if (wv1.a(jB2, s92.r)) {
                    i = 22;
                } else if (wv1.a(jB2, s92.g)) {
                    i = 43;
                } else {
                    i = 0;
                }
            } else if (keyEvent.isShiftPressed()) {
                long jB3 = zv1.b(keyEvent);
                if (wv1.a(jB3, s92.n)) {
                    i = 33;
                } else if (wv1.a(jB3, s92.o)) {
                    i = 34;
                } else {
                    i = 0;
                }
            } else {
                i = 0;
            }
            return i == 0 ? this.a.a(keyEvent) : i;
        }
    }

    public /* synthetic */ class QnHx extends mf3 {
        public static final QnHx D = new QnHx();

        @Override // defpackage.pv1
        public final Object get(Object obj) {
            return Boolean.valueOf(((xv1) obj).a.isCtrlPressed());
        }
    }

    static {
        QnHx qnHx = QnHx.D;
        a = new CQf(new po0());
    }
}
