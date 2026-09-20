package androidx.fragment.app;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class lPt3Fixed implements Runnable {
    public final /* synthetic */ ck32.QnHx w;
    public final /* synthetic */ ck32 x;

    public lPt3Fixed(ck32 ck32Var, ck32.QnHx qnHx) {
        this.x = ck32Var;
        this.w = qnHx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ck32 ck32Var = this.x;
        ArrayList<ck32.CQf> arrayList = ck32Var.b;
        ck32.QnHx qnHx = this.w;
        arrayList.remove(qnHx);
        ck32Var.c.remove(qnHx);
    }
}
