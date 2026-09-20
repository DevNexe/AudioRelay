package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.player.ui.PlayerEventHandler$handleEvent$3", f = "PlayerEventHandler.kt", l = {44}, m = "invokeSuspend")
public final class k63 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public final /* synthetic */ l63 B;
    public final /* synthetic */ f63 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k63(l63 l63Var, f63 f63Var, z80<? super k63> z80Var) {
        super(2, z80Var);
        this.B = l63Var;
        this.C = f63Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new k63(this.B, this.C, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        Object objB;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            y61 y61Var = ((f63.F1) this.C).a;
            this.A = 1;
            l63 l63Var = this.B;
            l63Var.getClass();
            a62.a.e("called_show_full_screen_ad");
            int iOrdinal = y61Var.ordinal();
            bm2 bm2Var = l63Var.c;
            vq1 vq1Var = l63Var.b;
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    vq1Var.a();
                } else if (iOrdinal != 2 || (objB = bm2Var.b(ou3.auxFixed.e, null, this)) != va0Var) {
                    objB = sd5.a;
                }
                objB = sd5.a;
            } else if (vq1Var.a() || (objB = bm2Var.b(ou3.auxFixed.e, null, this)) != va0Var) {
                objB = sd5.a;
            }
            if (objB == va0Var) {
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

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((k63) a(ua0Var, z80Var)).i(sd5.a);
    }
}
