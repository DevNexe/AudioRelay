package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class iv3 extends cx1 implements j81<n52, sd5> {
    public final /* synthetic */ ev3.LPt8Fixed w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iv3(ev3.LPt8Fixed lPt8) {
        super(1);
        this.w = lPt8;
    }

    @Override // defpackage.j81
    public final sd5 invoke(n52 n52Var) {
        n52 n52Var2 = n52Var;
        ev3.LPt8Fixed lPt8 = this.w;
        n52Var2.b("effect_name", he2.a(lPt8.a));
        n52Var2.a(lPt8.b);
        return sd5.a;
    }
}
