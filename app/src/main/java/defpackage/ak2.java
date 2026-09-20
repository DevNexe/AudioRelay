package defpackage;

import com.azefsw.audioconnect.player.audio.output.jni.NativeAudioOutputException;
import com.azefsw.nativelibrary.player.audio.NativeAudioJni;
import com.azefsw.nativelibrary.player.audio.NativeAudioStats;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class ak2 implements Bk {
    public final dw4<Throwable> A = new rg3().G();
    public final NativeAudioJni w;
    public final t6r8 x;
    public final sAn y;
    public volatile boolean z;

    public ak2(NativeAudioJni nativeAudioJni, t6r8 t6r8Var, sAn san) {
        this.w = nativeAudioJni;
        this.x = t6r8Var;
        this.y = san;
        System.loadLibrary("native-audio-jni");
        Sb1 sb1 = t6r8Var.f;
        String[] strArrE = nativeAudioJni.e(sb1.a, sb1.c, sb1.b, ((Number) t6r8Var.a.getValue()).intValue(), ((Number) t6r8Var.b.getValue()).intValue(), t6r8Var.h.a, t6r8Var.k);
        bk2 bk2Var = null;
        bk2 bk2Var2 = strArrE == null ? null : new bk2(strArrE[0], strArrE[1]);
        if (bk2Var2 != null) {
            c2 c2Var = dk2.a;
            dk2.a.a(new ck2(bk2Var2));
            bk2Var = bk2Var2;
        }
        if (bk2Var != null) {
            throw new NativeAudioOutputException(bk2Var.b);
        }
    }

    @Override // defpackage.Bk
    public final lx H(c54 c54Var) {
        Acr acr = new Acr(7);
        c54 c54Var2 = j54.b;
        return qw.e(ps0.M(this.A.o(acr), this.y.b(c54Var2), new rw(new fx(new zj2(this, 0)), vq2.r(100L, 100L, TimeUnit.MILLISECONDS, c54Var2).o(new NFo7(this, 9))).c(new rq1(this, 3))));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.w.i();
            this.w.b();
            this.z = true;
            sd5 sd5Var = sd5.a;
        }
    }

    @Override // defpackage.Bk
    public final void k() {
        try {
            synchronized (this) {
                if (this.z) {
                    return;
                }
                this.w.f();
                sd5 sd5Var = sd5.a;
            }
        } catch (Throwable th) {
            this.A.g(th);
        }
    }

    @Override // defpackage.Bk
    public final d73.QnHx r() {
        NativeAudioStats nativeAudioStats = new NativeAudioStats();
        try {
            this.w.a(nativeAudioStats);
            long j = nativeAudioStats.queueSize;
            t6r8 t6r8Var = this.x;
            long j2 = ((long) t6r8Var.g) * j;
            long jH = OW8.h(t6r8Var.f, j2);
            long j3 = ((long) t6r8Var.g) * nativeAudioStats.maxQueueSize;
            long jH2 = OW8.h(t6r8Var.f, j3);
            long j4 = nativeAudioStats.discardedBufferCount * ((long) t6r8Var.g);
            return new d73.QnHx(jH, j2, jH2, j3, j4, OW8.h(t6r8Var.f, j4), 0L);
        } catch (Throwable th) {
            this.A.g(th);
            return d73.QnHx.h;
        }
    }

    @Override // defpackage.Bk
    public final void setVolume(float f) {
        try {
            synchronized (this) {
                if (this.z) {
                    return;
                }
                this.w.g(f);
                sd5 sd5Var = sd5.a;
            }
        } catch (Throwable th) {
            this.A.g(th);
        }
    }
}
