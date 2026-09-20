package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.runtime.Recomposer$join$2", f = "Recomposer.kt", l = {}, m = "invokeSuspend")
public final class wk3 extends px4 implements x81<uk3.F1, z80<? super Boolean>, Object> {
    public /* synthetic */ Object A;

    public wk3(z80<? super wk3> z80Var) {
        super(2, z80Var);
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        wk3 wk3Var = new wk3(z80Var);
        wk3Var.A = obj;
        return wk3Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        C0239D.H(obj);
        return Boolean.valueOf(((uk3.F1) this.A) == uk3.F1.ShutDown);
    }

    @Override // defpackage.x81
    public final Object invoke(uk3.F1 f1, z80<? super Boolean> z80Var) {
        return ((wk3) a(f1, z80Var)).i(sd5.a);
    }
}
