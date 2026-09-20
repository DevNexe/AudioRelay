package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c81 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ JBK6 w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c81(JBK6 jbk6, int i) {
        super(2);
        this.w = jbk6;
        this.x = i;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        num.intValue();
        int i = this.x | 1;
        x71.g(this.w, g30Var, i);
        return sd5.a;
    }
}
