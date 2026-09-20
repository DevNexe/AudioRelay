package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzzo {
    public static int zza(zzed zzedVar, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return zzedVar.zzk() + 1;
            case 7:
                return zzedVar.zzo() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    public static long zzb(zzzg zzzgVar, zzzs zzzsVar) throws zzbu, EOFException, InterruptedIOException {
        zzzgVar.zzj();
        zzyv zzyvVar = (zzyv) zzzgVar;
        boolean z = true;
        zzyvVar.zzl(1, false);
        byte[] bArr = new byte[1];
        zzyvVar.zzm(bArr, 0, 1, false);
        int i = bArr[0] & 1;
        zzyvVar.zzl(2, false);
        int i2 = 1 != i ? 6 : 7;
        zzed zzedVar = new zzed(i2);
        zzedVar.zzE(zzzj.zza(zzzgVar, zzedVar.zzH(), 0, i2));
        zzzgVar.zzj();
        zzzn zzznVar = new zzzn();
        boolean z2 = 1 == i;
        try {
            long jZzu = zzedVar.zzu();
            if (!z2) {
                jZzu *= (long) zzzsVar.zzb;
            }
            zzznVar.zza = jZzu;
        } catch (NumberFormatException unused) {
            z = false;
        }
        if (z) {
            return zzznVar.zza;
        }
        throw zzbu.zza(null, null);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b6 A[RETURN] */
    public static boolean zzc(zzed zzedVar, zzzs zzzsVar, int i, zzzn zzznVar) {
        boolean z;
        int iZza;
        int iZzc = zzedVar.zzc();
        long jZzs = zzedVar.zzs();
        long j = jZzs >>> 16;
        if (j != i) {
            return false;
        }
        boolean z2 = (j & 1) == 1;
        int i2 = (int) ((jZzs >> 12) & 15);
        int i3 = (int) ((jZzs >> 8) & 15);
        int i4 = (int) (15 & (jZzs >> 4));
        int i5 = (int) ((jZzs >> 1) & 7);
        long j2 = jZzs & 1;
        if (i4 > 7 ? !(i4 > 10 || zzzsVar.zzg != 2) : i4 == zzzsVar.zzg - 1) {
            if ((i5 == 0 || i5 == zzzsVar.zzi) && j2 != 1) {
                try {
                    long jZzu = zzedVar.zzu();
                    if (!z2) {
                        jZzu *= (long) zzzsVar.zzb;
                    }
                    zzznVar.zza = jZzu;
                    z = true;
                } catch (NumberFormatException unused) {
                    z = false;
                }
                if (z && (iZza = zza(zzedVar, i2)) != -1 && iZza <= zzzsVar.zzb) {
                    int i6 = zzzsVar.zze;
                    if (i3 != 0) {
                        if (i3 <= 11) {
                            if (i3 == zzzsVar.zzf) {
                                if (zzedVar.zzk() == zzel.zzh(zzedVar.zzH(), iZzc, zzedVar.zzc() - 1, 0)) {
                                    return true;
                                }
                            }
                        } else if (i3 == 12) {
                            if (zzedVar.zzk() * AdError.NETWORK_ERROR_CODE == i6) {
                                if (zzedVar.zzk() == zzel.zzh(zzedVar.zzH(), iZzc, zzedVar.zzc() - 1, 0)) {
                                    return true;
                                }
                            }
                        } else if (i3 <= 14) {
                            int iZzo = zzedVar.zzo();
                            if (i3 == 14) {
                                iZzo *= 10;
                            }
                            if (iZzo == i6) {
                                if (zzedVar.zzk() == zzel.zzh(zzedVar.zzH(), iZzc, zzedVar.zzc() - 1, 0)) {
                                    return true;
                                }
                            }
                        }
                    } else if (zzedVar.zzk() == zzel.zzh(zzedVar.zzH(), iZzc, zzedVar.zzc() - 1, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
