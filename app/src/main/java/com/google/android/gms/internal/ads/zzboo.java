package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzboo implements zzbpq {
    @Override // com.google.android.gms.internal.ads.zzbpq
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcmn zzcmnVar = (zzcmn) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                zzcgn.zzj("No label given for CSI tick.");
                return;
            }
            if (TextUtils.isEmpty(str4)) {
                zzcgn.zzj("No timestamp given for CSI tick.");
                return;
            }
            try {
                long j = (Long.parseLong(str4) - com.google.android.gms.ads.internal.zzt.zzB().b()) + com.google.android.gms.ads.internal.zzt.zzB().c();
                if (true == TextUtils.isEmpty(str3)) {
                    str3 = "native:view_load";
                }
                zzcmnVar.zzo().zzc(str2, str3, j);
                return;
            } catch (NumberFormatException e) {
                zzcgn.zzk("Malformed timestamp for CSI tick.", e);
                return;
            }
        }
        if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                zzcgn.zzj("No value given for CSI experiment.");
                return;
            } else {
                zzcmnVar.zzo().zza().zzd("e", str5);
                return;
            }
        }
        if ("extra".equals(str)) {
            String str6 = (String) map.get(MediationMetaData.KEY_NAME);
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                zzcgn.zzj("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                zzcgn.zzj("No name given for CSI extra.");
            } else {
                zzcmnVar.zzo().zza().zzd(str6, str7);
            }
        }
    }
}
