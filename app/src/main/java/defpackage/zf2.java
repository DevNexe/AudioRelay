package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zf2 extends cx1 implements j81<Boolean, sd5> {
    public final /* synthetic */ j81<ev3, sd5> w;
    public final /* synthetic */ le2 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public zf2(j81<? super ev3, sd5> j81Var, le2 le2Var) {
        super(1);
        this.w = j81Var;
        this.x = le2Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(Boolean bool) {
        this.w.invoke(new ev3.LPt8Fixed(this.x.a, bool.booleanValue()));
        return sd5.a;
    }
}
