package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import com.google.android.gms.ads.AdRequest;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class WU implements InterfaceC0535Cc {
    public static byte[] A0X;
    public static String[] A0Y = {"bw2Pz5UYSLOOesGIJaWlA3GOzVLZPAg", "gG3", "yjdYoV9UEi8qMqqcqGKRK6SXbov0CwAj", "4kzePG", "OMn6r0AgRGwk9BJzU", "o", "aMFqcwP4FMZJ2yTkvuTBoGT2vGZy4ax", "h66GloOgbywQ1e6PB204dGM9vAJrPucq"};
    public static final InterfaceC0538Cf A0Z;
    public static final int A0a;
    public static final Format A0b;
    public static final byte[] A0c;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public InterfaceC0537Ce A0C;
    public DF A0D;
    public C0679Ij A0E;
    public boolean A0F;
    public boolean A0G;
    public InterfaceC0545Co[] A0H;
    public InterfaceC0545Co[] A0I;
    public final int A0J;
    public final SparseArray<DF> A0K;

    @Nullable
    public final DrmInitData A0L;

    @Nullable
    public final InterfaceC0545Co A0M;

    @Nullable
    public final DO A0N;
    public final C0679Ij A0O;
    public final C0679Ij A0P;
    public final C0679Ij A0Q;
    public final C0679Ij A0R;

    @Nullable
    public final C0691Iv A0S;
    public final ArrayDeque<C1025Wa> A0T;
    public final ArrayDeque<DE> A0U;
    public final List<Format> A0V;
    public final byte[] A0W;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Pair<Long, C1046Wv> A04(C0679Ij c0679Ij, long j) throws C0488Af {
        long jA0N;
        long jA0N2;
        c0679Ij.A0Y(8);
        int iA01 = D3.A01(c0679Ij.A08());
        c0679Ij.A0Z(4);
        long jA0M = c0679Ij.A0M();
        if (iA01 == 0) {
            jA0N = c0679Ij.A0M();
            jA0N2 = j + c0679Ij.A0M();
        } else {
            jA0N = c0679Ij.A0N();
            jA0N2 = j + c0679Ij.A0N();
        }
        long jA0F = C0695Iz.A0F(jA0N, 1000000L, jA0M);
        c0679Ij.A0Z(2);
        int iA0I = c0679Ij.A0I();
        int[] iArr = new int[iA0I];
        long[] jArr = new long[iA0I];
        long[] jArr2 = new long[iA0I];
        long[] jArr3 = new long[iA0I];
        if (A0Y[2].charAt(18) != 'K') {
            throw new RuntimeException();
        }
        A0Y[5] = "s";
        int i = 0;
        long jA0F2 = jA0F;
        while (i < iA0I) {
            int iA08 = c0679Ij.A08();
            if ((Integer.MIN_VALUE & iA08) != 0) {
                throw new C0488Af(A0A(581, 28, 75));
            }
            long jA0M2 = c0679Ij.A0M();
            iArr[i] = Integer.MAX_VALUE & iA08;
            jArr[i] = jA0N2;
            jArr3[i] = jA0F2;
            jA0N += jA0M2;
            jA0F2 = C0695Iz.A0F(jA0N, 1000000L, jA0M);
            jArr2[i] = jA0F2 - jArr3[i];
            c0679Ij.A0Z(4);
            int i2 = iArr[i];
            if (A0Y[3].length() != 6) {
                A0Y[1] = "dhc";
                jA0N2 += (long) i2;
                i += 0;
            } else {
                A0Y[5] = "h";
                jA0N2 += (long) i2;
                i++;
            }
        }
        return Pair.create(Long.valueOf(jA0F), new C1046Wv(iArr, jArr, jArr2, jArr3));
    }

    public static String A0A(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0X, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 85);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0D() {
        A0X = new byte[]{76, 64, 11, 62, 37, 39, 106, 57, 35, 48, 47, 106, 38, 47, 57, 57, 106, 62, 34, 43, 36, 106, 34, 47, 43, 46, 47, 56, 106, 38, 47, 36, 45, 62, 34, 106, 98, 63, 36, 57, 63, 58, 58, 37, 56, 62, 47, 46, 99, 100, 104, 67, 89, 95, 84, 13, 78, 66, 88, 67, 89, 13, 68, 67, 13, 94, 79, 74, 93, 13, 12, 16, 13, 28, 13, 5, 88, 67, 94, 88, 93, 93, 66, 95, 89, 72, 73, 4, 3, 5, 46, 52, 50, 57, 96, 35, 47, 53, 46, 52, 96, 41, 46, 96, 51, 39, 48, 36, 96, 97, 125, 96, 113, 96, 104, 53, 46, 51, 53, 48, 48, 47, 50, 52, 37, 36, 105, 110, 29, 41, 58, 60, 54, 62, 53, 47, 62, 63, 22, 43, 111, 30, 35, 47, 41, 58, 56, 47, 52, 41, 4, 42, 35, 34, 63, 36, 35, 42, 109, 35, 40, 42, 44, 57, 36, 59, 40, 109, 34, 43, 43, 62, 40, 57, 109, 57, 34, 109, 62, 44, 32, 61, 33, 40, 109, 41, 44, 57, 44, 99, 110, 71, 67, 68, 2, 67, 86, 77, 79, 2, 70, 71, 68, 75, 76, 71, 81, 2, 71, 90, 86, 71, 76, 70, 71, 70, 2, 67, 86, 77, 79, 2, 81, 75, 88, 71, 2, 10, 87, 76, 81, 87, 82, 82, 77, 80, 86, 71, 70, 11, 12, 38, 15, 11, 12, 74, 11, 30, 5, 7, 74, 29, 3, 30, 2, 74, 6, 15, 4, 13, 30, 2, 74, 84, 74, 88, 91, 94, 93, 94, 82, 89, 92, 94, 93, 74, 66, 31, 4, 25, 31, 26, 26, 5, 24, 30, 15, 14, 67, 68, 97, 72, 67, 74, 89, 69, 13, 64, 68, 94, 64, 76, 89, 78, 69, 23, 13, 88, 113, 113, 100, 114, 99, 55, 99, 120, 55, 114, 121, 116, 101, 110, 103, 99, 126, 120, 121, 55, 115, 118, 99, 118, 55, 96, 118, 100, 55, 121, 114, 112, 118, 99, 126, 97, 114, 57, 22, 63, 63, 42, 60, 45, 121, 45, 54, 121, 60, 55, 61, 121, 54, 63, 121, 52, 61, 56, 45, 121, 46, 56, 42, 121, 55, 60, 62, 56, 45, 48, 47, 60, 119, 84, 109, 126, 105, 105, 114, 127, 114, 117, 124, 59, 79, 105, 122, 120, 112, 94, 117, 120, 105, 98, 107, 111, 114, 116, 117, 89, 116, 99, 59, 107, 122, 105, 122, 118, 126, 111, 126, 105, 104, 59, 114, 104, 59, 110, 117, 104, 110, 107, 107, 116, 105, 111, 126, 127, 53, 107, 83, 81, 72, 72, 93, 92, 24, 72, 75, 75, 80, 24, 89, 76, 87, 85, 24, 16, 94, 89, 81, 84, 93, 92, 24, 76, 87, 24, 93, 64, 76, 74, 89, 91, 76, 24, 77, 77, 81, 92, 17, 105, 81, 83, 74, 74, 83, 84, 93, 26, 91, 78, 85, 87, 26, 77, 83, 78, 82, 26, 86, 95, 84, 93, 78, 82, 26, 4, 26, 8, 11, 14, 13, 14, 2, 9, 12, 14, 13, 26, 18, 79, 84, 73, 79, 74, 74, 85, 72, 78, 95, 94, 19, 20, 11, 48, 59, 38, 46, 59, 61, 42, 59, 58, 126, 51, 49, 49, 40, 126, 60, 49, 38, 112, 95, 100, 111, 114, 122, 111, 105, 126, 111, 110, 42, 121, 107, 99, 101, 42, 111, 100, 126, 120, 115, 42, 105, 101, 127, 100, 126, 48, 42, 75, 112, 118, 127, 112, 122, 114, 123, 122, 62, 119, 112, 122, 119, 108, 123, 125, 106, 62, 108, 123, 120, 123, 108, 123, 112, 125, 123, 41, 30, 13, 22, 30, 29, 19, 26, 95, 19, 26, 17, 24, 11, 23, 95, 27, 26, 12, 28, 13, 22, 15, 11, 22, 16, 17, 95, 22, 17, 95, 12, 24, 15, 27, 95, 25, 16, 10, 17, 27, 95, 87, 10, 17, 12, 10, 15, 15, 16, 13, 11, 26, 27, 86, 3, 18, 18, 14, 11, 1, 3, 22, 11, 13, 12, 77, 26, 79, 7, 15, 17, 5, 62, 40, 36, 42, 46, 49, 60, 61, 55, 119, 48, 61, 46, 59, 61, 34, 47, 46, 36, 100, 38, 59, 127};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0M(C1025Wa c1025Wa, SparseArray<DF> sparseArray, int i, byte[] bArr) throws C0488Af {
        DF dfA09 = A09(c1025Wa.A07(D3.A1I).A00, sparseArray);
        if (dfA09 == null) {
            return;
        }
        DQ dq = dfA09.A07;
        long jA02 = dq.A06;
        dfA09.A04();
        if (c1025Wa.A07(D3.A1H) != null && (i & 2) == 0) {
            jA02 = A02(c1025Wa.A07(D3.A1H).A00);
        }
        A0N(c1025Wa, dfA09, jA02, i);
        DP dpA00 = dfA09.A05.A00(dq.A07.A02);
        WZ wzA07 = c1025Wa.A07(D3.A0u);
        if (wzA07 != null) {
            A0P(dpA00, wzA07.A00, dq);
        }
        WZ wzA08 = c1025Wa.A07(D3.A0t);
        if (wzA08 != null) {
            A0S(wzA08.A00, dq);
        }
        WZ wzA09 = c1025Wa.A07(D3.A10);
        if (wzA09 != null) {
            A0T(wzA09.A00, dq);
        }
        WZ wzA010 = c1025Wa.A07(D3.A0x);
        WZ wzA011 = c1025Wa.A07(D3.A11);
        if (wzA010 != null && wzA011 != null) {
            A0V(wzA010.A00, wzA011.A00, dpA00 != null ? dpA00.A02 : null, dq);
        }
        int size = c1025Wa.A02.size();
        for (int i2 = 0; i2 < size; i2++) {
            WZ wz = c1025Wa.A02.get(i2);
            int i3 = ((D3) wz).A00;
            int i4 = D3.A1Q;
            if (A0Y[7].charAt(27) != 'r') {
                throw new RuntimeException();
            }
            String[] strArr = A0Y;
            strArr[6] = "tWuQt3qCpORkhzaHtCNFkUwj420xxTd";
            strArr[4] = "yKRRCTery0iDoE3P4";
            if (i3 == i4) {
                A0U(wz.A00, dq, bArr);
            }
        }
    }

    static {
        A0D();
        A0Z = new WV();
        A0a = C0695Iz.A08(A0A(682, 4, 24));
        A0c = new byte[]{-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
        A0b = Format.A02(null, A0A(664, 18, 55), Long.MAX_VALUE);
    }

    public WU() {
        this(0);
    }

    public WU(int i) {
        this(i, null);
    }

    public WU(int i, @Nullable C0691Iv c0691Iv) {
        this(i, c0691Iv, null, null);
    }

    public WU(int i, @Nullable C0691Iv c0691Iv, @Nullable DO r9, @Nullable DrmInitData drmInitData) {
        this(i, c0691Iv, r9, drmInitData, Collections.emptyList());
    }

    public WU(int i, @Nullable C0691Iv c0691Iv, @Nullable DO r10, @Nullable DrmInitData drmInitData, List<Format> closedCaptionFormats) {
        this(i, c0691Iv, r10, drmInitData, closedCaptionFormats, null);
    }

    public WU(int i, @Nullable C0691Iv c0691Iv, @Nullable DO r6, @Nullable DrmInitData drmInitData, List<Format> list, @Nullable InterfaceC0545Co interfaceC0545Co) {
        this.A0J = (r6 != null ? 8 : 0) | i;
        this.A0S = c0691Iv;
        this.A0N = r6;
        this.A0L = drmInitData;
        List<Format> closedCaptionFormats = Collections.unmodifiableList(list);
        this.A0V = closedCaptionFormats;
        this.A0M = interfaceC0545Co;
        this.A0O = new C0679Ij(16);
        this.A0R = new C0679Ij(C0675If.A03);
        this.A0Q = new C0679Ij(5);
        this.A0P = new C0679Ij();
        this.A0W = new byte[16];
        this.A0T = new ArrayDeque<>();
        this.A0U = new ArrayDeque<>();
        this.A0K = new SparseArray<>();
        this.A08 = -9223372036854775807L;
        this.A0A = -9223372036854775807L;
        this.A0B = -9223372036854775807L;
        A0B();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:51:0x010a  */
    public static int A00(DF df, int fullAtom, long j, int i, C0679Ij c0679Ij, int i2) {
        boolean z;
        int iA0H;
        int iA08;
        long j2 = j;
        int sampleOffset = i2;
        c0679Ij.A0Y(8);
        int iA00 = D3.A00(c0679Ij.A08());
        DO r6 = df.A05;
        DQ dq = df.A07;
        D9 d9 = dq.A07;
        dq.A0E[fullAtom] = c0679Ij.A0H();
        dq.A0G[fullAtom] = dq.A05;
        if ((iA00 & 1) != 0) {
            long[] jArr = dq.A0G;
            jArr[fullAtom] = jArr[fullAtom] + ((long) c0679Ij.A08());
        }
        int i3 = iA00 & 4;
        if (A0Y[0].length() != 21) {
            A0Y[3] = "8XvOch";
            boolean z2 = i3 != 0;
            int iA0H2 = d9.A01;
            if (z2) {
                iA0H2 = c0679Ij.A0H();
            }
            int firstSampleFlags = iA00 & 256;
            boolean z3 = firstSampleFlags != 0;
            int firstSampleFlags2 = iA00 & AdRequest.MAX_CONTENT_URL_LENGTH;
            boolean z4 = firstSampleFlags2 != 0;
            int i4 = iA00 & 1024;
            String[] strArr = A0Y;
            String str = strArr[6];
            String str2 = strArr[4];
            int length = str.length();
            int firstSampleFlags3 = str2.length();
            if (length == firstSampleFlags3) {
                throw new RuntimeException();
            }
            A0Y[5] = "V";
            boolean z5 = i4 != 0;
            int i5 = iA00 & 2048;
            String[] strArr2 = A0Y;
            String str3 = strArr2[6];
            String str4 = strArr2[4];
            int length2 = str3.length();
            int firstSampleFlags4 = str4.length();
            if (length2 != firstSampleFlags4) {
                A0Y[7] = "zasX3ZRNe0snbS49DsjMO0V1ZwarOc1g";
                if (i5 != 0) {
                    z = true;
                } else {
                    z = false;
                }
            } else if (i5 != 0) {
                z = true;
            } else {
                z = false;
            }
            long jA0F = 0;
            if (r6.A08 != null) {
                int firstSampleFlags5 = r6.A08.length;
                if (firstSampleFlags5 == 1 && r6.A08[0] == 0) {
                    jA0F = C0695Iz.A0F(r6.A09[0], 1000L, r6.A06);
                }
            }
            int[] iArr = dq.A0D;
            int[] iArr2 = dq.A0C;
            long[] jArr2 = dq.A0F;
            boolean[] zArr = dq.A0I;
            boolean z6 = r6.A03 == 2 && (i & 1) != 0;
            int i6 = sampleOffset + dq.A0E[fullAtom];
            long j3 = r6.A06;
            if (fullAtom > 0) {
                j2 = dq.A06;
            }
            if (A0Y[2].charAt(18) != 'K') {
                throw new RuntimeException();
            }
            A0Y[1] = "0M8";
            while (sampleOffset < i6) {
                int iA0H3 = z3 ? c0679Ij.A0H() : d9.A00;
                if (z4) {
                    iA0H = c0679Ij.A0H();
                } else {
                    iA0H = d9.A03;
                    if (A0Y[2].charAt(18) != 'K') {
                        A0Y[7] = "sKwSwUd4PCPXhg8k3ZAVhQXOLBVrWjfV";
                    } else {
                        A0Y[5] = "6";
                    }
                }
                if (sampleOffset == 0 && z2) {
                    iA08 = iA0H2;
                } else {
                    iA08 = z5 ? c0679Ij.A08() : d9.A01;
                }
                if (z) {
                    int sampleSize = c0679Ij.A08();
                    iArr2[sampleOffset] = (int) ((((long) sampleSize) * 1000) / j3);
                } else {
                    iArr2[sampleOffset] = 0;
                }
                jArr2[sampleOffset] = C0695Iz.A0F(j2, 1000L, j3) - jA0F;
                if (A0Y[5].length() == 1) {
                    A0Y[5] = "r";
                    iArr[sampleOffset] = iA0H;
                    zArr[sampleOffset] = ((iA08 >> 16) & 1) == 0 && (!z6 || sampleOffset == 0);
                    j2 += (long) iA0H3;
                    sampleOffset++;
                }
            }
            dq.A06 = j2;
            return i6;
        }
        throw new RuntimeException();
    }

    public static long A01(C0679Ij c0679Ij) {
        c0679Ij.A0Y(8);
        int version = D3.A01(c0679Ij.A08());
        return version == 0 ? c0679Ij.A0M() : c0679Ij.A0N();
    }

    public static long A02(C0679Ij c0679Ij) {
        c0679Ij.A0Y(8);
        return D3.A01(c0679Ij.A08()) == 1 ? c0679Ij.A0N() : c0679Ij.A0M();
    }

    public static Pair<Integer, D9> A03(C0679Ij c0679Ij) {
        c0679Ij.A0Y(12);
        int defaultSampleDuration = c0679Ij.A08();
        int defaultSampleFlags = c0679Ij.A0H() - 1;
        return Pair.create(Integer.valueOf(defaultSampleDuration), new D9(defaultSampleFlags, c0679Ij.A0H(), c0679Ij.A0H(), c0679Ij.A08()));
    }

    public static DrmInitData A05(List<WZ> list) {
        ArrayList arrayList = null;
        int i = list.size();
        for (int i2 = 0; i2 < i; i2++) {
            WZ wz = list.get(i2);
            if (((D3) wz).A00 == D3.A0r) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = wz.A00.A00;
                UUID uuidA03 = DL.A03(bArr);
                if (uuidA03 == null) {
                    Log.w(A0A(128, 22, 14), A0A(437, 42, 109));
                } else {
                    arrayList.add(new DrmInitData.SchemeData(uuidA03, A0A(696, 9, 30), bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    private D9 A06(SparseArray<D9> sparseArray, int i) {
        if (sparseArray.size() != 1) {
            return (D9) IK.A01(sparseArray.get(i));
        }
        if (A0Y[7].charAt(27) != 'r') {
            throw new RuntimeException();
        }
        A0Y[3] = "nw8rk4";
        return sparseArray.valueAt(0);
    }

    public static DF A07(SparseArray<DF> sparseArray) {
        DF df = null;
        long j = Long.MAX_VALUE;
        int i = sparseArray.size();
        for (int i2 = 0; i2 < i; i2++) {
            DF dfValueAt = sparseArray.valueAt(i2);
            if (dfValueAt.A02 != dfValueAt.A07.A02) {
                long j2 = dfValueAt.A07.A0G[dfValueAt.A02];
                if (j2 < j) {
                    df = dfValueAt;
                    j = j2;
                }
            }
        }
        return df;
    }

    @Nullable
    public static DF A08(SparseArray<DF> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        DF df = sparseArray.get(i);
        if (A0Y[0].length() == 21) {
            throw new RuntimeException();
        }
        A0Y[1] = "fYJ";
        return df;
    }

    public static DF A09(C0679Ij c0679Ij, SparseArray<DF> sparseArray) {
        int iA0H;
        int iA0H2;
        int iA0H3;
        int iA0H4;
        c0679Ij.A0Y(8);
        int iA00 = D3.A00(c0679Ij.A08());
        int trackId = c0679Ij.A08();
        DF dfA08 = A08(sparseArray, trackId);
        if (dfA08 == null) {
            return null;
        }
        if ((iA00 & 1) != 0) {
            long jA0N = c0679Ij.A0N();
            dfA08.A07.A05 = jA0N;
            dfA08.A07.A04 = jA0N;
        }
        D9 d9 = dfA08.A04;
        if ((iA00 & 2) != 0) {
            iA0H = c0679Ij.A0H() - 1;
        } else {
            iA0H = d9.A02;
        }
        int defaultSampleDescriptionIndex = iA00 & 8;
        if (defaultSampleDescriptionIndex != 0) {
            iA0H2 = c0679Ij.A0H();
        } else {
            iA0H2 = d9.A00;
        }
        int defaultSampleDescriptionIndex2 = iA00 & 16;
        if (defaultSampleDescriptionIndex2 != 0) {
            iA0H3 = c0679Ij.A0H();
        } else {
            iA0H3 = d9.A03;
        }
        int defaultSampleSize = iA00 & 32;
        if (defaultSampleSize != 0) {
            iA0H4 = c0679Ij.A0H();
        } else {
            iA0H4 = d9.A01;
        }
        dfA08.A07.A07 = new D9(iA0H, iA0H2, iA0H3, iA0H4);
        return dfA08;
    }

    private void A0B() {
        this.A02 = 0;
        this.A00 = 0;
    }

    private void A0C() {
        if (this.A0I == null) {
            this.A0I = new InterfaceC0545Co[2];
            int i = 0;
            InterfaceC0545Co interfaceC0545Co = this.A0M;
            if (interfaceC0545Co != null) {
                int emsgTrackOutputCount = 0 + 1;
                this.A0I[0] = interfaceC0545Co;
                i = emsgTrackOutputCount;
            }
            int emsgTrackOutputCount2 = this.A0J;
            if ((emsgTrackOutputCount2 & 4) != 0) {
                InterfaceC0545Co[] interfaceC0545CoArr = this.A0I;
                InterfaceC0537Ce interfaceC0537Ce = this.A0C;
                int emsgTrackOutputCount3 = this.A0K.size();
                interfaceC0545CoArr[i] = interfaceC0537Ce.AFD(emsgTrackOutputCount3, 4);
                i++;
            }
            this.A0I = (InterfaceC0545Co[]) Arrays.copyOf(this.A0I, i);
            for (InterfaceC0545Co interfaceC0545Co2 : this.A0I) {
                interfaceC0545Co2.A5V(A0b);
            }
        }
        if (this.A0H == null) {
            this.A0H = new InterfaceC0545Co[this.A0V.size()];
            for (int i2 = 0; i2 < this.A0H.length; i2++) {
                InterfaceC0545Co interfaceC0545CoAFD = this.A0C.AFD(this.A0K.size() + 1 + i2, 3);
                interfaceC0545CoAFD.A5V(this.A0V.get(i2));
                this.A0H[i2] = interfaceC0545CoAFD;
                String[] strArr = A0Y;
                if (strArr[6].length() == strArr[4].length()) {
                    throw new RuntimeException();
                }
                A0Y[7] = "E0z9VN5IoStoNoHPwfepvpkncforV8p8";
            }
        }
    }

    private void A0E(long j) {
        while (!this.A0U.isEmpty()) {
            DE deRemoveFirst = this.A0U.removeFirst();
            this.A03 -= deRemoveFirst.A00;
            long jA06 = j + deRemoveFirst.A01;
            C0691Iv c0691Iv = this.A0S;
            if (c0691Iv != null) {
                jA06 = c0691Iv.A06(jA06);
            }
            for (InterfaceC0545Co interfaceC0545Co : this.A0I) {
                interfaceC0545Co.AEH(jA06, 1, deRemoveFirst.A00, this.A03, null);
            }
        }
    }

    private void A0F(long j) throws C0488Af {
        while (!this.A0T.isEmpty() && this.A0T.peek().A00 == j) {
            A0I(this.A0T.pop());
        }
        A0B();
    }

    private void A0G(InterfaceC0536Cd interfaceC0536Cd) throws InterruptedException, IOException {
        int i = ((int) this.A07) - this.A00;
        C0679Ij c0679Ij = this.A0E;
        if (c0679Ij != null) {
            interfaceC0536Cd.readFully(c0679Ij.A00, 8, i);
            A0O(new WZ(this.A01, this.A0E), interfaceC0536Cd.A7F());
        } else {
            interfaceC0536Cd.AEt(i);
        }
        A0F(interfaceC0536Cd.A7F());
    }

    private void A0H(InterfaceC0536Cd interfaceC0536Cd) throws InterruptedException, IOException {
        DF dfValueAt = null;
        long j = Long.MAX_VALUE;
        int size = this.A0K.size();
        for (int i = 0; i < size; i++) {
            DQ dq = this.A0K.valueAt(i).A07;
            if (dq.A0B) {
                long j2 = dq.A04;
                if (A0Y[2].charAt(18) != 'K') {
                    throw new RuntimeException();
                }
                A0Y[3] = "TcDom5";
                if (j2 < j) {
                    j = dq.A04;
                    dfValueAt = this.A0K.valueAt(i);
                }
            }
        }
        if (dfValueAt == null) {
            if (A0Y[3].length() != 6) {
                throw new RuntimeException();
            }
            A0Y[2] = "BU1FqSGZUKIp3lmSYzKBGxc2Z86jKcpe";
            this.A02 = 3;
            return;
        }
        long jA7F = j - interfaceC0536Cd.A7F();
        if (A0Y[3].length() != 6) {
            throw new RuntimeException();
        }
        A0Y[0] = "Cvsa72edMITB5GhT";
        int bytesToSkip = (int) jA7F;
        if (bytesToSkip >= 0) {
            interfaceC0536Cd.AEt(bytesToSkip);
            dfValueAt.A07.A04(interfaceC0536Cd);
            return;
        }
        throw new C0488Af(A0A(307, 39, 66));
    }

    private void A0I(C1025Wa c1025Wa) throws C0488Af {
        if (((D3) c1025Wa).A00 == D3.A0j) {
            A0K(c1025Wa);
            return;
        }
        if (((D3) c1025Wa).A00 == D3.A0i) {
            A0J(c1025Wa);
            return;
        }
        if (this.A0T.isEmpty()) {
            return;
        }
        ArrayDeque<C1025Wa> arrayDeque = this.A0T;
        if (A0Y[1].length() != 3) {
            throw new RuntimeException();
        }
        A0Y[7] = "6RjYlEZz613sKxZIpZ2APlvoVeArWnyB";
        arrayDeque.peek().A08(c1025Wa);
    }

    private void A0J(C1025Wa c1025Wa) throws C0488Af {
        A0L(c1025Wa, this.A0K, this.A0J, this.A0W);
        DrmInitData drmInitDataA05 = this.A0L != null ? null : A05(c1025Wa.A02);
        if (drmInitDataA05 != null) {
            int i = this.A0K.size();
            for (int i2 = 0; i2 < i; i2++) {
                this.A0K.valueAt(i2).A06(drmInitDataA05);
            }
        }
        if (this.A0A != -9223372036854775807L) {
            int size = this.A0K.size();
            for (int i3 = 0; i3 < size; i3++) {
                this.A0K.valueAt(i3).A05(this.A0A);
            }
            this.A0A = -9223372036854775807L;
        }
    }

    private void A0K(C1025Wa c1025Wa) throws C0488Af {
        IK.A06(this.A0N == null, A0A(532, 20, 11));
        DrmInitData drmInitDataA05 = this.A0L;
        if (drmInitDataA05 == null) {
            drmInitDataA05 = A05(c1025Wa.A02);
        }
        C1025Wa c1025WaA06 = c1025Wa.A06(D3.A0m);
        SparseArray<D9> sparseArray = new SparseArray<>();
        long jA01 = -9223372036854775807L;
        int size = c1025WaA06.A02.size();
        for (int i = 0; i < size; i++) {
            WZ wz = c1025WaA06.A02.get(i);
            int i2 = ((D3) wz).A00;
            if (i2 == D3.A1M) {
                Pair<Integer, D9> pairA03 = A03(wz.A00);
                int i3 = ((Integer) pairA03.first).intValue();
                sparseArray.put(i3, (D9) pairA03.second);
            } else {
                int i4 = ((D3) wz).A00;
                if (i4 == D3.A0f) {
                    jA01 = A01(wz.A00);
                }
            }
        }
        SparseArray sparseArray2 = new SparseArray();
        int size2 = c1025Wa.A01.size();
        for (int i5 = 0; i5 < size2; i5++) {
            C1025Wa c1025Wa2 = c1025Wa.A01.get(i5);
            int i6 = ((D3) c1025Wa2).A00;
            if (i6 == D3.A1L) {
                DO doA0C = D8.A0C(c1025Wa2, c1025Wa.A07(D3.A0n), jA01, drmInitDataA05, (this.A0J & 16) != 0, false);
                if (doA0C != null) {
                    int i7 = doA0C.A00;
                    sparseArray2.put(i7, doA0C);
                }
            }
        }
        int size3 = sparseArray2.size();
        if (this.A0K.size() == 0) {
            for (int i8 = 0; i8 < size3; i8++) {
                DO r10 = (DO) sparseArray2.valueAt(i8);
                InterfaceC0537Ce interfaceC0537Ce = this.A0C;
                int i9 = r10.A03;
                DF df = new DF(interfaceC0537Ce.AFD(i8, i9));
                int i10 = r10.A00;
                df.A07(r10, A06(sparseArray, i10));
                SparseArray<DF> sparseArray3 = this.A0K;
                int i11 = r10.A00;
                sparseArray3.put(i11, df);
                this.A08 = Math.max(this.A08, r10.A04);
            }
            A0C();
            if (A0Y[5].length() != 1) {
                throw new RuntimeException();
            }
            A0Y[5] = "d";
            this.A0C.A5D();
            return;
        }
        IK.A04(this.A0K.size() == size3);
        for (int i12 = 0; i12 < size3; i12++) {
            DO r2 = (DO) sparseArray2.valueAt(i12);
            this.A0K.get(r2.A00).A07(r2, A06(sparseArray, r2.A00));
        }
    }

    public static void A0L(C1025Wa c1025Wa, SparseArray<DF> sparseArray, int i, byte[] bArr) throws C0488Af {
        int size = c1025Wa.A01.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1025Wa c1025Wa2 = c1025Wa.A01.get(i2);
            if (((D3) c1025Wa2).A00 == D3.A1K) {
                A0M(c1025Wa2, sparseArray, i, bArr);
            }
        }
    }

    public static void A0N(C1025Wa c1025Wa, DF df, long j, int i) {
        int totalSampleCount = 0;
        int trunSampleCount = 0;
        List<WZ> list = c1025Wa.A02;
        int leafChildrenSize = list.size();
        for (int totalSampleCount2 = 0; totalSampleCount2 < leafChildrenSize; totalSampleCount2++) {
            WZ wz = list.get(totalSampleCount2);
            int i2 = ((D3) wz).A00;
            int i3 = D3.A1N;
            if (A0Y[2].charAt(18) != 'K') {
                throw new RuntimeException();
            }
            A0Y[0] = "HX3CrwnoNkNpp8Diq6RFqVXtJKh";
            if (i2 == i3) {
                C0679Ij c0679Ij = wz.A00;
                c0679Ij.A0Y(12);
                int iA0H = c0679Ij.A0H();
                if (iA0H > 0) {
                    trunSampleCount += iA0H;
                    totalSampleCount++;
                }
            }
        }
        df.A02 = 0;
        df.A00 = 0;
        df.A01 = 0;
        df.A07.A03(totalSampleCount, trunSampleCount);
        int i4 = 0;
        int iA00 = 0;
        if (A0Y[7].charAt(27) == 'r') {
            A0Y[1] = "K2a";
        }
        for (int i5 = 0; i5 < leafChildrenSize; i5++) {
            WZ wz2 = list.get(i5);
            if (((D3) wz2).A00 == D3.A1N) {
                iA00 = A00(df, i4, j, i, wz2.A00, iA00);
                i4++;
            }
        }
    }

    private void A0O(WZ wz, long j) throws C0488Af {
        if (!this.A0T.isEmpty()) {
            this.A0T.peek().A09(wz);
            return;
        }
        if (((D3) wz).A00 == D3.A12) {
            Pair<Long, C1046Wv> pairA04 = A04(wz.A00, j);
            this.A0B = ((Long) pairA04.first).longValue();
            this.A0C.AEM((InterfaceC0542Cl) pairA04.second);
            this.A0F = true;
            return;
        }
        if (((D3) wz).A00 != D3.A0P) {
            return;
        }
        A0Q(wz.A00);
    }

    public static void A0P(DP dp, C0679Ij c0679Ij, DQ dq) throws C0488Af {
        int flags = dp.A00;
        c0679Ij.A0Y(8);
        if ((D3.A00(c0679Ij.A08()) & 1) == 1) {
            c0679Ij.A0Z(8);
        }
        int vectorSize = c0679Ij.A0E();
        int iA0H = c0679Ij.A0H();
        String[] strArr = A0Y;
        if (strArr[6].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        A0Y[3] = "qY4fk5";
        if (iA0H == dq.A00) {
            int i = 0;
            if (vectorSize == 0) {
                boolean[] zArr = dq.A0H;
                for (int sampleCount = 0; sampleCount < iA0H; sampleCount++) {
                    int totalSize = c0679Ij.A0E();
                    i += totalSize;
                    zArr[sampleCount] = totalSize > flags;
                }
            } else {
                boolean z = vectorSize > flags;
                int i2 = vectorSize * iA0H;
                i = 0 + i2;
                Arrays.fill(dq.A0H, 0, iA0H, z);
            }
            dq.A02(i);
            return;
        }
        throw new C0488Af(A0A(290, 17, 120) + iA0H + A0A(0, 2, 53) + dq.A00);
    }

    private void A0Q(C0679Ij c0679Ij) {
        InterfaceC0545Co[] interfaceC0545CoArr = this.A0I;
        if (interfaceC0545CoArr == null || interfaceC0545CoArr.length == 0) {
            return;
        }
        c0679Ij.A0Y(12);
        int iA04 = c0679Ij.A04();
        c0679Ij.A0Q();
        c0679Ij.A0Q();
        long jA0M = c0679Ij.A0M();
        long timescale = c0679Ij.A0M();
        long jA0F = C0695Iz.A0F(timescale, 1000000L, jA0M);
        for (InterfaceC0545Co interfaceC0545Co : this.A0I) {
            c0679Ij.A0Y(12);
            interfaceC0545Co.AEG(c0679Ij, iA04);
        }
        long j = this.A0B;
        if (j != -9223372036854775807L) {
            long jA06 = j + jA0F;
            C0691Iv c0691Iv = this.A0S;
            if (c0691Iv != null) {
                jA06 = c0691Iv.A06(jA06);
            }
            for (InterfaceC0545Co interfaceC0545Co2 : this.A0I) {
                interfaceC0545Co2.AEH(jA06, 1, iA04, 0, null);
            }
            return;
        }
        this.A0U.addLast(new DE(jA0F, iA04));
        this.A03 += iA04;
    }

    public static void A0R(C0679Ij c0679Ij, int i, DQ dq) throws C0488Af {
        c0679Ij.A0Y(i + 8);
        int iA00 = D3.A00(c0679Ij.A08());
        if ((iA00 & 1) == 0) {
            boolean z = (iA00 & 2) != 0;
            int iA0H = c0679Ij.A0H();
            int i2 = dq.A00;
            if (A0Y[2].charAt(18) != 'K') {
                throw new RuntimeException();
            }
            String[] strArr = A0Y;
            strArr[6] = "UNCiZzJs5PDRpvixsYfSSk1mhxuZgiq";
            strArr[4] = "wrSUtL8XPGusZqeHm";
            if (iA0H == i2) {
                Arrays.fill(dq.A0H, 0, iA0H, z);
                int sampleCount = c0679Ij.A04();
                dq.A02(sampleCount);
                dq.A05(c0679Ij);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(A0A(290, 17, 120));
            sb.append(iA0H);
            sb.append(A0A(0, 2, 53));
            int sampleCount2 = dq.A00;
            sb.append(sampleCount2);
            throw new C0488Af(sb.toString());
        }
        throw new C0488Af(A0A(381, 56, 78));
    }

    public static void A0S(C0679Ij c0679Ij, DQ dq) throws C0488Af {
        c0679Ij.A0Y(8);
        int iA08 = c0679Ij.A08();
        if ((D3.A00(iA08) & 1) == 1) {
            c0679Ij.A0Z(8);
        }
        int iA0H = c0679Ij.A0H();
        int flags = A0Y[3].length();
        if (flags != 6) {
            throw new RuntimeException();
        }
        A0Y[3] = "xMtqR0";
        if (iA0H == 1) {
            long jA0M = dq.A04 + (D3.A01(iA08) == 0 ? c0679Ij.A0M() : c0679Ij.A0N());
            String[] strArr = A0Y;
            String str = strArr[6];
            String str2 = strArr[4];
            int flags2 = str.length();
            if (flags2 != str2.length()) {
                String[] strArr2 = A0Y;
                strArr2[6] = "QBYjlSuWWzNHcmXjWc7avhw4MqaHk82";
                strArr2[4] = "P5zbNSbq1MUS3wdHf";
                dq.A04 = jA0M;
                return;
            }
            A0Y[7] = "vg5EJJPWiTbIFzTVTJFrvfHkMClrP8RJ";
            dq.A04 = jA0M;
            return;
        }
        throw new C0488Af(A0A(552, 29, 95) + iA0H);
    }

    public static void A0T(C0679Ij c0679Ij, DQ dq) throws C0488Af {
        A0R(c0679Ij, 0, dq);
    }

    public static void A0U(C0679Ij c0679Ij, DQ dq, byte[] bArr) throws C0488Af {
        c0679Ij.A0Y(8);
        c0679Ij.A0c(bArr, 0, 16);
        if (!Arrays.equals(bArr, A0c)) {
            return;
        }
        A0R(c0679Ij, 16, dq);
    }

    public static void A0V(C0679Ij c0679Ij, C0679Ij c0679Ij2, String str, DQ dq) throws C0488Af {
        c0679Ij.A0Y(8);
        int iA08 = c0679Ij.A08();
        if (c0679Ij.A08() != A0a) {
            return;
        }
        if (D3.A01(iA08) == 1) {
            c0679Ij.A0Z(4);
        }
        int iA09 = c0679Ij.A08();
        String[] strArr = A0Y;
        if (strArr[6].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        A0Y[3] = "cve2FA";
        if (iA09 == 1) {
            c0679Ij2.A0Y(8);
            int iA010 = c0679Ij2.A08();
            if (c0679Ij2.A08() != A0a) {
                return;
            }
            int iA01 = D3.A01(iA010);
            if (A0Y[1].length() != 3) {
                throw new RuntimeException();
            }
            A0Y[7] = "iX8BjoZjE8Q6Igd9BCVMMRG15zWrcCbA";
            if (iA01 == 1) {
                if (c0679Ij2.A0M() == 0) {
                    throw new C0488Af(A0A(609, 55, 42));
                }
            } else if (iA01 >= 2) {
                c0679Ij2.A0Z(4);
            }
            if (c0679Ij2.A0M() == 1) {
                c0679Ij2.A0Z(1);
                int iA0E = c0679Ij2.A0E();
                int i = (iA0E & 240) >> 4;
                int i2 = iA0E & 15;
                boolean z = c0679Ij2.A0E() == 1;
                if (!z) {
                    return;
                }
                int iA0E2 = c0679Ij2.A0E();
                byte[] bArr = new byte[16];
                int perSampleIvSize = bArr.length;
                c0679Ij2.A0c(bArr, 0, perSampleIvSize);
                int skipByteBlock = A0Y[7].charAt(27);
                if (skipByteBlock != 114) {
                    throw new RuntimeException();
                }
                A0Y[0] = "v2evuoi5ipUorqJI1yS0NRy";
                byte[] bArr2 = null;
                if (z && iA0E2 == 0) {
                    int iA0E3 = c0679Ij2.A0E();
                    bArr2 = new byte[iA0E3];
                    c0679Ij2.A0c(bArr2, 0, iA0E3);
                }
                dq.A0A = true;
                dq.A08 = new DP(z, str, iA0E2, bArr, i, i2, bArr2);
                return;
            }
            throw new C0488Af(A0A(89, 39, 21));
        }
        throw new C0488Af(A0A(50, 39, 120));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    public static boolean A0W(int i) {
        int i2;
        if (i != D3.A0j) {
            int i3 = D3.A1L;
            if (A0Y[2].charAt(18) == 'K') {
                A0Y[2] = "T3RhZdPh4OhUklIpt3KHsdu4Qu4SXFxX";
                if (i != i3) {
                    int i4 = D3.A0d;
                    if (A0Y[1].length() == 3) {
                        A0Y[0] = "W";
                        if (i != i4) {
                            if (i != D3.A0h) {
                                i2 = D3.A0m;
                                if (A0Y[5].length() == 1) {
                                    A0Y[5] = "P";
                                    if (i == i2) {
                                    }
                                }
                            }
                        }
                    } else if (i != i4) {
                        if (i != D3.A0h && i != D3.A16 && i != D3.A0i && i != D3.A1K) {
                            i2 = D3.A0m;
                            if (A0Y[5].length() == 1) {
                                A0Y[5] = "P";
                                if (i == i2 && i != D3.A0N) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
            throw new RuntimeException();
        }
        return true;
    }

    public static boolean A0X(int i) {
        return i == D3.A0V || i == D3.A0c || i == D3.A0n || i == D3.A12 || i == D3.A1A || i == D3.A1H || i == D3.A1I || i == D3.A1J || i == D3.A1M || i == D3.A1N || i == D3.A0r || i == D3.A0u || i == D3.A0t || i == D3.A10 || i == D3.A1Q || i == D3.A0x || i == D3.A11 || i == D3.A0O || i == D3.A0f || i == D3.A0P;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00e7  */
    private boolean A0Y(InterfaceC0536Cd interfaceC0536Cd) throws InterruptedException, IOException {
        if (this.A00 == 0) {
            if (!interfaceC0536Cd.ADc(this.A0O.A00, 0, 8, true)) {
                return false;
            }
            this.A00 = 8;
            this.A0O.A0Y(0);
            this.A07 = this.A0O.A0M();
            this.A01 = this.A0O.A08();
        }
        long j = this.A07;
        if (j == 1) {
            interfaceC0536Cd.readFully(this.A0O.A00, 8, 8);
            this.A00 += 8;
            this.A07 = this.A0O.A0N();
        } else if (j == 0) {
            long jA6t = interfaceC0536Cd.A6t();
            if (A0Y[7].charAt(27) != 'r') {
                throw new RuntimeException();
            }
            A0Y[0] = "LA";
            if (jA6t == -1 && !this.A0T.isEmpty()) {
                jA6t = this.A0T.peek().A00;
            }
            if (jA6t != -1) {
                this.A07 = (jA6t - interfaceC0536Cd.A7F()) + ((long) this.A00);
            }
        }
        if (this.A07 >= this.A00) {
            long jA7F = interfaceC0536Cd.A7F() - ((long) this.A00);
            if (this.A01 == D3.A0i) {
                int size = this.A0K.size();
                for (int i = 0; i < size; i++) {
                    DQ fragment = this.A0K.valueAt(i).A07;
                    fragment.A03 = jA7F;
                    fragment.A04 = jA7F;
                    fragment.A05 = jA7F;
                }
            }
            if (this.A01 == D3.A0b) {
                this.A0D = null;
                long endPosition = this.A07 + jA7F;
                if (A0Y[1].length() != 3) {
                    this.A09 = endPosition;
                    if (!this.A0F) {
                        this.A0C.AEM(new C1041Wq(this.A08, jA7F));
                        this.A0F = true;
                    }
                } else {
                    A0Y[3] = "OzIwjO";
                    this.A09 = endPosition;
                    if (!this.A0F) {
                        this.A0C.AEM(new C1041Wq(this.A08, jA7F));
                        this.A0F = true;
                    }
                }
                if (A0Y[3].length() != 6) {
                    this.A02 = 2;
                    return true;
                }
                A0Y[2] = "kMQb8Kdhh0k2oCY1DKK8Lkjm8envfnKE";
                this.A02 = 2;
                return true;
            }
            if (A0W(this.A01)) {
                long endPosition2 = (interfaceC0536Cd.A7F() + this.A07) - 8;
                this.A0T.push(new C1025Wa(this.A01, endPosition2));
                if (this.A07 == this.A00) {
                    A0F(endPosition2);
                } else {
                    A0B();
                }
            } else if (A0X(this.A01)) {
                if (this.A00 == 8) {
                    long j2 = this.A07;
                    if (j2 <= 2147483647L) {
                        this.A0E = new C0679Ij((int) j2);
                        System.arraycopy(this.A0O.A00, 0, this.A0E.A00, 0, 8);
                        this.A02 = 1;
                    } else {
                        throw new C0488Af(A0A(241, 49, 63));
                    }
                } else {
                    throw new C0488Af(A0A(190, 51, 119));
                }
            } else if (this.A07 <= 2147483647L) {
                this.A0E = null;
                if (A0Y[1].length() != 3) {
                    this.A02 = 1;
                } else {
                    String[] strArr = A0Y;
                    strArr[6] = "iPT3XD2rpP2HdkDfuffPKD2oqLdsh6m";
                    strArr[4] = "VJwLHdRxuPwgnotGD";
                    this.A02 = 1;
                }
            } else {
                throw new C0488Af(A0A(479, 53, 111));
            }
            return true;
        }
        throw new C0488Af(A0A(2, 48, 31));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private boolean A0Z(InterfaceC0536Cd interfaceC0536Cd) throws InterruptedException, IOException {
        DP dpA00;
        int iAEF;
        int i = 4;
        int i2 = 1;
        int i3 = 0;
        if (this.A02 == 3) {
            if (this.A0D == null) {
                DF dfA07 = A07(this.A0K);
                if (dfA07 == null) {
                    int iA7F = (int) (this.A09 - interfaceC0536Cd.A7F());
                    if (iA7F >= 0) {
                        interfaceC0536Cd.AEt(iA7F);
                        A0B();
                        return false;
                    }
                    throw new C0488Af(A0A(346, 35, 12));
                }
                int iA7F2 = (int) (dfA07.A07.A0G[dfA07.A02] - interfaceC0536Cd.A7F());
                if (iA7F2 < 0) {
                    Log.w(A0A(128, 22, 14), A0A(150, 40, 24));
                    iA7F2 = 0;
                }
                interfaceC0536Cd.AEt(iA7F2);
                this.A0D = dfA07;
            }
            this.A06 = this.A0D.A07.A0D[this.A0D.A01];
            if (this.A0D.A01 < this.A0D.A03) {
                interfaceC0536Cd.AEt(this.A06);
                this.A0D.A01();
                if (!this.A0D.A08()) {
                    this.A0D = null;
                }
                this.A02 = 3;
                return true;
            }
            DF df = this.A0D;
            if (A0Y[3].length() != 6) {
                throw new RuntimeException();
            }
            A0Y[3] = "st8dZG";
            if (df.A05.A02 == 1) {
                this.A06 -= 8;
                interfaceC0536Cd.AEt(8);
            }
            this.A04 = this.A0D.A03();
            this.A06 += this.A04;
            this.A02 = 4;
            this.A05 = 0;
        }
        DQ dq = this.A0D.A07;
        DO r3 = this.A0D.A05;
        InterfaceC0545Co interfaceC0545Co = this.A0D.A06;
        int i4 = this.A0D.A01;
        long jA00 = dq.A00(i4) * 1000;
        C0691Iv c0691Iv = this.A0S;
        if (c0691Iv != null) {
            jA00 = c0691Iv.A06(jA00);
        }
        if (r3.A01 == 0) {
            while (true) {
                int i5 = this.A04;
                int i6 = this.A06;
                if (i5 >= i6) {
                    break;
                }
                this.A04 += interfaceC0545Co.AEF(interfaceC0536Cd, i6 - i5, false);
            }
        } else {
            byte[] bArr = this.A0Q.A00;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i7 = r3.A01 + 1;
            int i8 = 4 - r3.A01;
            while (this.A04 < this.A06) {
                int i9 = this.A05;
                if (i9 == 0) {
                    interfaceC0536Cd.readFully(bArr, i8, i7);
                    this.A0Q.A0Y(i3);
                    this.A05 = this.A0Q.A0H() - i2;
                    this.A0R.A0Y(i3);
                    interfaceC0545Co.AEG(this.A0R, i);
                    interfaceC0545Co.AEG(this.A0Q, i2);
                    this.A0G = this.A0H.length > 0 && C0675If.A0C(r3.A07.A0O, bArr[i]);
                    this.A04 += 5;
                    this.A06 += i8;
                } else {
                    if (this.A0G) {
                        this.A0P.A0W(i9);
                        interfaceC0536Cd.readFully(this.A0P.A00, i3, this.A05);
                        interfaceC0545Co.AEG(this.A0P, this.A05);
                        iAEF = this.A05;
                        int iA02 = C0675If.A02(this.A0P.A00, this.A0P.A07());
                        this.A0P.A0Y(A0A(686, 10, 13).equals(r3.A07.A0O) ? 1 : 0);
                        this.A0P.A0X(iA02);
                        C0628Gi.A03(jA00, this.A0P, this.A0H);
                    } else {
                        iAEF = interfaceC0545Co.AEF(interfaceC0536Cd, i9, false);
                    }
                    this.A04 += iAEF;
                    this.A05 -= iAEF;
                    i = 4;
                    i2 = 1;
                    i3 = 0;
                }
            }
        }
        boolean z = dq.A0I[i4];
        C0544Cn c0544Cn = null;
        int i10 = z;
        if (dq.A0A) {
            int i11 = (z ? 1 : 0) | 1073741824;
            if (dq.A08 != null) {
                dpA00 = dq.A08;
            } else {
                dpA00 = r3.A00(dq.A07.A02);
            }
            c0544Cn = dpA00.A01;
            i10 = i11;
        }
        interfaceC0545Co.AEH(jA00, i10, this.A06, 0, c0544Cn);
        A0E(jA00);
        if (!this.A0D.A08()) {
            this.A0D = null;
        }
        this.A02 = 3;
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0535Cc
    public final void A8I(InterfaceC0537Ce interfaceC0537Ce) {
        this.A0C = interfaceC0537Ce;
        DO r0 = this.A0N;
        if (r0 != null) {
            DF df = new DF(interfaceC0537Ce.AFD(0, r0.A03));
            df.A07(this.A0N, new D9(0, 0, 0, 0));
            this.A0K.put(0, df);
            A0C();
            this.A0C.A5D();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0535Cc
    public final int ADX(InterfaceC0536Cd interfaceC0536Cd, C0540Cj c0540Cj) throws InterruptedException, IOException {
        while (true) {
            int i = this.A02;
            if (i != 0) {
                if (A0Y[2].charAt(18) != 'K') {
                    throw new RuntimeException();
                }
                A0Y[2] = "Ub8SUYMnE0bQG8CZo0KwdlTNogw2mbM0";
                if (i == 1) {
                    A0G(interfaceC0536Cd);
                } else if (i != 2) {
                    boolean zA0Z = A0Z(interfaceC0536Cd);
                    if (A0Y[7].charAt(27) == 'r') {
                        A0Y[5] = "b";
                        if (zA0Z) {
                            return 0;
                        }
                    } else if (zA0Z) {
                        return 0;
                    }
                } else {
                    A0H(interfaceC0536Cd);
                }
            } else if (!A0Y(interfaceC0536Cd)) {
                return -1;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0535Cc
    public final void AEL(long j, long j2) {
        int size = this.A0K.size();
        for (int i = 0; i < size; i++) {
            this.A0K.valueAt(i).A04();
        }
        this.A0U.clear();
        this.A03 = 0;
        this.A0A = j2;
        this.A0T.clear();
        A0B();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0535Cc
    public final boolean AEv(InterfaceC0536Cd interfaceC0536Cd) throws InterruptedException, IOException {
        return DM.A03(interfaceC0536Cd);
    }
}
