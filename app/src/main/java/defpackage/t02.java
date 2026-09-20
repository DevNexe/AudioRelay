package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class t02 {
    public final yq1<j02> a;
    public final List<Integer> b;
    public final Map<Object, Integer> c;

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ sz1 x;
        public final /* synthetic */ int y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(sz1 sz1Var, int i, int i2) {
            super(2);
            this.x = sz1Var;
            this.y = i;
            this.z = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.z | 1;
            sz1 sz1Var = this.x;
            int i2 = this.y;
            t02.this.a(sz1Var, i2, g30Var, i);
            return sd5.a;
        }
    }

    public t02(ei2 ei2Var, pp1 pp1Var) {
        Map<Object, Integer> map;
        cs0 cs0Var = cs0.w;
        this.a = ei2Var;
        this.b = cs0Var;
        int i = pp1Var.w;
        if (!(i >= 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        int iMin = Math.min(pp1Var.x, ei2Var.b - 1);
        if (iMin < i) {
            map = ds0.w;
        } else {
            HashMap map2 = new HashMap();
            ei2Var.c(i, iMin, new q02(i, iMin, map2));
            map = map2;
        }
        this.c = map;
    }

    public final void a(sz1 sz1Var, int i, g30 g30Var, int i2) {
        j30 j30VarQ = g30Var.q(1922528915);
        yq1.QnHx<j02> qnHx = this.a.get(i);
        qnHx.c.c.I(sz1Var, Integer.valueOf(i - qnHx.a), j30VarQ, Integer.valueOf(i2 & 14));
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new QnHx(sz1Var, i, i2);
    }
}
