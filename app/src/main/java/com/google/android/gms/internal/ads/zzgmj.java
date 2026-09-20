package com.google.android.gms.internal.ads;

import defpackage.vs6;
import defpackage.ym;
import java.security.InvalidKeyException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgmj {
    public static byte[] zza(byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        long[] jArr = new long[11];
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 32);
        int i = 0;
        bArrCopyOf[0] = (byte) (bArrCopyOf[0] & 248);
        int i2 = bArrCopyOf[31] & 127;
        bArrCopyOf[31] = (byte) i2;
        bArrCopyOf[31] = (byte) (i2 | 64);
        if (bArr2.length != 32) {
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        byte[] bArrCopyOf2 = Arrays.copyOf(bArr2, 32);
        bArrCopyOf2[31] = (byte) (bArrCopyOf2[31] & 127);
        for (int i3 = 0; i3 < 7; i3++) {
            byte[][] bArr3 = vs6.a;
            if (zzgle.zzb(bArr3[i3], bArrCopyOf2)) {
                throw new InvalidKeyException("Banned public key: ".concat(zzglz.zza(bArr3[i3])));
            }
        }
        int i4 = 10;
        long[] jArr2 = new long[10];
        for (int i5 = 0; i5 < 10; i5++) {
            int i6 = ym.I[i5];
            jArr2[i5] = (((((long) (bArrCopyOf2[i6 + 3] & 255)) << 24) | ((((long) (bArrCopyOf2[i6] & 255)) | (((long) (bArrCopyOf2[i6 + 1] & 255)) << 8)) | (((long) (bArrCopyOf2[i6 + 2] & 255)) << 16))) >> ym.J[i5]) & ((long) ym.K[i5 & 1]);
        }
        long[] jArr3 = new long[19];
        long[] jArr4 = new long[19];
        jArr4[0] = 1;
        long[] jArr5 = new long[19];
        jArr5[0] = 1;
        long[] jArr6 = new long[19];
        long[] jArr7 = new long[19];
        long[] jArr8 = new long[19];
        jArr8[0] = 1;
        long[] jArr9 = new long[19];
        long[] jArr10 = new long[19];
        jArr10[0] = 1;
        System.arraycopy(jArr2, 0, jArr3, 0, 10);
        int i7 = 0;
        while (i7 < 32) {
            int i8 = bArrCopyOf[(32 - i7) - 1] & 255;
            int i9 = 8;
            while (i < i9) {
                int i10 = (i8 >> (7 - i)) & 1;
                vs6.a(jArr5, jArr3, i10);
                vs6.a(jArr6, jArr4, i10);
                byte[] bArr4 = bArrCopyOf;
                long[] jArrCopyOf = Arrays.copyOf(jArr5, i4);
                int i11 = i8;
                long[] jArr11 = new long[19];
                long[] jArr12 = jArr;
                long[] jArr13 = new long[19];
                int i12 = i7;
                long[] jArr14 = new long[19];
                int i13 = i;
                long[] jArr15 = new long[19];
                long[] jArr16 = new long[19];
                long[] jArr17 = jArr10;
                long[] jArr18 = new long[19];
                long[] jArr19 = new long[19];
                ym.o(jArr5, jArr5, jArr6);
                ym.n(jArr6, jArrCopyOf, jArr6);
                long[] jArrCopyOf2 = Arrays.copyOf(jArr3, 10);
                ym.o(jArr3, jArr3, jArr4);
                ym.n(jArr4, jArrCopyOf2, jArr4);
                ym.j(jArr15, jArr3, jArr6);
                ym.j(jArr16, jArr5, jArr4);
                ym.l(jArr15);
                ym.k(jArr15);
                ym.l(jArr16);
                ym.k(jArr16);
                long[] jArr20 = jArr3;
                System.arraycopy(jArr15, 0, jArrCopyOf2, 0, 10);
                ym.o(jArr15, jArr15, jArr16);
                ym.n(jArr16, jArrCopyOf2, jArr16);
                ym.m(jArr19, jArr15);
                ym.m(jArr18, jArr16);
                ym.j(jArr16, jArr18, jArr2);
                ym.l(jArr16);
                ym.k(jArr16);
                System.arraycopy(jArr19, 0, jArr7, 0, 10);
                System.arraycopy(jArr16, 0, jArr8, 0, 10);
                ym.m(jArr13, jArr5);
                ym.m(jArr14, jArr6);
                ym.j(jArr9, jArr13, jArr14);
                ym.l(jArr9);
                ym.k(jArr9);
                ym.n(jArr14, jArr13, jArr14);
                Arrays.fill(jArr11, 10, 18, 0L);
                int i14 = 0;
                for (int i15 = 10; i14 < i15; i15 = 10) {
                    jArr11[i14] = jArr14[i14] * 121665;
                    i14++;
                }
                ym.k(jArr11);
                ym.o(jArr11, jArr11, jArr13);
                ym.j(jArr17, jArr14, jArr11);
                ym.l(jArr17);
                ym.k(jArr17);
                vs6.a(jArr9, jArr7, i10);
                vs6.a(jArr17, jArr8, i10);
                i = i13 + 1;
                jArr3 = jArr7;
                i8 = i11;
                bArrCopyOf = bArr4;
                jArr = jArr12;
                i7 = i12;
                jArr7 = jArr20;
                i4 = 10;
                i9 = 8;
                long[] jArr21 = jArr6;
                jArr6 = jArr17;
                jArr10 = jArr21;
                long[] jArr22 = jArr5;
                jArr5 = jArr9;
                jArr9 = jArr22;
                long[] jArr23 = jArr4;
                jArr4 = jArr8;
                jArr8 = jArr23;
            }
            i7++;
            i = 0;
            i4 = 10;
        }
        long[] jArr24 = jArr;
        long[] jArr25 = new long[10];
        long[] jArr26 = new long[10];
        long[] jArr27 = new long[10];
        long[] jArr28 = new long[10];
        long[] jArr29 = new long[10];
        long[] jArr30 = new long[10];
        long[] jArr31 = new long[10];
        long[] jArr32 = new long[10];
        long[] jArr33 = new long[10];
        long[] jArr34 = new long[10];
        long[] jArr35 = jArr3;
        long[] jArr36 = new long[10];
        ym.m(jArr26, jArr6);
        ym.m(jArr36, jArr26);
        ym.m(jArr34, jArr36);
        ym.i(jArr27, jArr34, jArr6);
        ym.i(jArr28, jArr27, jArr26);
        ym.m(jArr34, jArr28);
        ym.i(jArr29, jArr34, jArr27);
        ym.m(jArr34, jArr29);
        ym.m(jArr36, jArr34);
        ym.m(jArr34, jArr36);
        ym.m(jArr36, jArr34);
        ym.m(jArr34, jArr36);
        ym.i(jArr30, jArr34, jArr29);
        ym.m(jArr34, jArr30);
        ym.m(jArr36, jArr34);
        for (int i16 = 2; i16 < 10; i16 += 2) {
            ym.m(jArr34, jArr36);
            ym.m(jArr36, jArr34);
        }
        ym.i(jArr31, jArr36, jArr30);
        ym.m(jArr34, jArr31);
        ym.m(jArr36, jArr34);
        for (int i17 = 2; i17 < 20; i17 += 2) {
            ym.m(jArr34, jArr36);
            ym.m(jArr36, jArr34);
        }
        ym.i(jArr34, jArr36, jArr31);
        ym.m(jArr36, jArr34);
        ym.m(jArr34, jArr36);
        for (int i18 = 2; i18 < 10; i18 += 2) {
            ym.m(jArr36, jArr34);
            ym.m(jArr34, jArr36);
        }
        ym.i(jArr32, jArr34, jArr30);
        ym.m(jArr34, jArr32);
        ym.m(jArr36, jArr34);
        for (int i19 = 2; i19 < 50; i19 += 2) {
            ym.m(jArr34, jArr36);
            ym.m(jArr36, jArr34);
        }
        ym.i(jArr33, jArr36, jArr32);
        ym.m(jArr36, jArr33);
        ym.m(jArr34, jArr36);
        for (int i20 = 2; i20 < 100; i20 += 2) {
            ym.m(jArr36, jArr34);
            ym.m(jArr34, jArr36);
        }
        ym.i(jArr36, jArr34, jArr33);
        ym.m(jArr34, jArr36);
        ym.m(jArr36, jArr34);
        for (int i21 = 2; i21 < 50; i21 += 2) {
            ym.m(jArr34, jArr36);
            ym.m(jArr36, jArr34);
        }
        ym.i(jArr34, jArr36, jArr32);
        ym.m(jArr36, jArr34);
        ym.m(jArr34, jArr36);
        ym.m(jArr36, jArr34);
        ym.m(jArr34, jArr36);
        ym.m(jArr36, jArr34);
        ym.i(jArr25, jArr36, jArr28);
        ym.i(jArr24, jArr5, jArr25);
        long[] jArr37 = new long[10];
        long[] jArr38 = new long[10];
        long[] jArr39 = new long[11];
        long[] jArr40 = new long[11];
        long[] jArr41 = new long[11];
        ym.i(jArr37, jArr2, jArr24);
        ym.o(jArr38, jArr2, jArr24);
        long[] jArr42 = new long[10];
        jArr42[0] = 486662;
        ym.o(jArr40, jArr38, jArr42);
        ym.i(jArr40, jArr40, jArr4);
        ym.o(jArr40, jArr40, jArr35);
        ym.i(jArr40, jArr40, jArr37);
        ym.i(jArr40, jArr40, jArr35);
        for (int i22 = 0; i22 < 10; i22++) {
            jArr39[i22] = jArr40[i22] * 4;
        }
        ym.k(jArr39);
        ym.i(jArr40, jArr37, jArr4);
        ym.n(jArr40, jArr40, jArr4);
        ym.i(jArr41, jArr38, jArr35);
        ym.o(jArr40, jArr40, jArr41);
        ym.m(jArr40, jArr40);
        if (zzgle.zzb(ym.p(jArr39), ym.p(jArr40))) {
            return ym.p(jArr24);
        }
        throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: ".concat(zzglz.zza(bArr2)));
    }

    public static byte[] zzb() {
        byte[] bArrZza = zzgmg.zza(32);
        bArrZza[0] = (byte) (bArrZza[0] | 7);
        int i = bArrZza[31] & 63;
        bArrZza[31] = (byte) i;
        bArrZza[31] = (byte) (i | 128);
        return bArrZza;
    }

    public static byte[] zzc(byte[] bArr) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        byte[] bArr2 = new byte[32];
        bArr2[0] = 9;
        return zza(bArr, bArr2);
    }
}
