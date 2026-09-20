package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeob {
    public final zzdoz a;
    public final zzeno b;
    public final zzeoa c;

    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.android.gms.internal.ads.zzeoa] */
    public zzeob(zzdoz zzdozVar, zzfhz zzfhzVar) {
        this.a = zzdozVar;
        final zzeno zzenoVar = new zzeno(zzfhzVar);
        this.b = zzenoVar;
        final zzbsg zzbsgVarZzg = zzdozVar.zzg();
        this.c = new zzddb() { // from class: com.google.android.gms.internal.ads.zzeoa
            @Override // com.google.android.gms.internal.ads.zzddb
            public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
                zzeno zzenoVar2 = zzenoVar;
                zzbsg zzbsgVar = zzbsgVarZzg;
                zzenoVar2.zza(zzeVar);
                if (zzbsgVar != null) {
                    try {
                        zzbsgVar.zzf(zzeVar);
                    } catch (RemoteException e) {
                        zzcgn.zzl("#007 Could not call remote method.", e);
                    }
                }
                if (zzbsgVar != null) {
                    try {
                        zzbsgVar.zze(zzeVar.zza);
                    } catch (RemoteException e2) {
                        zzcgn.zzl("#007 Could not call remote method.", e2);
                    }
                }
            }
        };
    }

    public final zzddb zza() {
        return this.c;
    }

    public final zzdem zzb() {
        return this.b;
    }

    public final zzdmw zzc() {
        return new zzdmw(this.a, this.b.zzc());
    }

    public final zzeno zzd() {
        return this.b;
    }

    public final void zze(com.google.android.gms.ads.internal.client.zzbf zzbfVar) {
        this.b.zze(zzbfVar);
    }
}
