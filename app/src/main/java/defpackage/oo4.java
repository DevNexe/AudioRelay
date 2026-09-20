package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oo4 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ x81<g30, Integer, sd5> w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo4(int i, x81 x81Var) {
        super(2);
        this.w = x81Var;
        this.x = i;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        num.intValue();
        int i = this.x | 1;
        jo4.e(this.w, g30Var, i);
        return sd5.a;
    }
}
