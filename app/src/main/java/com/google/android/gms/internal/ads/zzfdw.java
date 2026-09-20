package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfdw {
    public final zzfcs a;
    public final zzfcv b;
    public final zzefz c;
    public final zzfju d;
    public final zzfjc e;

    public zzfdw(zzefz zzefzVar, zzfju zzfjuVar, zzfcs zzfcsVar, zzfcv zzfcvVar, zzfjc zzfjcVar) {
        this.a = zzfcsVar;
        this.b = zzfcvVar;
        this.c = zzefzVar;
        this.d = zzfjuVar;
        this.e = zzfjcVar;
    }

    public final void zza(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), 2);
        }
    }

    public final void zzb(String str, int i) {
        if (!this.a.zzak) {
            this.d.zzc(str, this.e);
        } else {
            this.c.zzd(new zzegb(com.google.android.gms.ads.internal.zzt.zzB().b(), this.b.zzb, str, i));
        }
    }

    public final void zzc(List list, int i) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), i);
        }
    }
}
