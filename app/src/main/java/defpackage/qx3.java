package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qx3 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ int A;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ ej1 x;
    public final /* synthetic */ String y;
    public final /* synthetic */ h81<sd5> z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qx3(boolean z, ej1 ej1Var, String str, h81<sd5> h81Var, int i) {
        super(2);
        this.w = z;
        this.x = ej1Var;
        this.y = str;
        this.z = h81Var;
        this.A = i;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        num.intValue();
        ix3.m(this.w, this.x, this.y, this.z, g30Var, this.A | 1);
        return sd5.a;
    }
}
