package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcuo implements zzddt {
    public final zzfei w;

    public zzcuo(zzfei zzfeiVar) {
        this.w = zzfeiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void zzbq(Context context) {
        try {
            this.w.zzg();
        } catch (zzfds e) {
            zzcgn.zzk("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void zzbs(Context context) {
        try {
            this.w.zzs();
        } catch (zzfds e) {
            zzcgn.zzk("Cannot invoke onPause for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void zzbt(Context context) {
        zzfei zzfeiVar = this.w;
        try {
            zzfeiVar.zzt();
            if (context != null) {
                zzfeiVar.zzr(context);
            }
        } catch (zzfds e) {
            zzcgn.zzk("Cannot invoke onResume for the mediation adapter.", e);
        }
    }
}
