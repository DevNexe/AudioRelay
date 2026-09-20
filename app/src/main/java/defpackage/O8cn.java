package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.ads.AdTimer$shouldHideStream-QTBD994$$inlined$flatMapLatest$1", f = "AdTimer.kt", l = {216}, m = "invokeSuspend")
public final class O8cn extends px4 implements y81<nz0<? super Kgd>, Boolean, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ nz0 B;
    public /* synthetic */ Object C;
    public final /* synthetic */ long D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O8cn(long j, z80 z80Var) {
        super(3, z80Var);
        this.D = j;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            nz0 nz0Var = this.B;
            d24 d24Var = new d24(new U76(((Boolean) this.C).booleanValue(), this.D, null));
            this.A = 1;
            if (kd.j(this, d24Var, nz0Var) == va0Var) {
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
    public final Object invoke(nz0<? super Kgd> nz0Var, Boolean bool, z80<? super sd5> z80Var) {
        O8cn o8cn = new O8cn(this.D, z80Var);
        o8cn.B = nz0Var;
        o8cn.C = bool;
        return o8cn.i(sd5.a);
    }
}
