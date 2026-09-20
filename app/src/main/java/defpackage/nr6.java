package defpackage;

import com.google.android.gms.internal.ads.zzgbv;
import com.google.android.gms.internal.ads.zzgek;
import com.google.android.gms.internal.ads.zzgel;
import com.google.android.gms.internal.ads.zzggm;
import com.google.android.gms.internal.ads.zzggn;
import com.google.android.gms.internal.ads.zzggq;
import com.google.android.gms.internal.ads.zzghe;
import com.google.android.gms.internal.ads.zzghf;
import com.google.android.gms.internal.ads.zzghi;
import com.google.android.gms.internal.ads.zzgkr;
import com.google.android.gms.internal.ads.zzgks;
import com.google.android.gms.internal.ads.zzgkv;
import com.google.android.gms.internal.ads.zzgmg;
import com.google.android.gms.internal.ads.zzgmi;
import com.google.android.gms.internal.ads.zzgnf;
import com.google.android.gms.internal.ads.zzgnz;
import com.google.android.gms.internal.ads.zzgpx;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class nr6 extends zzgel {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nr6(Class cls, int i) {
        super(cls);
        this.b = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgel
    public final /* bridge */ /* synthetic */ zzgpx zza(zzgpx zzgpxVar) {
        switch (this.b) {
            case 0:
                zzggm zzggmVarZzc = zzggn.zzc();
                zzggmVarZzc.zza(zzgnf.zzv(zzgmg.zza(((zzggq) zzgpxVar).zza())));
                zzggmVarZzc.zzb(0);
                return (zzggn) zzggmVarZzc.zzal();
            case 1:
                zzghe zzgheVarZzc = zzghf.zzc();
                zzgheVarZzc.zzb(0);
                zzgheVarZzc.zza(zzgnf.zzv(zzgmg.zza(32)));
                return (zzghf) zzgheVarZzc.zzal();
            default:
                zzgkr zzgkrVarZzc = zzgks.zzc();
                zzgkrVarZzc.zzb(0);
                zzgkrVarZzc.zza(zzgnf.zzv(zzgmg.zza(32)));
                return (zzgks) zzgkrVarZzc.zzal();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgel
    public final /* synthetic */ zzgpx zzb(zzgnf zzgnfVar) {
        switch (this.b) {
            case 0:
                return zzggq.zze(zzgnfVar, zzgnz.zza());
            case 1:
                return zzghi.zzd(zzgnfVar, zzgnz.zza());
            default:
                return zzgkv.zzd(zzgnfVar, zzgnz.zza());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgel
    public final Map zzc() {
        switch (this.b) {
            case 0:
                HashMap map = new HashMap();
                map.put("AES128_GCM", zzgbv.a(16, 1));
                map.put("AES128_GCM_RAW", zzgbv.a(16, 3));
                map.put("AES256_GCM", zzgbv.a(32, 1));
                map.put("AES256_GCM_RAW", zzgbv.a(32, 3));
                return Collections.unmodifiableMap(map);
            case 1:
                HashMap map2 = new HashMap();
                map2.put("CHACHA20_POLY1305", new zzgek(zzghi.zzc(), 1));
                map2.put("CHACHA20_POLY1305_RAW", new zzgek(zzghi.zzc(), 3));
                return Collections.unmodifiableMap(map2);
            default:
                HashMap map3 = new HashMap();
                map3.put("XCHACHA20_POLY1305", new zzgek(zzgkv.zzc(), 1));
                map3.put("XCHACHA20_POLY1305_RAW", new zzgek(zzgkv.zzc(), 3));
                return Collections.unmodifiableMap(map3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgel
    public final /* synthetic */ void zzd(zzgpx zzgpxVar) throws InvalidAlgorithmParameterException {
        switch (this.b) {
            case 0:
                zzgmi.zza(((zzggq) zzgpxVar).zza());
                break;
            case 1:
                break;
            default:
                break;
        }
    }
}
