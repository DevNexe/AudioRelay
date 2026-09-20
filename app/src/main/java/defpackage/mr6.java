package defpackage;

import com.google.android.gms.internal.ads.zzgbp;
import com.google.android.gms.internal.ads.zzgel;
import com.google.android.gms.internal.ads.zzgfu;
import com.google.android.gms.internal.ads.zzgfv;
import com.google.android.gms.internal.ads.zzgfy;
import com.google.android.gms.internal.ads.zzggb;
import com.google.android.gms.internal.ads.zzgmg;
import com.google.android.gms.internal.ads.zzgmi;
import com.google.android.gms.internal.ads.zzgnf;
import com.google.android.gms.internal.ads.zzgnz;
import com.google.android.gms.internal.ads.zzgpx;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class mr6 extends zzgel {
    public mr6(zzgbp zzgbpVar) {
        super(zzgfy.class);
    }

    public static final zzgfv a(zzgfy zzgfyVar) {
        zzgfu zzgfuVarZzc = zzgfv.zzc();
        zzgfuVarZzc.zzb(zzgfyVar.zzg());
        zzgfuVarZzc.zza(zzgnf.zzv(zzgmg.zza(zzgfyVar.zza())));
        zzgfuVarZzc.zzc(0);
        return (zzgfv) zzgfuVarZzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgel
    public final /* bridge */ /* synthetic */ zzgpx zza(zzgpx zzgpxVar) {
        return a((zzgfy) zzgpxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgel
    public final /* synthetic */ zzgpx zzb(zzgnf zzgnfVar) {
        return zzgfy.zzf(zzgnfVar, zzgnz.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgel
    public final void zzd(zzgpx zzgpxVar) throws GeneralSecurityException {
        zzgfy zzgfyVar = (zzgfy) zzgpxVar;
        zzgmi.zza(zzgfyVar.zza());
        zzggb zzggbVarZzg = zzgfyVar.zzg();
        if (zzggbVarZzg.zza() < 12 || zzggbVarZzg.zza() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }
}
