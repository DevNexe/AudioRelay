package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzui {
    public final long zza;
    public final long zzb;

    public zzui(long j, long j2) {
        this.zza = j;
        this.zzb = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzui)) {
            return false;
        }
        zzui zzuiVar = (zzui) obj;
        return this.zza == zzuiVar.zza && this.zzb == zzuiVar.zzb;
    }

    public final int hashCode() {
        return (((int) this.zza) * 31) + ((int) this.zzb);
    }
}
