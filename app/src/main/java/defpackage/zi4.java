package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zi4 extends cx1 implements j81<ta1, sd5> {
    public final /* synthetic */ long A;
    public final /* synthetic */ float w;
    public final /* synthetic */ dj4 x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi4(float f, dj4 dj4Var, boolean z, long j, long j2) {
        super(1);
        this.w = f;
        this.x = dj4Var;
        this.y = z;
        this.z = j;
        this.A = j2;
    }

    @Override // defpackage.j81
    public final sd5 invoke(ta1 ta1Var) {
        ta1 ta1Var2 = ta1Var;
        ta1Var2.r(ta1Var2.b0(this.w));
        ta1Var2.Y(this.x);
        ta1Var2.l0(this.y);
        ta1Var2.d0(this.z);
        ta1Var2.s0(this.A);
        return sd5.a;
    }
}
