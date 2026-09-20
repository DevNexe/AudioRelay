package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ue4 extends cx1 implements j81<Throwable, sd5> {
    public final /* synthetic */ ve4 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue4(ve4 ve4Var) {
        super(1);
        this.w = ve4Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(Throwable th) {
        this.w.stop();
        return sd5.a;
    }
}
