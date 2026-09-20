package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rm4 extends wy1 {
    public final t95<ts0>.QnHx<mp1, Bd_> w;
    public final is4<pm4> x;
    public final is4<pm4> y;
    public final CQf z = new CQf();

    public static final class CQf extends cx1 implements j81<t95.CQf<ts0>, lx0<mp1>> {
        public CQf() {
            super(1);
        }

        @Override // defpackage.j81
        public final lx0<mp1> invoke(t95.CQf<ts0> cQf) {
            lx0<mp1> lx0Var;
            lx0<mp1> lx0Var2;
            t95.CQf<ts0> cQf2 = cQf;
            ts0 ts0Var = ts0.PreEnter;
            ts0 ts0Var2 = ts0.Visible;
            boolean zB = cQf2.b(ts0Var, ts0Var2);
            rm4 rm4Var = rm4.this;
            if (zB) {
                pm4 value = rm4Var.x.getValue();
                return (value == null || (lx0Var2 = value.b) == null) ? us0.d : lx0Var2;
            }
            if (!cQf2.b(ts0Var2, ts0.PostExit)) {
                return us0.d;
            }
            pm4 value2 = rm4Var.y.getValue();
            return (value2 == null || (lx0Var = value2.b) == null) ? us0.d : lx0Var;
        }
    }

    public static final class QnHx extends cx1 implements j81<b43.QnHx, sd5> {
        public final /* synthetic */ b43 x;
        public final /* synthetic */ long y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(b43 b43Var, long j) {
            super(1);
            this.x = b43Var;
            this.y = j;
        }

        @Override // defpackage.j81
        public final sd5 invoke(b43.QnHx qnHx) {
            rm4 rm4Var = rm4.this;
            b43.QnHx.j(qnHx, this.x, ((mp1) rm4Var.w.a(rm4Var.z, new qm4(rm4Var, this.y)).getValue()).a);
            return sd5.a;
        }
    }

    public rm4(t95<ts0>.QnHx<mp1, Bd_> qnHx, is4<pm4> is4Var, is4<pm4> is4Var2) {
        this.w = qnHx;
        this.x = is4Var;
        this.y = is4Var2;
    }

    @Override // defpackage.uy1
    public final sb2 J(vb2 vb2Var, ob2 ob2Var, long j) {
        b43 b43VarY = ob2Var.y(j);
        long jE = C0239D.e(b43VarY.w, b43VarY.x);
        return vb2Var.K(b43VarY.w, b43VarY.x, ds0.w, new QnHx(b43VarY, jE));
    }
}
