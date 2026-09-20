package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzdcf;
import com.google.android.gms.internal.ads.zzfhj;
import com.google.android.gms.internal.ads.zzfhp;
import com.google.android.gms.internal.ads.zzgur;
import com.google.android.gms.internal.ads.zzgve;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class zzai implements zzgur {
    public final zzgve a;
    public final zzgve b;
    public final zzgve c;

    public zzai(zzgve zzgveVar, zzgve zzgveVar2, zzgve zzgveVar3) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
        this.c = zzgveVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final /* bridge */ /* synthetic */ Object zzb() {
        return ((zzfhp) this.a.zzb()).zzb(zzfhj.GENERATE_SIGNALS, ((zzdcf) this.c).zzb().zzc()).zzf(((zzal) this.b).zzb()).zzi(((Integer) zzay.zzc().zzb(zzbiy.zzeB)).intValue(), TimeUnit.SECONDS).zza();
    }
}
