package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzguq implements zzgve, zzgul {
    public static final Object c = new Object();
    public volatile zzgve a;
    public volatile Object b = c;

    public zzguq(zzgve zzgveVar) {
        this.a = zzgveVar;
    }

    public static zzgul zza(zzgve zzgveVar) {
        if (zzgveVar instanceof zzgul) {
            return (zzgul) zzgveVar;
        }
        zzgveVar.getClass();
        return new zzguq(zzgveVar);
    }

    public static zzgve zzc(zzgve zzgveVar) {
        zzgveVar.getClass();
        return zzgveVar instanceof zzguq ? zzgveVar : new zzguq(zzgveVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final Object zzb() {
        Object objZzb = this.b;
        Object obj = c;
        if (objZzb == obj) {
            synchronized (this) {
                objZzb = this.b;
                if (objZzb == obj) {
                    objZzb = this.a.zzb();
                    Object obj2 = this.b;
                    if (obj2 != obj && obj2 != objZzb) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + objZzb + ". This is likely due to a circular dependency.");
                    }
                    this.b = objZzb;
                    this.a = null;
                }
            }
        }
        return objZzb;
    }
}
