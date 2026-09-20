package com.google.android.gms.internal.ads;

import defpackage.f77;

/* JADX INFO: loaded from: classes3.dex */
public final class zzog {
    public zznb a = zznb.zza;
    public zzoi b;

    public zzog() {
        zzou zzouVar = f77.a;
    }

    public final zzog zzb(zznb zznbVar) {
        this.a = zznbVar;
        return this;
    }

    public final zzog zzc(zzne[] zzneVarArr) {
        this.b = new zzoi(zzneVarArr);
        return this;
    }

    public final zzos zzd() {
        if (this.b == null) {
            this.b = new zzoi(new zzne[0]);
        }
        return new zzos(this);
    }
}
