package defpackage;

import io.ktor.client.engine.ClientEngineClosedException;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$2", f = "HttpClientEngine.kt", l = {99}, m = "invokeSuspend")
public final class bf1 extends px4 implements x81<ua0, z80<? super sg1>, Object> {
    public int A;
    public final /* synthetic */ ze1 B;
    public final /* synthetic */ jg1 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf1(ze1 ze1Var, jg1 jg1Var, z80<? super bf1> z80Var) {
        super(2, z80Var);
        this.B = ze1Var;
        this.C = jg1Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new bf1(this.B, this.C, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            ze1 ze1Var = this.B;
            ms1 ms1Var = (ms1) ze1Var.g().j(ms1.CQf.w);
            if (!(ms1Var != null ? ms1Var.c() : false)) {
                throw new ClientEngineClosedException(0);
            }
            this.A = 1;
            obj = ze1Var.y0(this.C, this);
            if (obj == va0Var) {
                return va0Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0239D.H(obj);
        }
        return obj;
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super sg1> z80Var) {
        return ((bf1) a(ua0Var, z80Var)).i(sd5.a);
    }
}
