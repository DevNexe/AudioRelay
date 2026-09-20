package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ay3 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ kc4 w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay3(kc4 kc4Var, int i) {
        super(2);
        this.w = kc4Var;
        this.x = i;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        num.intValue();
        int i = this.x | 1;
        ix3.q(this.w, g30Var, i);
        return sd5.a;
    }
}
