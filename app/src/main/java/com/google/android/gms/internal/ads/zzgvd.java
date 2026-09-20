package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgvd implements zzgve {
    public static final Object c = new Object();
    public volatile zzgve a;
    public volatile Object b = c;

    public zzgvd(zzgve zzgveVar) {
        this.a = zzgveVar;
    }

    public static zzgve zza(zzgve zzgveVar) {
        if ((zzgveVar instanceof zzgvd) || (zzgveVar instanceof zzguq)) {
            return zzgveVar;
        }
        zzgveVar.getClass();
        return new zzgvd(zzgveVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final Object zzb() {
        Object obj = this.b;
        if (obj != c) {
            return obj;
        }
        zzgve zzgveVar = this.a;
        if (zzgveVar == null) {
            return this.b;
        }
        Object objZzb = zzgveVar.zzb();
        this.b = objZzb;
        this.a = null;
        return objZzb;
    }
}
