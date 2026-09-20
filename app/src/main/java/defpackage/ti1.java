package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ti1 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ j81<bi1, sd5> w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti1(int i, j81 j81Var) {
        super(2);
        this.w = j81Var;
        this.x = i;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        num.intValue();
        int i = this.x | 1;
        ni1.d(this.w, g30Var, i);
        return sd5.a;
    }
}
