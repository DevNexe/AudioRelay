package com.google.android.gms.internal.ads;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class zzdxv {
    public final HashMap a;
    public final Executor b;
    public final zzcgs c;
    public final boolean d;
    public final zzfij e;
    public final boolean f;
    public final boolean g;

    public zzdxv(Executor executor, zzcgs zzcgsVar, zzfij zzfijVar) {
        this.a = new HashMap();
        this.b = executor;
        this.c = zzcgsVar;
        this.d = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbJ)).booleanValue();
        this.e = zzfijVar;
        this.f = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbM)).booleanValue();
        this.g = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzgb)).booleanValue();
    }

    public final void a(Map map, boolean z) {
        if (map.isEmpty()) {
            zzcgn.zze("Empty paramMap.");
            return;
        }
        final String strZza = this.e.zza(map);
        com.google.android.gms.ads.internal.util.zze.zza(strZza);
        boolean z2 = Boolean.parseBoolean((String) map.get("scar"));
        if (this.d) {
            if (!z || this.f) {
                if (!z2 || this.g) {
                    this.b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdxu
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzdxv zzdxvVar = this.zza;
                            zzdxvVar.c.zza(strZza);
                        }
                    });
                }
            }
        }
    }

    public final ConcurrentHashMap zzc() {
        return new ConcurrentHashMap(this.a);
    }

    public final void zzd(Map map) {
        a(map, true);
    }

    public final void zze(Map map) {
        a(map, false);
    }
}
