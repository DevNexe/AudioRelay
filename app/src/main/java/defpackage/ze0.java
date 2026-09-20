package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ze0 extends cx1 implements j81<c54, qw> {
    public final /* synthetic */ af0 w;
    public final /* synthetic */ s50 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ze0(af0 af0Var, s50 s50Var) {
        super(1);
        this.w = af0Var;
        this.x = s50Var;
    }

    @Override // defpackage.j81
    public final qw invoke(c54 c54Var) {
        return new fx(new pq1(2, this.w, this.x)).i(c54Var);
    }
}
