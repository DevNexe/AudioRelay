package com.facebook.ads.redexgen.X;

import android.graphics.Point;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.source.TrackGroup;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import com.facebook.ads.internal.exoplayer2.trackselection.DefaultTrackSelector$Parameters;
import com.facebook.ads.internal.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0518Bk extends VD {
    public static byte[] A02;
    public static String[] A03 = {"1W0E1A", "gmqFy6ZQaP5ka1WITOse6lKCqSKhRNov", "yPEYbIXQTZij2dUvfHyn6qa5Z66I89l5", "Xhoxo0MeXbgag07m9diWTgmUhgioDUlF", "BIkkp", "x2Y7ova5yP2MY4Z3NAONKiEwX", "ON8", "BctZyAj3hw00k98sEs0CoZ2k5"};
    public static final int[] A04;

    @Nullable
    public final HP A00;
    public final AtomicReference<DefaultTrackSelector$Parameters> A01;

    public static String A0C(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 92);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0E() {
        if (A03[6].length() != 3) {
            throw new RuntimeException();
        }
        A03[6] = "oTI";
        A02 = new byte[]{-26, -33, -43};
    }

    static {
        A0E();
        A04 = new int[0];
    }

    public C0518Bk() {
        this((HP) null);
    }

    public C0518Bk(@Nullable HP hp) {
        this.A00 = hp;
        this.A01 = new AtomicReference<>(DefaultTrackSelector$Parameters.A0J);
    }

    public static int A00(int i, int i2) {
        if (i == -1) {
            return i2 == -1 ? 0 : -1;
        }
        if (i2 == -1) {
            return 1;
        }
        return i - i2;
    }

    public static int A01(int i, int i2) {
        if (i > i2) {
            return 1;
        }
        return i2 > i ? -1 : 0;
    }

    public static int A03(TrackGroup trackGroup, int[] iArr, int i, @Nullable String str, int i2, int i3, int i4, List<Integer> list) {
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            Integer num = list.get(i6);
            if (A03[2].charAt(31) == 'o') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[7] = "3Iv8b3o73oRbqkF65Z5c5dFgz";
            strArr[5] = "e7BsWd0zc9qEfvrmMSkcTfHGf";
            int iIntValue = num.intValue();
            if (A0L(trackGroup.A01(iIntValue), str, iArr[iIntValue], i, i2, i3, i4)) {
                i5++;
            }
        }
        return i5;
    }

    public static int A04(TrackGroup trackGroup, int[] iArr, HG hg) {
        int i = 0;
        for (int i2 = 0; i2 < trackGroup.A01; i2++) {
            if (A0J(trackGroup.A01(i2), iArr[i2], hg)) {
                i++;
            }
        }
        return i;
    }

    public static Point A05(boolean z, int i, int i2, int i3, int i4) {
        if (z) {
            if ((i3 > i4) != (i > i2)) {
                i = i2;
                i2 = i;
            }
        }
        int tempViewportWidth = i3 * i2;
        int i5 = i4 * i;
        if (A03[2].charAt(31) == 'o') {
            throw new RuntimeException();
        }
        A03[6] = "nfw";
        if (tempViewportWidth >= i5) {
            return new Point(i, C0695Iz.A04(i * i4, i3));
        }
        return new Point(C0695Iz.A04(i2 * i3, i4), i2);
    }

    @Nullable
    private final HQ A06(int i, TrackGroupArray trackGroupArray, int[][] iArr, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters) throws AM {
        TrackGroup trackGroup = null;
        int trackIndex = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = trackGroupArray.A01;
            if (A03[3].charAt(2) == 'E') {
                throw new RuntimeException();
            }
            A03[3] = "VerUiBJDpf251zcJKkmQW7r5SVlKN9oM";
            if (i3 < i4) {
                TrackGroup trackGroupA01 = trackGroupArray.A01(i3);
                int[] iArr2 = iArr[i3];
                for (int i5 = 0; i5 < trackGroupA01.A01; i5++) {
                    if (A0H(iArr2[i5], defaultTrackSelector$Parameters.A0B)) {
                        int i6 = (trackGroupA01.A01(i5).A0D & 1) != 0 ? 2 : 1;
                        if (A0H(iArr2[i5], false)) {
                            i6 += AdError.NETWORK_ERROR_CODE;
                        }
                        if (i6 > i2) {
                            trackGroup = trackGroupA01;
                            trackIndex = i5;
                            i2 = i6;
                        }
                    }
                }
                i3++;
            } else {
                if (trackGroup == null) {
                    return null;
                }
                return new C0511Bd(trackGroup, trackIndex);
            }
        }
    }

    @Nullable
    public static HQ A07(TrackGroupArray trackGroupArray, int[][] iArr, int requiredAdaptiveSupport, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, HP hp) throws AM {
        int i;
        if (defaultTrackSelector$Parameters.A0A) {
            i = 24;
        } else {
            i = 16;
        }
        boolean z = defaultTrackSelector$Parameters.A09 && (requiredAdaptiveSupport & i) != 0;
        for (int i2 = 0; i2 < trackGroupArray.A01; i2++) {
            TrackGroup trackGroupA01 = trackGroupArray.A01(i2);
            int[] iArrA0O = A0O(trackGroupA01, iArr[i2], z, i, defaultTrackSelector$Parameters.A03, defaultTrackSelector$Parameters.A02, defaultTrackSelector$Parameters.A01, defaultTrackSelector$Parameters.A06, defaultTrackSelector$Parameters.A05, defaultTrackSelector$Parameters.A0F);
            if (iArrA0O.length > 0) {
                return ((HP) IK.A01(hp)).A4U(trackGroupA01, iArrA0O);
            }
        }
        return null;
    }

    @Nullable
    private final HQ A08(TrackGroupArray trackGroupArray, int[][] iArr, int i, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, @Nullable HP hp) throws AM {
        int trackIndex = -1;
        int i2 = -1;
        HH trackScore = null;
        for (int i3 = 0; i3 < trackGroupArray.A01; i3++) {
            TrackGroup trackGroupA01 = trackGroupArray.A01(i3);
            int[] iArr2 = iArr[i3];
            for (int i4 = 0; i4 < trackGroupA01.A01; i4++) {
                if (A0H(iArr2[i4], defaultTrackSelector$Parameters.A0B)) {
                    HH hh = new HH(trackGroupA01.A01(i4), defaultTrackSelector$Parameters, iArr2[i4]);
                    if (trackScore == null || hh.A00(trackScore) > 0) {
                        i2 = i3;
                        trackIndex = i4;
                        trackScore = hh;
                    }
                }
            }
        }
        if (i2 == -1) {
            return null;
        }
        TrackGroup trackGroupA02 = trackGroupArray.A01(i2);
        if (!defaultTrackSelector$Parameters.A0D && hp != null) {
            int[] iArrA0N = A0N(trackGroupA02, iArr[i2], defaultTrackSelector$Parameters.A09);
            if (iArrA0N.length > 0) {
                return hp.A4U(trackGroupA02, iArrA0N);
            }
        }
        return new C0511Bd(trackGroupA02, trackIndex);
    }

    @Nullable
    private final HQ A09(TrackGroupArray trackGroupArray, int[][] iArr, int i, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, @Nullable HP hp) throws AM {
        HQ hqA07 = null;
        if (!defaultTrackSelector$Parameters.A0D && hp != null) {
            hqA07 = A07(trackGroupArray, iArr, i, defaultTrackSelector$Parameters, hp);
        }
        if (hqA07 == null) {
            return A0A(trackGroupArray, iArr, defaultTrackSelector$Parameters);
        }
        return hqA07;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0065  */
    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    /* JADX WARN: Code duplicated, block: B:24:0x007b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0084  */
    /* JADX WARN: Code duplicated, block: B:30:0x0098  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:74:0x013d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0142  */
    /* JADX WARN: Code duplicated, block: B:87:0x0149 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0092 A[SYNTHETIC] */
    @Nullable
    public static HQ A0A(TrackGroupArray trackGroupArray, int[][] iArr, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters) {
        boolean z;
        int iA00;
        int trackIndex;
        int i;
        int selectedTrackIndex;
        int selectedTrackIndex2;
        int trackIndex2;
        int i2;
        int i3;
        int selectedTrackIndex3;
        TrackGroup trackGroup = null;
        int selectedPixelCount = 0;
        int groupIndex = 0;
        int i4 = -1;
        int iA0E = -1;
        for (int i5 = 0; i5 < trackGroupArray.A01; i5++) {
            TrackGroup trackGroupA01 = trackGroupArray.A01(i5);
            int i6 = defaultTrackSelector$Parameters.A06;
            int selectedTrackIndex4 = defaultTrackSelector$Parameters.A05;
            List<Integer> listA0D = A0D(trackGroupA01, i6, selectedTrackIndex4, defaultTrackSelector$Parameters.A0F);
            int[] iArr2 = iArr[i5];
            for (int i7 = 0; i7 < trackIndex; i7++) {
                int selectedTrackIndex5 = iArr2[i7];
                boolean zA0H = A0H(selectedTrackIndex5, defaultTrackSelector$Parameters.A0B);
                String[] strArr = A03;
                String str = strArr[7];
                String str2 = strArr[5];
                int selectedTrackIndex6 = str.length();
                int trackIndex3 = str2.length();
                if (selectedTrackIndex6 == trackIndex3) {
                    A03[6] = "hrI";
                    if (zA0H) {
                        Format formatA01 = trackGroupA01.A01(i7);
                        if (listA0D.contains(Integer.valueOf(i7))) {
                            int trackIndex4 = formatA01.A0F;
                            if (trackIndex4 != -1) {
                                int selectedTrackIndex7 = formatA01.A0F;
                                int trackIndex5 = defaultTrackSelector$Parameters.A03;
                                if (selectedTrackIndex7 <= trackIndex5) {
                                    trackIndex = formatA01.A08;
                                    if (trackIndex != -1) {
                                        i2 = formatA01.A08;
                                        i3 = defaultTrackSelector$Parameters.A02;
                                        selectedTrackIndex3 = A03[3].charAt(2);
                                        if (selectedTrackIndex3 != 69) {
                                            throw new RuntimeException();
                                        }
                                        A03[1] = "4ARFUTCZfDvsYR3ca6QZg5ToT0PD1vK8";
                                        if (i2 <= i3) {
                                            i = formatA01.A04;
                                            selectedTrackIndex = A03[6].length();
                                            if (selectedTrackIndex != 3) {
                                                throw new RuntimeException();
                                            }
                                            String[] strArr2 = A03;
                                            strArr2[4] = "Q6f1q";
                                            strArr2[0] = "eoIuTJ";
                                            if (i != -1) {
                                                selectedTrackIndex2 = formatA01.A04;
                                                if (A03[2].charAt(31) != 'o') {
                                                    String[] strArr3 = A03;
                                                    strArr3[4] = "E5YTe";
                                                    strArr3[0] = "m0Lo7L";
                                                    trackIndex2 = defaultTrackSelector$Parameters.A01;
                                                    if (selectedTrackIndex2 <= trackIndex2) {
                                                        z = false;
                                                    }
                                                } else if (selectedTrackIndex2 <= defaultTrackSelector$Parameters.A01) {
                                                    z = false;
                                                }
                                            }
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                    } else {
                                        i = formatA01.A04;
                                        selectedTrackIndex = A03[6].length();
                                        if (selectedTrackIndex != 3) {
                                            throw new RuntimeException();
                                        }
                                        String[] strArr4 = A03;
                                        strArr4[4] = "Q6f1q";
                                        strArr4[0] = "eoIuTJ";
                                        if (i != -1) {
                                            selectedTrackIndex2 = formatA01.A04;
                                            if (A03[2].charAt(31) != 'o') {
                                                String[] strArr5 = A03;
                                                strArr5[4] = "E5YTe";
                                                strArr5[0] = "m0Lo7L";
                                                trackIndex2 = defaultTrackSelector$Parameters.A01;
                                                if (selectedTrackIndex2 <= trackIndex2) {
                                                    z = false;
                                                }
                                            } else if (selectedTrackIndex2 <= defaultTrackSelector$Parameters.A01) {
                                                z = false;
                                            }
                                        }
                                        z = true;
                                    }
                                } else {
                                    z = false;
                                }
                            } else {
                                trackIndex = formatA01.A08;
                                if (trackIndex != -1) {
                                    i2 = formatA01.A08;
                                    i3 = defaultTrackSelector$Parameters.A02;
                                    selectedTrackIndex3 = A03[3].charAt(2);
                                    if (selectedTrackIndex3 != 69) {
                                        throw new RuntimeException();
                                    }
                                    A03[1] = "4ARFUTCZfDvsYR3ca6QZg5ToT0PD1vK8";
                                    if (i2 <= i3) {
                                        i = formatA01.A04;
                                        selectedTrackIndex = A03[6].length();
                                        if (selectedTrackIndex != 3) {
                                            throw new RuntimeException();
                                        }
                                        String[] strArr6 = A03;
                                        strArr6[4] = "Q6f1q";
                                        strArr6[0] = "eoIuTJ";
                                        if (i != -1) {
                                            selectedTrackIndex2 = formatA01.A04;
                                            if (A03[2].charAt(31) != 'o') {
                                                String[] strArr7 = A03;
                                                strArr7[4] = "E5YTe";
                                                strArr7[0] = "m0Lo7L";
                                                trackIndex2 = defaultTrackSelector$Parameters.A01;
                                                if (selectedTrackIndex2 <= trackIndex2) {
                                                    z = false;
                                                }
                                            } else if (selectedTrackIndex2 <= defaultTrackSelector$Parameters.A01) {
                                                z = false;
                                            }
                                        }
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                } else {
                                    i = formatA01.A04;
                                    selectedTrackIndex = A03[6].length();
                                    if (selectedTrackIndex != 3) {
                                        throw new RuntimeException();
                                    }
                                    String[] strArr8 = A03;
                                    strArr8[4] = "Q6f1q";
                                    strArr8[0] = "eoIuTJ";
                                    if (i != -1) {
                                        selectedTrackIndex2 = formatA01.A04;
                                        if (A03[2].charAt(31) != 'o') {
                                            String[] strArr9 = A03;
                                            strArr9[4] = "E5YTe";
                                            strArr9[0] = "m0Lo7L";
                                            trackIndex2 = defaultTrackSelector$Parameters.A01;
                                            if (selectedTrackIndex2 <= trackIndex2) {
                                                z = false;
                                            }
                                        } else if (selectedTrackIndex2 <= defaultTrackSelector$Parameters.A01) {
                                            z = false;
                                        }
                                    }
                                    z = true;
                                }
                            }
                        } else {
                            z = false;
                        }
                        if (z || defaultTrackSelector$Parameters.A0C) {
                            int i8 = z ? 2 : 1;
                            int trackScore = iArr2[i7];
                            boolean zA0H2 = A0H(trackScore, false);
                            if (zA0H2) {
                                i8 += AdError.NETWORK_ERROR_CODE;
                            }
                            boolean isWithinCapabilities = i8 > groupIndex;
                            if (i8 == groupIndex) {
                                boolean isWithinCapabilities2 = defaultTrackSelector$Parameters.A0D;
                                if (isWithinCapabilities2) {
                                    isWithinCapabilities = A00(formatA01.A04, i4) < 0;
                                } else {
                                    int iA0E2 = formatA01.A0E();
                                    if (iA0E2 != iA0E) {
                                        iA00 = A00(iA0E2, iA0E);
                                    } else {
                                        int i9 = formatA01.A04;
                                        if (A03[1].charAt(3) == 'F') {
                                            A03[1] = "BbsFXafw97ACHvWyC9VMFWsBkInXq3FD";
                                            iA00 = A00(i9, i4);
                                        }
                                    }
                                    if (zA0H2 && z) {
                                        isWithinCapabilities = iA00 > 0;
                                    } else {
                                        isWithinCapabilities = iA00 < 0;
                                    }
                                }
                            }
                            if (isWithinCapabilities) {
                                trackGroup = trackGroupA01;
                                selectedPixelCount = i7;
                                groupIndex = i8;
                                i4 = formatA01.A04;
                                iA0E = formatA01.A0E();
                            }
                        }
                    }
                }
                throw new RuntimeException();
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return new C0511Bd(trackGroup, selectedPixelCount);
    }

    @Nullable
    private final HQ A0B(TrackGroupArray trackGroupArray, int[][] iArr, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters) throws AM {
        int i;
        int i2;
        TrackGroup trackGroup = null;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < trackGroupArray.A01; i5++) {
            TrackGroup trackGroupA01 = trackGroupArray.A01(i5);
            int[] iArr2 = iArr[i5];
            for (int i6 = 0; i6 < trackGroupA01.A01; i6++) {
                if (A0H(iArr2[i6], defaultTrackSelector$Parameters.A0B)) {
                    Format formatA01 = trackGroupA01.A01(i6);
                    int i7 = formatA01.A0D & (defaultTrackSelector$Parameters.A00 ^ (-1));
                    boolean z = (i7 & 1) != 0;
                    boolean z2 = (i7 & 2) != 0;
                    boolean zA0K = A0K(formatA01, defaultTrackSelector$Parameters.A08);
                    if (zA0K || (defaultTrackSelector$Parameters.A0E && A0I(formatA01))) {
                        if (z) {
                            i = 8;
                        } else if (!z2) {
                            i = 6;
                        } else {
                            i = 4;
                        }
                        i2 = i + (zA0K ? 1 : 0);
                    } else if (z) {
                        i2 = 3;
                    } else if (!z2) {
                        continue;
                    } else if (A0K(formatA01, defaultTrackSelector$Parameters.A07)) {
                        i2 = 2;
                    } else {
                        i2 = 1;
                    }
                    if (A0H(iArr2[i6], false)) {
                        i2 += AdError.NETWORK_ERROR_CODE;
                    }
                    if (i2 > i4) {
                        trackGroup = trackGroupA01;
                        i3 = i6;
                        if (A03[6].length() != 3) {
                            throw new RuntimeException();
                        }
                        A03[2] = "ytO6VNlSXI4nyu5127ZVkMBSWij4cMOM";
                        i4 = i2;
                    } else {
                        continue;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return new C0511Bd(trackGroup, i3);
    }

    public static List<Integer> A0D(TrackGroup trackGroup, int i, int maxVideoPixelsToRetain, boolean z) {
        ArrayList arrayList = new ArrayList(trackGroup.A01);
        for (int i2 = 0; i2 < trackGroup.A01; i2++) {
            arrayList.add(Integer.valueOf(i2));
        }
        if (i == Integer.MAX_VALUE || maxVideoPixelsToRetain == Integer.MAX_VALUE) {
            return arrayList;
        }
        int i3 = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < trackGroup.A01; i4++) {
            Format formatA01 = trackGroup.A01(i4);
            if (formatA01.A0F > 0) {
                int i5 = formatA01.A08;
                if (A03[3].charAt(2) == 'E') {
                    throw new RuntimeException();
                }
                A03[2] = "kSz4FX5ZHsEkHeXGD1Cn3cbmsF2hLdtD";
                if (i5 > 0) {
                    Point pointA05 = A05(z, i, maxVideoPixelsToRetain, formatA01.A0F, formatA01.A08);
                    int i6 = formatA01.A0F * formatA01.A08;
                    int videoPixels = formatA01.A0F;
                    if (videoPixels >= ((int) (pointA05.x * 0.98f))) {
                        int videoPixels2 = formatA01.A08;
                        if (videoPixels2 >= ((int) (pointA05.y * 0.98f)) && i6 < i3) {
                            i3 = i6;
                        }
                    }
                }
            }
        }
        if (i3 != Integer.MAX_VALUE) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                int iA0E = trackGroup.A01(((Integer) arrayList.get(size)).intValue()).A0E();
                if (iA0E == -1 || iA0E > i3) {
                    arrayList.remove(size);
                }
            }
        }
        return arrayList;
    }

    public static void A0F(TrackGroup trackGroup, int[] iArr, int trackIndex, @Nullable String str, int i, int i2, int i3, List<Integer> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            int iIntValue = list.get(size).intValue();
            if (!A0L(trackGroup.A01(iIntValue), str, iArr[iIntValue], trackIndex, i, i2, i3)) {
                list.remove(size);
            }
        }
    }

    public static void A0G(HO ho, int[][][] iArr, C0504Av[] c0504AvArr, HQ[] hqArr, int rendererType) {
        if (rendererType == 0) {
            return;
        }
        int i = -1;
        int i2 = -1;
        if (A03[1].charAt(3) != 'F') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[4] = "rTjwD";
        strArr[0] = "uX38vm";
        boolean z = true;
        int i3 = 0;
        while (true) {
            if (i3 >= ho.A00()) {
                break;
            }
            int iA01 = ho.A01(i3);
            HQ hq = hqArr[i3];
            if ((iA01 == 1 || iA01 == 2) && hq != null && A0M(iArr[i3], ho.A02(i3), hq)) {
                if (iA01 == 1) {
                    if (i != -1) {
                        z = false;
                        break;
                    }
                    i = i3;
                } else {
                    if (i2 != -1) {
                        z = false;
                        break;
                    }
                    i2 = i3;
                }
            }
            i3++;
        }
        boolean z2 = z & ((i == -1 || i2 == -1) ? false : true);
        if (A03[3].charAt(2) != 'E') {
            String[] strArr2 = A03;
            strArr2[4] = "aY4hR";
            strArr2[0] = "2v7HMH";
            if (!z2) {
                return;
            }
        } else if (!z2) {
            return;
        }
        C0504Av c0504Av = new C0504Av(rendererType);
        c0504AvArr[i] = c0504Av;
        c0504AvArr[i2] = c0504Av;
    }

    public static boolean A0H(int i, boolean z) {
        int maskedSupport = i & 7;
        return maskedSupport == 4 || (z && maskedSupport == 3);
    }

    public static boolean A0I(Format format) {
        return TextUtils.isEmpty(format.A0N) || A0K(format, A0C(0, 3, 21));
    }

    public static boolean A0J(Format format, int i, HG hg) {
        if (A0H(i, false) && format.A05 == hg.A00 && format.A0C == hg.A01) {
            return hg.A02 == null || TextUtils.equals(hg.A02, format.A0O);
        }
        return false;
    }

    public static boolean A0K(Format format, @Nullable String str) {
        return str != null && TextUtils.equals(str, C0695Iz.A0L(format.A0N));
    }

    public static boolean A0L(Format format, @Nullable String str, int i, int i2, int i3, int i4, int i5) {
        if (!A0H(i, false) || (i & i2) == 0) {
            return false;
        }
        if (str != null && !C0695Iz.A0g(format.A0O, str)) {
            return false;
        }
        if (format.A0F != -1 && format.A0F > i3) {
            return false;
        }
        if (format.A08 != -1 && format.A08 > i4) {
            return false;
        }
        if (format.A04 != -1) {
            int i6 = format.A04;
            if (A03[2].charAt(31) == 'o') {
                throw new RuntimeException();
            }
            A03[2] = "FNCbzyr7QyRP3SA06TqNXuxS80zpa9Bi";
            if (i6 > i5) {
                return false;
            }
        }
        return true;
    }

    public static boolean A0M(int[][] iArr, TrackGroupArray trackGroupArray, HQ hq) {
        if (hq == null) {
            return false;
        }
        int iA00 = trackGroupArray.A00(hq.A7g());
        if (A03[2].charAt(31) == 'o') {
            throw new RuntimeException();
        }
        A03[1] = "tyUFTMgWRFIbU9oMa0yVOFtav5LFL8C4";
        for (int i = 0; i < hq.length(); i++) {
            if ((iArr[iA00][hq.A6n(i)] & 32) != 32) {
                return false;
            }
        }
        if (A03[2].charAt(31) != 'o') {
            String[] strArr = A03;
            strArr[4] = "AvWfp";
            strArr[0] = "jnm8oH";
            return true;
        }
        A03[3] = "hBflC2WcQfSqXI4XtpzFNLmvHBtesKLi";
        return true;
    }

    public static int[] A0N(TrackGroup trackGroup, int[] iArr, boolean z) {
        int iA04;
        int i = 0;
        HG hg = null;
        HashSet hashSet = new HashSet();
        for (int configurationCount = 0; configurationCount < trackGroup.A01; configurationCount++) {
            Format formatA01 = trackGroup.A01(configurationCount);
            HG hg2 = new HG(formatA01.A05, formatA01.A0C, z ? null : formatA01.A0O);
            String[] strArr = A03;
            if (strArr[4].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            A03[6] = "SWl";
            if (hashSet.add(hg2) && (iA04 = A04(trackGroup, iArr, hg2)) > i) {
                hg = hg2;
                i = iA04;
            }
        }
        if (i > 1) {
            int[] adaptiveIndices = new int[i];
            if (A03[1].charAt(3) == 'F') {
                A03[2] = "ndqJYBN4kzCrcISGfJ6gLQAVvTseYRAq";
                int index = 0;
                for (int i2 = 0; i2 < trackGroup.A01; i2++) {
                    if (A0J(trackGroup.A01(i2), iArr[i2], (HG) IK.A01(hg))) {
                        adaptiveIndices[index] = i2;
                        index++;
                    }
                }
                return adaptiveIndices;
            }
            throw new RuntimeException();
        }
        return A04;
    }

    public static int[] A0O(TrackGroup trackGroup, int[] iArr, boolean z, int i, int i2, int i3, int trackIndex, int i4, int i5, boolean z2) {
        int iA03;
        if (trackGroup.A01 >= 2) {
            List<Integer> listA0D = A0D(trackGroup, i4, i5, z2);
            if (listA0D.size() < 2) {
                return A04;
            }
            String str = null;
            if (!z) {
                HashSet hashSet = new HashSet();
                int i6 = 0;
                for (int selectedMimeTypeTrackCount = 0; selectedMimeTypeTrackCount < listA0D.size(); selectedMimeTypeTrackCount++) {
                    String str2 = trackGroup.A01(listA0D.get(selectedMimeTypeTrackCount).intValue()).A0O;
                    if (hashSet.add(str2) && (iA03 = A03(trackGroup, iArr, i, str2, i2, i3, trackIndex, listA0D)) > i6) {
                        if (A03[3].charAt(2) == 'E') {
                            throw new RuntimeException();
                        }
                        String[] strArr = A03;
                        strArr[7] = "YYn4Z0UW1tJYYEwj5MQ7L1Rhi";
                        strArr[5] = "BvRHCOG0R11gnbm1vcetrlVSM";
                        str = str2;
                        i6 = iA03;
                    }
                }
            }
            A0F(trackGroup, iArr, i, str, i2, i3, trackIndex, listA0D);
            return listA0D.size() < 2 ? A04 : C0695Iz.A0j(listA0D);
        }
        return A04;
    }

    private final HQ[] A0P(HO ho, int[][][] iArr, int[] iArr2, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters) throws AM {
        boolean z;
        int iA00 = ho.A00();
        HQ[] hqArr = new HQ[iA00];
        boolean seenVideoRendererWithMappedTracks = false;
        int i = 0;
        for (int i2 = 0; i2 < iA00; i2++) {
            int iA01 = ho.A01(i2);
            if (A03[2].charAt(31) == 'o') {
                throw new RuntimeException();
            }
            A03[2] = "HeTTodjeOHNf6YJV3Oi2xZW4zDR7myJi";
            if (2 == iA01) {
                if (i == 0) {
                    z = true;
                    hqArr[i2] = A09(ho.A02(i2), iArr[i2], iArr2[i2], defaultTrackSelector$Parameters, this.A00);
                    i = hqArr[i2] != null ? 1 : 0;
                } else {
                    z = true;
                }
                if (ho.A02(i2).A01 <= 0) {
                    z = false;
                }
                seenVideoRendererWithMappedTracks |= z;
            }
        }
        boolean z2 = false;
        int i3 = 0;
        if (A03[3].charAt(2) == 'E') {
            throw new RuntimeException();
        }
        A03[2] = "aVwUyHxCeGesw16VUIJPDtFnHPxsnnXC";
        for (int i4 = 0; i4 < iA00; i4++) {
            int iA02 = ho.A01(i4);
            if (iA02 != 1) {
                if (iA02 != 2) {
                    if (iA02 != 3) {
                        hqArr[i4] = A06(iA02, ho.A02(i4), iArr[i4], defaultTrackSelector$Parameters);
                    } else if (i3 == 0) {
                        hqArr[i4] = A0B(ho.A02(i4), iArr[i4], defaultTrackSelector$Parameters);
                        i3 = hqArr[i4] != null ? 1 : 0;
                    }
                }
            } else if (!z2) {
                hqArr[i4] = A08(ho.A02(i4), iArr[i4], iArr2[i4], defaultTrackSelector$Parameters, seenVideoRendererWithMappedTracks ? null : this.A00);
                z2 = hqArr[i4] != null;
            }
        }
        return hqArr;
    }

    @Override // com.facebook.ads.redexgen.X.VD
    public final Pair<C0504Av[], HQ[]> A0V(HO ho, int[][][] iArr, int[] iArr2) throws AM {
        DefaultTrackSelector$Parameters defaultTrackSelector$Parameters = this.A01.get();
        int i = ho.A00();
        HQ[] hqArrA0P = A0P(ho, iArr, iArr2, defaultTrackSelector$Parameters);
        for (int i2 = 0; i2 < i; i2++) {
            if (defaultTrackSelector$Parameters.A06(i2)) {
                hqArrA0P[i2] = null;
            } else {
                TrackGroupArray trackGroupArrayA02 = ho.A02(i2);
                if (defaultTrackSelector$Parameters.A07(i2, trackGroupArrayA02)) {
                    DefaultTrackSelector$SelectionOverride defaultTrackSelector$SelectionOverrideA05 = defaultTrackSelector$Parameters.A05(i2, trackGroupArrayA02);
                    if (defaultTrackSelector$SelectionOverrideA05 == null) {
                        hqArrA0P[i2] = null;
                    } else if (defaultTrackSelector$SelectionOverrideA05.A01 == 1) {
                        hqArrA0P[i2] = new C0511Bd(trackGroupArrayA02.A01(defaultTrackSelector$SelectionOverrideA05.A00), defaultTrackSelector$SelectionOverrideA05.A02[0]);
                    } else {
                        hqArrA0P[i2] = ((HP) IK.A01(this.A00)).A4U(trackGroupArrayA02.A01(defaultTrackSelector$SelectionOverrideA05.A00), defaultTrackSelector$SelectionOverrideA05.A02);
                    }
                }
            }
        }
        C0504Av[] c0504AvArr = new C0504Av[i];
        for (int i3 = 0; i3 < i; i3++) {
            c0504AvArr[i3] = !defaultTrackSelector$Parameters.A06(i3) && (ho.A01(i3) == 5 || hqArrA0P[i3] != null) ? C0504Av.A01 : null;
        }
        A0G(ho, iArr, c0504AvArr, hqArrA0P, defaultTrackSelector$Parameters.A04);
        return Pair.create(c0504AvArr, hqArrA0P);
    }
}
