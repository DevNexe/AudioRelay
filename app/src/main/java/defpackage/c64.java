package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2", f = "ScrollExtensions.kt", l = {}, m = "invokeSuspend")
public final class c64 extends px4 implements x81<l64, z80<? super sd5>, Object> {
    public /* synthetic */ Object A;
    public final /* synthetic */ gl3 B;
    public final /* synthetic */ float C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c64(gl3 gl3Var, float f, z80<? super c64> z80Var) {
        super(2, z80Var);
        this.B = gl3Var;
        this.C = f;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        c64 c64Var = new c64(this.B, this.C, z80Var);
        c64Var.A = obj;
        return c64Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        C0239D.H(obj);
        this.B.w = ((l64) this.A).a(this.C);
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(l64 l64Var, z80<? super sd5> z80Var) {
        return ((c64) a(l64Var, z80Var)).i(sd5.a);
    }
}
