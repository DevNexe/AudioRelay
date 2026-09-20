package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcch extends zzarv implements zzccj {
    public zzcch(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final Bundle zzb() {
        Parcel parcelL0 = L0(K0(), 9);
        Bundle bundle = (Bundle) zzarx.zza(parcelL0, Bundle.CREATOR);
        parcelL0.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final com.google.android.gms.ads.internal.client.zzdh zzc() {
        Parcel parcelL0 = L0(K0(), 12);
        com.google.android.gms.ads.internal.client.zzdh zzdhVarZzb = com.google.android.gms.ads.internal.client.zzdg.zzb(parcelL0.readStrongBinder());
        parcelL0.recycle();
        return zzdhVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final zzccg zzd() {
        zzccg zzcceVar;
        Parcel parcelL0 = L0(K0(), 11);
        IBinder strongBinder = parcelL0.readStrongBinder();
        if (strongBinder == null) {
            zzcceVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            zzcceVar = iInterfaceQueryLocalInterface instanceof zzccg ? (zzccg) iInterfaceQueryLocalInterface : new zzcce(strongBinder);
        }
        parcelL0.recycle();
        return zzcceVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final String zze() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzf(com.google.android.gms.ads.internal.client.zzl zzlVar, zzccq zzccqVar) {
        Parcel parcelK0 = K0();
        zzarx.zze(parcelK0, zzlVar);
        zzarx.zzg(parcelK0, zzccqVar);
        M0(parcelK0, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzg(com.google.android.gms.ads.internal.client.zzl zzlVar, zzccq zzccqVar) {
        Parcel parcelK0 = K0();
        zzarx.zze(parcelK0, zzlVar);
        zzarx.zzg(parcelK0, zzccqVar);
        M0(parcelK0, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzh(boolean z) {
        Parcel parcelK0 = K0();
        zzarx.zzd(parcelK0, z);
        M0(parcelK0, 15);
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzi(com.google.android.gms.ads.internal.client.zzdb zzdbVar) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, zzdbVar);
        M0(parcelK0, 8);
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzj(com.google.android.gms.ads.internal.client.zzde zzdeVar) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, zzdeVar);
        M0(parcelK0, 13);
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzk(zzccm zzccmVar) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, zzccmVar);
        M0(parcelK0, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzl(zzccx zzccxVar) {
        Parcel parcelK0 = K0();
        zzarx.zze(parcelK0, zzccxVar);
        M0(parcelK0, 7);
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzm(IObjectWrapper iObjectWrapper) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        M0(parcelK0, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzn(IObjectWrapper iObjectWrapper, boolean z) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final boolean zzo() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzp(zzccr zzccrVar) {
        throw null;
    }
}
