package defpackage;

import com.google.android.gms.internal.ads.zzgco;
import com.google.android.gms.internal.ads.zzgeh;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes3.dex */
public final class fs6 implements hs6 {
    public final int a;

    public fs6(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(GM.a("Unsupported key length: ", i));
        }
        this.a = i;
    }

    @Override // defpackage.hs6
    public final byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws InvalidAlgorithmParameterException {
        int length = bArr.length;
        if (length == this.a) {
            return new zzgco(bArr, false).zzb(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException(GM.a("Unexpected key length: ", length));
    }

    @Override // defpackage.hs6
    public final int zza() {
        return this.a;
    }

    @Override // defpackage.hs6
    public final byte[] zzb() throws GeneralSecurityException {
        int i = this.a;
        if (i == 16) {
            return zzgeh.zzd;
        }
        if (i == 32) {
            return zzgeh.zze;
        }
        throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
    }
}
