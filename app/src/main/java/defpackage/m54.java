package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class m54 implements iw0<xn5> {
    public final og3<Context> a;
    public final og3<mu0> b;
    public final og3<e54> c;
    public final og3<at> d;

    public m54(og3 og3Var, og3 og3Var2, l54 l54Var) {
        t75 t75Var = t75.QnHx.a;
        this.a = og3Var;
        this.b = og3Var2;
        this.c = l54Var;
        this.d = t75Var;
    }

    @Override // defpackage.og3
    public final Object get() {
        Context context = this.a.get();
        mu0 mu0Var = this.b.get();
        e54 e54Var = this.c.get();
        this.d.get();
        return new ps1(context, mu0Var, e54Var);
    }
}
