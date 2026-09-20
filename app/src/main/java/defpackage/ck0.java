package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ck0 extends gR2r {
    public ck0(EWe eWe, fm3 fm3Var) {
        super(eWe, fm3Var);
    }

    @Override // defpackage.gR2r
    public final vk4<Boolean> a() {
        return vk4.f(Boolean.TRUE);
    }

    @Override // defpackage.gR2r
    public final vk4<Ytae> b() {
        List<String> list = dk0.a;
        return super.b();
    }

    @Override // defpackage.gR2r
    public final vk4<Bs6V> c() {
        List<String> list = dk0.a;
        return super.c();
    }

    @Override // defpackage.gR2r
    public final vk4<LpT7Fixed> d() {
        return vk4.f(new LpT7Fixed(dk0.a));
    }

    @Override // defpackage.gR2r
    public final vk4<w1L> e() {
        return vk4.f(new w1L("ca-app-pub-6112537372340086/8958953038", "", "ca-app-pub-3940256099942544/6300978111", "ca-app-pub-3940256099942544/1033173712"));
    }

    @Override // defpackage.gR2r
    public final vk4<coNFixed> f() {
        List<String> list = dk0.a;
        return super.f();
    }

    @Override // defpackage.gR2r
    public final vk4<x61> g() {
        gq0.QnHx qnHx = gq0.x;
        kq0 kq0Var = kq0.SECONDS;
        return vk4.f(new x61(ps0.o0(3, kq0Var), ps0.o0(10, kq0Var)));
    }

    @Override // defpackage.gR2r
    public final vk4<z61> h(boolean z) {
        List<String> list = dk0.a;
        return vk4.f(new z61(y61.AdsFragmentOnly));
    }

    @Override // defpackage.gR2r
    public final vk4<gq0> i() {
        Long lP;
        j81 j81Var = eu.y;
        jl4 jl4VarF = null;
        String str = j81Var != null ? (String) j81Var.invoke("ADS_INACTIVITY_PERIOD_SECS") : null;
        if (str != null && (lP = hv4.p(str)) != null) {
            gq0.QnHx qnHx = gq0.x;
            jl4VarF = vk4.f(new gq0(ps0.p0(lP.longValue(), kq0.SECONDS)));
        }
        return jl4VarF == null ? super.i() : jl4VarF;
    }

    @Override // defpackage.gR2r
    public final long j() {
        gq0.QnHx qnHx = gq0.x;
        return ps0.o0(5, kq0.MINUTES);
    }
}
