package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lqAe implements f51 {
    public final lKy3 a;

    public lqAe(lKy3 lky3) {
        this.a = lky3;
    }

    @Override // defpackage.f51
    public final ad0 a() {
        lKy3 lky3 = this.a;
        return new ad0(((Number) lky3.l.getValue()).intValue(), ((Number) lky3.m.getValue()).intValue());
    }

    @Override // defpackage.f51
    public final int b() {
        return ((Number) this.a.k.getValue()).intValue();
    }

    @Override // defpackage.f51
    public final boolean c() {
        return ((Boolean) this.a.j.getValue()).booleanValue();
    }
}
