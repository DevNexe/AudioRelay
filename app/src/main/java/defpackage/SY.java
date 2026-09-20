package defpackage;

import android.media.AudioRecord;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.server.audio.capture.AudioCapture$startRecording$2$1", f = "AudioCapture.kt", l = {77}, m = "invokeSuspend")
public final class SY extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public final /* synthetic */ lfe B;
    public final /* synthetic */ AudioRecord C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SY(lfe lfeVar, AudioRecord audioRecord, z80<? super SY> z80Var) {
        super(2, z80Var);
        this.B = lfeVar;
        this.C = audioRecord;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new SY(this.B, this.C, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            InterfaceC1641t4 interfaceC1641t4 = this.B.d;
            AudioRecord audioRecord = this.C;
            this.A = 1;
            if (interfaceC1641t4.b(audioRecord, this) == va0Var) {
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
        return ((SY) a(ua0Var, z80Var)).i(sd5.a);
    }
}
