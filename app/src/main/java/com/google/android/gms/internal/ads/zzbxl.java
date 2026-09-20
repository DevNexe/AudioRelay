package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.mediation.VersionInfo;
import defpackage.Th;
import java.util.Arrays;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public final class zzbxl extends defpackage.com5Fixed {
    public static final Parcelable.Creator<zzbxl> CREATOR = new zzbxm();
    public final int zza;
    public final int zzb;
    public final int zzc;

    public zzbxl(int i, int i2, int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }

    public static zzbxl zza(VersionInfo versionInfo) {
        return new zzbxl(versionInfo.getMajorVersion(), versionInfo.getMinorVersion(), versionInfo.getMicroVersion());
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbxl)) {
            zzbxl zzbxlVar = (zzbxl) obj;
            if (zzbxlVar.zzc == this.zzc && zzbxlVar.zzb == this.zzb && zzbxlVar.zza == this.zza) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.zza, this.zzb, this.zzc});
    }

    public final String toString() {
        return this.zza + "." + this.zzb + "." + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.G(parcel, 1, this.zza);
        Th.G(parcel, 2, this.zzb);
        Th.G(parcel, 3, this.zzc);
        Th.X(parcel, iP);
    }
}
