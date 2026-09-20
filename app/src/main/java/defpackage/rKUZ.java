package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.ads.ui.banner.AdBannerContainerInputHandler$initialize$$inlined$flatMapLatest$1", f = "AdBannerContainerInputHandler.kt", l = {216}, m = "invokeSuspend")
public final class rKUZ extends px4 implements y81<nz0<? super x8W.LPt8Fixed>, rv2<? extends V>, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ nz0 B;
    public /* synthetic */ Object C;
    public final /* synthetic */ CGo D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rKUZ(CGo cGo, z80 z80Var) {
        super(3, z80Var);
        this.D = cGo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        mz0 an3Var;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            nz0 nz0Var = this.B;
            rv2 rv2Var = (rv2) this.C;
            gp2 gp2Var = gp2.a;
            if (ur1.a(rv2Var, gp2Var)) {
                an3Var = new qz0(new x8W.LPt8Fixed(gp2Var, Kgd.Show));
            } else {
                if (!(rv2Var instanceof mq4)) {
                    throw new NoWhenBranchMatchedException();
                }
                vAt vat = this.D.b;
                d24 d24Var = vat.a.b;
                mz0 mz0VarI = kd.i(kd.G(new ii3(vat.b.a.a, null), new KM(null)));
                V v = (V) ((mq4) rv2Var).a;
                an3Var = new an3(new r01(new BC(null), new s01(kd.i(kd.G(new w01(new wz0(new nsBL(null), d24Var), mz0VarI, new fu(null)), new O8cn(v.c, null))), new foo(v.d, null))), rv2Var);
            }
            this.A = 1;
            if (kd.j(this, an3Var, nz0Var) == va0Var) {
                return va0Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0239D.H(obj);
        }
        return sd5.a;
    }

    @Override // defpackage.y81
    public final Object invoke(nz0<? super x8W.LPt8Fixed> nz0Var, rv2<? extends V> rv2Var, z80<? super sd5> z80Var) {
        rKUZ rkuz = new rKUZ(this.D, z80Var);
        rkuz.B = nz0Var;
        rkuz.C = rv2Var;
        return rkuz.i(sd5.a);
    }
}
