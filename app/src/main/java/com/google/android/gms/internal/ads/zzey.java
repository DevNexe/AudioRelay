package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzey {
    public Uri a;
    public Map b = Collections.emptyMap();
    public long c;
    public int d;

    public final zzey zza(int i) {
        this.d = 6;
        return this;
    }

    public final zzey zzb(Map map) {
        this.b = map;
        return this;
    }

    public final zzey zzc(long j) {
        this.c = j;
        return this;
    }

    public final zzey zzd(Uri uri) {
        this.a = uri;
        return this;
    }

    public final zzfa zze() {
        if (this.a != null) {
            return new zzfa(this.a, 0L, this.b, this.c, -1L, this.d);
        }
        throw new IllegalStateException("The uri must be set.");
    }
}
