package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wy4 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy4(int i) {
        super(2);
        this.w = i;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        num.intValue();
        yy4.f(g30Var, this.w | 1);
        return sd5.a;
    }
}
