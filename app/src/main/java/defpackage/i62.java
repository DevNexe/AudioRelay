package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i62 extends cx1 implements h81<sd5> {
    public final /* synthetic */ g25 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i62(g25 g25Var) {
        super(0);
        this.w = g25Var;
    }

    @Override // defpackage.h81
    public final sd5 invoke() {
        this.w.onStop();
        return sd5.a;
    }
}
