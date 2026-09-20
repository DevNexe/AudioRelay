package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class xk5 implements nz0<zk5> {
    public final /* synthetic */ yk5 w;

    public xk5(yk5 yk5Var) {
        this.w = yk5Var;
    }

    @Override // defpackage.nz0
    public final Object f(zk5 zk5Var, z80 z80Var) {
        dl5 hHVar;
        zk5 zk5Var2 = zk5Var;
        yk5 yk5Var = this.w;
        yk5Var.getClass();
        if (zk5Var2.a) {
            zk5.QnHx qnHx = zk5Var2.b;
            if (qnHx instanceof zk5.QnHx.C0234QnHx) {
                hHVar = new v91(zk5Var2.c);
            } else {
                if (!ur1.a(qnHx, zk5.QnHx.CQf.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                hHVar = new hH();
            }
        } else {
            hHVar = eu.z;
        }
        yk5Var.b = hHVar;
        return sd5.a;
    }
}
