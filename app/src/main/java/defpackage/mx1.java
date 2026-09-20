package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.settings.ui.language.LanguagePickerEventHandler$handleEvent$2", f = "LanguagePickerEventHandler.kt", l = {}, m = "invokeSuspend")
public final class mx1 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public final /* synthetic */ nx1 A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx1(nx1 nx1Var, z80<? super mx1> z80Var) {
        super(2, z80Var);
        this.A = nx1Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new mx1(this.A, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        C0239D.H(obj);
        this.A.a.a();
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((mx1) a(ua0Var, z80Var)).i(sd5.a);
    }
}
