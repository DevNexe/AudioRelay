package com.google.android.gms.internal.ads;

import defpackage.cq4;
import java.util.ArrayDeque;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zzffu {
    public final zzfey a;
    public final zzffs b;

    @GuardedBy("this")
    public zzfga d;

    @GuardedBy("this")
    public int e = 1;

    @GuardedBy("this")
    public final ArrayDeque c = new ArrayDeque();

    public zzffu(zzfey zzfeyVar, zzfeu zzfeuVar, zzffs zzffsVar) {
        this.a = zzfeyVar;
        this.b = zzffsVar;
        zzfeuVar.zzb(new zzffp(this));
    }

    public final synchronized void a() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfp)).booleanValue() && !com.google.android.gms.ads.internal.zzt.zzp().zzh().zzh().zzh()) {
            this.c.clear();
            return;
        }
        synchronized (this) {
            if (this.d == null) {
                while (!this.c.isEmpty()) {
                    zzfft zzfftVar = (zzfft) this.c.pollFirst();
                    if (zzfftVar == null || (zzfftVar.zza() != null && this.a.zze(zzfftVar.zza()))) {
                        zzfga zzfgaVar = new zzfga(this.a, this.b, zzfftVar);
                        this.d = zzfgaVar;
                        zzfgaVar.zzd(new cq4(this, zzfftVar, 21));
                        return;
                    }
                }
            }
        }
    }

    public final synchronized zzfyx zza(zzfft zzfftVar) {
        zzfga zzfgaVar;
        this.e = 2;
        synchronized (this) {
            zzfgaVar = this.d;
        }
        if (zzfgaVar == null) {
            return null;
        }
        return zzfgaVar.zza(zzfftVar);
    }

    public final synchronized void zze(zzfft zzfftVar) {
        this.c.add(zzfftVar);
    }
}
