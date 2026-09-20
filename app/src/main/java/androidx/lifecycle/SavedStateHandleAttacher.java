package androidx.lifecycle;

import defpackage.d32;
import defpackage.w24;

/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleAttacher implements auxFixed {
    public final w24 w;

    public SavedStateHandleAttacher(w24 w24Var) {
        this.w = w24Var;
    }

    @Override // androidx.lifecycle.auxFixed
    public final void h(d32 d32Var, YKK.CQf cQf) {
        if (!(cQf == YKK.CQf.ON_CREATE)) {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + cQf).toString());
        }
        d32Var.c().c(this);
        w24 w24Var = this.w;
        if (w24Var.b) {
            return;
        }
        w24Var.c = w24Var.a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        w24Var.b = true;
    }
}
