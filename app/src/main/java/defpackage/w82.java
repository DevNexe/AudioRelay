package defpackage;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public final class w82 extends cx1 implements j81<xv1, Boolean> {
    public final /* synthetic */ j81<k82, sd5> w;
    public final /* synthetic */ x45 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w82(x45 x45Var, j81 j81Var) {
        super(1);
        this.w = j81Var;
        this.x = x45Var;
    }

    @Override // defpackage.j81
    public final Boolean invoke(xv1 xv1Var) {
        KeyEvent keyEvent = xv1Var.a;
        boolean z = false;
        if (wv1.a(zv1.b(keyEvent), wv1.i)) {
            if (zv1.c(keyEvent) == 2) {
                this.w.invoke(new k82.F1(this.x.a.w));
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
