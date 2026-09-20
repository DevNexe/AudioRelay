package com.google.android.gms.internal.ads;

import defpackage.pz5;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzckr extends com.google.android.gms.ads.internal.util.zzb {
    public final zzciw b;
    public final zzckz c;
    public final String d;
    public final String[] e;

    public zzckr(zzciw zzciwVar, zzckz zzckzVar, String str, String[] strArr) {
        this.b = zzciwVar;
        this.c = zzckzVar;
        this.d = str;
        this.e = strArr;
        com.google.android.gms.ads.internal.zzt.zzz().zzb(this);
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        int i = 5;
        try {
            this.c.zzr(this.d, this.e);
        } finally {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new pz5(this, i));
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final zzfyx zzb() {
        return (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbI)).booleanValue() && (this.c instanceof zzcli)) ? zzcha.zze.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzckp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzckr zzckrVar = this.zza;
                return Boolean.valueOf(zzckrVar.c.zzs(zzckrVar.d, zzckrVar.e, zzckrVar));
            }
        }) : super.zzb();
    }

    public final String zze() {
        return this.d;
    }
}
