package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", f = "Interruptible.kt", l = {}, m = "invokeSuspend")
public final class dq1 extends px4 implements x81<ua0, z80<Object>, Object> {
    public /* synthetic */ Object A;
    public final /* synthetic */ h81<Object> B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq1(h81<Object> h81Var, z80<? super dq1> z80Var) {
        super(2, z80Var);
        this.B = h81Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        dq1 dq1Var = new dq1(this.B, z80Var);
        dq1Var.A = obj;
        return dq1Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        C0239D.H(obj);
        la0 la0VarG = ((ua0) this.A).g();
        h81<Object> h81Var = this.B;
        try {
            l75 l75Var = new l75(AY.B(la0VarG));
            l75Var.c();
            try {
                return h81Var.invoke();
            } finally {
                l75Var.a();
            }
        } catch (InterruptedException e) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
        }
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<Object> z80Var) {
        return ((dq1) a(ua0Var, z80Var)).i(sd5.a);
    }
}
