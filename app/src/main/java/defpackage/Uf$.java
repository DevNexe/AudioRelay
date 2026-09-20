package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.ads.ui.banner.AdBannerContainerInputHandler$onInitializationLoaded$4", f = "AdBannerContainerInputHandler.kt", l = {105, 107}, m = "invokeSuspend")
public final class Uf$ extends px4 implements x81<gk4<x8W, GKz7, MW>, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;

    public Uf$(z80<? super Uf$> z80Var) {
        super(2, z80Var);
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        Uf$ uf$ = new Uf$(z80Var);
        uf$.B = obj;
        return uf$;
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
        a62 a62Var = a62.a;
        long j = NB.b;
        this.B = gk4Var;
        this.A = 1;
        if (S12N.f(j, this) == va0Var) {
            return va0Var;
        }
        a62 a62Var2 = a62.a;
        x8W.F1 f1 = x8W.F1.a;
        this.B = null;
        this.A = 2;
        if (gk4Var.n(f1, this) == va0Var) {
            return va0Var;
        }
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(gk4<x8W, GKz7, MW> gk4Var, z80<? super sd5> z80Var) {
        return ((Uf$) a(gk4Var, z80Var)).i(sd5.a);
    }
}
