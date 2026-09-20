package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import defpackage.a42;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
@TargetApi(16)
public final class zzbaw extends zzawq {
    public final Context Q;
    public final zzbay R;
    public final zzbbg S;
    public final boolean T;
    public final long[] U;
    public zzass[] V;
    public zzbav W;
    public Surface X;
    public zzbat Y;
    public boolean Z;
    public long a0;
    public long b0;
    public int c0;
    public int d0;
    public int e0;
    public float f0;
    public int g0;
    public int h0;
    public int i0;
    public float j0;
    public int k0;
    public int l0;
    public int m0;
    public float n0;
    public long o0;
    public int p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbaw(Context context, zzaws zzawsVar, long j, Handler handler, zzbbh zzbbhVar, int i) {
        super(2, zzawsVar, null, false);
        boolean z = false;
        this.Q = context.getApplicationContext();
        this.R = new zzbay(context);
        this.S = new zzbbg(handler, zzbbhVar);
        if (zzban.zza <= 22 && "foster".equals(zzban.zzb) && "NVIDIA".equals(zzban.zzc)) {
            z = true;
        }
        this.T = z;
        this.U = new long[10];
        this.o0 = -9223372036854775807L;
        this.a0 = -9223372036854775807L;
        this.g0 = -1;
        this.h0 = -1;
        this.j0 = -1.0f;
        this.f0 = -1.0f;
        this.k0 = -1;
        this.l0 = -1;
        this.n0 = -1.0f;
        this.m0 = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzawq, com.google.android.gms.internal.ads.zzasc
    public final void b() {
        zzbbg zzbbgVar = this.S;
        this.g0 = -1;
        this.h0 = -1;
        this.j0 = -1.0f;
        this.f0 = -1.0f;
        this.o0 = -9223372036854775807L;
        this.p0 = 0;
        this.k0 = -1;
        this.l0 = -1;
        this.n0 = -1.0f;
        this.m0 = -1;
        this.Z = false;
        int i = zzban.zza;
        this.R.zzb();
        try {
            super.b();
        } finally {
            this.O.zza();
            zzbbgVar.zzc(this.O);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawq, com.google.android.gms.internal.ads.zzasc
    public final void c(boolean z) {
        super.c(z);
        int i = this.b.zzb;
        this.S.zze(this.O);
        this.R.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzawq, com.google.android.gms.internal.ads.zzasc
    public final void d(long j, boolean z) {
        super.d(j, z);
        this.Z = false;
        int i = zzban.zza;
        this.d0 = 0;
        int i2 = this.p0;
        if (i2 != 0) {
            this.o0 = this.U[i2 - 1];
            this.p0 = 0;
        }
        this.a0 = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzasc
    public final void e() {
        this.c0 = 0;
        this.b0 = SystemClock.elapsedRealtime();
        this.a0 = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzasc
    public final void f() {
        if (this.c0 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.b0;
            this.S.zzd(this.c0, jElapsedRealtime - j);
            this.c0 = 0;
            this.b0 = jElapsedRealtime;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasc
    public final void g(zzass[] zzassVarArr, long j) {
        this.V = zzassVarArr;
        if (this.o0 == -9223372036854775807L) {
            this.o0 = j;
            return;
        }
        int i = this.p0;
        long[] jArr = this.U;
        if (i == 10) {
            Log.w("MediaCodecVideoRenderer", "Too many stream changes, so dropping offset: " + jArr[9]);
        } else {
            this.p0 = i + 1;
        }
        jArr[this.p0 - 1] = j;
    }

    @Override // com.google.android.gms.internal.ads.zzawq
    public final int h(zzass zzassVar) {
        boolean z;
        int i;
        int i2;
        String str = zzassVar.zzf;
        if (!zzbad.zzb(str)) {
            return 0;
        }
        zzaur zzaurVar = zzassVar.zzi;
        if (zzaurVar != null) {
            z = false;
            for (int i3 = 0; i3 < zzaurVar.zza; i3++) {
                z |= zzaurVar.zza(i3).zzc;
            }
        } else {
            z = false;
        }
        zzawo zzawoVarZzc = zzaxa.zzc(str, z);
        if (zzawoVarZzc == null) {
            return 1;
        }
        boolean zZze = zzawoVarZzc.zze(zzassVar.zzc);
        if (zZze && (i = zzassVar.zzj) > 0 && (i2 = zzassVar.zzk) > 0) {
            if (zzban.zza >= 21) {
                zZze = zzawoVarZzc.zzf(i, i2, zzassVar.zzl);
            } else {
                zZze = i * i2 <= zzaxa.zza();
                if (!zZze) {
                    int i4 = zzassVar.zzj;
                    int i5 = zzassVar.zzk;
                    String str2 = zzban.zze;
                    StringBuilder sbA = a42.a("FalseCheck [legacyFrameSize, ", i4, "x", i5, "] [");
                    sbA.append(str2);
                    sbA.append("]");
                    Log.d("MediaCodecVideoRenderer", sbA.toString());
                }
            }
        }
        return (true != zzawoVarZzc.zzb ? 4 : 8) | (true == zzawoVarZzc.zzc ? 16 : 0) | (true != zZze ? 2 : 3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x005d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0088  */
    @Override // com.google.android.gms.internal.ads.zzawq
    public final void k(zzawo zzawoVar, MediaCodec mediaCodec, zzass zzassVar) {
        byte b;
        int iZzd;
        zzass[] zzassVarArr = this.V;
        int i = zzassVar.zzj;
        int i2 = zzassVar.zzk;
        int i3 = zzassVar.zzg;
        if (i3 == -1) {
            String str = zzassVar.zzf;
            if (i == -1 || i2 == -1) {
                i3 = -1;
            } else {
                int i4 = 4;
                switch (str) {
                    case "video/3gpp":
                        b = 0;
                        break;
                    case "video/hevc":
                        b = 4;
                        break;
                    case "video/mp4v-es":
                        b = 1;
                        break;
                    case "video/avc":
                        b = 2;
                        break;
                    case "video/x-vnd.on2.vp8":
                        b = 3;
                        break;
                    case "video/x-vnd.on2.vp9":
                        b = 5;
                        break;
                    default:
                        b = -1;
                        break;
                }
                if (b == 0 || b == 1) {
                    iZzd = i * i2;
                    i4 = 2;
                } else {
                    if (b != 2) {
                        if (b == 3) {
                            iZzd = i * i2;
                            i4 = 2;
                        } else if (b == 4 || b == 5) {
                            iZzd = i * i2;
                        }
                    } else if (!"BRAVIA 4K 2015".equals(zzban.zzd)) {
                        iZzd = zzban.zzd(i2, 16) * zzban.zzd(i, 16) * 256;
                        i4 = 2;
                    }
                    i3 = -1;
                }
                i3 = (iZzd * 3) / (i4 + i4);
            }
        }
        int length = zzassVarArr.length;
        zzbav zzbavVar = new zzbav(i, i2, i3);
        this.W = zzbavVar;
        MediaFormat mediaFormatZzb = zzassVar.zzb();
        mediaFormatZzb.setInteger("max-width", zzbavVar.zza);
        mediaFormatZzb.setInteger("max-height", zzbavVar.zzb);
        int i5 = zzbavVar.zzc;
        if (i5 != -1) {
            mediaFormatZzb.setInteger("max-input-size", i5);
        }
        if (this.T) {
            mediaFormatZzb.setInteger("auto-frc", 0);
        }
        if (this.X == null) {
            zzazy.zze(y(zzawoVar.zzd));
            if (this.Y == null) {
                this.Y = zzbat.zza(this.Q, zzawoVar.zzd);
            }
            this.X = this.Y;
        }
        mediaCodec.configure(mediaFormatZzb, this.X, (MediaCrypto) null, 0);
        int i6 = zzban.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzawq
    public final void l(String str, long j, long j2) {
        this.S.zzb(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzawq
    public final void m(zzass zzassVar) {
        super.m(zzassVar);
        this.S.zzf(zzassVar);
        float f = zzassVar.zzn;
        if (f == -1.0f) {
            f = 1.0f;
        }
        this.f0 = f;
        int i = zzassVar.zzm;
        if (i == -1) {
            i = 0;
        }
        this.e0 = i;
    }

    @Override // com.google.android.gms.internal.ads.zzawq
    public final void n(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        boolean z = false;
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            z = true;
        }
        this.g0 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        this.h0 = integer;
        float f = this.f0;
        this.j0 = f;
        if (zzban.zza >= 21) {
            int i = this.e0;
            if (i == 90 || i == 270) {
                int i2 = this.g0;
                this.g0 = integer;
                this.h0 = i2;
                this.j0 = 1.0f / f;
            }
        } else {
            this.i0 = this.e0;
        }
        mediaCodec.setVideoScalingMode(1);
    }

    @Override // com.google.android.gms.internal.ads.zzawq
    public final boolean p(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, long j3, boolean z) {
        while (true) {
            int i2 = this.p0;
            if (i2 == 0) {
                break;
            }
            long[] jArr = this.U;
            long j4 = jArr[0];
            if (j3 < j4) {
                break;
            }
            this.o0 = j4;
            int i3 = i2 - 1;
            this.p0 = i3;
            System.arraycopy(jArr, 1, jArr, 0, i3);
        }
        if (z) {
            zzbal.zza("skipVideoBuffer");
            mediaCodec.releaseOutputBuffer(i, false);
            zzbal.zzb();
            this.O.zze++;
            return true;
        }
        long j5 = j3 - j;
        if (this.X == this.Y) {
            if (!(j5 < -30000)) {
                return false;
            }
            zzbal.zza("skipVideoBuffer");
            mediaCodec.releaseOutputBuffer(i, false);
            zzbal.zzb();
            this.O.zze++;
            return true;
        }
        if (!this.Z) {
            if (zzban.zza >= 21) {
                w(mediaCodec, i, System.nanoTime());
            } else {
                v(mediaCodec, i);
            }
            return true;
        }
        if (zzb() != 2) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jNanoTime = System.nanoTime();
        long jZza = this.R.zza(j3, ((j5 - ((jElapsedRealtime * 1000) - j2)) * 1000) + jNanoTime);
        long j6 = (jZza - jNanoTime) / 1000;
        if (!(j6 < -30000)) {
            if (zzban.zza >= 21) {
                if (j6 < 50000) {
                    w(mediaCodec, i, jZza);
                    return true;
                }
            } else if (j6 < 30000) {
                if (j6 > 11000) {
                    try {
                        Thread.sleep((j6 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                v(mediaCodec, i);
                return true;
            }
            return false;
        }
        zzbal.zza("dropVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        zzbal.zzb();
        zzaum zzaumVar = this.O;
        zzaumVar.zzf++;
        this.c0++;
        int i4 = this.d0 + 1;
        this.d0 = i4;
        zzaumVar.zzg = Math.max(i4, zzaumVar.zzg);
        int i5 = this.c0;
        if (i5 == -1 && i5 > 0) {
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            this.S.zzd(this.c0, jElapsedRealtime2 - this.b0);
            this.c0 = 0;
            this.b0 = jElapsedRealtime2;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzawq
    public final void r() {
        int i = zzban.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzawq
    public final void s() {
        try {
            super.s();
        } finally {
            zzbat zzbatVar = this.Y;
            if (zzbatVar != null) {
                if (this.X == zzbatVar) {
                    this.X = null;
                }
                zzbatVar.release();
                this.Y = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawq
    public final boolean t(boolean z, zzass zzassVar, zzass zzassVar2) {
        if (zzassVar.zzf.equals(zzassVar2.zzf)) {
            int i = zzassVar.zzm;
            if (i == -1) {
                i = 0;
            }
            int i2 = zzassVar2.zzm;
            if (i2 == -1) {
                i2 = 0;
            }
            if (i == i2 && (z || (zzassVar.zzj == zzassVar2.zzj && zzassVar.zzk == zzassVar2.zzk))) {
                int i3 = zzassVar2.zzj;
                zzbav zzbavVar = this.W;
                if (i3 <= zzbavVar.zza && zzassVar2.zzk <= zzbavVar.zzb && zzassVar2.zzg <= zzbavVar.zzc) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzawq
    public final boolean u(zzawo zzawoVar) {
        return this.X != null || y(zzawoVar.zzd);
    }

    public final void v(MediaCodec mediaCodec, int i) {
        x();
        zzbal.zza("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        zzbal.zzb();
        this.O.zzd++;
        this.d0 = 0;
        if (this.Z) {
            return;
        }
        this.Z = true;
        this.S.zzg(this.X);
    }

    @TargetApi(21)
    public final void w(MediaCodec mediaCodec, int i, long j) {
        x();
        zzbal.zza("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j);
        zzbal.zzb();
        this.O.zzd++;
        this.d0 = 0;
        if (this.Z) {
            return;
        }
        this.Z = true;
        this.S.zzg(this.X);
    }

    public final void x() {
        int i = this.k0;
        int i2 = this.g0;
        if (i == i2 && this.l0 == this.h0 && this.m0 == this.i0 && this.n0 == this.j0) {
            return;
        }
        this.S.zzh(i2, this.h0, this.i0, this.j0);
        this.k0 = this.g0;
        this.l0 = this.h0;
        this.m0 = this.i0;
        this.n0 = this.j0;
    }

    public final boolean y(boolean z) {
        if (zzban.zza >= 23) {
            return !z || zzbat.zzb(this.Q);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzawq, com.google.android.gms.internal.ads.zzasx
    public final boolean zzF() {
        zzbat zzbatVar;
        if (super.zzF() && (this.Z || (((zzbatVar = this.Y) != null && this.X == zzbatVar) || this.p == null))) {
            this.a0 = -9223372036854775807L;
            return true;
        }
        if (this.a0 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.a0) {
            return true;
        }
        this.a0 = -9223372036854775807L;
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzasc, com.google.android.gms.internal.ads.zzasg
    public final void zzl(int i, Object obj) {
        Surface surface;
        if (i == 1) {
            Surface surface2 = (Surface) obj;
            if (surface2 == null) {
                zzbat zzbatVar = this.Y;
                if (zzbatVar != null) {
                    surface = surface2;
                    surface = zzbatVar;
                } else {
                    zzawo zzawoVar = this.q;
                    if (zzawoVar != null && y(zzawoVar.zzd)) {
                        surface = surface2;
                        surface = surface2;
                        surface = surface2;
                        zzbat zzbatVarZza = zzbat.zza(this.Q, zzawoVar.zzd);
                        this.Y = zzbatVarZza;
                        surface = zzbatVarZza;
                    }
                }
            }
            surface = surface2;
            surface = surface2;
            surface = surface2;
            surface = surface2;
            surface = surface2;
            surface = surface2;
            Surface surface3 = this.X;
            zzbbg zzbbgVar = this.S;
            if (surface3 == surface) {
                if (surface == null || surface == this.Y) {
                    return;
                }
                if (this.k0 != -1 || this.l0 != -1) {
                    zzbbgVar.zzh(this.g0, this.h0, this.i0, this.j0);
                }
                if (this.Z) {
                    zzbbgVar.zzg(this.X);
                    return;
                }
                return;
            }
            this.X = surface;
            int iZzb = zzb();
            if (iZzb == 1 || iZzb == 2) {
                MediaCodec mediaCodec = this.p;
                if (zzban.zza < 23 || mediaCodec == null || surface == null) {
                    s();
                    q();
                } else {
                    mediaCodec.setOutputSurface(surface);
                }
            }
            if (surface == null || surface == this.Y) {
                this.k0 = -1;
                this.l0 = -1;
                this.n0 = -1.0f;
                this.m0 = -1;
                this.Z = false;
                int i2 = zzban.zza;
                return;
            }
            if (this.k0 != -1 || this.l0 != -1) {
                zzbbgVar.zzh(this.g0, this.h0, this.i0, this.j0);
            }
            this.Z = false;
            int i3 = zzban.zza;
            if (iZzb == 2) {
                this.a0 = -9223372036854775807L;
            }
        }
    }
}
