package androidx.lifecycle;

import defpackage.AY;
import defpackage.d32;
import defpackage.la0;
import defpackage.y22;

/* JADX INFO: loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl extends y22 implements auxFixed {
    public final YKK w;
    public final la0 x;

    public LifecycleCoroutineScopeImpl(YKK ykk, la0 la0Var) {
        this.w = ykk;
        this.x = la0Var;
        if (ykk.b() == YKK.F1.DESTROYED) {
            AY.j(la0Var, null);
        }
    }

    @Override // defpackage.ua0
    public final la0 g() {
        return this.x;
    }

    @Override // androidx.lifecycle.auxFixed
    public final void h(d32 d32Var, YKK.CQf cQf) {
        YKK ykk = this.w;
        if (ykk.b().compareTo(YKK.F1.DESTROYED) <= 0) {
            ykk.c(this);
            AY.j(this.x, null);
        }
    }
}
