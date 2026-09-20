package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzglb implements zzfzs {
    public final zzgco a;

    public zzglb(byte[] bArr) throws GeneralSecurityException {
        if (!zzgcy.zza(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.a = new zzgco(bArr, true);
    }

    @Override // com.google.android.gms.internal.ads.zzfzs
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        return this.a.zza(Arrays.copyOf(bArr, 12), bArr, bArr2);
    }

    @Override // com.google.android.gms.internal.ads.zzfzs
    public final byte[] zzb(byte[] bArr, byte[] bArr2) {
        return this.a.zzb(zzgmg.zza(12), bArr, bArr2);
    }
}
