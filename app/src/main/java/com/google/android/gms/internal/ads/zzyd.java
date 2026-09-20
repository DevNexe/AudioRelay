package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzyd {
    public static final int[] a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    public static final /* synthetic */ int zza = 0;

    public static int a(zzec zzecVar) throws zzbu {
        int iZzc = zzecVar.zzc(4);
        if (iZzc == 15) {
            return zzecVar.zzc(24);
        }
        if (iZzc < 13) {
            return a[iZzc];
        }
        throw zzbu.zza(null, null);
    }

    public static zzyc zza(byte[] bArr) {
        return zzb(new zzec(bArr, bArr.length), false);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x009d  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00c3  */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c0, code lost:
    
        if (r11 != 3) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzyc zzb(com.google.android.gms.internal.ads.zzec r11, boolean r12) throws com.google.android.gms.internal.ads.zzbu {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyd.zzb(com.google.android.gms.internal.ads.zzec, boolean):com.google.android.gms.internal.ads.zzyc");
    }
}
