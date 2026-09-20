package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class bb4 extends cb4 {
    public final wa4 d;
    public final Object e;
    public final rb5 f;
    public final Charset g;
    public final n80 h;

    public bb4(wa4 wa4Var, Object obj, rb5 rb5Var, Charset charset, n80 n80Var) {
        super(wa4Var, obj, rb5Var, charset);
        this.d = wa4Var;
        this.e = obj;
        this.f = rb5Var;
        this.g = charset;
        this.h = n80Var;
    }

    @Override // defpackage.cb4
    public final Charset a() {
        return this.g;
    }

    @Override // defpackage.cb4
    public final wa4 b() {
        return this.d;
    }

    @Override // defpackage.cb4
    public final Object c() {
        return this.e;
    }
}
