package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.player.network.messages.MessageReceiverSessionTask", f = "MessageReceiverSessionTask.kt", l = {104}, m = "tryRead")
public final class rd2 extends b90 {
    public final /* synthetic */ md2 A;
    public int B;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd2(md2 md2Var, z80<? super rd2> z80Var) {
        super(z80Var);
        this.A = md2Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) {
        this.z = obj;
        this.B |= Integer.MIN_VALUE;
        return md2.a(this.A, null, null, this);
    }
}
