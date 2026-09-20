package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b35 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ long w;
    public final /* synthetic */ x81<g30, Integer, sd5> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b35(long j, x81<? super g30, ? super Integer, sd5> x81Var) {
        super(2);
        this.w = j;
        this.x = x81Var;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 11) == 2 && g30Var2.t()) {
            g30Var2.x();
        } else {
            e35.b(this.w, null, null, this.x, g30Var2, 0, 6);
        }
        return sd5.a;
    }
}
