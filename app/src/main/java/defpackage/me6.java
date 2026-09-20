package defpackage;

import com.google.android.gms.internal.ads.zzczf;
import com.google.android.gms.internal.ads.zzczj;
import com.google.android.gms.internal.ads.zzdoz;
import com.google.android.gms.internal.ads.zzegk;
import com.google.android.gms.internal.ads.zzegl;
import com.google.android.gms.internal.ads.zzeiy;
import com.google.android.gms.internal.ads.zzfru;
import com.google.android.gms.internal.ads.zzgve;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class me6 implements zzczf {
    public final Map a;
    public final Map b;
    public final Map c;
    public final zzgve d;
    public final zzdoz e;

    public me6(Map map, Map map2, Map map3, zzgve zzgveVar, zzdoz zzdozVar) {
        this.a = map;
        this.b = map2;
        this.c = map3;
        this.d = zzgveVar;
        this.e = zzdozVar;
    }

    @Override // com.google.android.gms.internal.ads.zzczf
    public final zzegk zza(int i, String str) {
        zzegk zzegkVarZza;
        zzegk zzegkVar = (zzegk) this.a.get(str);
        if (zzegkVar != null) {
            return zzegkVar;
        }
        if (i == 1) {
            if (this.e.zze() == null || (zzegkVarZza = ((zzczf) this.d.zzb()).zza(i, str)) == null) {
                return null;
            }
            return zzczj.zza(zzegkVarZza);
        }
        if (i != 4) {
            return null;
        }
        zzeiy zzeiyVar = (zzeiy) this.c.get(str);
        if (zzeiyVar != null) {
            return new zzegl(zzeiyVar, new zzfru() { // from class: com.google.android.gms.internal.ads.zzczh
                @Override // com.google.android.gms.internal.ads.zzfru
                public final Object apply(Object obj) {
                    return new zzczj((List) obj);
                }
            });
        }
        zzegk zzegkVar2 = (zzegk) this.b.get(str);
        if (zzegkVar2 == null) {
            return null;
        }
        return zzczj.zza(zzegkVar2);
    }
}
