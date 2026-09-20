package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xx3 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ cv3 w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xx3(cv3 cv3Var, int i) {
        super(2);
        this.w = cv3Var;
        this.x = i;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        num.intValue();
        int i = this.x | 1;
        ix3.o(this.w, g30Var, i);
        return sd5.a;
    }
}
