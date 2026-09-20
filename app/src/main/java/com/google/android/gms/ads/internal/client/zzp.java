package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.internal.ads.zzcgg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zzp {
    public static final zzp zza = new zzp();

    public final zzl zza(Context context, zzdr zzdrVar) {
        zzc zzcVar;
        String strZzp;
        Date dateZzo = zzdrVar.zzo();
        long time = dateZzo != null ? dateZzo.getTime() : -1L;
        String strZzl = zzdrVar.zzl();
        int iZza = zzdrVar.zza();
        Set setZzr = zzdrVar.zzr();
        List listUnmodifiableList = !setZzr.isEmpty() ? Collections.unmodifiableList(new ArrayList(setZzr)) : null;
        boolean zZzt = zzdrVar.zzt(context);
        Bundle bundleZzf = zzdrVar.zzf(AdMobAdapter.class);
        AdInfo adInfoZzi = zzdrVar.zzi();
        if (adInfoZzi != null) {
            QueryInfo queryInfo = adInfoZzi.getQueryInfo();
            zzcVar = new zzc(zzdrVar.zzi().getAdString(), queryInfo != null ? queryInfo.zza().c : "");
        } else {
            zzcVar = null;
        }
        String strZzm = zzdrVar.zzm();
        SearchAdRequest searchAdRequestZzj = zzdrVar.zzj();
        zzfb zzfbVar = searchAdRequestZzj != null ? new zzfb(searchAdRequestZzj) : null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            zzaw.zzb();
            strZzp = zzcgg.zzp(Thread.currentThread().getStackTrace(), packageName);
        } else {
            strZzp = null;
        }
        boolean zZzs = zzdrVar.zzs();
        RequestConfiguration requestConfigurationZzc = zzed.zzf().zzc();
        return new zzl(8, time, bundleZzf, iZza, listUnmodifiableList, zZzt, Math.max(zzdrVar.zzc(), requestConfigurationZzc.getTagForChildDirectedTreatment()), false, strZzm, zzfbVar, null, strZzl, zzdrVar.zzg(), zzdrVar.zze(), Collections.unmodifiableList(new ArrayList(zzdrVar.zzq())), zzdrVar.zzn(), strZzp, zZzs, zzcVar, Math.max(-1, requestConfigurationZzc.getTagForUnderAgeOfConsent()), (String) Collections.max(Arrays.asList(null, requestConfigurationZzc.getMaxAdContentRating()), new Comparator() { // from class: com.google.android.gms.ads.internal.client.zzo
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list = RequestConfiguration.zza;
                return list.indexOf((String) obj) - list.indexOf((String) obj2);
            }
        }), zzdrVar.zzp(), zzdrVar.zzb(), zzdrVar.zzk());
    }
}
