package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcue implements zzctu {
    public final Context a;
    public final zzg b = com.google.android.gms.ads.internal.zzt.zzp().zzh();

    public zzcue(Context context) {
        this.a = context;
    }

    @Override // com.google.android.gms.internal.ads.zzctu
    public final void zza(Map map) {
        if (map.isEmpty()) {
            return;
        }
        String str = (String) map.get("gad_idless");
        if (str != null) {
            boolean z = Boolean.parseBoolean(str);
            map.remove("gad_idless");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzar)).booleanValue()) {
                this.b.zzH(z);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfj)).booleanValue() && z) {
                    this.a.deleteDatabase("OfflineUpload.db");
                }
            }
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzam)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzo().zzr(bundle);
        }
    }
}
