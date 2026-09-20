package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class du3 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ y81<ke, g30, Integer, sd5> w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public du3(y81<? super ke, ? super g30, ? super Integer, sd5> y81Var, int i) {
        super(2);
        this.w = y81Var;
        this.x = i;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        num.intValue();
        int i = this.x | 1;
        yt3.c(this.w, g30Var, i);
        return sd5.a;
    }
}
