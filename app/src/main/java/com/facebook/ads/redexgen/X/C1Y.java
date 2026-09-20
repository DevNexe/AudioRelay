package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import com.facebook.ads.internal.exoplayer2.video.ColorInfo;
import com.facebook.ads.internal.exoplayer2.video.DummySurface;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1Y, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
@TargetApi(16)
public final class C1Y extends C3G {
    public static boolean A0b;
    public static boolean A0c;
    public static byte[] A0d;
    public static String[] A0e = {"NS8r3iU3bE12Q5c28wyOjILRdJ0J08uI", "UbzRKZURs", "SU7Qb1ICkxq5LQRUjQdAnOKVl0Elt9iK", "HdySUumBIxpTjI6XDfJ50FoXA9Aqq3VK", "W2XidxNDZL2wdlIqJNQqrIQcb8erTCLJ", "pQl30wQXruMBF7LsTdQVlnJoVdVvITHL", "EldsxOw3j9Ew0275hEYEpNzApywAkDlk", "GsoHFPwBx"};
    public static final int[] A0f;
    public JA A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public long A0M;
    public Surface A0N;
    public Surface A0O;
    public J9 A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public final int A0T;
    public final long A0U;
    public final Context A0V;
    public final JD A0W;
    public final JM A0X;
    public final boolean A0Y;
    public final long[] A0Z;
    public final long[] A0a;

