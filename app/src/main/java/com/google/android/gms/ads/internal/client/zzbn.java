package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzarw;
import com.google.android.gms.internal.ads.zzarx;
import com.google.android.gms.internal.ads.zzblo;
import com.google.android.gms.internal.ads.zzbmx;
import com.google.android.gms.internal.ads.zzbmy;
import com.google.android.gms.internal.ads.zzbna;
import com.google.android.gms.internal.ads.zzbnb;
import com.google.android.gms.internal.ads.zzbnd;
import com.google.android.gms.internal.ads.zzbne;
import com.google.android.gms.internal.ads.zzbng;
import com.google.android.gms.internal.ads.zzbnh;
import com.google.android.gms.internal.ads.zzbnk;
import com.google.android.gms.internal.ads.zzbnl;
import com.google.android.gms.internal.ads.zzbnn;
import com.google.android.gms.internal.ads.zzbno;
import com.google.android.gms.internal.ads.zzbrx;
import com.google.android.gms.internal.ads.zzbsf;
import com.google.android.gms.internal.ads.zzbsg;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbn extends zzarw implements zzbo {
    public zzbn() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final boolean K0(int i, Parcel parcel, Parcel parcel2) {
        zzbf zzbdVar = null;
        zzcd zzcdVar = null;
        switch (i) {
            case 1:
                zzbl zzblVarZze = zze();
                parcel2.writeNoException();
                zzarx.zzg(parcel2, zzblVarZze);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbdVar = iInterfaceQueryLocalInterface instanceof zzbf ? (zzbf) iInterfaceQueryLocalInterface : new zzbd(strongBinder);
                }
                zzarx.zzc(parcel);
                zzl(zzbdVar);
                parcel2.writeNoException();
                return true;
            case 3:
                zzbmy zzbmyVarZzb = zzbmx.zzb(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                zzf(zzbmyVarZzb);
                parcel2.writeNoException();
                return true;
            case 4:
                zzbnb zzbnbVarZzb = zzbna.zzb(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                zzg(zzbnbVarZzb);
                parcel2.writeNoException();
                return true;
            case 5:
                String string = parcel.readString();
                zzbnh zzbnhVarZzb = zzbng.zzb(parcel.readStrongBinder());
                zzbne zzbneVarZzb = zzbnd.zzb(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                zzh(string, zzbnhVarZzb, zzbneVarZzb);
                parcel2.writeNoException();
                return true;
            case 6:
                zzblo zzbloVar = (zzblo) zzarx.zza(parcel, zzblo.CREATOR);
                zzarx.zzc(parcel);
                zzo(zzbloVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcdVar = iInterfaceQueryLocalInterface2 instanceof zzcd ? (zzcd) iInterfaceQueryLocalInterface2 : new zzcd(strongBinder2);
                }
                zzarx.zzc(parcel);
                zzq(zzcdVar);
                parcel2.writeNoException();
                return true;
            case 8:
                zzbnl zzbnlVarZzb = zzbnk.zzb(parcel.readStrongBinder());
                zzq zzqVar = (zzq) zzarx.zza(parcel, zzq.CREATOR);
                zzarx.zzc(parcel);
                zzj(zzbnlVarZzb, zzqVar);
                parcel2.writeNoException();
                return true;
            case 9:
                PublisherAdViewOptions publisherAdViewOptions = (PublisherAdViewOptions) zzarx.zza(parcel, PublisherAdViewOptions.CREATOR);
                zzarx.zzc(parcel);
                zzp(publisherAdViewOptions);
                parcel2.writeNoException();
                return true;
            case 10:
                zzbno zzbnoVarZzb = zzbnn.zzb(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                zzk(zzbnoVarZzb);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                zzbrx zzbrxVar = (zzbrx) zzarx.zza(parcel, zzbrx.CREATOR);
                zzarx.zzc(parcel);
                zzn(zzbrxVar);
                parcel2.writeNoException();
                return true;
            case 14:
                zzbsg zzbsgVarZzb = zzbsf.zzb(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                zzi(zzbsgVarZzb);
                parcel2.writeNoException();
                return true;
            case 15:
                AdManagerAdViewOptions adManagerAdViewOptions = (AdManagerAdViewOptions) zzarx.zza(parcel, AdManagerAdViewOptions.CREATOR);
                zzarx.zzc(parcel);
                zzm(adManagerAdViewOptions);
                parcel2.writeNoException();
                return true;
        }
    }
}
