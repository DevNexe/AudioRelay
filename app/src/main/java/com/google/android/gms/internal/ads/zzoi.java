package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzoi {
    public final zzne[] a;
    public final zzpa b;
    public final zzpc c;

    public zzoi(zzne... zzneVarArr) {
        zzpa zzpaVar = new zzpa();
        zzpc zzpcVar = new zzpc();
        zzne[] zzneVarArr2 = {zzpaVar, zzpcVar};
        this.a = zzneVarArr2;
        System.arraycopy(zzneVarArr, 0, zzneVarArr2, 0, 0);
        this.b = zzpaVar;
        this.c = zzpcVar;
    }

    public final long zza(long j) {
        return this.c.zzi(j);
    }

    public final long zzb() {
        return this.b.zzo();
    }

    public final zzby zzc(zzby zzbyVar) {
        float f = zzbyVar.zzc;
        zzpc zzpcVar = this.c;
        zzpcVar.zzk(f);
        zzpcVar.zzj(zzbyVar.zzd);
        return zzbyVar;
    }

    public final boolean zzd(boolean z) {
        this.b.zzp(z);
        return z;
    }

    public final zzne[] zze() {
        return this.a;
    }
}
