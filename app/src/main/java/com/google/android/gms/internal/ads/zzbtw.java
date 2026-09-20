package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public final class zzbtw {
    public final Object a = new Object();
    public final Object b = new Object();

    @GuardedBy("lockClient")
    public zzbuf c;

    @GuardedBy("lockService")
    public zzbuf d;

    public final zzbuf zza(Context context, zzcgt zzcgtVar, zzfje zzfjeVar) {
        zzbuf zzbufVar;
        synchronized (this.a) {
            try {
                if (this.c == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    this.c = new zzbuf(context, zzcgtVar, (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zza), zzfjeVar);
                }
                zzbufVar = this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbufVar;
    }

    public final zzbuf zzb(Context context, zzcgt zzcgtVar, zzfje zzfjeVar) {
        zzbuf zzbufVar;
        synchronized (this.b) {
            try {
                if (this.d == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    this.d = new zzbuf(context, zzcgtVar, (String) zzbkx.zzb.zze(), zzfjeVar);
                }
                zzbufVar = this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbufVar;
    }
}
