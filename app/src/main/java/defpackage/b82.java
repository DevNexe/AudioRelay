package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b82 extends cx1 implements h81<d82> {
    public final /* synthetic */ p72 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b82(p72 p72Var) {
        super(0);
        this.w = p72Var;
    }

    @Override // defpackage.h81
    public final d82 invoke() {
        q72 q72Var = q72.c;
        if (q72Var != null) {
            return (d82) ((j81) q72Var.a.b().x).invoke(this.w);
        }
        ur1.e("INSTANCE");
        throw null;
    }
}
