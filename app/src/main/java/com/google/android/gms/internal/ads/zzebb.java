package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzebb implements zzgur {
    public final zzgve a;
    public final zzgve b;
    public final zzgve c;

    public zzebb(zzgve zzgveVar, zzgve zzgveVar2, zzgve zzgveVar3) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
        this.c = zzgveVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final /* bridge */ /* synthetic */ Object zzb() {
        final zzapb zzapbVar = (zzapb) this.a.zzb();
        final Context contextZza = ((zzcoq) this.b).zza();
        zzfyy zzfyyVar = zzcha.zza;
        zzguz.zzb(zzfyyVar);
        zzfyx zzfyxVarZzb = zzfyyVar.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeay
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzapb zzapbVar2 = zzapbVar;
                return zzapbVar2.zzc().zzg(contextZza);
            }
        });
        zzguz.zzb(zzfyxVarZzb);
        return zzfyxVarZzb;
    }
}
