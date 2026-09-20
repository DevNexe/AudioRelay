package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wh3 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ String w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wh3(String str, int i) {
        super(2);
        this.w = str;
        this.x = i;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 11) == 2 && g30Var2.t()) {
            g30Var2.x();
        } else {
            e40.CQf cQf = e40.a;
            q70.a(X.m(g30Var2, 2099112376, new vh3(this.w, this.x)), g30Var2, 6);
        }
        return sd5.a;
    }
}
