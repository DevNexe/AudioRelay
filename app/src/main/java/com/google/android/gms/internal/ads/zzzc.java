package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzzc {
    public static final int[] a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] c = {64, 112, 128, 192, 224, 256, 384, 448, AdRequest.MAX_CONTENT_URL_LENGTH, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    public static final /* synthetic */ int zza = 0;

    public static zzaf zza(byte[] bArr, String str, String str2, zzx zzxVar) {
        zzec zzecVar;
        if (bArr[0] == 127) {
            zzecVar = new zzec(bArr, bArr.length);
        } else {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            byte b2 = bArrCopyOf[0];
            if (b2 == -2 || b2 == -1) {
                for (int i = 0; i < bArrCopyOf.length - 1; i += 2) {
                    byte b3 = bArrCopyOf[i];
                    int i2 = i + 1;
                    bArrCopyOf[i] = bArrCopyOf[i2];
                    bArrCopyOf[i2] = b3;
                }
            }
            int length = bArrCopyOf.length;
            zzecVar = new zzec(bArrCopyOf, length);
            if (bArrCopyOf[0] == 31) {
                zzec zzecVar2 = new zzec(bArrCopyOf, length);
                while (zzecVar2.zza() >= 16) {
                    zzecVar2.zzj(2);
                    zzecVar.zze(zzecVar2.zzc(14), 14);
                }
            }
            zzecVar.zzg(bArrCopyOf, bArrCopyOf.length);
        }
        zzecVar.zzj(60);
        int i3 = a[zzecVar.zzc(6)];
        int i4 = b[zzecVar.zzc(4)];
        int iZzc = zzecVar.zzc(5);
        int i5 = iZzc < 29 ? (c[iZzc] * AdError.NETWORK_ERROR_CODE) / 2 : -1;
        zzecVar.zzj(10);
        int i6 = zzecVar.zzc(2) > 0 ? 1 : 0;
        zzad zzadVar = new zzad();
        zzadVar.zzH(str);
        zzadVar.zzS("audio/vnd.dts");
        zzadVar.zzv(i5);
        zzadVar.zzw(i3 + i6);
        zzadVar.zzT(i4);
        zzadVar.zzB(null);
        zzadVar.zzK(str2);
        return zzadVar.zzY();
    }
}
