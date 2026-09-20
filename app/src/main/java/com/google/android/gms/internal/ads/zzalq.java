package com.google.android.gms.internal.ads;

import defpackage.hc2;
import java.nio.ByteBuffer;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public final class zzalq extends zzgua {
    public Date G;
    public Date H;
    public long I;
    public long J;
    public double K = 1.0d;
    public float L = 1.0f;
    public zzguk M = zzguk.zza;
    public long N;

    public final String toString() {
        StringBuilder sb = new StringBuilder("MovieHeaderBox[creationTime=");
        sb.append(this.G);
        sb.append(";modificationTime=");
        sb.append(this.H);
        sb.append(";timescale=");
        sb.append(this.I);
        sb.append(";duration=");
        sb.append(this.J);
        sb.append(";rate=");
        sb.append(this.K);
        sb.append(";volume=");
        sb.append(this.L);
        sb.append(";matrix=");
        sb.append(this.M);
        sb.append(";nextTrackId=");
        return hc2.a(sb, this.N, "]");
    }

    public final long zzd() {
        return this.J;
    }

    public final long zze() {
        return this.I;
    }

    @Override // com.google.android.gms.internal.ads.zzgty
    public final void zzf(ByteBuffer byteBuffer) {
        this.F = zzalm.zzc(byteBuffer.get());
        zzalm.zzd(byteBuffer);
        byteBuffer.get();
        if (zzh() == 1) {
            this.G = zzguf.zza(zzalm.zzf(byteBuffer));
            this.H = zzguf.zza(zzalm.zzf(byteBuffer));
            this.I = zzalm.zze(byteBuffer);
            this.J = zzalm.zzf(byteBuffer);
        } else {
            this.G = zzguf.zza(zzalm.zze(byteBuffer));
            this.H = zzguf.zza(zzalm.zze(byteBuffer));
            this.I = zzalm.zze(byteBuffer);
            this.J = zzalm.zze(byteBuffer);
        }
        this.K = zzalm.zzb(byteBuffer);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        this.L = ((short) ((bArr[1] & 255) | ((short) ((bArr[0] << 8) & 65280)))) / 256.0f;
        zzalm.zzd(byteBuffer);
        zzalm.zze(byteBuffer);
        zzalm.zze(byteBuffer);
        this.M = new zzguk(zzalm.zzb(byteBuffer), zzalm.zzb(byteBuffer), zzalm.zzb(byteBuffer), zzalm.zzb(byteBuffer), zzalm.zza(byteBuffer), zzalm.zza(byteBuffer), zzalm.zza(byteBuffer), zzalm.zzb(byteBuffer), zzalm.zzb(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.N = zzalm.zze(byteBuffer);
    }
}
