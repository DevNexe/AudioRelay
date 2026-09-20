package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p14 extends l91 implements j81<z80<? super sd5>, Object> {
    public final /* synthetic */ vl0 F;
    public final /* synthetic */ la0 G;
    public final /* synthetic */ Runnable H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p14(av3 av3Var, la0 la0Var, Runnable runnable) {
        super(1, ur1.QnHx.class, "task", "scheduleTask$task(Lio/reactivex/disposables/Disposable;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.F = av3Var;
        this.G = la0Var;
        this.H = runnable;
    }

    @Override // defpackage.j81
    public final Object invoke(z80<? super sd5> z80Var) {
        Runnable runnable = this.H;
        return FNO9.c(this.F, this.G, runnable, z80Var);
    }
}
