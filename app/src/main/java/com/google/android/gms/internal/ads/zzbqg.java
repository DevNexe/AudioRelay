package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbqg implements zzbpq {
    public final zzbqf a;

    public zzbqg(zzbqf zzbqfVar) {
        this.a = zzbqfVar;
    }

    public static void zzb(zzcmn zzcmnVar, zzbqf zzbqfVar) {
        zzcmnVar.zzaf("/reward", new zzbqg(zzbqfVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("action");
        boolean zEquals = "grant".equals(str);
        zzbqf zzbqfVar = this.a;
        if (!zEquals) {
            if ("video_start".equals(str)) {
                zzbqfVar.zzc();
                return;
            } else {
                if ("video_complete".equals(str)) {
                    zzbqfVar.zzb();
                    return;
                }
                return;
            }
        }
        zzccc zzcccVar = null;
        try {
            int i = Integer.parseInt((String) map.get("amount"));
            String str2 = (String) map.get("type");
            if (!TextUtils.isEmpty(str2)) {
                zzcccVar = new zzccc(str2, i);
            }
        } catch (NumberFormatException e) {
            zzcgn.zzk("Unable to parse reward amount.", e);
        }
        zzbqfVar.zza(zzcccVar);
    }
}
