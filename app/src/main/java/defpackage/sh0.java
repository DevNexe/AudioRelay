package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class sh0 implements iw0<rh0> {
    public final og3<Executor> a;
    public final og3<g5> b;
    public final og3<xn5> c;
    public final og3<mu0> d;
    public final og3<qy4> e;

    public sh0(og3 og3Var, og3 og3Var2, m54 m54Var, og3 og3Var3, og3 og3Var4) {
        this.a = og3Var;
        this.b = og3Var2;
        this.c = m54Var;
        this.d = og3Var3;
        this.e = og3Var4;
    }

    @Override // defpackage.og3
    public final Object get() {
        return new rh0(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
