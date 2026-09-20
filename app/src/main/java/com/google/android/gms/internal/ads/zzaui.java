package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public class zzaui {
    public int a;

    public final void zza(int i) {
        this.a |= Integer.MIN_VALUE;
    }

    public void zzb() {
        this.a = 0;
    }

    public final void zzc(int i) {
        this.a = i;
    }

    public final boolean zze() {
        return (this.a & Integer.MIN_VALUE) == Integer.MIN_VALUE;
    }

    public final boolean zzf() {
        return (this.a & 4) == 4;
    }

    public final boolean zzg() {
        return (this.a & 1) == 1;
    }
}
