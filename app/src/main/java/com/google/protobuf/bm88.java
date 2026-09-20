package com.google.protobuf;

import defpackage.DY;
import defpackage.Md5A;
import defpackage.de5;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class bm88 {
    public static final CQf a;

    public static abstract class CQf {
        public abstract String a(byte[] bArr, int i, int i2);

        public abstract int b(CharSequence charSequence, byte[] bArr, int i, int i2);

        public abstract int c(int i, int i2, byte[] bArr);
    }

    public static final class F1 extends CQf {
        @Override // com.google.protobuf.bm88.CQf
        public final String a(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            int i3;
            int i4;
            if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            int i5 = i + i2;
            char[] cArr = new char[i2];
            int i6 = 0;
            while (i < i5) {
                byte b = bArr[i];
                if (!(b >= 0)) {
                    break;
                }
                i++;
                cArr[i6] = (char) b;
                i6++;
            }
            while (i < i5) {
                int i7 = i + 1;
                byte b2 = bArr[i];
                if (b2 >= 0) {
                    int i8 = i6 + 1;
                    cArr[i6] = (char) b2;
                    i = i7;
                    while (true) {
                        i6 = i8;
                        if (i >= i5) {
                            break;
                        }
                        byte b3 = bArr[i];
                        if (!(b3 >= 0)) {
                            break;
                        }
                        i++;
                        i8 = i6 + 1;
                        cArr[i6] = (char) b3;
                    }
                } else {
                    if (!(b2 < -32)) {
                        if (b2 < -16) {
                            if (i7 >= i5 - 1) {
                                throw InvalidProtocolBufferException.a();
                            }
                            int i9 = i7 + 1;
                            byte b4 = bArr[i7];
                            i3 = i9 + 1;
                            byte b5 = bArr[i9];
                            i4 = i6 + 1;
                            if (QnHx.a(b4) || ((b2 == -32 && b4 < -96) || ((b2 == -19 && b4 >= -96) || QnHx.a(b5)))) {
                                throw InvalidProtocolBufferException.a();
                            }
                            cArr[i6] = (char) (((b2 & 15) << 12) | ((b4 & 63) << 6) | (b5 & 63));
                        } else {
                            if (i7 >= i5 - 2) {
                                throw InvalidProtocolBufferException.a();
                            }
                            int i10 = i7 + 1;
                            byte b6 = bArr[i7];
                            int i11 = i10 + 1;
                            byte b7 = bArr[i10];
                            i3 = i11 + 1;
                            byte b8 = bArr[i11];
                            int i12 = i6 + 1;
                            if (QnHx.a(b6) || (((b6 + 112) + (b2 << 28)) >> 30) != 0 || QnHx.a(b7) || QnHx.a(b8)) {
                                throw InvalidProtocolBufferException.a();
                            }
                            int i13 = ((b2 & 7) << 18) | ((b6 & 63) << 12) | ((b7 & 63) << 6) | (b8 & 63);
                            cArr[i6] = (char) ((i13 >>> 10) + 55232);
                            cArr[i12] = (char) ((i13 & 1023) + 56320);
                            i4 = i12 + 1;
                        }
                        i = i3;
                        i6 = i4;
                    } else {
                        if (i7 >= i5) {
                            throw InvalidProtocolBufferException.a();
                        }
                        int i14 = i7 + 1;
                        byte b9 = bArr[i7];
                        int i15 = i6 + 1;
                        if (b2 < -62 || QnHx.a(b9)) {
                            throw InvalidProtocolBufferException.a();
                        }
                        cArr[i6] = (char) (((b2 & 31) << 6) | (b9 & 63));
                        i = i14;
                        i6 = i15;
                    }
                }
            }
            return new String(cArr, 0, i6);
        }

        @Override // com.google.protobuf.bm88.CQf
        public final int b(CharSequence charSequence, byte[] bArr, int i, int i2) {
            int i3;
            int i4;
            int i5;
            char cCharAt;
            int length = charSequence.length();
            int i6 = i2 + i;
            int i7 = 0;
            while (i7 < length && (i5 = i7 + i) < i6 && (cCharAt = charSequence.charAt(i7)) < 128) {
                bArr[i5] = (byte) cCharAt;
                i7++;
            }
            if (i7 == length) {
                return i + length;
            }
            int i8 = i + i7;
            while (i7 < length) {
                char cCharAt2 = charSequence.charAt(i7);
                if (cCharAt2 >= 128 || i8 >= i6) {
                    if (cCharAt2 < 2048 && i8 <= i6 - 2) {
                        int i9 = i8 + 1;
                        bArr[i8] = (byte) ((cCharAt2 >>> 6) | 960);
                        i8 = i9 + 1;
                        bArr[i9] = (byte) ((cCharAt2 & '?') | 128);
                    } else {
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i8 > i6 - 3) {
                            if (i8 > i6 - 4) {
                                if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i4 = i7 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i4)))) {
                                    throw new LPt8Fixed(i7, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i8);
                            }
                            int i10 = i7 + 1;
                            if (i10 != charSequence.length()) {
                                char cCharAt3 = charSequence.charAt(i10);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    int i11 = i8 + 1;
                                    bArr[i8] = (byte) ((codePoint >>> 18) | 240);
                                    int i12 = i11 + 1;
                                    bArr[i11] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i13 = i12 + 1;
                                    bArr[i12] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i8 = i13 + 1;
                                    bArr[i13] = (byte) ((codePoint & 63) | 128);
                                    i7 = i10;
                                } else {
                                    i7 = i10;
                                }
                            }
                            throw new LPt8Fixed(i7 - 1, length);
                        }
                        int i14 = i8 + 1;
                        bArr[i8] = (byte) ((cCharAt2 >>> '\f') | 480);
                        int i15 = i14 + 1;
                        bArr[i14] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                        i3 = i15 + 1;
                        bArr[i15] = (byte) ((cCharAt2 & '?') | 128);
                    }
                    i7++;
                } else {
                    i3 = i8 + 1;
                    bArr[i8] = (byte) cCharAt2;
                }
                i8 = i3;
                i7++;
            }
            return i8;
        }

        @Override // com.google.protobuf.bm88.CQf
        public final int c(int i, int i2, byte[] bArr) {
            while (i < i2 && bArr[i] >= 0) {
                i++;
            }
            if (i < i2) {
                while (i < i2) {
                    int i3 = i + 1;
                    byte b = bArr[i];
                    if (b < 0) {
                        if (b < -32) {
                            if (i3 >= i2) {
                                return b;
                            }
                            if (b >= -62) {
                                i = i3 + 1;
                                if (bArr[i3] > -65) {
                                }
                            }
                            return -1;
                        }
                        if (b < -16) {
                            if (i3 >= i2 - 1) {
                                return bm88.a(bArr, i3, i2);
                            }
                            int i4 = i3 + 1;
                            byte b2 = bArr[i3];
                            if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                                i = i4 + 1;
                                if (bArr[i4] > -65) {
                                }
                            }
                        } else {
                            if (i3 >= i2 - 2) {
                                return bm88.a(bArr, i3, i2);
                            }
                            int i5 = i3 + 1;
                            byte b3 = bArr[i3];
                            if (b3 <= -65) {
                                if ((((b3 + 112) + (b << 28)) >> 30) == 0) {
                                    int i6 = i5 + 1;
                                    if (bArr[i5] <= -65) {
                                        i3 = i6 + 1;
                                        if (bArr[i6] > -65) {
                                        }
                                    }
                                }
                            }
                        }
                        return -1;
                    }
                    i = i3;
                }
            }
            return 0;
        }
    }

    public static class LPt8Fixed extends IllegalArgumentException {
        public LPt8Fixed(int i, int i2) {
            super(Md5A.e("Unpaired surrogate at index ", i, " of ", i2));
        }
    }

    public static final class NUlFixed extends CQf {
        public static int d(long j, byte[] bArr, int i, int i2) {
            if (i2 == 0) {
                CQf cQf = bm88.a;
                if (i > -12) {
                    return -1;
                }
                return i;
            }
            if (i2 == 1) {
                return bm88.c(i, de5.h(bArr, j));
            }
            if (i2 == 2) {
                return bm88.d(i, de5.h(bArr, j), de5.h(bArr, j + 1));
            }
            throw new AssertionError();
        }

        @Override // com.google.protobuf.bm88.CQf
        public final String a(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            Charset charset = SjP.a;
            String str = new String(bArr, i, i2, charset);
            if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
                throw InvalidProtocolBufferException.a();
            }
            return str;
        }

        @Override // com.google.protobuf.bm88.CQf
        public final int b(CharSequence charSequence, byte[] bArr, int i, int i2) {
            long j;
            char c;
            long j2;
            int i3;
            long j3;
            long j4;
            char cCharAt;
            long j5 = i;
            long j6 = ((long) i2) + j5;
            int length = charSequence.length();
            if (length > i2 || bArr.length - i2 < i) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i + i2));
            }
            int i4 = 0;
            while (true) {
                j = 1;
                c = 128;
                if (i4 >= length || (cCharAt = charSequence.charAt(i4)) >= 128) {
                    break;
                }
                de5.r(bArr, j5, (byte) cCharAt);
                i4++;
                j5 = 1 + j5;
            }
            if (i4 == length) {
                return (int) j5;
            }
            while (i4 < length) {
                char cCharAt2 = charSequence.charAt(i4);
                if (cCharAt2 >= c || j5 >= j6) {
                    if (cCharAt2 < 2048 && j5 <= j6 - 2) {
                        long j7 = j5 + j;
                        de5.r(bArr, j5, (byte) ((cCharAt2 >>> 6) | 960));
                        de5.r(bArr, j7, (byte) ((cCharAt2 & '?') | 128));
                        j4 = j7 + j;
                        j3 = j;
                    } else {
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j5 > j6 - 3) {
                            if (j5 > j6 - 4) {
                                if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i3)))) {
                                    throw new LPt8Fixed(i4, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j5);
                            }
                            int i5 = i4 + 1;
                            if (i5 != length) {
                                char cCharAt3 = charSequence.charAt(i5);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    long j8 = j5 + 1;
                                    de5.r(bArr, j5, (byte) ((codePoint >>> 18) | 240));
                                    long j9 = j8 + 1;
                                    de5.r(bArr, j8, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j10 = j9 + 1;
                                    de5.r(bArr, j9, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j3 = 1;
                                    j4 = j10 + 1;
                                    de5.r(bArr, j10, (byte) ((codePoint & 63) | 128));
                                    i4 = i5;
                                } else {
                                    i4 = i5;
                                }
                            }
                            throw new LPt8Fixed(i4 - 1, length);
                        }
                        long j11 = j5 + j;
                        de5.r(bArr, j5, (byte) ((cCharAt2 >>> '\f') | 480));
                        long j12 = j11 + j;
                        de5.r(bArr, j11, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                        de5.r(bArr, j12, (byte) ((cCharAt2 & '?') | 128));
                        j2 = j12 + 1;
                    }
                    i4++;
                    c = 128;
                    long j13 = j3;
                    j5 = j4;
                    j = j13;
                } else {
                    j2 = j5 + j;
                    de5.r(bArr, j5, (byte) cCharAt2);
                }
                j4 = j2;
                j3 = 1;
                i4++;
                c = 128;
                long j14 = j3;
                j5 = j4;
                j = j14;
            }
            return (int) j5;
        }

        @Override // com.google.protobuf.bm88.CQf
        public final int c(int i, int i2, byte[] bArr) {
            int i3;
            long j;
            if ((i | i2 | (bArr.length - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            long j2 = i;
            int i4 = (int) (((long) i2) - j2);
            if (i4 >= 16) {
                int i5 = 8 - (((int) j2) & 7);
                long j3 = j2;
                i3 = 0;
                while (true) {
                    if (i3 >= i5) {
                        while (true) {
                            int i6 = i3 + 8;
                            if (i6 > i4 || (de5.n(de5.f + j3, bArr) & (-9187201950435737472L)) != 0) {
                                break;
                            }
                            j3 += 8;
                            i3 = i6;
                        }
                        while (true) {
                            if (i3 >= i4) {
                                i3 = i4;
                                break;
                            }
                            long j4 = j3 + 1;
                            if (de5.h(bArr, j3) < 0) {
                                break;
                            }
                            i3++;
                            j3 = j4;
                        }
                    } else {
                        long j5 = j3 + 1;
                        if (de5.h(bArr, j3) < 0) {
                            break;
                        }
                        i3++;
                        j3 = j5;
                    }
                }
            } else {
                i3 = 0;
            }
            int i7 = i4 - i3;
            long j6 = j2 + ((long) i3);
            while (true) {
                byte bH = 0;
                while (i7 > 0) {
                    long j7 = j6 + 1;
                    bH = de5.h(bArr, j6);
                    if (bH < 0) {
                        j6 = j7;
                        break;
                    }
                    i7--;
                    j6 = j7;
                }
                if (i7 != 0) {
                    int i8 = i7 - 1;
                    if (bH >= -32) {
                        if (bH >= -16) {
                            if (i8 >= 3) {
                                i7 = i8 - 3;
                                long j8 = j6 + 1;
                                byte bH2 = de5.h(bArr, j6);
                                if (bH2 <= -65 && (((bH2 + 112) + (bH << 28)) >> 30) == 0) {
                                    long j9 = j8 + 1;
                                    if (de5.h(bArr, j8) > -65) {
                                        break;
                                    }
                                    j = j9 + 1;
                                    if (de5.h(bArr, j9) > -65) {
                                        break;
                                    }
                                    j6 = j;
                                } else {
                                    break;
                                }
                            } else {
                                return d(j6, bArr, bH, i8);
                            }
                        } else {
                            if (i8 < 2) {
                                return d(j6, bArr, bH, i8);
                            }
                            i7 = i8 - 2;
                            long j10 = j6 + 1;
                            byte bH3 = de5.h(bArr, j6);
                            if (bH3 > -65 || ((bH == -32 && bH3 < -96) || (bH == -19 && bH3 >= -96))) {
                                break;
                            }
                            j6 = j10 + 1;
                            if (de5.h(bArr, j10) > -65) {
                                break;
                            }
                        }
                    } else if (i8 != 0) {
                        i7 = i8 - 1;
                        if (bH < -62) {
                            break;
                        }
                        j = j6 + 1;
                        if (de5.h(bArr, j6) > -65) {
                            break;
                        }
                        j6 = j;
                    } else {
                        return bH;
                    }
                } else {
                    return 0;
                }
            }
            return -1;
        }
    }

    public static class QnHx {
        public static boolean a(byte b) {
            return b > -65;
        }
    }

    static {
        a = (!(de5.e && de5.d) || DY.a()) ? new F1() : new NUlFixed();
    }

    public static int a(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b > -12) {
                b = -1;
            }
            return b;
        }
        if (i3 == 1) {
            return c(b, bArr[i]);
        }
        if (i3 == 2) {
            return d(b, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    public static int b(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (i2 < length) {
            char cCharAt = charSequence.charAt(i2);
            if (cCharAt >= 2048) {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char cCharAt2 = charSequence.charAt(i2);
                    if (cCharAt2 < 2048) {
                        i += (127 - cCharAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) < 65536) {
                                throw new LPt8Fixed(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
                break;
            }
            i3 += (127 - cCharAt) >>> 31;
            i2++;
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i3) + 4294967296L));
    }

    public static int c(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static int d(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }
}
