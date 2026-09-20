package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class td3 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ String w;
    public final /* synthetic */ String x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td3(String str, String str2) {
        super(2);
        this.w = str;
        this.x = str2;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) throws ClassNotFoundException {
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 11) == 2 && g30Var2.t()) {
            g30Var2.x();
        } else {
            YKK.e(this.w, this.x, g30Var2, new Object[0]);
        }
        return sd5.a;
    }
}
