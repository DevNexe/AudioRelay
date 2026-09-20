package defpackage;

import com.google.android.gms.internal.ads.zzaak;
import com.google.android.gms.internal.ads.zzaam;
import com.google.android.gms.internal.ads.zzad;
import com.google.android.gms.internal.ads.zzaf;
import com.google.android.gms.internal.ads.zzbu;
import com.google.android.gms.internal.ads.zzed;
import com.google.android.gms.internal.ads.zzel;
import com.google.android.gms.internal.ads.zzzg;
import com.google.android.gms.internal.ads.zzzi;

/* JADX INFO: loaded from: classes3.dex */
public final class bx5 implements cx5 {
    public static final int[] m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public final zzzi a;
    public final zzaam b;
    public final ex5 c;
    public final int d;
    public final byte[] e;
    public final zzed f;
    public final int g;
    public final zzaf h;
    public int i;
    public long j;
    public int k;
    public long l;

    public bx5(zzzi zzziVar, zzaam zzaamVar, ex5 ex5Var) throws zzbu {
        this.a = zzziVar;
        this.b = zzaamVar;
        this.c = ex5Var;
        int i = ex5Var.b;
        int iMax = Math.max(1, i / 10);
        this.g = iMax;
        zzed zzedVar = new zzed(ex5Var.e);
        zzedVar.zzi();
        int iZzi = zzedVar.zzi();
        this.d = iZzi;
        int i2 = ex5Var.a;
        int i3 = ex5Var.c;
        int i4 = (((i3 - (i2 * 4)) * 8) / (ex5Var.d * i2)) + 1;
        if (iZzi != i4) {
            throw zzbu.zza("Expected frames per block: " + i4 + "; got: " + iZzi, null);
        }
        int iZze = zzel.zze(iMax, iZzi);
        this.e = new byte[iZze * i3];
        this.f = new zzed((iZzi + iZzi) * i2 * iZze);
        int i5 = ((i3 * i) * 8) / iZzi;
        zzad zzadVar = new zzad();
        zzadVar.zzS("audio/raw");
        zzadVar.zzv(i5);
        zzadVar.zzO(i5);
        zzadVar.zzL((iMax + iMax) * i2);
        zzadVar.zzw(i2);
        zzadVar.zzT(i);
        zzadVar.zzN(2);
        this.h = zzadVar.zzY();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0059  */
    /* JADX WARN: Code duplicated, block: B:19:0x0060  */
    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:31:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:37:0x0157  */
    /* JADX WARN: Code duplicated, block: B:38:0x015b  */
    /* JADX WARN: Code duplicated, block: B:40:0x015f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0167  */
    /* JADX WARN: Code duplicated, block: B:44:0x0050 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x012c A[EDGE_INSN: B:48:0x012c->B:35:0x012c BREAK  A[LOOP:1: B:17:0x005a->B:34:0x011e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0033  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0046 -> B:12:0x0048). Please report as a decompilation issue!!! */
    @Override // defpackage.cx5
    public final boolean a(zzzg zzzgVar, long j) {
        int i;
        boolean z;
        long j2;
        int i2;
        zzzg zzzgVar2;
        byte[] bArr;
        int i3;
        ex5 ex5Var;
        boolean z2;
        int i4;
        int i5;
        int i6;
        zzed zzedVar;
        int i7;
        int i8;
        int i9;
        int i10;
        byte[] bArrZzH;
        int i11;
        int i12;
        int iZzf;
        int iMin;
        int[] iArr;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int iZza;
        int i20 = this.k;
        ex5 ex5Var2 = this.c;
        int i21 = ex5Var2.a;
        int i22 = i20 / (i21 + i21);
        int i23 = this.g;
        int i24 = this.d;
        int iZze = zzel.zze(i23 - i22, i24) * ex5Var2.c;
        ex5 ex5Var3 = ex5Var2;
        if (j != 0) {
            i = i24;
            z = false;
            j2 = j;
            i2 = iZze;
            zzzgVar2 = zzzgVar;
            while (true) {
                bArr = this.e;
                if (z && (i19 = this.i) < i2) {
                    iZza = zzzgVar2.zza(bArr, this.i, (int) Math.min(i2 - i19, j2));
                    if (iZza == -1) {
                        break;
                    }
                    this.i += iZza;
                    bArr = this.e;
                    if (z) {
                    }
                }
                i3 = this.i / ex5Var3.c;
                ex5Var = this.c;
                if (i3 > 0) {
                    i5 = 0;
                    while (true) {
                        i6 = ex5Var3.c;
                        zzedVar = this.f;
                        if (i5 < i3) {
                            break;
                        }
                        i9 = 0;
                        while (true) {
                            i10 = ex5Var3.a;
                            if (i9 < i10) {
                                bArrZzH = zzedVar.zzH();
                                int i25 = (i9 * 4) + (i5 * i6);
                                i11 = (i10 * 4) + i25;
                                i12 = (i6 / i10) - 4;
                                iZzf = (short) (((bArr[i25 + 1] & 255) << 8) | (bArr[i25] & 255));
                                iMin = Math.min(bArr[i25 + 2] & 255, 88);
                                iArr = n;
                                i13 = iArr[iMin];
                                int i26 = (i5 * i * i10) + i9;
                                i14 = i26 + i26;
                                bArrZzH[i14] = (byte) (iZzf & 255);
                                ex5 ex5Var4 = ex5Var3;
                                bArrZzH[i14 + 1] = (byte) (iZzf >> 8);
                                i15 = 0;
                                while (i15 < i12 + i12) {
                                    i16 = bArr[((i15 / 2) % 4) + ((i15 / 8) * i10 * 4) + i11] & 255;
                                    if (i15 % 2 == 0) {
                                        i17 = i16 & 15;
                                    } else {
                                        i17 = i16 >> 4;
                                    }
                                    int i27 = i17 & 7;
                                    int i28 = (i27 + i27 + 1) * i13;
                                    byte[] bArr2 = bArr;
                                    i18 = i28 >> 3;
                                    if ((i17 & 8) != 0) {
                                        i18 = -i18;
                                    }
                                    iZzf = zzel.zzf(iZzf + i18, -32768, 32767);
                                    i14 = i10 + i10 + i14;
                                    bArrZzH[i14] = (byte) (iZzf & 255);
                                    bArrZzH[i14 + 1] = (byte) (iZzf >> 8);
                                    iMin = zzel.zzf(iMin + m[i17], 0, 88);
                                    i15++;
                                    bArr = bArr2;
                                    i13 = iArr[iMin];
                                    z = z;
                                }
                                i9++;
                                ex5Var3 = ex5Var4;
                            }
                        }
                        i5++;
                    }
                    z2 = z;
                    int i29 = i * i3;
                    int i30 = (i29 + i29) * ex5Var.a;
                    zzedVar.zzF(0);
                    zzedVar.zzE(i30);
                    this.i -= i3 * i6;
                    int iZzd = zzedVar.zzd();
                    zzaak.zzb(this.b, zzedVar, iZzd);
                    i7 = this.k + iZzd;
                    this.k = i7;
                    i8 = ex5Var.a;
                    if (i7 / (i8 + i8) >= i23) {
                        b(i23);
                    }
                } else {
                    z2 = z;
                }
                if (z2) {
                    int i31 = this.k;
                    int i32 = ex5Var.a;
                    i4 = i31 / (i32 + i32);
                    if (i4 > 0) {
                        b(i4);
                    }
                }
                return z2;
            }
        }
        i = i24;
        j2 = j;
        i2 = iZze;
        zzzgVar2 = zzzgVar;
        z = true;
        while (true) {
            bArr = this.e;
            if (z) {
            }
            i3 = this.i / ex5Var3.c;
            ex5Var = this.c;
            if (i3 > 0) {
                i5 = 0;
                while (true) {
                    i6 = ex5Var3.c;
                    zzedVar = this.f;
                    if (i5 < i3) {
                        break;
                        break;
                    }
                    i9 = 0;
                    while (true) {
                        i10 = ex5Var3.a;
                        if (i9 < i10) {
                            bArrZzH = zzedVar.zzH();
                            int i210 = (i9 * 4) + (i5 * i6);
                            i11 = (i10 * 4) + i210;
                            i12 = (i6 / i10) - 4;
                            iZzf = (short) (((bArr[i210 + 1] & 255) << 8) | (bArr[i210] & 255));
                            iMin = Math.min(bArr[i210 + 2] & 255, 88);
                            iArr = n;
                            i13 = iArr[iMin];
                            int i211 = (i5 * i * i10) + i9;
                            i14 = i211 + i211;
                            bArrZzH[i14] = (byte) (iZzf & 255);
                            ex5 ex5Var5 = ex5Var3;
                            bArrZzH[i14 + 1] = (byte) (iZzf >> 8);
                            i15 = 0;
                            while (i15 < i12 + i12) {
                                i16 = bArr[((i15 / 2) % 4) + ((i15 / 8) * i10 * 4) + i11] & 255;
                                if (i15 % 2 == 0) {
                                    i17 = i16 & 15;
                                } else {
                                    i17 = i16 >> 4;
                                }
                                int i212 = i17 & 7;
                                int i213 = (i212 + i212 + 1) * i13;
                                byte[] bArr3 = bArr;
                                i18 = i213 >> 3;
                                if ((i17 & 8) != 0) {
                                    i18 = -i18;
                                }
                                iZzf = zzel.zzf(iZzf + i18, -32768, 32767);
                                i14 = i10 + i10 + i14;
                                bArrZzH[i14] = (byte) (iZzf & 255);
                                bArrZzH[i14 + 1] = (byte) (iZzf >> 8);
                                iMin = zzel.zzf(iMin + m[i17], 0, 88);
                                i15++;
                                bArr = bArr3;
                                i13 = iArr[iMin];
                                z = z;
                            }
                            i9++;
                            ex5Var3 = ex5Var5;
                        }
                    }
                    i5++;
                }
                z2 = z;
                int i214 = i * i3;
                int i33 = (i214 + i214) * ex5Var.a;
                zzedVar.zzF(0);
                zzedVar.zzE(i33);
                this.i -= i3 * i6;
                int iZzd2 = zzedVar.zzd();
                zzaak.zzb(this.b, zzedVar, iZzd2);
                i7 = this.k + iZzd2;
                this.k = i7;
                i8 = ex5Var.a;
                if (i7 / (i8 + i8) >= i23) {
                    b(i23);
                }
            } else {
                z2 = z;
            }
            if (z2) {
                int i34 = this.k;
                int i35 = ex5Var.a;
                i4 = i34 / (i35 + i35);
                if (i4 > 0) {
                    b(i4);
                }
            }
            return z2;
            this.i += iZza;
        }
    }

    public final void b(int i) {
        long j = this.j;
        long j2 = this.l;
        ex5 ex5Var = this.c;
        long jZzw = zzel.zzw(j2, 1000000L, ex5Var.b);
        int i2 = (i + i) * ex5Var.a;
        this.b.zzs(j + jZzw, 1, i2, this.k - i2, null);
        this.l += (long) i;
        this.k -= i2;
    }

    @Override // defpackage.cx5
    public final void zza(int i, long j) {
        this.a.zzL(new hx5(this.c, this.d, i, j));
        this.b.zzk(this.h);
    }

    @Override // defpackage.cx5
    public final void zzb(long j) {
        this.i = 0;
        this.j = j;
        this.k = 0;
        this.l = 0L;
    }
}
