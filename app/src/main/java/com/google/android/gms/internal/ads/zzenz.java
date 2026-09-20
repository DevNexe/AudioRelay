package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import defpackage.pd6;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zzenz {
    public final zzeoe a;
    public final String b;

    @GuardedBy("this")
    public com.google.android.gms.ads.internal.client.zzdh c;

    public zzenz(zzeoe zzeoeVar, String str) {
        this.a = zzeoeVar;
        this.b = str;
    }

    public final synchronized String zza() {
        com.google.android.gms.ads.internal.client.zzdh zzdhVar;
        try {
            zzdhVar = this.c;
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
            return null;
        }
        return zzdhVar != null ? zzdhVar.zzg() : null;
    }

    public final synchronized String zzb() {
        com.google.android.gms.ads.internal.client.zzdh zzdhVar;
        try {
            zzdhVar = this.c;
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
            return null;
        }
        return zzdhVar != null ? zzdhVar.zzg() : null;
    }

    public final synchronized void zzd(com.google.android.gms.ads.internal.client.zzl zzlVar, int i) {
        this.c = null;
        this.a.zzb(zzlVar, this.b, new zzeof(i), new pd6(this, 11));
    }

    public final synchronized boolean zze() {
        return this.a.zza();
    }
}
