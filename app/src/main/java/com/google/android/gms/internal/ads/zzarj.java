package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class zzarj extends zzarm {
    public final View D;

    public zzarj(zzaqb zzaqbVar, String str, String str2, zzamh zzamhVar, int i, int i2, View view) {
        super(zzaqbVar, "I7Z8iinoDf65D6f8x6SJHqGD1Z2cIloE56napHJ3hKPe1zHuuQTwZLhUlKl9SuDr", "CMP58KUFBRi55MrO79QJf+iIcc+kMldspC1nSaWllCQ=", zzamhVar, i, 57);
        this.D = view;
    }

    @Override // com.google.android.gms.internal.ads.zzarm
    public final void a() {
        View view = this.D;
        if (view != null) {
            Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzcB);
            Boolean bool2 = (Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zziw);
            zzaqf zzaqfVar = new zzaqf((String) this.A.invoke(null, view, this.w.zzb().getResources().getDisplayMetrics(), bool, bool2));
            zzamv zzamvVarZza = zzamw.zza();
            zzamvVarZza.zzb(zzaqfVar.zza.longValue());
            zzamvVarZza.zzd(zzaqfVar.zzb.longValue());
            zzamvVarZza.zze(zzaqfVar.zzc.longValue());
            if (bool2.booleanValue()) {
                zzamvVarZza.zzc(zzaqfVar.zze.longValue());
            }
            if (bool.booleanValue()) {
                zzamvVarZza.zza(zzaqfVar.zzd.longValue());
            }
            this.z.zzX((zzamw) zzamvVarZza.zzal());
        }
    }
}
