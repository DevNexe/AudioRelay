package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbpw implements zzbpq {
    public final Context a;

    public zzbpw(Context context) {
        this.a = context;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zza(Object obj, Map map) {
        byte b;
        zzces zzcesVarZzo = com.google.android.gms.ads.internal.zzt.zzo();
        Context context = this.a;
        if (zzcesVarZzo.zzu(context)) {
            String str = (String) map.get("eventName");
            String str2 = (String) map.get("eventId");
            int iHashCode = str.hashCode();
            if (iHashCode != 94399) {
                if (iHashCode != 94401) {
                    if (iHashCode == 94407 && str.equals("_ai")) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                } else if (str.equals("_ac")) {
                    b = 0;
                } else {
                    b = -1;
                }
            } else if (str.equals("_aa")) {
                b = 2;
            } else {
                b = -1;
            }
            if (b == 0) {
                com.google.android.gms.ads.internal.zzt.zzo().zzm(context, str2);
                return;
            }
            if (b == 1) {
                com.google.android.gms.ads.internal.zzt.zzo().zzn(context, str2);
            } else if (b != 2) {
                zzcgn.zzg("logScionEvent gmsg contained unsupported eventName");
            } else {
                com.google.android.gms.ads.internal.zzt.zzo().zzk(context, str2);
            }
        }
    }
}
