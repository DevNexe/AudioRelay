package com.google.android.gms.internal.ads;

import defpackage.ft;
import defpackage.ii6;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeqx implements zzeun {
    public final AtomicReference a = new AtomicReference();
    public final ft b;
    public final zzeun c;
    public final long d;

    public zzeqx(zzeun zzeunVar, long j, ft ftVar) {
        this.b = ftVar;
        this.c = zzeunVar;
        this.d = j;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final int zza() {
        return 16;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    @Override // com.google.android.gms.internal.ads.zzeun
    public final zzfyx zzb() {
        AtomicReference atomicReference = this.a;
        ii6 ii6Var = (ii6) atomicReference.get();
        if (ii6Var != null) {
            if (ii6Var.b < ii6Var.c.c()) {
                ii6Var = new ii6(this.c.zzb(), this.d, this.b);
                atomicReference.set(ii6Var);
            }
        } else {
            ii6Var = new ii6(this.c.zzb(), this.d, this.b);
            atomicReference.set(ii6Var);
        }
        return ii6Var.a;
    }
}
