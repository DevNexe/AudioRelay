package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.ads.ui.banner.AdBannerContainerInputHandler$handleInput$3", f = "AdBannerContainerInputHandler.kt", l = {60, 61}, m = "invokeSuspend")
public final class H2d extends px4 implements x81<gk4<x8W, GKz7, MW>, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ MW C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H2d(MW mw, z80<? super H2d> z80Var) {
        super(2, z80Var);
        this.C = mw;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        H2d h2d = new H2d(this.C, z80Var);
        h2d.B = obj;
        return h2d;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        gk4 gk4Var;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i != 0) {
            if (i == 1) {
                gk4Var = (gk4) this.B;
                C0239D.H(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
            return sd5.a;
        }
        C0239D.H(obj);
        gk4Var = (gk4) this.B;
        long j = this.C.a;
        this.B = gk4Var;
        this.A = 1;
        if (S12N.f(j, this) == va0Var) {
            return va0Var;
        }
        x8W.NUlFixed nUl = x8W.NUlFixed.a;
        this.B = null;
        this.A = 2;
        if (gk4Var.n(nUl, this) == va0Var) {
            return va0Var;
        }
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(gk4<x8W, GKz7, MW> gk4Var, z80<? super sd5> z80Var) {
        return ((H2d) a(gk4Var, z80Var)).i(sd5.a);
    }
}
