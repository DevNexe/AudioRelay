package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tz1 implements sz1 {
    public final kz2 a = ps0.R(new wm0(Float.NaN));
    public final kz2 b = ps0.R(new wm0(Float.NaN));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.sz1
    public final pg2 a(pg2 pg2Var, float f) {
        return gm4.k(pg2Var, ((wm0) this.a.getValue()).w * f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.sz1
    public final pg2 b(pg2 pg2Var, float f) {
        return gm4.g(pg2Var, ((wm0) this.b.getValue()).w * f);
    }
}
