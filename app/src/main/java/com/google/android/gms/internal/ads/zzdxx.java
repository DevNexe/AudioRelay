package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdxx {
    public final String e;
    public final zzdxt f;
    public final ArrayList b = new ArrayList();
    public boolean c = false;
    public boolean d = false;
    public final zzg a = com.google.android.gms.ads.internal.zzt.zzp().zzh();

    public zzdxx(String str, zzdxt zzdxtVar) {
        this.e = str;
        this.f = zzdxtVar;
    }

    public final Map a() {
        Map mapZza = this.f.zza();
        mapZza.put("tms", Long.toString(com.google.android.gms.ads.internal.zzt.zzB().c(), 10));
        mapZza.put("tid", this.a.zzP() ? "" : this.e);
        return mapZza;
    }

    public final synchronized void zza(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbL)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhn)).booleanValue()) {
                Map mapA = a();
                mapA.put("action", "aaia");
                mapA.put("aair", "MalformedJson");
                this.b.add(mapA);
            }
        }
    }

    public final synchronized void zzb(String str, String str2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbL)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhn)).booleanValue()) {
                Map mapA = a();
                mapA.put("action", "adapter_init_finished");
                mapA.put("ancn", str);
                mapA.put("rqe", str2);
                this.b.add(mapA);
            }
        }
    }

    public final synchronized void zzc(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbL)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhn)).booleanValue()) {
                Map mapA = a();
                mapA.put("action", "adapter_init_started");
                mapA.put("ancn", str);
                this.b.add(mapA);
            }
        }
    }

    public final synchronized void zzd(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbL)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhn)).booleanValue()) {
                Map mapA = a();
                mapA.put("action", "adapter_init_finished");
                mapA.put("ancn", str);
                this.b.add(mapA);
            }
        }
    }

    public final synchronized void zze() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbL)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhn)).booleanValue()) {
                if (this.d) {
                    return;
                }
                Map mapA = a();
                mapA.put("action", "init_finished");
                this.b.add(mapA);
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    this.f.zze((Map) it.next());
                }
                this.d = true;
            }
        }
    }

    public final synchronized void zzf() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbL)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhn)).booleanValue()) {
                if (this.c) {
                    return;
                }
                Map mapA = a();
                mapA.put("action", "init_started");
                this.b.add(mapA);
                this.c = true;
            }
        }
    }
}
