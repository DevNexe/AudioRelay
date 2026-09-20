package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.player.ui.running.RunningPlayerInputHandler$stop$2", f = "RunningPlayerInputHandler.kt", l = {166}, m = "invokeSuspend")
public final class mz3 extends px4 implements x81<gk4<sy3, ry3, uy3>, z80<? super sd5>, Object> {
    public int A;
    public final /* synthetic */ oz3 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mz3(oz3 oz3Var, z80<? super mz3> z80Var) {
        super(2, z80Var);
        this.B = oz3Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new mz3(this.B, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            a62.a.e("called_stop_from_running_screen");
            ny1 ny1Var = this.B.a;
            ds2 ds2VarF = ((ln2) ny1Var.w).f(j54.c);
            ds2VarF.getClass();
            zr2 zr2Var = new zr2(new jr2(new pr2(new zs2(ds2VarF), new tn2(2)), new rq1(ny1Var, 8), m91.d, m91.c));
            this.A = 1;
            if (JUCk.b(zr2Var, this) == va0Var) {
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
    public final Object invoke(gk4<sy3, ry3, uy3> gk4Var, z80<? super sd5> z80Var) {
        return ((mz3) a(gk4Var, z80Var)).i(sd5.a);
    }
}
