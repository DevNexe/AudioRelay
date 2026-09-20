package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzejp implements zzegk {
    public abstract zzfyx a(zzfdn zzfdnVar, Bundle bundle);

    @Override // com.google.android.gms.internal.ads.zzegk
    public final zzfyx zza(zzfde zzfdeVar, zzfcs zzfcsVar) {
        String strOptString = zzfcsVar.zzw.optString("pubid", "");
        zzfdn zzfdnVar = zzfdeVar.zza.zza;
        zzfdl zzfdlVar = new zzfdl();
        zzfdlVar.zzp(zzfdnVar);
        zzfdlVar.zzs(strOptString);
        Bundle bundle = zzfdnVar.zzd.zzm;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        Bundle bundle3 = bundle2.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        Bundle bundle4 = bundle3 == null ? new Bundle() : new Bundle(bundle3);
        bundle4.putInt("gw", 1);
        String strOptString2 = zzfcsVar.zzw.optString("mad_hac", null);
        if (strOptString2 != null) {
            bundle4.putString("mad_hac", strOptString2);
        }
        String strOptString3 = zzfcsVar.zzw.optString("adJson", null);
        if (strOptString3 != null) {
            bundle4.putString("_ad", strOptString3);
        }
        bundle4.putBoolean("_noRefresh", true);
        Iterator<String> itKeys = zzfcsVar.zzE.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString4 = zzfcsVar.zzE.optString(next, null);
            if (next != null) {
                bundle4.putString(next, strOptString4);
            }
        }
        bundle2.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle4);
        com.google.android.gms.ads.internal.client.zzl zzlVar = zzfdnVar.zzd;
        zzfdlVar.zzE(new com.google.android.gms.ads.internal.client.zzl(zzlVar.zza, zzlVar.zzb, bundle4, zzlVar.zzd, zzlVar.zze, zzlVar.zzf, zzlVar.zzg, zzlVar.zzh, zzlVar.zzi, zzlVar.zzj, zzlVar.zzk, zzlVar.zzl, bundle2, zzlVar.zzn, zzlVar.zzo, zzlVar.zzp, zzlVar.zzq, zzlVar.zzr, zzlVar.zzs, zzlVar.zzt, zzlVar.zzu, zzlVar.zzv, zzlVar.zzw, zzlVar.zzx));
        zzfdn zzfdnVarZzG = zzfdlVar.zzG();
        Bundle bundle5 = new Bundle();
        zzfcv zzfcvVar = zzfdeVar.zzb.zzb;
        Bundle bundle6 = new Bundle();
        bundle6.putStringArrayList("nofill_urls", new ArrayList<>(zzfcvVar.zza));
        bundle6.putInt("refresh_interval", zzfcvVar.zzc);
        bundle6.putString("gws_query_id", zzfcvVar.zzb);
        bundle5.putBundle("parent_common_config", bundle6);
        String str = zzfdeVar.zza.zza.zzf;
        Bundle bundle7 = new Bundle();
        bundle7.putString("initial_ad_unit_id", str);
        bundle7.putString("allocation_id", zzfcsVar.zzx);
        bundle7.putStringArrayList("click_urls", new ArrayList<>(zzfcsVar.zzc));
        bundle7.putStringArrayList("imp_urls", new ArrayList<>(zzfcsVar.zzd));
        bundle7.putStringArrayList("manual_tracking_urls", new ArrayList<>(zzfcsVar.zzq));
        bundle7.putStringArrayList("fill_urls", new ArrayList<>(zzfcsVar.zzn));
        bundle7.putStringArrayList("video_start_urls", new ArrayList<>(zzfcsVar.zzh));
        bundle7.putStringArrayList("video_reward_urls", new ArrayList<>(zzfcsVar.zzi));
        bundle7.putStringArrayList("video_complete_urls", new ArrayList<>(zzfcsVar.zzj));
        bundle7.putString("transaction_id", zzfcsVar.zzk);
        bundle7.putString("valid_from_timestamp", zzfcsVar.zzl);
        bundle7.putBoolean("is_closable_area_disabled", zzfcsVar.zzQ);
        if (zzfcsVar.zzm != null) {
            Bundle bundle8 = new Bundle();
            bundle8.putInt("rb_amount", zzfcsVar.zzm.zzb);
            bundle8.putString("rb_type", zzfcsVar.zzm.zza);
            bundle7.putParcelableArray("rewards", new Bundle[]{bundle8});
        }
        bundle5.putBundle("parent_ad_config", bundle7);
        return a(zzfdnVarZzG, bundle5);
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final boolean zzb(zzfde zzfdeVar, zzfcs zzfcsVar) {
        return !TextUtils.isEmpty(zzfcsVar.zzw.optString("pubid", ""));
    }
}
