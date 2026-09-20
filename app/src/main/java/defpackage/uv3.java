package defpackage;

import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.server.ui.running.RunningAndroidServerInputHandler$getInitializationFlows$$inlined$flatMapLatest$1", f = "RunningAndroidServerInputHandler.kt", l = {216}, m = "invokeSuspend")
public final class uv3 extends px4 implements y81<nz0<? super Map<of4, ? extends gl0>>, jc4, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ nz0 B;
    public /* synthetic */ Object C;
    public final /* synthetic */ gx3 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv3(gx3 gx3Var, z80 z80Var) {
        super(3, z80Var);
        this.D = gx3Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        mz0 wg3Var;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            nz0 nz0Var = this.B;
            jc4 jc4Var = (jc4) this.C;
            if (ur1.a(jc4Var, jc4.QnHx.a)) {
                wg3Var = new qz0(ds0.w);
            } else {
                if (!(jc4Var instanceof jc4.CQf)) {
                    throw new NoWhenBranchMatchedException();
                }
                jc4.CQf cQf = (jc4.CQf) jc4Var;
                gx3 gx3Var = this.D;
                gx3Var.getClass();
                c54 c54Var = j54.b;
                a11 a11VarF = gx3Var.j.a(c54Var).F(5);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                if (timeUnit == null) {
                    throw new NullPointerException("unit is null");
                }
                g11 g11Var = new g11(Math.max(0L, 1000L), Math.max(0L, 1000L), timeUnit, c54Var);
                if (0L == null) {
                    throw new NullPointerException("value is null");
                }
                c11 c11Var = new c11(new sg3[]{new h11(0L), g11Var});
                m91.CQf cQf2 = new m91.CQf(new la(3));
                int i2 = a11.w;
                mq2.c(i2, "bufferSize");
                k11 k11Var = new k11(new i11(new b11(new sg3[]{a11VarF, c11Var}, cQf2, i2), new i71(7, gx3Var, cQf)));
                u80[] u80VarArr = bi3.a;
                wg3Var = new wg3(k11Var, xr0.w, -2, lg.SUSPEND);
            }
            this.A = 1;
            if (kd.j(this, wg3Var, nz0Var) == va0Var) {
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
    public final Object invoke(nz0<? super Map<of4, ? extends gl0>> nz0Var, jc4 jc4Var, z80<? super sd5> z80Var) {
        uv3 uv3Var = new uv3(this.D, z80Var);
        uv3Var.B = nz0Var;
        uv3Var.C = jc4Var;
        return uv3Var.i(sd5.a);
    }
}
