package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcvo implements zzgur {
    public final zzgve a;
    public final zzgve b;
    public final zzgve c;

    public zzcvo(zzgve zzgveVar, zzgve zzgveVar2, zzgve zzgveVar3) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
        this.c = zzgveVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcvi zzcviVar = (zzcvi) this.a.zzb();
        zzfyy zzfyyVar = zzcha.zza;
        zzguz.zzb(zzfyyVar);
        Set setEmptySet = ((JSONObject) this.c.zzb()) == null ? Collections.emptySet() : Collections.singleton(new zzdke(zzcviVar, zzfyyVar));
        zzguz.zzb(setEmptySet);
        return setEmptySet;
    }
}
