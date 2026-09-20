package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.player.device.ClientRuntimePropertiesSenderTask$send$1", f = "ClientRuntimePropertiesSenderTask.kt", l = {42}, m = "invokeSuspend")
public final class ls extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public final /* synthetic */ ms B;
    public final /* synthetic */ ad2 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ls(ms msVar, ad2 ad2Var, z80<? super ls> z80Var) {
        super(2, z80Var);
        this.B = msVar;
        this.C = ad2Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new ls(this.B, this.C, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            sd2 sd2Var = this.B.a;
            this.A = 1;
            if (sd2Var.b(this.C, this) == va0Var) {
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
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((ls) a(ua0Var, z80Var)).i(sd5.a);
    }
}
