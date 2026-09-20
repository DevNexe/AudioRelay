package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class mc0 implements iw0<lc0> {
    public final og3<Context> a;
    public final og3<at> b;
    public final og3<at> c;

    public mc0(dp1 dp1Var) {
        s75 s75Var = s75.QnHx.a;
        t75 t75Var = t75.QnHx.a;
        this.a = dp1Var;
        this.b = s75Var;
        this.c = t75Var;
    }

    @Override // defpackage.og3
    public final Object get() {
        return new lc0(this.a.get(), this.b.get(), this.c.get());
    }
}
