package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbdd extends zzarv implements zzbdf {
    public zzbdd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    public final zzbs zze() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    public final com.google.android.gms.ads.internal.client.zzdh zzf() {
        Parcel parcelL0 = L0(K0(), 5);
        com.google.android.gms.ads.internal.client.zzdh zzdhVarZzb = com.google.android.gms.ads.internal.client.zzdg.zzb(parcelL0.readStrongBinder());
        parcelL0.recycle();
        return zzdhVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    public final void zzg(boolean z) {
        Parcel parcelK0 = K0();
        zzarx.zzd(parcelK0, z);
        M0(parcelK0, 6);
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    public final void zzh(com.google.android.gms.ads.internal.client.zzde zzdeVar) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, zzdeVar);
        M0(parcelK0, 7);
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    public final void zzi(IObjectWrapper iObjectWrapper, zzbdm zzbdmVar) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        zzarx.zzg(parcelK0, zzbdmVar);
        M0(parcelK0, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    public final void zzj(zzbdj zzbdjVar) {
        throw null;
    }
}
