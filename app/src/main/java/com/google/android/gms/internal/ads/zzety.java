package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzety implements zzeun {
    public final zzces a;
    public final zzfyy b;
    public final Context c;

    public zzety(zzces zzcesVar, zzfyy zzfyyVar, Context context) {
        this.a = zzcesVar;
        this.b = zzfyyVar;
        this.c = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final int zza() {
        return 34;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final zzfyx zzb() {
        return this.b.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzetx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Long l;
                zzety zzetyVar = this.zza;
                zzces zzcesVar = zzetyVar.a;
                Context context = zzetyVar.c;
                if (!zzcesVar.zzu(context)) {
                    return new zzetz(null, null, null, null, null);
                }
                String strZze = zzcesVar.zze(context);
                String str = strZze == null ? "" : strZze;
                String strZzc = zzcesVar.zzc(context);
                String str2 = strZzc == null ? "" : strZzc;
                String strZza = zzcesVar.zza(context);
                String str3 = strZza == null ? "" : strZza;
                String strZzb = zzcesVar.zzb(context);
                String str4 = strZzb == null ? "" : strZzb;
                if ("TIME_OUT".equals(str2)) {
                    l = (Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzad);
                } else {
                    l = null;
                }
                return new zzetz(str, str2, str3, str4, l);
            }
        });
    }
}
