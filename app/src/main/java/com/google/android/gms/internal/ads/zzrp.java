package com.google.android.gms.internal.ads;

import android.os.Handler;
import defpackage.j95;
import defpackage.ma7;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzrp extends zzrh {
    public final HashMap h = new HashMap();
    public Handler i;
    public zzfx j;

    @Override // com.google.android.gms.internal.ads.zzrh
    public final void a() {
        for (ma7 ma7Var : this.h.values()) {
            ma7Var.a.zzi(ma7Var.b);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrh
    public final void b() {
        for (ma7 ma7Var : this.h.values()) {
            ma7Var.a.zzk(ma7Var.b);
        }
    }

    public zzsg d(Object obj, zzsg zzsgVar) {
        throw null;
    }

    public abstract void e(Object obj, zzsi zzsiVar, zzcn zzcnVar);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.ads.zzrm, com.google.android.gms.internal.ads.zzsh] */
    public final void f(final Integer num, zzsi zzsiVar) {
        HashMap map = this.h;
        zzdd.zzd(!map.containsKey(num));
        ?? r1 = new zzsh() { // from class: com.google.android.gms.internal.ads.zzrm
            @Override // com.google.android.gms.internal.ads.zzsh
            public final void zza(zzsi zzsiVar2, zzcn zzcnVar) {
                this.zza.e(num, zzsiVar2, zzcnVar);
            }
        };
        j95 j95Var = new j95(this, num);
        map.put(num, new ma7(zzsiVar, r1, j95Var));
        Handler handler = this.i;
        handler.getClass();
        zzsiVar.zzh(handler, j95Var);
        Handler handler2 = this.i;
        handler2.getClass();
        zzsiVar.zzg(handler2, j95Var);
        zzfx zzfxVar = this.j;
        zzmz zzmzVar = this.g;
        zzdd.zzb(zzmzVar);
        zzsiVar.zzm(r1, zzfxVar, zzmzVar);
        if (!this.b.isEmpty()) {
            return;
        }
        zzsiVar.zzi(r1);
    }

    @Override // com.google.android.gms.internal.ads.zzrh
    public void zzn(zzfx zzfxVar) {
        this.j = zzfxVar;
        this.i = zzel.zzD(null);
    }

    @Override // com.google.android.gms.internal.ads.zzrh
    public void zzq() {
        HashMap map = this.h;
        for (ma7 ma7Var : map.values()) {
            ma7Var.a.zzp(ma7Var.b);
            zzsi zzsiVar = ma7Var.a;
            j95 j95Var = ma7Var.c;
            zzsiVar.zzs(j95Var);
            zzsiVar.zzr(j95Var);
        }
        map.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public void zzw() {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((ma7) it.next()).a.zzw();
        }
    }
}
