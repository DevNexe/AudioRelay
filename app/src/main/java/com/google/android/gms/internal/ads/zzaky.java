package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaky {
    public final int a;
    public final List b;
    public final int c;
    public final InputStream d;

    public zzaky(int i, List list, int i2, InputStream inputStream) {
        this.a = i;
        this.b = list;
        this.c = i2;
        this.d = inputStream;
    }

    public final int zza() {
        return this.c;
    }

    public final int zzb() {
        return this.a;
    }

    public final InputStream zzc() {
        InputStream inputStream = this.d;
        if (inputStream != null) {
            return inputStream;
        }
        return null;
    }

    public final List zzd() {
        return Collections.unmodifiableList(this.b);
    }
}
