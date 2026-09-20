package defpackage;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class jg1 {
    public final xe5 a;
    public final uf1 b;
    public final mc1 c;
    public final dw2 d;
    public final ms1 e;
    public final Bpm f;
    public final Set<ff1<?>> g;

    public jg1(xe5 xe5Var, uf1 uf1Var, pc1 pc1Var, dw2 dw2Var, ms1 ms1Var, GPUw gPUw) {
        Set<ff1<?>> setKeySet;
        this.a = xe5Var;
        this.b = uf1Var;
        this.c = pc1Var;
        this.d = dw2Var;
        this.e = ms1Var;
        this.f = gPUw;
        Map map = (Map) gPUw.d(gf1.a);
        this.g = (map == null || (setKeySet = map.keySet()) == null) ? hs0.w : setKeySet;
    }

    public final Object a() {
        ah1.CQf cQf = ah1.d;
        Map map = (Map) this.f.d(gf1.a);
        if (map != null) {
            return map.get(cQf);
        }
        return null;
    }

    public final String toString() {
        return "HttpRequestData(url=" + this.a + ", method=" + this.b + ')';
    }
}
