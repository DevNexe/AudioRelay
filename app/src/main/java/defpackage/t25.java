package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class t25 extends cx1 implements j81<List<? extends qq0>, sd5> {
    public final /* synthetic */ cq4 w;
    public final /* synthetic */ j81<x45, sd5> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t25(cq4 cq4Var, u45.CQf cQf) {
        super(1);
        this.w = cq4Var;
        this.x = cQf;
    }

    @Override // defpackage.j81
    public final sd5 invoke(List<? extends qq0> list) {
        this.x.invoke(this.w.d(list));
        return sd5.a;
    }
}
