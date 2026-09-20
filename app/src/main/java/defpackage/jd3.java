package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jd3 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ String w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jd3(String str, int i) {
        super(2);
        this.w = str;
        this.x = i;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        num.intValue();
        gd3.h(this.x | 1, g30Var, this.w);
        return sd5.a;
    }
}
