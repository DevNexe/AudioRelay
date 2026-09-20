package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* JADX INFO: loaded from: classes3.dex */
public final class zzyj {
    public static final int[] a = {AdError.CACHE_ERROR_CODE, AdError.SERVER_ERROR_CODE, 1920, 1601, 1600, AdError.NO_FILL_ERROR_CODE, AdError.NETWORK_ERROR_CODE, 960, 800, 800, 480, 400, 400, 2048};
    public static final /* synthetic */ int zza = 0;

    /* JADX WARN: Code duplicated, block: B:44:0x008d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0091  */
    public static zzyi zza(zzec zzecVar) {
        int i;
        int i2;
        int iZzc = zzecVar.zzc(16);
        int iZzc2 = zzecVar.zzc(16);
        if (iZzc2 == 65535) {
            iZzc2 = zzecVar.zzc(24);
            i = 7;
        } else {
            i = 4;
        }
        int i3 = iZzc2 + i;
        if (iZzc == 44097) {
            i3 += 2;
        }
        if (zzecVar.zzc(2) == 3) {
            do {
                zzecVar.zzc(2);
            } while (zzecVar.zzl());
        }
        int iZzc3 = zzecVar.zzc(10);
        if (zzecVar.zzl() && zzecVar.zzc(3) > 0) {
            zzecVar.zzj(2);
        }
        int i4 = true != zzecVar.zzl() ? 44100 : 48000;
        int iZzc4 = zzecVar.zzc(4);
        int[] iArr = a;
        if (i4 == 44100 && iZzc4 == 13) {
            i2 = iArr[13];
        } else if (i4 != 48000 || iZzc4 >= 14) {
            i2 = 0;
        } else {
            int i5 = iArr[iZzc4];
            int i6 = iZzc3 % 5;
            if (i6 == 1) {
                if (iZzc4 != 3 || iZzc4 == 8) {
                    i5++;
                }
            } else if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 == 4 && (iZzc4 == 3 || iZzc4 == 8 || iZzc4 == 11)) {
                        i5++;
                    }
                } else if (iZzc4 != 3) {
                    i5++;
                } else {
                    i5++;
                }
            } else if (iZzc4 == 8 || iZzc4 == 11) {
                i5++;
            }
            i2 = i5;
        }
        return new zzyi(i4, i3, i2);
    }

    public static void zzb(int i, zzed zzedVar) {
        zzedVar.zzC(7);
        byte[] bArrZzH = zzedVar.zzH();
        bArrZzH[0] = -84;
        bArrZzH[1] = 64;
        bArrZzH[2] = -1;
        bArrZzH[3] = -1;
        bArrZzH[4] = (byte) ((i >> 16) & 255);
        bArrZzH[5] = (byte) ((i >> 8) & 255);
        bArrZzH[6] = (byte) (i & 255);
    }
}
