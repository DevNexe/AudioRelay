package defpackage;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public final class v25 extends cx1 implements j81<xv1, Boolean> {
    public final /* synthetic */ x45 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v25(x45 x45Var) {
        super(1);
        this.w = x45Var;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0039  */
    /* JADX WARN: Code duplicated, block: B:22:0x0045  */
    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0064  */
    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    @Override // defpackage.j81
    public final Boolean invoke(xv1 xv1Var) {
        boolean zB;
        boolean z;
        boolean z2;
        KeyEvent keyEvent = xv1Var.a;
        boolean z3 = true;
        boolean z4 = wv1.a(zv1.b(keyEvent), wv1.j) && (keyEvent.isCtrlPressed() || (w53.a && keyEvent.isAltPressed()));
        x45 x45Var = this.w;
        if (z4) {
            if (!(x45Var.a.w.length() == 0)) {
                if (wv1.a(zv1.b(keyEvent), wv1.k)) {
                    zB = s55.b(x45Var.b);
                    if (x45Var.a.w.length() == s55.c(x45Var.b)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (zB) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        z3 = false;
                    }
                } else {
                    z3 = false;
                }
            }
        } else if (wv1.a(zv1.b(keyEvent), wv1.k)) {
            zB = s55.b(x45Var.b);
            if (x45Var.a.w.length() == s55.c(x45Var.b)) {
                z = true;
            } else {
                z = false;
            }
            if (zB || !z) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                z3 = false;
            }
        } else {
            z3 = false;
        }
        return Boolean.valueOf(z3);
    }
}
