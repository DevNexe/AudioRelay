package androidx.fragment.app;

import defpackage.a83;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class LPt9Fixed implements Runnable {
    public final /* synthetic */ ck32.QnHx w;
    public final /* synthetic */ ck32 x;

    public LPt9Fixed(ck32 ck32Var, ck32.QnHx qnHx) {
        this.x = ck32Var;
        this.w = qnHx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList<ck32.CQf> arrayList = this.x.b;
        ck32.QnHx qnHx = this.w;
        if (arrayList.contains(qnHx)) {
            a83.a(qnHx.a, qnHx.c.a0);
        }
    }
}
