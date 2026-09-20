package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3G, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
@TargetApi(16)
public abstract class C3G extends E4 {
    public static byte[] A0d;
    public static String[] A0e = {"9OVkIR1fNYEoLuJhr4v44UGIqobat2iA", "rvjyAE4a8qg3Symxb7ylQnmZk1yEw18g", "yq3KpxRuPN0WZ8jbU7FQkuT3q90s4j9W", "QhWwoh5s4IWFZsopFlKjqr3qYdcDlMjY", "GXhQrMO3EYw7GpvgdmF2LLQyblaoRrya", "HarHLo3NfHHJ1sn22D42qgtNJjG4ySv5", "mWzZtnKFhVqOEEmQC7RHyJpmfpW8oE62", "x54zHbOQHTTVCgIECmCrfbqAOALLU5ir"};
    public static final byte[] A0f;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public MediaCodec A06;
    public Format A07;
    public CL<C1047Ww> A08;
    public CL<C1047Ww> A09;
    public E0 A0A;
    public ByteBuffer A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public ByteBuffer[] A0S;
    public ByteBuffer[] A0T;
    public C0530Bw A0U;
    public final MediaCodec.BufferInfo A0V;
    public final AZ A0W;
    public final X2 A0X;
    public final X2 A0Y;

    @Nullable
    public final CM<C1047Ww> A0Z;
    public final E6 A0a;
    public final List<Long> A0b;
    public final boolean A0c;

    public static String A0Z(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0d, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 20);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0j() {
        A0d = new byte[]{76, 64, 2, 21, 20, 64, 14, 15, 64, 19, 5, 3, 21, 18, 5, 64, 4, 5, 3, 15, 4, 5, 18, 64, 1, 22, 1, 9, 12, 1, 2, 12, 5, 78, 64, 52, 18, 25, 9, 14, 7, 64, 20, 15, 64, 16, 18, 15, 3, 5, 5, 4, 64, 23, 9, 20, 8, 64, 118, 116, 116, 116, 116, 116, 117, 114, 115, 112, 118, 7, 116, 116, 6, 0, 5, 118, 113, 125, 116, 116, 116, 116, 116, 116, 117, 114, 124, 7, 1, 116, 2, 117, 119, 118, 116, 116, 116, 116, 116, 116, 117, 114, 113, 124, 124, 124, 112, 116, 0, 7, 1, 115, 117, 117, 124, 5, 116, 116, 116, 118, 2, 6, 2, 117, 7, 119, 117, 7, 119, 118, 115, 113, 0, 115, 124, 7, 0, 18, 4, 15, 8, 26, 3, 29, 26, 8, 15, 117, 89, 85, 78, 91, 90, 34, 20, 11, 70, 21, 3, 21, 21, 15, 9, 8, 70, 20, 3, 23, 19, 15, 20, 3, 21, 70, 21, 3, 5, 19, 20, 3, 70, 2, 3, 5, 9, 2, 3, 20, 70, 0, 9, 20, 70, 62, 22, 23, 26, 18, 83, 1, 22, 2, 6, 26, 1, 22, 0, 83, 18, 83, 55, 1, 30, 32, 22, 0, 0, 26, 28, 29, 62, 18, 29, 18, 20, 22, 1, 125, 85, 84, 89, 81, 115, 95, 84, 85, 83, 98, 85, 94, 84, 85, 66, 85, 66, 125, 127, 106, 28, 119, 74, 75, 92, 93, 65, 28, 83, 68, 81, 28, 86, 87, 81, 27, 25, 12, 122, 17, 44, 45, 58, 59, 39, 122, 53, 34, 55, 122, 48, 49, 55, 122, 39, 49, 55, 33, 38, 49, 74, 72, 93, 43, 72, 81, 78, 43, 68, 80, 65, 76, 74, 43, 65, 64, 70, 74, 65, 64, 87, 43, 72, 85, 54, 127, 125, 104, 30, 125, 100, 123, 30, 102, 121, 116, 117, 127, 30, 116, 117, 115, 127, 116, 117, 98, 30, 113, 102, 115, 3, 1, 20, 98, 2, 58, 37, 40, 37, 45, 98, 36, 126, 122, 120, 98, 40, 41, 47, 35, 40, 41, 47, 45, 56, 78, 46, 22, 9, 4, 9, 1, 78, 8, 82, 86, 84, 78, 4, 5, 3, 15, 4, 5, 78, 19, 5, 3, 21, 18, 5, 121, 123, 110, 24, 101, 115, 117, 24, 87, 64, 85, 24, 82, 83, 85, 72, 74, 95, 41, 84, 66, 68, 41, 102, 113, 100, 41, 99, 98, 100, 41, 116, 98, 100, 114, 117, 98, 45, 47, 58, 76, 3, 14, 14, 21, 11, 12, 12, 7, 16, 76, 20, 11, 6, 7, 13, 76, 6, 7, 1, 13, 6, 7, 16, 76, 3, 20, 1, 1, 3, 22, 96, 47, 35, 34, 33, 41, 39, 45, 96, 47, 56, 45, 96, 42, 43, 45, 33, 42, 43, 60, 96, 47, 57, 43, 61, 33, 35, 43, 63, 61, 40, 94, 17, 29, 28, 31, 23, 25, 19, 94, 17, 6, 19, 94, 20, 21, 19, 31, 20, 21, 2, 94, 17, 7, 21, 3, 31, 29, 21, 94, 3, 21, 19, 5, 2, 21, 121, 123, 110, 24, 81, 89, 89, 81, 90, 83, 24, 87, 87, 85, 24, 82, 83, 85, 89, 82, 83, 68, 30, 28, 9, 127, 54, 62, 62, 54, 61, 52, 127, 39, 62, 35, 51, 56, 34, 127, 53, 52, 50, 62, 53, 52, 35, 2, 0, 21, 99, 63, 38, 99, 59, 36, 41, 40, 34, 18, 41, 40, 46, 34, 41, 40, 63, 99, 44, 59, 46, 112, 110, 14, 98, 22, 18, 19, 41, 55, 87, 59, 79, 72, 74, 106, 116, 20, 126, 1, 9, 9, 116, 106, 10, 109, 16, 23, 23, 79, 81, 49, 72, 41, 36, 41, 106, 97, 104, 103, 103, 108, 101, 36, 106, 102, 124, 103, 125, 63, 51, 50, 58, 53, 59, 41, 46, 57, 31, 51, 56, 57, 63, 15, 30, 9, 13, 24, 9, 47, 3, 8, 9, 15, 86, 96, 118, 101, 109, 106, 69, 106, 96, 66, 97, 97, 96, 83, 89, 90, 64, 91, 81, 80, 71, 24, 18, 17, 11, 16, 26, 27, 12, 33, 18, 10, 27, 5, 16, 13, 23, 18, 7, 16, 43, 33, 113, 115, 115, 115, 45, 32, 44, 34, 45, 49, 3, 4, 17, 2, 4, 51, 31, 20, 21, 19, 113, 108, 105, 100, 117, 108, 100, 101, 123, 118, 102, 122};
    }

