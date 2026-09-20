package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class mn5 implements iw0<ln5> {
    public final og3<Executor> a;
    public final og3<mu0> b;
    public final og3<xn5> c;
    public final og3<qy4> d;

    public mn5(og3 og3Var, og3 og3Var2, m54 m54Var, og3 og3Var3) {
        this.a = og3Var;
        this.b = og3Var2;
        this.c = m54Var;
        this.d = og3Var3;
    }

    @Override // defpackage.og3
    public final Object get() {
        return new ln5(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
