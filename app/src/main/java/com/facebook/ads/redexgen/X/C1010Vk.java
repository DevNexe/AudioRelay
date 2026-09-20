package com.facebook.ads.redexgen.X;

import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.metadata.id3.ApicFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.BinaryFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.ChapterFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.ChapterTocFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.CommentFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.GeobFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.Id3Frame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.PrivFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.TextInformationFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.UrlLinkFrame;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1010Vk implements EG {
    public static byte[] A01;
    public static String[] A02 = {"sMUxEv8h1aqUKtOfXRhWvF4cd3jhCIiv", "2", "jdWxaIwDf600E5fQi1jvtrBwOfx6AZo5", "VxysSZONWs4Fbmb", "6vXrI6nW4BVssue1T84qDnzAdKjaXJyK", "dpBJthFwlwkteZKALF9GwsW9kwjpNbjg", "2vyk08U", "E"};
    public static final int A03;
    public static final ES A04;

    @Nullable
    public final ES A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static ChapterFrame A06(C0679Ij c0679Ij, int i, int i2, boolean z, int i3, @Nullable ES es) throws UnsupportedEncodingException {
        int iA06 = c0679Ij.A06();
        int iA02 = A02(c0679Ij.A00, iA06);
        String str = new String(c0679Ij.A00, iA06, iA02 - iA06, A0I(169, 10, 52));
        c0679Ij.A0Y(iA02 + 1);
        int iA08 = c0679Ij.A08();
        int iA09 = c0679Ij.A08();
        long jA0M = c0679Ij.A0M();
        if (jA0M == 4294967295L) {
            jA0M = -1;
        }
        long jA0M2 = c0679Ij.A0M();
        if (jA0M2 == 4294967295L) {
            jA0M2 = -1;
        }
        ArrayList arrayList = new ArrayList();
        int i4 = iA06 + i;
        while (c0679Ij.A06() < i4) {
            Id3Frame id3FrameA0B = A0B(i2, c0679Ij, z, i3, es);
            if (id3FrameA0B != null) {
                arrayList.add(id3FrameA0B);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterFrame(str, iA08, iA09, jA0M, jA0M2, id3FrameArr);
    }

    public static String A0I(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 106);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0L() {
        A01 = new byte[]{-4, 58, -4, 58, -4, 58, -103, -41, -103, -41, -103, -41, -103, -41, -51, -63, 7, 19, 2, 14, 6, -12, 10, 27, 6, -34, 38, 67, 86, 67, 2, 86, 81, 81, 2, 85, 74, 81, 84, 86, 2, 86, 81, 2, 68, 71, 2, 67, 80, 2, 43, 38, 21, 2, 86, 67, 73, 16, 43, 51, 54, 47, 46, -22, 62, 57, -22, 46, 47, 45, 57, 46, 47, -22, 48, 60, 43, 55, 47, 4, -22, 51, 46, 7, -78, -51, -43, -40, -47, -48, -116, -32, -37, -116, -30, -51, -40, -43, -48, -51, -32, -47, -116, -75, -80, -97, -116, -32, -51, -45, -116, -29, -43, -32, -44, -116, -39, -51, -42, -37, -34, -62, -47, -34, -33, -43, -37, -38, -87, -38, 6, -11, 1, -7, -76, 7, -3, 14, -7, -76, -7, 12, -9, -7, -7, -8, 7, -76, 6, -7, 1, -11, -3, 2, -3, 2, -5, -76, 8, -11, -5, -76, -8, -11, 8, -11, 10, 5, -12, -25, -15, -19, -53, -42, -42, -45, -41, -53, -49, 37, 64, 15, 32, 65, 63, 75, 64, 65, 78, -19, 5, 3, 10, 10, -1, -2, -70, -29, -34, -51, -70, 14, -5, 1, -70, 17, 3, 14, 2, -70, 7, -5, 4, 9, 12, -16, -1, 12, 13, 3, 9, 8, -41, -52, -70, -5, 8, -2, -70, 15, 8, -2, -1, 0, 3, 8, -1, -2, -70, -3, 9, 7, 10, 12, -1, 13, 13, 3, 9, 8, -70, 13, -3, 2, -1, 7, -1, -25, -1, -3, 4, 4, -7, -8, -76, -35, -40, -57, -76, 8, -11, -5, -76, 11, -3, 8, -4, -76, 9, 2, 7, 9, 4, 4, 3, 6, 8, -7, -8, -76, 1, -11, -2, 3, 6, -22, -7, 6, 7, -3, 3, 2, -47, 49, 73, 71, 78, 78, 71, 76, 69, -2, 83, 76, 81, 83, 78, 78, 77, 80, 82, 67, 66, -2, 65, 77, 75, 78, 80, 67, 81, 81, 67, 66, -2, 77, 80, -2, 67, 76, 65, 80, 87, 78, 82, 67, 66, -2, 68, 80, 63, 75, 67, 20, 24, 24, 24, -60, -61, -75, -100, -96, -91, -61, -62, -76, -101, -97, -92, -80, -77, 59, 58, 44, 19, 30, 38, 63, 54, 73, 65, 54, 52, 69, 54, 53, -15, 55, 58, 67, 68, 69, -15, 69, 57, 67, 54, 54, -15, 51, 74, 69, 54, 68, -15, 64, 55, -15, 26, 21, 4, -15, 69, 50, 56, -15, 57, 54, 50, 53, 54, 67, 11, -15, -18, 7, 12, 14, 9, 9, 8, 11, 13, -2, -3, -71, -4, 1, -6, 11, -6, -4, 13, -2, 11, -71, -2, 7, -4, 8, -3, 2, 7, 0, -47, -46, -46, -46, 18, 22, 10, 16, 14, -40, -4, 0, -12, -6, -8, -62, -3, 3, -8, -6, -31, -27, -39, -33, -35, -89, -30, -24, -33};
    }

    static {
        A0L();
        A04 = new C1011Vl();
        A03 = C0695Iz.A08(A0I(166, 3, 87));
    }

    public C1010Vk() {
        this(null);
    }

    public C1010Vk(@Nullable ES es) {
        this.A00 = es;
    }

    public static int A00(int i) {
        if (i == 0 || i == 3) {
            return 1;
        }
        return 2;
    }

    public static int A01(C0679Ij c0679Ij, int i) {
        byte[] bArr = c0679Ij.A00;
        for (int iA06 = c0679Ij.A06(); iA06 + 1 < i; iA06++) {
            if ((bArr[iA06] & 255) == 255 && bArr[iA06 + 1] == 0) {
                System.arraycopy(bArr, iA06 + 2, bArr, iA06 + 1, (i - iA06) - 2);
                i--;
            }
        }
        return i;
    }

    public static int A02(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static int A03(byte[] bArr, int i, int i2) {
        int iA02 = A02(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return iA02;
        }
        while (iA02 < bArr.length - 1) {
            if (iA02 % 2 == 0 && bArr[iA02 + 1] == 0) {
                return iA02;
            }
            iA02 = A02(bArr, iA02 + 1);
        }
        return bArr.length;
    }

    public static ApicFrame A04(C0679Ij c0679Ij, int i, int i2) throws UnsupportedEncodingException {
        int iA02;
        String strA0M;
        int iA0E = c0679Ij.A0E();
        String strA0H = A0H(iA0E);
        byte[] bArr = new byte[i - 1];
        c0679Ij.A0c(bArr, 0, i - 1);
        String strA0I = A0I(458, 6, 63);
        String strA0I2 = A0I(169, 10, 52);
        if (i2 == 2) {
            iA02 = 2;
            strA0M = strA0I + C0695Iz.A0M(new String(bArr, 0, 3, strA0I2));
            if (A0I(474, 9, 14).equals(strA0M)) {
                strA0M = A0I(464, 10, 41);
            }
        } else {
            iA02 = A02(bArr, 0);
            strA0M = C0695Iz.A0M(new String(bArr, 0, iA02, strA0I2));
            if (strA0M.indexOf(47) == -1) {
                strA0M = strA0I + strA0M;
            }
        }
        int encoding = bArr[iA02 + 1] & 255;
        int i3 = iA02 + 2;
        int iA03 = A03(bArr, i3, iA0E);
        int descriptionEndIndex = iA03 - i3;
        String str = new String(bArr, i3, descriptionEndIndex, strA0H);
        int iA00 = A00(iA0E) + iA03;
        int descriptionEndIndex2 = bArr.length;
        byte[] pictureData = A0N(bArr, iA00, descriptionEndIndex2);
        return new ApicFrame(strA0M, str, encoding, pictureData);
    }

    public static BinaryFrame A05(C0679Ij c0679Ij, int i, String str) {
        byte[] bArr = new byte[i];
        c0679Ij.A0c(bArr, 0, i);
        return new BinaryFrame(str, bArr);
    }

    public static ChapterTocFrame A07(C0679Ij c0679Ij, int framePosition, int elementIdEndIndex, boolean z, int i, @Nullable ES es) throws UnsupportedEncodingException {
        int iA06 = c0679Ij.A06();
        int iA02 = A02(c0679Ij.A00, iA06);
        String strA0I = A0I(169, 10, 52);
        String str = new String(c0679Ij.A00, iA06, iA02 - iA06, strA0I);
        c0679Ij.A0Y(iA02 + 1);
        int iA0E = c0679Ij.A0E();
        boolean z2 = (iA0E & 2) != 0;
        boolean z3 = (iA0E & 1) != 0;
        int ctocFlags = c0679Ij.A0E();
        String[] strArr = new String[ctocFlags];
        for (int childCount = 0; childCount < ctocFlags; childCount++) {
            int iA07 = c0679Ij.A06();
            int i2 = A02(c0679Ij.A00, iA07);
            strArr[childCount] = new String(c0679Ij.A00, iA07, i2 - iA07, strA0I);
            int startIndex = i2 + 1;
            c0679Ij.A0Y(startIndex);
        }
        ArrayList arrayList = new ArrayList();
        int i3 = iA06 + framePosition;
        while (c0679Ij.A06() < i3) {
            Id3Frame id3FrameA0B = A0B(elementIdEndIndex, c0679Ij, z, i, es);
            if (id3FrameA0B != null) {
                arrayList.add(id3FrameA0B);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterTocFrame(str, z2, z3, strArr, id3FrameArr);
    }

    public static CommentFrame A08(C0679Ij c0679Ij, int i) throws UnsupportedEncodingException {
        if (i < 4) {
            return null;
        }
        int iA0E = c0679Ij.A0E();
        String strA0H = A0H(iA0E);
        byte[] data = new byte[3];
        c0679Ij.A0c(data, 0, 3);
        String str = new String(data, 0, 3);
        byte[] bArr = new byte[i - 4];
        c0679Ij.A0c(bArr, 0, i - 4);
        int iA03 = A03(bArr, 0, iA0E);
        String str2 = new String(bArr, 0, iA03, strA0H);
        int iA00 = A00(iA0E) + iA03;
        int textEndIndex = A03(bArr, iA00, iA0E);
        String text = A0K(bArr, iA00, textEndIndex, strA0H);
        return new CommentFrame(str, str2, text);
    }

    public static GeobFrame A09(C0679Ij c0679Ij, int i) throws UnsupportedEncodingException {
        int iA0E = c0679Ij.A0E();
        String strA0H = A0H(iA0E);
        byte[] bArr = new byte[i - 1];
        c0679Ij.A0c(bArr, 0, i - 1);
        int iA02 = A02(bArr, 0);
        String str = new String(bArr, 0, iA02, A0I(169, 10, 52));
        int i2 = iA02 + 1;
        int filenameEndIndex = A03(bArr, i2, iA0E);
        String strA0K = A0K(bArr, i2, filenameEndIndex, strA0H);
        int iA00 = A00(iA0E) + filenameEndIndex;
        int filenameEndIndex2 = A03(bArr, iA00, iA0E);
        String strA0K2 = A0K(bArr, iA00, filenameEndIndex2, strA0H);
        int iA01 = A00(iA0E) + filenameEndIndex2;
        int objectDataStartIndex = bArr.length;
        return new GeobFrame(str, strA0K, strA0K2, A0N(bArr, iA01, objectDataStartIndex));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0084 A[PHI: r2 r3 r5 r6
  0x0084: PHI (r2v11 'majorVersion' int) = (r2v3 'majorVersion' int), (r2v14 'majorVersion' int) binds: [B:24:0x00b0, B:15:0x0082] A[DONT_GENERATE, DONT_INLINE]
  0x0084: PHI (r3v8 'hasExtendedHeader' boolean) = (r3v2 'hasExtendedHeader' boolean), (r3v9 'hasExtendedHeader' boolean) binds: [B:24:0x00b0, B:15:0x0082] A[DONT_GENERATE, DONT_INLINE]
  0x0084: PHI (r5v3 int) = (r5v0 int), (r5v4 int) binds: [B:24:0x00b0, B:15:0x0082] A[DONT_GENERATE, DONT_INLINE]
  0x0084: PHI (r6v3 int) = (r6v0 int), (r6v4 int) binds: [B:24:0x00b0, B:15:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0088  */
    /* JADX WARN: Code duplicated, block: B:20:0x008b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0099  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b3 A[PHI: r2 r3 r5 r6
  0x00b3: PHI (r2v4 'majorVersion' int) = (r2v3 'majorVersion' int), (r2v14 'majorVersion' int) binds: [B:24:0x00b0, B:15:0x0082] A[DONT_GENERATE, DONT_INLINE]
  0x00b3: PHI (r3v3 'hasExtendedHeader' boolean) = (r3v2 'hasExtendedHeader' boolean), (r3v9 'hasExtendedHeader' boolean) binds: [B:24:0x00b0, B:15:0x0082] A[DONT_GENERATE, DONT_INLINE]
  0x00b3: PHI (r5v1 int) = (r5v0 int), (r5v4 int) binds: [B:24:0x00b0, B:15:0x0082] A[DONT_GENERATE, DONT_INLINE]
  0x00b3: PHI (r6v1 int) = (r6v0 int), (r6v4 int) binds: [B:24:0x00b0, B:15:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f8  */
    /* JADX WARN: Instruction removed from duplicated block: B:53:0x00f8, please report this as an issue */
    public static ET A0A(C0679Ij c0679Ij) {
        boolean hasExtendedHeader;
        int iA0E;
        int majorVersion;
        int i;
        int flags;
        int flags2;
        int flags3;
        int flags4;
        int flags5;
        int flags6;
        int flags7;
        boolean isCompressed;
        int iA04 = c0679Ij.A04();
        String strA0I = A0I(179, 10, 114);
        if (iA04 < 10) {
            Log.w(strA0I, A0I(26, 31, 120));
            return null;
        }
        int iA0G = c0679Ij.A0G();
        int i2 = A03;
        if (A02[6].length() == 10) {
            throw new RuntimeException();
        }
        A02[4] = "kM9OkNaCjXVxyVGGYDl1GeNoSaMBgklA";
        if (iA0G != i2) {
            Log.w(strA0I, A0I(376, 48, 103) + iA0G);
            return null;
        }
        int iA0E2 = c0679Ij.A0E();
        if (A02[0].charAt(13) != 't') {
            A02[0] = "VHOwCaxYLj8vFtl4Ur4MSRRrARLF1Bma";
            hasExtendedHeader = false;
            c0679Ij.A0Z(0);
            iA0E = c0679Ij.A0E();
            majorVersion = c0679Ij.A0D();
            i = 3;
            if (iA0E2 == 1) {
                flags7 = iA0E & 64;
                if (flags7 != 0) {
                    isCompressed = true;
                } else {
                    isCompressed = false;
                }
                if (isCompressed) {
                    Log.w(strA0I, A0I(189, 68, 48));
                    return null;
                }
            } else if (iA0E2 == 3) {
                flags5 = iA0E & 64;
                if (flags5 != 0) {
                    flags6 = 1;
                } else {
                    flags6 = 0;
                }
                if (flags6 != 0) {
                    int flags8 = c0679Ij.A08();
                    c0679Ij.A0Z(flags8);
                    majorVersion -= flags8 + 4;
                }
            } else if (iA0E2 == i) {
                flags = iA0E & 64;
                if (flags != 0) {
                    flags2 = 1;
                } else {
                    flags2 = 0;
                }
                if (flags2 != 0) {
                    int iA0D = c0679Ij.A0D();
                    int flags9 = iA0D - 4;
                    c0679Ij.A0Z(flags9);
                    majorVersion -= iA0D;
                }
                flags3 = iA0E & 16;
                if (flags3 != 0) {
                    flags4 = 1;
                } else {
                    flags4 = 0;
                }
                if (flags4 != 0) {
                    majorVersion -= 10;
                }
            } else {
                Log.w(strA0I, A0I(257, 46, 42) + iA0E2);
                return null;
            }
        } else {
            A02[0] = "p94ARmBUNLq0Xt6llw1RhFZLPqWNHfk6";
            hasExtendedHeader = true;
            c0679Ij.A0Z(1);
            iA0E = c0679Ij.A0E();
            majorVersion = c0679Ij.A0D();
            i = 4;
            if (iA0E2 == 2) {
                flags7 = iA0E & 64;
                if (flags7 != 0) {
                    isCompressed = true;
                } else {
                    isCompressed = false;
                }
                if (isCompressed) {
                    Log.w(strA0I, A0I(189, 68, 48));
                    return null;
                }
            } else if (iA0E2 == 3) {
                flags5 = iA0E & 64;
                if (flags5 != 0) {
                    flags6 = 1;
                } else {
                    flags6 = 0;
                }
                if (flags6 != 0) {
                    int flags10 = c0679Ij.A08();
                    c0679Ij.A0Z(flags10);
                    majorVersion -= flags10 + 4;
                }
            } else if (iA0E2 == i) {
                flags = iA0E & 64;
                if (flags != 0) {
                    flags2 = 1;
                } else {
                    flags2 = 0;
                }
                if (flags2 != 0) {
                    int iA0D2 = c0679Ij.A0D();
                    int flags11 = iA0D2 - 4;
                    c0679Ij.A0Z(flags11);
                    majorVersion -= iA0D2;
                }
                flags3 = iA0E & 16;
                if (flags3 != 0) {
                    flags4 = 1;
                } else {
                    flags4 = 0;
                }
                if (flags4 != 0) {
                    majorVersion -= 10;
                }
            } else {
                Log.w(strA0I, A0I(257, 46, 42) + iA0E2);
                return null;
            }
        }
        if (iA0E2 < i) {
            int flags12 = iA0E & 128;
            if (flags12 == 0) {
                hasExtendedHeader = false;
            }
        } else {
            hasExtendedHeader = false;
        }
        return new ET(iA0E2, hasExtendedHeader, majorVersion);
    }

    /* JADX WARN: Code duplicated, block: B:132:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:144:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:146:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:152:0x01f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:153:0x01f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:157:0x0205 A[Catch: UnsupportedEncodingException -> 0x0243, all -> 0x0254, Merged into TryCatch #1 {all -> 0x0254, UnsupportedEncodingException -> 0x0243, blocks: (B:90:0x012c, B:159:0x020f, B:162:0x0243, B:92:0x0134, B:99:0x014a, B:102:0x0154, B:110:0x016e, B:119:0x0186, B:131:0x01a1, B:141:0x01ca, B:151:0x01e3, B:156:0x01f8, B:157:0x0205), top: B:168:0x0122 }] */
    public static Id3Frame A0B(int i, C0679Ij c0679Ij, boolean z, int i2, @Nullable ES es) {
        int frameId2;
        int frameSize;
        int iA0I;
        Id3Frame id3FrameA05;
        int iA0E = c0679Ij.A0E();
        int iA0E2 = c0679Ij.A0E();
        int frameId0 = c0679Ij.A0E();
        if (i >= 3) {
            frameId2 = c0679Ij.A0E();
        } else {
            frameId2 = 0;
        }
        if (i == 4) {
            int iA0H = c0679Ij.A0H();
            if (!z) {
                int frameId3 = iA0H >> 8;
                int i3 = (iA0H & 255) | ((frameId3 & 255) << 7);
                int frameId4 = iA0H >> 16;
                int i4 = i3 | ((frameId4 & 255) << 14);
                int frameId5 = iA0H >> 24;
                frameSize = i4 | ((frameId5 & 255) << 21);
            } else {
                frameSize = iA0H;
            }
        } else if (i == 3) {
            frameSize = c0679Ij.A0H();
        } else {
            frameSize = c0679Ij.A0G();
        }
        if (i >= 3) {
            iA0I = c0679Ij.A0I();
        } else {
            iA0I = 0;
        }
        if (iA0E == 0 && iA0E2 == 0 && frameId0 == 0 && frameId2 == 0 && frameSize == 0 && iA0I == 0) {
            int frameId6 = c0679Ij.A07();
            c0679Ij.A0Y(frameId6);
            return null;
        }
        int iA06 = c0679Ij.A06() + frameSize;
        int iA07 = c0679Ij.A07();
        String strA0I = A0I(179, 10, 114);
        if (iA06 > iA07) {
            Log.w(strA0I, A0I(129, 37, 42));
            int frameId7 = c0679Ij.A07();
            c0679Ij.A0Y(frameId7);
            return null;
        }
        if (es != null && !es.A5F(i, iA0E, iA0E2, frameId0, frameId2)) {
            c0679Ij.A0Y(iA06);
            return null;
        }
        int i5 = 0;
        boolean z2 = false;
        int nextFramePosition = 0;
        int frameId8 = 0;
        boolean z3 = false;
        if (i == 3) {
            int frameId9 = iA0I & 128;
            frameId8 = frameId9 != 0 ? 1 : 0;
            int frameId1 = iA0I & 64;
            z2 = frameId1 != 0;
            z3 = (iA0I & 32) != 0;
            i5 = frameId8;
        } else if (i == 4) {
            z3 = (iA0I & 64) != 0;
            i5 = (iA0I & 8) != 0 ? 1 : 0;
            z2 = (iA0I & 4) != 0;
            nextFramePosition = (iA0I & 2) != 0 ? 1 : 0;
            frameId8 = (iA0I & 1) != 0 ? 1 : 0;
        }
        if (i5 != 0 || z2) {
            Log.w(strA0I, A0I(303, 50, 116));
            c0679Ij.A0Y(iA06);
            return null;
        }
        if (z3) {
            frameSize--;
            c0679Ij.A0Z(1);
        }
        if (frameId8 != 0) {
            frameSize -= 4;
            c0679Ij.A0Z(4);
        }
        if (nextFramePosition != 0) {
            frameSize = A01(c0679Ij, frameSize);
        }
        try {
            if (iA0E == 84 && iA0E2 == 88 && frameId0 == 88 && (i == 2 || frameId2 == 88)) {
                id3FrameA05 = A0D(c0679Ij, frameSize);
            } else if (iA0E == 84) {
                id3FrameA05 = A0E(c0679Ij, frameSize, A0J(i, iA0E, iA0E2, frameId0, frameId2));
            } else if (iA0E == 87 && iA0E2 == 88 && frameId0 == 88 && (i == 2 || frameId2 == 88)) {
                id3FrameA05 = A0F(c0679Ij, frameSize);
            } else if (iA0E == 87) {
                id3FrameA05 = A0G(c0679Ij, frameSize, A0J(i, iA0E, iA0E2, frameId0, frameId2));
            } else if (iA0E == 80 && iA0E2 == 82 && frameId0 == 73 && frameId2 == 86) {
                id3FrameA05 = A0C(c0679Ij, frameSize);
            } else if (iA0E == 71 && iA0E2 == 69 && frameId0 == 79 && (frameId2 == 66 || i == 2)) {
                id3FrameA05 = A09(c0679Ij, frameSize);
            } else if (i == 2) {
                if (iA0E == 80 && iA0E2 == 73 && frameId0 == 67) {
                    id3FrameA05 = A04(c0679Ij, frameSize, i);
                } else if (iA0E != 67 && iA0E2 == 79 && frameId0 == 77) {
                    if (A02[6].length() == 10) {
                        throw new RuntimeException();
                    }
                    A02[6] = "MgxBnjmYjV6";
                    if (frameId2 != 77 && i != 2) {
                        if (iA0E != 67) {
                            if (iA0E != 67) {
                                id3FrameA05 = A05(c0679Ij, frameSize, A0J(i, iA0E, iA0E2, frameId0, frameId2));
                            } else {
                                id3FrameA05 = A05(c0679Ij, frameSize, A0J(i, iA0E, iA0E2, frameId0, frameId2));
                            }
                        } else if (iA0E != 67) {
                            id3FrameA05 = A05(c0679Ij, frameSize, A0J(i, iA0E, iA0E2, frameId0, frameId2));
                        } else {
                            id3FrameA05 = A05(c0679Ij, frameSize, A0J(i, iA0E, iA0E2, frameId0, frameId2));
                        }
                    } else {
                        id3FrameA05 = A08(c0679Ij, frameSize);
                    }
                } else if (iA0E != 67 && iA0E2 == 72 && frameId0 == 65 && frameId2 == 80) {
                    id3FrameA05 = A06(c0679Ij, frameSize, i, z, i2, es);
                } else if (iA0E != 67 && iA0E2 == 84 && frameId0 == 79 && frameId2 == 67) {
                    id3FrameA05 = A07(c0679Ij, frameSize, i, z, i2, es);
                } else {
                    id3FrameA05 = A05(c0679Ij, frameSize, A0J(i, iA0E, iA0E2, frameId0, frameId2));
                }
            } else if (iA0E == 65 && iA0E2 == 80 && frameId0 == 73 && frameId2 == 67) {
                id3FrameA05 = A04(c0679Ij, frameSize, i);
            } else if (iA0E != 67) {
                if (iA0E != 67) {
                    if (iA0E != 67) {
                        id3FrameA05 = A05(c0679Ij, frameSize, A0J(i, iA0E, iA0E2, frameId0, frameId2));
                    } else {
                        id3FrameA05 = A05(c0679Ij, frameSize, A0J(i, iA0E, iA0E2, frameId0, frameId2));
                    }
                } else if (iA0E != 67) {
                    id3FrameA05 = A05(c0679Ij, frameSize, A0J(i, iA0E, iA0E2, frameId0, frameId2));
                } else {
                    id3FrameA05 = A05(c0679Ij, frameSize, A0J(i, iA0E, iA0E2, frameId0, frameId2));
                }
            } else if (iA0E != 67) {
                if (iA0E != 67) {
                    id3FrameA05 = A05(c0679Ij, frameSize, A0J(i, iA0E, iA0E2, frameId0, frameId2));
                } else {
                    id3FrameA05 = A05(c0679Ij, frameSize, A0J(i, iA0E, iA0E2, frameId0, frameId2));
                }
            } else if (iA0E != 67) {
                id3FrameA05 = A05(c0679Ij, frameSize, A0J(i, iA0E, iA0E2, frameId0, frameId2));
            } else {
                id3FrameA05 = A05(c0679Ij, frameSize, A0J(i, iA0E, iA0E2, frameId0, frameId2));
            }
            if (id3FrameA05 == null) {
                Log.w(strA0I, A0I(57, 27, 96) + A0J(i, iA0E, iA0E2, frameId0, frameId2) + A0I(14, 12, 55) + frameSize);
            }
            c0679Ij.A0Y(iA06);
            return id3FrameA05;
        } catch (UnsupportedEncodingException unused) {
            Log.w(strA0I, A0I(424, 30, 47));
            return null;
        } finally {
            c0679Ij.A0Y(iA06);
        }
    }

    public static PrivFrame A0C(C0679Ij c0679Ij, int i) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        c0679Ij.A0c(bArr, 0, i);
        int iA02 = A02(bArr, 0);
        return new PrivFrame(new String(bArr, 0, iA02, A0I(169, 10, 52)), A0N(bArr, iA02 + 1, bArr.length));
    }

    public static TextInformationFrame A0D(C0679Ij c0679Ij, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int iA0E = c0679Ij.A0E();
        String strA0H = A0H(iA0E);
        byte[] bArr = new byte[i - 1];
        c0679Ij.A0c(bArr, 0, i - 1);
        int descriptionEndIndex = A03(bArr, 0, iA0E);
        String str = new String(bArr, 0, descriptionEndIndex, strA0H);
        int iA00 = A00(iA0E) + descriptionEndIndex;
        return new TextInformationFrame(A0I(353, 4, 86), str, A0K(bArr, iA00, A03(bArr, iA00, iA0E), strA0H));
    }

    public static TextInformationFrame A0E(C0679Ij c0679Ij, int encoding, String charset) throws UnsupportedEncodingException {
        if (encoding < 1) {
            return null;
        }
        int iA0E = c0679Ij.A0E();
        String strA0H = A0H(iA0E);
        byte[] bArr = new byte[encoding - 1];
        c0679Ij.A0c(bArr, 0, encoding - 1);
        int valueEndIndex = A03(bArr, 0, iA0E);
        String value = new String(bArr, 0, valueEndIndex, strA0H);
        return new TextInformationFrame(charset, null, value);
    }

    public static UrlLinkFrame A0F(C0679Ij c0679Ij, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            String[] strArr = A02;
            if (strArr[2].charAt(11) == strArr[5].charAt(11)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[7] = "x";
            strArr2[1] = "0";
            return null;
        }
        int descriptionEndIndex = c0679Ij.A0E();
        String strA0H = A0H(descriptionEndIndex);
        byte[] bArr = new byte[i - 1];
        c0679Ij.A0c(bArr, 0, i - 1);
        int iA03 = A03(bArr, 0, descriptionEndIndex);
        String str = new String(bArr, 0, iA03, strA0H);
        int iA00 = A00(descriptionEndIndex) + iA03;
        return new UrlLinkFrame(A0I(454, 4, 16), str, A0K(bArr, iA00, A02(bArr, iA00), A0I(169, 10, 52)));
    }

    public static UrlLinkFrame A0G(C0679Ij c0679Ij, int i, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        c0679Ij.A0c(bArr, 0, i);
        return new UrlLinkFrame(str, null, new String(bArr, 0, A02(bArr, 0), A0I(169, 10, 52)));
    }

    public static String A0H(int i) {
        String strA0I = A0I(169, 10, 52);
        if (i == 0) {
            return strA0I;
        }
        if (i == 1) {
            return A0I(357, 6, 5);
        }
        if (i == 2) {
            return A0I(363, 8, 4);
        }
        if (i != 3) {
            return strA0I;
        }
        String[] strArr = A02;
        if (strArr[2].charAt(11) == strArr[5].charAt(11)) {
            throw new RuntimeException();
        }
        A02[0] = "Xs3p10eLQltfrtGuZ9I87GBEYIMhEDM2";
        return A0I(371, 5, 124);
    }

    public static String A0J(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, A0I(0, 6, 109), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, A0I(6, 8, 10), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static String A0K(byte[] bArr, int i, int i2, String str) throws UnsupportedEncodingException {
        if (i2 <= i || i2 > bArr.length) {
            return A0I(0, 0, 105);
        }
        return new String(bArr, i, i2 - i, str);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a4  */
    public static boolean A0M(C0679Ij c0679Ij, int i, int i2, boolean z) throws Throwable {
        int flags;
        long jA0M;
        int iA0I;
        int id = c0679Ij.A06();
        while (true) {
            try {
                if (c0679Ij.A04() >= i2) {
                    if (i >= 3) {
                        try {
                            flags = c0679Ij.A08();
                            jA0M = c0679Ij.A0M();
                            iA0I = c0679Ij.A0I();
                        } catch (Throwable th) {
                            th = th;
                            c0679Ij.A0Y(id);
                            throw th;
                        }
                    } else {
                        flags = c0679Ij.A0G();
                        jA0M = c0679Ij.A0G();
                        iA0I = 0;
                    }
                    if (flags == 0 && jA0M == 0 && iA0I == 0) {
                        c0679Ij.A0Y(id);
                        return true;
                    }
                    if (i == 4 && !z) {
                        if ((8421504 & jA0M) != 0) {
                            c0679Ij.A0Y(id);
                            return false;
                        }
                        jA0M = (((jA0M >> 24) & 255) << 21) | (jA0M & 255) | (((jA0M >> 8) & 255) << 7) | (((jA0M >> 16) & 255) << 14);
                    }
                    boolean z2 = false;
                    boolean z3 = false;
                    int flags2 = A02[3].length();
                    if (flags2 == 29) {
                        throw new RuntimeException();
                    }
                    A02[6] = "Si8fg";
                    if (i == 4) {
                        z2 = (iA0I & 64) != 0;
                        z3 = (iA0I & 1) != 0;
                    } else if (i == 3) {
                        z2 = (iA0I & 32) != 0;
                        z3 = (iA0I & 128) != 0;
                    }
                    int i3 = 0;
                    if (A02[3].length() != 29) {
                        A02[4] = "6PropUQXGZAV570tqu6sTLuUZZkOZmcy";
                        if (z2) {
                            i3 = 0 + 1;
                        }
                    } else if (z2) {
                        i3 = 0 + 1;
                    }
                    if (z3) {
                        i3 += 4;
                    }
                    if (jA0M < i3) {
                        c0679Ij.A0Y(id);
                        return false;
                    }
                    if (c0679Ij.A04() >= jA0M) {
                        c0679Ij.A0Z((int) jA0M);
                    } else {
                        c0679Ij.A0Y(id);
                        return false;
                    }
                } else {
                    c0679Ij.A0Y(id);
                    return true;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public static byte[] A0N(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return new byte[0];
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2);
        if (A02[3].length() == 29) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[2] = "BXfcBk8SW4yeYxu44B11cVVkBGYBzlAv";
        strArr[5] = "okWvwdNSxMQpYeQbiZnCLiGxFx7BKew9";
        return bArrCopyOfRange;
    }

    public final Metadata A0O(byte[] bArr, int i) {
        ArrayList arrayList = new ArrayList();
        C0679Ij c0679Ij = new C0679Ij(bArr, i);
        ET etA0A = A0A(c0679Ij);
        if (etA0A == null) {
            return null;
        }
        int iA06 = c0679Ij.A06();
        int i2 = etA0A.A01 == 2 ? 6 : 10;
        int iA01 = etA0A.A00;
        if (etA0A.A02) {
            iA01 = A01(c0679Ij, etA0A.A00);
        }
        c0679Ij.A0X(iA06 + iA01);
        boolean unsignedIntFrameSizeHack = false;
        if (!A0M(c0679Ij, etA0A.A01, i2, false)) {
            int i3 = etA0A.A01;
            if (A02[4].charAt(24) == '1') {
                throw new RuntimeException();
            }
            A02[0] = "uYZb4rh3wheJht2DQ5CIaEPvRS4bXzrD";
            if (i3 == 4 && A0M(c0679Ij, 4, i2, true)) {
                unsignedIntFrameSizeHack = true;
            } else {
                Log.w(A0I(179, 10, 114), A0I(84, 45, 2) + etA0A.A01);
                return null;
            }
        }
        while (c0679Ij.A04() >= i2) {
            Id3Frame id3FrameA0B = A0B(etA0A.A01, c0679Ij, unsignedIntFrameSizeHack, i2, this.A00);
            if (id3FrameA0B != null) {
                arrayList.add(id3FrameA0B);
            }
        }
        return new Metadata(arrayList);
    }

    @Override // com.facebook.ads.redexgen.X.EG
    public final Metadata A4h(DJ dj) {
        ByteBuffer byteBuffer = dj.A01;
        return A0O(byteBuffer.array(), byteBuffer.limit());
    }
}
