package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.player.AddressStore$saveManualAddress$4", f = "AddressStore.kt", l = {}, m = "invokeSuspend")
public final class et extends px4 implements x81<String, z80<? super sd5>, Object> {
    public /* synthetic */ Object A;
    public final /* synthetic */ X1GO B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et(X1GO x1go, z80<? super et> z80Var) {
        super(2, z80Var);
        this.B = x1go;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        et etVar = new et(this.B, z80Var);
        etVar.A = obj;
        return etVar;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        C0239D.H(obj);
        this.B.b.f("prefs_custom_connections", (String) this.A);
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(String str, z80<? super sd5> z80Var) {
        return ((et) a(str, z80Var)).i(sd5.a);
    }
}
