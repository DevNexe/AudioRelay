package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.server.ui.running.RunningAndroidServerInputHandler$getInitializationFlows$9", f = "RunningAndroidServerInputHandler.kt", l = {}, m = "invokeSuspend")
public final class nw3 extends px4 implements y81<Boolean, List<? extends le2>, z80<? super ne2>, Object> {
    public /* synthetic */ Boolean A;
    public /* synthetic */ List B;

    public nw3(z80<? super nw3> z80Var) {
        super(3, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        C0239D.H(obj);
        Boolean bool = this.A;
        List list = this.B;
        return new ne2(new kj1(list), bool.booleanValue());
    }

    @Override // defpackage.y81
    public final Object invoke(Boolean bool, List<? extends le2> list, z80<? super ne2> z80Var) {
        nw3 nw3Var = new nw3(z80Var);
        nw3Var.A = bool;
        nw3Var.B = list;
        return nw3Var.i(sd5.a);
    }
}
