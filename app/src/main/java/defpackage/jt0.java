package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jt0 extends cx1 implements j81<sp1, mp1> {
    public final /* synthetic */ j81<Integer, Integer> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public jt0(j81<? super Integer, Integer> j81Var) {
        super(1);
        this.w = j81Var;
    }

    @Override // defpackage.j81
    public final mp1 invoke(sp1 sp1Var) {
        return new mp1(C0239D.d(0, this.w.invoke(Integer.valueOf(sp1.b(sp1Var.a))).intValue()));
    }
}
