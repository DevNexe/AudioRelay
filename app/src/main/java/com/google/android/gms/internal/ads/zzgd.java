package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCodec$CryptoInfo$Pattern;
import defpackage.rr6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgd {
    public final MediaCodec.CryptoInfo a;
    public final rr6 b;
    public byte[] zza;
    public byte[] zzb;
    public int zzc;
    public int[] zzd;
    public int[] zze;
    public int zzf;
    public int zzg;
    public int zzh;

    public zzgd() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.a = cryptoInfo;
        this.b = zzel.zza >= 24 ? new rr6(cryptoInfo) : null;
    }

    public final MediaCodec.CryptoInfo zza() {
        return this.a;
    }

    public final void zzb(int i) {
        if (i == 0) {
            return;
        }
        if (this.zzd == null) {
            int[] iArr = new int[1];
            this.zzd = iArr;
            this.a.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.zzd;
        iArr2[0] = iArr2[0] + i;
    }

    public final void zzc(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.zzf = i;
        this.zzd = iArr;
        this.zze = iArr2;
        this.zzb = bArr;
        this.zza = bArr2;
        this.zzc = i2;
        this.zzg = i3;
        this.zzh = i4;
        MediaCodec.CryptoInfo cryptoInfo = this.a;
        cryptoInfo.numSubSamples = i;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i2;
        if (zzel.zza >= 24) {
            rr6 rr6Var = this.b;
            rr6Var.getClass();
            MediaCodec$CryptoInfo$Pattern mediaCodec$CryptoInfo$Pattern = rr6Var.b;
            mediaCodec$CryptoInfo$Pattern.set(i3, i4);
            rr6Var.a.setPattern(mediaCodec$CryptoInfo$Pattern);
        }
    }
}
