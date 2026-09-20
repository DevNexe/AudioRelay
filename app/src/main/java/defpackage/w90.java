package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w90 extends cx1 implements j81<Z7jl, Boolean> {
    public final /* synthetic */ u45 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w90(u45 u45Var) {
        super(1);
        this.w = u45Var;
    }

    @Override // defpackage.j81
    public final Boolean invoke(Z7jl z7jl) {
        u45.CQf cQf = this.w.o;
        String str = z7jl.w;
        int length = str.length();
        cQf.invoke(new x45(str, Cz.a(length, length), 4));
        return Boolean.TRUE;
    }
}
