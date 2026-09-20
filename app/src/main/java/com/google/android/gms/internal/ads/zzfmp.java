package com.google.android.gms.internal.ads;

import android.content.Context;
import com.facebook.ads.AdError;
import defpackage.pl6;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfmp {
    public static zzfny zza(Context context, int i, int i2, String str, String str2, String str3, zzfmf zzfmfVar) {
        zzfny zzfnyVar;
        pl6 pl6Var = new pl6(context, i2, str, str2, zzfmfVar);
        try {
            zzfnyVar = (zzfny) pl6Var.d.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            pl6Var.b(AdError.INTERSTITIAL_AD_TIMEOUT, pl6Var.g, e);
            zzfnyVar = null;
        }
        pl6Var.b(3004, pl6Var.g, null);
        if (zzfnyVar != null) {
            if (zzfnyVar.zzc == 7) {
                zzfmf.e = 3;
            } else {
                zzfmf.e = 2;
            }
        }
        return zzfnyVar == null ? new zzfny(null, 1) : zzfnyVar;
    }
}
