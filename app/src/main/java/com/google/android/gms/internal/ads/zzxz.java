package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public final class zzxz {
    public final Handler a;
    public final zzya b;

    public zzxz(Handler handler, zzya zzyaVar) {
        this.a = zzyaVar == null ? null : handler;
        this.b = zzyaVar;
    }

    public final void zza(final String str, final long j, final long j2) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxv
                @Override // java.lang.Runnable
                public final void run() {
                    zzxz zzxzVar = this.zza;
                    String str2 = str;
                    long j3 = j;
                    long j4 = j2;
                    zzya zzyaVar = zzxzVar.b;
                    int i = zzel.zza;
                    zzyaVar.zzp(str2, j3, j4);
                }
            });
        }
    }

    public final void zzb(final String str) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxy
                @Override // java.lang.Runnable
                public final void run() {
                    zzxz zzxzVar = this.zza;
                    String str2 = str;
                    zzxzVar.getClass();
                    int i = zzel.zza;
                    zzxzVar.b.zzq(str2);
                }
            });
        }
    }

    public final void zzc(final zzgq zzgqVar) {
        zzgqVar.zza();
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxu
                @Override // java.lang.Runnable
                public final void run() {
                    zzxz zzxzVar = this.zza;
                    zzgq zzgqVar2 = zzgqVar;
                    zzxzVar.getClass();
                    zzgqVar2.zza();
                    int i = zzel.zza;
                    zzxzVar.b.zzr(zzgqVar2);
                }
            });
        }
    }

    public final void zzd(final int i, final long j) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxp
                @Override // java.lang.Runnable
                public final void run() {
                    zzxz zzxzVar = this.zza;
                    int i2 = i;
                    long j2 = j;
                    zzxzVar.getClass();
                    int i3 = zzel.zza;
                    zzxzVar.b.zzl(i2, j2);
                }
            });
        }
    }

    public final void zze(final zzgq zzgqVar) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxt
                @Override // java.lang.Runnable
                public final void run() {
                    zzxz zzxzVar = this.zza;
                    zzgq zzgqVar2 = zzgqVar;
                    zzxzVar.getClass();
                    int i = zzel.zza;
                    zzxzVar.b.zzs(zzgqVar2);
                }
            });
        }
    }

    public final void zzf(final zzaf zzafVar, final zzgr zzgrVar) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxw
                @Override // java.lang.Runnable
                public final void run() {
                    zzxz zzxzVar = this.zza;
                    zzaf zzafVar2 = zzafVar;
                    zzgr zzgrVar2 = zzgrVar;
                    zzxzVar.getClass();
                    int i = zzel.zza;
                    zzxzVar.b.zzu(zzafVar2, zzgrVar2);
                }
            });
        }
    }

    public final void zzq(final Object obj) {
        Handler handler = this.a;
        if (handler != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxq
                @Override // java.lang.Runnable
                public final void run() {
                    zzxz zzxzVar = this.zza;
                    Object obj2 = obj;
                    long j = jElapsedRealtime;
                    zzxzVar.getClass();
                    int i = zzel.zza;
                    zzxzVar.b.zzm(obj2, j);
                }
            });
        }
    }

    public final void zzr(final long j, final int i) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxs
                @Override // java.lang.Runnable
                public final void run() {
                    zzxz zzxzVar = this.zza;
                    long j2 = j;
                    int i2 = i;
                    zzxzVar.getClass();
                    int i3 = zzel.zza;
                    zzxzVar.b.zzt(j2, i2);
                }
            });
        }
    }

    public final void zzs(final Exception exc) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxr
                @Override // java.lang.Runnable
                public final void run() {
                    zzxz zzxzVar = this.zza;
                    Exception exc2 = exc;
                    zzxzVar.getClass();
                    int i = zzel.zza;
                    zzxzVar.b.zzo(exc2);
                }
            });
        }
    }

    public final void zzt(final zzda zzdaVar) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxx
                @Override // java.lang.Runnable
                public final void run() {
                    zzxz zzxzVar = this.zza;
                    zzda zzdaVar2 = zzdaVar;
                    zzxzVar.getClass();
                    int i = zzel.zza;
                    zzxzVar.b.zzv(zzdaVar2);
                }
            });
        }
    }
}
