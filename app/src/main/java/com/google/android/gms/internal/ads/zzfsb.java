package com.google.android.gms.internal.ads;

import defpackage.pm6;
import defpackage.ym6;
import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzfsb implements Serializable {
    public static zzfsb zzc() {
        return pm6.w;
    }

    public static zzfsb zzd(@CheckForNull Object obj) {
        return obj == null ? pm6.w : new ym6(obj);
    }

    public abstract zzfsb zza(zzfru zzfruVar);

    public abstract Object zzb(Object obj);
}
