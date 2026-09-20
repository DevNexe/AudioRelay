package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgus implements zzgur, zzgul {
    public static final zzgus b = new zzgus(null);
    public final Object a;

    public zzgus(Object obj) {
        this.a = obj;
    }

    public static zzgur zza(Object obj) {
        zzguz.zza(obj, "instance cannot be null");
        return new zzgus(obj);
    }

    public static zzgur zzc(Object obj) {
        return obj == null ? b : new zzgus(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final Object zzb() {
        return this.a;
    }
}
