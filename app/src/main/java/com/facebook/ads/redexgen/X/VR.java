package com.facebook.ads.redexgen.X;

import android.text.Html;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import com.facebook.ads.internal.exoplayer2.Format;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class VR implements InterfaceC0620Ga {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 103);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{62, 11, 11, 26, 18, 15, 11, 26, 27, 95, 11, 16, 95, 28, 13, 26, 30, 11, 26, 95, 27, 26, 28, 16, 27, 26, 13, 95, 25, 16, 13, 95, 10, 17, 12, 10, 15, 15, 16, 13, 11, 26, 27, 95, 25, 16, 13, 18, 30, 11, 113, 96, 96, 124, 121, 115, 113, 100, 121, 127, 126, 63, 115, 117, 113, 61, 38, 32, 40, 29, 12, 12, 16, 21, 31, 29, 8, 21, 19, 18, 83, 31, 25, 29, 81, 75, 76, 68, 103, 118, 118, 106, 111, 101, 103, 114, 111, 105, 104, 41, 98, 112, 100, 117, 115, 100, 117, 28, 13, 13, 17, 20, 30, 28, 9, 20, 18, 19, 82, 13, 26, 14, 81, 64, 64, 92, 89, 83, 81, 68, 89, 95, 94, 31, 68, 68, 93, 92, 27, 72, 93, 92, 33, 48, 48, 44, 41, 35, 33, 52, 41, 47, 46, 111, 56, 109, 45, 48, 116, 109, 35, 37, 33, 109, 118, 112, 120, 63, 46, 46, 50, 55, 61, 63, 42, 55, 49, 48, 113, 38, 115, 51, 46, 106, 115, 40, 42, 42, 123, 106, 106, 118, 115, 121, 123, 110, 115, 117, 116, 53, 98, 55, 107, 111, 115, 121, 113, 110, 115, 119, 127, 55, 110, 98, 41, 125, 4, 21, 21, 9, 12, 6, 4, 17, 12, 10, 11, 74, 29, 72, 22, 16, 7, 23, 12, 21, 99, 114, 111, 99, 56, 97, 99, 99, 70, 87, 74, 70, 29, 74, 31, 65, 65, 83};
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x0009  */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0620Ga
    public final VS A4G(Format format) {
        byte b;
        String str = format.A0O;
        switch (str.hashCode()) {
            case -1351681404:
                if (!str.equals(A00(88, 19, 97))) {
                    b = -1;
                } else {
                    b = 9;
                }
                break;
            case -1248334819:
                if (!str.equals(A00(107, 15, 26))) {
                    b = -1;
                } else {
                    b = 10;
                }
                break;
            case -1026075066:
                if (!str.equals(A00(167, 21, 57))) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case -1004728940:
                if (!str.equals(A00(236, 8, 112))) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case 691401887:
                if (!str.equals(A00(188, 28, 125))) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case 822864842:
                if (!str.equals(A00(244, 10, 85))) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 930165504:
                if (!str.equals(A00(142, 25, 39))) {
                    b = -1;
                } else {
                    b = 7;
                }
                break;
            case 1566015601:
                if (!str.equals(A00(50, 19, 119))) {
                    b = -1;
                } else {
                    b = 6;
                }
                break;
            case 1566016562:
                if (!str.equals(A00(69, 19, 27))) {
                    b = -1;
                } else {
                    b = 8;
                }
                break;
            case 1668750253:
                if (!str.equals(A00(216, 20, 2))) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case 1693976202:
                if (!str.equals(A00(122, 20, 87))) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                return new AbstractC0533Bz() { // from class: com.facebook.ads.redexgen.X.2O
                    public static byte[] A05;
                    public static String[] A06 = {"CMeD5mXDZDTfb", "fWYAWHkLFKDlflVtn3klkQMszSy2czx5", "00RFRgIDsqiIARLTNA3N6SPhWhBdnLh1", "U8JLQKkyCBG48OlAsiyvwZYOetZ2qreJ", "pY35d7af18sebuviuQ2bLCANBl7hHJuY", "f8ToU2BaHxZg9tVTog2hKPYEgQcC6j0M", "sxXavdrivd5JbbwFv9VJPSRnNTBEZ25u", "aixApfSzl80yG78LfLrSNW905rKMIX1l"};
                    public final H2 A00;
                    public final H8 A01;
                    public final HB A02;
                    public final C0679Ij A03;
                    public final List<H6> A04;

                    public static String A02(int i, int i2, int i3) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
                        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
                            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 113);
                        }
                        return new String(bArrCopyOfRange);
                    }

                    public static void A03() {
                        A05 = new byte[]{89, 56, 107, 108, 97, 116, 125, 56, 122, 116, 119, 123, 115, 56, 111, 121, 107, 56, 126, 119, 109, 118, 124, 56, 121, 126, 108, 125, 106, 56, 108, 112, 125, 56, 126, 113, 106, 107, 108, 56, 123, 109, 125, 54, 52, 53, 46, 63, 28, 27, 22, 3, 10, 29, 47, 40, 60, 62, 62, 14, 47, 41, 37, 46, 47, 56};
                    }

                    static {
                        A03();
                    }

                    {
                        A02(53, 13, 59);
                        this.A02 = new HB();
                        this.A03 = new C0679Ij();
                        this.A01 = new H8();
                        this.A00 = new H2();
                        this.A04 = new ArrayList();
                    }

                    public static int A00(C0679Ij c0679Ij) {
                        int currentInputPosition = -1;
                        int iA06 = 0;
                        while (currentInputPosition == -1) {
                            iA06 = c0679Ij.A06();
                            String strA0P = c0679Ij.A0P();
                            if (strA0P == null) {
                                currentInputPosition = 0;
                            } else if (A02(48, 5, 62).equals(strA0P)) {
                                currentInputPosition = 2;
                            } else if (A02(44, 4, 11).startsWith(strA0P)) {
                                currentInputPosition = 1;
                            } else {
                                currentInputPosition = 3;
                            }
                        }
                        c0679Ij.A0Y(iA06);
                        String[] strArr = A06;
                        if (strArr[1].charAt(4) == strArr[2].charAt(4)) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A06;
                        strArr2[1] = "wICfUq6cRqM8QSRmpIxw59la3C0B28Gh";
                        strArr2[2] = "UCa9DZD1GiApguhXmO9GHmNOpL0AOlSY";
                        return currentInputPosition;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    /* JADX WARN: Code duplicated, block: B:50:0x00a0 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:59:0x0042 A[SYNTHETIC] */
                    @Override // com.facebook.ads.redexgen.X.AbstractC0533Bz
                    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
                    public final VG A0b(byte[] bArr, int i, boolean z) throws GZ {
                        boolean zIsEmpty;
                        H6 h6A0E;
                        this.A03.A0b(bArr, i);
                        this.A01.A0E();
                        this.A04.clear();
                        HC.A04(this.A03);
                        do {
                            zIsEmpty = TextUtils.isEmpty(this.A03.A0P());
                            if (A06[7].charAt(24) != '5') {
                                throw new RuntimeException();
                            }
                            A06[4] = "yIxA0yuP9hQGFN4fa3NPu5J4rTDeCvUe";
                        } while (!zIsEmpty);
                        ArrayList arrayList = new ArrayList();
                        while (true) {
                            int iA00 = A00(this.A03);
                            if (iA00 != 0) {
                                if (iA00 == 1) {
                                    A04(this.A03);
                                } else {
                                    if (A06[6].charAt(24) != 'N') {
                                        throw new RuntimeException();
                                    }
                                    A06[4] = "ccU6TSbM8V8OtEl7BaomB3QNW5j0Q6sw";
                                    if (iA00 == 2) {
                                        boolean zIsEmpty2 = arrayList.isEmpty();
                                        if (A06[0].length() != 13) {
                                            String[] strArr = A06;
                                            strArr[1] = "YowA8l8uvxZXaVypumJ5yBUyc4sOcAQV";
                                            strArr[2] = "HKbmxYlwqclncAnOAoFTo7zzjR7PE75y";
                                            if (!zIsEmpty2) {
                                                throw new GZ(A02(0, 44, 105));
                                            }
                                            this.A03.A0P();
                                            h6A0E = this.A00.A0E(this.A03);
                                            if (h6A0E != null) {
                                                this.A04.add(h6A0E);
                                            }
                                        } else {
                                            String[] strArr2 = A06;
                                            strArr2[1] = "RankGpg1WKksvMbJf2r1Mj9i4dXCVfm7";
                                            strArr2[2] = "PTwUfk4233EGPZYG7vYxG5zvlLDyWplM";
                                            if (!zIsEmpty2) {
                                                throw new GZ(A02(0, 44, 105));
                                            }
                                            this.A03.A0P();
                                            h6A0E = this.A00.A0E(this.A03);
                                            if (h6A0E != null) {
                                                this.A04.add(h6A0E);
                                            }
                                        }
                                    } else if (iA00 == 3 && this.A02.A0G(this.A03, this.A01, this.A04)) {
                                        arrayList.add(this.A01.A0D());
                                        this.A01.A0E();
                                    }
                                }
                            } else {
                                return new VG(arrayList);
                            }
                        }
                    }

                    public static void A04(C0679Ij c0679Ij) {
                        while (!TextUtils.isEmpty(c0679Ij.A0P())) {
                        }
                    }
                };
            case 1:
                return new C03132w(format.A0P);
            case 2:
                return new AbstractC0533Bz() { // from class: com.facebook.ads.redexgen.X.2f
                    public static byte[] A02;
                    public static final int A03;
                    public static final int A04;
                    public static final int A05;
                    public final H8 A00;
                    public final C0679Ij A01;

                    public static String A02(int i, int i2, int i3) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
                        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
                            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 118);
                        }
                        return new String(bArrCopyOfRange);
                    }

                    public static void A03() {
                        A02 = new byte[]{1, 38, 27, 39, 37, 40, 36, 29, 44, 29, -40, 5, 40, -20, 15, 29, 26, 46, 44, 44, -40, 12, 39, 40, -40, 4, 29, 46, 29, 36, -40, 26, 39, 48, -40, 32, 29, 25, 28, 29, 42, -40, 30, 39, 45, 38, 28, -26, 43, 80, 69, 81, 79, 82, 78, 71, 86, 71, 2, 88, 86, 86, 2, 69, 87, 71, 2, 68, 81, 90, 2, 74, 71, 67, 70, 71, 84, 2, 72, 81, 87, 80, 70, 16, 16, 51, -9, 26, 40, 37, 57, 55, 55, 7, 40, 38, 50, 39, 40, 53, 3, -12, 12, -1, -14, -13, -13, -26, 54, 52, 52, 35};
                    }

                    static {
                        A03();
                        A03 = C0695Iz.A08(A02(100, 4, 29));
                        A04 = C0695Iz.A08(A02(104, 4, 9));
                        A05 = C0695Iz.A08(A02(108, 4, 74));
                    }

                    {
                        A02(84, 16, 77);
                        this.A01 = new C0679Ij();
                        this.A00 = new H8();
                    }

                    public static GX A00(C0679Ij c0679Ij, H8 h8, int payloadLength) throws GZ {
                        h8.A0E();
                        while (payloadLength > 0) {
                            if (payloadLength >= 8) {
                                int iA08 = c0679Ij.A08();
                                int iA09 = c0679Ij.A08();
                                int i = iA08 - 8;
                                String strA0R = C0695Iz.A0R(c0679Ij.A00, c0679Ij.A06(), i);
                                c0679Ij.A0Z(i);
                                payloadLength = (payloadLength - 8) - i;
                                if (iA09 == A04) {
                                    HB.A08(strA0R, h8);
                                } else if (iA09 == A03) {
                                    HB.A0C(null, strA0R.trim(), h8, Collections.emptyList());
                                }
                            } else {
                                throw new GZ(A02(48, 36, 108));
                            }
                        }
                        return h8.A0D();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // com.facebook.ads.redexgen.X.AbstractC0533Bz
                    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
                    public final VI A0b(byte[] bArr, int i, boolean z) throws GZ {
                        this.A01.A0b(bArr, i);
                        ArrayList arrayList = new ArrayList();
                        while (this.A01.A04() > 0) {
                            if (this.A01.A04() >= 8) {
                                int iA08 = this.A01.A08();
                                if (this.A01.A08() == A05) {
                                    arrayList.add(A00(this.A01, this.A00, iA08 - 8));
                                } else {
                                    this.A01.A0Z(iA08 - 8);
                                }
                            } else {
                                throw new GZ(A02(0, 48, 66));
                            }
                        }
                        return new VI(arrayList);
                    }
                };
            case 3:
                return new AbstractC0533Bz() { // from class: com.facebook.ads.redexgen.X.2u
                    public static byte[] A01;
                    public static String[] A02 = {"PhyvuE7y18", "xBnTZw3ZbiLDM63QcLiGd0", "O9uX8", "8b1nsz8L9hYpMQj9k3QW3WLnldrKItOm", "IMNHpcvYsehX8cLei6jDJchiF9gMYU0V", "8kdCvXuY1XJXgrxFttVDI6044U6IZeyY", "sEif2eB2MLrj2k4lXiRDbZReHYoJKwJL", "5aPBLAKnhKpgqnxagNkfr0"};
                    public static final C0639Gt A03;
                    public static final C0640Gu A04;
                    public static final Pattern A05;
                    public static final Pattern A06;
                    public static final Pattern A07;
                    public static final Pattern A08;
                    public static final Pattern A09;
                    public final XmlPullParserFactory A00;

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException
                     */
                    public static long A00(String str2, C0640Gu c0640Gu) throws GZ {
                        Matcher matcher = A06.matcher(str2);
                        if (matcher.matches()) {
                            double d = (Long.parseLong(matcher.group(1)) * 3600) + (Long.parseLong(matcher.group(2)) * 60) + Long.parseLong(matcher.group(3));
                            String strGroup = matcher.group(4);
                            double d2 = d + (strGroup != null ? Double.parseDouble(strGroup) : 0.0d);
                            String strGroup2 = matcher.group(5);
                            double d3 = d2 + (strGroup2 != null ? Long.parseLong(strGroup2) / c0640Gu.A00 : 0.0d);
                            String strGroup3 = matcher.group(6);
                            return (long) (1000000.0d * (d3 + (strGroup3 != null ? (Long.parseLong(strGroup3) / ((double) c0640Gu.A01)) / ((double) c0640Gu.A00) : 0.0d)));
                        }
                        Matcher matcher2 = A08.matcher(str2);
                        if (!matcher2.matches()) {
                            throw new GZ(A08(556, 27, 38) + str2);
                        }
                        double d4 = Double.parseDouble(matcher2.group(1));
                        String strGroup4 = matcher2.group(2);
                        byte b2 = -1;
                        int iHashCode = strGroup4.hashCode();
                        if (iHashCode != 102) {
                            if (iHashCode != 104) {
                                if (iHashCode != 109) {
                                    if (iHashCode != 3494) {
                                        if (iHashCode != 115) {
                                            if (iHashCode == 116 && strGroup4.equals(A08(1374, 1, 68))) {
                                                b2 = 5;
                                            }
                                        } else if (strGroup4.equals(A08(1302, 1, 5))) {
                                            b2 = 2;
                                        }
                                    } else if (strGroup4.equals(A08(1256, 2, 1))) {
                                        b2 = 3;
                                    }
                                } else if (strGroup4.equals(A08(1247, 1, 86))) {
                                    b2 = 1;
                                }
                            } else if (strGroup4.equals(A08(1178, 1, 87))) {
                                b2 = 0;
                            }
                        } else if (strGroup4.equals(A08(1072, 1, 23))) {
                            b2 = 4;
                        }
                        if (b2 == 0) {
                            d4 *= 3600.0d;
                        } else if (b2 == 1) {
                            d4 *= 60.0d;
                        } else if (b2 != 2) {
                            if (b2 == 3) {
                                String[] strArr = A02;
                                if (strArr[1].length() != strArr[7].length()) {
                                    throw new RuntimeException();
                                }
                                String[] strArr2 = A02;
                                strArr2[6] = "4wWFQkJIgDUDxvhbLoyjDEJLfIHbXKXA";
                                strArr2[4] = "i9Tkte0qzP2dvhcWyRZLUYoYUmQQFstK";
                                d4 /= 1000.0d;
                            } else if (b2 == 4) {
                                d4 /= (double) c0640Gu.A00;
                            } else if (b2 == 5) {
                                d4 /= (double) c0640Gu.A02;
                            }
                        }
                        return (long) (1000000.0d * d4);
                    }

                    public static String A08(int i, int i2, int i3) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
                        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
                            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 51);
                        }
                        return new String(bArrCopyOfRange);
                    }

                    public static void A0A() {
                        A01 = new byte[]{-69, -61, -98, -91, 113, -52, -8, -2, -11, -19, -9, -80, -3, -87, -20, -5, -18, -22, -3, -18, -87, -31, -10, -11, -39, -2, -11, -11, -39, -22, -5, -4, -18, -5, -49, -22, -20, -3, -8, -5, 2, -87, -14, -9, -4, -3, -22, -9, -20, -18, -43, -16, -8, -5, -12, -13, -81, -1, -16, 1, 2, -8, -3, -10, -81, -15, -16, -14, -6, -10, 1, -2, 4, -3, -13, -81, 5, -16, -5, 4, -12, -55, -81, -117, -90, -82, -79, -86, -87, 101, -75, -90, -73, -72, -82, -77, -84, 101, -88, -76, -79, -76, -73, 101, -69, -90, -79, -70, -86, 127, 101, -10, 17, 25, 28, 21, 20, -48, 32, 17, 34, 35, 25, 30, 23, -48, 22, 31, 30, 36, 3, 25, 42, 21, -48, 38, 17, 28, 37, 21, -22, -48, -101, -71, -64, -63, -60, -69, -64, -71, 114, -65, -77, -66, -72, -63, -60, -65, -73, -74, 114, -75, -73, -66, -66, 114, -60, -73, -59, -63, -66, -57, -58, -69, -63, -64, -116, 114, -90, -60, -53, -52, -49, -58, -53, -60, 125, -49, -62, -60, -58, -52, -53, 125, -44, -58, -47, -59, 125, -54, -66, -55, -61, -52, -49, -54, -62, -63, 125, -62, -43, -47, -62, -53, -47, -105, 125, -39, -9, -2, -1, 2, -7, -2, -9, -80, 2, -11, -9, -7, -1, -2, -80, 7, -7, 4, -8, -80, -3, -15, -4, -10, -1, 2, -3, -11, -12, -80, -1, 2, -7, -9, -7, -2, -54, -80, -108, -78, -71, -70, -67, -76, -71, -78, 107, -67, -80, -78, -76, -70, -71, 107, -62, -76, -65, -77, 107, -64, -71, -66, -64, -69, -69, -70, -67, -65, -80, -81, 107, -80, -61, -65, -80, -71, -65, -123, 107, -95, -65, -58, -57, -54, -63, -58, -65, 120, -54, -67, -65, -63, -57, -58, 120, -49, -63, -52, -64, 120, -51, -58, -53, -51, -56, -56, -57, -54, -52, -67, -68, 120, -57, -54, -63, -65, -63, -58, -110, 120, -54, -24, -17, -16, -13, -22, -17, -24, -95, -13, -26, -24, -22, -16, -17, -95, -8, -22, -11, -23, -16, -10, -11, -95, -30, -17, -95, -26, -7, -11, -26, -17, -11, -75, -45, -38, -37, -34, -43, -38, -45, -116, -34, -47, -45, -43, -37, -38, -116, -29, -43, -32, -44, -37, -31, -32, -116, -51, -38, -116, -37, -34, -43, -45, -43, -38, -50, -20, -13, -12, -9, -18, -13, -20, -91, -6, -13, -8, -6, -11, -11, -12, -9, -7, -22, -23, -91, -7, -26, -20, -65, -91, -111, -74, -66, -87, -76, -79, -84, 104, -85, -83, -76, -76, 104, -70, -83, -69, -73, -76, -67, -68, -79, -73, -74, 104, -6, 31, 39, 18, 29, 26, 21, -47, 22, 41, 33, 35, 22, 36, 36, 26, 32, 31, -47, 23, 32, 35, -47, 23, 32, 31, 37, 4, 26, 43, 22, -21, -47, -40, -19, 18, 26, 5, 16, 13, 8, -60, 18, 25, 17, 6, 9, 22, -60, 19, 10, -60, 9, 18, 24, 22, 13, 9, 23, -60, 10, 19, 22, -60, 10, 19, 18, 24, -9, 13, 30, 9, -34, -60, -9, 28, 36, 15, 26, 23, 18, -50, 35, 28, 23, 34, -50, 20, 29, 32, -50, 20, 29, 28, 34, 1, 23, 40, 19, -24, -50, -43, -90, -70, -59, -65, -56, -53, -58, -66, -67, 121, -51, -62, -58, -66, 121, -66, -47, -55, -53, -66, -52, -52, -62, -56, -57, -109, 121, -43, -3, -12, -4, -15, -8, -12, -19, -88, -2, -23, -12, -3, -19, -5, -88, -15, -10, -88, -18, -9, -10, -4, -37, -15, 2, -19, -88, -23, -4, -4, -6, -15, -22, -3, -4, -19, -74, -88, -40, -15, -21, -13, -15, -10, -17, -88, -4, -16, -19, -88, -5, -19, -21, -9, -10, -20, -88, -2, -23, -12, -3, -19, -88, -18, -9, -6, -88, -2, -19, -6, -4, -15, -21, -23, -12, -88, -18, -9, -10, -4, -88, -5, -15, 2, -19, -88, -23, -10, -20, -88, -15, -17, -10, -9, -6, -15, -10, -17, -88, -4, -16, -19, -88, -18, -15, -6, -5, -4, -74, 1, 35, 30, 30, 32, 19, 33, 33, 23, 28, 21, -50, 30, 15, 32, 33, 19, 32, -50, 19, 32, 32, 29, 32, -97, -65, -72, -73, -113, -80, -82, -70, -81, -80, -67, -18, 7, -6, -5, 5, -2, -71, 13, 8, -71, -3, -2, -4, 8, -3, -2, -71, 12, 8, 14, 11, -4, -2, -60, -35, -44, -25, -33, -44, -46, -29, -44, -45, -113, -44, -31, -31, -34, -31, -113, -26, -41, -44, -35, -113, -31, -44, -48, -45, -40, -35, -42, -113, -40, -35, -33, -28, -29, -99, -41, -18, -90, 9, -45, -45, 6, -37, -40, -28, 8, -43, -39, -44, -22, 6, -37, -40, -28, 8, -42, -44, -45, 27, 35, 39, 16, 24, 39, -48, -44, -49, -105, 97, -108, 105, 102, 114, -106, 100, 97, 120, 115, -107, 103, -108, 105, 102, 114, -106, 100, 98, 120, 98, 97, -95, -75, -90, -75, -84, -75, -90, -84, -75, -97, -75, -83, 98, 93, -39, -93, -42, -85, -88, -76, -40, -42, -85, -88, -76, -40, -90, -92, -75, -93, -42, -85, -88, -76, -40, -42, -85, -88, -76, -40, -92, -75, -93, -42, -85, -88, -76, -40, -42, -85, -88, -76, -40, -92, -93, -70, -75, -93, -41, -87, -42, -85, -88, -76, -40, -90, -92, -9, -75, -93, -42, -85, -88, -76, -40, -42, -85, -88, -76, -40, -92, -93, -70, -75, -41, -87, -93, -42, -85, -88, -76, -40, -90, -92, -92, -70, -92, -70, -97, -35, -89, -37, -29, -86, -88, -97, -89, -37, -29, -86, -88, -93, -20, -74, -22, -14, -71, -22, -68, -51, -22, -14, -72, -51, -73, -77, -82, -74, -22, -14, -71, -22, -68, -51, -22, -14, -72, -51, -73, -77, -78, -64, -59, -45, -60, -47, -79, -80, -78, -70, -74, -63, -66, -60, -67, -77, -110, -66, 
                        -69, -66, -63, -60, -57, -55, -53, -48, -94, -81, -92, -71, -100, -87, -90, -98, -54, -38, -28, -26, -19, -19, -45, -26, -12, -16, -19, -10, -11, -22, -16, -17, -62, -60, -51, -45, -60, -47, -15, -3, -6, -3, 0, -72, -67, -57, -60, -64, -75, -51, -107, -64, -67, -69, -62, -24, -19, -6, -105, -88, -91, -92, -84, -28, -19, -29, -52, -33, -37, -52, -43, -37, -80, -58, -49, -50, -44, -90, -63, -51, -55, -52, -39, -82, -73, -74, -68, -101, -79, -62, -83, -61, -52, -53, -47, -80, -47, -42, -55, -62, -2, 7, 6, 12, -17, -3, 1, -1, 0, 12, -13, -1, -18, -6, -14, -33, -18, 1, -14, -60, -48, -65, -53, -61, -80, -65, -46, -61, -85, -45, -54, -46, -57, -50, -54, -57, -61, -48, 2, 14, -3, 9, 1, -18, -3, 16, 1, -23, 17, 8, 16, 5, 12, 8, 5, 1, 14, -68, 0, 11, 1, 15, 10, -61, 16, -68, 4, -3, 18, 1, -68, -50, -68, 12, -3, 14, 16, 15, -14, 6, 3, -1, 2, 0, 12, 12, 8, -46, -57, -57, 15, 15, 15, -58, 15, -53, -58, 7, 10, -1, -57, 6, 11, -57, 12, 12, 5, 4, -69, 8, -7, 10, -7, 5, -3, 12, -3, 10, 23, 18, -24, -13, -32, -21, -24, -30, -10, -21, 3, -7, -1, -2, -49, -56, -55, -41, -1, -4, 1, -8, 7, -5, 5, 2, 8, -6, -5, -10, 14, 6, 21, 2, 5, 2, 21, 2, -95, -89, 17, 18, 15, 12, 17, 8, 23, 11, 21, 18, 24, 10, 11, -67, -66, -60, -67, -77, -76, -63, -69, -72, -67, -76, -3, 0, -9, -11, -9, -4, -7, -89, -81, -8, -21, -19, -17, -11, -12, -67, -76, -78, -77, -65, -85, -44, -50, -47, -43, -58, -101, -59, -62, -43, -62, -46, -52, -49, -45, -60, -103, -56, -52, -64, -58, -60, 20, 14, 17, 21, 6, -37, 10, 15, 7, 16, 19, 14, 2, 21, 10, 16, 15, 4, 1, -14, -1, -85, -84, -103, -86, -84, 6, 7, 12, -1, -8, -80, -79, -74, -87, -90, -85, -92, 7, 9, -10, -38, 6, -11, 1, -7, -26, -11, 8, -7, -21, 2, -13, 6, 2, -49, -6, -9, -11, -4, -33, -48, -29, -33, -81, -48, -50, -38, -35, -52, -33, -44, -38, -39, -62, -73, -79, -71, -96, -81, -62, -77, -12, -12, -16, -23, -33, -32, -19, -25, -28, -23, -32};
                    }

                    static {
                        A0A();
                        A06 = Pattern.compile(A08(856, 85, 72));
                        A08 = Pattern.compile(A08(819, 37, 6));
                        A07 = Pattern.compile(A08(790, 29, 120));
                        A09 = Pattern.compile(A08(954, 29, 91));
                        A05 = Pattern.compile(A08(941, 13, 76));
                        A04 = new C0640Gu(30.0f, 1, 1);
                        A03 = new C0639Gt(32, 15);
                    }

                    {
                        A08(717, 11, 24);
                        try {
                            this.A00 = XmlPullParserFactory.newInstance();
                            this.A00.setNamespaceAware(true);
                        } catch (XmlPullParserException e) {
                            throw new RuntimeException(A08(5, 45, 86), e);
                        }
                    }

                    private C0639Gt A01(XmlPullParser xmlPullParser, C0639Gt c0639Gt) throws GZ {
                        String attributeValue = xmlPullParser.getAttributeValue(A08(1183, 35, 101), A08(1018, 14, 78));
                        if (attributeValue == null) {
                            return c0639Gt;
                        }
                        Matcher matcher = A05.matcher(attributeValue);
                        boolean zMatches = matcher.matches();
                        String strA08 = A08(142, 36, 31);
                        String strA09 = A08(717, 11, 24);
                        if (!zMatches) {
                            Log.w(strA09, strA08 + attributeValue);
                            return c0639Gt;
                        }
                        try {
                            int i = Integer.parseInt(matcher.group(1));
                            int i2 = Integer.parseInt(matcher.group(2));
                            if (i != 0 && i2 != 0) {
                                return new C0639Gt(i, i2);
                            }
                            throw new GZ(A08(430, 24, 21) + i + A08(0, 1, 104) + i2);
                        } catch (NumberFormatException unused) {
                            Log.w(strA09, strA08 + attributeValue);
                            return c0639Gt;
                        }
                    }

                    /* JADX WARN: Code duplicated, block: B:18:0x00a1 A[PHI: r0
  0x00a1: PHI (r0v24 java.lang.String) = (r0v18 java.lang.String), (r0v29 java.lang.String) binds: [B:25:0x00d6, B:17:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
                    private C0640Gu A02(XmlPullParser xmlPullParser) throws GZ {
                        String attributeValue;
                        int i = 30;
                        String subFrameRateString = A08(1183, 35, 101);
                        String attributeValue2 = xmlPullParser.getAttributeValue(subFrameRateString, A08(1110, 9, 90));
                        if (attributeValue2 != null) {
                            i = Integer.parseInt(attributeValue2);
                        }
                        float f = 1.0f;
                        String attributeValue3 = xmlPullParser.getAttributeValue(subFrameRateString, A08(1119, 19, 43));
                        String[] strArr = A02;
                        if (strArr[6].length() != strArr[4].length()) {
                            throw new RuntimeException();
                        }
                        A02[2] = "IpGFsBHeKmDb5lI80mlSglgmQh4";
                        if (attributeValue3 != null) {
                            String[] strArrA0l = C0695Iz.A0l(attributeValue3, A08(0, 1, 104));
                            if (strArrA0l.length == 2) {
                                f = Integer.parseInt(strArrA0l[0]) / Integer.parseInt(strArrA0l[1]);
                            } else {
                                String frameRateMultiplierString = A08(1138, 40, 105);
                                throw new GZ(frameRateMultiplierString);
                            }
                        }
                        int i2 = A04.A01;
                        String frameRateMultiplierString2 = A02[5];
                        if (frameRateMultiplierString2.charAt(9) != 'f') {
                            String[] strArr2 = A02;
                            strArr2[6] = "O4cx2PGKkzo9i5bvAJ72S2LPHrsLNif0";
                            strArr2[4] = "TMZr67wzPDUL2SWarNQCSHzekIsvycTc";
                            attributeValue = xmlPullParser.getAttributeValue(subFrameRateString, A08(1362, 12, 97));
                            if (attributeValue != null) {
                                i2 = Integer.parseInt(attributeValue);
                            }
                        } else {
                            A02[3] = "iJbAvzjhUKagc28VCQirSaMofa9qCEHE";
                            attributeValue = xmlPullParser.getAttributeValue(subFrameRateString, A08(1362, 12, 24));
                            if (attributeValue != null) {
                                i2 = Integer.parseInt(attributeValue);
                            }
                        }
                        int i3 = A04.A02;
                        String attributeValue4 = xmlPullParser.getAttributeValue(subFrameRateString, A08(1398, 8, 27));
                        if (attributeValue4 != null) {
                            i3 = Integer.parseInt(attributeValue4);
                        }
                        return new C0640Gu(i * f, i2, i3);
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Code duplicated, block: B:6:0x0038  */
                    private C0641Gv A03(XmlPullParser xmlPullParser, C0641Gv c0641Gv, Map<String, C0642Gw> map, C0640Gu c0640Gu) throws GZ {
                        byte b2;
                        C03112u c03112u = this;
                        long jA00 = -9223372036854775807L;
                        long jA01 = -9223372036854775807L;
                        long jA02 = -9223372036854775807L;
                        String strA08 = A08(0, 0, 105);
                        String[] strArr = null;
                        int attributeCount = xmlPullParser.getAttributeCount();
                        H1 h1A06 = c03112u.A06(xmlPullParser, null);
                        int i = 0;
                        while (i < attributeCount) {
                            String attributeName = xmlPullParser.getAttributeName(i);
                            String attr = xmlPullParser.getAttributeValue(i);
                            switch (attributeName.hashCode()) {
                                case -934795532:
                                    if (!attributeName.equals(A08(1291, 6, 83))) {
                                        b2 = -1;
                                    } else {
                                        b2 = 4;
                                    }
                                    break;
                                case 99841:
                                    if (!attributeName.equals(A08(1058, 3, 0))) {
                                        b2 = -1;
                                    } else {
                                        b2 = 2;
                                    }
                                    break;
                                case 100571:
                                    if (!attributeName.equals(A08(1063, 3, 76))) {
                                        b2 = -1;
                                    } else {
                                        b2 = 1;
                                    }
                                    break;
                                case 93616297:
                                    if (!attributeName.equals(A08(1003, 5, 47))) {
                                        b2 = -1;
                                    } else {
                                        b2 = 0;
                                    }
                                    break;
                                case 109780401:
                                    if (!attributeName.equals(A08(1350, 5, 96))) {
                                        b2 = -1;
                                    } else {
                                        b2 = 3;
                                    }
                                    break;
                                default:
                                    b2 = -1;
                                    break;
                            }
                            if (b2 == 0) {
                                jA01 = A00(attr, c0640Gu);
                            } else if (b2 == 1) {
                                jA02 = A00(attr, c0640Gu);
                            } else if (b2 == 2) {
                                jA00 = A00(attr, c0640Gu);
                            } else if (b2 != 3) {
                                if (b2 == 4 && map.containsKey(attr)) {
                                    strA08 = attr;
                                }
                            } else {
                                String[] strArrA0D = c03112u.A0D(attr);
                                if (strArrA0D.length > 0) {
                                    strArr = strArrA0D;
                                }
                            }
                            i++;
                            c03112u = this;
                        }
                        if (c0641Gv != null && c0641Gv.A02 != -9223372036854775807L) {
                            if (jA01 != -9223372036854775807L) {
                                jA01 += c0641Gv.A02;
                            }
                            if (jA02 != -9223372036854775807L) {
                                jA02 += c0641Gv.A02;
                            }
                        }
                        if (jA02 == -9223372036854775807L) {
                            if (jA00 != -9223372036854775807L) {
                                jA02 = jA01 + jA00;
                            } else if (c0641Gv != null && c0641Gv.A01 != -9223372036854775807L) {
                                jA02 = c0641Gv.A01;
                            }
                        }
                        String regionId = xmlPullParser.getName();
                        return C0641Gv.A05(regionId, jA01, jA02, h1A06, strArr, strA08);
                    }

                    /* JADX WARN: Code duplicated, block: B:26:0x00cc  */
                    private C0642Gw A04(XmlPullParser xmlPullParser, C0639Gt c0639Gt) {
                        byte b2;
                        String strA00 = J0.A00(xmlPullParser, A08(1218, 2, 123));
                        if (strA00 == null) {
                            return null;
                        }
                        String regionExtent = J0.A00(xmlPullParser, A08(1282, 6, 91));
                        String strA08 = A08(717, 11, 24);
                        if (regionExtent != null) {
                            Matcher matcher = A09.matcher(regionExtent);
                            if (matcher.matches()) {
                                try {
                                    String regionOrigin = matcher.group(1);
                                    float f = Float.parseFloat(regionOrigin) / 100.0f;
                                    float f2 = Float.parseFloat(matcher.group(2)) / 100.0f;
                                    String strA09 = A08(1066, 6, 52);
                                    if (A02[2].length() != 20) {
                                        A02[0] = "kbqIGlPE5F";
                                        String regionId = J0.A00(xmlPullParser, strA09);
                                        if (regionId != null) {
                                            Matcher matcher2 = A09.matcher(regionId);
                                            if (matcher2.matches()) {
                                                try {
                                                    float f3 = Float.parseFloat(matcher2.group(1)) / 100.0f;
                                                    float f4 = Float.parseFloat(matcher2.group(2)) / 100.0f;
                                                    int i = 0;
                                                    String displayAlign = J0.A00(xmlPullParser, A08(1043, 12, 33));
                                                    if (displayAlign != null) {
                                                        String strA0M = C0695Iz.A0M(displayAlign);
                                                        int iHashCode = strA0M.hashCode();
                                                        if (iHashCode != -1364013995) {
                                                            if (A02[0].length() != 24) {
                                                                String[] strArr = A02;
                                                                strArr[6] = "2XpiKC6CC7NiXww9zLW3u8p8qa24JoDf";
                                                                strArr[4] = "CSux5DlCYoxJWDBhwUVWsyxqcHbiLP0m";
                                                                if (iHashCode == 92734940 && strA0M.equals(A08(983, 5, 44))) {
                                                                    b2 = 1;
                                                                } else {
                                                                    b2 = -1;
                                                                }
                                                            }
                                                        } else if (strA0M.equals(A08(1032, 6, 44))) {
                                                            b2 = 0;
                                                        } else {
                                                            b2 = -1;
                                                        }
                                                        if (b2 != 0) {
                                                            if (b2 == 1) {
                                                                i = 2;
                                                                f2 += f4;
                                                            }
                                                        } else {
                                                            i = 1;
                                                            f2 += f4 / 2.0f;
                                                        }
                                                    }
                                                    return new C0642Gw(strA00, f, f2, 0, i, f3, 1, 1.0f / c0639Gt.A01);
                                                } catch (NumberFormatException unused) {
                                                    Log.w(strA08, A08(178, 39, 42) + regionExtent);
                                                    return null;
                                                }
                                            }
                                            Log.w(strA08, A08(256, 41, 24) + regionExtent);
                                            return null;
                                        }
                                        Log.w(strA08, A08(338, 33, 78));
                                        return null;
                                    }
                                    throw new RuntimeException();
                                } catch (NumberFormatException unused2) {
                                    Log.w(strA08, A08(217, 39, 93) + regionExtent);
                                    return null;
                                }
                            }
                            Log.w(strA08, A08(297, 41, 37) + regionExtent);
                            return null;
                        }
                        Log.w(strA08, A08(371, 33, 57));
                        return null;
                    }

                    private H1 A05(H1 h1) {
                        return h1 == null ? new H1() : h1;
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Code duplicated, block: B:6:0x0020  */
                    /* JADX WARN: Code duplicated, block: B:97:0x02fa  */
                    private H1 A06(XmlPullParser xmlPullParser, H1 h1) {
                        byte b2;
                        H1 h1A05 = h1;
                        int attributeCount = xmlPullParser.getAttributeCount();
                        for (int i = 0; i < attributeCount; i++) {
                            String attributeValue = xmlPullParser.getAttributeValue(i);
                            String attributeName = xmlPullParser.getAttributeName(i);
                            byte b3 = -1;
                            switch (attributeName.hashCode()) {
                                case -1550943582:
                                    if (attributeName.equals(A08(1091, 9, 42))) {
                                        b2 = 6;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case -1224696685:
                                    String[] strArr = A02;
                                    if (strArr[1].length() == strArr[7].length()) {
                                        A02[0] = "0APB9pAW9vSULNMmrRv";
                                        if (attributeName.equals(A08(1073, 10, 45))) {
                                            b2 = 3;
                                        } else {
                                            b2 = -1;
                                        }
                                    } else if (attributeName.equals(A08(1073, 10, 45))) {
                                        b2 = 3;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case -1065511464:
                                    if (attributeName.equals(A08(1375, 9, 91))) {
                                        b2 = 7;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case -879295043:
                                    if (attributeName.equals(A08(1384, 14, 56))) {
                                        b2 = 8;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case -734428249:
                                    if (attributeName.equals(A08(1100, 10, 101))) {
                                        b2 = 5;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case 3355:
                                    if (attributeName.equals(A08(1218, 2, 123))) {
                                        b2 = 0;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case 94842723:
                                    if (attributeName.equals(A08(1038, 5, 91))) {
                                        b2 = 2;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case 365601008:
                                    if (attributeName.equals(A08(1083, 8, 21))) {
                                        b2 = 4;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case 1287124693:
                                    if (attributeName.equals(A08(988, 15, 28))) {
                                        b2 = 1;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                default:
                                    b2 = -1;
                                    break;
                            }
                            int attributeCount2 = A02[5].charAt(9);
                            if (attributeCount2 != 102) {
                                A02[2] = "";
                                String strA08 = A08(717, 11, 24);
                                switch (b2) {
                                    case 0:
                                        if (A08(1350, 5, 96).equals(xmlPullParser.getName())) {
                                            h1A05 = A05(h1A05).A0G(attributeValue);
                                        }
                                        break;
                                    case 1:
                                        h1A05 = A05(h1A05);
                                        try {
                                            h1A05.A0A(IP.A03(attributeValue));
                                        } catch (IllegalArgumentException unused) {
                                            Log.w(strA08, A08(50, 33, 92) + attributeValue);
                                        }
                                        break;
                                    case 2:
                                        h1A05 = A05(h1A05);
                                        try {
                                            h1A05.A0B(IP.A03(attributeValue));
                                        } catch (IllegalArgumentException unused2) {
                                            Log.w(strA08, A08(83, 28, 18) + attributeValue);
                                        }
                                        break;
                                    case 3:
                                        H1 h1A06 = A05(h1A05);
                                        String[] strArr2 = A02;
                                        String str2 = strArr2[6];
                                        String str3 = strArr2[4];
                                        int attributeCount3 = str2.length();
                                        if (attributeCount3 == str3.length()) {
                                            String[] strArr3 = A02;
                                            strArr3[1] = "DQuuHNHuVaYCbqR7yeSwv7";
                                            strArr3[7] = "ULg3zfveVVXBcmJgycEkuK";
                                            h1A05 = h1A06.A0F(attributeValue);
                                        }
                                        break;
                                    case 4:
                                        try {
                                            h1A05 = A05(h1A05);
                                            A0B(attributeValue, h1A05);
                                        } catch (GZ unused3) {
                                            Log.w(strA08, A08(111, 31, 125) + attributeValue);
                                        }
                                        break;
                                    case 5:
                                        h1A05 = A05(h1A05).A0H(A08(1012, 4, 7).equalsIgnoreCase(attributeValue));
                                        break;
                                    case 6:
                                        h1A05 = A05(h1A05).A0I(A08(1220, 6, 76).equalsIgnoreCase(attributeValue));
                                        break;
                                    case 7:
                                        String strA0M = C0695Iz.A0M(attributeValue);
                                        switch (strA0M.hashCode()) {
                                            case -1364013995:
                                                if (strA0M.equals(A08(1032, 6, 44))) {
                                                    b3 = 4;
                                                }
                                                break;
                                            case 100571:
                                                if (strA0M.equals(A08(1063, 3, 76))) {
                                                    b3 = 3;
                                                }
                                                break;
                                            case 3317767:
                                                if (strA0M.equals(A08(1232, 4, 48))) {
                                                    b3 = 0;
                                                }
                                                break;
                                            case 108511772:
                                                if (strA0M.equals(A08(1297, 5, 24))) {
                                                    b3 = 2;
                                                }
                                                break;
                                            case 109757538:
                                                if (strA0M.equals(A08(1345, 5, 5))) {
                                                    b3 = 1;
                                                }
                                                break;
                                        }
                                        if (b3 == 0) {
                                            h1A05 = A05(h1A05).A0D(Layout.Alignment.ALIGN_NORMAL);
                                        } else if (b3 == 1) {
                                            h1A05 = A05(h1A05).A0D(Layout.Alignment.ALIGN_NORMAL);
                                        } else if (b3 == 2) {
                                            H1 h1A07 = A05(h1A05);
                                            Layout.Alignment alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                            int attributeCount4 = A02[5].charAt(9);
                                            if (attributeCount4 != 102) {
                                                A02[0] = "qXM";
                                                h1A05 = h1A07.A0D(alignment);
                                            } else {
                                                String[] strArr4 = A02;
                                                strArr4[1] = "qpPxE4AHFBz6kCzWLtNoXm";
                                                strArr4[7] = "USUINcSNnF3kmMgOEhWBBn";
                                                h1A05 = h1A07.A0D(alignment);
                                            }
                                        } else if (b3 == 3) {
                                            H1 h1A08 = A05(h1A05);
                                            int attributeCount5 = A02[3].charAt(5);
                                            if (attributeCount5 != 122) {
                                                h1A05 = h1A08.A0D(Layout.Alignment.ALIGN_OPPOSITE);
                                            } else {
                                                A02[2] = "";
                                                h1A05 = h1A08.A0D(Layout.Alignment.ALIGN_OPPOSITE);
                                            }
                                        } else if (b3 == 4) {
                                            h1A05 = A05(h1A05).A0D(Layout.Alignment.ALIGN_CENTER);
                                        }
                                        break;
                                    case 8:
                                        String strA0M2 = C0695Iz.A0M(attributeValue);
                                        switch (strA0M2.hashCode()) {
                                            case -1461280213:
                                                if (strA0M2.equals(A08(1271, 11, 28))) {
                                                    b3 = 3;
                                                }
                                                break;
                                            case -1026963764:
                                                if (strA0M2.equals(A08(1408, 9, 72))) {
                                                    b3 = 2;
                                                }
                                                break;
                                            case 913457136:
                                                if (strA0M2.equals(A08(1258, 13, 112))) {
                                                    b3 = 1;
                                                }
                                                break;
                                            case 1679736913:
                                                if (strA0M2.equals(A08(1236, 11, 96))) {
                                                    b3 = 0;
                                                }
                                                break;
                                        }
                                        if (b3 == 0) {
                                            h1A05 = A05(h1A05).A0J(true);
                                        } else if (b3 == 1) {
                                            h1A05 = A05(h1A05).A0J(false);
                                        } else if (b3 == 2) {
                                            H1 h1A09 = A05(h1A05);
                                            String[] strArr5 = A02;
                                            String str4 = strArr5[1];
                                            String str5 = strArr5[7];
                                            int attributeCount6 = str4.length();
                                            if (attributeCount6 == str5.length()) {
                                                A02[3] = "YAqBvzwf9b8xcqMWe7cXN6DVu9f8TuSO";
                                                h1A05 = h1A09.A0K(true);
                                            }
                                        } else if (b3 == 3) {
                                            h1A05 = A05(h1A05).A0K(false);
                                        }
                                        break;
                                }
                            }
                            throw new RuntimeException();
                        }
                        return h1A05;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // com.facebook.ads.redexgen.X.AbstractC0533Bz
                    /* JADX INFO: renamed from: A07, reason: merged with bridge method [inline-methods] */
                    public final VK A0b(byte[] bArr, int i, boolean z) throws GZ {
                        try {
                            XmlPullParser xmlPullParserNewPullParser = this.A00.newPullParser();
                            HashMap map = new HashMap();
                            HashMap map2 = new HashMap();
                            map2.put(A08(0, 0, 105), new C0642Gw(null));
                            try {
                                ByteArrayInputStream inputStream = new ByteArrayInputStream(bArr, 0, i);
                                xmlPullParserNewPullParser.setInput(inputStream, null);
                                VK vk = null;
                                ArrayDeque arrayDeque = new ArrayDeque();
                                int i2 = 0;
                                C0640Gu c0640GuA02 = A04;
                                C0639Gt c0639GtA01 = A03;
                                for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                                    C0641Gv c0641Gv = (C0641Gv) arrayDeque.peek();
                                    if (i2 == 0) {
                                        String name = xmlPullParserNewPullParser.getName();
                                        String strA08 = A08(1406, 2, 77);
                                        if (eventType == 2) {
                                            if (strA08.equals(name)) {
                                                c0640GuA02 = A02(xmlPullParserNewPullParser);
                                                c0639GtA01 = A01(xmlPullParserNewPullParser, A03);
                                            }
                                            boolean zA0C = A0C(name);
                                            String strA09 = A08(717, 11, 24);
                                            if (!zA0C) {
                                                Log.i(strA09, A08(RCHTTPStatusCodes.NOT_FOUND, 26, 82) + xmlPullParserNewPullParser.getName());
                                                i2++;
                                            } else if (A08(1179, 4, 107).equals(name)) {
                                                A09(xmlPullParserNewPullParser, map, map2, c0639GtA01);
                                            } else {
                                                try {
                                                    C0641Gv c0641GvA03 = A03(xmlPullParserNewPullParser, c0641Gv, map2, c0640GuA02);
                                                    arrayDeque.push(c0641GvA03);
                                                    if (c0641Gv != null) {
                                                        c0641Gv.A0E(c0641GvA03);
                                                    }
                                                } catch (GZ e) {
                                                    Log.w(strA09, A08(693, 24, 123), e);
                                                    i2++;
                                                }
                                            }
                                        } else if (eventType == 4) {
                                            c0641Gv.A0E(C0641Gv.A04(xmlPullParserNewPullParser.getText()));
                                        } else if (eventType == 3) {
                                            if (xmlPullParserNewPullParser.getName().equals(strA08)) {
                                                vk = new VK((C0641Gv) arrayDeque.peek(), map, map2);
                                            }
                                            arrayDeque.pop();
                                        }
                                    } else if (eventType == 2) {
                                        i2++;
                                    } else {
                                        String[] strArr = A02;
                                        String str2 = strArr[6];
                                        String name2 = strArr[4];
                                        if (str2.length() != name2.length()) {
                                            throw new RuntimeException();
                                        }
                                        A02[3] = "DWZZDzHFIU4OaeBz8oLAnvpDLElANliW";
                                        if (eventType == 3) {
                                            i2--;
                                        }
                                    }
                                    xmlPullParserNewPullParser.next();
                                }
                                return vk;
                            } catch (IOException e2) {
                                e = e2;
                                throw new IllegalStateException(A08(751, 36, 60), e);
                            } catch (XmlPullParserException e3) {
                                e = e3;
                                throw new GZ(A08(728, 23, 102), e);
                            }
                        } catch (IOException e4) {
                            e = e4;
                        } catch (XmlPullParserException e5) {
                            e = e5;
                        }
                    }

                    private Map<String, H1> A09(XmlPullParser xmlPullParser, Map<String, H1> map, Map<String, C0642Gw> map2, C0639Gt c0639Gt) throws XmlPullParserException, IOException {
                        C0642Gw c0642GwA04;
                        do {
                            xmlPullParser.next();
                            String strA08 = A08(1350, 5, 96);
                            if (J0.A04(xmlPullParser, strA08)) {
                                String strA00 = J0.A00(xmlPullParser, strA08);
                                H1 h1A06 = A06(xmlPullParser, new H1());
                                if (strA00 != null) {
                                    for (String str2 : A0D(strA00)) {
                                        h1A06.A0E(map.get(str2));
                                        if (A02[0].length() == 24) {
                                            throw new RuntimeException();
                                        }
                                        A02[3] = "r1XXjzavA19mnteqm7IXmxWY8MBC2sF6";
                                    }
                                }
                                if (h1A06.A0M() != null) {
                                    map.put(h1A06.A0M(), h1A06);
                                }
                            } else if (J0.A04(xmlPullParser, A08(1291, 6, 83)) && (c0642GwA04 = A04(xmlPullParser, c0639Gt)) != null) {
                                map2.put(c0642GwA04.A07, c0642GwA04);
                            }
                        } while (!J0.A03(xmlPullParser, A08(1179, 4, 107)));
                        return map;
                    }

                    public static void A0B(String str2, H1 h1) throws GZ {
                        Matcher matcher;
                        String[] strArrA0l = C0695Iz.A0l(str2, A08(787, 3, 72));
                        if (strArrA0l.length == 1) {
                            matcher = A07.matcher(str2);
                        } else if (strArrA0l.length == 2) {
                            matcher = A07.matcher(strArrA0l[1]);
                            Log.w(A08(717, 11, 24), A08(583, 110, 85));
                        } else {
                            throw new GZ(A08(488, 40, 113) + strArrA0l.length + A08(4, 1, 16));
                        }
                        boolean zMatches = matcher.matches();
                        String strA08 = A08(2, 2, 68);
                        if (zMatches) {
                            String strGroup = matcher.group(3);
                            byte b2 = -1;
                            int iHashCode = strGroup.hashCode();
                            if (iHashCode != 37) {
                                if (A02[5].charAt(9) == 'f') {
                                    throw new RuntimeException();
                                }
                                A02[2] = "t0LdGmQ0v8qyO2";
                                if (iHashCode != 3240) {
                                    if (iHashCode == 3592 && strGroup.equals(A08(1289, 2, 4))) {
                                        b2 = 0;
                                    }
                                } else if (strGroup.equals(A08(1061, 2, 12))) {
                                    b2 = 1;
                                }
                            } else if (strGroup.equals(A08(1, 1, 107))) {
                                b2 = 2;
                            }
                            if (b2 == 0) {
                                h1.A0C(1);
                            } else if (b2 == 1) {
                                h1.A0C(2);
                            } else if (b2 == 2) {
                                h1.A0C(3);
                            } else {
                                throw new GZ(A08(528, 28, 123) + strGroup + strA08);
                            }
                            float fFloatValue = Float.valueOf(matcher.group(1)).floatValue();
                            String[] strArr = A02;
                            if (strArr[1].length() != strArr[7].length()) {
                                String[] strArr2 = A02;
                                strArr2[1] = "urdYGq7WwvJk1zliqVN4P2";
                                strArr2[7] = "ZdoJtzuRVAPxJXqYig85Db";
                                h1.A09(fFloatValue);
                                return;
                            }
                            String[] strArr3 = A02;
                            strArr3[1] = "Kk4kf6fnicwp8j22CAgUPO";
                            strArr3[7] = "fW8tIDgKJv3U6D0UEBEE9j";
                            h1.A09(fFloatValue);
                            return;
                        }
                        throw new GZ(A08(454, 34, 126) + str2 + strA08);
                    }

                    public static boolean A0C(String str2) {
                        return str2.equals(A08(1406, 2, 77)) || str2.equals(A08(1179, 4, 107)) || str2.equals(A08(1008, 4, 13)) || str2.equals(A08(1055, 3, 81)) || str2.equals(A08(1288, 1, 86)) || str2.equals(A08(1341, 4, 94)) || str2.equals(A08(1016, 2, 53)) || str2.equals(A08(1350, 5, 96)) || str2.equals(A08(1355, 7, 10)) || str2.equals(A08(1226, 6, 87)) || str2.equals(A08(1291, 6, 83)) || str2.equals(A08(1248, 8, 110)) || str2.equals(A08(1313, 11, 44)) || str2.equals(A08(1303, 10, 46)) || str2.equals(A08(1324, 17, 110));
                    }

                    private String[] A0D(String str2) {
                        String strTrim = str2.trim();
                        return strTrim.isEmpty() ? new String[0] : C0695Iz.A0l(strTrim, A08(787, 3, 72));
                    }
                };
            case 4:
                return new AbstractC0533Bz() { // from class: com.facebook.ads.redexgen.X.2v
                    public static byte[] A01;
                    public static String[] A02 = {"3MOBlr", "0DhiPEnslefQ61m7AjWKH0Dx7dIlVLH6", "rp7TRUp2Utk2Kzh0KXhj1OM3FBWO", "kN44IufTXn3JrEQj4nNHg0bfvC0oTmjD", "OifCwo2rldbue0L51wUPSBWzKiQKf6dm", "cz3ck9zx8XU8dqptbmXcRQWSnweik5k", "6fY6w3uzibwvfWVjzeUSGJKNywar3ei2", "sygTD4E3XWLeExwvPEtpnqdNQjJK5lOm"};
                    public static final Pattern A03;
                    public final StringBuilder A00;

                    public static String A02(int i, int i2, int i3) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
                        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
                            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 61);
                        }
                        return new String(bArrCopyOfRange);
                    }

                    public static void A03() {
                        A01 = new byte[]{46, 112, 96, 44, 78, 118, 116, 109, 109, 116, 115, 122, 61, 116, 115, 107, 124, 113, 116, 121, 61, 116, 115, 121, 120, 101, 39, 61, 40, 16, 18, 11, 11, 18, 21, 28, 91, 18, 21, 13, 26, 23, 18, 31, 91, 15, 18, 22, 18, 21, 28, 65, 91, 59, 29, 10, 26, 1, 24, 44, 13, 11, 7, 12, 13, 26, 14, 53, 62, 35, 43, 62, 56, 47, 62, 63, 123, 62, 53, 63, 111, 64, 25, 27, 27, 12, 9, 27, 111, 87, 24, 26, 9, 26, 12, 27, 111, 87, 24, 26, 9, 27, 111, 87, 24, 26, 31, 27, 111, 87, 24, 26, 26, 111, 64, 25, 30, 30, 13, 111, 64, 25, 27, 27, 12, 9, 27, 111, 87, 24, 26, 9, 26, 12, 27, 111, 87, 24, 26, 9, 27, 111, 87, 24, 26, 31, 27, 111, 87, 24, 26, 26, 12, 111, 64, 25};
                    }

                    static {
                        A03();
                        A03 = Pattern.compile(A02(80, 76, 14));
                    }

                    {
                        A02(53, 13, 85);
                        this.A00 = new StringBuilder();
                    }

                    public static long A00(Matcher matcher, int i) {
                        return 1000 * ((Long.parseLong(matcher.group(i + 1)) * 60 * 60 * 1000) + (Long.parseLong(matcher.group(i + 2)) * 60 * 1000) + (Long.parseLong(matcher.group(i + 3)) * 1000) + Long.parseLong(matcher.group(i + 4)));
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // com.facebook.ads.redexgen.X.AbstractC0533Bz
                    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
                    public final VL A0b(byte[] bArr, int i, boolean z) {
                        String strA02 = A02(53, 13, 85);
                        ArrayList arrayList = new ArrayList();
                        IZ iz = new IZ();
                        C0679Ij c0679Ij = new C0679Ij(bArr, i);
                        while (true) {
                            String strA0P = c0679Ij.A0P();
                            if (strA0P == null) {
                                break;
                            }
                            if (strA0P.length() != 0) {
                                try {
                                    Integer.parseInt(strA0P);
                                    boolean z2 = false;
                                    String strA0P2 = c0679Ij.A0P();
                                    if (strA0P2 == null) {
                                        Log.w(strA02, A02(66, 14, 102));
                                        break;
                                    }
                                    Matcher matcher = A03.matcher(strA0P2);
                                    if (!matcher.matches()) {
                                        Log.w(strA02, A02(28, 25, 70) + strA0P2);
                                    } else {
                                        if (A02[2].length() == 5) {
                                            throw new RuntimeException();
                                        }
                                        A02[5] = "w8SSp6GDTl1u71HT2BYG3nb3Lg3oTFs";
                                        iz.A04(A00(matcher, 1));
                                        if (!TextUtils.isEmpty(matcher.group(6))) {
                                            z2 = true;
                                            iz.A04(A00(matcher, 6));
                                        }
                                        this.A00.setLength(0);
                                        while (true) {
                                            String strA0P3 = c0679Ij.A0P();
                                            if (TextUtils.isEmpty(strA0P3)) {
                                                break;
                                            }
                                            if (this.A00.length() > 0) {
                                                this.A00.append(A02(0, 4, 47));
                                            }
                                            this.A00.append(strA0P3.trim());
                                        }
                                        arrayList.add(new GX(Html.fromHtml(this.A00.toString())));
                                        if (z2) {
                                            arrayList.add(null);
                                        }
                                    }
                                } catch (NumberFormatException unused) {
                                    Log.w(strA02, A02(4, 24, 32) + strA0P);
                                }
                            }
                        }
                        GX[] gxArr = new GX[arrayList.size()];
                        arrayList.toArray(gxArr);
                        return new VL(gxArr, iz.A05());
                    }
                };
            case 5:
                final List<byte[]> list = format.A0P;
                return new AbstractC0533Bz(list) { // from class: com.facebook.ads.redexgen.X.2n
                    public static byte[] A07;
                    public static final int A08;
                    public static final int A09;
                    public float A00;
                    public int A01;
                    public int A02;
                    public int A03;
                    public String A04;
                    public boolean A05;
                    public final C0679Ij A06;

                    public static String A00(int i, int i2, int i3) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
                        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
                            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 21);
                        }
                        return new String(bArrCopyOfRange);
                    }

                    public static void A02() {
                        A07 = new byte[]{120, -118, -105, -114, -117, 116, -104, 83, -121, 100, -123, -125, -113, -124, -123, -110, -67, -68, -82, -107, -103, -98, -49, -50, -64, -89, -78, 119, -112, -121, -102, -110, -121, -123, -106, -121, -122, 66, -107, -105, -124, -106, -117, -106, -114, -121, 66, -120, -111, -108, -113, -125, -106, 80, -1, -19, -6, -1, -71, -1, -15, -2, -11, -14, -93, -107, -94, -103, -106, -101, -100, -95, -108, -34, -52, -39, -30};
                    }

                    static {
                        A02();
                        A08 = C0695Iz.A08(A00(69, 4, 19));
                        A09 = C0695Iz.A08(A00(73, 4, 85));
                    }

                    {
                        super(A00(5, 11, 11));
                        this.A06 = new C0679Ij();
                        A07(list);
                    }

                    public static String A01(C0679Ij c0679Ij) throws GZ {
                        char cA02;
                        A08(c0679Ij.A04() >= 2);
                        int iA0I = c0679Ij.A0I();
                        if (iA0I == 0) {
                            return A00(0, 0, 91);
                        }
                        if (c0679Ij.A04() >= 2 && ((cA02 = c0679Ij.A02()) == 65279 || cA02 == 65534)) {
                            return c0679Ij.A0T(iA0I, Charset.forName(A00(16, 6, 83)));
                        }
                        return c0679Ij.A0T(iA0I, Charset.forName(A00(22, 5, 101)));
                    }

                    public static void A03(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
                        if (i != i2) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(((i & 255) << 24) | (i >>> 8)), i3, i4, i5 | 33);
                        }
                    }

                    public static void A04(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
                        if (i != i2) {
                            int i6 = i5 | 33;
                            boolean z = (i & 1) != 0;
                            boolean z2 = (i & 2) != 0;
                            if (z) {
                                if (z2) {
                                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                                } else {
                                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                                }
                            } else if (z2) {
                                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
                            }
                            boolean z3 = (i & 4) != 0;
                            if (z3) {
                                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
                            }
                            if (!z3 && !z && !z2) {
                                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
                            }
                        }
                    }

                    public static void A05(SpannableStringBuilder spannableStringBuilder, String str2, String str3, int i, int i2, int i3) {
                        if (str2 != str3) {
                            spannableStringBuilder.setSpan(new TypefaceSpan(str2), i, i2, i3 | 33);
                        }
                    }

                    private void A06(C0679Ij c0679Ij, SpannableStringBuilder spannableStringBuilder) throws GZ {
                        A08(c0679Ij.A04() >= 12);
                        int iA0I = c0679Ij.A0I();
                        int end = c0679Ij.A0I();
                        c0679Ij.A0Z(2);
                        int iA0E = c0679Ij.A0E();
                        c0679Ij.A0Z(1);
                        int iA08 = c0679Ij.A08();
                        A04(spannableStringBuilder, iA0E, this.A03, iA0I, end, 0);
                        A03(spannableStringBuilder, iA08, this.A02, iA0I, end, 0);
                    }

                    private void A07(List<byte[]> list2) {
                        String strA00 = A00(54, 10, 119);
                        if (list2 != null && list2.size() == 1 && (list2.get(0).length == 48 || list2.get(0).length == 53)) {
                            byte[] bArr = list2.get(0);
                            this.A03 = bArr[24];
                            this.A02 = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
                            String strA0R = C0695Iz.A0R(bArr, 43, bArr.length - 43);
                            String fontFamily = A00(0, 5, 16);
                            if (fontFamily.equals(strA0R)) {
                                strA00 = A00(64, 5, 27);
                            }
                            this.A04 = strA00;
                            this.A01 = bArr[25] * 20;
                            this.A05 = (bArr[0] & 32) != 0;
                            if (this.A05) {
                                this.A00 = (((bArr[10] & 255) << 8) | (bArr[11] & 255)) / this.A01;
                                this.A00 = C0695Iz.A00(this.A00, 0.0f, 0.95f);
                                return;
                            } else {
                                this.A00 = 0.85f;
                                return;
                            }
                        }
                        this.A03 = 0;
                        this.A02 = -1;
                        this.A04 = strA00;
                        this.A05 = false;
                        this.A00 = 0.85f;
                    }

                    public static void A08(boolean z) throws GZ {
                        if (z) {
                        } else {
                            throw new GZ(A00(27, 27, 13));
                        }
                    }

                    @Override // com.facebook.ads.redexgen.X.AbstractC0533Bz
                    public final GY A0b(byte[] bArr, int i, boolean z) throws GZ {
                        this.A06.A0b(bArr, i);
                        String strA01 = A01(this.A06);
                        if (strA01.isEmpty()) {
                            return VJ.A01;
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strA01);
                        A04(spannableStringBuilder, this.A03, 0, 0, spannableStringBuilder.length(), 16711680);
                        A03(spannableStringBuilder, this.A02, -1, 0, spannableStringBuilder.length(), 16711680);
                        A05(spannableStringBuilder, this.A04, A00(54, 10, 119), 0, spannableStringBuilder.length(), 16711680);
                        float verticalPlacement = this.A00;
                        while (this.A06.A04() >= 8) {
                            int iA06 = this.A06.A06();
                            int iA08 = this.A06.A08();
                            int iA09 = this.A06.A08();
                            int position = A08;
                            if (iA09 == position) {
                                int position2 = this.A06.A04();
                                A08(position2 >= 2);
                                int atomSize = this.A06.A0I();
                                for (int atomType = 0; atomType < atomSize; atomType++) {
                                    A06(this.A06, spannableStringBuilder);
                                }
                            } else {
                                int styleRecordCount = A09;
                                if (iA09 == styleRecordCount && this.A05) {
                                    int styleRecordCount2 = this.A06.A04();
                                    A08(styleRecordCount2 >= 2);
                                    int styleRecordCount3 = this.A06.A0I();
                                    float f = styleRecordCount3;
                                    int requestedVerticalPlacement = this.A01;
                                    verticalPlacement = C0695Iz.A00(f / requestedVerticalPlacement, 0.0f, 0.95f);
                                }
                            }
                            this.A06.A0Y(iA06 + iA08);
                        }
                        return new VJ(new GX(spannableStringBuilder, null, verticalPlacement, 0, 0, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE));
                    }
                };
            case 6:
            case 7:
                return new AnonymousClass32(format.A0O, format.A03);
            case 8:
                final int i = format.A03;
                return new AbstractC0522Bo(i) { // from class: com.facebook.ads.redexgen.X.31
                    public static byte[] A09;
                    public static String[] A0A = {"L1xpy5cp85DZhci17XuVPwuBI", "YkTNFPOzwzkJtYlViXkR23NQqoCQppA0", "SGim0bOTaYlclFO3csKadT6H6g9xYkcM", "jQ8PzV3P", "QC0kpNF7RiOrPOmNNHkvJn0tMmNRSOb3", "UpfI1Vr3VxozUqaf4r1nY355XZgGFNi", "PidsADYQpUdS401V", "6iBltx3Oq3HhhZI1vDwKIUw2PCH0pZTk"};
                    public int A00;
                    public C0625Gf A01;
                    public C0626Gg A02;
                    public List<GX> A03;
                    public List<GX> A04;
                    public final int A05;
                    public final C0625Gf[] A08;
                    public final C0679Ij A07 = new C0679Ij();
                    public final C0678Ii A06 = new C0678Ii();

                    public static String A00(int i2, int i3, int i4) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i2, i2 + i3);
                        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
                            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 14);
                        }
                        return new String(bArrCopyOfRange);
                    }

                    public static void A09() {
                        A09 = new byte[]{-102, -94, -19, -33, -21, -17, -33, -24, -35, -33, -102, -24, -17, -25, -36, -33, -20, -102, 108, 99, -70, -85, -88, -79, 99, -91, -81, -78, -90, -82, -106, -84, -67, -88, 99, -84, -74, 99, 115, 112, -126, 103, -80, -82, -75, -74, -71, -80, -75, -82, 103, -73, -88, -86, -78, -84, -69, 101, 89, -101, -82, -83, 89, -100, -82, -85, -85, -98, -89, -83, 89, -94, -89, -99, -98, -79, 89, -94, -84, 89, 116, -106, -110, 104, 97, 105, 117, -106, -108, -96, -107, -106, -93, -127, -77, -80, -80, -93, -84, -78, -86, -73, 94, -77, -84, -79, -77, -82, -82, -83, -80, -78, -93, -94, 94, -127, -115, -117, -117, 127, -116, -126, -99, -125, -106, -110, 111, 94, -127, -83, -85, -85, -97, -84, -94, 120, 94, -59, -9, -12, -12, -25, -16, -10, -18, -5, -94, -9, -16, -11, -9, -14, -14, -15, -12, -10, -25, -26, -94, -59, -47, -49, -49, -61, -48, -58, -31, -46, -77, -72, -94, -59, -15, -17, -17, -29, -16, -26, -68, -94, -103, -55, -53, -104, -72, -91, -74, -72, -64, -70, -55, 117, -70, -61, -71, -70, -71, 117, -59, -57, -70, -62, -74, -55, -54, -57, -70, -63, -50, -112, 117, -56, -66, -49, -70, 117, -66, -56, 117, 109, -106, -117, -105, -99, -106, -100, -115, -102, -115, -116, 72, 108, 124, 126, 107, 107, -121, 120, 105, 107, 115, 109, 124, -121, 108, 105, 124, 105, 72, -118, -115, -114, -105, -102, -115, 72, 108, 124, 126, 107, 107, -121, 120, 105, 107, 115, 109, 124, -121, 123, 124, 105, 122, 124, -119, -82, -74, -95, -84, -87, -92, 96, -125, 112, 96, -93, -81, -83, -83, -95, -82, -92, 122, 96, -42, -5, 3, -18, -7, -10, -15, -83, -48, -66, -83, -16, -4, -6, -6, -18, -5, -15, -57, -83, -110, -73, -65, -86, -75, -78, -83, 105, -112, 123, 105, -84, -79, -86, -69, -86, -84, -67, -82, -69, -125, 105, 118, -101, -93, -114, -103, -106, -111, 77, 116, 96, 77, -112, -107, -114, -97, -114, -112, -95, -110, -97, 103, 77, -104, -67, -59, -80, -69, -72, -77, 111, -79, -80, -62, -76, 111, -78, -66, -68, -68, -80, -67, -77, -119, 111, -55, -18, -10, -31, -20, -23, -28, -96, -27, -8, -12, -27, -18, -28, -27, -28, -96, -29, -17, -19, -19, -31, -18, -28, -70, -96, -6, -20, -7, -3, -16, -22, -20, -43, -4, -12, -23, -20, -7, -89, -16, -6, -89, -11, -10, -11, -76, 1, -20, -7, -10, -89, -81};
                    }

                    static {
                        A09();
                    }

                    {
                        this.A05 = i == -1 ? 1 : i;
                        this.A08 = new C0625Gf[8];
                        for (int i2 = 0; i2 < 8; i2++) {
                            this.A08[i2] = new C0625Gf();
                        }
                        this.A01 = this.A08[0];
                        A08();
                    }

                    private List<GX> A01() {
                        ArrayList arrayList = new ArrayList();
                        for (int i2 = 0; i2 < 8; i2++) {
                            if (!this.A08[i2].A0H() && this.A08[i2].A0I()) {
                                arrayList.add(this.A08[i2].A05());
                            }
                        }
                        Collections.sort(arrayList);
                        return Collections.unmodifiableList(arrayList);
                    }

                    private void A02() {
                        if (this.A02 == null) {
                            return;
                        }
                        A07();
                        this.A02 = null;
                    }

                    private void A03() {
                        int iA04 = this.A06.A04(4);
                        int iA05 = this.A06.A04(2);
                        int iA06 = this.A06.A04(2);
                        boolean zA0F = this.A06.A0F();
                        boolean underlineToggle = this.A06.A0F();
                        this.A01.A0C(iA04, iA05, iA06, zA0F, underlineToggle, this.A06.A04(3), this.A06.A04(3));
                    }

                    private void A04() {
                        int foregroundG = this.A06.A04(2);
                        int iA04 = this.A06.A04(2);
                        int iA05 = this.A06.A04(2);
                        int foregroundB = this.A06.A04(2);
                        int backgroundColor = C0625Gf.A01(iA04, iA05, foregroundB, foregroundG);
                        int foregroundG2 = this.A06.A04(2);
                        int foregroundColor = this.A06.A04(2);
                        int backgroundR = this.A06.A04(2);
                        int backgroundG = this.A06.A04(2);
                        int foregroundG3 = C0625Gf.A01(foregroundColor, backgroundR, backgroundG, foregroundG2);
                        this.A06.A08(2);
                        int foregroundColor2 = this.A06.A04(2);
                        int backgroundR2 = this.A06.A04(2);
                        int edgeR = this.A06.A04(2);
                        this.A01.A0B(backgroundColor, foregroundG3, C0625Gf.A00(foregroundColor2, backgroundR2, edgeR));
                    }

                    private void A05() {
                        this.A06.A08(4);
                        int iA04 = this.A06.A04(4);
                        this.A06.A08(2);
                        this.A01.A0A(iA04, this.A06.A04(6));
                    }

                    private void A06() {
                        int fillG = this.A06.A04(2);
                        int iA04 = this.A06.A04(2);
                        int iA05 = this.A06.A04(2);
                        int fillB = this.A06.A04(2);
                        int fillG2 = C0625Gf.A01(iA04, iA05, fillB, fillG);
                        int borderG = this.A06.A04(2);
                        int borderType = this.A06.A04(2);
                        int iA06 = this.A06.A04(2);
                        int fillColor = this.A06.A04(2);
                        int scrollDirection = C0625Gf.A00(borderType, iA06, fillColor);
                        if (this.A06.A0F()) {
                            borderG |= 4;
                        }
                        boolean zA0F = this.A06.A0F();
                        int iA07 = this.A06.A04(2);
                        int iA08 = this.A06.A04(2);
                        int iA09 = this.A06.A04(2);
                        this.A06.A08(8);
                        this.A01.A0D(fillG2, scrollDirection, zA0F, borderG, iA07, iA08, iA09);
                    }

                    private void A07() {
                        int i2 = this.A02.A00;
                        int i3 = (this.A02.A01 * 2) - 1;
                        String strA00 = A00(80, 13, 35);
                        if (i2 != i3) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(A00(180, 39, 71));
                            sb.append((this.A02.A01 * 2) - 1);
                            sb.append(A00(57, 23, 43));
                            sb.append(this.A02.A00);
                            sb.append(A00(0, 18, 108));
                            sb.append(this.A02.A02);
                            sb.append(A00(39, 18, 57));
                            Log.w(strA00, sb.toString());
                            return;
                        }
                        this.A06.A0C(this.A02.A03, this.A02.A00);
                        int iA04 = this.A06.A04(3);
                        int iA05 = this.A06.A04(5);
                        if (iA04 == 7) {
                            this.A06.A08(2);
                            int blockSize = this.A06.A04(6);
                            iA04 += blockSize;
                        }
                        if (iA05 == 0) {
                            if (iA04 != 0) {
                                Log.w(strA00, A00(406, 27, 121) + iA04 + A00(18, 21, 53));
                                return;
                            }
                            return;
                        }
                        int blockSize2 = this.A05;
                        if (iA04 != blockSize2) {
                            return;
                        }
                        boolean z = false;
                        while (blockSize > 0) {
                            int iA06 = this.A06.A04(8);
                            String[] strArr = A0A;
                            String str2 = strArr[2];
                            String str3 = strArr[1];
                            int iCharAt = str2.charAt(6);
                            int command = str3.charAt(6);
                            if (iCharAt != command) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A0A;
                            strArr2[4] = "ms0OGa625FAXtw1h35os66EQGefGqsb0";
                            strArr2[7] = "y0WyytXakCt9dcKCWCePMiqFSD1TGdmN";
                            if (iA06 != 16) {
                                if (iA06 <= 31) {
                                    A0A(iA06);
                                } else if (iA06 <= 127) {
                                    A0F(iA06);
                                    z = true;
                                } else if (iA06 <= 159) {
                                    A0B(iA06);
                                    z = true;
                                } else if (iA06 <= 255) {
                                    A0G(iA06);
                                    z = true;
                                } else {
                                    Log.w(strA00, A00(358, 22, 65) + iA06);
                                }
                            } else {
                                int iA07 = this.A06.A04(8);
                                if (iA07 <= 31) {
                                    A0C(iA07);
                                } else if (iA07 <= 127) {
                                    A0H(iA07);
                                    z = true;
                                } else if (iA07 <= 159) {
                                    A0D(iA07);
                                } else if (iA07 <= 255) {
                                    A0I(iA07);
                                    z = true;
                                } else {
                                    Log.w(strA00, A00(380, 26, 114) + iA07);
                                }
                            }
                        }
                        if (z) {
                            this.A03 = A01();
                        }
                    }

                    private void A08() {
                        for (int i2 = 0; i2 < 8; i2++) {
                            C0625Gf[] c0625GfArr = this.A08;
                            if (A0A[5].length() == 25) {
                                throw new RuntimeException();
                            }
                            A0A[5] = "s2U2A8";
                            c0625GfArr[i2].A08();
                        }
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
                    
                        if (r7 <= 23) goto L16;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
                    
                        android.util.Log.w(r4, A00(93, 44, 48) + r7);
                        r6.A06.A08(8);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
                    
                        return;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
                    
                        if (r7 <= 23) goto L16;
                     */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    private void A0A(int r7) {
                        /*
                            Method dump skipped, instruction units count: 234
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass31.A0A(int):void");
                    }

                    private void A0B(int i2) {
                        switch (i2) {
                            case 128:
                            case 129:
                            case 130:
                            case 131:
                            case 132:
                            case 133:
                            case 134:
                            case 135:
                                int i3 = i2 - 128;
                                if (this.A00 == i3) {
                                    return;
                                }
                                this.A00 = i3;
                                this.A01 = this.A08[i3];
                                return;
                            case 136:
                                for (int i4 = 1; i4 <= 8; i4++) {
                                    if (this.A06.A0F()) {
                                        this.A08[8 - i4].A07();
                                    }
                                }
                                return;
                            case 137:
                                for (int i5 = 1; i5 <= 8; i5++) {
                                    if (this.A06.A0F()) {
                                        this.A08[8 - i5].A0E(true);
                                    }
                                }
                                return;
                            case 138:
                                for (int i6 = 1; i6 <= 8; i6++) {
                                    C0678Ii c0678Ii = this.A06;
                                    String[] strArr = A0A;
                                    if (strArr[4].charAt(10) != strArr[7].charAt(10)) {
                                        String[] strArr2 = A0A;
                                        strArr2[4] = "tgsd09Dwb8efzi12Ygo8EEpd8wqaNMQp";
                                        strArr2[7] = "OtAHbkVvCVjcLfZxBihHyGrM7vcCdRu7";
                                        if (c0678Ii.A0F()) {
                                            this.A08[8 - i6].A0E(false);
                                        }
                                    } else {
                                        throw new RuntimeException();
                                    }
                                }
                                return;
                            case 139:
                                for (int i7 = 1; i7 <= 8; i7++) {
                                    if (this.A06.A0F()) {
                                        C0625Gf c0625Gf = this.A08[8 - i7];
                                        c0625Gf.A0E(!c0625Gf.A0I());
                                    }
                                }
                                return;
                            case 140:
                                for (int i8 = 1; i8 <= 8; i8++) {
                                    if (this.A06.A0F()) {
                                        this.A08[8 - i8].A08();
                                    }
                                }
                                return;
                            case 141:
                                this.A06.A08(8);
                                return;
                            case 142:
                                return;
                            case 143:
                                A08();
                                return;
                            case 144:
                                if (!this.A01.A0G()) {
                                    this.A06.A08(16);
                                    return;
                                } else {
                                    A03();
                                    return;
                                }
                            case 145:
                                if (!this.A01.A0G()) {
                                    C0678Ii c0678Ii2 = this.A06;
                                    String[] strArr3 = A0A;
                                    if (strArr3[2].charAt(6) != strArr3[1].charAt(6)) {
                                        throw new RuntimeException();
                                    }
                                    String[] strArr4 = A0A;
                                    strArr4[4] = "YfMVFiiWIo4HdxAiYn4ZyE3AoIHrPBrR";
                                    strArr4[7] = "UQdHvjyVMqLptRK8t7u4cjdWKG66hEBn";
                                    c0678Ii2.A08(24);
                                    return;
                                }
                                A04();
                                return;
                            case 146:
                                if (!this.A01.A0G()) {
                                    this.A06.A08(16);
                                    return;
                                } else {
                                    A05();
                                    return;
                                }
                            case 147:
                            case 148:
                            case 149:
                            case 150:
                            default:
                                Log.w(A00(80, 13, 35), A00(294, 20, 127) + i2);
                                return;
                            case 151:
                                if (!this.A01.A0G()) {
                                    this.A06.A08(32);
                                    return;
                                } else {
                                    A06();
                                    return;
                                }
                            case 152:
                            case 153:
                            case 154:
                            case 155:
                            case 156:
                            case 157:
                            case 158:
                            case 159:
                                int i9 = i2 - 152;
                                A0E(i9);
                                if (this.A00 == i9) {
                                    return;
                                }
                                this.A00 = i9;
                                this.A01 = this.A08[i9];
                                return;
                        }
                    }

                    private void A0C(int i2) {
                        if (i2 <= 7) {
                            return;
                        }
                        if (i2 <= 15) {
                            this.A06.A08(8);
                        } else if (i2 <= 23) {
                            this.A06.A08(16);
                        } else {
                            if (i2 > 31) {
                                return;
                            }
                            this.A06.A08(24);
                        }
                    }

                    private void A0D(int i2) {
                        if (i2 <= 135) {
                            this.A06.A08(32);
                            return;
                        }
                        String[] strArr = A0A;
                        if (strArr[3].length() == strArr[6].length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A0A;
                        strArr2[3] = "CkyZUSwm";
                        strArr2[6] = "y0ZSf6RqH8VvK6A8";
                        if (i2 <= 143) {
                            this.A06.A08(40);
                        } else {
                            if (i2 > 159) {
                                return;
                            }
                            this.A06.A08(2);
                            this.A06.A08(this.A06.A04(6) * 8);
                        }
                    }

                    private void A0E(int i2) {
                        C0625Gf c0625Gf = this.A08[i2];
                        this.A06.A08(2);
                        boolean zA0F = this.A06.A0F();
                        boolean zA0F2 = this.A06.A0F();
                        boolean zA0F3 = this.A06.A0F();
                        int iA04 = this.A06.A04(3);
                        boolean columnLock = this.A06.A0F();
                        int verticalAnchor = this.A06.A04(7);
                        int rowCount = this.A06.A04(8);
                        int penStyle = this.A06.A04(4);
                        int iA05 = this.A06.A04(4);
                        this.A06.A08(2);
                        int iA06 = this.A06.A04(6);
                        this.A06.A08(2);
                        c0625Gf.A0F(zA0F, zA0F2, zA0F3, iA04, columnLock, verticalAnchor, rowCount, iA05, iA06, penStyle, this.A06.A04(3), this.A06.A04(3));
                    }

                    private void A0F(int i2) {
                        if (i2 == 127) {
                            this.A01.A09((char) 9835);
                        } else {
                            this.A01.A09((char) (i2 & 255));
                        }
                    }

                    private void A0G(int i2) {
                        this.A01.A09((char) (i2 & 255));
                    }

                    private void A0H(int i2) {
                        if (i2 == 32) {
                            this.A01.A09(' ');
                            return;
                        }
                        if (i2 == 33) {
                            this.A01.A09((char) 160);
                            return;
                        }
                        if (i2 == 37) {
                            this.A01.A09((char) 8230);
                            return;
                        }
                        if (i2 == 42) {
                            this.A01.A09((char) 352);
                            return;
                        }
                        if (i2 == 44) {
                            this.A01.A09((char) 338);
                            return;
                        }
                        if (i2 == 63) {
                            this.A01.A09((char) 376);
                            return;
                        }
                        String[] strArr = A0A;
                        if (strArr[2].charAt(6) == strArr[1].charAt(6)) {
                            A0A[5] = "VBgxEtCZM8hUXU02q62ejO2N";
                            if (i2 == 57) {
                                this.A01.A09((char) 8482);
                                return;
                            }
                            if (i2 != 58) {
                                if (i2 == 60) {
                                    this.A01.A09((char) 339);
                                    return;
                                }
                                if (i2 != 61) {
                                    switch (i2) {
                                        case 48:
                                            this.A01.A09((char) 9608);
                                            return;
                                        case 49:
                                            C0625Gf c0625Gf = this.A01;
                                            if (A0A[0].length() != 12) {
                                                String[] strArr2 = A0A;
                                                strArr2[4] = "pjkXXm09rSmpulg3ZnQvc2tVnRpvsPhy";
                                                strArr2[7] = "1ZIH3c3lD2nrVh46isF21y1NEU8S3DGz";
                                                c0625Gf.A09((char) 8216);
                                                return;
                                            }
                                            throw new RuntimeException();
                                        case 50:
                                            this.A01.A09((char) 8217);
                                            return;
                                        case 51:
                                            C0625Gf c0625Gf2 = this.A01;
                                            String[] strArr3 = A0A;
                                            if (strArr3[3].length() == strArr3[6].length()) {
                                                throw new RuntimeException();
                                            }
                                            A0A[0] = "pntPsILDFVvSJsAkqe";
                                            c0625Gf2.A09((char) 8220);
                                            return;
                                        case 52:
                                            this.A01.A09((char) 8221);
                                            return;
                                        case 53:
                                            this.A01.A09((char) 8226);
                                            return;
                                        default:
                                            switch (i2) {
                                                case 118:
                                                    this.A01.A09((char) 8539);
                                                    return;
                                                case 119:
                                                    this.A01.A09((char) 8540);
                                                    return;
                                                case 120:
                                                    this.A01.A09((char) 8541);
                                                    return;
                                                case 121:
                                                    this.A01.A09((char) 8542);
                                                    return;
                                                case 122:
                                                    this.A01.A09((char) 9474);
                                                    return;
                                                case 123:
                                                    this.A01.A09((char) 9488);
                                                    return;
                                                case 124:
                                                    this.A01.A09((char) 9492);
                                                    return;
                                                case 125:
                                                    this.A01.A09((char) 9472);
                                                    return;
                                                case 126:
                                                    this.A01.A09((char) 9496);
                                                    return;
                                                case 127:
                                                    this.A01.A09((char) 9484);
                                                    return;
                                                default:
                                                    Log.w(A00(80, 13, 35), A00(314, 22, 59) + i2);
                                                    return;
                                            }
                                    }
                                }
                                this.A01.A09((char) 8480);
                                return;
                            }
                            C0625Gf c0625Gf3 = this.A01;
                            if (A0A[0].length() != 12) {
                                String[] strArr4 = A0A;
                                strArr4[2] = "Hn1frjObrkKWee9bQkUvSoGsCyNbx6K5";
                                strArr4[1] = "5jLxiAOonCPZsccE4Rlf5xBOSnJI2Mxj";
                                c0625Gf3.A09((char) 353);
                                return;
                            }
                        }
                        throw new RuntimeException();
                    }

                    private void A0I(int i2) {
                        if (i2 == 160) {
                            this.A01.A09((char) 13252);
                            return;
                        }
                        Log.w(A00(80, 13, 35), A00(336, 22, 31) + i2);
                        this.A01.A09('_');
                    }

                    @Override // com.facebook.ads.redexgen.X.AbstractC0522Bo
                    public final GY A0L() {
                        List<GX> list2 = this.A03;
                        this.A04 = list2;
                        return new VP(list2);
                    }

                    @Override // com.facebook.ads.redexgen.X.AbstractC0522Bo
                    /* JADX INFO: renamed from: A0M */
                    public final /* bridge */ /* synthetic */ C0531Bx A4k() throws GZ {
                        return super.A4k();
                    }

                    @Override // com.facebook.ads.redexgen.X.AbstractC0522Bo
                    /* JADX INFO: renamed from: A0N */
                    public final /* bridge */ /* synthetic */ AbstractC0523Bp A4l() throws GZ {
                        return super.A4l();
                    }

                    @Override // com.facebook.ads.redexgen.X.AbstractC0522Bo
                    /* JADX INFO: renamed from: A0O */
                    public final /* bridge */ /* synthetic */ void ADW(C0531Bx c0531Bx) throws GZ {
                        super.ADW(c0531Bx);
                    }

                    @Override // com.facebook.ads.redexgen.X.AbstractC0522Bo
                    public final void A0P(C0531Bx c0531Bx) {
                        C0626Gg c0626Gg;
                        this.A07.A0b(c0531Bx.A01.array(), c0531Bx.A01.limit());
                        while (this.A07.A04() >= 3) {
                            int iA0E = this.A07.A0E() & 7;
                            int i2 = iA0E & 3;
                            boolean z = (iA0E & 4) == 4;
                            int iA0E2 = this.A07.A0E();
                            if (A0A[0].length() == 12) {
                                throw new RuntimeException();
                            }
                            String[] strArr = A0A;
                            strArr[4] = "mPNkJPPaAQUsGFTknTy0QJ3qIgBWTNxI";
                            strArr[7] = "fItgrykYfXnNqjhR9xK6GfD4mEN43S7J";
                            byte b2 = (byte) iA0E2;
                            byte bA0E = (byte) this.A07.A0E();
                            if (i2 == 2 || i2 == 3) {
                                if (z) {
                                    if (i2 == 3) {
                                        A02();
                                        int ccType = (b2 & 192) >> 6;
                                        int i3 = b2 & 63;
                                        if (i3 == 0) {
                                            i3 = 64;
                                        }
                                        this.A02 = new C0626Gg(ccType, i3);
                                        byte[] bArr = this.A02.A03;
                                        C0626Gg c0626Gg2 = this.A02;
                                        int i4 = c0626Gg2.A00;
                                        int packetSize = i4 + 1;
                                        c0626Gg2.A00 = packetSize;
                                        bArr[i4] = bA0E;
                                    } else {
                                        IK.A03(i2 == 2);
                                        if (A0A[0].length() != 12) {
                                            String[] strArr2 = A0A;
                                            strArr2[3] = "0p2cTlko";
                                            strArr2[6] = "0zmBBYWCDQbGLnH6";
                                            c0626Gg = this.A02;
                                            if (c0626Gg == null) {
                                                Log.e(A00(80, 13, 35), A00(219, 55, 26));
                                            } else {
                                                byte[] bArr2 = c0626Gg.A03;
                                                C0626Gg c0626Gg3 = this.A02;
                                                int i5 = c0626Gg3.A00;
                                                c0626Gg3.A00 = i5 + 1;
                                                bArr2[i5] = b2;
                                                byte[] bArr3 = this.A02.A03;
                                                C0626Gg c0626Gg4 = this.A02;
                                                int i6 = c0626Gg4.A00;
                                                c0626Gg4.A00 = i6 + 1;
                                                bArr3[i6] = bA0E;
                                            }
                                        } else {
                                            String[] strArr3 = A0A;
                                            strArr3[3] = "AnSv654l";
                                            strArr3[6] = "VDMP1o28JZezz2Cr";
                                            c0626Gg = this.A02;
                                            if (c0626Gg == null) {
                                                Log.e(A00(80, 13, 35), A00(219, 55, 26));
                                            } else {
                                                byte[] bArr4 = c0626Gg.A03;
                                                C0626Gg c0626Gg5 = this.A02;
                                                int i7 = c0626Gg5.A00;
                                                c0626Gg5.A00 = i7 + 1;
                                                bArr4[i7] = b2;
                                                byte[] bArr5 = this.A02.A03;
                                                C0626Gg c0626Gg6 = this.A02;
                                                int i8 = c0626Gg6.A00;
                                                c0626Gg6.A00 = i8 + 1;
                                                bArr5[i8] = bA0E;
                                            }
                                        }
                                    }
                                    if (this.A02.A00 == (this.A02.A01 * 2) - 1) {
                                        A02();
                                    }
                                }
                            }
                        }
                    }

                    @Override // com.facebook.ads.redexgen.X.AbstractC0522Bo
                    public final boolean A0R() {
                        return this.A03 != this.A04;
                    }

                    @Override // com.facebook.ads.redexgen.X.AbstractC0522Bo, com.facebook.ads.redexgen.X.InterfaceC0529Bv
                    public final /* bridge */ /* synthetic */ void ADm() {
                        super.ADm();
                    }

                    @Override // com.facebook.ads.redexgen.X.AbstractC0522Bo, com.facebook.ads.redexgen.X.VS
                    public final /* bridge */ /* synthetic */ void AEg(long j) {
                        super.AEg(j);
                    }

                    @Override // com.facebook.ads.redexgen.X.AbstractC0522Bo, com.facebook.ads.redexgen.X.InterfaceC0529Bv
                    public final void flush() {
                        super.flush();
                        this.A03 = null;
                        this.A04 = null;
                        this.A00 = 0;
                        this.A01 = this.A08[this.A00];
                        A08();
                        this.A02 = null;
                    }
                };
            case 9:
                final List<byte[]> list2 = format.A0P;
                return new AbstractC0533Bz(list2) { // from class: com.facebook.ads.redexgen.X.2y
                    public static byte[] A01;
                    public final C0637Gr A00;

                    static {
                        A02();
                    }

                    public static String A01(int i2, int i3, int i4) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
                        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
                            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 44);
                        }
                        return new String(bArrCopyOfRange);
                    }

                    public static void A02() {
                        A01 = new byte[]{-83, -33, -53, -83, -50, -52, -40, -51, -50, -37};
                    }

                    {
                        super(A01(0, 10, 61));
                        C0679Ij c0679Ij = new C0679Ij(list2.get(0));
                        int subtitleAncillaryPage = c0679Ij.A0I();
                        this.A00 = new C0637Gr(subtitleAncillaryPage, c0679Ij.A0I());
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // com.facebook.ads.redexgen.X.AbstractC0533Bz
                    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
                    public final VO A0b(byte[] bArr, int i2, boolean z) {
                        if (z) {
                            this.A00.A0J();
                        }
                        return new VO(this.A00.A0I(bArr, i2));
                    }
                };
            case 10:
                return new AbstractC0533Bz() { // from class: com.facebook.ads.redexgen.X.2x
                    public static byte[] A05;
                    public static String[] A06 = {"D8ktImD4gI341B9dMX", "p", "8S1Qfr0uQHuWlKinBNgV3mwJeBc1O2wn", "O", "UgOsD1qslkvgk8WTNW5IJqqmR5mppeJL", "YmudOgNfte0R1MlRzZs3i7R", "t", "Vvarb6mClw"};
                    public int A00;
                    public Inflater A01;
                    public byte[] A02;
                    public final C0638Gs A03;
                    public final C0679Ij A04;

                    public static String A01(int i2, int i3, int i4) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
                        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
                            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 117);
                        }
                        return new String(bArrCopyOfRange);
                    }

                    public static void A02() {
                        A05 = new byte[]{97, 86, 66, 117, 84, 82, 94, 85, 84, 67};
                    }

                    static {
                        A02();
                    }

                    {
                        A01(0, 10, 68);
                        this.A04 = new C0679Ij();
                        this.A03 = new C0638Gs();
                    }

                    public static GX A00(C0679Ij c0679Ij, C0638Gs c0638Gs) {
                        int sectionLength = c0679Ij.A07();
                        int nextSectionPosition = c0679Ij.A0E();
                        int iA0I = c0679Ij.A0I();
                        int iA06 = c0679Ij.A06() + iA0I;
                        if (iA06 > sectionLength) {
                            c0679Ij.A0Y(sectionLength);
                            return null;
                        }
                        GX gxA06 = null;
                        if (nextSectionPosition == 128) {
                            gxA06 = c0638Gs.A06();
                            String[] strArr = A06;
                            if (strArr[5].length() != strArr[7].length()) {
                                A06[0] = "8Q7r9e8nqCgCYEZ6IU";
                                c0638Gs.A07();
                            } else {
                                c0638Gs.A07();
                            }
                        } else {
                            switch (nextSectionPosition) {
                                case 20:
                                    c0638Gs.A05(c0679Ij, iA0I);
                                    break;
                                case 21:
                                    c0638Gs.A03(c0679Ij, iA0I);
                                    break;
                                case 22:
                                    c0638Gs.A04(c0679Ij, iA0I);
                                    break;
                            }
                        }
                        c0679Ij.A0Y(iA06);
                        if (A06[0].length() != 18) {
                            throw new RuntimeException();
                        }
                        A06[2] = "BTE07TDUmys5OOcsYpYqmwkAe847KCkG";
                        return gxA06;
                    }

                    private boolean A03(byte[] bArr, int i2) {
                        if (i2 != 0) {
                            byte b2 = bArr[0];
                            if (A06[3].length() != 1) {
                                throw new RuntimeException();
                            }
                            A06[4] = "3s6wsel2PksO74PVHVwG8hUXCMbdJ5Q0";
                            if (b2 == 120) {
                                if (this.A01 == null) {
                                    this.A01 = new Inflater();
                                    this.A02 = new byte[i2];
                                }
                                this.A00 = 0;
                                this.A01.setInput(bArr, 0, i2);
                                while (!this.A01.finished() && !this.A01.needsDictionary() && !this.A01.needsInput()) {
                                    try {
                                        if (this.A00 == this.A02.length) {
                                            this.A02 = Arrays.copyOf(this.A02, this.A02.length * 2);
                                        }
                                        this.A00 += this.A01.inflate(this.A02, this.A00, this.A02.length - this.A00);
                                    } catch (DataFormatException unused) {
                                        this.A01.reset();
                                        return false;
                                    } catch (Throwable th) {
                                        this.A01.reset();
                                        throw th;
                                    }
                                }
                                boolean zFinished = this.A01.finished();
                                this.A01.reset();
                                return zFinished;
                            }
                        }
                        return false;
                    }

                    @Override // com.facebook.ads.redexgen.X.AbstractC0533Bz
                    public final GY A0b(byte[] bArr, int i2, boolean z) throws GZ {
                        if (A03(bArr, i2)) {
                            this.A04.A0b(this.A02, this.A00);
                        } else {
                            C0679Ij c0679Ij = this.A04;
                            if (A06[0].length() != 18) {
                                throw new RuntimeException();
                            }
                            A06[2] = "roAZZspd009Dh1499aBQr6xCTRbeSGaA";
                            c0679Ij.A0b(bArr, i2);
                        }
                        this.A03.A07();
                        ArrayList arrayList = new ArrayList();
                        while (this.A04.A04() >= 3) {
                            GX gxA00 = A00(this.A04, this.A03);
                            if (gxA00 != null) {
                                arrayList.add(gxA00);
                            }
                        }
                        return new VN(Collections.unmodifiableList(arrayList));
                    }
                };
            default:
                throw new IllegalArgumentException(A00(0, 50, 24));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0620Ga
    public final boolean AF8(Format format) {
        String str = format.A0O;
        return A00(236, 8, 112).equals(str) || A00(244, 10, 85).equals(str) || A00(122, 20, 87).equals(str) || A00(167, 21, 57).equals(str) || A00(216, 20, 2).equals(str) || A00(188, 28, 125).equals(str) || A00(50, 19, 119).equals(str) || A00(142, 25, 39).equals(str) || A00(69, 19, 27).equals(str) || A00(88, 19, 97).equals(str) || A00(107, 15, 26).equals(str);
    }
}
