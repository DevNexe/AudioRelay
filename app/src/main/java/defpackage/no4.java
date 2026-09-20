package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class no4 implements rb2 {
    public static final no4 a = new no4();

    public static final class QnHx extends cx1 implements j81<b43.QnHx, sd5> {
        public final /* synthetic */ int w;
        public final /* synthetic */ b43 x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(int i, b43 b43Var) {
            super(1);
            this.w = i;
            this.x = b43Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(b43.QnHx qnHx) {
            b43 b43Var = this.x;
            b43.QnHx.f(qnHx, b43Var, 0, (this.w - b43Var.x) / 2);
            return sd5.a;
        }
    }

    @Override // defpackage.rb2
    public final sb2 a(vb2 vb2Var, List<? extends ob2> list, long j) {
        if (!(list.size() == 1)) {
            throw new IllegalArgumentException("text for Snackbar expected to have exactly only one child".toString());
        }
        b43 b43VarY = ((ob2) wu.H0(list)).y(j);
        int iJ = b43VarY.J(hnK.a);
        int iJ2 = b43VarY.J(hnK.b);
        if (!(iJ != Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("No baselines for text".toString());
        }
        if (!(iJ2 != Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("No baselines for text".toString());
        }
        int iMax = Math.max(vb2Var.p0(iJ == iJ2 ? jo4.h : jo4.i), b43VarY.x);
        return vb2Var.K(g70.h(j), iMax, ds0.w, new QnHx(iMax, b43VarY));
    }

    @Override // defpackage.rb2
    public final /* synthetic */ int b(yy1.byN byn, List list, int i) {
        return qb2.c(this, byn, list, i);
    }

    @Override // defpackage.rb2
    public final /* synthetic */ int c(yy1.byN byn, List list, int i) {
        return qb2.d(this, byn, list, i);
    }

    @Override // defpackage.rb2
    public final /* synthetic */ int d(yy1.byN byn, List list, int i) {
        return qb2.b(this, byn, list, i);
    }

    @Override // defpackage.rb2
    public final /* synthetic */ int e(yy1.byN byn, List list, int i) {
        return qb2.a(this, byn, list, i);
    }
}
