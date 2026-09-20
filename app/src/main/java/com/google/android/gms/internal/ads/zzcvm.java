package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcvm implements zzgur {
    public final zzgve a;
    public final zzgve b;
    public final zzgve c;
    public final zzgve d;

    public zzcvm(zzgve zzgveVar, zzgve zzgveVar2, zzgve zzgveVar3, zzgve zzgveVar4) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
        this.c = zzgveVar3;
        this.d = zzgveVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final /* bridge */ /* synthetic */ Object zzb() {
        ((zzczs) this.a).zza();
        zzcgt zzcgtVarZza = ((zzcpa) this.b).zza();
        JSONObject jSONObject = (JSONObject) this.c.zzb();
        String str = (String) this.d.zzb();
        boolean zEquals = "native".equals(str);
        com.google.android.gms.ads.internal.zzt.zzq();
        return new zzbbi(UUID.randomUUID().toString(), zzcgtVarZza, str, jSONObject, false, zEquals);
    }
}
