package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.ads.AdTimer$shouldHideStream$3$1", f = "AdTimer.kt", l = {47, 50, 51, 53}, m = "invokeSuspend")
public final class U76 extends px4 implements x81<nz0<? super Kgd>, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ long D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U76(boolean z, long j, z80<? super U76> z80Var) {
        super(2, z80Var);
        this.C = z;
        this.D = j;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        U76 u76 = new U76(this.C, this.D, z80Var);
        u76.B = obj;
        return u76;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0066 A[RETURN] */
    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        nz0 nz0Var;
        Kgd kgd;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        Kgd kgd2 = Kgd.Show;
        if (i != 0) {
            if (i == 1) {
                nz0Var = (nz0) this.B;
                C0239D.H(obj);
            } else if (i == 2) {
                nz0Var = (nz0) this.B;
                C0239D.H(obj);
                kgd = Kgd.Hide;
                this.B = null;
                this.A = 3;
                if (nz0Var.f(kgd, this) == va0Var) {
                    return va0Var;
                }
            } else {
                if (i != 3 && i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
            return sd5.a;
        }
        C0239D.H(obj);
        nz0 nz0Var2 = (nz0) this.B;
        this.B = nz0Var2;
        this.A = 1;
        if (nz0Var2.f(kgd2, this) == va0Var) {
            return va0Var;
        }
        nz0Var = nz0Var2;
        if (this.C) {
            long jG = gq0.g(this.D);
            this.B = nz0Var;
            this.A = 2;
            if (S12N.e(jG, this) == va0Var) {
                return va0Var;
            }
            kgd = Kgd.Hide;
            this.B = null;
            this.A = 3;
            if (nz0Var.f(kgd, this) == va0Var) {
                return va0Var;
            }
        } else {
            this.B = null;
            this.A = 4;
            if (nz0Var.f(kgd2, this) == va0Var) {
                return va0Var;
            }
        }
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(nz0<? super Kgd> nz0Var, z80<? super sd5> z80Var) {
        return ((U76) a(nz0Var, z80Var)).i(sd5.a);
    }
}
