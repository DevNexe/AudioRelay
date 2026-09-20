package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdnx implements zzgur {
    public final zzgve a;
    public final zzgve b;

    public zzdnx(zzgve zzgveVar, zzgve zzgveVar2) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcgt zzcgtVarZza = ((zzcpa) this.a).zza();
        com.google.android.gms.ads.internal.zzt.zzq();
        return new zzbbi(UUID.randomUUID().toString(), zzcgtVarZza, "native", new JSONObject(), false, true);
    }
}
