package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdms implements zzdcy, zzdjv {
    public String A;
    public final zzbev B;
    public final zzcea w;
    public final Context x;
    public final zzces y;
    public final View z;

    public zzdms(zzcea zzceaVar, Context context, zzces zzcesVar, View view, zzbev zzbevVar) {
        this.w = zzceaVar;
        this.x = context;
        this.y = zzcesVar;
        this.z = view;
        this.B = zzbevVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdcy
    public final void zzbv() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjv
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjv
    public final void zzg() {
        zzbev zzbevVar = zzbev.APP_OPEN;
        zzbev zzbevVar2 = this.B;
        if (zzbevVar2 == zzbevVar) {
            return;
        }
        String strZzd = this.y.zzd(this.x);
        this.A = strZzd;
        this.A = String.valueOf(strZzd).concat(zzbevVar2 == zzbev.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
    }

    @Override // com.google.android.gms.internal.ads.zzdcy
    public final void zzj() {
        this.w.zzb(false);
    }

    @Override // com.google.android.gms.internal.ads.zzdcy
    public final void zzm() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcy
    public final void zzo() {
        View view = this.z;
        if (view != null && this.A != null) {
            this.y.zzs(view.getContext(), this.A);
        }
        this.w.zzb(true);
    }

    @Override // com.google.android.gms.internal.ads.zzdcy
    @ParametersAreNonnullByDefault
    public final void zzp(zzcbq zzcbqVar, String str, String str2) {
        Context context = this.x;
        zzces zzcesVar = this.y;
        if (zzcesVar.zzu(context)) {
            try {
                Context context2 = this.x;
                zzcesVar.zzo(context2, zzcesVar.zza(context2), this.w.zza(), zzcbqVar.zzc(), zzcbqVar.zzb());
            } catch (RemoteException e) {
                zzcgn.zzk("Remote Exception to get reward item.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcy
    public final void zzr() {
    }
}
