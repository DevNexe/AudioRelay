package com.google.android.gms.internal.ads;

import defpackage.Bt7j;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbpx implements zzbpq {
    public static final Map d;
    public final com.google.android.gms.ads.internal.zzb a;
    public final zzbxu b;
    public final zzbyb c;

    static {
        String[] strArr = {"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"};
        Integer[] numArr = {1, 2, 3, 4, 5, 6, 7};
        Bt7j bt7j = new Bt7j(7);
        for (int i = 0; i < 7; i++) {
            bt7j.put(strArr[i], numArr[i]);
        }
        d = Collections.unmodifiableMap(bt7j);
    }

    public zzbpx(com.google.android.gms.ads.internal.zzb zzbVar, zzbxu zzbxuVar, zzbyb zzbybVar) {
        this.a = zzbVar;
        this.b = zzbxuVar;
        this.c = zzbybVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcmn zzcmnVar = (zzcmn) obj;
        int iIntValue = ((Integer) d.get((String) map.get("a"))).intValue();
        int i = 6;
        if (iIntValue != 5) {
            if (iIntValue != 7) {
                com.google.android.gms.ads.internal.zzb zzbVar = this.a;
                if (!zzbVar.zzc()) {
                    zzbVar.zzb(null);
                    return;
                }
                zzbxu zzbxuVar = this.b;
                if (iIntValue == 1) {
                    zzbxuVar.zzb(map);
                    return;
                }
                if (iIntValue == 3) {
                    new zzbxx(zzcmnVar, map).zzb();
                    return;
                }
                if (iIntValue == 4) {
                    new zzbxs(zzcmnVar, map).zzc();
                    return;
                } else if (iIntValue != 5) {
                    if (iIntValue == 6) {
                        zzbxuVar.zza(true);
                        return;
                    } else if (iIntValue != 7) {
                        zzcgn.zzi("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.c.zzc();
            return;
        }
        String str = (String) map.get("forceOrientation");
        boolean z = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
        if (zzcmnVar == null) {
            zzcgn.zzj("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            i = 7;
        } else if (!"landscape".equalsIgnoreCase(str)) {
            i = z ? -1 : 14;
        }
        zzcmnVar.zzas(i);
    }
}
