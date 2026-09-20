package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t22 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ n22 w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t22(n22 n22Var, int i) {
        super(2);
        this.w = n22Var;
        this.x = i;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        num.intValue();
        int i = this.x | 1;
        r22.c(this.w, g30Var, i);
        return sd5.a;
    }
}
