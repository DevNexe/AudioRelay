package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class gu3 implements rk2.CQf {
    public final /* synthetic */ nr2<ou3> a;

    public gu3(dr2.QnHx qnHx) {
        this.a = qnHx;
    }

    @Override // rk2.CQf
    public final void a(dl2 dl2Var) {
        ou3 ou3Var;
        String str = dl2Var.D;
        if (str == null || (ou3Var = (ou3) t92.P(str, (Map) ou3.d.getValue())) == null) {
            return;
        }
        ((dr2.QnHx) this.a).b(ou3Var);
    }
}
