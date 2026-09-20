package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mb1 extends cx1 implements j81<Throwable, sd5> {
    public final /* synthetic */ nb1 w;
    public final /* synthetic */ Runnable x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb1(nb1 nb1Var, kb1 kb1Var) {
        super(1);
        this.w = nb1Var;
        this.x = kb1Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(Throwable th) {
        this.w.y.removeCallbacks(this.x);
        return sd5.a;
    }
}
