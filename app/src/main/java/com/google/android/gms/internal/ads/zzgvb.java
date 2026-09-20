package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgvb {
    public final List a;
    public final List b;

    public /* synthetic */ zzgvb(int i, int i2) {
        this.a = zzguo.zzc(i);
        this.b = zzguo.zzc(i2);
    }

    public final zzgvb zza(zzgve zzgveVar) {
        this.b.add(zzgveVar);
        return this;
    }

    public final zzgvb zzb(zzgve zzgveVar) {
        this.a.add(zzgveVar);
        return this;
    }

    public final zzgvc zzc() {
        return new zzgvc(this.a, this.b);
    }
}
