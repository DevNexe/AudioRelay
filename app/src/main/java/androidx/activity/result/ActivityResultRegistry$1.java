package androidx.activity.result;

import androidx.lifecycle.YKK;
import androidx.lifecycle.auxFixed;
import defpackage.d32;

/* JADX INFO: loaded from: classes.dex */
class ActivityResultRegistry$1 implements auxFixed {
    @Override // androidx.lifecycle.auxFixed
    public final void h(d32 d32Var, YKK.CQf cQf) {
        if (YKK.CQf.ON_START.equals(cQf) || YKK.CQf.ON_STOP.equals(cQf) || YKK.CQf.ON_DESTROY.equals(cQf)) {
            throw null;
        }
    }
}
