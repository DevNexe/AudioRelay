package com.google.android.gms.internal.ads;

import defpackage.hc2;
import defpackage.qc0;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaaj {
    public static final zzaaj zza = new zzaaj(0, 0);
    public final long zzb;
    public final long zzc;

    public zzaaj(long j, long j2) {
        this.zzb = j;
        this.zzc = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaaj.class == obj.getClass()) {
            zzaaj zzaajVar = (zzaaj) obj;
            if (this.zzb == zzaajVar.zzb && this.zzc == zzaajVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzb) * 31) + ((int) this.zzc);
    }

    public final String toString() {
        long j = this.zzb;
        return hc2.a(qc0.b("[timeUs=", j, ", position="), this.zzc, "]");
    }
}
