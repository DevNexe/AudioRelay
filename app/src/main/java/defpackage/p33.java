package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class p33 {
    public final cd4 a;
    public final vq2<xq0<r33, vq2<List<qk>>>> b;
    public final zr2 c;
    public volatile List<l33> d = cs0.w;
    public final c2 e;
    public final c2 f;

    public p33(cd4 cd4Var, vq2<xq0<r33, vq2<List<qk>>>> vq2Var) {
        this.a = cd4Var;
        this.b = vq2Var;
        gq0.QnHx qnHx = gq0.x;
        this.e = new c2(ps0.o0(5, kq0.MINUTES));
        this.f = new c2(ps0.o0(10, kq0.SECONDS));
        ft2 ft2Var = new ft2(new r23(this, 4), new m33(this, 0), new CY(13), true);
        AtomicReference atomicReference = new AtomicReference();
        this.c = new zr2(new gs2(new gs2.F1(atomicReference), ft2Var, atomicReference).H());
    }
}
