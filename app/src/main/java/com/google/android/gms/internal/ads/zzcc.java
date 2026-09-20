package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcc {
    public static final zzcc zza = new zzca().zze();
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzbz
    };
    public final zzaa a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzcc) {
            return this.a.equals(((zzcc) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
