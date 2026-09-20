package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.ads.AdTimer$shouldHideStream$4", f = "AdTimer.kt", l = {61}, m = "invokeSuspend")
public final class foo extends px4 implements y81<Kgd, Kgd, z80<? super Kgd>, Object> {
    public int A;
    public /* synthetic */ Kgd B;
    public /* synthetic */ Kgd C;
    public final /* synthetic */ long D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public foo(long j, z80<? super foo> z80Var) {
        super(3, z80Var);
        this.D = j;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        Kgd kgd;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            Kgd kgd2 = this.B;
            Kgd kgd3 = this.C;
            if (kgd2 != Kgd.Hide || kgd3 != Kgd.Show) {
                return kgd3;
            }
            a62 a62Var = a62.a;
            this.B = kgd3;
            this.A = 1;
            if (S12N.f(this.D, this) == va0Var) {
                return va0Var;
            }
            kgd = kgd3;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kgd = this.B;
            C0239D.H(obj);
        }
        a62.a.c("Restoring ads…");
        return kgd;
    }

    @Override // defpackage.y81
    public final Object invoke(Kgd kgd, Kgd kgd2, z80<? super Kgd> z80Var) {
        foo fooVar = new foo(this.D, z80Var);
        fooVar.B = kgd;
        fooVar.C = kgd2;
        return fooVar.i(sd5.a);
    }
}
