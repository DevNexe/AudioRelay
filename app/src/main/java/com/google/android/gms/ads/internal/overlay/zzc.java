package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.Th;
import defpackage.com5Fixed;

/* JADX INFO: loaded from: classes.dex */
public final class zzc extends com5Fixed {
    public static final Parcelable.Creator<zzc> CREATOR = new zzb();
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final String zze;
    public final String zzf;
    public final String zzg;
    public final Intent zzh;
    public final zzx zzi;
    public final boolean zzj;

    public zzc(Intent intent, zzx zzxVar) {
        this(null, null, null, null, null, null, null, intent, new ObjectWrapper(zzxVar), false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.J(parcel, 2, this.zza);
        Th.J(parcel, 3, this.zzb);
        Th.J(parcel, 4, this.zzc);
        Th.J(parcel, 5, this.zzd);
        Th.J(parcel, 6, this.zze);
        Th.J(parcel, 7, this.zzf);
        Th.J(parcel, 8, this.zzg);
        Th.I(parcel, 9, this.zzh, i);
        Th.F(parcel, 10, new ObjectWrapper(this.zzi));
        Th.z(parcel, 11, this.zzj);
        Th.X(parcel, iP);
    }

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7, zzx zzxVar) {
        this(str, str2, str3, str4, str5, str6, str7, null, new ObjectWrapper(zzxVar), false);
    }

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, IBinder iBinder, boolean z) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = intent;
        this.zzi = (zzx) ObjectWrapper.M0(IObjectWrapper.Stub.L0(iBinder));
        this.zzj = z;
    }
}
