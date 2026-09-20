package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ud3 extends cx1 implements h81<sd5> {
    public final /* synthetic */ ri2<Integer> w;
    public final /* synthetic */ Object[] x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud3(ri2<Integer> ri2Var, Object[] objArr) {
        super(0);
        this.w = ri2Var;
        this.x = objArr;
    }

    @Override // defpackage.h81
    public final sd5 invoke() {
        ri2<Integer> ri2Var = this.w;
        ri2Var.setValue(Integer.valueOf((ri2Var.getValue().intValue() + 1) % this.x.length));
        return sd5.a;
    }
}
