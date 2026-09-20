package androidx.lifecycle;

import defpackage.d32;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
class CompositeGeneratedAdaptersObserver implements auxFixed {
    public final F1[] w;

    public CompositeGeneratedAdaptersObserver(F1[] f1Arr) {
        this.w = f1Arr;
    }

    @Override // androidx.lifecycle.auxFixed
    public final void h(d32 d32Var, YKK.CQf cQf) {
        new HashMap();
        F1[] f1Arr = this.w;
        for (F1 f1 : f1Arr) {
            f1.a();
        }
        for (F1 f2 : f1Arr) {
            f2.a();
        }
    }
}
