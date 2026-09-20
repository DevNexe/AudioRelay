package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import defpackage.fc2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
@TargetApi(21)
public final class zzatf {
    public static final zzatf zza = new zzatf(new int[]{2});
    public final int[] a;

    public zzatf(int[] iArr) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, 1);
        this.a = iArrCopyOf;
        Arrays.sort(iArrCopyOf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzatf) && Arrays.equals(this.a, ((zzatf) obj).a);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.a) * 31) + 2;
    }

    public final String toString() {
        return fc2.a("AudioCapabilities[maxChannelCount=2, supportedEncodings=", Arrays.toString(this.a), "]");
    }
}
