package com.google.android.gms.internal.ads;

import defpackage.it6;
import defpackage.rv6;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgox {
    public static final Charset a;
    public static final byte[] zzd;
    public static final ByteBuffer zze;
    public static final zzgnn zzf;

    static {
        Charset.forName("US-ASCII");
        a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        int i = 0;
        byte[] bArr = new byte[0];
        zzd = bArr;
        zze = ByteBuffer.wrap(bArr);
        it6 it6Var = new it6(bArr, i, i);
        try {
            it6Var.zze(0);
            zzf = it6Var;
        } catch (zzgoz e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static zzgpx a(Object obj, Object obj2) {
        return ((zzgpx) obj).zzaM().zzah((zzgpx) obj2).zzan();
    }

    public static int zza(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int zzb(byte[] bArr) {
        int length = bArr.length;
        int i = length;
        for (int i2 = 0; i2 < 0 + length; i2++) {
            i = (i * 31) + bArr[i2];
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public static int zzc(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static String zzh(byte[] bArr) {
        return new String(bArr, a);
    }

    public static boolean zzi(byte[] bArr) {
        return rv6.a.b(0, 0, bArr.length, bArr) == 0;
    }
}
