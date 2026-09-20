package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.compose.components.contributors.ComposableSingletons$TranslatorsKt$lambda-1$1$1$1", f = "Translators.kt", l = {}, m = "invokeSuspend")
public final class s20 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public final /* synthetic */ b31 A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s20(b31 b31Var, z80<? super s20> z80Var) {
        super(2, z80Var);
        this.A = b31Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new s20(this.A, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        C0239D.H(obj);
        this.A.a();
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((s20) a(ua0Var, z80Var)).i(sd5.a);
    }
}
