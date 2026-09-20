package defpackage;

import com.google.android.gms.internal.ads.zzgek;
import com.google.android.gms.internal.ads.zzgel;
import com.google.android.gms.internal.ads.zzges;
import com.google.android.gms.internal.ads.zzgff;
import com.google.android.gms.internal.ads.zzgfg;
import com.google.android.gms.internal.ads.zzgfi;
import com.google.android.gms.internal.ads.zzgfj;
import com.google.android.gms.internal.ads.zzgfl;
import com.google.android.gms.internal.ads.zzgfm;
import com.google.android.gms.internal.ads.zzgmg;
import com.google.android.gms.internal.ads.zzgnf;
import com.google.android.gms.internal.ads.zzgnz;
import com.google.android.gms.internal.ads.zzgpx;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ms6 extends zzgel {
    public ms6() {
        super(zzgfj.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgel
    public final /* bridge */ /* synthetic */ zzgpx zza(zzgpx zzgpxVar) {
        zzgfj zzgfjVar = (zzgfj) zzgpxVar;
        zzgff zzgffVarZzc = zzgfg.zzc();
        zzgffVarZzc.zzc(0);
        zzgffVarZzc.zza(zzgnf.zzv(zzgmg.zza(zzgfjVar.zza())));
        zzgffVarZzc.zzb(zzgfjVar.zzf());
        return (zzgfg) zzgffVarZzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgel
    public final /* synthetic */ zzgpx zzb(zzgnf zzgnfVar) {
        return zzgfj.zze(zzgnfVar, zzgnz.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgel
    public final Map zzc() {
        HashMap map = new HashMap();
        zzgfi zzgfiVarZzc = zzgfj.zzc();
        zzgfiVarZzc.zza(32);
        zzgfl zzgflVarZzc = zzgfm.zzc();
        zzgflVarZzc.zza(16);
        zzgfiVarZzc.zzb((zzgfm) zzgflVarZzc.zzal());
        map.put("AES_CMAC", new zzgek((zzgfj) zzgfiVarZzc.zzal(), 1));
        zzgfi zzgfiVarZzc2 = zzgfj.zzc();
        zzgfiVarZzc2.zza(32);
        zzgfl zzgflVarZzc2 = zzgfm.zzc();
        zzgflVarZzc2.zza(16);
        zzgfiVarZzc2.zzb((zzgfm) zzgflVarZzc2.zzal());
        map.put("AES256_CMAC", new zzgek((zzgfj) zzgfiVarZzc2.zzal(), 1));
        zzgfi zzgfiVarZzc3 = zzgfj.zzc();
        zzgfiVarZzc3.zza(32);
        zzgfl zzgflVarZzc3 = zzgfm.zzc();
        zzgflVarZzc3.zza(16);
        zzgfiVarZzc3.zzb((zzgfm) zzgflVarZzc3.zzal());
        map.put("AES256_CMAC_RAW", new zzgek((zzgfj) zzgfiVarZzc3.zzal(), 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.ads.zzgel
    public final void zzd(zzgpx zzgpxVar) throws GeneralSecurityException {
        zzgfj zzgfjVar = (zzgfj) zzgpxVar;
        zzges.a(zzgfjVar.zzf());
        if (zzgfjVar.zza() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
