package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zzbs;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbdn {
    public zzbs a;
    public final Context b;
    public final String c;
    public final com.google.android.gms.ads.internal.client.zzdr d;

    @AppOpenAd.AppOpenAdOrientation
    public final int e;
    public final AppOpenAd.AppOpenAdLoadCallback f;
    public final zzbvc g = new zzbvc();
    public final com.google.android.gms.ads.internal.client.zzp h = com.google.android.gms.ads.internal.client.zzp.zza;

    public zzbdn(Context context, String str, com.google.android.gms.ads.internal.client.zzdr zzdrVar, @AppOpenAd.AppOpenAdOrientation int i, AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        this.b = context;
        this.c = str;
        this.d = zzdrVar;
        this.e = i;
        this.f = appOpenAdLoadCallback;
    }

    public final void zza() {
        String str = this.c;
        Context context = this.b;
        try {
            this.a = com.google.android.gms.ads.internal.client.zzaw.zza().zzd(context, com.google.android.gms.ads.internal.client.zzq.zzb(), str, this.g);
            com.google.android.gms.ads.internal.client.zzw zzwVar = new com.google.android.gms.ads.internal.client.zzw(this.e);
            zzbs zzbsVar = this.a;
            if (zzbsVar != null) {
                zzbsVar.zzI(zzwVar);
                this.a.zzH(new zzbda(this.f, str));
                this.a.zzaa(this.h.zza(context, this.d));
            }
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }
}
