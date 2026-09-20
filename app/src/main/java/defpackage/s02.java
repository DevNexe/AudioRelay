package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s02 extends cx1 implements h81<t02> {
    public final /* synthetic */ is4<j81<h12, sd5>> w;
    public final /* synthetic */ ri2<pp1> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s02(ri2 ri2Var, ri2 ri2Var2) {
        super(0);
        this.w = ri2Var;
        this.x = ri2Var2;
    }

    @Override // defpackage.h81
    public final t02 invoke() {
        i12 i12Var = new i12();
        this.w.getValue().invoke(i12Var);
        return new t02(i12Var.b, this.x.getValue());
    }
}
