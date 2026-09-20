package androidx.lifecycle;

import defpackage.d32;
import defpackage.u24;

/* JADX INFO: loaded from: classes.dex */
final class SavedStateHandleController implements auxFixed {
    public final String w;
    public boolean x = false;
    public final u24 y;

    public SavedStateHandleController(String str, u24 u24Var) {
        this.w = str;
        this.y = u24Var;
    }

    @Override // androidx.lifecycle.auxFixed
    public final void h(d32 d32Var, YKK.CQf cQf) {
        if (cQf == YKK.CQf.ON_DESTROY) {
            this.x = false;
            d32Var.c().c(this);
        }
    }
}
