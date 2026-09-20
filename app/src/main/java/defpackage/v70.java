package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "io.ktor.serialization.ContentConverterKt$deserialize$result$2", f = "ContentConverter.kt", l = {}, m = "invokeSuspend")
public final class v70 extends px4 implements x81<Object, z80<? super Boolean>, Object> {
    public /* synthetic */ Object A;
    public final /* synthetic */ fk B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v70(fk fkVar, z80<? super v70> z80Var) {
        super(2, z80Var);
        this.B = fkVar;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        v70 v70Var = new v70(this.B, z80Var);
        v70Var.A = obj;
        return v70Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        C0239D.H(obj);
        return Boolean.valueOf(this.A != null || this.B.r());
    }

    @Override // defpackage.x81
    public final Object invoke(Object obj, z80<? super Boolean> z80Var) {
        return ((v70) a(obj, z80Var)).i(sd5.a);
    }
}
