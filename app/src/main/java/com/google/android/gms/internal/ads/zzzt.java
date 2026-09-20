package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes3.dex */
public class zzzt implements zzzg {
    public final zzzg a;

    public zzzt(zzzg zzzgVar) {
        this.a = zzzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzg, com.google.android.gms.internal.ads.zzr
    public final int zza(byte[] bArr, int i, int i2) {
        return this.a.zza(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final int zzb(byte[] bArr, int i, int i2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final int zzc(int i) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public long zzd() {
        return this.a.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public long zze() {
        return this.a.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public long zzf() {
        return this.a.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final void zzg(int i) throws EOFException, InterruptedIOException {
        ((zzyv) this.a).zzl(i, false);
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final void zzh(byte[] bArr, int i, int i2) {
        ((zzyv) this.a).zzm(bArr, i, i2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final void zzi(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        ((zzyv) this.a).zzn(bArr, i, i2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final void zzj() {
        this.a.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final void zzk(int i) throws EOFException, InterruptedIOException {
        ((zzyv) this.a).zzo(i, false);
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final boolean zzm(byte[] bArr, int i, int i2, boolean z) {
        return this.a.zzm(bArr, 0, 8, true);
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final boolean zzn(byte[] bArr, int i, int i2, boolean z) {
        return this.a.zzn(bArr, 0, 8, true);
    }
}
