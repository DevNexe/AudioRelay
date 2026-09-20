package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.ads.ui.banner.AdBannerContainerInputHandler", f = "AdBannerContainerInputHandler.kt", l = {77, 85, 102}, m = "onInitializationLoaded")
public final class x2v extends b90 {
    public /* synthetic */ Object A;
    public final /* synthetic */ CGo B;
    public int C;
    public fo1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2v(CGo cGo, z80<? super x2v> z80Var) {
        super(z80Var);
        this.B = cGo;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.c(null, null, this);
    }
}
