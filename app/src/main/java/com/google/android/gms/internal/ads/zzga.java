package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public class zzga {
    public int a;

    public final boolean a(int i) {
        return (this.a & i) == i;
    }

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
        return a(268435456);
    }

    public final boolean zzf() {
        return a(Integer.MIN_VALUE);
    }

    public final boolean zzg() {
        return a(4);
    }

    public final boolean zzh() {
        return a(1);
    }
}