    public abstract int A1B(E6 e6, CM<C1047Ww> cm, Format format) throws E9;

    public abstract void A1N(E0 e0, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) throws E9;

    public abstract boolean A1P(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws AM;

    static {
        A0j();
        A0f = C0695Iz.A0h(A0Z(59, 76, 80));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.CM != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    public C3G(int i, E6 e6, @Nullable CM<C1047Ww> cm, boolean z) {
        super(i);
        IK.A04(C0695Iz.A02 >= 16);
        this.A0a = (E6) IK.A01(e6);
        this.A0Z = cm;
        this.A0c = z;
        this.A0X = new X2(0);
        this.A0Y = X2.A02();
        this.A0W = new AZ();
        this.A0b = new ArrayList();
        this.A0V = new MediaCodec.BufferInfo();
        this.A01 = 0;
        this.A02 = 0;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x007d  */
    /* JADX WARN: Code duplicated, block: B:26:0x00af  */
    /* JADX WARN: Code duplicated, block: B:28:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:30:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:34:0x00fe A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x0106 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    private int A0W(String str) {
        String str2;
        String strA0Z;
        String[] strArr;
        if (C0695Iz.A02 <= 25 && A0Z(263, 25, 64).equals(str)) {
            String str3 = C0695Iz.A06;
            if (A0e[5].charAt(22) != 'm') {
                String[] strArr2 = A0e;
                strArr2[3] = "rXHSxRetqBcaMazmAuD1LrMN32rrN6yB";
                strArr2[0] = "PYELojq5TDB6rkMOhN6BPW4xOGIFZ2Jw";
                if (str3.startsWith(A0Z(625, 7, 8)) || C0695Iz.A06.startsWith(A0Z(597, 7, 55)) || C0695Iz.A06.startsWith(A0Z(604, 7, 110)) || C0695Iz.A06.startsWith(A0Z(618, 7, 51))) {
                    return 2;
                }
                if (C0695Iz.A02 < 24) {
                    if (!A0Z(338, 22, 88).equals(str)) {
                    }
                    if (!A0Z(683, 8, 33).equals(C0695Iz.A03)) {
                        str2 = C0695Iz.A03;
                        strA0Z = A0Z(691, 12, 106);
                        strArr = A0e;
                        if (strArr[1].charAt(9) != strArr[6].charAt(9)) {
                            A0e[7] = "EJTrH92MD698cCrSnGocCFo99KF41O7G";
                            if (!strA0Z.equals(str2)) {
                                if (!A0Z(703, 7, 118).equals(C0695Iz.A03)) {
                                    if (A0Z(732, 7, 17).equals(C0695Iz.A03)) {
                                        return 1;
                                    }
                                    return 0;
                                }
                                return 1;
                            }
                            return 1;
                        }
                    } else {
                        return 1;
                    }
                } else {
                    return 0;
                }
            }
        } else if (C0695Iz.A02 < 24) {
            if (!A0Z(338, 22, 88).equals(str) || A0Z(360, 29, 116).equals(str)) {
                if (!A0Z(683, 8, 33).equals(C0695Iz.A03)) {
                    str2 = C0695Iz.A03;
                    strA0Z = A0Z(691, 12, 106);
                    strArr = A0e;
                    if (strArr[1].charAt(9) != strArr[6].charAt(9)) {
                        A0e[7] = "EJTrH92MD698cCrSnGocCFo99KF41O7G";
                        if (!strA0Z.equals(str2)) {
                            if (!A0Z(703, 7, 118).equals(C0695Iz.A03)) {
                                if (A0Z(732, 7, 17).equals(C0695Iz.A03)) {
                                    return 1;
                                }
                                return 0;
                            }
                            return 1;
                        }
                        return 1;
                    }
                } else {
                    return 1;
                }
            } else {
                return 0;
            }
        } else {
            return 0;
        }
        throw new RuntimeException();
    }

    private final long A0X() {
        return 0L;
    }

    public static MediaCodec.CryptoInfo A0Y(X2 x2, int i) {
        MediaCodec.CryptoInfo cryptoInfoA02 = x2.A02.A02();
        if (i == 0) {
            return cryptoInfoA02;
        }
        if (cryptoInfoA02.numBytesOfClearData == null) {
            String[] strArr = A0e;
            if (strArr[1].charAt(9) == strArr[6].charAt(9)) {
                throw new RuntimeException();
            }
            A0e[5] = "UbtyB27B24Biu3n6sBWjRVSN4hFFB4s1";
            cryptoInfoA02.numBytesOfClearData = new int[1];
        }
        int[] iArr = cryptoInfoA02.numBytesOfClearData;
        iArr[0] = iArr[0] + i;
        return cryptoInfoA02;
    }

    private ByteBuffer A0a(int i) {
        if (C0695Iz.A02 >= 21) {
            return this.A06.getInputBuffer(i);
        }
        return this.A0S[i];
    }

    private ByteBuffer A0b(int i) {
        if (C0695Iz.A02 >= 21) {
            return this.A06.getOutputBuffer(i);
        }
        return this.A0T[i];
    }

    private void A0c() {
        if (C0695Iz.A02 < 21) {
            this.A0S = this.A06.getInputBuffers();
            this.A0T = this.A06.getOutputBuffers();
        }
    }

    private void A0d() throws AM {
        if (this.A02 == 2) {
            A1G();
            A1I();
        } else {
            this.A0N = true;
            A1H();
        }
    }

    private void A0e() {
        if (C0695Iz.A02 < 21) {
            this.A0T = this.A06.getOutputBuffers();
        }
    }

    private void A0f() throws AM {
        MediaFormat outputFormat = this.A06.getOutputFormat();
        if (this.A00 != 0 && outputFormat.getInteger(A0Z(739, 5, 6)) == 32 && outputFormat.getInteger(A0Z(716, 6, 81)) == 32) {
            this.A0O = true;
            return;
        }
        if (this.A0I) {
            outputFormat.setInteger(A0Z(632, 13, 29), 1);
        }
        A1K(this.A06, outputFormat);
    }

    private void A0g() {
        if (C0695Iz.A02 < 21) {
            this.A0S = null;
            this.A0T = null;
        }
    }

    private void A0h() {
        this.A03 = -1;
        this.A0X.A01 = null;
    }

    private void A0i() {
        this.A04 = -1;
        this.A0B = null;
    }

    private void A0k(E2 e2) throws AM {
        throw AM.A01(e2, A0y());
    }

    private boolean A0l() {
        if (A0Z(147, 6, 32).equals(C0695Iz.A05)) {
            if (!A0Z(139, 4, 90).equals(C0695Iz.A06)) {
                if (A0Z(135, 4, 82).equals(C0695Iz.A06)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f6, code lost:
    
        if (r12.A0X.A03() == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01f8, code lost:
    
        r12.A0b.add(java.lang.Long.valueOf(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0201, code lost:
    
        r12.A0X.A08();
        A1M(r12.A0X);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x020b, code lost:
    
        if (r6 == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x020e, code lost:
    
        r12.A06.queueInputBuffer(r12.A03, 0, r12.A0X.A01.limit(), r8, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0220, code lost:
    
        r12.A06.queueSecureInputBuffer(r12.A03, 0, A0Y(r12.A0X, r5), r8, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x022f, code lost:
    
        A0h();
        r12.A0J = true;
        r12.A01 = 0;
        r12.A0U.A04++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x023d, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x023e, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0247, code lost:
    
        throw com.facebook.ads.redexgen.X.AM.A01(r1, A0y());
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008f, code lost:
    
        if (r7 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
    
        r12.A0C = false;
        r12.A0X.A01.put(com.facebook.ads.redexgen.X.C3G.A0f);
        r12.A06.queueInputBuffer(r12.A03, 0, com.facebook.ads.redexgen.X.C3G.A0f.length, 0, 0);
        A0h();
        r12.A0J = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00af, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b7, code lost:
    
        if (r7 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ba, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bd, code lost:
    
        if (r12.A0R == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bf, code lost:
    
        r6 = -4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c1, code lost:
    
        if (r6 != (-3)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c3, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c6, code lost:
    
        if (r12.A01 != 1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c8, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c9, code lost:
    
        r8 = r12.A07.A0P.size();
        r6 = com.facebook.ads.redexgen.X.C3G.A0e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e3, code lost:
    
        if (r6[1].charAt(9) == r6[6].charAt(9)) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e5, code lost:
    
        com.facebook.ads.redexgen.X.C3G.A0e[7] = "0VatHXJ47YZXuQNTjh1Q4vWnAJchohqJ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ec, code lost:
    
        if (r7 >= r8) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ee, code lost:
    
        r12.A0X.A01.put(r12.A07.A0P.get(r7));
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0102, code lost:
    
        r6 = com.facebook.ads.redexgen.X.C3G.A0e;
        r6[3] = "zOhD8BhFeW0zpu1geu8qUgn88iwXK5ep";
        r6[0] = "60rX9qlLFkokv4JD1C8g9QKhync8N1Cu";
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x010e, code lost:
    
        if (r7 >= r8) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0111, code lost:
    
        r12.A01 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0113, code lost:
    
        r7 = r12.A0X.A01;
        r6 = com.facebook.ads.redexgen.X.C3G.A0e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0129, code lost:
    
        if (r6[1].charAt(9) == r6[6].charAt(9)) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x012b, code lost:
    
        r6 = com.facebook.ads.redexgen.X.C3G.A0e;
        r6[1] = "39aArsNj3IDVPnG6lUIYrUviornu3auc";
        r6[6] = "ZVN5NvQX1lR02F2nkBpRehMiTRLfpSWC";
        r5 = r7.position();
        r6 = A10(r12.A0W, r12.A0X, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0145, code lost:
    
        r5 = r7.position();
        r6 = A10(r12.A0W, r12.A0X, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0154, code lost:
    
        if (r6 != (-5)) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0158, code lost:
    
        if (r12.A01 != 2) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015a, code lost:
    
        r12.A0X.A07();
        r12.A01 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0161, code lost:
    
        A1L(r12.A0W.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0168, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x016f, code lost:
    
        if (r12.A0X.A04() == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0173, code lost:
    
        if (r12.A01 != 2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0175, code lost:
    
        r12.A0X.A07();
        r12.A01 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017c, code lost:
    
        r12.A0M = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0180, code lost:
    
        if (r12.A0J != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0182, code lost:
    
        A0d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0185, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0188, code lost:
    
        if (r12.A0G == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018b, code lost:
    
        r12.A0K = true;
        r12.A06.queueInputBuffer(r12.A03, 0, 0, 0, 4);
        A0h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x019c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x019d, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a6, code lost:
    
        throw com.facebook.ads.redexgen.X.AM.A01(r1, A0y());
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a9, code lost:
    
        if (r12.A0Q == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01b1, code lost:
    
        if (r12.A0X.A05() != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01b3, code lost:
    
        r12.A0X.A07();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01ba, code lost:
    
        if (r12.A01 != 2) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01bc, code lost:
    
        r12.A01 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01be, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01bf, code lost:
    
        r12.A0Q = false;
        r6 = r12.A0X.A0A();
        r12.A0R = A0w(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01cf, code lost:
    
        if (r12.A0R == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d1, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d4, code lost:
    
        if (r12.A0D == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01d6, code lost:
    
        if (r6 != false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d8, code lost:
    
        com.facebook.ads.redexgen.X.C0675If.A0A(r12.A0X.A01);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01e7, code lost:
    
        if (r12.A0X.A01.position() != 0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e9, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ea, code lost:
    
        r12.A0D = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ec, code lost:
    
        r8 = r12.A0X.A00;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0m() throws com.facebook.ads.redexgen.X.AM {
        /*
            Method dump skipped, instruction units count: 584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C3G.A0m():boolean");
    }

    private boolean A0n() {
        return this.A04 >= 0;
    }

    private boolean A0o(long j) {
        int size = this.A0b.size();
        for (int i = 0; i < size; i++) {
            long jLongValue = this.A0b.get(i).longValue();
            String[] strArr = A0e;
            if (strArr[1].charAt(9) == strArr[6].charAt(9)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0e;
            strArr2[4] = "ML5bMotUrNJfefR5zyFOe6FKAXdvvO6A";
            strArr2[2] = "SdeYytwJjEjJxI17XZFSuNmI9VlWoLpo";
            if (jLongValue == j) {
                this.A0b.remove(i);
                if (A0e[5].charAt(22) != 'm') {
                    String[] strArr3 = A0e;
                    strArr3[4] = "PN0xo47Kt8nFjD42DkF1Rwv3kccfY0ZU";
                    strArr3[2] = "8XhLexKKIuuBUtz2cCFHUx77okN3o4VX";
                    return true;
                }
                String[] strArr4 = A0e;
                strArr4[1] = "MaO0vnTK96XnVNRleRSpONjFXCjP5Eov";
                strArr4[6] = "hUdEzwsPaliJglUJ7NraoDZ4Fn5DncmA";
                return false;
            }
        }
        return false;
    }

    private boolean A0p(long j, long j2) throws AM {
        boolean zA1P;
        int iDequeueOutputBuffer;
        if (!A0n()) {
            if (this.A0F && this.A0K) {
                try {
                    iDequeueOutputBuffer = this.A06.dequeueOutputBuffer(this.A0V, A0X());
                } catch (IllegalStateException unused) {
                    A0d();
                    if (this.A0N) {
                        A1G();
                    }
                    return false;
                }
            } else {
                iDequeueOutputBuffer = this.A06.dequeueOutputBuffer(this.A0V, A0X());
            }
            if (iDequeueOutputBuffer >= 0) {
                if (this.A0O) {
                    this.A0O = false;
                    this.A06.releaseOutputBuffer(iDequeueOutputBuffer, false);
                    return true;
                }
                if (this.A0V.size == 0 && (this.A0V.flags & 4) != 0) {
                    A0d();
                    return false;
                }
                this.A04 = iDequeueOutputBuffer;
                this.A0B = A0b(iDequeueOutputBuffer);
                ByteBuffer byteBuffer = this.A0B;
                if (byteBuffer != null) {
                    byteBuffer.position(this.A0V.offset);
                    this.A0B.limit(this.A0V.offset + this.A0V.size);
                }
                this.A0P = A0o(this.A0V.presentationTimeUs);
            } else {
                if (iDequeueOutputBuffer == -2) {
                    A0f();
                    return true;
                }
                if (iDequeueOutputBuffer == -3) {
                    A0e();
                    return true;
                }
                if (this.A0G && (this.A0M || this.A02 == 2)) {
                    A0d();
                }
                return false;
            }
        }
        boolean z = this.A0F;
        String[] strArr = A0e;
        if (strArr[3].charAt(8) != strArr[0].charAt(8)) {
            String[] strArr2 = A0e;
            strArr2[3] = "H6QEdKrNS5VKUI2eiDzJYDiDaOSTSHZm";
            strArr2[0] = "qtM0JqIstAlLtY5WeeeWIRjDSmIhrDzd";
            if (z && this.A0K) {
                try {
                    zA1P = A1P(j, j2, this.A06, this.A0B, this.A04, this.A0V.flags, this.A0V.presentationTimeUs, this.A0P);
                } catch (IllegalStateException unused2) {
                    A0d();
                    boolean z2 = this.A0N;
                    String[] strArr3 = A0e;
                    if (strArr3[4].charAt(18) == strArr3[2].charAt(18)) {
                        String[] strArr4 = A0e;
                        strArr4[3] = "kLeAoHdKyNjlIY3W2lnlzypZ7jBCZpds";
                        strArr4[0] = "12vglqLCD0wnh38LM4o4LF1q7CPuStNa";
                        if (z2) {
                            A1G();
                        }
                        return false;
                    }
                }
            } else {
                zA1P = A1P(j, j2, this.A06, this.A0B, this.A04, this.A0V.flags, this.A0V.presentationTimeUs, this.A0P);
            }
            if (zA1P) {
                A1J(this.A0V.presentationTimeUs);
                boolean z3 = (this.A0V.flags & 4) != 0;
                A0i();
                if (!z3) {
                    return true;
                }
                A0d();
            }
            return false;
        }
        throw new RuntimeException();
    }

    public static boolean A0q(E0 e0) {
        String str = e0.A02;
        if (C0695Iz.A02 > 17 || (!A0Z(573, 24, 89).equals(str) && !A0Z(426, 31, 118).equals(str))) {
            if (A0Z(147, 6, 32).equals(C0695Iz.A05)) {
                if (!A0Z(143, 4, 72).equals(C0695Iz.A06) || !e0.A05) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean A0r(String str) {
        if (C0695Iz.A02 > 23 || !A0Z(548, 25, 69).equals(str)) {
            if (C0695Iz.A02 <= 19) {
                if (A0Z(710, 6, 87).equals(C0695Iz.A03)) {
                    String[] strArr = A0e;
                    if (strArr[3].charAt(8) == strArr[0].charAt(8)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A0e;
                    strArr2[1] = "95wFKgRrMS7zF0LnDUBUyEKLdOv2pw0Q";
                    strArr2[6] = "8UM2DR4qd3kvfN0lEIyvKJByOBGtF0J9";
                    if (A0Z(457, 31, 90).equals(str) || A0Z(488, 38, 100).equals(str)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static boolean A0s(String str) {
        return C0695Iz.A02 == 21 && A0Z(526, 22, 34).equals(str);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004a  */
    public static boolean A0t(String str) {
        if (C0695Iz.A02 >= 18) {
            if (C0695Iz.A02 == 18) {
                boolean zEquals = A0Z(389, 15, 34).equals(str);
                String[] strArr = A0e;
                if (strArr[3].charAt(8) == strArr[0].charAt(8)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0e;
                strArr2[1] = "meV5e9Kkfi1Cw7qLNaZXa1JKO1Lv4Z7w";
                strArr2[6] = "iFBSwhWIKfzcqDOwhwOBewnG37AI8L0V";
                if (!zEquals && !A0Z(RCHTTPStatusCodes.NOT_FOUND, 22, 19).equals(str)) {
                    if (C0695Iz.A02 == 19 || !C0695Iz.A06.startsWith(A0Z(611, 7, 45)) || (!A0Z(245, 18, 38).equals(str) && !A0Z(263, 25, 64).equals(str))) {
                        return false;
                    }
                }
            } else {
                if (C0695Iz.A02 == 19) {
                }
                return false;
            }
        }
        return true;
    }

    public static boolean A0u(String str, Format format) {
        return C0695Iz.A02 < 21 && format.A0P.isEmpty() && A0Z(313, 25, 36).equals(str);
    }

    public static boolean A0v(String str, Format format) {
        return C0695Iz.A02 <= 18 && format.A05 == 1 && A0Z(288, 25, 17).equals(str);
    }

    private boolean A0w(boolean z) throws AM {
        if (this.A08 == null || (!z && this.A0c)) {
            return false;
        }
        int iA7W = this.A08.A7W();
        if (iA7W != 1) {
            return iA7W != 4;
        }
        throw AM.A01(this.A08.A6Y(), A0y());
    }

    @Override // com.facebook.ads.redexgen.X.E4
    public void A12() {
        this.A07 = null;
        try {
            A1G();
            try {
                if (this.A08 != null) {
                    this.A0Z.ADs(this.A08);
                }
                try {
                    if (this.A09 != null && this.A09 != this.A08) {
                        this.A0Z.ADs(this.A09);
                    }
                } finally {
                    this.A08 = null;
                    this.A09 = null;
                }
            } catch (Throwable th) {
                try {
                    if (this.A09 != null && this.A09 != this.A08) {
                        this.A0Z.ADs(this.A09);
                    }
                    throw th;
                } finally {
                    this.A08 = null;
                    this.A09 = null;
                }
            }
        } catch (Throwable th2) {
            try {
                if (this.A08 != null) {
                    this.A0Z.ADs(this.A08);
                }
                try {
                    if (this.A09 != null && this.A09 != this.A08) {
                        this.A0Z.ADs(this.A09);
                    }
                    throw th2;
                } finally {
                    this.A08 = null;
                    this.A09 = null;
                }
            } catch (Throwable th3) {
                try {
                    if (this.A09 != null && this.A09 != this.A08) {
                        this.A0Z.ADs(this.A09);
                    }
                    throw th3;
                } finally {
                    this.A08 = null;
                    this.A09 = null;
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.E4
    public void A13() {
    }

    @Override // com.facebook.ads.redexgen.X.E4
    public void A14() {
    }

    @Override // com.facebook.ads.redexgen.X.E4
    public void A15(long j, boolean z) throws AM {
        this.A0M = false;
        this.A0N = false;
        if (this.A06 != null) {
            A1F();
        }
    }

    @Override // com.facebook.ads.redexgen.X.E4
    public void A16(boolean z) throws AM {
        this.A0U = new C0530Bw();
    }

    public int A1A(MediaCodec mediaCodec, E0 e0, Format format, Format format2) {
        return 0;
    }

    public final MediaCodec A1C() {
        return this.A06;
    }

    public final E0 A1D() {
        return this.A0A;
    }

    public E0 A1E(E6 e6, Format format, boolean z) throws E9 {
        return e6.A6N(format.A0O, z);
    }

    public void A1F() throws AM {
        this.A05 = -9223372036854775807L;
        A0h();
        A0i();
        this.A0Q = true;
        this.A0R = false;
        this.A0P = false;
        this.A0b.clear();
        this.A0C = false;
        this.A0O = false;
        if (this.A0H || (this.A0E && this.A0K)) {
            A1G();
            A1I();
        } else {
            int i = this.A02;
            if (A0e[7].charAt(4) != 'H') {
                throw new RuntimeException();
            }
            String[] strArr = A0e;
            strArr[1] = "wbouPn2Ftm3cpLG8fvuyld6AKnPflzbx";
            strArr[6] = "bzy96m6ZRNxMDmYLQEfFnOCqhh49XGXp";
            if (i != 0) {
                A1G();
                A1I();
            } else {
                this.A06.flush();
                this.A0J = false;
            }
        }
        if (this.A0L && this.A07 != null) {
            this.A01 = 1;
        }
    }

    public void A1G() {
        this.A05 = -9223372036854775807L;
        A0h();
        A0i();
        this.A0R = false;
        this.A0P = false;
        this.A0b.clear();
        A0g();
        this.A0A = null;
        this.A0L = false;
        this.A0J = false;
        this.A0D = false;
        this.A0H = false;
        this.A00 = 0;
        this.A0G = false;
        this.A0E = false;
        this.A0I = false;
        this.A0C = false;
        this.A0O = false;
        this.A0K = false;
        this.A01 = 0;
        this.A02 = 0;
        if (this.A06 != null) {
            this.A0U.A01++;
            try {
                this.A06.stop();
                try {
                    this.A06.release();
                    this.A06 = null;
                    CL<C1047Ww> cl = this.A08;
                    if (cl != null && this.A09 != cl) {
                        try {
                            this.A0Z.ADs(cl);
                        } finally {
                            this.A08 = null;
                        }
                    }
                } catch (Throwable th) {
                    this.A06 = null;
                    CL<C1047Ww> cl2 = this.A08;
                    if (cl2 != null && this.A09 != cl2) {
                        try {
                            this.A0Z.ADs(cl2);
                        } finally {
                            this.A08 = null;
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    this.A06.release();
                    this.A06 = null;
                    CL<C1047Ww> cl3 = this.A08;
                    if (cl3 != null && this.A09 != cl3) {
                        try {
                            this.A0Z.ADs(cl3);
                        } finally {
                            this.A08 = null;
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    this.A06 = null;
                    CL<C1047Ww> cl4 = this.A08;
                    if (cl4 != null && this.A09 != cl4) {
                        try {
                            this.A0Z.ADs(cl4);
                        } finally {
                            this.A08 = null;
                        }
                    }
                    throw th3;
                }
            }
        }
    }

    public void A1H() throws AM {
    }

    public final void A1I() throws AM {
        Format format;
        long jElapsedRealtime;
        if (this.A06 != null || (format = this.A07) == null) {
            return;
        }
        this.A08 = this.A09;
        String str = format.A0O;
        MediaCrypto mediaCryptoA00 = null;
        boolean zA01 = false;
        CL<C1047Ww> cl = this.A08;
        if (cl != null) {
            C1047Ww c1047Ww = (C1047Ww) cl.A6x();
            if (A0e[5].charAt(22) == 'm') {
                throw new RuntimeException();
            }
            String[] strArr = A0e;
            strArr[1] = "HTFGGBgFgI6ylI68q0FeBZ95y7T9Xgss";
            strArr[6] = "P6HI8GYxdJJ1MGo6JXYXPe6FB7j5p6fI";
            if (c1047Ww == null) {
                if (this.A08.A6Y() == null) {
                    return;
                }
            } else {
                mediaCryptoA00 = c1047Ww.A00();
                zA01 = c1047Ww.A01(str);
            }
            if (A0l()) {
                int iA7W = this.A08.A7W();
                if (iA7W == 1) {
                    throw AM.A01(this.A08.A6Y(), A0y());
                }
                if (A0e[7].charAt(4) != 'H') {
                    if (iA7W != 4) {
                        return;
                    }
                } else {
                    A0e[7] = "zdcyHT7sTCB3al7NiJFn52Vz5qRveBVU";
                    if (iA7W != 4) {
                        return;
                    }
                }
            }
        }
        if (this.A0A == null) {
            try {
                this.A0A = A1E(this.A0a, this.A07, zA01);
                if (this.A0A == null && zA01) {
                    this.A0A = A1E(this.A0a, this.A07, false);
                    if (this.A0A != null) {
                        Log.w(A0Z(227, 18, 36), A0Z(153, 40, 114) + str + A0Z(0, 58, 116) + this.A0A.A02 + A0Z(58, 1, 76));
                    }
                }
            } catch (E9 e) {
                A0k(new E2(this.A07, e, zA01, -49998));
            }
            if (this.A0A == null) {
                A0k(new E2(this.A07, (Throwable) null, zA01, -49999));
            }
        }
        if (!A1Q(this.A0A)) {
            return;
        }
        String str2 = this.A0A.A02;
        this.A00 = A0W(str2);
        this.A0D = A0u(str2, this.A07);
        this.A0H = A0t(str2);
        this.A0G = A0q(this.A0A);
        this.A0E = A0r(str2);
        this.A0F = A0s(str2);
        this.A0I = A0v(str2, this.A07);
        try {
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            StringBuilder sb = new StringBuilder();
            String codecName = A0Z(659, 12, 120);
            sb.append(codecName);
            sb.append(str2);
            String codecName2 = sb.toString();
            C0692Iw.A02(codecName2);
            this.A06 = MediaCodec.createByCodecName(str2);
            C0692Iw.A00();
            String codecName3 = A0Z(645, 14, 72);
            C0692Iw.A02(codecName3);
            A1N(this.A0A, this.A06, this.A07, mediaCryptoA00);
            C0692Iw.A00();
            String codecName4 = A0Z(722, 10, 100);
            C0692Iw.A02(codecName4);
            this.A06.start();
            C0692Iw.A00();
            long jElapsedRealtime3 = SystemClock.elapsedRealtime();
            A1O(str2, jElapsedRealtime3, jElapsedRealtime3 - jElapsedRealtime2);
            A0c();
        } catch (Exception e2) {
            A0k(new E2(this.A07, e2, zA01, str2));
        }
        if (A7W() == 2) {
            jElapsedRealtime = SystemClock.elapsedRealtime() + 1000;
        } else {
            jElapsedRealtime = -9223372036854775807L;
        }
        this.A05 = jElapsedRealtime;
        A0h();
        A0i();
        this.A0Q = true;
        this.A0U.A00++;
    }

    public void A1J(long j) {
    }

    public void A1K(MediaCodec mediaCodec, MediaFormat mediaFormat) throws AM {
    }

    public void A1L(Format format) throws AM {
        DrmInitData drmInitData;
        MediaCodec mediaCodec;
        int iA1A;
        Format format2 = this.A07;
        this.A07 = format;
        DrmInitData drmInitData2 = this.A07.A0H;
        if (format2 == null) {
            drmInitData = null;
        } else {
            drmInitData = format2.A0H;
        }
        if (!C0695Iz.A0g(drmInitData2, drmInitData)) {
            if (this.A07.A0H != null) {
                CM<C1047Ww> cm = this.A0Z;
                if (A0e[5].charAt(22) != 'm') {
                    String[] strArr = A0e;
                    strArr[4] = "js0xY6djzstMh1ZGSSFwxrm9J2KEODfF";
                    strArr[2] = "gNDkR57A7pqknHdJ9eFPG5bc7UDUELIy";
                    if (cm != null) {
                        Looper looperMyLooper = Looper.myLooper();
                        DrmInitData drmInitData3 = this.A07.A0H;
                        if (A0e[5].charAt(22) != 'm') {
                            A0e[7] = "L1yeHoCGmaJe3p3nUxagVjwy9TYWwSRI";
                            this.A09 = cm.A2P(looperMyLooper, drmInitData3);
                            CL<C1047Ww> cl = this.A09;
                            if (cl == this.A08) {
                                CM<C1047Ww> cm2 = this.A0Z;
                                String[] strArr2 = A0e;
                                if (strArr2[1].charAt(9) == strArr2[6].charAt(9)) {
                                    throw new RuntimeException();
                                }
                                String[] strArr3 = A0e;
                                strArr3[1] = "PNJFXv8k8SK4Yjj8VNQjLQpnTp0fAy1J";
                                strArr3[6] = "VCM67JEqNnPycf67Mw9BgN4gUhlxC0Ru";
                                cm2.ADs(cl);
                            }
                        }
                    } else {
                        throw AM.A01(new IllegalStateException(A0Z(193, 34, 103)), A0y());
                    }
                }
                throw new RuntimeException();
            }
            this.A09 = null;
        }
        boolean z = false;
        if (this.A09 == this.A08 && (mediaCodec = this.A06) != null && (iA1A = A1A(mediaCodec, this.A0A, format2, this.A07)) != 0) {
            if (iA1A == 1) {
                z = true;
            } else if (iA1A == 3) {
                z = true;
                this.A0L = true;
                this.A01 = 1;
                int i = this.A00;
                this.A0C = i == 2 || (i == 1 && this.A07.A0F == format2.A0F && this.A07.A08 == format2.A08);
            } else {
                throw new IllegalStateException();
            }
        }
        if (!z) {
            if (this.A0J) {
                this.A02 = 1;
            } else {
                A1G();
                A1I();
            }
        }
    }

    public void A1M(X2 x2) {
    }

    public void A1O(String str, long j, long j2) {
    }

    public boolean A1Q(E0 e0) {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.XG
    public boolean A8R() {
        return this.A0N;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004a  */
    /* JADX WARN: Code duplicated, block: B:16:0x0061  */
    /* JADX WARN: Code duplicated, block: B:18:0x006f  */
    /* JADX WARN: Code duplicated, block: B:22:0x007b  */
    @Override // com.facebook.ads.redexgen.X.XG
    public boolean A8c() {
        long j;
        if (this.A07 != null) {
            boolean z = this.A0R;
            if (A0e[5].charAt(22) == 'm') {
                throw new RuntimeException();
            }
            String[] strArr = A0e;
            strArr[1] = "4HO9JQHKOwc6R3VWcS8R4aXAnHys3aci";
            strArr[6] = "eJ1ha0lSNb53SSfCNHliM2QVteujQRGV";
            if (!z) {
                if (!A18()) {
                    boolean zA0n = A0n();
                    String[] strArr2 = A0e;
                    if (strArr2[3].charAt(8) != strArr2[0].charAt(8)) {
                        A0e[5] = "OQSQFxnlZZo22DxvkKeXHq8FF7pzfl1u";
                        if (!zA0n) {
                            j = this.A05;
                            if (A0e[7].charAt(4) != 'H') {
                                String[] strArr3 = A0e;
                                strArr3[4] = "x7dDRka8TdETs6VLaaF6zooftcMnhKq2";
                                strArr3[2] = "EId5jOcDiZLe1q4ZwHFfLyVQFAikb5sI";
                                if (j != -9223372036854775807L) {
                                    if (SystemClock.elapsedRealtime() < this.A05) {
                                    }
                                }
                            } else {
                                String[] strArr4 = A0e;
                                strArr4[3] = "3vglA6G8yuA12iVw0aFHPuEKtU4GGV7V";
                                strArr4[0] = "dEcUfU5Lns9loW0elZLaj7FKzckicWHS";
                                if (j != -9223372036854775807L) {
                                    if (SystemClock.elapsedRealtime() < this.A05) {
                                    }
                                }
                            }
                        }
                    } else if (!zA0n) {
                        j = this.A05;
                        if (A0e[7].charAt(4) != 'H') {
                            String[] strArr5 = A0e;
                            strArr5[4] = "x7dDRka8TdETs6VLaaF6zooftcMnhKq2";
                            strArr5[2] = "EId5jOcDiZLe1q4ZwHFfLyVQFAikb5sI";
                            if (j != -9223372036854775807L) {
                                if (SystemClock.elapsedRealtime() < this.A05) {
                                }
                            }
                        } else {
                            String[] strArr6 = A0e;
                            strArr6[3] = "3vglA6G8yuA12iVw0aFHPuEKtU4GGV7V";
                            strArr6[0] = "dEcUfU5Lns9loW0elZLaj7FKzckicWHS";
                            if (j != -9223372036854775807L) {
                                if (SystemClock.elapsedRealtime() < this.A05) {
                                }
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.XG
    public final void ADz(long j, long j2) throws AM {
        if (this.A0N) {
            A1H();
            return;
        }
        if (this.A07 == null) {
            this.A0Y.A07();
            int iA10 = A10(this.A0W, this.A0Y, true);
            if (iA10 == -5) {
                A1L(this.A0W.A00);
            } else {
                if (iA10 == -4) {
                    boolean zA04 = this.A0Y.A04();
                    if (A0e[5].charAt(22) == 'm') {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0e;
                    strArr[3] = "l4f2eN3vcaE4L0NqH64hfjdivD8twkW1";
                    strArr[0] = "qiNXaKhyD6I995l1LklLucgRLjJ4pFFW";
                    IK.A04(zA04);
                    this.A0M = true;
                    A0d();
                    return;
                }
                return;
            }
        }
        A1I();
        if (this.A06 != null) {
            C0692Iw.A02(A0Z(671, 12, 16));
            while (A0p(j, j2)) {
            }
            while (A0m()) {
            }
            C0692Iw.A00();
        } else {
            this.A0U.A07 += A0z(j);
            this.A0Y.A07();
            int iA11 = A10(this.A0W, this.A0Y, false);
            if (iA11 == -5) {
                A1L(this.A0W.A00);
            } else if (iA11 == -4) {
                IK.A04(this.A0Y.A04());
                this.A0M = true;
                A0d();
            }
        }
        this.A0U.A00();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0503Au
    public final int AF7(Format format) throws AM {
        try {
            return A1B(this.A0a, this.A0Z, format);
        } catch (E9 e) {
            throw AM.A01(e, A0y());
        }
    }

    @Override // com.facebook.ads.redexgen.X.E4, com.facebook.ads.redexgen.X.InterfaceC0503Au
    public final int AF9() {
        return 8;
    }
}
