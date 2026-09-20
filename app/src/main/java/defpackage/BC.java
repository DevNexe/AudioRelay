package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.ads.ui.banner.AdBannerContainerInputHandler$initialize$1$1", f = "AdBannerContainerInputHandler.kt", l = {}, m = "invokeSuspend")
public final class BC extends px4 implements x81<Kgd, z80<? super sd5>, Object> {
    public /* synthetic */ Object A;

    public BC(z80<? super BC> z80Var) {
        super(2, z80Var);
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        BC bc = new BC(z80Var);
        bc.A = obj;
        return bc;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        C0239D.H(obj);
        if (((Kgd) this.A) == Kgd.Hide) {
            a62 a62Var = a62.a;
            a62.a.g("detected_user_inactivity", null);
        }
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(Kgd kgd, z80<? super sd5> z80Var) {
        return ((BC) a(kgd, z80Var)).i(sd5.a);
    }
}
