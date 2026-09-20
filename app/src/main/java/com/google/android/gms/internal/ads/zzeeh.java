package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzg;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeeh implements zzdjr {
    public final String y;
    public final zzfhz z;
    public boolean w = false;
    public boolean x = false;
    public final zzg A = com.google.android.gms.ads.internal.zzt.zzp().zzh();

    public zzeeh(String str, zzfhz zzfhzVar) {
        this.y = str;
        this.z = zzfhzVar;
    }

    public final zzfhy a(String str) {
        String str2 = this.A.zzP() ? "" : this.y;
        zzfhy zzfhyVarZzb = zzfhy.zzb(str);
        zzfhyVarZzb.zza("tms", Long.toString(com.google.android.gms.ads.internal.zzt.zzB().c(), 10));
        zzfhyVarZzb.zza("tid", str2);
        return zzfhyVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zza(String str) {
        zzfhy zzfhyVarA = a("aaia");
        zzfhyVarA.zza("aair", "MalformedJson");
        this.z.zzb(zzfhyVarA);
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzb(String str, String str2) {
        zzfhy zzfhyVarA = a("adapter_init_finished");
        zzfhyVarA.zza("ancn", str);
        zzfhyVarA.zza("rqe", str2);
        this.z.zzb(zzfhyVarA);
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzc(String str) {
        zzfhy zzfhyVarA = a("adapter_init_started");
        zzfhyVarA.zza("ancn", str);
        this.z.zzb(zzfhyVarA);
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzd(String str) {
        zzfhy zzfhyVarA = a("adapter_init_finished");
        zzfhyVarA.zza("ancn", str);
        this.z.zzb(zzfhyVarA);
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final synchronized void zze() {
        if (this.x) {
            return;
        }
        this.z.zzb(a("init_finished"));
        this.x = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final synchronized void zzf() {
        if (this.w) {
            return;
        }
        this.z.zzb(a("init_started"));
        this.w = true;
    }
}
