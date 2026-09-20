package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class og1 extends cx1 implements j81<Throwable, sd5> {
    public final /* synthetic */ jx w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public og1(os1 os1Var) {
        super(1);
        this.w = os1Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(Throwable th) {
        Throwable th2 = th;
        jx jxVar = this.w;
        if (th2 != null) {
            jxVar.m(ps0.b("Engine failed", th2));
        } else {
            jxVar.h();
        }
        return sd5.a;
    }
}
