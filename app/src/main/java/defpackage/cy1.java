package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cy1 extends cx1 implements j81<Throwable, sd5> {
    public final /* synthetic */ dy1 w;
    public final /* synthetic */ wm<sd5> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy1(dy1 dy1Var, xm xmVar) {
        super(1);
        this.w = dy1Var;
        this.x = xmVar;
    }

    @Override // defpackage.j81
    public final sd5 invoke(Throwable th) {
        dy1 dy1Var = this.w;
        Object obj = dy1Var.a;
        wm<sd5> wmVar = this.x;
        synchronized (obj) {
            dy1Var.b.remove(wmVar);
        }
        return sd5.a;
    }
}
