package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class s41 implements n70<t41.QnHx> {
    public final /* synthetic */ String a;

    public s41(String str) {
        this.a = str;
    }

    @Override // defpackage.n70
    public final void accept(t41.QnHx qnHx) {
        t41.QnHx qnHx2 = qnHx;
        synchronized (t41.c) {
            ok4<String, ArrayList<n70<t41.QnHx>>> ok4Var = t41.d;
            ArrayList<n70<t41.QnHx>> orDefault = ok4Var.getOrDefault(this.a, null);
            if (orDefault == null) {
                return;
            }
            ok4Var.remove(this.a);
            for (int i = 0; i < orDefault.size(); i++) {
                orDefault.get(i).accept(qnHx2);
            }
        }
    }
}
