package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bl3 extends cx1 implements j81<Object, sd5> {
    public final /* synthetic */ d90 w;
    public final /* synthetic */ wh1<Object> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl3(d90 d90Var, wh1<Object> wh1Var) {
        super(1);
        this.w = d90Var;
        this.x = wh1Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(Object obj) {
        this.w.m(obj);
        wh1<Object> wh1Var = this.x;
        if (wh1Var != null) {
            wh1Var.add(obj);
        }
        return sd5.a;
    }
}
