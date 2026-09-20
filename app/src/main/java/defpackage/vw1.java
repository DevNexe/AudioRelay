package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "io.ktor.serialization.kotlinx.KotlinxSerializationBase", f = "KotlinxSerializationBase.kt", l = {23, 36}, m = "serialize$ktor_serialization_kotlinx")
public final class vw1 extends b90 {
    public cb4 A;
    public /* synthetic */ Object B;
    public final /* synthetic */ ww1<Object> C;
    public int D;
    public ww1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw1(ww1<Object> ww1Var, z80<? super vw1> z80Var) {
        super(z80Var);
        this.C = ww1Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.a(null, this);
    }
}
