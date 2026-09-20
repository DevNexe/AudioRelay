package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class ap2 implements c73 {
    public final Context a;
    public final ln2 b;
    public final lKy3 c;
    public final ry4 d = new ry4(new QnHx());

    public static final class QnHx extends cx1 implements h81<ex1> {
        public QnHx() {
            super(0);
        }

        @Override // defpackage.h81
        public final ex1 invoke() {
            return new ex1(new zo2(ap2.this));
        }
    }

    public ap2(Context context, ln2 ln2Var, lKy3 lky3) {
        this.a = context;
        this.b = ln2Var;
        this.c = lky3;
    }

    @Override // defpackage.c73
    public final qw b(e61 e61Var) {
        return new xs2(this.c.h.a(null), new Ot0r(this, 8));
    }
}
