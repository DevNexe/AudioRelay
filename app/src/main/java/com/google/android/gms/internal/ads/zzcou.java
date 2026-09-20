package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcou implements zzgur {
    public final zzgve a;
    public final zzgve b;

    public zzcou(zzgve zzgveVar, zzgve zzgveVar2) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x003b  */
    @Override // com.google.android.gms.internal.ads.zzgve
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setEmptySet;
        zzeeh zzeehVar = (zzeeh) this.a.zzb();
        zzfyy zzfyyVar = zzcha.zza;
        zzguz.zzb(zzfyyVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbL)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhn)).booleanValue()) {
                setEmptySet = Collections.singleton(new zzdke(zzeehVar, zzfyyVar));
            } else {
                setEmptySet = Collections.emptySet();
            }
        } else {
            setEmptySet = Collections.emptySet();
        }
        zzguz.zzb(setEmptySet);
        return setEmptySet;
    }
}
