package defpackage;

import com.google.android.gms.internal.ads.zzgaa;
import com.google.android.gms.internal.ads.zzgem;
import com.google.android.gms.internal.ads.zzghz;
import com.google.android.gms.internal.ads.zzgmi;
import com.google.android.gms.internal.ads.zzgnf;
import com.google.android.gms.internal.ads.zzgnz;
import com.google.android.gms.internal.ads.zzgpx;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class as6 extends zzgem {
    public as6() {
        super(zzghz.class, new jr6(zzgaa.class, 5));
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final /* synthetic */ zzgpx zzb(zzgnf zzgnfVar) {
        return zzghz.zzg(zzgnfVar, zzgnz.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final /* bridge */ /* synthetic */ void zzd(zzgpx zzgpxVar) throws GeneralSecurityException {
        zzghz zzghzVar = (zzghz) zzgpxVar;
        zzgmi.zzb(zzghzVar.zza(), 0);
        ds6.a(zzghzVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final int zzf() {
        return 5;
    }
}
