package defpackage;

import com.google.android.gms.internal.measurement.kK;
import com.google.android.gms.internal.measurement.zzko;

/* JADX INFO: loaded from: classes3.dex */
public final class bz6 {
    public static int a(byte[] bArr, int i, at6 at6Var) throws zzko {
        int iJ = j(bArr, i, at6Var);
        int i2 = at6Var.a;
        if (i2 < 0) {
            throw zzko.b();
        }
        if (i2 > bArr.length - iJ) {
            throw zzko.d();
        }
        if (i2 == 0) {
            at6Var.c = a07.x;
            return iJ;
        }
        at6Var.c = a07.p(bArr, iJ, i2);
        return iJ + i2;
    }

    public static int b(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int c(y37 y37Var, byte[] bArr, int i, int i2, int i3, at6 at6Var) {
        kK kKVar = (kK) y37Var;
        Object objZze = kKVar.zze();
        int iT = kKVar.t(objZze, bArr, i, i2, i3, at6Var);
        kKVar.zzf(objZze);
        at6Var.c = objZze;
        return iT;
    }

    public static int d(y37 y37Var, byte[] bArr, int i, int i2, at6 at6Var) throws zzko {
        int iK = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iK = k(i3, bArr, iK, at6Var);
            i3 = at6Var.a;
        }
        int i4 = iK;
        if (i3 < 0 || i3 > i2 - i4) {
            throw zzko.d();
        }
        Object objZze = y37Var.zze();
        int i5 = i3 + i4;
        y37Var.d(objZze, bArr, i4, i5, at6Var);
        y37Var.zzf(objZze);
        at6Var.c = objZze;
        return i5;
    }

    public static int e(y37 y37Var, int i, byte[] bArr, int i2, int i3, d27 d27Var, at6 at6Var) throws zzko {
        int iD = d(y37Var, bArr, i2, i3, at6Var);
        d27Var.add(at6Var.c);
        while (iD < i3) {
            int iJ = j(bArr, iD, at6Var);
            if (i != at6Var.a) {
                break;
            }
            iD = d(y37Var, bArr, iJ, i3, at6Var);
            d27Var.add(at6Var.c);
        }
        return iD;
    }

    public static int f(byte[] bArr, int i, d27 d27Var, at6 at6Var) throws zzko {
        s17 s17Var = (s17) d27Var;
        int iJ = j(bArr, i, at6Var);
        int i2 = at6Var.a + iJ;
        while (iJ < i2) {
            iJ = j(bArr, iJ, at6Var);
            s17Var.zzh(at6Var.a);
        }
        if (iJ == i2) {
            return iJ;
        }
        throw zzko.d();
    }

