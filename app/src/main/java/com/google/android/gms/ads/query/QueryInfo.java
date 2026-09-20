package com.google.android.gms.ads.query;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzeg;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzbkm;
import com.google.android.gms.internal.ads.zzbzr;
import com.google.android.gms.internal.ads.zzcgc;

/* JADX INFO: loaded from: classes.dex */
public class QueryInfo {
    public final zzeg a;

    public QueryInfo(zzeg zzegVar) {
        this.a = zzegVar;
    }

    public static void generate(final Context context, final AdFormat adFormat, final AdRequest adRequest, final QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zzbiy.zzc(context);
        if (((Boolean) zzbkm.zzk.zze()).booleanValue()) {
            if (((Boolean) zzay.zzc().zzb(zzbiy.zziG)).booleanValue()) {
                zzcgc.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.query.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        AdFormat adFormat2 = adFormat;
                        AdRequest adRequest2 = adRequest;
                        new zzbzr(context2, adFormat2, adRequest2 == null ? null : adRequest2.zza()).zzb(queryInfoGenerationCallback);
                    }
                });
                return;
            }
        }
        new zzbzr(context, adFormat, adRequest == null ? null : adRequest.zza()).zzb(queryInfoGenerationCallback);
    }

    public String getQuery() {
        return this.a.zzb();
    }

    public Bundle getQueryBundle() {
        return this.a.zza();
    }

    public String getRequestId() {
        return this.a.zzd();
    }

    public final zzeg zza() {
        return this.a;
    }
}
