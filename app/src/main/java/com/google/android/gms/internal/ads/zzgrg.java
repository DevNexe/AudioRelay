package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgrg extends RuntimeException {
    public zzgrg(zzgpx zzgpxVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzgoz zza() {
        return new zzgoz(getMessage());
    }
}
