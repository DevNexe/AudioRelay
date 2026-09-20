package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import defpackage.ql6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfmq {
    public final Context a;
    public final Looper b;

    public zzfmq(Context context, Looper looper) {
        this.a = context;
        this.b = looper;
    }

    public final void zza(String str) {
        zzfne zzfneVarZza = zzfng.zza();
        zzfneVarZza.zza(this.a.getPackageName());
        zzfneVarZza.zzc(2);
        zzfnb zzfnbVarZza = zzfnc.zza();
        zzfnbVarZza.zza(str);
        zzfnbVarZza.zzb(2);
        zzfneVarZza.zzb(zzfnbVarZza);
        ql6 ql6Var = new ql6(this.a, this.b, (zzfng) zzfneVarZza.zzal());
        synchronized (ql6Var.c) {
            if (!ql6Var.d) {
                ql6Var.d = true;
                ql6Var.a.checkAvailabilityAndConnect();
            }
        }
    }
}
