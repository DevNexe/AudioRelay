package defpackage;

import com.google.android.gms.internal.ads.zzfzs;
import com.google.android.gms.internal.ads.zzfzx;
import com.google.android.gms.internal.ads.zzgau;
import com.google.android.gms.internal.ads.zzgba;
import com.google.android.gms.internal.ads.zzgbj;
import com.google.android.gms.internal.ads.zzgle;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes3.dex */
public final class ir6 implements zzfzs {
    public final zzgba a;

    @Override // com.google.android.gms.internal.ads.zzfzs
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        zzgba zzgbaVar = this.a;
        if (length > 5) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 5);
            byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 5, length);
            Iterator it = zzgbaVar.zzc(bArrCopyOfRange).iterator();
            while (it.hasNext()) {
                try {
                    return ((zzfzs) ((zzgau) it.next()).zza()).zza(bArrCopyOfRange2, bArr2);
                } catch (GeneralSecurityException e) {
                    zzgbj.a.logp(Level.INFO, "com.google.crypto.tink.aead.AeadWrapper$WrappedAead", "decrypt", "ciphertext prefix matches a key, but cannot decrypt: ".concat(String.valueOf(e.toString())));
                }
            }
        }
        Iterator it2 = zzgbaVar.zzc(zzfzx.zza).iterator();
        while (it2.hasNext()) {
            try {
                return ((zzfzs) ((zzgau) it2.next()).zza()).zza(bArr, bArr2);
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }

    @Override // com.google.android.gms.internal.ads.zzfzs
    public final byte[] zzb(byte[] bArr, byte[] bArr2) {
        zzgba zzgbaVar = this.a;
        return zzgle.zzc(zzgbaVar.zza().zzb(), ((zzfzs) zzgbaVar.zza().zza()).zzb(bArr, bArr2));
    }
}
