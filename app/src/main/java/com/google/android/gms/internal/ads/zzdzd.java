package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.xf6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdzd implements xf6 {
    public final long a;
    public final zzdys b;
    public final zzfcj c;

    public zzdzd(long j, Context context, zzdys zzdysVar, zzcok zzcokVar, String str) {
        this.a = j;
        this.b = zzdysVar;
        zzfcl zzfclVarZzu = zzcokVar.zzu();
        zzfclVarZzu.zzb(context);
        zzfclVarZzu.zza(str);
        this.c = zzfclVarZzu.mo49zzc().zza();
    }

    @Override // defpackage.xf6
    public final void zza() {
    }

    @Override // defpackage.xf6
    public final void zzb(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        try {
            this.c.zzf(zzlVar, new zzdzb(this));
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.xf6
    public final void zzc() {
        zzfcj zzfcjVar = this.c;
        try {
            zzfcjVar.zzk(new zzdzc(this));
            zzfcjVar.zzm(new ObjectWrapper(null));
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }
}
