package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ct0 extends cx1 implements j81<sp1, sp1> {
    public final /* synthetic */ j81<Integer, Integer> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ct0(j81<? super Integer, Integer> j81Var) {
        super(1);
        this.w = j81Var;
    }

    @Override // defpackage.j81
    public final sp1 invoke(sp1 sp1Var) {
        long j = sp1Var.a;
        return new sp1(C0239D.e((int) (j >> 32), this.w.invoke(Integer.valueOf(sp1.b(j))).intValue()));
    }
}
