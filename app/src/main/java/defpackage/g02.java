package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class g02 {

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ e02 w;
        public final /* synthetic */ yz1 x;
        public final /* synthetic */ aw4 y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(e02 e02Var, yz1 yz1Var, aw4 aw4Var, int i) {
            super(2);
            this.w = e02Var;
            this.x = yz1Var;
            this.y = aw4Var;
            this.z = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.z | 1;
            yz1 yz1Var = this.x;
            aw4 aw4Var = this.y;
            g02.a(this.w, yz1Var, aw4Var, g30Var, i);
            return sd5.a;
        }
    }

    public static final void a(e02 e02Var, yz1 yz1Var, aw4 aw4Var, g30 g30Var, int i) {
        j30 j30VarQ = g30Var.q(1113453182);
        View view = (View) j30VarQ.E(Ll.f);
        j30VarQ.e(1618982084);
        boolean zI = j30VarQ.I(aw4Var) | j30VarQ.I(e02Var) | j30VarQ.I(view);
        Object objB0 = j30VarQ.b0();
        if (zI || objB0 == g30.QnHx.a) {
            j30VarQ.F0(new f02(e02Var, aw4Var, yz1Var, view));
        }
        j30VarQ.R(false);
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new QnHx(e02Var, yz1Var, aw4Var, i);
    }
}
