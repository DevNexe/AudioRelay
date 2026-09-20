package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import j$.util.concurrent.ConcurrentHashMap;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class zzemh {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final zzdvj b;

    public zzemh(zzdvj zzdvjVar) {
        this.b = zzdvjVar;
    }

    @CheckForNull
    public final zzbwy zza(String str) {
        ConcurrentHashMap concurrentHashMap = this.a;
        if (concurrentHashMap.containsKey(str)) {
            return (zzbwy) concurrentHashMap.get(str);
        }
        return null;
    }

    public final void zzb(String str) {
        try {
            this.a.put(str, this.b.zzb(str));
        } catch (RemoteException e) {
            zzcgn.zzh("Couldn't create RTB adapter : ", e);
        }
    }
}
