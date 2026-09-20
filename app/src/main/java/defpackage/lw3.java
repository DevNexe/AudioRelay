package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.server.ui.running.RunningAndroidServerInputHandler$getInitializationFlows$4", f = "RunningAndroidServerInputHandler.kt", l = {}, m = "invokeSuspend")
public final class lw3 extends px4 implements a91<String, cv3, Map<of4, ? extends gl0>, z80<? super ev3.qc>, Object> {
    public /* synthetic */ String A;
    public /* synthetic */ cv3 B;
    public /* synthetic */ Map C;

    public lw3(z80<? super lw3> z80Var) {
        super(4, z80Var);
    }

    @Override // defpackage.a91
    public final Object I(String str, cv3 cv3Var, Map<of4, ? extends gl0> map, z80<? super ev3.qc> z80Var) {
        lw3 lw3Var = new lw3(z80Var);
        lw3Var.A = str;
        lw3Var.B = cv3Var;
        lw3Var.C = map;
        return lw3Var.i(sd5.a);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        C0239D.H(obj);
        return new ev3.qc(this.A, this.B, this.C);
    }
}
