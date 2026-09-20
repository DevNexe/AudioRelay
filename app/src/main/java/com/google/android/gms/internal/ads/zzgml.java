package com.google.android.gms.internal.ads;

import defpackage.fc2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgml {
    public final byte[] a;

    public zzgml(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        this.a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
    }

    public static zzgml zza(byte[] bArr, int i, int i2) {
        return new zzgml(bArr, i2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgml) {
            return Arrays.equals(((zzgml) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return fc2.a("Bytes(", zzglz.zza(this.a), ")");
    }

    public final byte[] zzb() {
        byte[] bArr = this.a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }
}
