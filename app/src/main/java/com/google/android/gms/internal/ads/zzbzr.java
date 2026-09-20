package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbzr {

    @GuardedBy("InternalQueryInfoGenerator.class")
    public static zzcfe d;
    public final Context a;
    public final AdFormat b;
    public final com.google.android.gms.ads.internal.client.zzdr c;

    public zzbzr(Context context, AdFormat adFormat, com.google.android.gms.ads.internal.client.zzdr zzdrVar) {
        this.a = context;
        this.b = adFormat;
        this.c = zzdrVar;
    }

    public static zzcfe zza(Context context) {
        zzcfe zzcfeVar;
        synchronized (zzbzr.class) {
            if (d == null) {
                d = com.google.android.gms.ads.internal.client.zzaw.zza().zzq(context, new zzbvc());
            }
            zzcfeVar = d;
        }
        return zzcfeVar;
    }

    public final void zzb(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        Context context = this.a;
        zzcfe zzcfeVarZza = zza(context);
        if (zzcfeVarZza == null) {
            queryInfoGenerationCallback.onFailure("Internal Error, query info generator is null.");
            return;
        }
        ObjectWrapper objectWrapper = new ObjectWrapper(context);
        com.google.android.gms.ads.internal.client.zzdr zzdrVar = this.c;
        try {
            zzcfeVarZza.zze(objectWrapper, new zzcfi(null, this.b.name(), null, zzdrVar == null ? new com.google.android.gms.ads.internal.client.zzm().zza() : com.google.android.gms.ads.internal.client.zzp.zza.zza(context, zzdrVar)), new zzbzq(queryInfoGenerationCallback));
        } catch (RemoteException unused) {
            queryInfoGenerationCallback.onFailure("Internal Error.");
        }
    }
}
