package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzarv;
import com.google.android.gms.internal.ads.zzarx;
import com.google.android.gms.internal.ads.zzblo;
import com.google.android.gms.internal.ads.zzbmy;
import com.google.android.gms.internal.ads.zzbnb;
import com.google.android.gms.internal.ads.zzbne;
import com.google.android.gms.internal.ads.zzbnh;
import com.google.android.gms.internal.ads.zzbnl;
import com.google.android.gms.internal.ads.zzbno;
import com.google.android.gms.internal.ads.zzbrx;
import com.google.android.gms.internal.ads.zzbsg;

/* JADX INFO: loaded from: classes.dex */
public final class zzbm extends zzarv implements zzbo {
    public zzbm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final zzbl zze() {
        zzbl zzbjVar;
        Parcel parcelL0 = L0(K0(), 1);
        IBinder strongBinder = parcelL0.readStrongBinder();
        if (strongBinder == null) {
            zzbjVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            zzbjVar = iInterfaceQueryLocalInterface instanceof zzbl ? (zzbl) iInterfaceQueryLocalInterface : new zzbj(strongBinder);
        }
        parcelL0.recycle();
        return zzbjVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzf(zzbmy zzbmyVar) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzg(zzbnb zzbnbVar) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzh(String str, zzbnh zzbnhVar, zzbne zzbneVar) {
        Parcel parcelK0 = K0();
        parcelK0.writeString(str);
        zzarx.zzg(parcelK0, zzbnhVar);
        zzarx.zzg(parcelK0, zzbneVar);
        M0(parcelK0, 5);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzi(zzbsg zzbsgVar) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzj(zzbnl zzbnlVar, zzq zzqVar) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, zzbnlVar);
        zzarx.zze(parcelK0, zzqVar);
        M0(parcelK0, 8);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzk(zzbno zzbnoVar) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, zzbnoVar);
        M0(parcelK0, 10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzl(zzbf zzbfVar) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, zzbfVar);
        M0(parcelK0, 2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) {
        Parcel parcelK0 = K0();
        zzarx.zze(parcelK0, adManagerAdViewOptions);
        M0(parcelK0, 15);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzn(zzbrx zzbrxVar) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzo(zzblo zzbloVar) {
        Parcel parcelK0 = K0();
        zzarx.zze(parcelK0, zzbloVar);
        M0(parcelK0, 6);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzq(zzcd zzcdVar) {
        throw null;
    }
}
