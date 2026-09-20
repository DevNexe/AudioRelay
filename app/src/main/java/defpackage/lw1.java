package defpackage;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public final class lw1 extends cx1 implements j81<xv1, Boolean> {
    public final /* synthetic */ h81<sd5> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw1(h81<sd5> h81Var) {
        super(1);
        this.w = h81Var;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f  */
    @Override // defpackage.j81
    public final Boolean invoke(xv1 xv1Var) {
        boolean zA;
        KeyEvent keyEvent = xv1Var.a;
        boolean z = false;
        if (!(zv1.c(keyEvent) == 1)) {
            zA = false;
        } else if (!w53.a) {
            zA = wv1.a(zv1.b(keyEvent), wv1.i);
        } else if (wv1.a(zv1.b(keyEvent), wv1.i) || wv1.a(zv1.b(keyEvent), wv1.h)) {
            zA = true;
        } else {
            zA = false;
        }
        if (zA) {
            this.w.invoke();
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
