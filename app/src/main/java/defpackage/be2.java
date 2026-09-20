package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class be2 implements iw0<ae2> {
    public final og3<Context> a;
    public final og3<lc0> b;

    public be2(dp1 dp1Var, mc0 mc0Var) {
        this.a = dp1Var;
        this.b = mc0Var;
    }

    @Override // defpackage.og3
    public final Object get() {
        return new ae2(this.a.get(), this.b.get());
    }
}
