package defpackage;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public final class tr extends cx1 implements j81<xv1, Boolean> {
    public final /* synthetic */ boolean w;
    public final /* synthetic */ h81<sd5> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tr(boolean z, h81<sd5> h81Var) {
        super(1);
        this.w = z;
        this.x = h81Var;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0032  */
    @Override // defpackage.j81
    public final Boolean invoke(xv1 xv1Var) {
        boolean z;
        KeyEvent keyEvent = xv1Var.a;
        boolean z2 = false;
        if (this.w) {
            int i = zr.b;
            if (zv1.c(keyEvent) == 1) {
                int iB = (int) (zv1.b(keyEvent) >> 32);
                if (iB == 23 || iB == 66 || iB == 160) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (z) {
                this.x.invoke();
                z2 = true;
            }
        }
        return Boolean.valueOf(z2);
    }
}
