package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcwb {
    public final zzfhz a;
    public final zzdxo b;
    public final zzfde c;

    public zzcwb(zzdxo zzdxoVar, zzfde zzfdeVar, zzfhz zzfhzVar) {
        this.a = zzfhzVar;
        this.b = zzdxoVar;
        this.c = zzfdeVar;
    }

    public static String a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return "h";
        }
        if (i2 == 1) {
            return "bb";
        }
        if (i2 == 2) {
            return "cc";
        }
        if (i2 != 3) {
            return i2 != 4 ? "u" : "ac";
        }
        return "cb";
    }

    public final void zza(long j, int i) {
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhn)).booleanValue();
        zzfde zzfdeVar = this.c;
        if (zBooleanValue) {
            zzfhy zzfhyVarZzb = zzfhy.zzb("ad_closed");
            zzfhyVarZzb.zzg(zzfdeVar.zzb.zzb);
            zzfhyVarZzb.zza("show_time", String.valueOf(j));
            zzfhyVarZzb.zza("ad_format", "app_open_ad");
            zzfhyVarZzb.zza("acr", a(i));
            this.a.zzb(zzfhyVarZzb);
            return;
        }
        zzdxn zzdxnVarZza = this.b.zza();
        zzdxnVarZza.zze(zzfdeVar.zzb.zzb);
        zzdxnVarZza.zzb("action", "ad_closed");
        zzdxnVarZza.zzb("show_time", String.valueOf(j));
        zzdxnVarZza.zzb("ad_format", "app_open_ad");
        zzdxnVarZza.zzb("acr", a(i));
        zzdxnVarZza.zzg();
    }
}
