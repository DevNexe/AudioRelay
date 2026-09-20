package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import com.google.android.gms.internal.ads.zzdd;
import com.google.android.gms.internal.ads.zzel;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzqj;
import defpackage.t97;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class i97 implements zzqj {
    public final MediaCodec a;
    public final t97 b;
    public final s97 c;
    public boolean d;
    public int e = 0;

    public /* synthetic */ i97(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2) {
        this.a = mediaCodec;
        this.b = new t97(handlerThread);
        this.c = new s97(mediaCodec, handlerThread2);
    }

    public static void a(i97 i97Var, MediaFormat mediaFormat, Surface surface) {
        t97 t97Var = i97Var.b;
        zzdd.zzf(t97Var.c == null);
        HandlerThread handlerThread = t97Var.b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = i97Var.a;
        mediaCodec.setCallback(t97Var, handler);
        t97Var.c = handler;
        int i = zzel.zza;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, (MediaCrypto) null, 0);
        Trace.endSection();
        s97 s97Var = i97Var.c;
        if (!s97Var.f) {
            HandlerThread handlerThread2 = s97Var.b;
            handlerThread2.start();
            s97Var.c = new j97(s97Var, handlerThread2.getLooper());
            s97Var.f = true;
        }
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        i97Var.e = 1;
    }

    public static String b(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final int zza() {
        int i;
        t97 t97Var = this.b;
        synchronized (t97Var.a) {
            i = -1;
            if (!(t97Var.k > 0 || t97Var.l)) {
                IllegalStateException illegalStateException = t97Var.m;
                if (illegalStateException != null) {
                    t97Var.m = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = t97Var.j;
                if (codecException != null) {
                    t97Var.j = null;
                    throw codecException;
                }
                w97 w97Var = t97Var.d;
                int i2 = w97Var.c;
                if (!(i2 == 0)) {
                    if (i2 == 0) {
                        throw new NoSuchElementException();
                    }
                    int[] iArr = w97Var.d;
                    int i3 = w97Var.a;
                    int i4 = iArr[i3];
                    w97Var.a = (i3 + 1) & w97Var.e;
                    w97Var.c = i2 - 1;
                    i = i4;
                }
            }
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        int i;
        t97 t97Var = this.b;
        synchronized (t97Var.a) {
            i = -1;
            if (!(t97Var.k > 0 || t97Var.l)) {
                IllegalStateException illegalStateException = t97Var.m;
                if (illegalStateException != null) {
                    t97Var.m = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = t97Var.j;
                if (codecException != null) {
                    t97Var.j = null;
                    throw codecException;
                }
                w97 w97Var = t97Var.e;
                int i2 = w97Var.c;
                if (!(i2 == 0)) {
                    if (i2 == 0) {
                        throw new NoSuchElementException();
                    }
                    int[] iArr = w97Var.d;
                    int i3 = w97Var.a;
                    int i4 = iArr[i3];
                    w97Var.a = (i3 + 1) & w97Var.e;
                    w97Var.c = i2 - 1;
                    if (i4 >= 0) {
                        zzdd.zzb(t97Var.h);
                        MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) t97Var.f.remove();
                        bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                    } else if (i4 == -2) {
                        t97Var.h = (MediaFormat) t97Var.g.remove();
                        i = -2;
                    }
                    i = i4;
                }
            }
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final MediaFormat zzc() {
        MediaFormat mediaFormat;
        t97 t97Var = this.b;
        synchronized (t97Var.a) {
            mediaFormat = t97Var.h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final ByteBuffer zzf(int i) {
        return this.a.getInputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final ByteBuffer zzg(int i) {
        return this.a.getOutputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final void zzi() {
        this.c.a();
        this.a.flush();
        final t97 t97Var = this.b;
        synchronized (t97Var.a) {
            t97Var.k++;
            Handler handler = t97Var.c;
            int i = zzel.zza;
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqb
                @Override // java.lang.Runnable
                public final void run() {
                    t97 t97Var2 = t97Var;
                    synchronized (t97Var2.a) {
                        if (t97Var2.l) {
                            return;
                        }
                        long j = t97Var2.k - 1;
                        t97Var2.k = j;
                        if (j > 0) {
                            return;
                        }
                        if (j >= 0) {
                            t97Var2.a();
                            return;
                        }
                        IllegalStateException illegalStateException = new IllegalStateException();
                        synchronized (t97Var2.a) {
                            t97Var2.m = illegalStateException;
                        }
                    }
                }
            });
        }
        this.a.start();
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final void zzj(int i, int i2, int i3, long j, int i4) {
        k97 k97Var;
        s97 s97Var = this.c;
        RuntimeException runtimeException = (RuntimeException) s97Var.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        ArrayDeque arrayDeque = s97.g;
        synchronized (arrayDeque) {
            k97Var = arrayDeque.isEmpty() ? new k97() : (k97) arrayDeque.removeFirst();
        }
        k97Var.a = i;
        k97Var.b = i3;
        k97Var.d = j;
        k97Var.e = i4;
        j97 j97Var = s97Var.c;
        int i5 = zzel.zza;
        j97Var.obtainMessage(0, k97Var).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final void zzk(int i, int i2, zzgd zzgdVar, long j, int i3) {
        this.c.b(i, zzgdVar, j);
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final void zzl() {
        try {
            if (this.e == 1) {
                s97 s97Var = this.c;
                if (s97Var.f) {
                    s97Var.a();
                    s97Var.b.quit();
                }
                s97Var.f = false;
                t97 t97Var = this.b;
                synchronized (t97Var.a) {
                    t97Var.l = true;
                    t97Var.b.quit();
                    t97Var.a();
                }
            }
            this.e = 2;
            if (this.d) {
                return;
            }
            this.a.release();
            this.d = true;
        } catch (Throwable th) {
            if (!this.d) {
                this.a.release();
                this.d = true;
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final void zzm(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final void zzn(int i, boolean z) {
        this.a.releaseOutputBuffer(i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final void zzo(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final void zzp(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final void zzq(int i) {
        this.a.setVideoScalingMode(i);
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final boolean zzr() {
        return false;
    }
}
