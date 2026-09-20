package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes3.dex */
public final class zzzj {
    public static int zza(zzzg zzzgVar, byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int iZzb = zzzgVar.zzb(bArr, i + i3, i2 - i3);
            if (iZzb == -1) {
                break;
            }
            i3 += iZzb;
        }
        return i3;
    }

    @Pure
    public static void zzb(boolean z, String str) throws zzbu {
        if (!z) {
            throw zzbu.zza(str, null);
        }
    }

    public static boolean zzc(zzzg zzzgVar, byte[] bArr, int i, int i2, boolean z) throws EOFException {
        try {
            return zzzgVar.zzm(bArr, 0, i2, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    public static boolean zzd(zzzg zzzgVar, byte[] bArr, int i, int i2) throws InterruptedIOException {
        try {
            ((zzyv) zzzgVar).zzn(bArr, i, i2, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean zze(zzzg zzzgVar, int i) throws InterruptedIOException {
        try {
            ((zzyv) zzzgVar).zzo(i, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
