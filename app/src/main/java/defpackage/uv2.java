package defpackage;

import com.azefsw.audioconnect.opus.jni.OpusJni;
import com.azefsw.audioconnect.player.decoders.OpusAudioDecoderException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class uv2 implements VFV$ {
    public final OpusJni a;
    public final long b;
    public final int c;
    public final byte[] d = new byte[64000];
    public final ny1 e = new ny1(5);

    public uv2(OpusJni opusJni, long j, int i) {
        this.a = opusJni;
        this.b = j;
        this.c = i;
    }

    @Override // defpackage.VFV$
    public final void a(byte[] bArr, vf0 vf0Var) {
        ny1 ny1Var = this.e;
        try {
            if (((AtomicInteger) ny1Var.w).addAndGet(2) % 2 == 0) {
                int iDecode = this.a.decode(this.b, bArr, bArr.length, this.d, this.c);
                if (iDecode <= 0) {
                    String strValueOf = String.valueOf(iDecode);
                    vv2.a.a(new tv2(strValueOf));
                    throw new OpusAudioDecoderException("Opus decoder failed: " + strValueOf);
                }
                vf0Var.invoke(new qk(this.d, 0, iDecode, false));
                sd5 sd5Var = sd5.a;
            } else {
                sd5 sd5Var2 = sd5.a;
            }
            ((AtomicInteger) ny1Var.w).addAndGet(-2);
        } catch (Throwable th) {
            ((AtomicInteger) ny1Var.w).addAndGet(-2);
            throw th;
        }
    }

    @Override // defpackage.VFV$
    public final void close() {
        this.e.k();
        this.a.destroyDecoder(this.b);
    }
}
