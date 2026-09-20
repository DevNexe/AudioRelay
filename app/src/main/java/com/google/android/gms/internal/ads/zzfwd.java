package com.google.android.gms.internal.ads;

import defpackage.ip6;
import defpackage.lo6;
import defpackage.lp6;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzfwd implements Comparator {
    public static zzfwd zzb(Comparator comparator) {
        return comparator instanceof zzfwd ? (zzfwd) comparator : new lo6(comparator);
    }

    public static zzfwd zzc() {
        return ip6.w;
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public zzfwd zza() {
        return new lp6(this);
    }
}
