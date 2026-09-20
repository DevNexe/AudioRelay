package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzarv;
import com.google.android.gms.internal.ads.zzarx;

/* JADX INFO: loaded from: classes.dex */
public final class zzdi extends zzarv implements zzdk {
    public zzdi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final float zze() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final float zzf() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final float zzg() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final int zzh() {
        Parcel parcelL0 = L0(K0(), 5);
        int i = parcelL0.readInt();
        parcelL0.recycle();
        return i;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final zzdn zzi() {
        zzdn zzdlVar;
        Parcel parcelL0 = L0(K0(), 11);
        IBinder strongBinder = parcelL0.readStrongBinder();
        if (strongBinder == null) {
            zzdlVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            zzdlVar = iInterfaceQueryLocalInterface instanceof zzdn ? (zzdn) iInterfaceQueryLocalInterface : new zzdl(strongBinder);
        }
        parcelL0.recycle();
        return zzdlVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzj(boolean z) {
        Parcel parcelK0 = K0();
        zzarx.zzd(parcelK0, z);
        M0(parcelK0, 3);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzk() {
        M0(K0(), 2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzl() {
        M0(K0(), 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzm(zzdn zzdnVar) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, zzdnVar);
        M0(parcelK0, 8);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzn() {
        M0(K0(), 13);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final boolean zzo() {
        Parcel parcelL0 = L0(K0(), 12);
        boolean zZzh = zzarx.zzh(parcelL0);
        parcelL0.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final boolean zzp() {
        Parcel parcelL0 = L0(K0(), 10);
        boolean zZzh = zzarx.zzh(parcelL0);
        parcelL0.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final boolean zzq() {
        Parcel parcelL0 = L0(K0(), 4);
        boolean zZzh = zzarx.zzh(parcelL0);
        parcelL0.recycle();
        return zZzh;
    }
}
