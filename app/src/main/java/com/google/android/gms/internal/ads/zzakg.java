package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzakg {
    public final Object zza;
    public final zzajj zzb;
    public final zzakj zzc;
    public boolean zzd;

    public zzakg(zzakj zzakjVar) {
        this.zzd = false;
        this.zza = null;
        this.zzb = null;
        this.zzc = zzakjVar;
    }

    public zzakg(Object obj, zzajj zzajjVar) {
        this.zzd = false;
        this.zza = obj;
        this.zzb = zzajjVar;
        this.zzc = null;
    }

    public static zzakg zza(zzakj zzakjVar) {
        return new zzakg(zzakjVar);
    }

    public static zzakg zzb(Object obj, zzajj zzajjVar) {
        return new zzakg(obj, zzajjVar);
    }

    public final boolean zzc() {
        return this.zzc == null;
    }
}
