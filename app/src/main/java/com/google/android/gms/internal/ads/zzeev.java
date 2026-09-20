package com.google.android.gms.internal.ads;

import defpackage.vg6;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeev {
    public final zzeer a;
    public final zzfyy b;

    public zzeev(zzeer zzeerVar, zzfyy zzfyyVar) {
        this.a = zzeerVar;
        this.b = zzfyyVar;
    }

    public final void zza(zzfgs zzfgsVar) {
        final zzeer zzeerVar = this.a;
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzeet
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeerVar.getWritableDatabase();
            }
        };
        zzfyy zzfyyVar = this.b;
        zzfyo.zzr(zzfyyVar.zzb(callable), new vg6(zzfgsVar), zzfyyVar);
    }
}
