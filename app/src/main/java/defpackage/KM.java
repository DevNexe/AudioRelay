package defpackage;

import androidx.activity.ComponentActivity;
import com.azefsw.audioconnect.ads.AppLifecycle$isResumedStream$1$2$1;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.ads.AppLifecycle$isResumedStream$$inlined$flatMapLatest$1", f = "AppLifecycle.kt", l = {216}, m = "invokeSuspend")
public final class KM extends px4 implements y81<nz0<? super Boolean>, rv2<? extends ComponentActivity>, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ nz0 B;
    public /* synthetic */ Object C;

    public KM(z80 z80Var) {
        super(3, z80Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        mz0 mz0VarO;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            nz0 nz0Var = this.B;
            rv2 rv2Var = (rv2) this.C;
            if (rv2Var instanceof gp2) {
                mz0VarO = new qz0(Boolean.FALSE);
            } else {
                if (!(rv2Var instanceof mq4)) {
                    throw new NoWhenBranchMatchedException();
                }
                am amVar = new am(new AppLifecycle$isResumedStream$1$2$1((ComponentActivity) ((mq4) rv2Var).a, null), xr0.w, -2, lg.SUSPEND);
                qh0 qh0Var = rl0.a;
                mz0VarO = kd.o(amVar, n72.a);
            }
            this.A = 1;
            if (kd.j(this, mz0VarO, nz0Var) == va0Var) {
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

    @Override // defpackage.y81
    public final Object invoke(nz0<? super Boolean> nz0Var, rv2<? extends ComponentActivity> rv2Var, z80<? super sd5> z80Var) {
        KM km = new KM(z80Var);
        km.B = nz0Var;
        km.C = rv2Var;
        return km.i(sd5.a);
    }
}
