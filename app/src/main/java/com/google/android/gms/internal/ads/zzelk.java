package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import defpackage.uh6;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class zzelk implements zzegk {
    public final zzegm a;
    public final zzegs b;
    public final zzfhp c;
    public final zzfyy d;

    public zzelk(zzfhp zzfhpVar, zzfyy zzfyyVar, zzegm zzegmVar, zzegs zzegsVar) {
        this.c = zzfhpVar;
        this.d = zzfyyVar;
        this.b = zzegsVar;
        this.a = zzegmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final zzfyx zza(final zzfde zzfdeVar, final zzfcs zzfcsVar) {
        final zzegn zzegnVarZza;
        Iterator it = zzfcsVar.zzu.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzegnVarZza = null;
                break;
            }
            try {
                zzegnVarZza = this.a.zza((String) it.next(), zzfcsVar.zzw);
                break;
            } catch (zzfds unused) {
            }
        }
        if (zzegnVarZza == null) {
            return zzfyo.zzh(new zzejm("Unable to instantiate mediation adapter class."));
        }
        zzchf zzchfVar = new zzchf();
        zzegnVarZza.zzc.zza(new uh6(zzegnVarZza, zzchfVar));
        if (zzfcsVar.zzN) {
            Bundle bundle = zzfdeVar.zza.zza.zzd.zzm;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        return zzfgz.zzd(new zzfgt() { // from class: com.google.android.gms.internal.ads.zzelh
            @Override // com.google.android.gms.internal.ads.zzfgt
            public final void zza() {
                zzelk zzelkVar = this.zza;
                zzelkVar.b.zzb(zzfdeVar, zzfcsVar, zzegnVarZza);
            }
        }, this.d, zzfhj.ADAPTER_LOAD_AD_SYN, this.c).zzb(zzfhj.ADAPTER_LOAD_AD_ACK).zzd(zzchfVar).zzb(zzfhj.ADAPTER_WRAP_ADAPTER).zze(new zzfgs() { // from class: com.google.android.gms.internal.ads.zzeli
            @Override // com.google.android.gms.internal.ads.zzfgs
            public final Object zza(Object obj) {
                zzelk zzelkVar = this.zza;
                return zzelkVar.b.zza(zzfdeVar, zzfcsVar, zzegnVarZza);
            }
        }).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final boolean zzb(zzfde zzfdeVar, zzfcs zzfcsVar) {
        return !zzfcsVar.zzu.isEmpty();
    }
}
