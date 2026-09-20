package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzze implements zzaam {
    public final byte[] a = new byte[4096];

    @Override // com.google.android.gms.internal.ads.zzaam
    public final /* synthetic */ int zze(zzr zzrVar, int i, boolean z) {
        return zzaak.zza(this, zzrVar, i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzaam
    public final int zzf(zzr zzrVar, int i, boolean z, int i2) throws EOFException {
        int iZza = zzrVar.zza(this.a, 0, Math.min(4096, i));
        if (iZza != -1) {
            return iZza;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzaam
    public final void zzk(zzaf zzafVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzaam
    public final /* synthetic */ void zzq(zzed zzedVar, int i) {
        zzaak.zzb(this, zzedVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzaam
    public final void zzr(zzed zzedVar, int i, int i2) {
        zzedVar.zzG(i);
    }

    @Override // com.google.android.gms.internal.ads.zzaam
    public final void zzs(long j, int i, int i2, int i3, zzaal zzaalVar) {
    }
}
