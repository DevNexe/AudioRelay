package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class oe5 implements iw0<ne5> {
    public final og3<Context> a;
    public final og3<g5> b;
    public final og3<mu0> c;
    public final og3<xn5> d;
    public final og3<Executor> e;
    public final og3<qy4> f;
    public final og3<at> g;
    public final og3<at> h;
    public final og3<fs> i;

    public oe5(og3 og3Var, og3 og3Var2, og3 og3Var3, m54 m54Var, og3 og3Var4, og3 og3Var5, og3 og3Var6) {
        s75 s75Var = s75.QnHx.a;
        t75 t75Var = t75.QnHx.a;
        this.a = og3Var;
        this.b = og3Var2;
        this.c = og3Var3;
        this.d = m54Var;
        this.e = og3Var4;
        this.f = og3Var5;
        this.g = s75Var;
        this.h = t75Var;
        this.i = og3Var6;
    }

    @Override // defpackage.og3
    public final Object get() {
        return new ne5(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get());
    }
}
