package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ft3 extends yy1.YKK {
    public static final ft3 b = new ft3();

    public static final class CQf extends cx1 implements j81<b43.QnHx, sd5> {
        public final /* synthetic */ b43 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(b43 b43Var) {
            super(1);
            this.w = b43Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(b43.QnHx qnHx) {
            b43.QnHx.g(qnHx, this.w, 0, 0);
            return sd5.a;
        }
    }

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
            int size = list.size();
            for (int i = 0; i < size; i++) {
                b43.QnHx.g(qnHx2, list.get(i), 0, 0);
            }
            return sd5.a;
        }
    }

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

    public ft3() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // defpackage.rb2
    public final sb2 a(vb2 vb2Var, List<? extends ob2> list, long j) {
        boolean zIsEmpty = list.isEmpty();
        ds0 ds0Var = ds0.w;
        if (zIsEmpty) {
            return vb2Var.K(g70.j(j), g70.i(j), ds0Var, QnHx.w);
        }
        if (list.size() == 1) {
            b43 b43VarY = list.get(0).y(j);
            return vb2Var.K(FWT.w(b43VarY.w, j), FWT.v(b43VarY.x, j), ds0Var, new CQf(b43VarY));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(list.get(i).y(j));
        }
        int size2 = arrayList.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i2 = 0; i2 < size2; i2++) {
            b43 b43Var = (b43) arrayList.get(i2);
            iMax = Math.max(b43Var.w, iMax);
            iMax2 = Math.max(b43Var.x, iMax2);
        }
        return vb2Var.K(FWT.w(iMax, j), FWT.v(iMax2, j), ds0Var, new F1(arrayList));
    }
}
