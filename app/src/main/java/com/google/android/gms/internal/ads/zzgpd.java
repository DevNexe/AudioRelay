package com.google.android.gms.internal.ads;

import defpackage.ht6;

/* JADX INFO: loaded from: classes3.dex */
public class zzgpd {
    public volatile zzgpx a;
    public volatile zzgnf b;

    static {
        zzgnz.zza();
    }

    public final void a(zzgpx zzgpxVar) {
        if (this.a != null) {
            return;
        }
        synchronized (this) {
            if (this.a == null) {
                try {
                    this.a = zzgpxVar;
                    this.b = zzgnf.zzb;
                } catch (zzgoz unused) {
                    this.a = zzgpxVar;
                    this.b = zzgnf.zzb;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgpd)) {
            return false;
        }
        zzgpd zzgpdVar = (zzgpd) obj;
        zzgpx zzgpxVar = this.a;
        zzgpx zzgpxVar2 = zzgpdVar.a;
        if (zzgpxVar == null && zzgpxVar2 == null) {
            return zzb().equals(zzgpdVar.zzb());
        }
        if (zzgpxVar != null && zzgpxVar2 != null) {
            return zzgpxVar.equals(zzgpxVar2);
        }
        if (zzgpxVar != null) {
            zzgpdVar.a(zzgpxVar.zzbh());
            return zzgpxVar.equals(zzgpdVar.a);
        }
        a(zzgpxVar2.zzbh());
        return this.a.equals(zzgpxVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.b != null) {
            return ((ht6) this.b).x.length;
        }
        if (this.a != null) {
            return this.a.zzax();
        }
        return 0;
    }

    public final zzgnf zzb() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                return this.b;
            }
            if (this.a == null) {
                this.b = zzgnf.zzb;
            } else {
                this.b = this.a.zzas();
            }
            return this.b;
        }
    }
}
