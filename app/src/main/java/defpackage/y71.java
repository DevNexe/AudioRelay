package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y71 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y71(int i) {
        super(2);
        this.w = i;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        num.intValue();
        x71.e(g30Var, this.w | 1);
        return sd5.a;
    }
}
