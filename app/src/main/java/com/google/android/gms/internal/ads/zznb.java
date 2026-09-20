package com.google.android.gms.internal.ads;

import android.util.Pair;
import defpackage.fc2;
import defpackage.q57;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zznb {
    public static final zzfuy b;
    public static final zznb zza = new zznb(new int[]{2}, 8);
    public final int[] a;

    static {
        new zznb(new int[]{2, 5, 6}, 8);
        zzfux zzfuxVar = new zzfux();
        zzfuxVar.zza(5, 6);
        zzfuxVar.zza(17, 6);
        zzfuxVar.zza(7, 6);
        zzfuxVar.zza(18, 6);
        zzfuxVar.zza(6, 8);
        zzfuxVar.zza(8, 8);
        zzfuxVar.zza(14, 8);
        b = zzfuxVar.zzc();
    }

    public zznb(int[] iArr, int i) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        this.a = iArrCopyOf;
        Arrays.sort(iArrCopyOf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zznb) && Arrays.equals(this.a, ((zznb) obj).a);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.a) * 31) + 8;
    }

    public final String toString() {
        return fc2.a("AudioCapabilities[maxChannelCount=8, supportedEncodings=", Arrays.toString(this.a), "]");
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    public final Pair zza(zzaf zzafVar) {
        String str = zzafVar.zzm;
        str.getClass();
        int iZza = zzbt.zza(str, zzafVar.zzj);
        Integer numValueOf = Integer.valueOf(iZza);
        zzfuy zzfuyVar = b;
        if (!zzfuyVar.containsKey(numValueOf)) {
            return null;
        }
        int i = 6;
        if (iZza != 18) {
            if (iZza == 8 && !zzc(8)) {
                iZza = 7;
            }
        } else if (zzc(18)) {
            iZza = 18;
            if (iZza == 8) {
                iZza = 7;
            }
        } else {
            iZza = 6;
        }
        if (!zzc(iZza)) {
            return null;
        }
        int iIntValue = zzafVar.zzz;
        if (iIntValue == -1 || iZza == 18) {
            int i2 = zzafVar.zzA;
            if (i2 == -1) {
                i2 = 48000;
            }
            if (zzel.zza >= 29) {
                iIntValue = q57.a(iZza, i2);
            } else {
                Integer num = (Integer) zzfuyVar.getOrDefault(Integer.valueOf(iZza), 0);
                num.getClass();
                iIntValue = num.intValue();
            }
        } else if (iIntValue > 8) {
            return null;
        }
        int i3 = zzel.zza;
        if (i3 > 28) {
            i = iIntValue;
        } else if (iIntValue == 7) {
            i = 8;
        } else if (iIntValue != 3 && iIntValue != 4 && iIntValue != 5) {
            i = iIntValue;
        }
        if (i3 <= 26 && "fugu".equals(zzel.zzb) && i == 1) {
            i = 2;
        }
        int iZzj = zzel.zzj(i);
        if (iZzj == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iZza), Integer.valueOf(iZzj));
    }

    public final boolean zzc(int i) {
        return Arrays.binarySearch(this.a, i) >= 0;
    }
}
