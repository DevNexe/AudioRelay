package com.google.android.gms.internal.ads;

import defpackage.Md5A;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdv {
    public int a;
    public long[] b;

    public zzdv() {
        this(32);
    }

    public zzdv(int i) {
        this.b = new long[32];
    }

    public final int zza() {
        return this.a;
    }

    public final long zzb(int i) {
        if (i < 0 || i >= this.a) {
            throw new IndexOutOfBoundsException(Md5A.e("Invalid index ", i, ", size is ", this.a));
        }
        return this.b[i];
    }

    public final void zzc(long j) {
        int i = this.a;
        long[] jArr = this.b;
        if (i == jArr.length) {
            this.b = Arrays.copyOf(jArr, i + i);
        }
        long[] jArr2 = this.b;
        int i2 = this.a;
        this.a = i2 + 1;
        jArr2[i2] = j;
    }
}
