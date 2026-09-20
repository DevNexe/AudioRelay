package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: t2€z, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class t2z implements rb2 {
    public static final t2z a = new t2z();

    /* JADX INFO: renamed from: t2€z$CQf */
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

    /* JADX INFO: renamed from: t2€z$F1 */
    public static final class F1 extends cx1 implements j81<b43.QnHx, sd5> {
        public final /* synthetic */ List<b43> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(ArrayList arrayList) {
            super(1);
            this.w = arrayList;
        }

        @Override // defpackage.j81
        public final sd5 invoke(b43.QnHx qnHx) {
            b43.QnHx qnHx2 = qnHx;
            List<b43> list = this.w;
            int iJ = ps0.J(list);
            if (iJ >= 0) {
                int i = 0;
                while (true) {
                    b43.QnHx.f(qnHx2, list.get(i), 0, 0);
                    if (i == iJ) {
                        break;
                    }
                    i++;
                }
            }
            return sd5.a;
        }
    }

    /* JADX INFO: renamed from: t2€z$QnHx */
    public static final class QnHx extends cx1 implements j81<b43.QnHx, sd5> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(1);
        }

        @Override // defpackage.j81
        public final /* bridge */ /* synthetic */ sd5 invoke(b43.QnHx qnHx) {
            return sd5.a;
        }
    }

    @Override // defpackage.rb2
    public final sb2 a(vb2 vb2Var, List<? extends ob2> list, long j) {
        int iMax;
        int size = list.size();
        ds0 ds0Var = ds0.w;
        int i = 0;
        if (size == 0) {
            return vb2Var.K(0, 0, ds0Var, QnHx.w);
        }
        if (size == 1) {
            b43 b43VarY = list.get(0).y(j);
            return vb2Var.K(b43VarY.w, b43VarY.x, ds0Var, new CQf(b43VarY));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList.add(list.get(i2).y(j));
        }
        int iJ = ps0.J(arrayList);
        if (iJ >= 0) {
            int iMax2 = 0;
            iMax = 0;
            while (true) {
                b43 b43Var = (b43) arrayList.get(i);
                iMax2 = Math.max(iMax2, b43Var.w);
                iMax = Math.max(iMax, b43Var.x);
                if (i == iJ) {
                    break;
                }
                i++;
            }
            i = iMax2;
        } else {
            iMax = 0;
        }
        return vb2Var.K(i, iMax, ds0Var, new F1(arrayList));
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
