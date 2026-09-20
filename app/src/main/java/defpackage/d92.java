package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d92 extends cx1 implements h81<sd5> {
    public final /* synthetic */ j81<k82, sd5> w;
    public final /* synthetic */ ri2<x45> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d92(ri2 ri2Var, j81 j81Var) {
        super(0);
        this.w = j81Var;
        this.x = ri2Var;
    }

    @Override // defpackage.h81
    public final sd5 invoke() {
        this.w.invoke(new k82.F1(this.x.getValue().a.w));
        return sd5.a;
    }
}
