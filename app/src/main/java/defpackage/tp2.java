package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class tp2 {
    public final Context a;
    public final ln2 b;
    public final X1GO c;
    public final ry4 d = new ry4(new QnHx());

    public static final class QnHx extends cx1 implements h81<BroadcastReceiver> {
        public QnHx() {
            super(0);
        }

        @Override // defpackage.h81
        public final BroadcastReceiver invoke() {
            tp2 tp2Var = tp2.this;
            tp2Var.getClass();
            return new ex1(new sp2(tp2Var));
        }
    }

    public tp2(Context context, ln2 ln2Var, X1GO x1go) {
        this.a = context;
        this.b = ln2Var;
        this.c = x1go;
    }
}
