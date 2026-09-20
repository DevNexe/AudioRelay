package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cu2 extends cx1 implements j81<Throwable, sd5> {
    public final /* synthetic */ hl w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cu2(bj3 bj3Var) {
        super(1);
        this.w = bj3Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(Throwable th) {
        this.w.cancel();
        return sd5.a;
    }
}
