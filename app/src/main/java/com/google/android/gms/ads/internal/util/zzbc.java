package com.google.android.gms.ads.internal.util;

import com.unity3d.ads.metadata.MediationMetaData;
import defpackage.tq2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzbc {
    public final String zza;
    public final double zzb;
    public final double zzc;
    public final double zzd;
    public final int zze;

    public zzbc(String str, double d, double d2, double d3, int i) {
        this.zza = str;
        this.zzc = d;
        this.zzb = d2;
        this.zzd = d3;
        this.zze = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbc)) {
            return false;
        }
        zzbc zzbcVar = (zzbc) obj;
        return tq2.a(this.zza, zzbcVar.zza) && this.zzb == zzbcVar.zzb && this.zzc == zzbcVar.zzc && this.zze == zzbcVar.zze && Double.compare(this.zzd, zzbcVar.zzd) == 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, Double.valueOf(this.zzb), Double.valueOf(this.zzc), Double.valueOf(this.zzd), Integer.valueOf(this.zze)});
    }

    public final String toString() {
        tq2.QnHx qnHx = new tq2.QnHx(this);
        qnHx.a(this.zza, MediationMetaData.KEY_NAME);
        qnHx.a(Double.valueOf(this.zzc), "minBound");
        qnHx.a(Double.valueOf(this.zzb), "maxBound");
        qnHx.a(Double.valueOf(this.zzd), "percent");
        qnHx.a(Integer.valueOf(this.zze), "count");
        return qnHx.toString();
    }
}
