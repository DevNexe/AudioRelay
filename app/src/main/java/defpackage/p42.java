package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p42 {
    public static final jt4 a = new jt4(QnHx.w);

    public static final class CQf extends cx1 implements y81<se, g30, Integer, sd5> {
        public final /* synthetic */ x81<g30, Integer, sd5> w;
        public final /* synthetic */ int x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(int i, x81 x81Var) {
            super(3);
            this.w = x81Var;
            this.x = i;
        }

        @Override // defpackage.y81
        public final sd5 invoke(se seVar, g30 g30Var, Integer num) {
            se seVar2 = seVar;
            g30 g30Var2 = g30Var;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                iIntValue |= g30Var2.I(seVar2) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                ri2<af> ri2Var = ((bf) g30Var2.E(p42.a)).a;
                g30Var2.e(-492369756);
                Object objF = g30Var2.f();
                if (objF == g30.QnHx.a) {
                    objF = oV9.h0(af.values(), new r42());
                    g30Var2.B(objF);
                }
                g30Var2.G();
                List list = (List) objF;
                ij0 ij0Var = (ij0) g30Var2.E(r40.e);
                wq0.e(Integer.valueOf(g70.h(seVar2.a())), ij0Var, new q42(ij0Var, ri2Var, list, seVar2, null), g30Var2);
                this.w.invoke(g30Var2, Integer.valueOf(this.x & 14));
            }
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ x81<g30, Integer, sd5> w;
        public final /* synthetic */ int x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(int i, x81 x81Var) {
            super(2);
            this.w = x81Var;
            this.x = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.x | 1;
            p42.a(this.w, g30Var, i);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements h81<bf> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(0);
        }

        @Override // defpackage.h81
        public final bf invoke() {
            return new bf(null);
        }
    }

    public static final void a(x81<? super g30, ? super Integer, sd5> x81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(-1923291536);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(x81Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            ne.a(null, null, false, X.m(j30VarQ, 1477540038, new CQf(i2, x81Var)), j30VarQ, 3072, 7);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new F1(i, x81Var);
    }
}
