package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.server.ui.running.RunningAndroidServerInputHandler$getInitializationFlows$7", f = "RunningAndroidServerInputHandler.kt", l = {195}, m = "invokeSuspend")
public final class mw3 extends px4 implements x81<nz0<? super List<? extends me2>>, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ gx3 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw3(gx3 gx3Var, z80<? super mw3> z80Var) {
        super(2, z80Var);
        this.C = gx3Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        mw3 mw3Var = new mw3(this.C, z80Var);
        mw3Var.B = obj;
        return mw3Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            nz0 nz0Var = (nz0) this.B;
            List<me2> listA = this.C.p.a();
            this.A = 1;
            if (nz0Var.f(listA, this) == va0Var) {
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
    public final Object invoke(nz0<? super List<? extends me2>> nz0Var, z80<? super sd5> z80Var) {
        return ((mw3) a(nz0Var, z80Var)).i(sd5.a);
    }
}
