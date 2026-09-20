package defpackage;

import com.google.android.gms.internal.ads.zzamx;
import com.google.android.gms.internal.ads.zzapf;
import com.google.android.gms.internal.ads.zzapu;
import com.google.android.gms.internal.ads.zzaqi;
import com.google.android.gms.internal.ads.zzaqk;
import com.google.android.gms.internal.ads.zzfmh;
import com.google.android.gms.internal.ads.zzfmy;
import com.google.android.gms.internal.ads.zzfoe;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class jz5 implements zzfoe {
    public final zzfmh a;
    public final zzfmy b;
    public final zzaqi c;
    public final zzapu d;
    public final zzapf e;
    public final zzaqk f;

    public jz5(zzfmh zzfmhVar, zzfmy zzfmyVar, zzaqi zzaqiVar, zzapu zzapuVar, zzapf zzapfVar, zzaqk zzaqkVar) {
        this.a = zzfmhVar;
        this.b = zzfmyVar;
        this.c = zzaqiVar;
        this.d = zzapuVar;
        this.e = zzapfVar;
        this.f = zzaqkVar;
    }

    public final HashMap a() {
        HashMap map = new HashMap();
        zzamx zzamxVarZzb = this.b.zzb();
        zzfmh zzfmhVar = this.a;
        map.put("v", zzfmhVar.zzb());
        map.put("gms", Boolean.valueOf(zzfmhVar.zzc()));
        map.put("int", zzamxVarZzb.zzh());
        map.put("up", Boolean.valueOf(this.d.a));
        map.put("t", new Throwable());
        return map;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    public final Map zza() {
        HashMap mapA = a();
        mapA.put("lts", Long.valueOf(this.c.zza()));
        return mapA;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    public final Map zzb() {
        HashMap mapA = a();
        zzamx zzamxVarZza = this.b.zza();
        mapA.put("gai", Boolean.valueOf(this.a.zzd()));
        mapA.put("did", zzamxVarZza.zzg());
        mapA.put("dst", Integer.valueOf(zzamxVarZza.zzak() - 1));
        mapA.put("doo", Boolean.valueOf(zzamxVarZza.zzah()));
        zzapf zzapfVar = this.e;
        if (zzapfVar != null) {
            mapA.put("nt", Long.valueOf(zzapfVar.zza()));
        }
        zzaqk zzaqkVar = this.f;
        if (zzaqkVar != null) {
            mapA.put("vs", Long.valueOf(zzaqkVar.zzc()));
            mapA.put("vf", Long.valueOf(zzaqkVar.zzb()));
        }
        return mapA;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    public final Map zzc() {
        return a();
    }
}
