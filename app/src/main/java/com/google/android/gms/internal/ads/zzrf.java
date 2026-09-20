package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class zzrf implements zzqj {
    public final MediaCodec a;
    public ByteBuffer[] b;
    public ByteBuffer[] c;

    public /* synthetic */ zzrf(MediaCodec mediaCodec) {
        this.a = mediaCodec;
        if (zzel.zza < 21) {
            this.b = mediaCodec.getInputBuffers();
            this.c = mediaCodec.getOutputBuffers();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final int zza() {
        return this.a.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            MediaCodec mediaCodec = this.a;
            iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3) {
                if (zzel.zza < 21) {
                    this.c = mediaCodec.getOutputBuffers();
                }
                iDequeueOutputBuffer = -3;
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final MediaFormat zzc() {
        return this.a.getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final ByteBuffer zzf(int i) {
        return zzel.zza >= 21 ? this.a.getInputBuffer(i) : ((ByteBuffer[]) zzel.zzH(this.b))[i];
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final ByteBuffer zzg(int i) {
        return zzel.zza >= 21 ? this.a.getOutputBuffer(i) : ((ByteBuffer[]) zzel.zzH(this.c))[i];
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final void zzi() {
        this.a.flush();
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final void zzj(int i, int i2, int i3, long j, int i4) {
        this.a.queueInputBuffer(i, 0, i3, j, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final void zzk(int i, int i2, zzgd zzgdVar, long j, int i3) {
        this.a.queueSecureInputBuffer(i, 0, zzgdVar.zza(), j, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final void zzl() {
        this.b = null;
        this.c = null;
        this.a.release();
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
