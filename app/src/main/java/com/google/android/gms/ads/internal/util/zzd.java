package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcgm;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzfyx;
import defpackage.k76;

/* JADX INFO: loaded from: classes.dex */
public final class zzd {
    public static void zza(Context context) {
        if (zzcgm.zzk(context) && !zzcgm.zzm()) {
            zzfyx zzfyxVarZzb = new k76(context).zzb();
            zzcgn.zzi("Updating ad debug logging enablement.");
            zzchd.zza(zzfyxVarZzb, "AdDebugLogUpdater.updateEnablement");
        }
    }
}
