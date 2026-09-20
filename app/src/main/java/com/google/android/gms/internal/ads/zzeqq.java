package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeqq implements zzeun {
    public final zzfyy a;
    public final Context b;

    public zzeqq(zzfyy zzfyyVar, Context context) {
        this.a = zzfyyVar;
        this.b = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final int zza() {
        return 14;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    @SuppressLint({"UnprotectedReceiver"})
    public final zzfyx zzb() {
        return this.a.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeqp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                double intExtra;
                zzeqq zzeqqVar = this.zza;
                zzeqqVar.getClass();
                IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
                boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zziy)).booleanValue();
                Context context = zzeqqVar.b;
                Intent intentRegisterReceiver = (!zBooleanValue || Build.VERSION.SDK_INT < 33) ? context.registerReceiver(null, intentFilter) : context.registerReceiver(null, intentFilter, 4);
                boolean z = false;
                if (intentRegisterReceiver != null) {
                    int intExtra2 = intentRegisterReceiver.getIntExtra("status", -1);
                    intExtra = ((double) intentRegisterReceiver.getIntExtra("level", -1)) / ((double) intentRegisterReceiver.getIntExtra("scale", -1));
                    if (intExtra2 == 2 || intExtra2 == 5) {
                        z = true;
                    }
                } else {
                    intExtra = -1.0d;
                }
                return new zzeqr(intExtra, z);
            }
        });
    }
}
