package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zzg;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeqj implements zzeun {
    public static final Object h = new Object();
    public final String a;
    public final String b;
    public final zzdap c;
    public final zzfes d;
    public final zzfdn e;
    public final zzg f = com.google.android.gms.ads.internal.zzt.zzp().zzh();
    public final zzdxj g;

    public zzeqj(String str, String str2, zzdap zzdapVar, zzfes zzfesVar, zzfdn zzfdnVar, zzdxj zzdxjVar) {
        this.a = str;
        this.b = str2;
        this.c = zzdapVar;
        this.d = zzfesVar;
        this.e = zzfdnVar;
        this.g = zzdxjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final int zza() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final zzfyx zzb() {
        final Bundle bundle = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzgz)).booleanValue()) {
            this.g.zza().put("seq_num", this.a);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzeE)).booleanValue()) {
            this.c.zzg(this.e.zzd);
            bundle.putAll(this.d.zzb());
        }
        return zzfyo.zzi(new zzeum() { // from class: com.google.android.gms.internal.ads.zzeqi
            @Override // com.google.android.gms.internal.ads.zzeum
            public final void zzf(Object obj) {
                zzeqj zzeqjVar = this.zza;
                Bundle bundle2 = bundle;
                Bundle bundle3 = (Bundle) obj;
                zzeqjVar.getClass();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzeE)).booleanValue()) {
                    bundle3.putBundle("quality_signals", bundle2);
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzeD)).booleanValue()) {
                        synchronized (zzeqj.h) {
                            zzeqjVar.c.zzg(zzeqjVar.e.zzd);
                            bundle3.putBundle("quality_signals", zzeqjVar.d.zzb());
                        }
                    } else {
                        zzeqjVar.c.zzg(zzeqjVar.e.zzd);
                        bundle3.putBundle("quality_signals", zzeqjVar.d.zzb());
                    }
                }
                bundle3.putString("seq_num", zzeqjVar.a);
                if (zzeqjVar.f.zzP()) {
                    return;
                }
                bundle3.putString("session_id", zzeqjVar.b);
            }
        });
    }
}
