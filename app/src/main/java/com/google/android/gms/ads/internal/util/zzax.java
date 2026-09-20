package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzajw;
import com.google.android.gms.internal.ads.zzaka;
import com.google.android.gms.internal.ads.zzakd;
import com.google.android.gms.internal.ads.zzakp;
import com.google.android.gms.internal.ads.zzakw;
import com.google.android.gms.internal.ads.zzalb;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzbrk;
import com.google.android.gms.internal.ads.zzcgg;
import java.io.File;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class zzax extends zzakp {
    public final Context b;

    public zzax(Context context, zzalb zzalbVar) {
        super(zzalbVar);
        this.b = context;
    }

    public static zzakd zzb(Context context) {
        zzakd zzakdVar = new zzakd(new zzakw(new File(context.getCacheDir(), "admob_volley"), 20971520), new zzax(context, new zzalb(null, null)), 4);
        zzakdVar.zzd();
        return zzakdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzakp, com.google.android.gms.internal.ads.zzajt
    public final zzajw zza(zzaka zzakaVar) {
        if (zzakaVar.zza() == 0) {
            if (Pattern.matches((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzdA), zzakaVar.zzk())) {
                com.google.android.gms.ads.internal.client.zzaw.zzb();
                Context context = this.b;
                if (zzcgg.zzr(context, 13400000)) {
                    zzajw zzajwVarZza = new zzbrk(context).zza(zzakaVar);
                    if (zzajwVarZza != null) {
                        zze.zza("Got gmscore asset response: ".concat(String.valueOf(zzakaVar.zzk())));
                        return zzajwVarZza;
                    }
                    zze.zza("Failed to get gmscore asset response: ".concat(String.valueOf(zzakaVar.zzk())));
                }
            }
        }
        return super.zza(zzakaVar);
    }
}
