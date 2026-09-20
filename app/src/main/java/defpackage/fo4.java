package defpackage;

import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class fo4 implements rb2 {

    public static final class QnHx extends cx1 implements j81<b43.QnHx, sd5> {
        public final /* synthetic */ int A;
        public final /* synthetic */ b43 w;
        public final /* synthetic */ int x;
        public final /* synthetic */ b43 y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(b43 b43Var, int i, b43 b43Var2, int i2, int i3) {
            super(1);
            this.w = b43Var;
            this.x = i;
            this.y = b43Var2;
            this.z = i2;
            this.A = i3;
        }

        @Override // defpackage.j81
        public final sd5 invoke(b43.QnHx qnHx) {
            b43.QnHx qnHx2 = qnHx;
            b43.QnHx.f(qnHx2, this.w, 0, this.x);
            b43.QnHx.f(qnHx2, this.y, this.z, this.A);
            return sd5.a;
        }
    }

    @Override // defpackage.rb2
    public final sb2 a(vb2 vb2Var, List<? extends ob2> list, long j) {
        int iMax;
        int i;
        int i2;
        List<? extends ob2> list2 = list;
        for (ob2 ob2Var : list2) {
            if (ur1.a(fp1.X(ob2Var), "action")) {
                b43 b43VarY = ob2Var.y(j);
                int iH = (g70.h(j) - b43VarY.w) - vb2Var.p0(jo4.f);
                int iJ = g70.j(j);
                int i3 = iH < iJ ? iJ : iH;
                for (ob2 ob2Var2 : list2) {
                    if (ur1.a(fp1.X(ob2Var2), "text")) {
                        b43 b43VarY2 = ob2Var2.y(g70.a(j, 0, i3, 0, 0, 9));
                        ed1 ed1Var = hnK.a;
                        int iJ2 = b43VarY2.J(ed1Var);
                        if (!(iJ2 != Integer.MIN_VALUE)) {
                            throw new IllegalArgumentException("No baselines for text".toString());
                        }
                        int iJ3 = b43VarY2.J(hnK.b);
                        if (!(iJ3 != Integer.MIN_VALUE)) {
                            throw new IllegalArgumentException("No baselines for text".toString());
                        }
                        boolean z = iJ2 == iJ3;
                        int iH2 = g70.h(j) - b43VarY.w;
                        if (z) {
                            iMax = Math.max(vb2Var.p0(jo4.h), b43VarY.x);
                            int i4 = (iMax - b43VarY2.x) / 2;
                            int iJ4 = b43VarY.J(ed1Var);
                            i2 = iJ4 != Integer.MIN_VALUE ? (iJ2 + i4) - iJ4 : 0;
                            i = i4;
                        } else {
                            int iP0 = vb2Var.p0(jo4.a) - iJ2;
                            iMax = Math.max(vb2Var.p0(jo4.i), b43VarY2.x + iP0);
                            i = iP0;
                            i2 = (iMax - b43VarY.x) / 2;
                        }
                        return vb2Var.K(g70.h(j), iMax, ds0.w, new QnHx(b43VarY2, i, b43VarY, iH2, i2));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
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
