package defpackage;

import java.nio.charset.CharsetDecoder;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.copperleaf.ballast.debugger.BallastDebuggerClientConnection$processIncoming$1", f = "BallastDebuggerClientConnection.kt", l = {290}, m = "invokeSuspend")
public final class y6 extends px4 implements x81<p61.YKK, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ k6<hf1> C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6(k6<hf1> k6Var, z80<? super y6> z80Var) {
        super(2, z80Var);
        this.C = k6Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        y6 y6Var = new y6(this.C, z80Var);
        y6Var.B = obj;
        return y6Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            p61.YKK ykk = (p61.YKK) this.B;
            if (!ykk.a) {
                throw new IllegalArgumentException("Text could be only extracted from non-fragmented frame".toString());
            }
            CharsetDecoder charsetDecoderNewDecoder = up.a.newDecoder();
            ek ekVar = new ek(null);
            try {
                Th.E(ekVar, ykk.c);
                j6 j6Var = (j6) ju1.a.c(j6.Companion.serializer(), ps0.w(charsetDecoderNewDecoder, ekVar.s(), Integer.MAX_VALUE));
                nj4 nj4Var = this.C.h;
                this.A = 1;
                if (nj4Var.f(j6Var, this) == va0Var) {
                    return va0Var;
                }
            } catch (Throwable th) {
                ekVar.close();
                throw th;
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
    public final Object invoke(p61.YKK ykk, z80<? super sd5> z80Var) {
        return ((y6) a(ykk, z80Var)).i(sd5.a);
    }
}
