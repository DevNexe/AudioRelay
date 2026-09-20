package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgau {
    public final Object a;
    public final byte[] b;
    public final int c;

    public zzgau(Object obj, byte[] bArr, int i) {
        this.a = obj;
        this.b = Arrays.copyOf(bArr, bArr.length);
        this.c = i;
    }

    public final Object zza() {
        return this.a;
    }

    public final byte[] zzb() {
        byte[] bArr = this.b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final int zzc() {
        return this.c;
    }
}
