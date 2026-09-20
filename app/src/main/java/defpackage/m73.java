package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m73 extends cx1 implements j81<lKy3, sd5> {
    public final /* synthetic */ n73 w;
    public final /* synthetic */ f73.T23 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m73(n73 n73Var, f73.T23 t23) {
        super(1);
        this.w = n73Var;
        this.x = t23;
    }

    @Override // defpackage.j81
    public final sd5 invoke(lKy3 lky3) {
        this.w.a.t.setValue(Boolean.valueOf(this.x.a));
        return sd5.a;
    }
}
