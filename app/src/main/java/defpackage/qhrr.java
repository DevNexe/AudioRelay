package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.server.ui.AndroidServerEventHandler", f = "AndroidServerEventHandler.kt", l = {56, 55}, m = "openSettings")
public final class qhrr extends b90 {
    public final /* synthetic */ fcT A;
    public int B;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qhrr(fcT fct, z80<? super qhrr> z80Var) {
        super(z80Var);
        this.A = fct;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) {
        this.z = obj;
        this.B |= Integer.MIN_VALUE;
        return this.A.b(null, this);
    }
}
