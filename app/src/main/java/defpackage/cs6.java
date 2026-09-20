package defpackage;

import com.google.android.gms.internal.ads.zzgaa;
import com.google.android.gms.internal.ads.zzgba;
import com.google.android.gms.internal.ads.zzgle;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class cs6 implements zzgaa {
    public final zzgba a;

    public cs6(zzgba zzgbaVar) {
        this.a = zzgbaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgaa
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzgba zzgbaVar = this.a;
        if (zzgbaVar.zza() != null) {
            return zzgle.zzc(zzgbaVar.zza().zzb(), ((zzgaa) zzgbaVar.zza().zza()).zza(bArr, bArr2));
        }
        throw new GeneralSecurityException("keyset without primary key");
    }
}
