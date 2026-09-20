package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.AdFormat;
import java.util.ArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfjc implements Runnable {
    public zzfdd A;
    public com.google.android.gms.ads.internal.client.zze B;
    public ScheduledFuture C;
    public final zzfje x;
    public String y;
    public String z;
    public final ArrayList w = new ArrayList();
    public int D = 2;

    public zzfjc(zzfje zzfjeVar) {
        this.x = zzfjeVar;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        zzg();
    }

    public final synchronized zzfjc zza(zzfir zzfirVar) {
        if (((Boolean) zzbkh.zzc.zze()).booleanValue()) {
            ArrayList arrayList = this.w;
            zzfirVar.zzg();
            arrayList.add(zzfirVar);
            ScheduledFuture scheduledFuture = this.C;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.C = zzcha.zzd.schedule(this, ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhu)).intValue(), TimeUnit.MILLISECONDS);
        }
        return this;
    }

    public final synchronized zzfjc zzb(String str) {
        if (((Boolean) zzbkh.zzc.zze()).booleanValue() && zzfjb.zze(str)) {
            this.y = str;
        }
        return this;
    }

    public final synchronized zzfjc zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbkh.zzc.zze()).booleanValue()) {
            this.B = zzeVar;
        }
        return this;
    }

    public final synchronized zzfjc zzd(ArrayList arrayList) {
        if (((Boolean) zzbkh.zzc.zze()).booleanValue()) {
            if (arrayList.contains("banner") || arrayList.contains(AdFormat.BANNER.name())) {
                this.D = 3;
            } else if (arrayList.contains("interstitial") || arrayList.contains(AdFormat.INTERSTITIAL.name())) {
                this.D = 4;
            } else if (arrayList.contains("native") || arrayList.contains(AdFormat.NATIVE.name())) {
                this.D = 8;
            } else if (arrayList.contains("rewarded") || arrayList.contains(AdFormat.REWARDED.name())) {
                this.D = 5;
            } else if (arrayList.contains("app_open_ad")) {
                this.D = 7;
            } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(AdFormat.REWARDED_INTERSTITIAL.name())) {
                this.D = 6;
            }
        }
        return this;
    }

    public final synchronized zzfjc zze(String str) {
        if (((Boolean) zzbkh.zzc.zze()).booleanValue()) {
            this.z = str;
        }
        return this;
    }

    public final synchronized zzfjc zzf(zzfdd zzfddVar) {
        if (((Boolean) zzbkh.zzc.zze()).booleanValue()) {
            this.A = zzfddVar;
        }
        return this;
    }

    public final synchronized void zzg() {
        if (((Boolean) zzbkh.zzc.zze()).booleanValue()) {
            ScheduledFuture scheduledFuture = this.C;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            for (zzfir zzfirVar : this.w) {
                int i = this.D;
                if (i != 2) {
                    zzfirVar.zzk(i);
                }
                if (!TextUtils.isEmpty(this.y)) {
                    zzfirVar.zzd(this.y);
                }
                if (!TextUtils.isEmpty(this.z) && !zzfirVar.zzi()) {
                    zzfirVar.zzc(this.z);
                }
                zzfdd zzfddVar = this.A;
                if (zzfddVar != null) {
                    zzfirVar.zzb(zzfddVar);
                } else {
                    com.google.android.gms.ads.internal.client.zze zzeVar = this.B;
                    if (zzeVar != null) {
                        zzfirVar.zza(zzeVar);
                    }
                }
                this.x.zzb(zzfirVar.zzj());
            }
            this.w.clear();
        }
    }

    public final synchronized zzfjc zzh(int i) {
        if (((Boolean) zzbkh.zzc.zze()).booleanValue()) {
            this.D = i;
        }
        return this;
    }
}
