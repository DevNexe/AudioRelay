package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@zl2.CQf("composable")
public final class z20 extends zl2<QnHx> {

    public static final class QnHx extends dl2 {
        public final y81<kk2, g30, Integer, sd5> F;

        public QnHx(z20 z20Var, sz szVar) {
            super(z20Var);
            this.F = szVar;
        }
    }

    @Override // defpackage.zl2
    public final dl2 a() {
        return new QnHx(this, m00.a);
    }

    @Override // defpackage.zl2
    public final void d(List<kk2> list, sl2 sl2Var, zl2.QnHx qnHx) {
        for (kk2 kk2Var : list) {
            dm2 dm2VarB = b();
            kk2 kk2Var2 = (kk2) wu.O0((List) dm2VarB.e.getValue());
            kotlinx.coroutines.flow.QnHx qnHx2 = dm2VarB.c;
            if (kk2Var2 != null) {
                qnHx2.setValue(og4.d0((Set) qnHx2.getValue(), kk2Var2));
            }
            qnHx2.setValue(og4.d0((Set) qnHx2.getValue(), kk2Var));
            dm2VarB.e(kk2Var);
        }
    }

    @Override // defpackage.zl2
    public final void e(kk2 kk2Var, boolean z) {
        b().d(kk2Var, z);
    }
}
