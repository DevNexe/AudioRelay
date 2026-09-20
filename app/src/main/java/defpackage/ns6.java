package defpackage;

import com.google.android.gms.internal.ads.zzfzx;
import com.google.android.gms.internal.ads.zzgaq;
import com.google.android.gms.internal.ads.zzgau;
import com.google.android.gms.internal.ads.zzgba;
import com.google.android.gms.internal.ads.zzgle;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes3.dex */
public final class ns6 implements zzgaq {
    public final zzgba a;
    public final byte[] b = {0};

    @Override // com.google.android.gms.internal.ads.zzgaq
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length <= 5) {
            throw new GeneralSecurityException("tag too short");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, length);
        zzgba zzgbaVar = this.a;
        for (zzgau zzgauVar : zzgbaVar.zzc(bArrCopyOf)) {
            try {
                if (zzgauVar.zzc() == 4) {
                    ((zzgaq) zzgauVar.zza()).zza(bArrCopyOfRange, zzgle.zzc(bArr2, this.b));
                    return;
                } else {
                    ((zzgaq) zzgauVar.zza()).zza(bArrCopyOfRange, bArr2);
                    return;
                }
            } catch (GeneralSecurityException e) {
                os6.a.logp(Level.INFO, "com.google.crypto.tink.mac.MacWrapper$WrappedMac", "verifyMac", "tag prefix matches a key, but cannot verify: ".concat(e.toString()));
            }
        }
        Iterator it = zzgbaVar.zzc(zzfzx.zza).iterator();
        while (it.hasNext()) {
            try {
                ((zzgaq) ((zzgau) it.next()).zza()).zza(bArr, bArr2);
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("invalid MAC");
    }

    @Override // com.google.android.gms.internal.ads.zzgaq
    public final byte[] zzb(byte[] bArr) {
        zzgba zzgbaVar = this.a;
        return zzgbaVar.zza().zzc() == 4 ? zzgle.zzc(zzgbaVar.zza().zzb(), ((zzgaq) zzgbaVar.zza().zza()).zzb(zzgle.zzc(bArr, this.b))) : zzgle.zzc(zzgbaVar.zza().zzb(), ((zzgaq) zzgbaVar.zza().zza()).zzb(bArr));
    }
}
