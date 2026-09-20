package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pp0 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ int A;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ h81<sd5> x;
    public final /* synthetic */ h81<Float> y;
    public final /* synthetic */ long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pp0(boolean z, h81<sd5> h81Var, h81<Float> h81Var2, long j, int i) {
        super(2);
        this.w = z;
        this.x = h81Var;
        this.y = h81Var2;
        this.z = j;
        this.A = i;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        num.intValue();
        np0.b(this.w, this.x, this.y, this.z, g30Var, this.A | 1);
        return sd5.a;
    }
}
