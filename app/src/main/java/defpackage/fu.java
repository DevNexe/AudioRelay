package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.ads.AdTimer$shouldHideStream$2", f = "AdTimer.kt", l = {}, m = "invokeSuspend")
public final class fu extends px4 implements y81<sd5, Boolean, z80<? super Boolean>, Object> {
    public /* synthetic */ boolean A;

    public fu(z80<? super fu> z80Var) {
        super(3, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        C0239D.H(obj);
        return Boolean.valueOf(this.A);
    }

    @Override // defpackage.y81
    public final Object invoke(sd5 sd5Var, Boolean bool, z80<? super Boolean> z80Var) {
        boolean zBooleanValue = bool.booleanValue();
        fu fuVar = new fu(z80Var);
        fuVar.A = zBooleanValue;
        return fuVar.i(sd5.a);
    }
}
