package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sf2 extends cx1 implements j81<Boolean, sd5> {
    public final /* synthetic */ te2 w;
    public final /* synthetic */ j81<ev3, sd5> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public sf2(te2 te2Var, j81<? super ev3, sd5> j81Var) {
        super(1);
        this.w = te2Var;
        this.x = j81Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        boolean z = this.w.f;
        j81<ev3, sd5> j81Var = this.x;
        if (z) {
            j81Var.invoke(new ev3.Xn1(2));
        } else {
            j81Var.invoke(new ev3.Z(zBooleanValue));
        }
        return sd5.a;
    }
}
