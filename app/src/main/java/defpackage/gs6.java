package defpackage;

import com.google.android.gms.internal.ads.zzgcr;
import com.google.android.gms.internal.ads.zzgeh;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes3.dex */
public final class gs6 implements hs6 {
    @Override // defpackage.hs6
    public final byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws InvalidAlgorithmParameterException {
        if (bArr.length == 32) {
            return new zzgcr(bArr).zzd(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
    }

    @Override // defpackage.hs6
    public final int zza() {
        return 32;
    }

    @Override // defpackage.hs6
    public final byte[] zzb() {
        return zzgeh.zzf;
    }
}
