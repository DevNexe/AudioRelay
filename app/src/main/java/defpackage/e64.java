package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$1$1", f = "Scroll.kt", l = {276, 278}, m = "invokeSuspend")
public final class e64 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ m64 C;
    public final /* synthetic */ float D;
    public final /* synthetic */ float E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e64(boolean z, m64 m64Var, float f, float f2, z80<? super e64> z80Var) {
        super(2, z80Var);
        this.B = z;
        this.C = m64Var;
        this.D = f;
        this.E = f2;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new e64(this.B, this.C, this.D, this.E, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            boolean z = this.B;
            m64 m64Var = this.C;
            if (z) {
                this.A = 1;
                if (a64.a(m64Var, this.D, hH.w(0.0f, null, 7), this) == va0Var) {
                    return va0Var;
                }
            } else {
                this.A = 2;
                if (a64.a(m64Var, this.E, hH.w(0.0f, null, 7), this) == va0Var) {
                    return va0Var;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0239D.H(obj);
        }
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((e64) a(ua0Var, z80Var)).i(sd5.a);
    }
}
