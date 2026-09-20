package com.google.android.gms.internal.ads;

import android.app.Application;
import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfjx {
    public static final zzfjy a = new zzfjy();

    public static void zza(Context context) {
        Context applicationContext = context.getApplicationContext();
        zzfjy zzfjyVar = a;
        zzfjyVar.getClass();
        zzflg.zzb(applicationContext, "Application Context cannot be null");
        if (zzfjyVar.a) {
            return;
        }
        zzfjyVar.a = true;
        zzfku.zzb().zzc(applicationContext);
        zzfkp zzfkpVarZza = zzfkp.zza();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(zzfkpVarZza);
        }
        zzfle.zzg(applicationContext);
        zzfkr.zzb().zzc(applicationContext);
    }

    public static boolean zzb() {
        return a.a;
    }
}
