package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c95 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ ou3 w;
    public final /* synthetic */ String x;
    public final /* synthetic */ h81<sd5> y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c95(ou3 ou3Var, String str, h81<sd5> h81Var, int i) {
        super(2);
        this.w = ou3Var;
        this.x = str;
        this.y = h81Var;
        this.z = i;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        num.intValue();
        int i = this.z | 1;
        String str = this.x;
        h81<sd5> h81Var = this.y;
        e95.c(this.w, str, h81Var, g30Var, i);
        return sd5.a;
    }
}
