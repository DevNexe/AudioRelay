package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzasw {
    public static final zzasw zza = new zzasw(1.0f, 1.0f);
    public final int a;
    public final float zzb;
    public final float zzc = 1.0f;

    public zzasw(float f, float f2) {
        this.zzb = f;
        this.a = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzasw.class == obj.getClass() && this.zzb == ((zzasw) obj).zzb;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(1.0f) + ((Float.floatToRawIntBits(this.zzb) + 527) * 31);
    }

    public final long zza(long j) {
        return j * ((long) this.a);
    }
}
