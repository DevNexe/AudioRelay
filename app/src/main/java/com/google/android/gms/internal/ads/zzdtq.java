package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdtq {
    public final zzdcw a;
    public final zzdef b;
    public final zzdes c;
    public final zzdfe d;
    public final zzdhr e;
    public final zzdkj f;

    public zzdtq(zzdcw zzdcwVar, zzdef zzdefVar, zzdes zzdesVar, zzdfe zzdfeVar, zzdhr zzdhrVar, zzdkj zzdkjVar) {
        this.a = zzdcwVar;
        this.b = zzdefVar;
        this.c = zzdesVar;
        this.d = zzdfeVar;
        this.e = zzdhrVar;
        this.f = zzdkjVar;
    }

    public final void zza(zzdtr zzdtrVar) {
        zzdto zzdtoVar = zzdtrVar.a;
        zzdcw zzdcwVar = this.a;
        zzdes zzdesVar = this.c;
        zzdfe zzdfeVar = this.d;
        zzdhr zzdhrVar = this.e;
        zzdef zzdefVar = this.b;
        zzdefVar.getClass();
        zzdtp zzdtpVar = new zzdtp(zzdefVar);
        zzdkj zzdkjVar = this.f;
        synchronized (zzdtoVar) {
            zzdtoVar.w = zzdcwVar;
            zzdtoVar.x = zzdesVar;
            zzdtoVar.y = zzdfeVar;
            zzdtoVar.z = zzdhrVar;
            zzdtoVar.A = zzdtpVar;
            zzdtoVar.B = zzdkjVar;
        }
    }
}
