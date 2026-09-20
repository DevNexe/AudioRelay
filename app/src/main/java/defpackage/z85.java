package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z85 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ h81<sd5> w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z85(h81<sd5> h81Var, int i) {
        super(2);
        this.w = h81Var;
        this.x = i;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        num.intValue();
        int i = this.x | 1;
        e95.b(this.w, g30Var, i);
        return sd5.a;
    }
}