    public static String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0d, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0e;
            if (strArr[7].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0e;
            strArr2[6] = "1g9G5auDmi6BFhp1SUFflSJn2zbmW8bI";
            strArr2[4] = "EQg736KY9Bh9QzgWqQs064uwRmk9hBcX";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 46);
            i4++;
        }
    }

    public static void A0D() {
        A0d = new byte[]{64, 71, 65, 64, 64, 70, 64, 66, 71, 65, 71, 66, 122, 10, 11, 22, 12, 11, 125, 55, 71, 64, 70, 71, 42, 89, 91, 90, 93, 10, 95, 91, 63, 73, 78, 78, 78, 83, 31, 17, 103, 96, 96, 96, 32, 60, 37, 35, 118, 0, 7, 6, 7, 86, 3, 15, 73, 63, 56, 58, 56, 105, 60, 48, 40, 47, 61, 40, 2, 5, 23, 13, 0, 7, 21, 18, 39, 11, 7, 28, 9, 8, 11, 59, 63, 43, 26, 37, 61, 47, 56, 7, 90, 110, 105, 122, 68, 85, 116, 111, 126, 68, 41, 55, 57, 52, 54, 62, 88, 68, 45, 4, 20, 7, 16, 15, 7, 102, 114, 13, 102, 116, 118, 119, 115, 39, 55, 36, 51, 44, 36, 58, 36, 49, 51, 87, 3, 113, 7, 20, 124, 114, 115, 114, 27, 13, 116, 118, 90, 73, 81, 40, 47, 41, 32, 12, 31, 22, 119, 124, 16, 6, 127, 127, 106, 70, 77, 76, 74, 9, 68, 72, 81, 9, 91, 76, 90, 70, 69, 92, 93, 64, 70, 71, 9, 72, 77, 67, 92, 90, 93, 76, 77, 9, 93, 70, 19, 9, 108, 64, 66, 70, 64, 124, 30, 19, 99, 96, 98, 101, 94, 87, 78, 92, 90, 68, 90, 40, 68, 75, 105, 116, 46, 39, 62, 44, 42, 52, 37, 4, 31, 14, 5, 12, 21, 7, 1, 31, 16, 50, 41, 45, 24, 17, 8, 26, 28, 2, 15, 60, 36, 2, 5, 69, 118, 101, 114, 83, 116, 97, 114, 95, 83, 127, 10, 8, 8, 8, 72, 61, 63, 63, 61, 102, 19, 17, 17, 22, 68, 49, 48, 51, 51, 24, 109, 108, 111, 109, 84, 33, 32, 35, 39, 39, 82, 82, 80, 80, 94, 121, 116, 107, 125, 91, 112, 125, 123, 115, 56, 67, 116, 125, 127, 121, 123, 97, 94, 106, 121, 117, 125, 75, 113, 98, 125, 52, 56, 41, 39, 33, 32, 43, 43, 49, 41, 44, 34, 89, 93, 88, 94, 8, 6, 0, 1, 10, 10, 16, 28, 24, 24, 126, 121, 127, 118, 15, 1, 7, 6, 13, 13, 23, 27, 31, 31, 121, 126, 122, 127, 65, 79, 73, 72, 67, 67, 89, 85, 81, 81, 55, 48, 53, 55, 1, 15, 9, 8, 3, 3, 25, 17, 4, 10, 115, 113, 118, 126, 40, 38, 32, 33, 42, 42, 48, 56, 45, 35, 88, 92, 89, 90, 59, 53, 51, 50, 57, 57, 35, 43, 62, 48, 75, 73, 77, 69, 40, 6, 32, 33, 42, 42, 48, 44, 45, 35, 88, 90, 94, 92, 30, 48, 22, 23, 28, 28, 6, 30, 27, 21, 110, 106, 104, 96, 64, 95, 74, 68, 70, 37, 64, 91, 68, 80, 82, 94, 62, 91, 66, 93, 92, 68, 89, 39, 66, 74, 109, 101, 106, 109, 106, 123, 46, 91, 54, 52, 49, 70, 75, 86, 21, 107, 110, 63, 106, 110, 13, 0, 21, 9, 17, 15, 70, 89, 39, 63, 58, 59, 61, 67, 59, 109, 87, 95, 83, 64, 79, 69, 87, 47, 27, 14, 96, 116, 92, 93, 80, 88, 122, 86, 93, 92, 90, 111, 80, 93, 92, 86, 107, 92, 87, 93, 92, 75, 92, 75, 26, 2, 29, 16, 29, 21, 95, 73, 36, 37, 32, 91, 45, 59, 86, 84, 80, 41, 28, 30, 11, 125, 52, 60, 60, 52, 63, 54, 89, 120, 115, 70, 122, 99, 101, 35, 66, 84, 50, 60, 53, 55, 95, 82, 64, 82, 34, 61, 38, 39, 32, 93, 71, 80, 89, 34, 37, 47, 17, 6, 15, 119, 112, 113, 96, 119, 126, 6, 1, 1, 31, 3, 10, 46, 44, 49, 73, 45, 14, 54, 63, 48, 42, 49, 51, 104, 4, 61, 44, 61, 96, 121, 99, 11, 103, 19, 77, 116, 101, 116, 40, 48, 44, 45, 66, 41, 90, 8, 106, 108, 105, 120, 29, 27, 31, 25, 33, 68, 66, 71, 109, 8, 15, 13, 12, 98, 6, 6, 26, 102, 97, 15, 18, 8, 2, 125, 116, 29, 121, 78, 88, 68, 71, 94, 95, 66, 68, 69, 88, 11, 94, 69, 64, 69, 68, 92, 69, 5, 11, 104, 68, 79, 78, 72, 11, 70, 74, 83, 11, 89, 78, 88, 68, 71, 94, 95, 66, 68, 69, 17, 11, 109, 104, 110, 19, 122, 106, 104, 15, 11, 118, 73, 68, 81, 64, 122, 117, 87, 74, 35, 53, 68, 90, 64, 68, 71, 49, 100, 114, 3, 29, 7, 3, 0, 104, 61, 43, 90, 68, 81, 92, 89, 47, 102, 112, 1, 31, 10, 7, 2, 127, 16, 43, 43, 100, 41, 37, 42, 61, 100, 55, 48, 54, 33, 37, 41, 100, 39, 44, 37, 42, 35, 33, 55, 104, 100, 55, 43, 100, 32, 54, 43, 52, 52, 45, 42, 35, 100, 43, 34, 34, 55, 33, 48, 126, 100, 73, 46, 7, 99, 98, 22, 19, 108, 15, 31, 116, 24, 15, 12, 13, 16, 103, 13, 15, 3, 102, 97, 97, 100, 19, 120, 123, 22, 25, 27, 6, 43, 73, 65, 104, 18, 111, 20, 16, 4, 21, 24, 30, 92, 2, 20, 2, 2, 24, 30, 31, 92, 24, 21, 12, 24, 25, 2, 64, 11, 31, 14, 75, 90, 71, 88, 5, 74, 71, 92, 92, 71, 69, 9, 24, 5, 26, 71, 6, 15, 12, 30, 17, 0, 29, 2, 95, 0, 27, 21, 26, 6, 28, 13, 16, 15, 82, 11, 16, 15, 54, 35, 100, 124, 105, 44, 81, 80, 87, 3, 21, 8, 23, 49, 14, 3, 2, 8, 37, 18, 1, 1, 2, 21, 99, 105, 106, 76, 69, 89, 94, 79, 88, 48, 36, 55, 59, 51, 123, 36, 55, 34, 51, 24, 13, 22, 25, 25, 22, 17, 39, 42, 38, 40, 39, 59, 99, 127, 104, 84, 110, 62, 61, 102, 103, 84, 111, 127, 126, 103, 42, 53, 3, 14, 7, 111, 10, 96, 107, 
        104, 101, 101, 49, 62, 58, 60, 86, 48, 49, 57, 63, 119, 108, 119, 109, 40, 46, 114, 111, 126, 119, 68, 72, 47, 42, 47, 119, 61, 41, 49, 32, 44, 43, 54, 47, 38, 28, 59, 117, 100, 104, 103, 103, 96, 103, 110, 118, 122, 105, 114, 117, 116, 68, 125, 12, 0, 25, 76, 9, 4, 8, 6, 9, 21, 14, 2, 27, 78, 10, 13, 19, 22, 23, 78, 16, 10, 25, 6, 83, 95, 70, 19, 73, 87, 90, 74, 86, 16, 21, 68, 64, 77, 70, 127, 123, 127, 119, 89, 86, 90, 86, 67, 95, 107, 108, 102, 110, 105, 100, 112, 118, 90, 99, 119, 53, 54, 53, 72, 89, 86, 93, 84, 84, 103, 92, 48, 33, 46, 37, 44, 44, 31, 36, 44, 101, 116, 123, 112, 121, 121, 74, 113, 102, 96, 113, 126, 117, 124, 124, 79, 116, 100, 78, 76, 87, 81, 76, 87, 74, 71, 107, 124, 117, 124, 120, 106, 124, 86, 108, 109, 105, 108, 109, 91, 108, 127, 127, 124, 107, 17, 12, 23, 2, 23, 10, 12, 13, 78, 7, 6, 4, 17, 6, 6, 16, 94, 20, 29, 24, 85, 29, 28, 21, 123, 105, 102, 124, 103, 102, 97, 68, 92, 94, 71, 97, 94, 83, 82, 88, 117, 66, 81, 81, 82, 69, 5, 16, 24, 21, 30, 46, 3, 30, 6, 32, 55, 56, 11, 49, 33, 54, 55, 44, 44, 39, 46, 39, 38, 111, 50, 46, 35, 59, 32, 35, 33, 41, 82, 65, 86, 74, 65, 65, 123, 105, 17, 116, 107, 102, 103, 109, 45, 49, 101, 114, 114, 117, 106, 103, 102, 108, 44, 98, 117, 96, 97, 126, 115, 114, 120, 56, 127, 114, 97, 116, 102, 121, 116, 117, 127, 63, 125, 96, 36, 102, 61, 117, 99, 5, 26, 23, 22, 28, 92, 11, 94, 5, 29, 23, 93, 28, 29, 65, 93, 5, 3, 75, 111, 112, 125, 124, 118, 54, 97, 52, 111, 119, 125, 55, 118, 119, 43, 55, 111, 105, 32, 9, 31, 10, 13, 17, 16, 79, 80, 65, 74, 93, 92, 63, 33, 44, 60, 32, 106, 114, 114, 121, 110, 66, 123, 115, 107, 107, 96, 119, 91, 98, 106, 23};
    }

    static {
        A0D();
        A0f = new int[]{1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.CM != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    public C1Y(Context context, E6 e6, long j, @Nullable CM<C1047Ww> cm, boolean z, @Nullable Handler handler, @Nullable JN jn, int i) {
        super(2, e6, cm, z);
        this.A0U = j;
        this.A0T = i;
        this.A0V = context.getApplicationContext();
        this.A0W = new JD(this.A0V);
        this.A0X = new JM(handler, jn);
        this.A0Y = A0M();
        this.A0Z = new long[10];
        this.A0a = new long[10];
        this.A0M = -9223372036854775807L;
        this.A0K = -9223372036854775807L;
        this.A0J = -9223372036854775807L;
        this.A08 = -1;
        this.A06 = -1;
        this.A01 = -1.0f;
        this.A02 = -1.0f;
        this.A0F = 1;
        A07();
    }

    public static int A00(E0 e0, Format format) {
        if (format.A09 != -1) {
            int totalInitializationDataSize = 0;
            int size = format.A0P.size();
            for (int i = 0; i < size; i++) {
                totalInitializationDataSize += format.A0P.get(i).length;
            }
            int i2 = format.A09 + totalInitializationDataSize;
            if (A0e[5].charAt(17) != 'd') {
                throw new RuntimeException();
            }
            String[] strArr = A0e;
            strArr[6] = "hUEdDcZTQNKRArh2wdU5F4NdxnsUaLHW";
            strArr[4] = "JKTUnCqsCUQLCGuZWmxU63uBYWjDtVyB";
            return i2;
        }
        return A01(e0, format.A0O, format.A0F, format.A08);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:10:0x0015 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:58:0x016b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0012  */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0148, code lost:
    
        if (r4 != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0157, code lost:
    
        if (r4 != false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A01(com.facebook.ads.redexgen.X.E0 r11, java.lang.String r12, int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1Y.A01(com.facebook.ads.redexgen.X.E0, java.lang.String, int, int):int");
    }

    public static Point A02(E0 e0, Format format) throws E9 {
        int longEdgePx = 0;
        boolean z = format.A08 > format.A0F;
        int i = z ? format.A08 : format.A0F;
        int i2 = z ? format.A0F : format.A08;
        float f = i2 / i;
        int[] iArr = A0f;
        int length = iArr.length;
        while (longEdgePx < length) {
            int i3 = iArr[longEdgePx];
            if (A0e[3].charAt(18) == 'r') {
                throw new RuntimeException();
            }
            A0e[5] = "1BVaGfMRJiqdWLUq8dv8R9mVKG0R6nhL";
            int i4 = (int) (i3 * f);
            if (i3 <= i || i4 <= i2) {
                return null;
            }
            if (C0695Iz.A02 >= 21) {
                int i5 = z ? i4 : i3;
                if (!z) {
                    i3 = i4;
                }
                Point pointA0E = e0.A0E(i5, i3);
                if (e0.A0H(pointA0E.x, pointA0E.y, format.A01)) {
                    return pointA0E;
                }
            } else {
                int iA04 = C0695Iz.A04(i3, 16) * 16;
                int iA05 = C0695Iz.A04(i4, 16) * 16;
                int i6 = iA04 * iA05;
                int shortEdgePx = EB.A00();
                if (i6 <= shortEdgePx) {
                    int i7 = z ? iA05 : iA04;
                    if (!z) {
                        iA04 = iA05;
                    }
                    return new Point(i7, iA04);
                }
            }
            longEdgePx++;
            if (A0e[3].charAt(18) != 'r') {
                String[] strArr = A0e;
                strArr[7] = "qOOBmdqjU";
                strArr[1] = "w7Tn3xd7M";
            } else {
                String[] strArr2 = A0e;
                strArr2[2] = "KAf95qDJkDfWOijmfxtuynNssocKmC3g";
                strArr2[0] = "h6cBxdrGRvPICzB6Kk67A24HS1YQyhML";
            }
        }
        return null;
    }

    @SuppressLint({"InlinedApi"})
    private final MediaFormat A03(Format format, J9 j9, boolean z, int i) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(A05(1094, 4, 60), format.A0O);
        mediaFormat.setInteger(A05(1359, 5, 102), format.A0F);
        mediaFormat.setInteger(A05(971, 6, 97), format.A08);
        EC.A06(mediaFormat, format.A0P);
        EC.A03(mediaFormat, A05(954, 10, 120), format.A01);
        EC.A04(mediaFormat, A05(1180, 16, 77), format.A0B);
        EC.A02(mediaFormat, format.A0J);
        mediaFormat.setInteger(A05(1079, 9, 16), j9.A02);
        mediaFormat.setInteger(A05(1055, 10, 79), j9.A00);
        EC.A04(mediaFormat, A05(1065, 14, 77), j9.A01);
        if (C0695Iz.A02 >= 23) {
            mediaFormat.setInteger(A05(1153, 8, 16), 0);
        }
        if (z) {
            mediaFormat.setInteger(A05(875, 8, 67), 0);
        }
        if (i != 0) {
            A0K(mediaFormat, i);
        }
        return mediaFormat;
    }

    private final J9 A04(E0 e0, Format format, Format[] formatArr) throws E9 {
        int iMax = format.A0F;
        int iMax2 = format.A08;
        int iA00 = A00(e0, format);
        if (formatArr.length == 1) {
            return new J9(iMax, iMax2, iA00);
        }
        boolean z = false;
        for (Format format2 : formatArr) {
            if (A0V(e0.A03, format, format2)) {
                z |= format2.A0F == -1 || format2.A08 == -1;
                iMax = Math.max(iMax, format2.A0F);
                iMax2 = Math.max(iMax2, format2.A08);
                iA00 = Math.max(iA00, A00(e0, format2));
            }
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append(A05(683, 43, 5));
            sb.append(iMax);
            String strA05 = A05(1379, 1, 65);
            sb.append(strA05);
            sb.append(iMax2);
            String string = sb.toString();
            String strA06 = A05(522, 23, 23);
            Log.w(strA06, string);
            Point pointA02 = A02(e0, format);
            if (pointA02 != null) {
                iMax = Math.max(iMax, pointA02.x);
                iMax2 = Math.max(iMax2, pointA02.y);
                iA00 = Math.max(iA00, A01(e0, format.A0O, iMax, iMax2));
                Log.w(strA06, A05(164, 34, 7) + iMax + strA05 + iMax2);
            }
        }
        return new J9(iMax, iMax2, iA00);
    }

    private void A06() {
        MediaCodec mediaCodecA1C;
        this.A0R = false;
        if (C0695Iz.A02 >= 23 && this.A0S && (mediaCodecA1C = A1C()) != null) {
            this.A00 = new JA(this, mediaCodecA1C);
        }
    }

    private void A07() {
        this.A0E = -1;
        this.A0C = -1;
        this.A03 = -1.0f;
        this.A0D = -1;
    }

    private void A08() {
        if (this.A09 > 0) {
            long elapsedMs = SystemClock.elapsedRealtime();
            this.A0X.A02(this.A09, elapsedMs - this.A0H);
            this.A09 = 0;
            this.A0H = elapsedMs;
        }
    }

    private void A09() {
        if (this.A08 == -1 && this.A06 == -1) {
            return;
        }
        if (this.A0E != this.A08 || this.A0C != this.A06 || this.A0D != this.A07 || this.A03 != this.A01) {
            JM jm = this.A0X;
            String[] strArr = A0e;
            if (strArr[6].charAt(27) == strArr[4].charAt(27)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0e;
            strArr2[2] = "RTvZ5FDjzwdLT6J2ljezTJit2l4QBCCR";
            strArr2[0] = "8XoC7GroR317PXdtPjLLz1J1MgtvBrxC";
            jm.A01(this.A08, this.A06, this.A07, this.A01);
            this.A0E = this.A08;
            this.A0C = this.A06;
            this.A0D = this.A07;
            this.A03 = this.A01;
        }
    }

    private void A0A() {
        if (this.A0R) {
            this.A0X.A03(this.A0O);
        }
    }

    private void A0B() {
        if (this.A0E != -1 || this.A0C != -1) {
            this.A0X.A01(this.A0E, this.A0C, this.A0D, this.A03);
        }
    }

    private void A0C() {
        long jElapsedRealtime;
        if (this.A0U > 0) {
            jElapsedRealtime = SystemClock.elapsedRealtime() + this.A0U;
        } else {
            jElapsedRealtime = -9223372036854775807L;
        }
        this.A0J = jElapsedRealtime;
    }

    private final void A0E(int i) {
        super.A0U.A02 += i;
        this.A09 += i;
        this.A05 += i;
        super.A0U.A05 = Math.max(this.A05, super.A0U.A05);
        if (this.A09 >= this.A0T) {
            A08();
        }
    }

    private final void A0F(MediaCodec mediaCodec, int i, long j) {
        C0692Iw.A02(A05(930, 15, 73));
        mediaCodec.releaseOutputBuffer(i, false);
        C0692Iw.A00();
        A0E(1);
    }

    private final void A0G(MediaCodec mediaCodec, int i, long j) {
        A09();
        C0692Iw.A02(A05(1161, 19, 55));
        mediaCodec.releaseOutputBuffer(i, true);
        C0692Iw.A00();
        this.A0L = SystemClock.elapsedRealtime() * 1000;
        super.A0U.A06++;
        this.A05 = 0;
        A1R();
    }

    private final void A0H(MediaCodec mediaCodec, int i, long j) {
        C0692Iw.A02(A05(1211, 15, 25));
        mediaCodec.releaseOutputBuffer(i, false);
        C0692Iw.A00();
        super.A0U.A08++;
    }

    @TargetApi(21)
    private final void A0I(MediaCodec mediaCodec, int i, long j, long j2) {
        A09();
        C0692Iw.A02(A05(1161, 19, 55));
        mediaCodec.releaseOutputBuffer(i, j2);
        C0692Iw.A00();
        this.A0L = SystemClock.elapsedRealtime() * 1000;
        super.A0U.A06++;
        this.A05 = 0;
        A1R();
    }

    @TargetApi(23)
    public static void A0J(MediaCodec mediaCodec, Surface surface) {
        mediaCodec.setOutputSurface(surface);
    }

    @TargetApi(21)
    public static void A0K(MediaFormat mediaFormat, int i) {
        mediaFormat.setFeatureEnabled(A05(1241, 17, 108), true);
        mediaFormat.setInteger(A05(859, 16, 95), i);
    }

    private void A0L(Surface surface) throws AM {
        if (surface == null) {
            if (this.A0N != null) {
                surface = this.A0N;
            } else {
                E0 e0A1D = A1D();
                if (e0A1D != null && A0T(e0A1D)) {
                    this.A0N = DummySurface.A01(this.A0V, e0A1D.A05);
                    surface = this.A0N;
                }
            }
        }
        if (this.A0O != surface) {
            this.A0O = surface;
            int iA7W = A7W();
            if (iA7W == 1 || iA7W == 2) {
                MediaCodec mediaCodecA1C = A1C();
                if (C0695Iz.A02 >= 23 && mediaCodecA1C != null && surface != null && !this.A0Q) {
                    A0J(mediaCodecA1C, surface);
                } else {
                    A1G();
                    A1I();
                }
            }
            if (surface != null && surface != this.A0N) {
                A0B();
                A06();
                if (iA7W == 2) {
                    A0C();
                    return;
                }
                return;
            }
            A07();
            String[] strArr = A0e;
            if (strArr[2].charAt(13) == strArr[0].charAt(13)) {
                throw new RuntimeException();
            }
            A0e[3] = "3kfdRjkwPvYxx8JzUoiB9hf8dQ33bpul";
            A06();
            return;
        }
        if (surface == null || surface == this.A0N) {
            return;
        }
        A0B();
        A0A();
    }

    public static boolean A0M() {
        if (C0695Iz.A02 <= 22) {
            if (A05(948, 6, 4).equals(C0695Iz.A03)) {
                if (A05(545, 6, 122).equals(C0695Iz.A05)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean A0N(long j) {
        return j < -30000;
    }

    public static boolean A0O(long j) {
        return j < -500000;
    }

    private final boolean A0P(long j, long j2) {
        return A0O(j);
    }

    private final boolean A0Q(long j, long j2) {
        return A0N(j);
    }

    private final boolean A0R(long j, long j2) {
        return A0N(j) && j2 > 100000;
    }

    private final boolean A0S(MediaCodec mediaCodec, int i, long j, long j2) throws AM {
        int iA0z = A0z(j2);
        if (iA0z == 0) {
            return false;
        }
        super.A0U.A03++;
        A0E(this.A04 + iA0z);
        A1F();
        return true;
    }

    private boolean A0T(E0 e0) {
        if (C0695Iz.A02 >= 23 && !this.A0S) {
            String str = e0.A02;
            if (A0e[5].charAt(17) != 'd') {
                throw new RuntimeException();
            }
            String[] strArr = A0e;
            strArr[6] = "kyWyTgTuit8kBu9eYgHiJLOeDtaawSzk";
            strArr[4] = "zep7axp9udbgCrK2JAqRjKsc1O8PK6En";
            if (!A0U(str) && (!e0.A05 || DummySurface.A05(this.A0V))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:368:0x0907  */
    /* JADX WARN: Code duplicated, block: B:381:0x0932  */
    private final boolean A0U(String str) {
        byte b = 27;
        byte b2 = 0;
        if (C0695Iz.A02 >= 27 || str.startsWith(A05(563, 10, 125))) {
            return false;
        }
        synchronized (C1Y.class) {
            if (!A0c) {
                String str2 = C0695Iz.A03;
                switch (str2.hashCode()) {
                    case -2144781245:
                        if (!str2.equals(A05(341, 14, 97))) {
                            b = -1;
                        } else {
                            b = 39;
                        }
                        break;
                    case -2144781185:
                        if (!str2.equals(A05(355, 14, 102))) {
                            b = -1;
                        } else {
                            b = 40;
                        }
                        break;
                    case -2144781160:
                        if (!str2.equals(A05(369, 14, 40))) {
                            b = -1;
                        } else {
                            b = 41;
                        }
                        break;
                    case -2097309513:
                        if (!str2.equals(A05(489, 6, 112))) {
                            b = -1;
                        } else {
                            b = 57;
                        }
                        break;
                    case -2022874474:
                        if (!str2.equals(A05(138, 10, 106))) {
                            b = -1;
                        } else {
                            b = 16;
                        }
                        break;
                    case -1978993182:
                        if (!str2.equals(A05(551, 6, 63))) {
                            b = -1;
                        } else {
                            b = 69;
                        }
                        break;
                    case -1978990237:
                        if (!str2.equals(A05(557, 6, 77))) {
                            b = -1;
                        } else {
                            b = 70;
                        }
                        break;
                    case -1936688988:
                        if (!str2.equals(A05(597, 6, 57))) {
                            b = -1;
                        } else {
                            b = 80;
                        }
                        break;
                    case -1936688066:
                        if (!str2.equals(A05(603, 6, 111))) {
                            b = -1;
                        } else {
                            b = 81;
                        }
                        break;
                    case -1936688065:
                        if (!str2.equals(A05(609, 6, 30))) {
                            b = -1;
                        } else {
                            b = 82;
                        }
                        break;
                    case -1931988508:
                        if (!str2.equals(A05(82, 10, 100))) {
                            b = -1;
                        } else {
                            b = 10;
                        }
                        break;
                    case -1696512866:
                        if (!str2.equals(A05(839, 6, 121))) {
                            b = -1;
                        } else {
                            b = 115;
                        }
                        break;
                    case -1680025915:
                        if (!str2.equals(A05(198, 7, 1))) {
                            b = -1;
                        } else {
                            b = 15;
                        }
                        break;
                    case -1615810839:
                        if (!str2.equals(A05(623, 8, 112))) {
                            b = -1;
                        } else {
                            b = 83;
                        }
                        break;
                    case -1554255044:
                        if (!str2.equals(A05(1258, 9, 10))) {
                            b = -1;
                        } else {
                            b = 108;
                        }
                        break;
                    case -1481772737:
                        if (!str2.equals(A05(1126, 9, 110))) {
                            b = -1;
                        } else {
                            b = 76;
                        }
                        break;
                    case -1481772730:
                        if (!str2.equals(A05(1135, 9, 59))) {
                            b = -1;
                        } else {
                            b = 77;
                        }
                        break;
                    case -1481772729:
                        if (!str2.equals(A05(1144, 9, 62))) {
                            b = -1;
                        } else {
                            b = 78;
                        }
                        break;
                    case -1320080169:
                        if (!str2.equals(A05(439, 14, 119))) {
                            b = -1;
                        } else {
                            b = 37;
                        }
                        break;
                    case -1217592143:
                        if (!str2.equals(A05(125, 11, 75))) {
                            b = -1;
                        } else {
                            b = 13;
                        }
                        break;
                    case -1180384755:
                        if (!str2.equals(A05(1012, 6, 48))) {
                            b = -1;
                        } else {
                            b = 53;
                        }
                        break;
                    case -1139198265:
                        if (!str2.equals(A05(735, 9, 11))) {
                            b = -1;
                        } else {
                            b = 96;
                        }
                        break;
                    case -1052835013:
                        if (!str2.equals(A05(1098, 6, 25))) {
                            b = -1;
                        } else {
                            b = 67;
                        }
                        break;
                    case -993250464:
                        if (!str2.equals(A05(12, 7, 21))) {
                            b = -1;
                        } else {
                            b = 3;
                        }
                        break;
                    case -965403638:
                        if (!str2.equals(A05(1196, 8, 3))) {
                            b = -1;
                        } else {
                            b = 98;
                        }
                        break;
                    case -958336948:
                        if (!str2.equals(A05(242, 11, 115))) {
                            b = -1;
                        } else {
                            b = 26;
                        }
                        break;
                    case -879245230:
                        if (!str2.equals(A05(1235, 6, 122))) {
                            b = -1;
                        } else {
                            b = 104;
                        }
                        break;
                    case -842500323:
                        if (!str2.equals(A05(1104, 10, 43))) {
                            b = -1;
                        } else {
                            b = 68;
                        }
                        break;
                    case -821392978:
                        if (!str2.equals(A05(32, 7, 80))) {
                            b = -1;
                        } else {
                            b = 6;
                        }
                        break;
                    case -797483286:
                        if (!str2.equals(A05(726, 9, 16))) {
                            b = -1;
                        } else {
                            b = 97;
                        }
                        break;
                    case -794946968:
                        if (!str2.equals(A05(1347, 6, 80))) {
                            b = -1;
                        } else {
                            b = 109;
                        }
                        break;
                    case -788334647:
                        if (!str2.equals(A05(1353, 6, 22))) {
                            b = -1;
                        } else {
                            b = 110;
                        }
                        break;
                    case -782144577:
                        if (!str2.equals(A05(573, 9, 56))) {
                            b = -1;
                        } else {
                            b = 71;
                        }
                        break;
                    case -575125681:
                        if (!str2.equals(A05(425, 14, 65))) {
                            b = -1;
                        } else {
                            b = 36;
                        }
                        break;
                    case -521118391:
                        if (!str2.equals(A05(327, 14, 64))) {
                            b = -1;
                        } else {
                            b = 38;
                        }
                        break;
                    case -430914369:
                        if (!str2.equals(A05(631, 10, 122))) {
                            b = -1;
                        } else {
                            b = 84;
                        }
                        break;
                    case -290434366:
                        if (!str2.equals(A05(1226, 9, 95))) {
                            b = -1;
                        } else {
                            b = 99;
                        }
                        break;
                    case -282781963:
                        if (!str2.equals(A05(103, 8, 91))) {
                            b = -1;
                        } else {
                            b = 12;
                        }
                        break;
                    case -277133239:
                        if (!str2.equals(A05(845, 7, 103))) {
                            b = -1;
                        } else {
                            b = 116;
                        }
                        break;
                    case -173639913:
                        if (!str2.equals(A05(210, 12, 53))) {
                            b = -1;
                        } else {
                            b = 23;
                        }
                        break;
                    case -56598463:
                        if (!str2.equals(A05(1371, 8, 42))) {
                            b = -1;
                        } else {
                            b = 112;
                        }
                        break;
                    case 2126:
                        if (!str2.equals(A05(136, 2, 110))) {
                            b = -1;
                        } else {
                            b = 14;
                        }
                        break;
                    case 2564:
                        if (!str2.equals(A05(670, 2, 29))) {
                            b = -1;
                        } else {
                            b = 92;
                        }
                        break;
                    case 2715:
                        if (!str2.equals(A05(821, 2, 49))) {
                            b = -1;
                        } else {
                            b = 105;
                        }
                        break;
                    case 2719:
                        if (!str2.equals(A05(828, 2, 20))) {
                            b = -1;
                        } else {
                            b = 107;
                        }
                        break;
                    case 3483:
                        if (!str2.equals(A05(1088, 2, 83))) {
                            b = -1;
                        } else {
                            b = 64;
                        }
                        break;
                    case 73405:
                        if (!str2.equals(A05(486, 3, 34))) {
                            b = -1;
                        } else {
                            b = 56;
                        }
                        break;
                    case 75739:
                        if (!str2.equals(A05(508, 3, 32))) {
                            b = -1;
                        } else {
                            b = 60;
                        }
                        break;
                    case 76779:
                        if (!str2.equals(A05(519, 3, 120))) {
                            b = -1;
                        } else {
                            b = 66;
                        }
                        break;
                    case 78669:
                        if (!str2.equals(A05(586, 3, 73))) {
                            b = -1;
                        } else {
                            b = 74;
                        }
                        break;
                    case 79305:
                        if (!str2.equals(A05(615, 3, 97))) {
                            b = -1;
                        } else {
                            b = 86;
                        }
                        break;
                    case 80618:
                        if (!str2.equals(A05(680, 3, 2))) {
                            b = -1;
                        } else {
                            b = 94;
                        }
                        break;
                    case 88274:
                        if (!str2.equals(A05(852, 3, 95))) {
                            b = -1;
                        } else {
                            b = 117;
                        }
                        break;
                    case 98846:
                        if (!str2.equals(A05(921, 3, 123))) {
                            b = -1;
                        } else {
                            b = 19;
                        }
                        break;
                    case 98848:
                        if (!str2.equals(A05(924, 3, 49))) {
                            b = -1;
                        } else {
                            b = 20;
                        }
                        break;
                    case 99329:
                        if (!str2.equals(A05(927, 3, 27))) {
                            b = -1;
                        } else {
                            b = 21;
                        }
                        break;
                    case 101481:
                        if (!str2.equals(A05(945, 3, 43))) {
                            b = -1;
                        } else {
                            b = 35;
                        }
                        break;
                    case 1513190:
                        if (!str2.equals(A05(0, 4, 95))) {
                            b = -1;
                        } else {
                            b = 0;
                        }
                        break;
                    case 1514184:
                        if (!str2.equals(A05(4, 4, 95))) {
                            b = -1;
                        } else {
                            b = 1;
                        }
                        break;
                    case 1514185:
                        if (!str2.equals(A05(8, 4, 88))) {
                            b = -1;
                        } else {
                            b = 2;
                        }
                        break;
                    case 2436959:
                        if (!str2.equals(A05(582, 4, 42))) {
                            b = -1;
                        } else {
                            b = 73;
                        }
                        break;
                    case 2463773:
                        if (!str2.equals(A05(652, 4, 119))) {
                            b = -1;
                        } else {
                            b = 88;
                        }
                        break;
                    case 2464648:
                        if (!str2.equals(A05(661, 4, 94))) {
                            b = -1;
                        } else {
                            b = 90;
                        }
                        break;
                    case 2689555:
                        if (!str2.equals(A05(835, 4, 123))) {
                            b = -1;
                        } else {
                            b = 114;
                        }
                        break;
                    case 3351335:
                        if (!str2.equals(A05(1090, 4, 7))) {
                            b = -1;
                        } else {
                            b = 65;
                        }
                        break;
                    case 3386211:
                        if (!str2.equals(A05(1114, 4, 41))) {
                            b = -1;
                        } else {
                            b = 72;
                        }
                        break;
                    case 41325051:
                        if (!str2.equals(A05(511, 8, 52))) {
                            b = -1;
                        } else {
                            b = 63;
                        }
                        break;
                    case 55178625:
                        if (!str2.equals(A05(92, 11, 53))) {
                            b = -1;
                        } else {
                            b = 11;
                        }
                        break;
                    case 61542055:
                        if (!str2.equals(A05(19, 5, 88))) {
                            b = -1;
                        } else {
                            b = 4;
                        }
                        break;
                    case 65355429:
                        if (!str2.equals(A05(205, 5, 120))) {
                            b = -1;
                        } else {
                            b = 22;
                        }
                        break;
                    case 66214468:
                        if (!str2.equals(A05(263, 5, 23))) {
                            b = -1;
                        } else {
                            b = 28;
                        }
                        break;
                    case 66214470:
                        if (!str2.equals(A05(268, 5, 32))) {
                            b = -1;
                        } else {
                            b = 29;
                        }
                        break;
                    case 66214473:
                        if (!str2.equals(A05(273, 5, 14))) {
                            b = -1;
                        } else {
                            b = 30;
                        }
                        break;
                    case 66215429:
                        if (!str2.equals(A05(278, 5, 44))) {
                            b = -1;
                        } else {
                            b = 31;
                        }
                        break;
                    case 66215431:
                        if (!str2.equals(A05(283, 5, 112))) {
                            b = -1;
                        } else {
                            b = 32;
                        }
                        break;
                    case 66215433:
                        if (!str2.equals(A05(288, 5, 60))) {
                            b = -1;
                        } else {
                            b = 33;
                        }
                        break;
                    case 66216390:
                        if (!str2.equals(A05(293, 5, 79))) {
                            b = -1;
                        } else {
                            b = 34;
                        }
                        break;
                    case 76402249:
                        if (!str2.equals(A05(618, 5, 80))) {
                            b = -1;
                        } else {
                            b = 87;
                        }
                        break;
                    case 76404105:
                        if (!str2.equals(A05(656, 5, 7))) {
                            b = -1;
                        } else {
                            b = 89;
                        }
                        break;
                    case 76404911:
                        if (!str2.equals(A05(665, 5, 18))) {
                            b = -1;
                        } else {
                            b = 91;
                        }
                        break;
                    case 80963634:
                        if (!str2.equals(A05(823, 5, 127))) {
                            b = -1;
                        } else {
                            b = 106;
                        }
                        break;
                    case 82882791:
                        if (!str2.equals(A05(830, 5, 105))) {
                            b = -1;
                        } else {
                            b = 113;
                        }
                        break;
                    case 102844228:
                        if (!str2.equals(A05(1035, 5, 109))) {
                            b = -1;
                        } else {
                            b = 58;
                        }
                        break;
                    case 165221241:
                        if (!str2.equals(A05(24, 8, 69))) {
                            b = -1;
                        } else {
                            b = 5;
                        }
                        break;
                    case 182191441:
                        if (!str2.equals(A05(155, 9, 97))) {
                            b = -1;
                        } else {
                            b = 18;
                        }
                        break;
                    case 245388979:
                        if (!str2.equals(A05(1047, 8, 53))) {
                            b = -1;
                        } else {
                            b = 62;
                        }
                        break;
                    case 287431619:
                        if (!str2.equals(A05(964, 7, 81))) {
                            b = -1;
                        } else {
                            b = 45;
                        }
                        break;
                    case 307593612:
                        if (!str2.equals(A05(48, 8, 25))) {
                            b = -1;
                        } else {
                            b = 8;
                        }
                        break;
                    case 308517133:
                        if (!str2.equals(A05(56, 8, 38))) {
                            b = -1;
                        } else {
                            b = 9;
                        }
                        break;
                    case 316215098:
                        if (!str2.equals(A05(744, 8, 89))) {
                            b = -1;
                        } else {
                            b = 100;
                        }
                        break;
                    case 316215116:
                        if (!str2.equals(A05(752, 8, 30))) {
                            b = -1;
                        } else {
                            b = 101;
                        }
                        break;
                    case 316246811:
                        if (!str2.equals(A05(760, 8, 71))) {
                            b = -1;
                        } else {
                            b = 102;
                        }
                        break;
                    case 316246818:
                        if (!str2.equals(A05(768, 8, 28))) {
                            b = -1;
                        } else {
                            b = 103;
                        }
                        break;
                    case 407160593:
                        if (!str2.equals(A05(641, 11, 51))) {
                            b = -1;
                        } else {
                            b = 85;
                        }
                        break;
                    case 507412548:
                        if (!str2.equals(A05(672, 8, 121))) {
                            b = -1;
                        } else {
                            b = 93;
                        }
                        break;
                    case 793982701:
                        if (!str2.equals(A05(383, 14, 104))) {
                            b = -1;
                        } else {
                            b = 42;
                        }
                        break;
                    case 794038622:
                        if (!str2.equals(A05(397, 14, 65))) {
                            b = -1;
                        } else {
                            b = 43;
                        }
                        break;
                    case 794040393:
                        if (!str2.equals(A05(411, 14, 82))) {
                            b = -1;
                        } else {
                            b = 44;
                        }
                        break;
                    case 835649806:
                        if (!str2.equals(A05(1040, 7, 39))) {
                            b = -1;
                        } else {
                            b = 61;
                        }
                        break;
                    case 917340916:
                        if (!str2.equals(A05(39, 9, 126))) {
                            b = -1;
                        } else {
                            b = 7;
                        }
                        break;
                    case 958008161:
                        if (!str2.equals(A05(1026, 9, 107))) {
                            b = -1;
                        } else {
                            b = 55;
                        }
                        break;
                    case 1060579533:
                        if (!str2.equals(A05(1118, 8, 22))) {
                            b = -1;
                        } else {
                            b = 75;
                        }
                        break;
                    case 1150207623:
                        if (!str2.equals(A05(501, 7, 36))) {
                            b = -1;
                        } else {
                            b = 59;
                        }
                        break;
                    case 1176899427:
                        if (!str2.equals(A05(1018, 8, 53))) {
                            b = -1;
                        } else {
                            b = 54;
                        }
                        break;
                    case 1280332038:
                        if (!str2.equals(A05(991, 7, 108))) {
                            b = -1;
                        } else {
                            b = 47;
                        }
                        break;
                    case 1306947716:
                        if (!str2.equals(A05(253, 10, 46))) {
                            b = -1;
                        }
                        break;
                    case 1349174697:
                        if (!str2.equals(A05(977, 14, 37))) {
                            b = -1;
                        } else {
                            b = 46;
                        }
                        break;
                    case 1522194893:
                        if (!str2.equals(A05(1364, 7, 51))) {
                            b = -1;
                        } else {
                            b = 111;
                        }
                        break;
                    case 1691543273:
                        if (!str2.equals(A05(148, 7, 55))) {
                            b = -1;
                        } else {
                            b = 17;
                        }
                        break;
                    case 1709443163:
                        if (!str2.equals(A05(998, 14, 39))) {
                            b = -1;
                        } else {
                            b = 51;
                        }
                        break;
                    case 1865889110:
                        if (!str2.equals(A05(1204, 7, 38))) {
                            b = -1;
                        } else {
                            b = 95;
                        }
                        break;
                    case 1906253259:
                        if (!str2.equals(A05(589, 8, 62))) {
                            b = -1;
                        } else {
                            b = 79;
                        }
                        break;
                    case 1977196784:
                        if (!str2.equals(A05(474, 12, 45))) {
                            b = -1;
                        } else {
                            b = 52;
                        }
                        break;
                    case 2029784656:
                        if (!str2.equals(A05(453, 7, 38))) {
                            b = -1;
                        } else {
                            b = 48;
                        }
                        break;
                    case 2030379515:
                        if (!str2.equals(A05(460, 7, 61))) {
                            b = -1;
                        } else {
                            b = 49;
                        }
                        break;
                    case 2047190025:
                        if (!str2.equals(A05(222, 10, 69))) {
                            b = -1;
                        } else {
                            b = 24;
                        }
                        break;
                    case 2047252157:
                        if (!str2.equals(A05(232, 10, 110))) {
                            b = -1;
                        } else {
                            b = 25;
                        }
                        break;
                    case 2048319463:
                        if (!str2.equals(A05(467, 7, 36))) {
                            b = -1;
                        } else {
                            b = 50;
                        }
                        break;
                    default:
                        b = -1;
                        break;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                    case 69:
                    case 70:
                    case 71:
                    case 72:
                    case 73:
                    case 74:
                    case 75:
                    case 76:
                    case 77:
                    case 78:
                    case 79:
                    case 80:
                    case 81:
                    case 82:
                    case 83:
                    case 84:
                    case 85:
                    case 86:
                    case 87:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    case 93:
                    case 94:
                    case 95:
                    case 96:
                    case 97:
                    case 98:
                    case 99:
                    case 100:
                    case 101:
                    case 102:
                    case 103:
                    case 104:
                    case 105:
                    case 106:
                    case 107:
                    case 108:
                    case 109:
                    case 110:
                    case 111:
                    case 112:
                    case 113:
                    case 114:
                    case 115:
                    case 116:
                    case 117:
                        A0b = true;
                        break;
                }
                String str3 = C0695Iz.A06;
                int iHashCode = str3.hashCode();
                if (iHashCode != 2006354) {
                    if (iHashCode == 2006367 && str3.equals(A05(68, 4, 109))) {
                        b2 = 1;
                    } else {
                        b2 = -1;
                    }
                } else if (!str3.equals(A05(64, 4, 71))) {
                    b2 = -1;
                }
                if (b2 == 0 || b2 == 1) {
                    A0b = true;
                }
                A0c = true;
            }
        }
        return A0b;
    }

    public static boolean A0V(boolean z, Format format, Format format2) {
        if (format.A0O.equals(format2.A0O) && format.A0B == format2.A0B && (z || (format.A0F == format2.A0F && format.A08 == format2.A08))) {
            ColorInfo colorInfo = format.A0J;
            ColorInfo colorInfo2 = format2.A0J;
            String[] strArr = A0e;
            if (strArr[2].charAt(13) == strArr[0].charAt(13)) {
                throw new RuntimeException();
            }
            A0e[5] = "SCavqIZfy9E7QicA0dHTliXfXCWB3KSN";
            if (C0695Iz.A0g(colorInfo, colorInfo2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.C3G, com.facebook.ads.redexgen.X.E4
    public final void A12() {
        this.A08 = -1;
        this.A06 = -1;
        this.A01 = -1.0f;
        this.A02 = -1.0f;
        this.A0M = -9223372036854775807L;
        this.A0K = -9223372036854775807L;
        this.A0A = 0;
        A07();
        A06();
        this.A0W.A08();
        this.A00 = null;
        this.A0S = false;
        try {
            super.A12();
        } finally {
            super.A0U.A00();
            this.A0X.A05(super.A0U);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3G, com.facebook.ads.redexgen.X.E4
    public final void A13() {
        super.A13();
        this.A09 = 0;
        this.A0H = SystemClock.elapsedRealtime();
        this.A0L = SystemClock.elapsedRealtime() * 1000;
    }

    @Override // com.facebook.ads.redexgen.X.C3G, com.facebook.ads.redexgen.X.E4
    public final void A14() {
        this.A0J = -9223372036854775807L;
        A08();
        super.A14();
    }

    @Override // com.facebook.ads.redexgen.X.C3G, com.facebook.ads.redexgen.X.E4
    public final void A15(long j, boolean z) throws AM {
        super.A15(j, z);
        A06();
        this.A0I = -9223372036854775807L;
        this.A05 = 0;
        this.A0K = -9223372036854775807L;
        int i = this.A0A;
        if (i != 0) {
            long[] jArr = this.A0Z;
            String[] strArr = A0e;
            if (strArr[6].charAt(27) == strArr[4].charAt(27)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0e;
            strArr2[7] = "7MW3dnHmZ";
            strArr2[1] = "zsetFM6ej";
            this.A0M = jArr[i - 1];
            this.A0A = 0;
        }
        if (z) {
            A0C();
        } else {
            this.A0J = -9223372036854775807L;
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3G, com.facebook.ads.redexgen.X.E4
    public final void A16(boolean z) throws AM {
        super.A16(z);
        this.A0G = A11().A00;
        this.A0S = this.A0G != 0;
        this.A0X.A06(super.A0U);
        this.A0W.A09();
    }

    @Override // com.facebook.ads.redexgen.X.E4
    public final void A17(Format[] formatArr, long j) throws AM {
        if (this.A0M == -9223372036854775807L) {
            this.A0M = j;
        } else {
            int i = this.A0A;
            String[] strArr = A0e;
            if (strArr[6].charAt(27) == strArr[4].charAt(27)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0e;
            strArr2[2] = "hJEWxkqVwddaEGRwsPF9GJysu0azMoJ9";
            strArr2[0] = "zdhmDyX7lfpv7BLRFINwBKdWRGj92JIy";
            if (i == this.A0Z.length) {
                Log.w(A05(522, 23, 23), A05(776, 45, 106) + this.A0Z[this.A0A - 1]);
            } else {
                this.A0A = i + 1;
            }
            long[] jArr = this.A0Z;
            int i2 = this.A0A;
            jArr[i2 - 1] = j;
            this.A0a[i2 - 1] = this.A0K;
        }
        super.A17(formatArr, j);
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final int A1A(MediaCodec mediaCodec, E0 e0, Format format, Format format2) {
        if (A0V(e0.A03, format, format2) && format2.A0F <= this.A0P.A02 && format2.A08 <= this.A0P.A00 && A00(e0, format2) <= this.A0P.A01) {
            if (format.A0K(format2)) {
                return 1;
            }
            return 3;
        }
        return 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.CM != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    @Override // com.facebook.ads.redexgen.X.C3G
    public final int A1B(E6 e6, CM<C1047Ww> cm, Format format) throws E9 {
        String str = format.A0O;
        if (!C0672Ic.A0B(str)) {
            return 0;
        }
        boolean z = false;
        DrmInitData drmInitData = format.A0H;
        if (drmInitData != null) {
            for (int i = 0; i < drmInitData.A01; i++) {
                z |= drmInitData.A01(i).A03;
            }
        }
        E0 e0A6N = e6.A6N(str, z);
        String[] strArr = A0e;
        if (strArr[2].charAt(13) == strArr[0].charAt(13)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0e;
        strArr2[7] = "kTnRYby1s";
        strArr2[1] = "UL9g0IqkI";
        if (e0A6N == null) {
            return (!z || e6.A6N(str, false) == null) ? 1 : 2;
        }
        if (!E4.A0x(cm, drmInitData)) {
            return 2;
        }
        boolean zA0I = e0A6N.A0I(format.A0K);
        if (zA0I && format.A0F > 0 && format.A08 > 0) {
            if (C0695Iz.A02 >= 21) {
                int i2 = format.A0F;
                int i3 = format.A08;
                if (A0e[3].charAt(18) == 'r') {
                    throw new RuntimeException();
                }
                String[] strArr3 = A0e;
                strArr3[6] = "jeBed4IeUvhTWXlMCWkd0HFF16tIjLHF";
                strArr3[4] = "0qAO2CVMQ14qnLtRtzyjuYZeLu4NiNP0";
                zA0I = e0A6N.A0H(i2, i3, format.A01);
            } else {
                zA0I = format.A0F * format.A08 <= EB.A00();
                if (!zA0I) {
                    String str2 = A05(298, 29, 54) + format.A0F + A05(1379, 1, 65) + format.A08 + A05(856, 3, 97) + C0695Iz.A04 + A05(855, 1, 27);
                }
            }
        }
        boolean decoderCapable = e0A6N.A03;
        int i4 = decoderCapable ? 16 : 8;
        boolean decoderCapable2 = e0A6N.A06;
        int adaptiveSupport = decoderCapable2 ? 32 : 0;
        return i4 | adaptiveSupport | (zA0I ? 4 : 3);
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    @CallSuper
    public final void A1F() throws AM {
        super.A1F();
        this.A04 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    @CallSuper
    public final void A1G() {
        try {
            super.A1G();
        } finally {
            this.A04 = 0;
            Surface surface = this.A0N;
            if (surface != null) {
                if (this.A0O == surface) {
                    this.A0O = null;
                }
                this.A0N.release();
                this.A0N = null;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    @CallSuper
    public final void A1J(long j) {
        this.A04--;
        while (true) {
            int i = this.A0A;
            if (i != 0 && j >= this.A0a[0]) {
                long[] jArr = this.A0Z;
                this.A0M = jArr[0];
                this.A0A = i - 1;
                System.arraycopy(jArr, 1, jArr, 0, this.A0A);
                long[] jArr2 = this.A0a;
                System.arraycopy(jArr2, 1, jArr2, 0, this.A0A);
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x004d  */
    @Override // com.facebook.ads.redexgen.X.C3G
    public final void A1K(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        boolean z;
        int integer;
        int integer2;
        String strA05 = A05(903, 10, 92);
        boolean zContainsKey = mediaFormat.containsKey(strA05);
        String strA06 = A05(913, 8, 81);
        String strA07 = A05(883, 11, 6);
        String strA08 = A05(894, 9, 68);
        if (zContainsKey && mediaFormat.containsKey(strA08)) {
            boolean zContainsKey2 = mediaFormat.containsKey(strA07);
            if (A0e[5].charAt(17) != 'd') {
                throw new RuntimeException();
            }
            String[] strArr = A0e;
            strArr[7] = "iz6RCOhSh";
            strArr[1] = "D9RR8bf8p";
            if (zContainsKey2 && mediaFormat.containsKey(strA06)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (z) {
            integer = (mediaFormat.getInteger(strA05) - mediaFormat.getInteger(strA08)) + 1;
        } else {
            integer = mediaFormat.getInteger(A05(1359, 5, 102));
        }
        this.A08 = integer;
        if (z) {
            integer2 = (mediaFormat.getInteger(strA07) - mediaFormat.getInteger(strA06)) + 1;
        } else {
            integer2 = mediaFormat.getInteger(A05(971, 6, 97));
        }
        this.A06 = integer2;
        this.A01 = this.A02;
        if (C0695Iz.A02 >= 21) {
            int i = this.A0B;
            if (i == 90 || i == 270) {
                int i2 = this.A08;
                this.A08 = this.A06;
                this.A06 = i2;
                this.A01 = 1.0f / this.A01;
            }
        } else {
            this.A07 = this.A0B;
        }
        mediaCodec.setVideoScalingMode(this.A0F);
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final void A1L(Format format) throws AM {
        super.A1L(format);
        this.A0X.A04(format);
        this.A02 = format.A02;
        this.A0B = format.A0B;
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    @CallSuper
    public final void A1M(X2 x2) {
        this.A04++;
        this.A0K = Math.max(x2.A00, this.A0K);
        if (C0695Iz.A02 < 23 && this.A0S) {
            A1R();
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final void A1N(E0 e0, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) throws E9 {
        this.A0P = A04(e0, format, A19());
        MediaFormat mediaFormatA03 = A03(format, this.A0P, this.A0Y, this.A0G);
        if (this.A0O == null) {
            IK.A04(A0T(e0));
            Surface surface = this.A0N;
            String[] strArr = A0e;
            if (strArr[7].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0e;
            strArr2[6] = "HUdK6ej9G5uy2eoW8HL148MSYBaQJURn";
            strArr2[4] = "oyZJZuVgjRVeIXKioVrHS7OTGib3SAbN";
            if (surface == null) {
                this.A0N = DummySurface.A01(this.A0V, e0.A05);
            }
            this.A0O = this.A0N;
        }
        mediaCodec.configure(mediaFormatA03, this.A0O, mediaCrypto, 0);
        if (C0695Iz.A02 >= 23 && this.A0S) {
            this.A00 = new JA(this, mediaCodec);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final void A1O(String str, long j, long j2) {
        this.A0X.A07(str, j, j2);
        this.A0Q = A0U(str);
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final boolean A1P(long unadjustedFrameReleaseTimeNs, long j, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long unadjustedFrameReleaseTimeNs2, boolean z) throws AM {
        if (this.A0I == -9223372036854775807L) {
            this.A0I = unadjustedFrameReleaseTimeNs;
        }
        long earlyUs = unadjustedFrameReleaseTimeNs2 - this.A0M;
        if (z) {
            A0H(mediaCodec, i, earlyUs);
            return true;
        }
        long j2 = unadjustedFrameReleaseTimeNs2 - unadjustedFrameReleaseTimeNs;
        Surface surface = this.A0O;
        Surface surface2 = this.A0N;
        String[] strArr = A0e;
        if (strArr[2].charAt(13) == strArr[0].charAt(13)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0e;
        strArr2[2] = "tTKgXyDwmZTS9W3DU5UkyT40ENaKbHyT";
        strArr2[0] = "ymAWKg2GShyJej9UBV5xPoPh0gH7RDQq";
        if (surface == surface2) {
            if (!A0N(j2)) {
                return false;
            }
            A0H(mediaCodec, i, earlyUs);
            return true;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String[] strArr3 = A0e;
        if (strArr3[2].charAt(13) == strArr3[0].charAt(13)) {
            throw new RuntimeException();
        }
        String[] strArr4 = A0e;
        strArr4[6] = "Tj6uZUYZuPZ7pCoRyZtHZtCub82IEIjs";
        strArr4[4] = "wN6Cz1ZftXTKk8PfKKvkhZq0bAWp3Laf";
        long j3 = jElapsedRealtime * 1000;
        boolean z2 = A7W() == 2;
        if (!this.A0R || (z2 && A0R(j2, j3 - this.A0L))) {
            if (C0695Iz.A02 >= 21) {
                long jNanoTime = System.nanoTime();
                String[] strArr5 = A0e;
                if (strArr5[6].charAt(27) != strArr5[4].charAt(27)) {
                    String[] strArr6 = A0e;
                    strArr6[6] = "oWL9SRYwVyvR2JEBKybOkKnbuF7SsiRC";
                    strArr6[4] = "NzhSZMUYEy5Cfuxee7W6IeInRPwNjtL0";
                    A0I(mediaCodec, i, earlyUs, jNanoTime);
                    return true;
                }
                A0e[3] = "41VA6FIKazuT7AmZNA03mPvHgUe4JG9W";
                A0I(mediaCodec, i, earlyUs, jNanoTime);
                return true;
            }
            A0G(mediaCodec, i, earlyUs);
            return true;
        }
        if (!z2 || unadjustedFrameReleaseTimeNs == this.A0I) {
            return false;
        }
        long jNanoTime2 = System.nanoTime();
        long jA07 = this.A0W.A07(unadjustedFrameReleaseTimeNs2, jNanoTime2 + ((j2 - (j3 - j)) * 1000));
        long adjustedReleaseTimeNs = (jA07 - jNanoTime2) / 1000;
        if (A0P(adjustedReleaseTimeNs, j) && A0S(mediaCodec, i, earlyUs, unadjustedFrameReleaseTimeNs)) {
            return false;
        }
        if (A0Q(adjustedReleaseTimeNs, j)) {
            A0F(mediaCodec, i, earlyUs);
            return true;
        }
        if (C0695Iz.A02 >= 21) {
            if (adjustedReleaseTimeNs < 50000) {
                A0I(mediaCodec, i, earlyUs, jA07);
                return true;
            }
        } else if (adjustedReleaseTimeNs < 30000) {
            if (adjustedReleaseTimeNs > 11000) {
                try {
                    Thread.sleep((adjustedReleaseTimeNs - 10000) / 1000);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return false;
                }
            }
            A0G(mediaCodec, i, earlyUs);
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final boolean A1Q(E0 e0) {
        return this.A0O != null || A0T(e0);
    }

    public final void A1R() {
        if (!this.A0R) {
            this.A0R = true;
            this.A0X.A03(this.A0O);
        }
    }

    @Override // com.facebook.ads.redexgen.X.E4, com.facebook.ads.redexgen.X.InterfaceC0500Ar
    public final void A7z(int i, Object obj) throws AM {
        if (i == 1) {
            String[] strArr = A0e;
            if (strArr[2].charAt(13) == strArr[0].charAt(13)) {
                throw new RuntimeException();
            }
            A0e[3] = "M4hKmbj6QiDhWM6pD0tSNqk85KgZRxnW";
            A0L((Surface) obj);
            return;
        }
        if (i == 4) {
            this.A0F = ((Integer) obj).intValue();
            MediaCodec mediaCodecA1C = A1C();
            if (mediaCodecA1C == null) {
                return;
            }
            mediaCodecA1C.setVideoScalingMode(this.A0F);
            return;
        }
        super.A7z(i, obj);
    }

    @Override // com.facebook.ads.redexgen.X.C3G, com.facebook.ads.redexgen.X.XG
    public final boolean A8c() {
        Surface surface;
        if (!super.A8c() || (!this.A0R && (((surface = this.A0N) == null || this.A0O != surface) && A1C() != null && !this.A0S))) {
            if (this.A0J == -9223372036854775807L) {
                return false;
            }
            if (SystemClock.elapsedRealtime() < this.A0J) {
                return true;
            }
            this.A0J = -9223372036854775807L;
            return false;
        }
        this.A0J = -9223372036854775807L;
        if (A0e[5].charAt(17) != 'd') {
            throw new RuntimeException();
        }
        String[] strArr = A0e;
        strArr[7] = "3PsRT4XFV";
        strArr[1] = "WWSFTmL3V";
        return true;
    }
}
