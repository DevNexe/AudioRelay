package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0728Kh {
    public static byte[] A0E;
    public static String[] A0F = {"D9utVieqpHmzq", "1reJ20tywIkt8c03XFg68iFkPgUpcQh9", "1hiVgm3FzyAWthqubctijKn7iSl8t7OZ", "2MGbhVYWK6vnLzanQZMPK5FLJbU6N2Mg", "tHlP6Jv5sj70nCQXOaNATx3kiWqPf1Tp", "kSrICwDX6P2QTtBsWrInLj9wi3Ca9feR", "Z5GcmA6HHHf7tKUPWv2sbOMAsuTj15Gl", "CZogAanemwBaq"};
    public int A00;
    public C8U A01;
    public KM A02;

    @Nullable
    public M4 A03;

    @Nullable
    public String A04;

    @Nullable
    public String A05;
    public String A06;

    @Nullable
    public String A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final AdPlacementType A0B;
    public final KR A0C;

    @Nullable
    public final String A0D;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 87);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0E = new byte[]{-69, -68, -91, -88, -61, -87, -68, -76, -87, -74, -83, -87, -78, -89, -87, -61, -72, -67, -76, -87, 18, 21, 48, 35, 22, 33, 32, 35, 37, 26, 31, 24, 48, 20, 32, 31, 23, 26, 24, 48, 29, 18, 36, 37, 48, 38, 33, 21, 18, 37, 22, 48, 37, 26, 30, 22, 10, 17, 12, 39, 17, 12, -32, -25, -30, -3, -14, -25, -21, -29, -3, -14, -19, -23, -29, -20, -29, -20, -23, -27, -18, -12, -1, -14, -27, -15, -11, -27, -13, -12, -1, -23, -28, -73, -61, -60, -60, -75, -50, -49, -41, -39, -23, -53, -50, -23, -45, -50, 11, 30, 26, 24, 7, 37, 14, 15, 20, 26, 25, -16, -19, -15, -17, -16, -4, -5, -10, -8, -13, -65, -70, -68, -73, -43, -68, -62, -73, -67, -4, 6, 18, 0, 8, -1, 7, -4, 18, -12, -9, 18, -8, 11, 3, -8, 5, -4, -8, 1, -10, -8, -14, -18, 6, -7, -20, -6, -5, -7, -16, -22, -5, -20, -21, -43, -54, -36, -35, -24, -36, -54, -33, -50, -51, -24, -43, -40, -52, -54, -43, -50, 22, 29, 21, 39, 9, 12, 27, 39, 26, 13, 25, 29, 13, 27, 28, 13, 12, -86, -90, -101, -99, -97, -89, -97, -88, -82, -71, -93, -98, -59, -63, -74, -72, -70, -62, -70, -61, -55, -44, -55, -50, -59, -70, 39, 26, 38, 42, 26, 40, 41, 52, 41, 30, 34, 26, 28, 29, 10, 12, 20, 40, 29, 27, 10, 12, 14, -49, -64, -56, -53, -57, -68, -49, -64, -38, -60, -65, 14, -1, 13, 14, 25, 7, 9, -2, -1, -30, -44, -49, -33, -45};
    }

    static {
        A02();
    }

    public C0728Kh(C8U c8u, String str, @Nullable M4 m4, KM km, @Nullable String str2, int i, boolean z, boolean z2, KR kr, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.A01 = c8u;
        this.A06 = str;
        this.A03 = m4;
        this.A02 = km;
        this.A0D = str2;
        this.A00 = i;
        this.A0A = z;
        this.A08 = z2;
        this.A0C = kr;
        this.A0B = km.A04();
        this.A07 = str3;
        this.A05 = str4;
        this.A04 = str5;
    }

    private long A00() {
        SharedPreferences sharedPreferencesA00 = C0738Kt.A00(this.A01);
        String strA01 = A01(173, 17, 50);
        String string = sharedPreferencesA00.getString(strA01, A01(0, 0, 83));
        if (string == null) {
            return 0L;
        }
        String string2 = Locale.getDefault().toString();
        if (A0F[5].length() != 32) {
            throw new RuntimeException();
        }
        String[] strArr = A0F;
        strArr[7] = "UbRIo10SAcnK0";
        strArr[0] = "rMKDtS17rDD7f";
        if (string.equals(string2)) {
            return C2E.A00(this.A01.A00()).A09();
        }
        sharedPreferencesA00.edit().putString(strA01, Locale.getDefault().toString()).apply();
        return 0L;
    }

    private void A03(Map<String, String> params, String str, String str2) {
        params.put(str, str2);
    }

    public final int A04() {
        return this.A00;
    }

    public final KM A05() {
        return this.A02;
    }

    @Nullable
    public final M4 A06() {
        return this.A03;
    }

    public final String A07() {
        return this.A06;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0119  */
    /* JADX WARN: Code duplicated, block: B:29:0x012a  */
    /* JADX WARN: Code duplicated, block: B:32:0x013f  */
    /* JADX WARN: Code duplicated, block: B:40:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:43:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:46:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:49:0x0207  */
    /* JADX WARN: Code duplicated, block: B:53:0x0225  */
    public final Map<String, String> A08(Map<String, String> map) {
        String strA01;
        String str;
        int i;
        boolean z;
        String strA05;
        String str2;
        String str3;
        String str4;
        HashMap map2 = new HashMap(map);
        A03(map2, A01(125, 4, 91), C03855s.A00().A03());
        if (C03855s.A00().A04()) {
            strA01 = A01(0, 1, 52);
        } else {
            strA01 = A01(1, 1, 52);
        }
        A03(map2, A01(129, 9, 31), strA01);
        A03(map2, A01(93, 5, 29), String.valueOf(this.A08));
        A03(map2, A01(207, 12, 3), this.A06);
        if (this.A0B != AdPlacementType.UNKNOWN) {
            A03(map2, A01(219, 14, 30), this.A0B.toString().toLowerCase());
        }
        M4 m4 = this.A03;
        if (m4 != null) {
            A03(map2, A01(276, 5, 52), String.valueOf(m4.A01()));
            A03(map2, A01(119, 6, 81), String.valueOf(this.A03.A00()));
        }
        KM km = this.A02;
        if (km != null) {
            A03(map2, A01(256, 11, 36), String.valueOf(km.A03()));
        }
        boolean z2 = this.A0A;
        String[] strArr = A0F;
        if (strArr[1].charAt(22) == strArr[3].charAt(22)) {
            String[] strArr2 = A0F;
            strArr2[1] = "IzDezfH0vo2hFBj3g0HaogFvU1PF9PgW";
            strArr2[3] = "07eFZyxYDfzIdCogAj5SagFmNdTPnXPY";
            if (z2) {
                String strA02 = A01(267, 9, 99);
                String strA03 = A01(1, 1, 52);
                String[] strArr3 = A0F;
                if (strArr3[7].length() == strArr3[0].length()) {
                    A0F[5] = "fhkQkDUQCs0vTSuMh05aUEfBswduYuq5";
                    A03(map2, strA02, strA03);
                    str = this.A0D;
                    if (str != null) {
                        A03(map2, A01(98, 10, 51), str);
                    }
                    i = this.A00;
                    if (i != 0) {
                        A03(map2, A01(190, 17, 113), String.valueOf(i));
                    }
                    z = this.A09;
                    if (z) {
                        A03(map2, A01(138, 22, 92), String.valueOf(z));
                    }
                    A03(map2, A01(160, 13, 80), String.valueOf(MT.A02(this.A01)));
                    A03(map2, A01(233, 12, 126), MJ.A05(System.currentTimeMillis()));
                    if (this.A0C.A06() && this.A0C.A04() != null) {
                        A03(map2, A01(56, 6, 113), this.A0C.A04());
                    }
                    strA05 = this.A0C.A05();
                    if (!TextUtils.isEmpty(strA05)) {
                        A03(map2, A01(62, 14, 71), strA05);
                    }
                    str2 = this.A07;
                    if (str2 != null) {
                        A03(map2, A01(245, 11, 114), str2);
                    }
                    A03(map2, A01(76, 17, 73), UUID.randomUUID().toString());
                    A03(map2, A01(20, 36, 122), MJ.A06(A00()));
                    str3 = this.A05;
                    if (str3 != null) {
                        A03(map2, A01(108, 11, 111), str3);
                    }
                    str4 = this.A04;
                    if (str4 != null) {
                        if (A0F[5].length() == 32) {
                            String[] strArr4 = A0F;
                            strArr4[1] = "oug9irQjulGDcN1zjjec1oFwPujMP8yb";
                            strArr4[3] = "P1fPvVUp9X55Q5Xl2H8DBdFxzWSw3WjN";
                            A03(map2, A01(2, 18, 13), str4);
                        }
                    }
                    return map2;
                }
            } else {
                str = this.A0D;
                if (str != null) {
                    A03(map2, A01(98, 10, 51), str);
                }
                i = this.A00;
                if (i != 0) {
                    A03(map2, A01(190, 17, 113), String.valueOf(i));
                }
                z = this.A09;
                if (z) {
                    A03(map2, A01(138, 22, 92), String.valueOf(z));
                }
                A03(map2, A01(160, 13, 80), String.valueOf(MT.A02(this.A01)));
                A03(map2, A01(233, 12, 126), MJ.A05(System.currentTimeMillis()));
                if (this.A0C.A06()) {
                    A03(map2, A01(56, 6, 113), this.A0C.A04());
                }
                strA05 = this.A0C.A05();
                if (!TextUtils.isEmpty(strA05)) {
                    A03(map2, A01(62, 14, 71), strA05);
                }
                str2 = this.A07;
                if (str2 != null) {
                    A03(map2, A01(245, 11, 114), str2);
                }
                A03(map2, A01(76, 17, 73), UUID.randomUUID().toString());
                A03(map2, A01(20, 36, 122), MJ.A06(A00()));
                str3 = this.A05;
                if (str3 != null) {
                    A03(map2, A01(108, 11, 111), str3);
                }
                str4 = this.A04;
                if (str4 != null) {
                    if (A0F[5].length() == 32) {
                        String[] strArr5 = A0F;
                        strArr5[1] = "oug9irQjulGDcN1zjjec1oFwPujMP8yb";
                        strArr5[3] = "P1fPvVUp9X55Q5Xl2H8DBdFxzWSw3WjN";
                        A03(map2, A01(2, 18, 13), str4);
                    }
                }
                return map2;
            }
        }
        throw new RuntimeException();
    }
}
