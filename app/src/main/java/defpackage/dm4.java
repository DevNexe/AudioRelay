package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dm4 extends wy1 {
    public final Ah<sp1> w;
    public final ua0 x;
    public x81<? super sp1, ? super sp1, sd5> y;
    public QnHx z;

    public static final class CQf extends cx1 implements j81<b43.QnHx, sd5> {
        public final /* synthetic */ b43 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(b43 b43Var) {
            super(1);
            this.w = b43Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(b43.QnHx qnHx) {
            b43.QnHx.f(qnHx, this.w, 0, 0);
            return sd5.a;
        }
    }

    public static final class QnHx {
        public final OVbg<sp1, Bd_> a;
        public long b;

        public QnHx() {
            throw null;
        }

        public QnHx(OVbg oVbg, long j) {
            this.a = oVbg;
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QnHx)) {
                return false;
            }
            QnHx qnHx = (QnHx) obj;
            return ur1.a(this.a, qnHx.a) && sp1.a(this.b, qnHx.b);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            long j = this.b;
            return ((int) (j ^ (j >>> 32))) + iHashCode;
        }

        public final String toString() {
            return "AnimData(anim=" + this.a + ", startSize=" + ((Object) sp1.c(this.b)) + ')';
        }
    }

    public dm4(lx0 lx0Var, ua0 ua0Var) {
        this.w = lx0Var;
        this.x = ua0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uy1
    public final sb2 J(vb2 vb2Var, ob2 ob2Var, long j) {
        b43 b43VarY = ob2Var.y(j);
        long jE = C0239D.e(b43VarY.w, b43VarY.x);
        QnHx qnHx = this.z;
        if (qnHx != null) {
            OVbg<sp1, Bd_> oVbg = qnHx.a;
            if (!sp1.a(jE, ((sp1) oVbg.e.getValue()).a)) {
                qnHx.b = oVbg.d().a;
                fp1.k0(this.x, null, 0, new em4(qnHx, jE, this, null), 3);
            }
        } else {
            qnHx = new QnHx(new OVbg(new sp1(jE), mg5.h, new sp1(C0239D.e(1, 1))), jE);
        }
        this.z = qnHx;
        long j2 = qnHx.a.d().a;
        return vb2Var.K((int) (j2 >> 32), sp1.b(j2), ds0.w, new CQf(b43VarY));
    }
}
