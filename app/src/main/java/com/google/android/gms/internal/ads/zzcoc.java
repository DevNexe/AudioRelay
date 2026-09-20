package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcoc {
    public final int a;
    public final int zza;
    public final int zzb;

    public zzcoc(int i, int i2, int i3) {
        this.a = i;
        this.zzb = i2;
        this.zza = i3;
    }

    public static zzcoc zza() {
        return new zzcoc(0, 0, 0);
    }

    public static zzcoc zzb(int i, int i2) {
        return new zzcoc(1, i, i2);
    }

    public static zzcoc zzc(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        if (zzqVar.zzd) {
            return new zzcoc(3, 0, 0);
        }
        if (zzqVar.zzi) {
            return new zzcoc(2, 0, 0);
        }
        return zzqVar.zzh ? zza() : zzb(zzqVar.zzf, zzqVar.zzc);
    }

    public static zzcoc zzd() {
        return new zzcoc(5, 0, 0);
    }

    public static zzcoc zze() {
        return new zzcoc(4, 0, 0);
    }

    public final boolean zzf() {
        return this.a == 0;
    }

    public final boolean zzg() {
        return this.a == 2;
    }

    public final boolean zzh() {
        return this.a == 5;
    }

    public final boolean zzi() {
        return this.a == 3;
    }

    public final boolean zzj() {
        return this.a == 4;
    }
}
