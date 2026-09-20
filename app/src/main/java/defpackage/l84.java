package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l84 extends cx1 implements j81<ij0, kt2> {
    public final /* synthetic */ h81<kt2> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l84(h81<kt2> h81Var) {
        super(1);
        this.w = h81Var;
    }

    @Override // defpackage.j81
    public final kt2 invoke(ij0 ij0Var) {
        return new kt2(this.w.invoke().a);
    }
}
