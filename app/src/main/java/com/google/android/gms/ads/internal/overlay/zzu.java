package com.google.android.gms.ads.internal.overlay;

import com.google.android.gms.internal.ads.zzcmn;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zzu implements Runnable {
    public final /* synthetic */ zzw zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ Map zzc;

    public /* synthetic */ zzu(zzw zzwVar, String str, Map map) {
        this.zza = zzwVar;
        this.zzb = str;
        this.zzc = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzw zzwVar = this.zza;
        String str = this.zzb;
        Map map = this.zzc;
        zzcmn zzcmnVar = zzwVar.c;
        if (zzcmnVar != null) {
            zzcmnVar.zzd(str, map);
        }
    }
}
