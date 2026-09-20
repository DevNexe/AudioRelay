package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class po1K extends B8C {
    public final lKy3 w;
    public final gk0 x;

    public po1K(lKy3 lky3, gk0 gk0Var) {
        this.w = lky3;
        this.x = gk0Var;
    }

    @Override // defpackage.B8C
    public final void M0(String str) {
        this.w.e.setValue(str);
    }

    @Override // defpackage.B8C
    public final cs2 O0(c54 c54Var) {
        return new cs2(this.w.e.a(c54Var), new Ot0r(this, 5));
    }
}
