package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzain {
    public static int zza(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    public static long zzb(zzed zzedVar, int i, int i2) {
        zzedVar.zzF(i);
        if (zzedVar.zza() < 5) {
            return -9223372036854775807L;
        }
        int iZze = zzedVar.zze();
        if ((8388608 & iZze) != 0 || ((iZze >> 8) & 8191) != i2 || (iZze & 32) == 0 || zzedVar.zzk() < 7 || zzedVar.zza() < 7 || (zzedVar.zzk() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        zzedVar.zzB(bArr, 0, 6);
        byte b = bArr[0];
        byte b2 = bArr[1];
        byte b3 = bArr[2];
        long j = ((long) bArr[3]) & 255;
        return ((((long) b2) & 255) << 17) | ((((long) b) & 255) << 25) | ((((long) b3) & 255) << 9) | (j + j) | ((((long) bArr[4]) & 255) >> 7);
    }
}
