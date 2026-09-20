package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@zl2.CQf("dialog")
public final class vk0 extends zl2<QnHx> {

    public static final class QnHx extends dl2 implements lz0 {
        public final wk0 F;
        public final y81<kk2, g30, Integer, sd5> G;

        public QnHx(vk0 vk0Var, wk0 wk0Var, sz szVar) {
            super(vk0Var);
            this.F = wk0Var;
            this.G = szVar;
        }
    }

    @Override // defpackage.zl2
    public final dl2 a() {
        return new QnHx(this, new wk0(0), r00.a);
    }

    @Override // defpackage.zl2
    public final void d(List<kk2> list, sl2 sl2Var, zl2.QnHx qnHx) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            b().e((kk2) it.next());
        }
    }

    @Override // defpackage.zl2
    public final void e(kk2 kk2Var, boolean z) {
        b().d(kk2Var, z);
    }
}
