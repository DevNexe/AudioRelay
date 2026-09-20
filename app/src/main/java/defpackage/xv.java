package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.server.audio.capture.AudioCapture$startRecording$2$3", f = "AudioCapture.kt", l = {82}, m = "invokeSuspend")
public final class xv extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public final /* synthetic */ MUpZ B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xv(MUpZ mUpZ, z80<? super xv> z80Var) {
        super(2, z80Var);
        this.B = mUpZ;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new xv(this.B, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            this.A = 1;
            if (this.B.a(this) == va0Var) {
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
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((xv) a(ua0Var, z80Var)).i(sd5.a);
    }
}
