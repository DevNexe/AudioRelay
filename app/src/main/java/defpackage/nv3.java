package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.server.ui.running.RunningAndroidServerInputHandler$createMicEffectsStream$$inlined$combine$1$3", f = "RunningAndroidServerInputHandler.kt", l = {333}, m = "invokeSuspend")
public final class nv3 extends px4 implements y81<nz0<? super List<? extends le2>>, le2[], z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ nz0 B;
    public /* synthetic */ Object[] C;

    public nv3(z80 z80Var) {
        super(3, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            nz0 nz0Var = this.B;
            List listJ0 = oV9.j0((le2[]) this.C);
            this.A = 1;
            if (nz0Var.f(listJ0, this) == va0Var) {
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
    public final Object invoke(nz0<? super List<? extends le2>> nz0Var, le2[] le2VarArr, z80<? super sd5> z80Var) {
        nv3 nv3Var = new nv3(z80Var);
        nv3Var.B = nz0Var;
        nv3Var.C = le2VarArr;
        return nv3Var.i(sd5.a);
    }
}
