package com.google.android.gms.internal.ads;

import defpackage.h46;

/* JADX INFO: loaded from: classes3.dex */
public enum zzbgy implements zzgop {
    UNSPECIFIED(0),
    CONNECTING(1),
    CONNECTED(2),
    DISCONNECTING(3),
    DISCONNECTED(4),
    SUSPENDED(5);

    public final int w;

    zzbgy(int i) {
        this.w = i;
    }

    public static zzbgy zzb(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return CONNECTING;
        }
        if (i == 2) {
            return CONNECTED;
        }
        if (i == 3) {
            return DISCONNECTING;
        }
        if (i == 4) {
            return DISCONNECTED;
        }
        if (i != 5) {
            return null;
        }
        return SUSPENDED;
    }

    public static zzgor zzc() {
        return h46.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.w);
    }

    public final int zza() {
        return this.w;
    }
}
