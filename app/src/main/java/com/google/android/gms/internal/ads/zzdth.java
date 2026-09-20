package com.google.android.gms.internal.ads;

import defpackage.cf6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdth {
    public final zzdcw a;
    public final zzdef b;
    public final zzdes c;
    public final zzdfe d;
    public final zzdhr e;
    public final zzfcs f;
    public final zzfcv g;

    public zzdth(zzdcw zzdcwVar, zzdef zzdefVar, zzdes zzdesVar, zzdfe zzdfeVar, zzdhr zzdhrVar, zzfcs zzfcsVar, zzfcv zzfcvVar) {
        this.a = zzdcwVar;
        this.b = zzdefVar;
        this.c = zzdesVar;
        this.d = zzdfeVar;
        this.e = zzdhrVar;
        this.f = zzfcsVar;
        this.g = zzfcvVar;
    }

    public final void zza(zzdtl zzdtlVar) {
        cf6 cf6Var = zzdtlVar.a;
        zzdcw zzdcwVar = this.a;
        zzdes zzdesVar = this.c;
        zzdfe zzdfeVar = this.d;
        zzdhr zzdhrVar = this.e;
        zzdef zzdefVar = this.b;
        zzdefVar.getClass();
        zzdtg zzdtgVar = new zzdtg(zzdefVar);
        synchronized (cf6Var) {
            cf6Var.w = zzdcwVar;
            cf6Var.x = zzdesVar;
            cf6Var.y = zzdfeVar;
            cf6Var.z = zzdhrVar;
            cf6Var.A = zzdtgVar;
        }
        zzdtlVar.zze(this.f, this.g);
    }
}