    public static int g(byte[] bArr, int i, at6 at6Var) throws zzko {
        int iJ = j(bArr, i, at6Var);
        int i2 = at6Var.a;
        if (i2 < 0) {
            throw zzko.b();
        }
        if (i2 == 0) {
            at6Var.c = "";
            return iJ;
        }
        at6Var.c = new String(bArr, iJ, i2, f27.a);
        return iJ + i2;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b3 A[PHI: r12
  0x00b3: PHI (r12v20 byte) = (r12v19 byte), (r12v27 byte) binds: [B:57:0x00ad, B:59:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x00b9  */
    public static int h(byte[] bArr, int i, at6 at6Var) throws zzko {
        int iJ = j(bArr, i, at6Var);
        int i2 = at6Var.a;
        if (i2 < 0) {
            throw zzko.b();
        }
        if (i2 == 0) {
            at6Var.c = "";
            return iJ;
        }
        p57 p57Var = s57.a;
        int length = bArr.length;
        if ((iJ | i2 | ((length - iJ) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iJ), Integer.valueOf(i2)));
        }
        int i3 = iJ + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (iJ < i3) {
            byte b = bArr[iJ];
            if (!(b >= 0)) {
                break;
            }
            iJ++;
            cArr[i4] = (char) b;
            i4++;
        }
        while (iJ < i3) {
            int i5 = iJ + 1;
            byte b2 = bArr[iJ];
            if (b2 >= 0) {
                int i6 = i4 + 1;
                cArr[i4] = (char) b2;
                iJ = i5;
                while (true) {
                    i4 = i6;
                    if (iJ >= i3) {
                        break;
                    }
                    byte b3 = bArr[iJ];
                    if (!(b3 >= 0)) {
                        break;
                    }
                    iJ++;
                    i6 = i4 + 1;
                    cArr[i4] = (char) b3;
                }
            } else if (b2 < -32) {
                if (i5 >= i3) {
                    throw zzko.a();
                }
                int i7 = i5 + 1;
                int i8 = i4 + 1;
                byte b4 = bArr[i5];
                if (b2 < -62 || Th.b0(b4)) {
                    throw zzko.a();
                }
                cArr[i4] = (char) (((b2 & 31) << 6) | (b4 & 63));
                iJ = i7;
                i4 = i8;
            } else {
                if (b2 < -16) {
                    if (i5 >= i3 - 1) {
                        throw zzko.a();
                    }
                    int i9 = i5 + 1;
                    int i10 = i9 + 1;
                    int i11 = i4 + 1;
                    byte b5 = bArr[i5];
                    byte b6 = bArr[i9];
                    if (!Th.b0(b5)) {
                        if (b2 != -32) {
                            if (b2 != -19) {
                                if (!Th.b0(b6)) {
                                    cArr[i4] = (char) (((b2 & 15) << 12) | ((b5 & 63) << 6) | (b6 & 63));
                                    iJ = i10;
                                    i4 = i11;
                                }
                            } else if (b5 < -96) {
                                b2 = -19;
                                if (!Th.b0(b6)) {
                                    cArr[i4] = (char) (((b2 & 15) << 12) | ((b5 & 63) << 6) | (b6 & 63));
                                    iJ = i10;
                                    i4 = i11;
                                }
                            }
                        } else if (b5 >= -96) {
                            b2 = -32;
                            if (b2 != -19) {
                                if (!Th.b0(b6)) {
                                    cArr[i4] = (char) (((b2 & 15) << 12) | ((b5 & 63) << 6) | (b6 & 63));
                                    iJ = i10;
                                    i4 = i11;
                                }
                            } else if (b5 < -96) {
                                b2 = -19;
                                if (!Th.b0(b6)) {
                                    cArr[i4] = (char) (((b2 & 15) << 12) | ((b5 & 63) << 6) | (b6 & 63));
                                    iJ = i10;
                                    i4 = i11;
                                }
                            }
                        }
                    }
                    throw zzko.a();
                }
                if (i5 >= i3 - 2) {
                    throw zzko.a();
                }
                int i12 = i5 + 1;
                int i13 = i12 + 1;
                int i14 = i13 + 1;
                byte b7 = bArr[i5];
                byte b8 = bArr[i12];
                byte b9 = bArr[i13];
                if (Th.b0(b7) || (((b7 + 112) + (b2 << 28)) >> 30) != 0 || Th.b0(b8) || Th.b0(b9)) {
                    throw zzko.a();
                }
                int i15 = ((b2 & 7) << 18) | ((b7 & 63) << 12) | ((b8 & 63) << 6) | (b9 & 63);
                cArr[i4] = (char) ((i15 >>> 10) + 55232);
                cArr[i4 + 1] = (char) ((i15 & 1023) + 56320);
                i4 += 2;
                iJ = i14;
            }
        }
        at6Var.c = new String(cArr, 0, i4);
        return i3;
    }

    public static int i(int i, byte[] bArr, int i2, int i3, n47 n47Var, at6 at6Var) throws zzko {
        if ((i >>> 3) == 0) {
            throw new zzko("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iM = m(bArr, i2, at6Var);
            n47Var.c(i, Long.valueOf(at6Var.b));
            return iM;
        }
        if (i4 == 1) {
            n47Var.c(i, Long.valueOf(n(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iJ = j(bArr, i2, at6Var);
            int i5 = at6Var.a;
            if (i5 < 0) {
                throw zzko.b();
            }
            if (i5 > bArr.length - iJ) {
                throw zzko.d();
            }
            if (i5 == 0) {
                n47Var.c(i, a07.x);
            } else {
                n47Var.c(i, a07.p(bArr, iJ, i5));
            }
            return iJ + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new zzko("Protocol message contained an invalid tag (zero).");
            }
            n47Var.c(i, Integer.valueOf(b(bArr, i2)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        n47 n47VarB = n47.b();
        int i7 = 0;
        while (i2 < i3) {
            int iJ2 = j(bArr, i2, at6Var);
            int i8 = at6Var.a;
            if (i8 == i6) {
                i7 = i8;
                i2 = iJ2;
                break;
            }
            i7 = i8;
            i2 = i(i8, bArr, iJ2, i3, n47VarB, at6Var);
        }
        if (i2 > i3 || i7 != i6) {
            throw zzko.c();
        }
        n47Var.c(i, n47VarB);
        return i2;
    }

    public static int j(byte[] bArr, int i, at6 at6Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return k(b, bArr, i2, at6Var);
        }
        at6Var.a = b;
        return i2;
    }

    public static int k(int i, byte[] bArr, int i2, at6 at6Var) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            at6Var.a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & 127) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            at6Var.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            at6Var.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            at6Var.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                at6Var.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int l(int i, byte[] bArr, int i2, int i3, d27 d27Var, at6 at6Var) {
        s17 s17Var = (s17) d27Var;
        int iJ = j(bArr, i2, at6Var);
        s17Var.zzh(at6Var.a);
        while (iJ < i3) {
            int iJ2 = j(bArr, iJ, at6Var);
            if (i != at6Var.a) {
                break;
            }
            iJ = j(bArr, iJ2, at6Var);
            s17Var.zzh(at6Var.a);
        }
        return iJ;
    }

    public static int m(byte[] bArr, int i, at6 at6Var) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            at6Var.b = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & 127)) << i4;
            b = b2;
            i3 = i5;
        }
        at6Var.b = j2;
        return i3;
    }

    public static long n(int i, byte[] bArr) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }
}
