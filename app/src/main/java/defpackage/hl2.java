package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@zl2.CQf("navigation")
public class hl2 extends zl2<fl2> {
    public final cm2 c;

    public hl2(cm2 cm2Var) {
        this.c = cm2Var;
    }

    @Override // defpackage.zl2
    public final dl2 a() {
        return new fl2(this);
    }

    @Override // defpackage.zl2
    public final void d(List<kk2> list, sl2 sl2Var, zl2.QnHx qnHx) {
        for (kk2 kk2Var : list) {
            fl2 fl2Var = (fl2) kk2Var.x;
            int i = fl2Var.G;
            String str = fl2Var.I;
            if (!((i == 0 && str == null) ? false : true)) {
                StringBuilder sb = new StringBuilder("no start destination defined via app:startDestination for ");
                int i2 = fl2Var.C;
                sb.append(i2 != 0 ? String.valueOf(i2) : "the root navigation");
                throw new IllegalStateException(sb.toString().toString());
            }
            dl2 dl2VarH = str != null ? fl2Var.h(str, false) : fl2Var.g(i, false);
            if (dl2VarH == null) {
                if (fl2Var.H == null) {
                    String strValueOf = fl2Var.I;
                    if (strValueOf == null) {
                        strValueOf = String.valueOf(fl2Var.G);
                    }
                    fl2Var.H = strValueOf;
                }
                throw new IllegalArgumentException(fc2.a("navigation destination ", fl2Var.H, " is not a direct child of this NavGraph"));
            }
            this.c.b(dl2VarH.w).d(Collections.singletonList(b().a(dl2VarH, dl2VarH.b(kk2Var.y))), sl2Var, qnHx);
        }
    }
}
