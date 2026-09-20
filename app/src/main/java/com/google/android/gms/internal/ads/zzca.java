package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzca {
    public final zzy a = new zzy();

    public final zzca zza(int i) {
        this.a.zza(i);
        return this;
    }

    public final zzca zzb(zzcc zzccVar) {
        zzaa zzaaVar = zzccVar.a;
        for (int i = 0; i < zzaaVar.zzb(); i++) {
            this.a.zza(zzaaVar.zza(i));
        }
        return this;
    }

    public final zzca zzc(int... iArr) {
        for (int i = 0; i < 21; i++) {
            this.a.zza(iArr[i]);
        }
        return this;
    }

    public final zzca zzd(int i, boolean z) {
        if (z) {
            this.a.zza(i);
        }
        return this;
    }

    public final zzcc zze() {
        return new zzcc(this.a.zzb());
    }
}
