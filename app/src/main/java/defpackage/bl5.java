package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.audio.volume.VolumeShaperStore$getConfigStream$2", f = "VolumeShaperStore.kt", l = {}, m = "invokeSuspend")
public final class bl5 extends px4 implements a91<Boolean, zk5.QnHx, Integer, z80<? super zk5>, Object> {
    public /* synthetic */ boolean A;
    public /* synthetic */ zk5.QnHx B;
    public /* synthetic */ int C;

    public bl5(z80<? super bl5> z80Var) {
        super(4, z80Var);
    }

    @Override // defpackage.a91
    public final Object I(Boolean bool, zk5.QnHx qnHx, Integer num, z80<? super zk5> z80Var) {
        boolean zBooleanValue = bool.booleanValue();
        int iIntValue = num.intValue();
        bl5 bl5Var = new bl5(z80Var);
        bl5Var.A = zBooleanValue;
        bl5Var.B = qnHx;
        bl5Var.C = iIntValue;
        return bl5Var.i(sd5.a);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        C0239D.H(obj);
        return new zk5(this.A, this.B, this.C);
    }
}
