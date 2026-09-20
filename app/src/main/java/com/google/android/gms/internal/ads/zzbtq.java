package com.google.android.gms.internal.ads;

import defpackage.a66;
import defpackage.b66;
import defpackage.oa3;
import defpackage.sd6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbtq extends zzchm {
    public final com.google.android.gms.ads.internal.util.zzbb d;
    public final Object c = new Object();
    public boolean e = false;
    public int f = 0;

    public zzbtq(com.google.android.gms.ads.internal.util.zzbb zzbbVar) {
        this.d = zzbbVar;
    }

    public final void a() {
        synchronized (this.c) {
            oa3.k(this.f >= 0);
            if (this.e && this.f == 0) {
                com.google.android.gms.ads.internal.util.zze.zza("No reference is left (including root). Cleaning up engine.");
                zzi(new b66(), new zzchi());
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("There are still references to the engine. Not destroying.");
            }
        }
    }

    public final void b() {
        synchronized (this.c) {
            oa3.k(this.f > 0);
            com.google.android.gms.ads.internal.util.zze.zza("Releasing 1 reference for JS Engine");
            this.f--;
            a();
        }
    }

    public final zzbtl zza() {
        zzbtl zzbtlVar = new zzbtl(this);
        synchronized (this.c) {
            zzi(new sd6(5, zzbtlVar), new a66(zzbtlVar, 0));
            oa3.k(this.f >= 0);
            this.f++;
        }
        return zzbtlVar;
    }

    public final void zzb() {
        synchronized (this.c) {
            oa3.k(this.f >= 0);
            com.google.android.gms.ads.internal.util.zze.zza("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.e = true;
            a();
        }
    }
}
