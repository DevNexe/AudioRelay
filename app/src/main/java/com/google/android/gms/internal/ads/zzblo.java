package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import defpackage.Th;

/* JADX INFO: loaded from: classes3.dex */
public final class zzblo extends defpackage.com5Fixed {
    public static final Parcelable.Creator<zzblo> CREATOR = new zzblp();
    public final int zza;
    public final boolean zzb;
    public final int zzc;
    public final boolean zzd;
    public final int zze;
    public final com.google.android.gms.ads.internal.client.zzff zzf;
    public final boolean zzg;
    public final int zzh;

    public zzblo(int i, boolean z, int i2, boolean z2, int i3, com.google.android.gms.ads.internal.client.zzff zzffVar, boolean z3, int i4) {
        this.zza = i;
        this.zzb = z;
        this.zzc = i2;
        this.zzd = z2;
        this.zze = i3;
        this.zzf = zzffVar;
        this.zzg = z3;
        this.zzh = i4;
    }

    public static NativeAdOptions zza(zzblo zzbloVar) {
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        if (zzbloVar == null) {
            return builder.build();
        }
        int i = zzbloVar.zza;
        if (i == 2) {
            builder.setAdChoicesPlacement(zzbloVar.zze);
        } else {
            if (i != 3) {
                if (i == 4) {
                    builder.setRequestCustomMuteThisAd(zzbloVar.zzg);
                    builder.setMediaAspectRatio(zzbloVar.zzh);
                }
            }
            com.google.android.gms.ads.internal.client.zzff zzffVar = zzbloVar.zzf;
            if (zzffVar != null) {
                builder.setVideoOptions(new VideoOptions(zzffVar));
            }
            builder.setAdChoicesPlacement(zzbloVar.zze);
        }
        builder.setReturnUrlsForImageAssets(zzbloVar.zzb);
        builder.setRequestMultipleImages(zzbloVar.zzd);
        return builder.build();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.G(parcel, 1, this.zza);
        Th.z(parcel, 2, this.zzb);
        Th.G(parcel, 3, this.zzc);
        Th.z(parcel, 4, this.zzd);
        Th.G(parcel, 5, this.zze);
        Th.I(parcel, 6, this.zzf, i);
        Th.z(parcel, 7, this.zzg);
        Th.G(parcel, 8, this.zzh);
        Th.X(parcel, iP);
    }

    public zzblo(com.google.android.gms.ads.formats.NativeAdOptions nativeAdOptions) {
        this(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), nativeAdOptions.getImageOrientation(), nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new com.google.android.gms.ads.internal.client.zzff(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zza(), nativeAdOptions.getMediaAspectRatio());
    }
}
