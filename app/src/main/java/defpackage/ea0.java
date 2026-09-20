package defpackage;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public final class ea0 extends cx1 implements j81<xv1, Boolean> {
    public final /* synthetic */ u45 w;
    public final /* synthetic */ j45 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea0(u45 u45Var, j45 j45Var) {
        super(1);
        this.w = u45Var;
        this.x = j45Var;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0024  */
    @Override // defpackage.j81
    public final Boolean invoke(xv1 xv1Var) {
        boolean z;
        KeyEvent keyEvent = xv1Var.a;
        boolean z2 = false;
        if (this.w.a() == hb1.Selection) {
            if (keyEvent.getKeyCode() != 4) {
                z = false;
            } else {
                if (zv1.c(keyEvent) == 1) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                this.x.g(null);
                z2 = true;
            }
        }
        return Boolean.valueOf(z2);
    }
}
