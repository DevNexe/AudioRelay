package com.google.android.gms.internal.ads;

import android.os.Handler;

/* JADX INFO: loaded from: classes3.dex */
public final class zznp {
    public final Handler a;
    public final zznq b;

    public zznp(Handler handler, zznq zznqVar) {
        this.a = zznqVar == null ? null : handler;
        this.b = zznqVar;
    }

    public final void zza(final Exception exc) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zznf
                @Override // java.lang.Runnable
                public final void run() {
                    zznp zznpVar = this.zza;
                    Exception exc2 = exc;
                    zznpVar.getClass();
                    int i = zzel.zza;
                    zznpVar.b.zzc(exc2);
                }
            });
        }
    }

    public final void zzb(final Exception exc) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zznl
                @Override // java.lang.Runnable
                public final void run() {
                    zznp zznpVar = this.zza;
                    Exception exc2 = exc;
                    zznpVar.getClass();
                    int i = zzel.zza;
                    zznpVar.b.zzj(exc2);
                }
            });
        }
    }

    public final void zzc(final String str, final long j, final long j2) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zznk
                @Override // java.lang.Runnable
                public final void run() {
                    zznp zznpVar = this.zza;
                    String str2 = str;
                    long j3 = j;
                    long j4 = j2;
                    zznq zznqVar = zznpVar.b;
                    int i = zzel.zza;
                    zznqVar.zzd(str2, j3, j4);
                }
            });
        }
    }

    public final void zzd(final String str) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zznm
                @Override // java.lang.Runnable
                public final void run() {
                    zznp zznpVar = this.zza;
                    String str2 = str;
                    zznpVar.getClass();
                    int i = zzel.zza;
                    zznpVar.b.zze(str2);
                }
            });
        }
    }

    public final void zze(final zzgq zzgqVar) {
        zzgqVar.zza();
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzng
                @Override // java.lang.Runnable
                public final void run() {
                    zznp zznpVar = this.zza;
                    zzgq zzgqVar2 = zzgqVar;
                    zznpVar.getClass();
                    zzgqVar2.zza();
                    int i = zzel.zza;
                    zznpVar.b.zzf(zzgqVar2);
                }
            });
        }
    }

    public final void zzf(final zzgq zzgqVar) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zznh
                @Override // java.lang.Runnable
                public final void run() {
                    zznp zznpVar = this.zza;
                    zzgq zzgqVar2 = zzgqVar;
                    zznpVar.getClass();
                    int i = zzel.zza;
                    zznpVar.b.zzg(zzgqVar2);
                }
            });
        }
    }

    public final void zzg(final zzaf zzafVar, final zzgr zzgrVar) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zznn
                @Override // java.lang.Runnable
                public final void run() {
                    zznp zznpVar = this.zza;
                    zzaf zzafVar2 = zzafVar;
                    zzgr zzgrVar2 = zzgrVar;
                    zznpVar.getClass();
                    int i = zzel.zza;
                    zznpVar.b.zzh(zzafVar2, zzgrVar2);
                }
            });
        }
    }

    public final void zzr(final long j) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzni
                @Override // java.lang.Runnable
                public final void run() {
                    zznp zznpVar = this.zza;
                    long j2 = j;
                    zznpVar.getClass();
                    int i = zzel.zza;
                    zznpVar.b.zzi(j2);
                }
            });
        }
    }

    public final void zzs(final boolean z) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zznj
                @Override // java.lang.Runnable
                public final void run() {
                    zznp zznpVar = this.zza;
                    boolean z2 = z;
                    zznpVar.getClass();
                    int i = zzel.zza;
                    zznpVar.b.zzn(z2);
                }
            });
        }
    }

    public final void zzt(final int i, final long j, final long j2) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzno
                @Override // java.lang.Runnable
                public final void run() {
                    zznp zznpVar = this.zza;
                    int i2 = i;
                    long j3 = j;
                    long j4 = j2;
                    zznq zznqVar = zznpVar.b;
                    int i3 = zzel.zza;
                    zznqVar.zzk(i2, j3, j4);
                }
            });
        }
    }
}
