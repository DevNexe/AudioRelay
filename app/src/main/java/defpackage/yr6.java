package defpackage;

import com.google.android.gms.internal.ads.zzgek;
import com.google.android.gms.internal.ads.zzgel;
import com.google.android.gms.internal.ads.zzggy;
import com.google.android.gms.internal.ads.zzggz;
import com.google.android.gms.internal.ads.zzghb;
import com.google.android.gms.internal.ads.zzghc;
import com.google.android.gms.internal.ads.zzgmg;
import com.google.android.gms.internal.ads.zzgnf;
import com.google.android.gms.internal.ads.zzgnz;
import com.google.android.gms.internal.ads.zzgpx;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class yr6 extends zzgel {
    public yr6() {
        super(zzghc.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgel
    public final /* bridge */ /* synthetic */ zzgpx zza(zzgpx zzgpxVar) {
        zzggy zzggyVarZzc = zzggz.zzc();
        zzggyVarZzc.zza(zzgnf.zzv(zzgmg.zza(((zzghc) zzgpxVar).zza())));
        zzggyVarZzc.zzb(0);
        return (zzggz) zzggyVarZzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgel
    public final /* synthetic */ zzgpx zzb(zzgnf zzgnfVar) {
        return zzghc.zze(zzgnfVar, zzgnz.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgel
    public final Map zzc() {
        HashMap map = new HashMap();
        zzghb zzghbVarZzc = zzghc.zzc();
        zzghbVarZzc.zza(64);
        map.put("AES256_SIV", new zzgek((zzghc) zzghbVarZzc.zzal(), 1));
        zzghb zzghbVarZzc2 = zzghc.zzc();
        zzghbVarZzc2.zza(64);
        map.put("AES256_SIV_RAW", new zzgek((zzghc) zzghbVarZzc2.zzal(), 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.ads.zzgel
    public final /* bridge */ /* synthetic */ void zzd(zzgpx zzgpxVar) throws InvalidAlgorithmParameterException {
        zzghc zzghcVar = (zzghc) zzgpxVar;
        if (zzghcVar.zza() != 64) {
            throw new InvalidAlgorithmParameterException(ex0.b("invalid key size: ", zzghcVar.zza(), ". Valid keys must have 64 bytes."));
        }
    }
}
