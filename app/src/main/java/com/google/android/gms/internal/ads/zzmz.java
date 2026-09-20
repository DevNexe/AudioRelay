package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import defpackage.f57;

/* JADX INFO: loaded from: classes3.dex */
public final class zzmz {
    public static final zzmz zza;
    public final f57 a;

    static {
        zza = zzel.zza < 31 ? new zzmz() : new zzmz(f57.b);
    }

    public zzmz() {
        this.a = null;
        zzdd.zzf(zzel.zza < 31);
    }

    public zzmz(f57 f57Var) {
        this.a = f57Var;
    }

    public final LogSessionId zza() {
        f57 f57Var = this.a;
        f57Var.getClass();
        return f57Var.a;
    }

    public zzmz(LogSessionId logSessionId) {
        this.a = new f57(logSessionId);
    }
}
