package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ii4 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii4(int i, int i2) {
        super(2);
        this.w = i;
        this.x = i2;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        num.intValue();
        int i = this.x | 1;
        ci4.i(this.w, g30Var, i);
        return sd5.a;
    }
}
