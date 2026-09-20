package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class zzazz {
    public static final byte[] a = {0, 0, 0, 1};
    public static final int[] b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static int a(zzbaf zzbafVar) {
        int iZza = zzbafVar.zza(4);
        if (iZza == 15) {
            return zzbafVar.zza(24);
        }
        zzazy.zzc(iZza < 13);
        return b[iZza];
    }

    public static Pair zza(byte[] bArr) {
        zzbaf zzbafVar = new zzbaf(bArr, bArr.length);
        int iZza = zzbafVar.zza(5);
        if (iZza == 31) {
            iZza = zzbafVar.zza(6) + 32;
        }
        int iA = a(zzbafVar);
        int iZza2 = zzbafVar.zza(4);
        if (iZza == 5 || iZza == 29) {
            iA = a(zzbafVar);
            int iZza3 = zzbafVar.zza(5);
            if (iZza3 == 31) {
                iZza3 = zzbafVar.zza(6) + 32;
            }
            if (iZza3 == 22) {
                iZza2 = zzbafVar.zza(4);
            }
        }
        int i = c[iZza2];
        zzazy.zzc(i != -1);
        return Pair.create(Integer.valueOf(iA), Integer.valueOf(i));
    }

    public static byte[] zzb(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2 + 4];
        System.arraycopy(a, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i, bArr2, 4, i2);
        return bArr2;
    }
}
