package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import defpackage.u06;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaul {
    public final MediaCodec.CryptoInfo a;
    public final u06 b;
    public byte[] zza;
    public byte[] zzb;
    public int zzc;
    public int[] zzd;
    public int[] zze;
    public int zzf;

    public zzaul() {
        int i = zzban.zza;
        MediaCodec.CryptoInfo cryptoInfo = i >= 16 ? new MediaCodec.CryptoInfo() : null;
        this.a = cryptoInfo;
        this.b = i >= 24 ? new u06(cryptoInfo) : null;
    }

    @TargetApi(16)
    public final MediaCodec.CryptoInfo zza() {
        return this.a;
    }

    public final void zzb(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2) {
        this.zzf = i;
        this.zzd = iArr;
        this.zze = iArr2;
        this.zzb = bArr;
        this.zza = bArr2;
        this.zzc = 1;
        int i3 = zzban.zza;
        if (i3 >= 16) {
            MediaCodec.CryptoInfo cryptoInfo = this.a;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr;
            cryptoInfo.iv = bArr2;
            cryptoInfo.mode = 1;
            if (i3 >= 24) {
                u06 u06Var = this.b;
                u06Var.b.set(0, 0);
                u06Var.a.setPattern(u06Var.b);
            }
        }
    }
}
