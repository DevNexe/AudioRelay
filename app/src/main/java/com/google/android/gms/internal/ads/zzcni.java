package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zzcni implements Runnable {
    public final /* synthetic */ zzcnj zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ int zzc;
    public final /* synthetic */ boolean zzd;
    public final /* synthetic */ boolean zze;

    public /* synthetic */ zzcni(zzcnj zzcnjVar, int i, int i2, boolean z, boolean z2) {
        this.zza = zzcnjVar;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = z;
        this.zze = z2;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0059 A[Catch: RemoteException -> 0x0043, all -> 0x0076, TryCatch #0 {RemoteException -> 0x0043, blocks: (B:28:0x003b, B:30:0x003f, B:34:0x0047, B:36:0x004b, B:38:0x0050, B:40:0x0054, B:42:0x0059, B:44:0x005d, B:45:0x0060, B:47:0x0067, B:49:0x006b), top: B:57:0x003b, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x005d A[Catch: RemoteException -> 0x0043, all -> 0x0076, TryCatch #0 {RemoteException -> 0x0043, blocks: (B:28:0x003b, B:30:0x003f, B:34:0x0047, B:36:0x004b, B:38:0x0050, B:40:0x0054, B:42:0x0059, B:44:0x005d, B:45:0x0060, B:47:0x0067, B:49:0x006b), top: B:57:0x003b, outer: #1 }] */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        boolean z;
        boolean z2;
        com.google.android.gms.ads.internal.client.zzdn zzdnVar;
        com.google.android.gms.ads.internal.client.zzdn zzdnVar2;
        com.google.android.gms.ads.internal.client.zzdn zzdnVar3;
        com.google.android.gms.ads.internal.client.zzdn zzdnVar4;
        zzcnj zzcnjVar = this.zza;
        int i2 = this.zzb;
        int i3 = this.zzc;
        boolean z3 = this.zzd;
        boolean z4 = this.zze;
        synchronized (zzcnjVar.x) {
            boolean z5 = zzcnjVar.C;
            if (z5 || i3 != 1) {
                i = i3;
                z = false;
            } else {
                i = 1;
                z = true;
            }
            if (i2 == i3 || i != 1) {
                z2 = false;
            } else {
                i = 1;
                z2 = true;
            }
            boolean z6 = i2 != i3 && i == 2;
            boolean z7 = i2 != i3 && i == 3;
            zzcnjVar.C = z5 || z;
            if (z) {
                try {
                    com.google.android.gms.ads.internal.client.zzdn zzdnVar5 = zzcnjVar.B;
                    if (zzdnVar5 != null) {
                        zzdnVar5.zzi();
                    }
                    if (z2 && (zzdnVar4 = zzcnjVar.B) != null) {
                        zzdnVar4.zzh();
                    }
                    if (z6 && (zzdnVar3 = zzcnjVar.B) != null) {
                        zzdnVar3.zzg();
                    }
                    if (z7) {
                        zzdnVar2 = zzcnjVar.B;
                        if (zzdnVar2 != null) {
                            zzdnVar2.zze();
                        }
                        zzcnjVar.w.zzy();
                    }
                    if (z3 != z4 && (zzdnVar = zzcnjVar.B) != null) {
                        zzdnVar.zzf(z4);
                    }
                } catch (RemoteException e) {
                    zzcgn.zzl("#007 Could not call remote method.", e);
                }
            } else {
                if (z2) {
                    zzdnVar4.zzh();
                }
                if (z6) {
                    zzdnVar3.zzg();
                }
                if (z7) {
                    zzdnVar2 = zzcnjVar.B;
                    if (zzdnVar2 != null) {
                        zzdnVar2.zze();
                    }
                    zzcnjVar.w.zzy();
                }
                if (z3 != z4) {
                    zzdnVar.zzf(z4);
                }
            }
            throw th;
        }
    }
}
