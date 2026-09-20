package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.ads.ui.banner.AdBannerContainerInputHandler", f = "AdBannerContainerInputHandler.kt", l = {49, 64, 67, 69, 70}, m = "handleInput")
public final class B extends b90 {
    public /* synthetic */ Object A;
    public final /* synthetic */ CGo B;
    public int C;
    public fo1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(CGo cGo, z80<? super B> z80Var) {
        super(z80Var);
        this.B = cGo;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.a(null, null, this);
    }
}
