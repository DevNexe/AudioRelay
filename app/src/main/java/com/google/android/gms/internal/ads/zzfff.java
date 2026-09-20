package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.Th;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public final class zzfff extends defpackage.com5Fixed {
    public static final Parcelable.Creator<zzfff> CREATOR = new zzffg();
    public final int w;
    public final int x;
    public final int y;

    @Nullable
    public final Context zza;
    public final zzffc zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final String zzf;
    public final int zzg;

    public zzfff(int i, int i2, int i3, int i4, String str, int i5, int i6) {
        zzffc[] zzffcVarArrValues = zzffc.values();
        int[] iArrZza = zzffd.zza();
        int[] iArrZza2 = zzffe.zza();
        this.zza = null;
        this.w = i;
        this.zzb = zzffcVarArrValues[i];
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = str;
        this.x = i5;
        this.zzg = iArrZza[i5];
        this.y = i6;
        int i7 = iArrZza2[i6];
    }

    @Nullable
    public static zzfff zza(zzffc zzffcVar, Context context) {
        if (zzffcVar == zzffc.Rewarded) {
            return new zzfff(context, zzffcVar, ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzft)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfz)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfB)).intValue(), (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfD), (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfv), (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfx));
        }
        if (zzffcVar == zzffc.Interstitial) {
            return new zzfff(context, zzffcVar, ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfu)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfA)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfC)).intValue(), (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfE), (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfw), (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfy));
        }
        if (zzffcVar != zzffc.AppOpen) {
            return null;
        }
        return new zzfff(context, zzffcVar, ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfH)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfJ)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfK)).intValue(), (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfF), (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfG), (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfI));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.G(parcel, 1, this.w);
        Th.G(parcel, 2, this.zzc);
        Th.G(parcel, 3, this.zzd);
        Th.G(parcel, 4, this.zze);
        Th.J(parcel, 5, this.zzf);
        Th.G(parcel, 6, this.x);
        Th.G(parcel, 7, this.y);
        Th.X(parcel, iP);
    }

    public zzfff(@Nullable Context context, zzffc zzffcVar, int i, int i2, int i3, String str, String str2, String str3) {
        int i4;
        zzffc.values();
        zzffd.zza();
        zzffe.zza();
        this.zza = context;
        this.w = zzffcVar.ordinal();
        this.zzb = zzffcVar;
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = str;
        if ("oldest".equals(str2)) {
            i4 = 1;
        } else {
            i4 = (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        }
        this.zzg = i4;
        this.x = i4 - 1;
        "onAdClosed".equals(str3);
        this.y = 0;
    }
}
