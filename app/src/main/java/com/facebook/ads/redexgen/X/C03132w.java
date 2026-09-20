package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C03132w extends AbstractC0533Bz {
    public static byte[] A05;
    public static String[] A06 = {"nLO9L7XoEpR8vgnDFT", "WlEQ0W9HytVOtlcgcYyzDlj1QkZOFGjO", "ODtnbW3mHTyNn479FkodGv794qS9hsWl", "APk9cVzJYKr2vBqvSJCf7k3ktACu2ubu", "Tq9sEDvjDozJ9rvk5K396aURjyjwu7hY", "bGv", "ZQgwsO83xrUrRKbDM61rEvH7uEXNNVYo", "gyYiWp0aVpa2EpLIT9J28do7UtlziSMd"};
    public static final Pattern A07;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final boolean A04;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 114);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{-98, -20, 3, -2, -20, 32, 40, -17, -19, -2, -19, 3, -20, 32, 40, -17, -19, -2, -20, 32, 40, -17, -19, -20, 3, -2, -2, 64, 32, -14, -19, -20, 32, 40, -17, -19, -82, 44, 81, 73, 84, 87, 79, 93, 77, 34, 8, -2, 39, 42, 37, 25, 44, -14, -40, -5, 19, 17, 24, 24, 17, 22, 15, -56, 12, 17, 9, 20, 23, 15, 29, 13, -56, 20, 17, 22, 13, -56, 10, 13, 14, 23, 26, 13, -56, 11, 23, 21, 24, 20, 13, 28, 13, -56, 14, 23, 26, 21, 9, 28, -30, -56, 17, 41, 39, 46, 46, 39, 44, 37, -34, 34, 39, 31, 42, 45, 37, 51, 35, -34, 42, 39, 44, 35, -34, 53, 39, 50, 38, -34, 36, 35, 53, 35, 48, -34, 33, 45, 42, 51, 43, 44, 49, -34, 50, 38, 31, 44, -34, 36, 45, 48, 43, 31, 50, -8, -34, -35, -11, -13, -6, -6, -13, -8, -15, -86, -13, -8, 0, -21, -10, -13, -18, -86, -2, -13, -9, -13, -8, -15, -60, -86, 68, 100, 82, 53, 86, 84, 96, 85, 86, 99, -11, -33, 16, -1, 8, 14, 13, -9, 42, 42, 28, 73, 73, 91, 21, 52, -25, -29, -8, 21, 54, -24, -15, -25, 53, 54, 35, 52, 54, 85, 70, 89, 85};
    }

    static {
        A03();
        A07 = Pattern.compile(A02(1, 35, 82));
    }

    public C03132w() {
        this(null);
    }

    public C03132w(@Nullable List<byte[]> list) {
        super(A02(182, 10, 127));
        if (list != null && !list.isEmpty()) {
            this.A04 = true;
            String strA0Q = C0695Iz.A0Q(list.get(0));
            IK.A03(strA0Q.startsWith(A02(47, 8, 70)));
            A06(strA0Q);
            A04(new C0679Ij(list.get(1)));
            return;
        }
        this.A04 = false;
    }

    public static long A00(String str) {
        Matcher matcher = A07.matcher(str);
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        long j = Long.parseLong(matcher.group(1)) * 60 * 60 * 1000000;
        long timestampUs = Long.parseLong(matcher.group(2));
        long j2 = j + (timestampUs * 60 * 1000000);
        long timestampUs2 = Long.parseLong(matcher.group(3));
        return j2 + (timestampUs2 * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC0533Bz
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final VM A0b(byte[] bArr, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        IZ iz = new IZ();
        C0679Ij c0679Ij = new C0679Ij(bArr, i);
        if (!this.A04) {
            A04(c0679Ij);
        }
        A05(c0679Ij, arrayList, iz);
        GX[] gxArr = new GX[arrayList.size()];
        arrayList.toArray(gxArr);
        return new VM(gxArr, iz.A05());
    }

    private void A04(C0679Ij c0679Ij) {
        String strA0P;
        do {
            strA0P = c0679Ij.A0P();
            if (strA0P == null) {
                return;
            }
            if (A06[6].charAt(30) != 'Y') {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[0] = "7FHmrvaj0sy2XXhHTc";
            strArr[5] = "VJa";
        } while (!strA0P.startsWith(A02(192, 8, 40)));
    }

    private void A05(C0679Ij c0679Ij, List<GX> list, IZ iz) {
        while (true) {
            String strA0P = c0679Ij.A0P();
            if (strA0P != null) {
                if (!this.A04 && strA0P.startsWith(A02(47, 8, 70))) {
                    A06(strA0P);
                } else if (strA0P.startsWith(A02(37, 10, 118))) {
                    A07(strA0P, list, iz);
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x006a  */
    private void A06(String str) {
        String[] strArrSplit = TextUtils.split(str.substring(A02(47, 8, 70).length()), A02(36, 1, 16));
        this.A01 = strArrSplit.length;
        this.A02 = -1;
        this.A00 = -1;
        this.A03 = -1;
        int i = 0;
        while (true) {
            int i2 = this.A01;
            byte b = 0;
            if (A06[7].charAt(27) != 'z') {
                throw new RuntimeException();
            }
            A06[6] = "ohbteayusWQmP2eqo1O6uo4DamJwM8Y2";
            if (i < i2) {
                String strA0M = C0695Iz.A0M(strArrSplit[i].trim());
                int iHashCode = strA0M.hashCode();
                if (iHashCode != 100571) {
                    if (iHashCode != 3556653) {
                        if (iHashCode != 109757538 || !strA0M.equals(A02(216, 5, 80))) {
                            b = -1;
                        }
                    } else if (strA0M.equals(A02(221, 4, 111))) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                } else if (strA0M.equals(A02(213, 3, 17))) {
                    b = 1;
                } else {
                    b = -1;
                }
                if (b == 0) {
                    this.A02 = i;
                } else if (b == 1) {
                    this.A00 = i;
                } else if (b == 2) {
                    this.A03 = i;
                }
                i++;
            } else {
                int i3 = this.A02;
                String[] strArr = A06;
                if (strArr[3].length() != strArr[4].length()) {
                    throw new RuntimeException();
                }
                A06[1] = "les6sY7sl1N1w442PsI3dyj52qvLqIgC";
                if (i3 == -1 || this.A00 == -1 || this.A03 == -1) {
                    this.A01 = 0;
                    return;
                }
                return;
            }
        }
    }

    private void A07(String str, List<GX> list, IZ iz) {
        int i = this.A01;
        String strA02 = A02(182, 10, 127);
        if (i == 0) {
            Log.w(strA02, A02(55, 47, 54) + str);
            return;
        }
        String[] strArrSplit = str.substring(A02(37, 10, 118).length()).split(A02(36, 1, 16), this.A01);
        if (strArrSplit.length != this.A01) {
            Log.w(strA02, A02(102, 55, 76) + str);
            return;
        }
        long jA00 = A00(strArrSplit[this.A02]);
        String strA03 = A02(157, 25, 24);
        if (jA00 == -9223372036854775807L) {
            Log.w(strA02, strA03 + str);
            return;
        }
        long endTimeUs = -9223372036854775807L;
        String str2 = strArrSplit[this.A00];
        if (!str2.trim().isEmpty()) {
            endTimeUs = A00(str2);
            if (endTimeUs == -9223372036854775807L) {
                Log.w(strA02, strA03 + str);
                return;
            }
        }
        String strReplaceAll = strArrSplit[this.A03].replaceAll(A02(206, 7, 71), A02(0, 0, 15));
        String strA04 = A02(0, 1, 34);
        list.add(new GX(strReplaceAll.replaceAll(A02(RCHTTPStatusCodes.SUCCESS, 3, 92), strA04).replaceAll(A02(203, 3, 123), strA04)));
        iz.A04(jA00);
        if (endTimeUs != -9223372036854775807L) {
            list.add(null);
            iz.A04(endTimeUs);
        }
    }
}
