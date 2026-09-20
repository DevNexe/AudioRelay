package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x65 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ r65 w;
    public final /* synthetic */ j81<r65, sd5> x;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x65(r65 r65Var, j81<? super r65, sd5> j81Var, int i) {
        super(2);
        this.w = r65Var;
        this.x = j81Var;
        this.y = i;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        num.intValue();
        int i = this.y | 1;
        z65.b(this.w, this.x, g30Var, i);
        return sd5.a;
    }
}
