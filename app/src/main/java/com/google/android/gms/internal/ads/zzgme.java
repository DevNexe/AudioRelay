package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgme implements zzgaq {
    public final zzgfd a;
    public final int b;

    public zzgme(zzgfd zzgfdVar, int i) throws InvalidAlgorithmParameterException {
        this.a = zzgfdVar;
        this.b = i;
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        zzgfdVar.zza(new byte[0], i);
    }

    @Override // com.google.android.gms.internal.ads.zzgaq
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!zzgle.zzb(zzb(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgaq
    public final byte[] zzb(byte[] bArr) {
        return this.a.zza(bArr, this.b);
    }
}
