package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeuy implements zzeun {
    public final zzfyy a;
    public final Context b;

    public zzeuy(zzfyy zzfyyVar, Context context) {
        this.a = zzfyyVar;
        this.b = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final int zza() {
        return 39;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final zzfyx zzb() {
        return this.a.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeux
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i;
                boolean zIsActiveNetworkMetered;
                int i2;
                Context context = this.zza.b;
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                String networkOperator = telephonyManager.getNetworkOperator();
                int phoneType = telephonyManager.getPhoneType();
                com.google.android.gms.ads.internal.zzt.zzq();
                int i3 = -1;
                if (com.google.android.gms.ads.internal.util.zzs.zzx(context, "android.permission.ACCESS_NETWORK_STATE")) {
                    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null) {
                        int type = activeNetworkInfo.getType();
                        int iOrdinal = activeNetworkInfo.getDetailedState().ordinal();
                        i = type;
                        i3 = iOrdinal;
                    } else {
                        i = -1;
                    }
                    zIsActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
                    i2 = i3;
                } else {
                    i = -2;
                    zIsActiveNetworkMetered = false;
                    i2 = -1;
                }
                return new zzeuw(networkOperator, i, com.google.android.gms.ads.internal.zzt.zzr().zzl(context), phoneType, zIsActiveNetworkMetered, i2);
            }
        });
    }
}
