package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdkp {
    public final List a;
    public final zzfju b;
    public boolean c;

    public zzdkp(zzfcs zzfcsVar, zzfju zzfjuVar) {
        this.a = zzfcsVar.zzq;
        this.b = zzfjuVar;
    }

    public final void zza() {
        if (this.c) {
            return;
        }
        this.b.zzd(this.a);
        this.c = true;
    }
}
