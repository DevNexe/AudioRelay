package com.google.android.gms.internal.ads;

import defpackage.bj0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaac {
    public static final byte[] zza = {0, 0, 0, 1};
    public static final float[] zzb = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object a = new Object();
    public static int[] b = new int[10];

    public static int zza(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        zzdd.zzf(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            zze(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            zze(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            zze(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b2 = bArr[i5];
            if ((b2 & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b2 == 1) {
                    zze(zArr);
                    return i6;
                }
                i5 = i6;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    public static int zzb(byte[] bArr, int i) {
        int i2;
        synchronized (a) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    try {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = b;
                    int length = iArr.length;
                    if (length <= i4) {
                        b = Arrays.copyOf(iArr, length + length);
                    }
                    b[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = b[i7] - i5;
                System.arraycopy(bArr, i5, bArr, i6, i8);
                int i9 = i6 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i6 = i10 + 1;
                bArr[i10] = 0;
                i5 += i8 + 3;
            }
            System.arraycopy(bArr, i5, bArr, i6, i2 - i6);
        }
        return i2;
    }

    public static zzaaa zzc(byte[] bArr, int i, int i2) {
        zzaae zzaaeVar = new zzaae(bArr, 4, i2);
        int iZzc = zzaaeVar.zzc();
        int iZzc2 = zzaaeVar.zzc();
        zzaaeVar.zzd();
        return new zzaaa(iZzc, iZzc2, zzaaeVar.zzf());
    }

    /* JADX WARN: Code duplicated, block: B:100:0x009a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x005c  */
    /* JADX WARN: Code duplicated, block: B:30:0x006d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x006f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0072  */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    /* JADX WARN: Code duplicated, block: B:37:0x007d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0080  */
    /* JADX WARN: Code duplicated, block: B:40:0x0083  */
    /* JADX WARN: Code duplicated, block: B:43:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x008e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0099  */
    /* JADX WARN: Code duplicated, block: B:63:0x0101  */
    /* JADX WARN: Code duplicated, block: B:66:0x0111  */
    /* JADX WARN: Code duplicated, block: B:69:0x0124  */
    /* JADX WARN: Code duplicated, block: B:71:0x0127  */
    /* JADX WARN: Code duplicated, block: B:72:0x012b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0131  */
    /* JADX WARN: Code duplicated, block: B:92:0x017c  */
    /* JADX WARN: Code duplicated, block: B:97:0x009d A[SYNTHETIC] */
    public static zzaab zzd(byte[] bArr, int i, int i2) {
        int iZzc;
        boolean zZzf;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        int iZzb;
        int i8;
        int iZzc2;
        boolean z2;
        int i9;
        int i10;
        boolean zZzf2;
        int i11;
        int i12;
        int i13;
        float f;
        int i14;
        zzaae zzaaeVar = new zzaae(bArr, i, i2);
        int iZza = zzaaeVar.zza(8);
        int iZza2 = zzaaeVar.zza(8);
        int iZza3 = zzaaeVar.zza(8);
        int iZzc3 = zzaaeVar.zzc();
        int i15 = 1;
        if (iZza == 100 || iZza == 110 || iZza == 122 || iZza == 244 || iZza == 44 || iZza == 83 || iZza == 86 || iZza == 118 || iZza == 128) {
            iZzc = zzaaeVar.zzc();
            if (iZzc == 3) {
                zZzf = zzaaeVar.zzf();
                i3 = 3;
            } else {
                zZzf = false;
                i3 = iZzc;
            }
            zzaaeVar.zzc();
            zzaaeVar.zzc();
            zzaaeVar.zzd();
            if (zzaaeVar.zzf()) {
                if (i3 != 3) {
                    i4 = 8;
                } else {
                    i4 = 12;
                }
                for (i5 = 0; i5 < i4; i5++) {
                    if (!zzaaeVar.zzf()) {
                        if (i5 < 6) {
                            i6 = 16;
                        } else {
                            i6 = 64;
                        }
                        iZzb = 8;
                        i8 = 8;
                        for (i7 = 0; i7 < i6; i7++) {
                            if (iZzb != 0) {
                                iZzb = ((zzaaeVar.zzb() + i8) + 256) % 256;
                            }
                            if (iZzb != 0) {
                                i8 = iZzb;
                            }
                        }
                    }
                }
            }
            z = zZzf;
        } else if (iZza == 138) {
            iZza = 138;
            iZzc = zzaaeVar.zzc();
            if (iZzc == 3) {
                zZzf = zzaaeVar.zzf();
                i3 = 3;
            } else {
                zZzf = false;
                i3 = iZzc;
            }
            zzaaeVar.zzc();
            zzaaeVar.zzc();
            zzaaeVar.zzd();
            if (zzaaeVar.zzf()) {
                if (i3 != 3) {
                    i4 = 8;
                } else {
                    i4 = 12;
                }
                while (i5 < i4) {
                    if (!zzaaeVar.zzf()) {
                        if (i5 < 6) {
                            i6 = 16;
                        } else {
                            i6 = 64;
                        }
                        iZzb = 8;
                        i8 = 8;
                        while (i7 < i6) {
                            if (iZzb != 0) {
                                iZzb = ((zzaaeVar.zzb() + i8) + 256) % 256;
                            }
                            if (iZzb != 0) {
                                i8 = iZzb;
                            }
                        }
                    }
                }
            }
            z = zZzf;
        } else {
            iZzc = 1;
            z = false;
        }
        int iZzc4 = zzaaeVar.zzc() + 4;
        int iZzc5 = zzaaeVar.zzc();
        if (iZzc5 != 0) {
            if (iZzc5 == 1) {
                boolean zZzf3 = zzaaeVar.zzf();
                zzaaeVar.zzb();
                zzaaeVar.zzb();
                long jZzc = zzaaeVar.zzc();
                iZza2 = iZza2;
                for (int i16 = 0; i16 < jZzc; i16++) {
                    zzaaeVar.zzc();
                }
                z2 = zZzf3;
                i9 = 1;
                i10 = 0;
            } else {
                iZzc2 = 0;
            }
            int iZzc6 = zzaaeVar.zzc();
            zzaaeVar.zzd();
            int iZzc7 = zzaaeVar.zzc() + 1;
            int iZzc8 = zzaaeVar.zzc();
            zZzf2 = zzaaeVar.zzf();
            i11 = 2 - (zZzf2 ? 1 : 0);
            int i17 = (iZzc8 + 1) * i11;
            if (!zZzf2) {
                zzaaeVar.zzd();
            }
            zzaaeVar.zzd();
            i12 = iZzc7 * 16;
            i13 = i17 * 16;
            if (zzaaeVar.zzf()) {
                int iZzc9 = zzaaeVar.zzc();
                int iZzc10 = zzaaeVar.zzc();
                int iZzc11 = zzaaeVar.zzc();
                int iZzc12 = zzaaeVar.zzc();
                if (iZzc != 0) {
                    if (iZzc == 3) {
                        i14 = 1;
                    } else {
                        i14 = 2;
                    }
                    i11 *= iZzc == 1 ? 2 : 1;
                    i15 = i14;
                }
                i12 -= (iZzc9 + iZzc10) * i15;
                i13 -= (iZzc11 + iZzc12) * i11;
            }
            int i18 = i12;
            int i19 = i13;
            if (zzaaeVar.zzf() || !zzaaeVar.zzf()) {
                f = 1.0f;
            } else {
                int iZza4 = zzaaeVar.zza(8);
                if (iZza4 == 255) {
                    int iZza5 = zzaaeVar.zza(16);
                    int iZza6 = zzaaeVar.zza(16);
                    if (iZza5 == 0 || iZza6 == 0) {
                        f = 1.0f;
                    } else {
                        f = iZza5 / iZza6;
                    }
                } else if (iZza4 < 17) {
                    f = zzb[iZza4];
                } else {
                    bj0.b("Unexpected aspect_ratio_idc value: ", iZza4, "NalUnitUtil");
                    f = 1.0f;
                }
            }
            return new zzaab(iZza, iZza2, iZza3, iZzc3, iZzc6, i18, i19, f, z, zZzf2, iZzc4, i9, i10, z2);
        }
        iZzc2 = zzaaeVar.zzc() + 4;
        i9 = iZzc5;
        i10 = iZzc2;
        z2 = false;
        int iZzc13 = zzaaeVar.zzc();
        zzaaeVar.zzd();
        int iZzc14 = zzaaeVar.zzc() + 1;
        int iZzc15 = zzaaeVar.zzc();
        zZzf2 = zzaaeVar.zzf();
        i11 = 2 - (zZzf2 ? 1 : 0);
        int i110 = (iZzc15 + 1) * i11;
        if (!zZzf2) {
            zzaaeVar.zzd();
        }
        zzaaeVar.zzd();
        i12 = iZzc14 * 16;
        i13 = i110 * 16;
        if (zzaaeVar.zzf()) {
            int iZzc16 = zzaaeVar.zzc();
            int iZzc17 = zzaaeVar.zzc();
            int iZzc18 = zzaaeVar.zzc();
            int iZzc19 = zzaaeVar.zzc();
            if (iZzc != 0) {
                if (iZzc == 3) {
                    i14 = 1;
                } else {
                    i14 = 2;
                }
                i11 *= iZzc == 1 ? 2 : 1;
                i15 = i14;
            }
            i12 -= (iZzc16 + iZzc17) * i15;
            i13 -= (iZzc18 + iZzc19) * i11;
        }
        int i111 = i12;
        int i112 = i13;
        if (zzaaeVar.zzf()) {
            f = 1.0f;
        } else {
            f = 1.0f;
        }
        return new zzaab(iZza, iZza2, iZza3, iZzc3, iZzc13, i111, i112, f, z, zZzf2, iZzc4, i9, i10, z2);
    }

    public static void zze(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }
}
