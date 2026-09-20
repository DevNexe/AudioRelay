package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vf2 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ String w;
    public final /* synthetic */ String x;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf2(String str, String str2, int i) {
        super(2);
        this.w = str;
        this.x = str2;
        this.y = i;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        num.intValue();
        int i = this.y | 1;
        hf2.k(this.w, this.x, g30Var, i);
        return sd5.a;
    }
}
