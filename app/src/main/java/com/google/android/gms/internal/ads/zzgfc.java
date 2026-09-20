package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgfc {
    public static final zzgfc zza = new zzgfa().zza();
    public final Map a;

    public final boolean equals(Object obj) {
        if (obj instanceof zzgfc) {
            return this.a.equals(((zzgfc) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
