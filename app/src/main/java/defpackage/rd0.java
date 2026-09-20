package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rd0 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ ri2<ce0.CQf> w;
    public final /* synthetic */ dd0 x;
    public final /* synthetic */ j81<cd0, sd5> y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public rd0(ri2<ce0.CQf> ri2Var, dd0 dd0Var, j81<? super cd0, sd5> j81Var, int i) {
        super(2);
        this.w = ri2Var;
        this.x = dd0Var;
        this.y = j81Var;
        this.z = i;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        num.intValue();
        int i = this.z | 1;
        dd0 dd0Var = this.x;
        j81<cd0, sd5> j81Var = this.y;
        hd0.f(this.w, dd0Var, j81Var, g30Var, i);
        return sd5.a;
    }
}
