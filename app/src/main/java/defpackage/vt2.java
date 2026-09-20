package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "io.ktor.client.engine.okhttp.OkHttpEngineKt$convertToOkHttpBody$3$1", f = "OkHttpEngine.kt", l = {211}, m = "invokeSuspend")
public final class vt2 extends px4 implements x81<uo5, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ dw2 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vt2(dw2 dw2Var, z80<? super vt2> z80Var) {
        super(2, z80Var);
        this.C = dw2Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        vt2 vt2Var = new vt2(this.C, z80Var);
        vt2Var.B = obj;
        return vt2Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            uo5 uo5Var = (uo5) this.B;
            dw2.LPt8Fixed lPt8 = (dw2.LPt8Fixed) this.C;
            uo5Var.l0();
            this.A = 1;
            if (lPt8.d() == va0Var) {
                return va0Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0239D.H(obj);
        }
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(uo5 uo5Var, z80<? super sd5> z80Var) {
        return ((vt2) a(uo5Var, z80Var)).i(sd5.a);
    }
}
