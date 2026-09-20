package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzby {
    public static final zzby zza = new zzby(1.0f, 1.0f);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzbx
    };
    public final int a;
    public final float zzc;
    public final float zzd;

    public zzby(float f, float f2) {
        zzdd.zzd(f > 0.0f);
        zzdd.zzd(f2 > 0.0f);
        this.zzc = f;
        this.zzd = f2;
        this.a = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzby.class == obj.getClass()) {
            zzby zzbyVar = (zzby) obj;
            if (this.zzc == zzbyVar.zzc && this.zzd == zzbyVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.zzd) + ((Float.floatToRawIntBits(this.zzc) + 527) * 31);
    }

    public final String toString() {
        return zzel.zzI("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.zzc), Float.valueOf(this.zzd));
    }

    public final long zza(long j) {
        return j * ((long) this.a);
    }
}
