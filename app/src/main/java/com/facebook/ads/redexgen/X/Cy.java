package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import com.facebook.ads.internal.exoplayer2.video.ColorInfo;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Cy {
    public static byte[] A0h;
    public static String[] A0i = {"8TpqgOaNUSLeAK", "gH4cNYX0T", "RxL", "kj1UdyKUA", "aiTHi296we72LwNhd9xiUHTfsQD7UP14", "nYCZaclp", "WtVme8bpEWm7CPp05BwAvQTPTn4MSMoI", "2CEJS7GQKAShoAR5BcckvYDLq4kjdsx3"};
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public int A0R;
    public long A0S;
    public long A0T;
    public DrmInitData A0U;
    public C0544Cn A0V;
    public InterfaceC0545Co A0W;

    @Nullable
    public Cz A0X;
    public String A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public byte[] A0d;
    public byte[] A0e;
    public byte[] A0f;
    public String A0g;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0h, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0i;
            if (strArr[2].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0i;
            strArr2[3] = "YyA2yq7rE";
            strArr2[1] = "s5NQwzdwS";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 50);
            i4++;
        }
    }

    public static void A04() {
        A0h = new byte[]{102, 88, -117, -99, -84, -84, -95, -90, -97, 88, -91, -95, -91, -99, -116, -79, -88, -99, 88, -84, -89, 88, -89, -59, -89, -89, -87, -57, -27, -57, -55, -71, -24, 6, -21, -5, -6, 118, -108, 121, -119, -120, 100, 122, -115, -123, -121, 122, -120, -120, -104, -74, -101, -85, -86, -122, -93, -90, -86, -86, -93, -100, -86, -86, -119, -89, -115, -119, -117, 123, -55, -25, -50, -44, -55, -53, -88, -58, -76, -73, -84, -82, -106, -77, -103, -120, -90, -108, -105, -116, -114, 118, -109, 122, -96, -66, -84, -78, -114, -96, -94, -84, -67, -37, -53, -52, -47, -49, -86, -56, -71, -84, -74, -104, -78, -73, -67, -104, -75, -78, -67, -88, -58, -69, -71, -68, -84, -81, -85, -42, -12, -21, -28, -25, -41, -34, -24, -84, -39, -39, -42, -39, -121, -41, -56, -39, -38, -48, -43, -50, -121, -83, -42, -36, -39, -86, -86, -121, -41, -39, -48, -35, -56, -37, -52, -121, -53, -56, -37, -56, -124, -79, -79, -82, -79, 95, -81, -96, -79, -78, -88, -83, -90, 95, -116, -110, 110, -128, -126, -116, 95, -94, -82, -93, -92, -94, 95, -81, -79, -88, -75, -96, -77, -92, -12, 33, 33, 30, 33, -49, 31, 16, 33, 34, 24, 29, 22, -49, 37, 30, 33, 17, 24, 34, -49, 18, 30, 19, 20, 18, -49, 31, 33, 24, 37, 16, 35, 20, -27, 0, 8, 11, 4, 3, -65, 19, 14, -65, 5, 8, 13, 3, -65, -27, 14, 20, 17, -30, -30, -65, -11, -30, -48, -65, 8, 13, 8, 19, 8, 0, 11, 8, 25, 0, 19, 8, 14, 13, -65, 3, 0, 19, 0, -73, -53, -34, -36, -39, -35, -43, -53, -81, -30, -34, -36, -53, -51, -34, -39, -36, -71, -38, -39, -104, -69, -82, -72, -117, -72, -66, -102, -84, -82, -72, -117, -44, -34, -117, -32, -39, -34, -32, -37, -37, -38, -35, -33, -48, -49, -103, -117, -66, -48, -33, -33, -44, -39, -46, -117, -40, -44, -40, -48, -65, -28, -37, -48, -117, -33, -38, -117, -89, -77, -104, -86, -106, -89, -87, -106, -27, -15, -38, -42, -33, -24, -63, -30, -39, -27, -29, -17, -28, -43, -24, -28, -65, -47, -29, -29, -121, -109, -120, 121, -116, -120, 99, -119, -120, 122, 108, -61, -49, -58, -65, -78, -61, -59, -78, -39, -14, -23, -4, -12, -23, -25, -8, -23, -24, -92, -47, -51, -47, -55, -92, -8, -3, -12, -23, -78, 3, 28, 25, 28, 29, 37, 28, -50, -12, 29, 35, 32, -15, -15, -36, -50, 1, 19, 34, 34, 23, 28, 21, -50, 27, 23, 27, 19, 2, 39, 30, 19, -50, 34, 29, -50, 36, 23, 18, 19, 29, -35, 38, -37, 35, 28, 25, 28, 29, 37, 28, -79, -54, -50, -63, -65, -53, -61, -54, -59, -42, -63, -64, 124, -65, -53, -64, -63, -65, 124, -59, -64, -63, -54, -48, -59, -62, -59, -63, -50, -118, -58, -33, -28, -26, -31, -31, -32, -29, -27, -42, -43, -111, -63, -76, -66, -111, -45, -38, -27, -111, -43, -42, -31, -27, -39, -85, -111, -98, -89, -107, -104, -115, -113, 122, -32, -23, -41, -38, -49, -47, -66, -71, -45, -35, -39, -71, -53, -38, -85, -76, -94, -91, -102, -100, -119, -124, -98, -88, -92, -124, -106, -88, -91, -110, -101, -119, -116, -127, -125, 112, 107, -123, -113, -117, 107, 125, -110, 127, -40, -31, -49, -46, -57, -55, -74, -79, -53, -43, -47, -79, -43, -46, -72, -63, -81, -78, -89, -87, -86, -111, -85, -75, -79, -111, -86, -89, -72, -91, -50, -41, -59, -53, -89, -50, -66, -49, -89, -66, -57, -51, -54, -69, -69, -51, -42, -53, -65, -68, -58, -55, -72, -120, -111, -120, -126, 106, -59, -50, -59, -65, -88, -104, -89, -89, -93, -96, -102, -104, -85, -96, -90, -91, 102, -101, -83, -103, -86, -84, -103, -86, -84, -69, -69, -73, -76, -82, -84, -65, -76, -70, -71, 122, -69, -78, -66, -80, -65, -65, -69, -72, -78, -80, -61, -72, -66, -67, 126, -59, -66, -79, -62, -60, -79, -69, -54, -54, -58, -61, -67, -69, -50, -61, -55, -56, -119, -46, -121, -51, -49, -68, -52, -61, -54, -51, -31, -48, -43, -37, -101, -51, -49, -97, -94, -74, -91, -86, -80, 112, -90, -94, -92, 116, -76, -56, -73, -68, -62, -126, -71, -65, -76, -74, -55, -35, -52, -47, -41, -105, -43, -40, -100, -55, -107, -44, -55, -36, -43, -67, -47, -64, -59, -53, -117, -55, -52, -63, -61, -88, -68, -85, -80, -74, 118, -76, -73, -84, -82, 116, -109, 121, -51, -31, -48, -43, -37, -101, -37, -36, -31, -33, -20, 0, -17, -12, -6, -70, -3, -20, 2, -4, 16, -1, 4, 10, -54, 15, 13, 16, 0, -56, 3, -1, -32, -12, -29, -24, -18, -82, -11, -19, -29, -83, -29, -13, -14, -52, -32, -49, -44, -38, -102, -31, -39, -49, -103, -49, -33, -34, -103, -45, -49, -97, -77, -94, -89, -83, 109, -76, -83, -80, -96, -89, -79, -86, -66, -83, -78, -72, 120, -63, 118, -66, -73, -76, -73, -72, -64, -73, -26, -17, -24, -12, -27, -8, -12, -81, -8, -83, -13, -13, -31, 8, -5, -10, -9, 1, -63, -59, -7, 2, 2, 30, 17, 12, 13, 23, -41, 9, 30, 11, -17, -30, -35, -34, -24, -88, -31, -34, -17, -36, -61, -74, -79, -78, -68, 124, -70, -67, -127, -61, 122, -78, -64, -44, -57, -62, -61, -51, -115, -53, -50, -61, -59, -112, 19, 6, 1, 2, 12, -52, 20, 19, 0, -50, -79, -92, -97, -96, -86, 106, -77, 104, -80, -87, -90, -87, -86, -78, -87, 7, -6, -11, -10, 0, -64, 9, -66, 7, -1, -11, -65, 0, -1, -61, -65, 7, 1, -55, 6, -7, -12, -11, -1, -65, 8, -67, 6, -2, -12, -66, -1, -2, -62, -66, 6, 0, -55};
    }

    static {
        A04();
    }

    public Cy() {
        this.A0R = -1;
        this.A0J = -1;
        this.A0I = -1;
        this.A0G = -1;
        this.A0H = 0;
        this.A0e = null;
        this.A0P = -1;
        this.A0b = false;
        this.A0D = -1;
        this.A0E = -1;
        this.A0C = -1;
        this.A0K = AdError.NETWORK_ERROR_CODE;
        this.A0L = RCHTTPStatusCodes.SUCCESS;
        this.A06 = -1.0f;
        this.A07 = -1.0f;
        this.A04 = -1.0f;
        this.A05 = -1.0f;
        this.A02 = -1.0f;
        this.A03 = -1.0f;
        this.A08 = -1.0f;
        this.A09 = -1.0f;
        this.A00 = -1.0f;
        this.A01 = -1.0f;
        this.A0B = 1;
        this.A0A = -1;
        this.A0O = 8000;
        this.A0S = 0L;
        this.A0T = 0L;
        this.A0Z = true;
        this.A0g = A01(868, 3, 79);
    }

    public /* synthetic */ Cy(C1031Wg c1031Wg) {
        this();
    }

    public static Pair<String, List<byte[]>> A00(C0679Ij c0679Ij) throws C0488Af {
        try {
            c0679Ij.A0Z(16);
            long jA0K = c0679Ij.A0K();
            if (jA0K == 1482049860) {
                return new Pair<>(A01(881, 10, 96), null);
            }
            if (jA0K == 826496599) {
                byte[] bArr = c0679Ij.A00;
                for (int iA06 = c0679Ij.A06() + 20; iA06 < bArr.length - 4; iA06++) {
                    if (bArr[iA06] == 0 && bArr[iA06 + 1] == 0) {
                        int offset = bArr[iA06 + 2];
                        if (offset == 1) {
                            int offset2 = bArr[iA06 + 3];
                            if (offset2 == 15) {
                                byte[] bufferData = Arrays.copyOfRange(bArr, iA06, bArr.length);
                                return new Pair<>(A01(934, 10, 107), Collections.singletonList(bufferData));
                            }
                        } else {
                            continue;
                        }
                    }
                }
                throw new C0488Af(A01(238, 45, 109));
            }
            Log.w(A01(283, 17, 56), A01(419, 51, 124));
            return new Pair<>(A01(944, 15, 9), null);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new C0488Af(A01(137, 33, 53));
        }
    }

    public static List<byte[]> A03(byte[] bArr) throws C0488Af {
        String strA01 = A01(204, 34, 125);
        try {
            if (bArr[0] == 2) {
                int i = 1;
                int i2 = 0;
                while (bArr[i] == -1) {
                    i2 += 255;
                    i++;
                }
                int vorbisSkipLength = i + 1;
                int i3 = i2 + bArr[i];
                int i4 = 0;
                while (bArr[vorbisSkipLength] == -1) {
                    i4 += 255;
                    vorbisSkipLength++;
                }
                int i5 = vorbisSkipLength + 1;
                int offset = bArr[vorbisSkipLength];
                int i6 = i4 + offset;
                int vorbisSkipLength2 = bArr[i5];
                if (vorbisSkipLength2 == 1) {
                    byte[] bArr2 = new byte[i3];
                    System.arraycopy(bArr, i5, bArr2, 0, i3);
                    int i7 = i5 + i3;
                    int vorbisSkipLength3 = bArr[i7];
                    if (vorbisSkipLength3 == 3) {
                        int i8 = i7 + i6;
                        int vorbisSkipLength4 = bArr[i8];
                        if (vorbisSkipLength4 == 5) {
                            int offset2 = bArr.length;
                            byte[] bArr3 = new byte[offset2 - i8];
                            int offset3 = bArr.length;
                            System.arraycopy(bArr, i8, bArr3, 0, offset3 - i8);
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw new C0488Af(strA01);
                    }
                    throw new C0488Af(strA01);
                }
                throw new C0488Af(strA01);
            }
            throw new C0488Af(strA01);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new C0488Af(strA01);
        }
    }

    public static boolean A05(C0679Ij c0679Ij) throws C0488Af {
        try {
            int iA0C = c0679Ij.A0C();
            if (iA0C == 1) {
                return true;
            }
            if (iA0C != 65534) {
                return false;
            }
            c0679Ij.A0Y(24);
            return c0679Ij.A0L() == C1029We.A0s.getMostSignificantBits() && c0679Ij.A0L() == C1029We.A0s.getLeastSignificantBits();
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new C0488Af(A01(170, 34, 13));
        }
    }

    private byte[] A06() {
        if (this.A06 == -1.0f || this.A07 == -1.0f) {
            return null;
        }
        float f = this.A04;
        String[] strArr = A0i;
        if (strArr[0].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0i;
        strArr2[2] = "mbc";
        strArr2[4] = "GijrUN633WOPM1ihGB7sVJQ0vA2mo6CS";
        if (f == -1.0f || this.A05 == -1.0f || this.A02 == -1.0f || this.A03 == -1.0f || this.A08 == -1.0f || this.A09 == -1.0f || this.A00 == -1.0f || this.A01 == -1.0f) {
            return null;
        }
        byte[] bArr = new byte[25];
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.put((byte) 0);
        byteBufferWrap.putShort((short) ((this.A06 * 50000.0f) + 0.5f));
        byteBufferWrap.putShort((short) ((this.A07 * 50000.0f) + 0.5f));
        byteBufferWrap.putShort((short) ((this.A04 * 50000.0f) + 0.5f));
        byteBufferWrap.putShort((short) ((this.A05 * 50000.0f) + 0.5f));
        byteBufferWrap.putShort((short) ((this.A02 * 50000.0f) + 0.5f));
        byteBufferWrap.putShort((short) ((this.A03 * 50000.0f) + 0.5f));
        byteBufferWrap.putShort((short) ((this.A08 * 50000.0f) + 0.5f));
        byteBufferWrap.putShort((short) ((this.A09 * 50000.0f) + 0.5f));
        byteBufferWrap.putShort((short) (this.A00 + 0.5f));
        byteBufferWrap.putShort((short) (this.A01 + 0.5f));
        byteBufferWrap.putShort((short) this.A0K);
        byteBufferWrap.putShort((short) this.A0L);
        return bArr;
    }

    public final void A07() {
        Cz cz = this.A0X;
        if (cz != null) {
            cz.A02(this);
        }
    }

    public final void A08() {
        Cz cz = this.A0X;
        if (cz != null) {
            cz.A00();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:107:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:108:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:109:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:110:0x0308  */
    /* JADX WARN: Code duplicated, block: B:112:0x0316  */
    /* JADX WARN: Code duplicated, block: B:113:0x0319  */
    /* JADX WARN: Code duplicated, block: B:114:0x031f  */
    /* JADX WARN: Code duplicated, block: B:115:0x033c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0359  */
    /* JADX WARN: Code duplicated, block: B:117:0x036e  */
    /* JADX WARN: Code duplicated, block: B:118:0x037a  */
    /* JADX WARN: Code duplicated, block: B:119:0x038e  */
    /* JADX WARN: Code duplicated, block: B:120:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:121:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:122:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:123:0x0406  */
    /* JADX WARN: Code duplicated, block: B:124:0x0412  */
    /* JADX WARN: Code duplicated, block: B:125:0x041e  */
    /* JADX WARN: Code duplicated, block: B:126:0x0431  */
    /* JADX WARN: Code duplicated, block: B:127:0x043d  */
    /* JADX WARN: Code duplicated, block: B:128:0x0449  */
    /* JADX WARN: Code duplicated, block: B:129:0x045b  */
    /* JADX WARN: Code duplicated, block: B:131:0x0472  */
    /* JADX WARN: Code duplicated, block: B:133:0x047a  */
    /* JADX WARN: Code duplicated, block: B:134:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:135:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:137:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:138:0x0503  */
    /* JADX WARN: Code duplicated, block: B:139:0x050e  */
    /* JADX WARN: Code duplicated, block: B:140:0x0519  */
    /* JADX WARN: Code duplicated, block: B:141:0x052a  */
    /* JADX WARN: Code duplicated, block: B:142:0x0535  */
    /* JADX WARN: Code duplicated, block: B:145:0x055e  */
    /* JADX WARN: Code duplicated, block: B:148:0x0566  */
    /* JADX WARN: Code duplicated, block: B:151:0x0595  */
    /* JADX WARN: Code duplicated, block: B:153:0x059b  */
    /* JADX WARN: Code duplicated, block: B:155:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:157:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:160:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:164:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:169:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:171:0x0600  */
    /* JADX WARN: Code duplicated, block: B:173:0x0610  */
    /* JADX WARN: Code duplicated, block: B:174:0x061f  */
    /* JADX WARN: Code duplicated, block: B:176:0x062f  */
    /* JADX WARN: Code duplicated, block: B:177:0x065d  */
    /* JADX WARN: Code duplicated, block: B:179:0x066d  */
    /* JADX WARN: Code duplicated, block: B:4:0x0018  */
    /* JADX WARN: Code duplicated, block: B:58:0x0196  */
    /* JADX WARN: Code duplicated, block: B:7:0x0038  */
    /* JADX WARN: Instruction removed from duplicated block: B:133:0x047a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:134:0x04a2, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:137:0x04dc, please report this as an issue */
    public final void A09(InterfaceC0537Ce interfaceC0537Ce, int i) throws C0488Af {
        byte b;
        String strA01;
        String strA02;
        String strA03;
        String strA04;
        byte[] bArr;
        int i2;
        int i3;
        Format formatA0A;
        float f;
        int i4;
        ColorInfo colorInfo;
        int i5;
        int i6;
        int i7;
        int i8 = -1;
        int iA02 = -1;
        List listSingletonList = null;
        String str = this.A0Y;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals(A01(534, 14, 88))) {
                    b = 5;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 6);
                strA02 = A01(RCHTTPStatusCodes.ERROR, 27, 63);
                strA03 = A01(283, 17, 56);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 95);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 94);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 44);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 27);
                        bArr = this.A0d;
                        if (bArr == null) {
                            listSingletonList = Collections.singletonList(bArr);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 118);
                        J1 j1A00 = J1.A00(new C0679Ij(this.A0d));
                        listSingletonList = j1A00.A04;
                        this.A0M = j1A00.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 71);
                        J7 j7A00 = J7.A00(new C0679Ij(this.A0d));
                        listSingletonList = j7A00.A01;
                        this.A0M = j7A00.A00;
                        break;
                    case 8:
                        Pair<String, List<byte[]>> pairA00 = A00(new C0679Ij(this.A0d));
                        strA04 = (String) pairA00.first;
                        listSingletonList = (List) pairA00.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 9);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 12);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 58);
                        i8 = 5760;
                        listSingletonList = new ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 54);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 21);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 42);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 58);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 15);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 105);
                        this.A0X = new Cz();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 77);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 57);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 33);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 89);
                        if (A05(new C0679Ij(this.A0d))) {
                            iA02 = C0695Iz.A02(this.A0A);
                            if (iA02 == 0) {
                                iA02 = -1;
                                strA04 = A01(853, 15, 23);
                                Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                            }
                        } else {
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, A01(RCHTTPStatusCodes.UNSUCCESSFUL, 51, 57) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 89);
                        iA02 = C0695Iz.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 40);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 78);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 29);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 25);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 5);
                        byte[] bArr2 = this.A0d;
                        listSingletonList = Collections.singletonList(new byte[]{bArr2[0], bArr2[1], bArr2[2], bArr2[3]});
                        break;
                    default:
                        throw new C0488Af(A01(470, 30, 42));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (C0672Ic.A09(strA04)) {
                    i3 = 1;
                    formatA0A = Format.A06(Integer.toString(i), strA04, null, -1, i8, this.A0B, this.A0O, iA02, listSingletonList, this.A0U, i2, this.A0g);
                } else if (C0672Ic.A0B(strA04)) {
                    i3 = 2;
                    if (this.A0H == 0) {
                        i6 = this.A0I;
                        if (i6 == -1) {
                            i6 = this.A0R;
                        }
                        this.A0I = i6;
                        i7 = this.A0G;
                        if (i7 == -1) {
                            i7 = this.A0J;
                        }
                        this.A0G = i7;
                    }
                    f = -1.0f;
                    i4 = this.A0I;
                    if (i4 != -1 && (i5 = this.A0G) != -1) {
                        f = (this.A0J * i4) / (this.A0R * i5);
                    }
                    colorInfo = null;
                    if (this.A0b) {
                        colorInfo = new ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                    }
                    formatA0A = Format.A04(Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                } else if (A01(693, 20, 40).equals(strA04)) {
                    i3 = 3;
                    formatA0A = Format.A01(Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                } else if (A01(871, 10, 78).equals(strA04)) {
                    i3 = 3;
                    ArrayList arrayList = new ArrayList(2);
                    arrayList.add(C1029We.A0t);
                    arrayList.add(this.A0d);
                    formatA0A = Format.A09(Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList);
                } else if (!A01(675, 18, 29).equals(strA04) || A01(660, 15, 25).equals(strA04) || A01(641, 19, 5).equals(strA04)) {
                    i3 = 3;
                    formatA0A = Format.A0A(Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                } else {
                    throw new C0488Af(A01(398, 21, 82));
                }
                this.A0W = interfaceC0537Ce.AFD(this.A0N, i3);
                this.A0W.A5V(formatA0A);
                return;
            case -2095575984:
                if (str.equals(A01(578, 14, 80))) {
                    b = 3;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 6);
                strA02 = A01(RCHTTPStatusCodes.ERROR, 27, 63);
                strA03 = A01(283, 17, 56);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 95);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 94);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 44);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 27);
                        bArr = this.A0d;
                        if (bArr == null) {
                            listSingletonList = Collections.singletonList(bArr);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 118);
                        J1 j1A01 = J1.A00(new C0679Ij(this.A0d));
                        listSingletonList = j1A01.A04;
                        this.A0M = j1A01.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 71);
                        J7 j7A01 = J7.A00(new C0679Ij(this.A0d));
                        listSingletonList = j7A01.A01;
                        this.A0M = j7A01.A00;
                        break;
                    case 8:
                        Pair<String, List<byte[]>> pairA01 = A00(new C0679Ij(this.A0d));
                        strA04 = (String) pairA01.first;
                        listSingletonList = (List) pairA01.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 9);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 12);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 58);
                        i8 = 5760;
                        listSingletonList = new ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 54);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 21);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 42);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 58);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 15);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 105);
                        this.A0X = new Cz();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 77);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 57);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 33);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 89);
                        if (A05(new C0679Ij(this.A0d))) {
                            iA02 = C0695Iz.A02(this.A0A);
                            if (iA02 == 0) {
                                iA02 = -1;
                                strA04 = A01(853, 15, 23);
                                Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                            }
                        } else {
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, A01(RCHTTPStatusCodes.UNSUCCESSFUL, 51, 57) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 89);
                        iA02 = C0695Iz.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 40);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 78);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 29);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 25);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 5);
                        byte[] bArr3 = this.A0d;
                        listSingletonList = Collections.singletonList(new byte[]{bArr3[0], bArr3[1], bArr3[2], bArr3[3]});
                        break;
                    default:
                        throw new C0488Af(A01(470, 30, 42));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (C0672Ic.A09(strA04)) {
                    i3 = 1;
                    formatA0A = Format.A06(Integer.toString(i), strA04, null, -1, i8, this.A0B, this.A0O, iA02, listSingletonList, this.A0U, i2, this.A0g);
                } else {
                    if (C0672Ic.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            i6 = this.A0I;
                            if (i6 == -1) {
                                i6 = this.A0R;
                            }
                            this.A0I = i6;
                            i7 = this.A0G;
                            if (i7 == -1) {
                                i7 = this.A0J;
                            }
                            this.A0G = i7;
                        }
                        f = -1.0f;
                        i4 = this.A0I;
                        if (i4 != -1) {
                            f = (this.A0J * i4) / (this.A0R * i5);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = Format.A04(Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 40).equals(strA04)) {
                        i3 = 3;
                        formatA0A = Format.A01(Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 78).equals(strA04)) {
                        i3 = 3;
                        ArrayList arrayList2 = new ArrayList(2);
                        arrayList2.add(C1029We.A0t);
                        arrayList2.add(this.A0d);
                        formatA0A = Format.A09(Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList2);
                    } else {
                        if (!A01(675, 18, 29).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = Format.A0A(Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0537Ce.AFD(this.A0N, i3);
                this.A0W.A5V(formatA0A);
                return;
            case -1985379776:
                if (str.equals(A01(94, 8, 45))) {
                    b = 22;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 6);
                strA02 = A01(RCHTTPStatusCodes.ERROR, 27, 63);
                strA03 = A01(283, 17, 56);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 95);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 94);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 44);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 27);
                        bArr = this.A0d;
                        if (bArr == null) {
                            listSingletonList = Collections.singletonList(bArr);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 118);
                        J1 j1A02 = J1.A00(new C0679Ij(this.A0d));
                        listSingletonList = j1A02.A04;
                        this.A0M = j1A02.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 71);
                        J7 j7A02 = J7.A00(new C0679Ij(this.A0d));
                        listSingletonList = j7A02.A01;
                        this.A0M = j7A02.A00;
                        break;
                    case 8:
                        Pair<String, List<byte[]>> pairA02 = A00(new C0679Ij(this.A0d));
                        strA04 = (String) pairA02.first;
                        listSingletonList = (List) pairA02.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 9);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 12);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 58);
                        i8 = 5760;
                        listSingletonList = new ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 54);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 21);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 42);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 58);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 15);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 105);
                        this.A0X = new Cz();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 77);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 57);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 33);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 89);
                        if (A05(new C0679Ij(this.A0d))) {
                            iA02 = C0695Iz.A02(this.A0A);
                            if (iA02 == 0) {
                                iA02 = -1;
                                strA04 = A01(853, 15, 23);
                                Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                            }
                        } else {
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, A01(RCHTTPStatusCodes.UNSUCCESSFUL, 51, 57) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 89);
                        iA02 = C0695Iz.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 40);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 78);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 29);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 25);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 5);
                        byte[] bArr4 = this.A0d;
                        listSingletonList = Collections.singletonList(new byte[]{bArr4[0], bArr4[1], bArr4[2], bArr4[3]});
                        break;
                    default:
                        throw new C0488Af(A01(470, 30, 42));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (C0672Ic.A09(strA04)) {
                    i3 = 1;
                    formatA0A = Format.A06(Integer.toString(i), strA04, null, -1, i8, this.A0B, this.A0O, iA02, listSingletonList, this.A0U, i2, this.A0g);
                } else {
                    if (C0672Ic.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            i6 = this.A0I;
                            if (i6 == -1) {
                                i6 = this.A0R;
                            }
                            this.A0I = i6;
                            i7 = this.A0G;
                            if (i7 == -1) {
                                i7 = this.A0J;
                            }
                            this.A0G = i7;
                        }
                        f = -1.0f;
                        i4 = this.A0I;
                        if (i4 != -1) {
                            f = (this.A0J * i4) / (this.A0R * i5);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = Format.A04(Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 40).equals(strA04)) {
                        i3 = 3;
                        formatA0A = Format.A01(Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 78).equals(strA04)) {
                        i3 = 3;
                        ArrayList arrayList3 = new ArrayList(2);
                        arrayList3.add(C1029We.A0t);
                        arrayList3.add(this.A0d);
                        formatA0A = Format.A09(Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList3);
                    } else {
                        if (!A01(675, 18, 29).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = Format.A0A(Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0537Ce.AFD(this.A0N, i3);
                this.A0W.A5V(formatA0A);
                return;
            case -1784763192:
                if (str.equals(A01(121, 8, 53))) {
                    b = 17;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 6);
                strA02 = A01(RCHTTPStatusCodes.ERROR, 27, 63);
                strA03 = A01(283, 17, 56);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 95);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 94);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 44);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 27);
                        bArr = this.A0d;
                        if (bArr == null) {
                            listSingletonList = Collections.singletonList(bArr);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 118);
                        J1 j1A03 = J1.A00(new C0679Ij(this.A0d));
                        listSingletonList = j1A03.A04;
                        this.A0M = j1A03.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 71);
                        J7 j7A03 = J7.A00(new C0679Ij(this.A0d));
                        listSingletonList = j7A03.A01;
                        this.A0M = j7A03.A00;
                        break;
                    case 8:
                        Pair<String, List<byte[]>> pairA03 = A00(new C0679Ij(this.A0d));
                        strA04 = (String) pairA03.first;
                        listSingletonList = (List) pairA03.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 9);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 12);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 58);
                        i8 = 5760;
                        listSingletonList = new ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 54);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 21);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 42);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 58);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 15);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 105);
                        this.A0X = new Cz();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 77);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 57);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 33);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 89);
                        if (A05(new C0679Ij(this.A0d))) {
                            iA02 = C0695Iz.A02(this.A0A);
                            if (iA02 == 0) {
                                iA02 = -1;
                                strA04 = A01(853, 15, 23);
                                Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                            }
                        } else {
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, A01(RCHTTPStatusCodes.UNSUCCESSFUL, 51, 57) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 89);
                        iA02 = C0695Iz.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 40);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 78);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 29);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 25);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 5);
                        byte[] bArr5 = this.A0d;
                        listSingletonList = Collections.singletonList(new byte[]{bArr5[0], bArr5[1], bArr5[2], bArr5[3]});
                        break;
                    default:
                        throw new C0488Af(A01(470, 30, 42));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (C0672Ic.A09(strA04)) {
                    i3 = 1;
                    formatA0A = Format.A06(Integer.toString(i), strA04, null, -1, i8, this.A0B, this.A0O, iA02, listSingletonList, this.A0U, i2, this.A0g);
                } else {
                    if (C0672Ic.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            i6 = this.A0I;
                            if (i6 == -1) {
                                i6 = this.A0R;
                            }
                            this.A0I = i6;
                            i7 = this.A0G;
                            if (i7 == -1) {
                                i7 = this.A0J;
                            }
                            this.A0G = i7;
                        }
                        f = -1.0f;
                        i4 = this.A0I;
                        if (i4 != -1) {
                            f = (this.A0J * i4) / (this.A0R * i5);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = Format.A04(Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 40).equals(strA04)) {
                        i3 = 3;
                        formatA0A = Format.A01(Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 78).equals(strA04)) {
                        i3 = 3;
                        ArrayList arrayList4 = new ArrayList(2);
                        arrayList4.add(C1029We.A0t);
                        arrayList4.add(this.A0d);
                        formatA0A = Format.A09(Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList4);
                    } else {
                        if (!A01(675, 18, 29).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = Format.A0A(Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0537Ce.AFD(this.A0N, i3);
                this.A0W.A5V(formatA0A);
                return;
            case -1730367663:
                if (str.equals(A01(129, 8, 99))) {
                    b = 10;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 6);
                strA02 = A01(RCHTTPStatusCodes.ERROR, 27, 63);
                strA03 = A01(283, 17, 56);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 95);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 94);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 44);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 27);
                        bArr = this.A0d;
                        if (bArr == null) {
                            listSingletonList = Collections.singletonList(bArr);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 118);
                        J1 j1A04 = J1.A00(new C0679Ij(this.A0d));
                        listSingletonList = j1A04.A04;
                        this.A0M = j1A04.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 71);
                        J7 j7A04 = J7.A00(new C0679Ij(this.A0d));
                        listSingletonList = j7A04.A01;
                        this.A0M = j7A04.A00;
                        break;
                    case 8:
                        Pair<String, List<byte[]>> pairA04 = A00(new C0679Ij(this.A0d));
                        strA04 = (String) pairA04.first;
                        listSingletonList = (List) pairA04.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 9);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 12);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 58);
                        i8 = 5760;
                        listSingletonList = new ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 54);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 21);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 42);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 58);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 15);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 105);
                        this.A0X = new Cz();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 77);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 57);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 33);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 89);
                        if (A05(new C0679Ij(this.A0d))) {
                            iA02 = C0695Iz.A02(this.A0A);
                            if (iA02 == 0) {
                                iA02 = -1;
                                strA04 = A01(853, 15, 23);
                                Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                            }
                        } else {
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, A01(RCHTTPStatusCodes.UNSUCCESSFUL, 51, 57) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 89);
                        iA02 = C0695Iz.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 40);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 78);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 29);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 25);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 5);
                        byte[] bArr6 = this.A0d;
                        listSingletonList = Collections.singletonList(new byte[]{bArr6[0], bArr6[1], bArr6[2], bArr6[3]});
                        break;
                    default:
                        throw new C0488Af(A01(470, 30, 42));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (C0672Ic.A09(strA04)) {
                    i3 = 1;
                    formatA0A = Format.A06(Integer.toString(i), strA04, null, -1, i8, this.A0B, this.A0O, iA02, listSingletonList, this.A0U, i2, this.A0g);
                } else {
                    if (C0672Ic.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            i6 = this.A0I;
                            if (i6 == -1) {
                                i6 = this.A0R;
                            }
                            this.A0I = i6;
                            i7 = this.A0G;
                            if (i7 == -1) {
                                i7 = this.A0J;
                            }
                            this.A0G = i7;
                        }
                        f = -1.0f;
                        i4 = this.A0I;
                        if (i4 != -1) {
                            f = (this.A0J * i4) / (this.A0R * i5);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = Format.A04(Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 40).equals(strA04)) {
                        i3 = 3;
                        formatA0A = Format.A01(Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 78).equals(strA04)) {
                        i3 = 3;
                        ArrayList arrayList5 = new ArrayList(2);
                        arrayList5.add(C1029We.A0t);
                        arrayList5.add(this.A0d);
                        formatA0A = Format.A09(Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList5);
                    } else {
                        if (!A01(675, 18, 29).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = Format.A0A(Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0537Ce.AFD(this.A0N, i3);
                this.A0W.A5V(formatA0A);
                return;
            case -1482641358:
                if (str.equals(A01(76, 9, 53))) {
                    b = 13;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 6);
                strA02 = A01(RCHTTPStatusCodes.ERROR, 27, 63);
                strA03 = A01(283, 17, 56);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 95);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 94);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 44);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 27);
                        bArr = this.A0d;
                        if (bArr == null) {
                            listSingletonList = Collections.singletonList(bArr);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 118);
                        J1 j1A05 = J1.A00(new C0679Ij(this.A0d));
                        listSingletonList = j1A05.A04;
                        this.A0M = j1A05.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 71);
                        J7 j7A05 = J7.A00(new C0679Ij(this.A0d));
                        listSingletonList = j7A05.A01;
                        this.A0M = j7A05.A00;
                        break;
                    case 8:
                        Pair<String, List<byte[]>> pairA05 = A00(new C0679Ij(this.A0d));
                        strA04 = (String) pairA05.first;
                        listSingletonList = (List) pairA05.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 9);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 12);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 58);
                        i8 = 5760;
                        listSingletonList = new ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 54);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 21);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 42);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 58);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 15);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 105);
                        this.A0X = new Cz();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 77);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 57);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 33);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 89);
                        if (A05(new C0679Ij(this.A0d))) {
                            iA02 = C0695Iz.A02(this.A0A);
                            if (iA02 == 0) {
                                iA02 = -1;
                                strA04 = A01(853, 15, 23);
                                Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                            }
                        } else {
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, A01(RCHTTPStatusCodes.UNSUCCESSFUL, 51, 57) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 89);
                        iA02 = C0695Iz.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 40);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 78);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 29);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 25);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 5);
                        byte[] bArr7 = this.A0d;
                        listSingletonList = Collections.singletonList(new byte[]{bArr7[0], bArr7[1], bArr7[2], bArr7[3]});
                        break;
                    default:
                        throw new C0488Af(A01(470, 30, 42));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (C0672Ic.A09(strA04)) {
                    i3 = 1;
                    formatA0A = Format.A06(Integer.toString(i), strA04, null, -1, i8, this.A0B, this.A0O, iA02, listSingletonList, this.A0U, i2, this.A0g);
                } else {
                    if (C0672Ic.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            i6 = this.A0I;
                            if (i6 == -1) {
                                i6 = this.A0R;
                            }
                            this.A0I = i6;
                            i7 = this.A0G;
                            if (i7 == -1) {
                                i7 = this.A0J;
                            }
                            this.A0G = i7;
                        }
                        f = -1.0f;
                        i4 = this.A0I;
                        if (i4 != -1) {
                            f = (this.A0J * i4) / (this.A0R * i5);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = Format.A04(Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 40).equals(strA04)) {
                        i3 = 3;
                        formatA0A = Format.A01(Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 78).equals(strA04)) {
                        i3 = 3;
                        ArrayList arrayList6 = new ArrayList(2);
                        arrayList6.add(C1029We.A0t);
                        arrayList6.add(this.A0d);
                        formatA0A = Format.A09(Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList6);
                    } else {
                        if (!A01(675, 18, 29).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = Format.A0A(Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0537Ce.AFD(this.A0N, i3);
                this.A0W.A5V(formatA0A);
                return;
            case -1482641357:
                if (str.equals(A01(85, 9, 21))) {
                    b = 14;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 6);
                strA02 = A01(RCHTTPStatusCodes.ERROR, 27, 63);
                strA03 = A01(283, 17, 56);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 95);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 94);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 44);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 27);
                        bArr = this.A0d;
                        if (bArr == null) {
                            listSingletonList = Collections.singletonList(bArr);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 118);
                        J1 j1A06 = J1.A00(new C0679Ij(this.A0d));
                        listSingletonList = j1A06.A04;
                        this.A0M = j1A06.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 71);
                        J7 j7A06 = J7.A00(new C0679Ij(this.A0d));
                        listSingletonList = j7A06.A01;
                        this.A0M = j7A06.A00;
                        break;
                    case 8:
                        Pair<String, List<byte[]>> pairA06 = A00(new C0679Ij(this.A0d));
                        strA04 = (String) pairA06.first;
                        listSingletonList = (List) pairA06.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 9);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 12);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 58);
                        i8 = 5760;
                        listSingletonList = new ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 54);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 21);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 42);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 58);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 15);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 105);
                        this.A0X = new Cz();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 77);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 57);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 33);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 89);
                        if (A05(new C0679Ij(this.A0d))) {
                            iA02 = C0695Iz.A02(this.A0A);
                            if (iA02 == 0) {
                                iA02 = -1;
                                strA04 = A01(853, 15, 23);
                                Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                            }
                        } else {
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, A01(RCHTTPStatusCodes.UNSUCCESSFUL, 51, 57) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 89);
                        iA02 = C0695Iz.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 40);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 78);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 29);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 25);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 5);
                        byte[] bArr8 = this.A0d;
                        listSingletonList = Collections.singletonList(new byte[]{bArr8[0], bArr8[1], bArr8[2], bArr8[3]});
                        break;
                    default:
                        throw new C0488Af(A01(470, 30, 42));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (C0672Ic.A09(strA04)) {
                    i3 = 1;
                    formatA0A = Format.A06(Integer.toString(i), strA04, null, -1, i8, this.A0B, this.A0O, iA02, listSingletonList, this.A0U, i2, this.A0g);
                } else {
                    if (C0672Ic.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            i6 = this.A0I;
                            if (i6 == -1) {
                                i6 = this.A0R;
                            }
                            this.A0I = i6;
                            i7 = this.A0G;
                            if (i7 == -1) {
                                i7 = this.A0J;
                            }
                            this.A0G = i7;
                        }
                        f = -1.0f;
                        i4 = this.A0I;
                        if (i4 != -1) {
                            f = (this.A0J * i4) / (this.A0R * i5);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = Format.A04(Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 40).equals(strA04)) {
                        i3 = 3;
                        formatA0A = Format.A01(Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 78).equals(strA04)) {
                        i3 = 3;
                        ArrayList arrayList7 = new ArrayList(2);
                        arrayList7.add(C1029We.A0t);
                        arrayList7.add(this.A0d);
                        formatA0A = Format.A09(Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList7);
                    } else {
                        if (!A01(675, 18, 29).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = Format.A0A(Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0537Ce.AFD(this.A0N, i3);
                this.A0W.A5V(formatA0A);
                return;
            case -1373388978:
                if (str.equals(A01(608, 15, 70))) {
                    b = 8;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 6);
                strA02 = A01(RCHTTPStatusCodes.ERROR, 27, 63);
                strA03 = A01(283, 17, 56);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 95);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 94);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 44);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 27);
                        bArr = this.A0d;
                        if (bArr == null) {
                            listSingletonList = Collections.singletonList(bArr);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 118);
                        J1 j1A07 = J1.A00(new C0679Ij(this.A0d));
                        listSingletonList = j1A07.A04;
                        this.A0M = j1A07.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 71);
                        J7 j7A07 = J7.A00(new C0679Ij(this.A0d));
                        listSingletonList = j7A07.A01;
                        this.A0M = j7A07.A00;
                        break;
                    case 8:
                        Pair<String, List<byte[]>> pairA07 = A00(new C0679Ij(this.A0d));
                        strA04 = (String) pairA07.first;
                        listSingletonList = (List) pairA07.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 9);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 12);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 58);
                        i8 = 5760;
                        listSingletonList = new ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 54);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 21);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 42);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 58);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 15);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 105);
                        this.A0X = new Cz();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 77);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 57);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 33);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 89);
                        if (A05(new C0679Ij(this.A0d))) {
                            iA02 = C0695Iz.A02(this.A0A);
                            if (iA02 == 0) {
                                iA02 = -1;
                                strA04 = A01(853, 15, 23);
                                Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                            }
                        } else {
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, A01(RCHTTPStatusCodes.UNSUCCESSFUL, 51, 57) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 89);
                        iA02 = C0695Iz.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 40);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 78);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 29);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 25);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 5);
                        byte[] bArr9 = this.A0d;
                        listSingletonList = Collections.singletonList(new byte[]{bArr9[0], bArr9[1], bArr9[2], bArr9[3]});
                        break;
                    default:
                        throw new C0488Af(A01(470, 30, 42));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (C0672Ic.A09(strA04)) {
                    i3 = 1;
                    formatA0A = Format.A06(Integer.toString(i), strA04, null, -1, i8, this.A0B, this.A0O, iA02, listSingletonList, this.A0U, i2, this.A0g);
                } else {
                    if (C0672Ic.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            i6 = this.A0I;
                            if (i6 == -1) {
                                i6 = this.A0R;
                            }
                            this.A0I = i6;
                            i7 = this.A0G;
                            if (i7 == -1) {
                                i7 = this.A0J;
                            }
                            this.A0G = i7;
                        }
                        f = -1.0f;
                        i4 = this.A0I;
                        if (i4 != -1) {
                            f = (this.A0J * i4) / (this.A0R * i5);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = Format.A04(Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 40).equals(strA04)) {
                        i3 = 3;
                        formatA0A = Format.A01(Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 78).equals(strA04)) {
                        i3 = 3;
                        ArrayList arrayList8 = new ArrayList(2);
                        arrayList8.add(C1029We.A0t);
                        arrayList8.add(this.A0d);
                        formatA0A = Format.A09(Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList8);
                    } else {
                        if (!A01(675, 18, 29).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = Format.A0A(Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0537Ce.AFD(this.A0N, i3);
                this.A0W.A5V(formatA0A);
                return;
            case -933872740:
                if (str.equals(A01(351, 8, 34))) {
                    b = 28;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 6);
                strA02 = A01(RCHTTPStatusCodes.ERROR, 27, 63);
                strA03 = A01(283, 17, 56);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 95);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 94);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 44);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 27);
                        bArr = this.A0d;
                        if (bArr == null) {
                            listSingletonList = Collections.singletonList(bArr);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 118);
                        J1 j1A08 = J1.A00(new C0679Ij(this.A0d));
                        listSingletonList = j1A08.A04;
                        this.A0M = j1A08.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 71);
                        J7 j7A08 = J7.A00(new C0679Ij(this.A0d));
                        listSingletonList = j7A08.A01;
                        this.A0M = j7A08.A00;
                        break;
                    case 8:
                        Pair<String, List<byte[]>> pairA08 = A00(new C0679Ij(this.A0d));
                        strA04 = (String) pairA08.first;
                        listSingletonList = (List) pairA08.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 9);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 12);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 58);
                        i8 = 5760;
                        listSingletonList = new ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 54);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 21);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 42);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 58);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 15);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 105);
                        this.A0X = new Cz();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 77);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 57);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 33);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 89);
                        if (A05(new C0679Ij(this.A0d))) {
                            iA02 = C0695Iz.A02(this.A0A);
                            if (iA02 == 0) {
                                iA02 = -1;
                                strA04 = A01(853, 15, 23);
                                Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                            }
                        } else {
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, A01(RCHTTPStatusCodes.UNSUCCESSFUL, 51, 57) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 89);
                        iA02 = C0695Iz.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 40);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 78);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 29);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 25);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 5);
                        byte[] bArr10 = this.A0d;
                        listSingletonList = Collections.singletonList(new byte[]{bArr10[0], bArr10[1], bArr10[2], bArr10[3]});
                        break;
                    default:
                        throw new C0488Af(A01(470, 30, 42));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (C0672Ic.A09(strA04)) {
                    i3 = 1;
                    formatA0A = Format.A06(Integer.toString(i), strA04, null, -1, i8, this.A0B, this.A0O, iA02, listSingletonList, this.A0U, i2, this.A0g);
                } else {
                    if (C0672Ic.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            i6 = this.A0I;
                            if (i6 == -1) {
                                i6 = this.A0R;
                            }
                            this.A0I = i6;
                            i7 = this.A0G;
                            if (i7 == -1) {
                                i7 = this.A0J;
                            }
                            this.A0G = i7;
                        }
                        f = -1.0f;
                        i4 = this.A0I;
                        if (i4 != -1) {
                            f = (this.A0J * i4) / (this.A0R * i5);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = Format.A04(Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 40).equals(strA04)) {
                        i3 = 3;
                        formatA0A = Format.A01(Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 78).equals(strA04)) {
                        i3 = 3;
                        ArrayList arrayList9 = new ArrayList(2);
                        arrayList9.add(C1029We.A0t);
                        arrayList9.add(this.A0d);
                        formatA0A = Format.A09(Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList9);
                    } else {
                        if (!A01(675, 18, 29).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = Format.A0A(Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0537Ce.AFD(this.A0N, i3);
                this.A0W.A5V(formatA0A);
                return;
            case -538363189:
                if (str.equals(A01(548, 15, 35))) {
                    b = 4;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 6);
                strA02 = A01(RCHTTPStatusCodes.ERROR, 27, 63);
                strA03 = A01(283, 17, 56);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 95);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 94);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 44);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 27);
                        bArr = this.A0d;
                        if (bArr == null) {
                            listSingletonList = Collections.singletonList(bArr);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 118);
                        J1 j1A09 = J1.A00(new C0679Ij(this.A0d));
                        listSingletonList = j1A09.A04;
                        this.A0M = j1A09.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 71);
                        J7 j7A09 = J7.A00(new C0679Ij(this.A0d));
                        listSingletonList = j7A09.A01;
                        this.A0M = j7A09.A00;
                        break;
                    case 8:
                        Pair<String, List<byte[]>> pairA09 = A00(new C0679Ij(this.A0d));
                        strA04 = (String) pairA09.first;
                        listSingletonList = (List) pairA09.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 9);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 12);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 58);
                        i8 = 5760;
                        listSingletonList = new ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 54);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 21);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 42);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 58);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 15);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 105);
                        this.A0X = new Cz();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 77);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 57);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 33);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 89);
                        if (A05(new C0679Ij(this.A0d))) {
                            iA02 = C0695Iz.A02(this.A0A);
                            if (iA02 == 0) {
                                iA02 = -1;
                                strA04 = A01(853, 15, 23);
                                Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                            }
                        } else {
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, A01(RCHTTPStatusCodes.UNSUCCESSFUL, 51, 57) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 89);
                        iA02 = C0695Iz.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 40);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 78);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 29);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 25);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 5);
                        byte[] bArr11 = this.A0d;
                        listSingletonList = Collections.singletonList(new byte[]{bArr11[0], bArr11[1], bArr11[2], bArr11[3]});
                        break;
                    default:
                        throw new C0488Af(A01(470, 30, 42));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (C0672Ic.A09(strA04)) {
                    i3 = 1;
                    formatA0A = Format.A06(Integer.toString(i), strA04, null, -1, i8, this.A0B, this.A0O, iA02, listSingletonList, this.A0U, i2, this.A0g);
                } else {
                    if (C0672Ic.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            i6 = this.A0I;
                            if (i6 == -1) {
                                i6 = this.A0R;
                            }
                            this.A0I = i6;
                            i7 = this.A0G;
                            if (i7 == -1) {
                                i7 = this.A0J;
                            }
                            this.A0G = i7;
                        }
                        f = -1.0f;
                        i4 = this.A0I;
                        if (i4 != -1) {
                            f = (this.A0J * i4) / (this.A0R * i5);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = Format.A04(Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 40).equals(strA04)) {
                        i3 = 3;
                        formatA0A = Format.A01(Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 78).equals(strA04)) {
                        i3 = 3;
                        ArrayList arrayList10 = new ArrayList(2);
                        arrayList10.add(C1029We.A0t);
                        arrayList10.add(this.A0d);
                        formatA0A = Format.A09(Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList10);
                    } else {
                        if (!A01(675, 18, 29).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = Format.A0A(Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0537Ce.AFD(this.A0N, i3);
                this.A0W.A5V(formatA0A);
                return;
            case -538363109:
                if (str.equals(A01(563, 15, 10))) {
                    b = 6;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 6);
                strA02 = A01(RCHTTPStatusCodes.ERROR, 27, 63);
                strA03 = A01(283, 17, 56);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 95);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 94);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 44);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 27);
                        bArr = this.A0d;
                        if (bArr == null) {
                            listSingletonList = Collections.singletonList(bArr);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 118);
                        J1 j1A010 = J1.A00(new C0679Ij(this.A0d));
                        listSingletonList = j1A010.A04;
                        this.A0M = j1A010.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 71);
                        J7 j7A010 = J7.A00(new C0679Ij(this.A0d));
                        listSingletonList = j7A010.A01;
                        this.A0M = j7A010.A00;
                        break;
                    case 8:
                        Pair<String, List<byte[]>> pairA010 = A00(new C0679Ij(this.A0d));
                        strA04 = (String) pairA010.first;
                        listSingletonList = (List) pairA010.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 9);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 12);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 58);
                        i8 = 5760;
                        listSingletonList = new ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 54);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 21);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 42);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 58);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 15);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 105);
                        this.A0X = new Cz();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 77);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 57);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 33);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 89);
                        if (A05(new C0679Ij(this.A0d))) {
                            iA02 = C0695Iz.A02(this.A0A);
                            if (iA02 == 0) {
                                iA02 = -1;
                                strA04 = A01(853, 15, 23);
                                Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                            }
                        } else {
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, A01(RCHTTPStatusCodes.UNSUCCESSFUL, 51, 57) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 89);
                        iA02 = C0695Iz.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 40);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 78);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 29);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 25);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 5);
                        byte[] bArr12 = this.A0d;
                        listSingletonList = Collections.singletonList(new byte[]{bArr12[0], bArr12[1], bArr12[2], bArr12[3]});
                        break;
                    default:
                        throw new C0488Af(A01(470, 30, 42));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (C0672Ic.A09(strA04)) {
                    i3 = 1;
                    formatA0A = Format.A06(Integer.toString(i), strA04, null, -1, i8, this.A0B, this.A0O, iA02, listSingletonList, this.A0U, i2, this.A0g);
                } else {
                    if (C0672Ic.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            i6 = this.A0I;
                            if (i6 == -1) {
                                i6 = this.A0R;
                            }
                            this.A0I = i6;
                            i7 = this.A0G;
                            if (i7 == -1) {
                                i7 = this.A0J;
                            }
                            this.A0G = i7;
                        }
                        f = -1.0f;
                        i4 = this.A0I;
                        if (i4 != -1) {
                            f = (this.A0J * i4) / (this.A0R * i5);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = Format.A04(Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 40).equals(strA04)) {
                        i3 = 3;
                        formatA0A = Format.A01(Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 78).equals(strA04)) {
                        i3 = 3;
                        ArrayList arrayList11 = new ArrayList(2);
                        arrayList11.add(C1029We.A0t);
                        arrayList11.add(this.A0d);
                        formatA0A = Format.A09(Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList11);
                    } else {
                        if (!A01(675, 18, 29).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = Format.A0A(Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0537Ce.AFD(this.A0N, i3);
                this.A0W.A5V(formatA0A);
                return;
            case -425012669:
                if (str.equals(A01(390, 8, 62))) {
                    b = 26;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 6);
                strA02 = A01(RCHTTPStatusCodes.ERROR, 27, 63);
                strA03 = A01(283, 17, 56);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 95);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 94);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 44);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 27);
                        bArr = this.A0d;
                        if (bArr == null) {
                            listSingletonList = Collections.singletonList(bArr);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 118);
                        J1 j1A011 = J1.A00(new C0679Ij(this.A0d));
                        listSingletonList = j1A011.A04;
                        this.A0M = j1A011.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 71);
                        J7 j7A011 = J7.A00(new C0679Ij(this.A0d));
                        listSingletonList = j7A011.A01;
                        this.A0M = j7A011.A00;
                        break;
                    case 8:
                        Pair<String, List<byte[]>> pairA011 = A00(new C0679Ij(this.A0d));
                        strA04 = (String) pairA011.first;
                        listSingletonList = (List) pairA011.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 9);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 12);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 58);
                        i8 = 5760;
                        listSingletonList = new ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 54);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 21);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 42);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 58);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 15);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 105);
                        this.A0X = new Cz();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 77);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 57);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 33);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 89);
                        if (A05(new C0679Ij(this.A0d))) {
                            iA02 = C0695Iz.A02(this.A0A);
                            if (iA02 == 0) {
                                iA02 = -1;
                                strA04 = A01(853, 15, 23);
                                Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                            }
                        } else {
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, A01(RCHTTPStatusCodes.UNSUCCESSFUL, 51, 57) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 89);
                        iA02 = C0695Iz.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 40);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 78);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 29);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 25);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 5);
                        byte[] bArr13 = this.A0d;
                        listSingletonList = Collections.singletonList(new byte[]{bArr13[0], bArr13[1], bArr13[2], bArr13[3]});
                        break;
                    default:
                        throw new C0488Af(A01(470, 30, 42));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (C0672Ic.A09(strA04)) {
                    i3 = 1;
                    formatA0A = Format.A06(Integer.toString(i), strA04, null, -1, i8, this.A0B, this.A0O, iA02, listSingletonList, this.A0U, i2, this.A0g);
                } else {
                    if (C0672Ic.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            i6 = this.A0I;
                            if (i6 == -1) {
                                i6 = this.A0R;
                            }
                            this.A0I = i6;
                            i7 = this.A0G;
                            if (i7 == -1) {
                                i7 = this.A0J;
                            }
                            this.A0G = i7;
                        }
                        f = -1.0f;
                        i4 = this.A0I;
                        if (i4 != -1) {
                            f = (this.A0J * i4) / (this.A0R * i5);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = Format.A04(Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 40).equals(strA04)) {
                        i3 = 3;
                        formatA0A = Format.A01(Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 78).equals(strA04)) {
                        i3 = 3;
                        ArrayList arrayList12 = new ArrayList(2);
                        arrayList12.add(C1029We.A0t);
                        arrayList12.add(this.A0d);
                        formatA0A = Format.A09(Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList12);
                    } else {
                        if (!A01(675, 18, 29).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = Format.A0A(Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0537Ce.AFD(this.A0N, i3);
                this.A0W.A5V(formatA0A);
                return;
            case -356037306:
                if (str.equals(A01(50, 14, 37))) {
                    b = 20;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 6);
                strA02 = A01(RCHTTPStatusCodes.ERROR, 27, 63);
                strA03 = A01(283, 17, 56);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 95);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 94);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 44);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 27);
                        bArr = this.A0d;
                        if (bArr == null) {
                            listSingletonList = Collections.singletonList(bArr);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 118);
                        J1 j1A012 = J1.A00(new C0679Ij(this.A0d));
                        listSingletonList = j1A012.A04;
                        this.A0M = j1A012.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 71);
                        J7 j7A012 = J7.A00(new C0679Ij(this.A0d));
                        listSingletonList = j7A012.A01;
                        this.A0M = j7A012.A00;
                        break;
                    case 8:
                        Pair<String, List<byte[]>> pairA012 = A00(new C0679Ij(this.A0d));
                        strA04 = (String) pairA012.first;
                        listSingletonList = (List) pairA012.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 9);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 12);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 58);
                        i8 = 5760;
                        listSingletonList = new ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 54);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 21);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 42);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 58);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 15);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 105);
                        this.A0X = new Cz();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 77);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 57);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 33);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 89);
                        if (A05(new C0679Ij(this.A0d))) {
                            iA02 = C0695Iz.A02(this.A0A);
                            if (iA02 == 0) {
                                iA02 = -1;
                                strA04 = A01(853, 15, 23);
                                Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                            }
                        } else {
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, A01(RCHTTPStatusCodes.UNSUCCESSFUL, 51, 57) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 89);
                        iA02 = C0695Iz.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 40);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 78);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 29);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 25);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 5);
                        byte[] bArr14 = this.A0d;
                        listSingletonList = Collections.singletonList(new byte[]{bArr14[0], bArr14[1], bArr14[2], bArr14[3]});
                        break;
                    default:
                        throw new C0488Af(A01(470, 30, 42));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (C0672Ic.A09(strA04)) {
                    i3 = 1;
                    formatA0A = Format.A06(Integer.toString(i), strA04, null, -1, i8, this.A0B, this.A0O, iA02, listSingletonList, this.A0U, i2, this.A0g);
                } else {
                    if (C0672Ic.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            i6 = this.A0I;
                            if (i6 == -1) {
                                i6 = this.A0R;
                            }
                            this.A0I = i6;
                            i7 = this.A0G;
                            if (i7 == -1) {
                                i7 = this.A0J;
                            }
                            this.A0G = i7;
                        }
                        f = -1.0f;
                        i4 = this.A0I;
                        if (i4 != -1) {
                            f = (this.A0J * i4) / (this.A0R * i5);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = Format.A04(Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 40).equals(strA04)) {
                        i3 = 3;
                        formatA0A = Format.A01(Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 78).equals(strA04)) {
                        i3 = 3;
                        ArrayList arrayList13 = new ArrayList(2);
                        arrayList13.add(C1029We.A0t);
                        arrayList13.add(this.A0d);
                        formatA0A = Format.A09(Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList13);
                    } else {
                        if (!A01(675, 18, 29).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = Format.A0A(Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0537Ce.AFD(this.A0N, i3);
                this.A0W.A5V(formatA0A);
                return;
            case 62923557:
                if (str.equals(A01(22, 5, 52))) {
                    b = 12;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 6);
                strA02 = A01(RCHTTPStatusCodes.ERROR, 27, 63);
                strA03 = A01(283, 17, 56);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 95);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 94);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 44);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 27);
                        bArr = this.A0d;
                        if (bArr == null) {
                            listSingletonList = Collections.singletonList(bArr);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 118);
                        J1 j1A013 = J1.A00(new C0679Ij(this.A0d));
                        listSingletonList = j1A013.A04;
                        this.A0M = j1A013.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 71);
                        J7 j7A013 = J7.A00(new C0679Ij(this.A0d));
                        listSingletonList = j7A013.A01;
                        this.A0M = j7A013.A00;
                        break;
                    case 8:
                        Pair<String, List<byte[]>> pairA013 = A00(new C0679Ij(this.A0d));
                        strA04 = (String) pairA013.first;
                        listSingletonList = (List) pairA013.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 9);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 12);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 58);
                        i8 = 5760;
                        listSingletonList = new ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 54);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 21);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 42);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 58);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 15);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 105);
                        this.A0X = new Cz();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 77);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 57);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 33);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 89);
                        if (A05(new C0679Ij(this.A0d))) {
                            iA02 = C0695Iz.A02(this.A0A);
                            if (iA02 == 0) {
                                iA02 = -1;
                                strA04 = A01(853, 15, 23);
                                Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                            }
                        } else {
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, A01(RCHTTPStatusCodes.UNSUCCESSFUL, 51, 57) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 89);
                        iA02 = C0695Iz.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 40);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 78);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 29);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 25);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 5);
                        byte[] bArr15 = this.A0d;
                        listSingletonList = Collections.singletonList(new byte[]{bArr15[0], bArr15[1], bArr15[2], bArr15[3]});
                        break;
                    default:
                        throw new C0488Af(A01(470, 30, 42));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (C0672Ic.A09(strA04)) {
                    i3 = 1;
                    formatA0A = Format.A06(Integer.toString(i), strA04, null, -1, i8, this.A0B, this.A0O, iA02, listSingletonList, this.A0U, i2, this.A0g);
                } else {
                    if (C0672Ic.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            i6 = this.A0I;
                            if (i6 == -1) {
                                i6 = this.A0R;
                            }
                            this.A0I = i6;
                            i7 = this.A0G;
                            if (i7 == -1) {
                                i7 = this.A0J;
                            }
                            this.A0G = i7;
                        }
                        f = -1.0f;
                        i4 = this.A0I;
                        if (i4 != -1) {
                            f = (this.A0J * i4) / (this.A0R * i5);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = Format.A04(Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 40).equals(strA04)) {
                        i3 = 3;
                        formatA0A = Format.A01(Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 78).equals(strA04)) {
                        i3 = 3;
                        ArrayList arrayList14 = new ArrayList(2);
                        arrayList14.add(C1029We.A0t);
                        arrayList14.add(this.A0d);
                        formatA0A = Format.A09(Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList14);
                    } else {
                        if (!A01(675, 18, 29).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = Format.A0A(Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0537Ce.AFD(this.A0N, i3);
                this.A0W.A5V(formatA0A);
                return;
            case 62923603:
                if (A0i[6].charAt(13) == 'P') {
                    String[] strArr = A0i;
                    strArr[3] = "Ukhs2e9He";
                    strArr[1] = "urIa2HQBz";
                    if (str.equals(A01(27, 5, 84))) {
                        b = 15;
                    } else {
                        b = -1;
                    }
                    strA01 = A01(0, 22, 6);
                    strA02 = A01(RCHTTPStatusCodes.ERROR, 27, 63);
                    strA03 = A01(283, 17, 56);
                    switch (b) {
                        case 0:
                            strA04 = A01(959, 19, 95);
                            break;
                        case 1:
                            strA04 = A01(978, 19, 94);
                            break;
                        case 2:
                            strA04 = A01(923, 11, 44);
                            break;
                        case 3:
                        case 4:
                        case 5:
                            strA04 = A01(910, 13, 27);
                            bArr = this.A0d;
                            if (bArr == null) {
                                listSingletonList = Collections.singletonList(bArr);
                            } else {
                                listSingletonList = null;
                            }
                            break;
                        case 6:
                            strA04 = A01(891, 9, 118);
                            J1 j1A014 = J1.A00(new C0679Ij(this.A0d));
                            listSingletonList = j1A014.A04;
                            this.A0M = j1A014.A02;
                            break;
                        case 7:
                            strA04 = A01(900, 10, 71);
                            J7 j7A014 = J7.A00(new C0679Ij(this.A0d));
                            listSingletonList = j7A014.A01;
                            this.A0M = j7A014.A00;
                            break;
                        case 8:
                            Pair<String, List<byte[]>> pairA014 = A00(new C0679Ij(this.A0d));
                            strA04 = (String) pairA014.first;
                            listSingletonList = (List) pairA014.second;
                            break;
                        case 9:
                            strA04 = A01(944, 15, 9);
                            break;
                        case 10:
                            strA04 = A01(841, 12, 12);
                            i8 = 8192;
                            listSingletonList = A03(this.A0d);
                            break;
                        case 11:
                            strA04 = A01(780, 10, 58);
                            i8 = 5760;
                            listSingletonList = new ArrayList(3);
                            listSingletonList.add(this.A0d);
                            listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0S).array());
                            listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0T).array());
                            break;
                        case 12:
                            strA04 = A01(742, 15, 54);
                            listSingletonList = Collections.singletonList(this.A0d);
                            break;
                        case 13:
                            strA04 = A01(767, 13, 21);
                            i8 = 4096;
                            break;
                        case 14:
                            strA04 = A01(757, 10, 42);
                            i8 = 4096;
                            break;
                        case 15:
                            strA04 = A01(713, 9, 58);
                            break;
                        case 16:
                            strA04 = A01(722, 10, 15);
                            break;
                        case 17:
                            strA04 = A01(799, 13, 105);
                            this.A0X = new Cz();
                            break;
                        case 18:
                        case 19:
                            strA04 = A01(812, 13, 77);
                            break;
                        case 20:
                            strA04 = A01(825, 16, 57);
                            break;
                        case 21:
                            strA04 = A01(732, 10, 33);
                            listSingletonList = Collections.singletonList(this.A0d);
                            break;
                        case 22:
                            strA04 = A01(790, 9, 89);
                            if (A05(new C0679Ij(this.A0d))) {
                                iA02 = C0695Iz.A02(this.A0A);
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 23);
                                    Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            } else {
                                strA04 = A01(853, 15, 23);
                                Log.w(strA03, A01(RCHTTPStatusCodes.UNSUCCESSFUL, 51, 57) + strA04);
                            }
                            break;
                        case 23:
                            strA04 = A01(790, 9, 89);
                            iA02 = C0695Iz.A02(this.A0A);
                            if (iA02 == 0) {
                                iA02 = -1;
                                strA04 = A01(853, 15, 23);
                                Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                            }
                            break;
                        case 24:
                            strA04 = A01(693, 20, 40);
                            break;
                        case 25:
                            strA04 = A01(871, 10, 78);
                            break;
                        case 26:
                            strA04 = A01(675, 18, 29);
                            listSingletonList = Collections.singletonList(this.A0d);
                            break;
                        case 27:
                            strA04 = A01(660, 15, 25);
                            break;
                        case 28:
                            strA04 = A01(641, 19, 5);
                            byte[] bArr16 = this.A0d;
                            listSingletonList = Collections.singletonList(new byte[]{bArr16[0], bArr16[1], bArr16[2], bArr16[3]});
                            break;
                        default:
                            throw new C0488Af(A01(470, 30, 42));
                    }
                    i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                    if (C0672Ic.A09(strA04)) {
                        i3 = 1;
                        formatA0A = Format.A06(Integer.toString(i), strA04, null, -1, i8, this.A0B, this.A0O, iA02, listSingletonList, this.A0U, i2, this.A0g);
                    } else {
                        if (C0672Ic.A0B(strA04)) {
                            i3 = 2;
                            if (this.A0H == 0) {
                                i6 = this.A0I;
                                if (i6 == -1) {
                                    i6 = this.A0R;
                                }
                                this.A0I = i6;
                                i7 = this.A0G;
                                if (i7 == -1) {
                                    i7 = this.A0J;
                                }
                                this.A0G = i7;
                            }
                            f = -1.0f;
                            i4 = this.A0I;
                            if (i4 != -1) {
                                f = (this.A0J * i4) / (this.A0R * i5);
                            }
                            colorInfo = null;
                            if (this.A0b) {
                                colorInfo = new ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                            }
                            formatA0A = Format.A04(Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                        } else if (A01(693, 20, 40).equals(strA04)) {
                            i3 = 3;
                            formatA0A = Format.A01(Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                        } else if (A01(871, 10, 78).equals(strA04)) {
                            i3 = 3;
                            ArrayList arrayList15 = new ArrayList(2);
                            arrayList15.add(C1029We.A0t);
                            arrayList15.add(this.A0d);
                            formatA0A = Format.A09(Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList15);
                        } else {
                            if (!A01(675, 18, 29).equals(strA04)) {
                            }
                            i3 = 3;
                            formatA0A = Format.A0A(Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                        }
                        break;
                    }
                    this.A0W = interfaceC0537Ce.AFD(this.A0N, i3);
                    this.A0W.A5V(formatA0A);
                    return;
                }
                throw new RuntimeException();
            case 62927045:
                if (str.equals(A01(32, 5, 117))) {
                    b = 18;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 6);
                strA02 = A01(RCHTTPStatusCodes.ERROR, 27, 63);
                strA03 = A01(283, 17, 56);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 95);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 94);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 44);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 27);
                        bArr = this.A0d;
                        if (bArr == null) {
                            listSingletonList = Collections.singletonList(bArr);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 118);
                        J1 j1A015 = J1.A00(new C0679Ij(this.A0d));
                        listSingletonList = j1A015.A04;
                        this.A0M = j1A015.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 71);
                        J7 j7A015 = J7.A00(new C0679Ij(this.A0d));
                        listSingletonList = j7A015.A01;
                        this.A0M = j7A015.A00;
                        break;
                    case 8:
                        Pair<String, List<byte[]>> pairA015 = A00(new C0679Ij(this.A0d));
                        strA04 = (String) pairA015.first;
                        listSingletonList = (List) pairA015.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 9);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 12);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 58);
                        i8 = 5760;
                        listSingletonList = new ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 54);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 21);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 42);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 58);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 15);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 105);
                        this.A0X = new Cz();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 77);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 57);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 33);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 89);
                        if (A05(new C0679Ij(this.A0d))) {
                            iA02 = C0695Iz.A02(this.A0A);
                            if (iA02 == 0) {
                                iA02 = -1;
                                strA04 = A01(853, 15, 23);
                                Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                            }
                        } else {
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, A01(RCHTTPStatusCodes.UNSUCCESSFUL, 51, 57) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 89);
                        iA02 = C0695Iz.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 40);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 78);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 29);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 25);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 5);
                        byte[] bArr17 = this.A0d;
                        listSingletonList = Collections.singletonList(new byte[]{bArr17[0], bArr17[1], bArr17[2], bArr17[3]});
                        break;
                    default:
                        throw new C0488Af(A01(470, 30, 42));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (C0672Ic.A09(strA04)) {
                    i3 = 1;
                    formatA0A = Format.A06(Integer.toString(i), strA04, null, -1, i8, this.A0B, this.A0O, iA02, listSingletonList, this.A0U, i2, this.A0g);
                } else {
                    if (C0672Ic.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            i6 = this.A0I;
                            if (i6 == -1) {
                                i6 = this.A0R;
                            }
                            this.A0I = i6;
                            i7 = this.A0G;
                            if (i7 == -1) {
                                i7 = this.A0J;
                            }
                            this.A0G = i7;
                        }
                        f = -1.0f;
                        i4 = this.A0I;
                        if (i4 != -1) {
                            f = (this.A0J * i4) / (this.A0R * i5);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = Format.A04(Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 40).equals(strA04)) {
                        i3 = 3;
                        formatA0A = Format.A01(Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 78).equals(strA04)) {
                        i3 = 3;
                        ArrayList arrayList16 = new ArrayList(2);
                        arrayList16.add(C1029We.A0t);
                        arrayList16.add(this.A0d);
                        formatA0A = Format.A09(Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList16);
                    } else {
                        if (!A01(675, 18, 29).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = Format.A0A(Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0537Ce.AFD(this.A0N, i3);
                this.A0W.A5V(formatA0A);
                return;
            case 82338133:
                String[] strArr2 = A0i;
                if (strArr2[3].length() != strArr2[1].length()) {
                    String[] strArr3 = A0i;
                    strArr3[0] = "6Cqo4aoCEjad9Z";
                    strArr3[5] = "RbEUoam4";
                    if (str.equals(A01(631, 5, 0))) {
                        b = 0;
                    } else {
                        b = -1;
                    }
                } else {
                    String[] strArr4 = A0i;
                    strArr4[2] = "IUv";
                    strArr4[4] = "qa3iebjzqLzaYwS702tmfdQ29YziyfXr";
                    if (str.equals(A01(631, 5, 0))) {
                        b = 0;
                    } else {
                        b = -1;
                    }
                }
                strA01 = A01(0, 22, 6);
                strA02 = A01(RCHTTPStatusCodes.ERROR, 27, 63);
                strA03 = A01(283, 17, 56);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 95);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 94);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 44);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 27);
                        bArr = this.A0d;
                        if (bArr == null) {
                            listSingletonList = Collections.singletonList(bArr);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 118);
                        J1 j1A016 = J1.A00(new C0679Ij(this.A0d));
                        listSingletonList = j1A016.A04;
                        this.A0M = j1A016.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 71);
                        J7 j7A016 = J7.A00(new C0679Ij(this.A0d));
                        listSingletonList = j7A016.A01;
                        this.A0M = j7A016.A00;
                        break;
                    case 8:
                        Pair<String, List<byte[]>> pairA016 = A00(new C0679Ij(this.A0d));
                        strA04 = (String) pairA016.first;
                        listSingletonList = (List) pairA016.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 9);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 12);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 58);
                        i8 = 5760;
                        listSingletonList = new ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 54);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 21);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 42);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 58);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 15);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 105);
                        this.A0X = new Cz();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 77);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 57);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 33);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 89);
                        if (A05(new C0679Ij(this.A0d))) {
                            iA02 = C0695Iz.A02(this.A0A);
                            if (iA02 == 0) {
                                iA02 = -1;
                                strA04 = A01(853, 15, 23);
                                Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                            }
                        } else {
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, A01(RCHTTPStatusCodes.UNSUCCESSFUL, 51, 57) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 89);
                        iA02 = C0695Iz.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 40);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 78);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 29);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 25);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 5);
                        byte[] bArr18 = this.A0d;
                        listSingletonList = Collections.singletonList(new byte[]{bArr18[0], bArr18[1], bArr18[2], bArr18[3]});
                        break;
                    default:
                        throw new C0488Af(A01(470, 30, 42));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (C0672Ic.A09(strA04)) {
                    i3 = 1;
                    formatA0A = Format.A06(Integer.toString(i), strA04, null, -1, i8, this.A0B, this.A0O, iA02, listSingletonList, this.A0U, i2, this.A0g);
                } else {
                    if (C0672Ic.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            i6 = this.A0I;
                            if (i6 == -1) {
                                i6 = this.A0R;
                            }
                            this.A0I = i6;
                            i7 = this.A0G;
                            if (i7 == -1) {
                                i7 = this.A0J;
                            }
                            this.A0G = i7;
                        }
                        f = -1.0f;
                        i4 = this.A0I;
                        if (i4 != -1) {
                            f = (this.A0J * i4) / (this.A0R * i5);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = Format.A04(Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 40).equals(strA04)) {
                        i3 = 3;
                        formatA0A = Format.A01(Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 78).equals(strA04)) {
                        i3 = 3;
                        ArrayList arrayList17 = new ArrayList(2);
                        arrayList17.add(C1029We.A0t);
                        arrayList17.add(this.A0d);
                        formatA0A = Format.A09(Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList17);
                    } else {
                        if (!A01(675, 18, 29).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = Format.A0A(Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0537Ce.AFD(this.A0N, i3);
                this.A0W.A5V(formatA0A);
                return;
            case 82338134:
                if (str.equals(A01(636, 5, 61))) {
                    b = 1;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 6);
                strA02 = A01(RCHTTPStatusCodes.ERROR, 27, 63);
                strA03 = A01(283, 17, 56);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 95);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 94);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 44);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 27);
                        bArr = this.A0d;
                        if (bArr == null) {
                            listSingletonList = Collections.singletonList(bArr);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 118);
                        J1 j1A017 = J1.A00(new C0679Ij(this.A0d));
                        listSingletonList = j1A017.A04;
                        this.A0M = j1A017.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 71);
                        J7 j7A017 = J7.A00(new C0679Ij(this.A0d));
                        listSingletonList = j7A017.A01;
                        this.A0M = j7A017.A00;
                        break;
                    case 8:
                        Pair<String, List<byte[]>> pairA017 = A00(new C0679Ij(this.A0d));
                        strA04 = (String) pairA017.first;
                        listSingletonList = (List) pairA017.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 9);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 12);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 58);
                        i8 = 5760;
                        listSingletonList = new ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 54);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 21);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 42);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 58);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 15);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 105);
                        this.A0X = new Cz();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 77);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 57);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 33);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 89);
                        if (A05(new C0679Ij(this.A0d))) {
                            iA02 = C0695Iz.A02(this.A0A);
                            if (iA02 == 0) {
                                iA02 = -1;
                                strA04 = A01(853, 15, 23);
                                Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                            }
                        } else {
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, A01(RCHTTPStatusCodes.UNSUCCESSFUL, 51, 57) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 89);
                        iA02 = C0695Iz.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 40);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 78);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 29);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 25);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 5);
                        byte[] bArr19 = this.A0d;
                        listSingletonList = Collections.singletonList(new byte[]{bArr19[0], bArr19[1], bArr19[2], bArr19[3]});
                        break;
                    default:
                        throw new C0488Af(A01(470, 30, 42));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (C0672Ic.A09(strA04)) {
                    i3 = 1;
                    formatA0A = Format.A06(Integer.toString(i), strA04, null, -1, i8, this.A0B, this.A0O, iA02, listSingletonList, this.A0U, i2, this.A0g);
                } else {
                    if (C0672Ic.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            i6 = this.A0I;
                            if (i6 == -1) {
                                i6 = this.A0R;
                            }
                            this.A0I = i6;
                            i7 = this.A0G;
                            if (i7 == -1) {
                                i7 = this.A0J;
                            }
                            this.A0G = i7;
                        }
                        f = -1.0f;
                        i4 = this.A0I;
                        if (i4 != -1) {
                            f = (this.A0J * i4) / (this.A0R * i5);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = Format.A04(Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 40).equals(strA04)) {
                        i3 = 3;
                        formatA0A = Format.A01(Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 78).equals(strA04)) {
                        i3 = 3;
                        ArrayList arrayList18 = new ArrayList(2);
                        arrayList18.add(C1029We.A0t);
                        arrayList18.add(this.A0d);
                        formatA0A = Format.A09(Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList18);
                    } else {
                        if (!A01(675, 18, 29).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = Format.A0A(Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0537Ce.AFD(this.A0N, i3);
                this.A0W.A5V(formatA0A);
                return;
            case 99146302:
                if (str.equals(A01(359, 10, 96))) {
                    b = 27;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 6);
                strA02 = A01(RCHTTPStatusCodes.ERROR, 27, 63);
                strA03 = A01(283, 17, 56);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 95);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 94);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 44);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 27);
                        bArr = this.A0d;
                        if (bArr == null) {
                            listSingletonList = Collections.singletonList(bArr);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 118);
                        J1 j1A018 = J1.A00(new C0679Ij(this.A0d));
                        listSingletonList = j1A018.A04;
                        this.A0M = j1A018.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 71);
                        J7 j7A018 = J7.A00(new C0679Ij(this.A0d));
                        listSingletonList = j7A018.A01;
                        this.A0M = j7A018.A00;
                        break;
                    case 8:
                        Pair<String, List<byte[]>> pairA018 = A00(new C0679Ij(this.A0d));
                        strA04 = (String) pairA018.first;
                        listSingletonList = (List) pairA018.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 9);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 12);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 58);
                        i8 = 5760;
                        listSingletonList = new ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 54);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 21);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 42);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 58);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 15);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 105);
                        this.A0X = new Cz();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 77);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 57);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 33);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 89);
                        if (A05(new C0679Ij(this.A0d))) {
                            iA02 = C0695Iz.A02(this.A0A);
                            if (iA02 == 0) {
                                iA02 = -1;
                                strA04 = A01(853, 15, 23);
                                Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                            }
                        } else {
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, A01(RCHTTPStatusCodes.UNSUCCESSFUL, 51, 57) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 89);
                        iA02 = C0695Iz.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 40);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 78);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 29);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 25);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 5);
                        byte[] bArr110 = this.A0d;
                        listSingletonList = Collections.singletonList(new byte[]{bArr110[0], bArr110[1], bArr110[2], bArr110[3]});
                        break;
                    default:
                        throw new C0488Af(A01(470, 30, 42));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (C0672Ic.A09(strA04)) {
                    i3 = 1;
                    formatA0A = Format.A06(Integer.toString(i), strA04, null, -1, i8, this.A0B, this.A0O, iA02, listSingletonList, this.A0U, i2, this.A0g);
                } else {
                    if (C0672Ic.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            i6 = this.A0I;
                            if (i6 == -1) {
                                i6 = this.A0R;
                            }
                            this.A0I = i6;
                            i7 = this.A0G;
                            if (i7 == -1) {
                                i7 = this.A0J;
                            }
                            this.A0G = i7;
                        }
                        f = -1.0f;
                        i4 = this.A0I;
                        if (i4 != -1) {
                            f = (this.A0J * i4) / (this.A0R * i5);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = Format.A04(Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 40).equals(strA04)) {
                        i3 = 3;
                        formatA0A = Format.A01(Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 78).equals(strA04)) {
                        i3 = 3;
                        ArrayList arrayList19 = new ArrayList(2);
                        arrayList19.add(C1029We.A0t);
                        arrayList19.add(this.A0d);
                        formatA0A = Format.A09(Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList19);
                    } else {
                        if (!A01(675, 18, 29).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = Format.A0A(Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0537Ce.AFD(this.A0N, i3);
                this.A0W.A5V(formatA0A);
                return;
            case 444813526:
                if (str.equals(A01(623, 8, 69))) {
                    b = 9;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 6);
                strA02 = A01(RCHTTPStatusCodes.ERROR, 27, 63);
                strA03 = A01(283, 17, 56);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 95);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 94);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 44);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 27);
                        bArr = this.A0d;
                        if (bArr == null) {
                            listSingletonList = Collections.singletonList(bArr);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 118);
                        J1 j1A019 = J1.A00(new C0679Ij(this.A0d));
                        listSingletonList = j1A019.A04;
                        this.A0M = j1A019.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 71);
                        J7 j7A019 = J7.A00(new C0679Ij(this.A0d));
                        listSingletonList = j7A019.A01;
                        this.A0M = j7A019.A00;
                        break;
                    case 8:
                        Pair<String, List<byte[]>> pairA019 = A00(new C0679Ij(this.A0d));
                        strA04 = (String) pairA019.first;
                        listSingletonList = (List) pairA019.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 9);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 12);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 58);
                        i8 = 5760;
                        listSingletonList = new ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 54);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 21);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 42);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 58);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 15);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 105);
                        this.A0X = new Cz();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 77);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 57);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 33);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 89);
                        if (A05(new C0679Ij(this.A0d))) {
                            iA02 = C0695Iz.A02(this.A0A);
                            if (iA02 == 0) {
                                iA02 = -1;
                                strA04 = A01(853, 15, 23);
                                Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                            }
                        } else {
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, A01(RCHTTPStatusCodes.UNSUCCESSFUL, 51, 57) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 89);
                        iA02 = C0695Iz.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 40);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 78);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 29);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 25);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 5);
                        byte[] bArr111 = this.A0d;
                        listSingletonList = Collections.singletonList(new byte[]{bArr111[0], bArr111[1], bArr111[2], bArr111[3]});
                        break;
                    default:
                        throw new C0488Af(A01(470, 30, 42));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (C0672Ic.A09(strA04)) {
                    i3 = 1;
                    formatA0A = Format.A06(Integer.toString(i), strA04, null, -1, i8, this.A0B, this.A0O, iA02, listSingletonList, this.A0U, i2, this.A0g);
                } else {
                    if (C0672Ic.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            i6 = this.A0I;
                            if (i6 == -1) {
                                i6 = this.A0R;
                            }
                            this.A0I = i6;
                            i7 = this.A0G;
                            if (i7 == -1) {
                                i7 = this.A0J;
                            }
                            this.A0G = i7;
                        }
                        f = -1.0f;
                        i4 = this.A0I;
                        if (i4 != -1) {
                            f = (this.A0J * i4) / (this.A0R * i5);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = Format.A04(Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 40).equals(strA04)) {
                        i3 = 3;
                        formatA0A = Format.A01(Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 78).equals(strA04)) {
                        i3 = 3;
                        ArrayList arrayList110 = new ArrayList(2);
                        arrayList110.add(C1029We.A0t);
                        arrayList110.add(this.A0d);
                        formatA0A = Format.A09(Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList110);
                    } else {
                        if (!A01(675, 18, 29).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = Format.A0A(Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0537Ce.AFD(this.A0N, i3);
                this.A0W.A5V(formatA0A);
                return;
            case 542569478:
                String[] strArr5 = A0i;
                if (strArr5[0].length() != strArr5[5].length()) {
                    A0i[6] = "qG8zvSl11wlr3PyhmTIK5vu4A0XKpxa7";
                    if (str.equals(A01(37, 13, 3))) {
                        b = 19;
                    } else {
                        b = -1;
                    }
                    strA01 = A01(0, 22, 6);
                    strA02 = A01(RCHTTPStatusCodes.ERROR, 27, 63);
                    strA03 = A01(283, 17, 56);
                    switch (b) {
                        case 0:
                            strA04 = A01(959, 19, 95);
                            break;
                        case 1:
                            strA04 = A01(978, 19, 94);
                            break;
                        case 2:
                            strA04 = A01(923, 11, 44);
                            break;
                        case 3:
                        case 4:
                        case 5:
                            strA04 = A01(910, 13, 27);
                            bArr = this.A0d;
                            if (bArr == null) {
                                listSingletonList = Collections.singletonList(bArr);
                            } else {
                                listSingletonList = null;
                            }
                            break;
                        case 6:
                            strA04 = A01(891, 9, 118);
                            J1 j1A0110 = J1.A00(new C0679Ij(this.A0d));
                            listSingletonList = j1A0110.A04;
                            this.A0M = j1A0110.A02;
                            break;
                        case 7:
                            strA04 = A01(900, 10, 71);
                            J7 j7A0110 = J7.A00(new C0679Ij(this.A0d));
                            listSingletonList = j7A0110.A01;
                            this.A0M = j7A0110.A00;
                            break;
                        case 8:
                            Pair<String, List<byte[]>> pairA0110 = A00(new C0679Ij(this.A0d));
                            strA04 = (String) pairA0110.first;
                            listSingletonList = (List) pairA0110.second;
                            break;
                        case 9:
                            strA04 = A01(944, 15, 9);
                            break;
                        case 10:
                            strA04 = A01(841, 12, 12);
                            i8 = 8192;
                            listSingletonList = A03(this.A0d);
                            break;
                        case 11:
                            strA04 = A01(780, 10, 58);
                            i8 = 5760;
                            listSingletonList = new ArrayList(3);
                            listSingletonList.add(this.A0d);
                            listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0S).array());
                            listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0T).array());
                            break;
                        case 12:
                            strA04 = A01(742, 15, 54);
                            listSingletonList = Collections.singletonList(this.A0d);
                            break;
                        case 13:
                            strA04 = A01(767, 13, 21);
                            i8 = 4096;
                            break;
                        case 14:
                            strA04 = A01(757, 10, 42);
                            i8 = 4096;
                            break;
                        case 15:
                            strA04 = A01(713, 9, 58);
                            break;
                        case 16:
                            strA04 = A01(722, 10, 15);
                            break;
                        case 17:
                            strA04 = A01(799, 13, 105);
                            this.A0X = new Cz();
                            break;
                        case 18:
                        case 19:
                            strA04 = A01(812, 13, 77);
                            break;
                        case 20:
                            strA04 = A01(825, 16, 57);
                            break;
                        case 21:
                            strA04 = A01(732, 10, 33);
                            listSingletonList = Collections.singletonList(this.A0d);
                            break;
                        case 22:
                            strA04 = A01(790, 9, 89);
                            if (A05(new C0679Ij(this.A0d))) {
                                iA02 = C0695Iz.A02(this.A0A);
                                if (iA02 == 0) {
                                    iA02 = -1;
                                    strA04 = A01(853, 15, 23);
                                    Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                                }
                            } else {
                                strA04 = A01(853, 15, 23);
                                Log.w(strA03, A01(RCHTTPStatusCodes.UNSUCCESSFUL, 51, 57) + strA04);
                            }
                            break;
                        case 23:
                            strA04 = A01(790, 9, 89);
                            iA02 = C0695Iz.A02(this.A0A);
                            if (iA02 == 0) {
                                iA02 = -1;
                                strA04 = A01(853, 15, 23);
                                Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                            }
                            break;
                        case 24:
                            strA04 = A01(693, 20, 40);
                            break;
                        case 25:
                            strA04 = A01(871, 10, 78);
                            break;
                        case 26:
                            strA04 = A01(675, 18, 29);
                            listSingletonList = Collections.singletonList(this.A0d);
                            break;
                        case 27:
                            strA04 = A01(660, 15, 25);
                            break;
                        case 28:
                            strA04 = A01(641, 19, 5);
                            byte[] bArr112 = this.A0d;
                            listSingletonList = Collections.singletonList(new byte[]{bArr112[0], bArr112[1], bArr112[2], bArr112[3]});
                            break;
                        default:
                            throw new C0488Af(A01(470, 30, 42));
                    }
                    i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                    if (C0672Ic.A09(strA04)) {
                        i3 = 1;
                        formatA0A = Format.A06(Integer.toString(i), strA04, null, -1, i8, this.A0B, this.A0O, iA02, listSingletonList, this.A0U, i2, this.A0g);
                    } else {
                        if (C0672Ic.A0B(strA04)) {
                            i3 = 2;
                            if (this.A0H == 0) {
                                i6 = this.A0I;
                                if (i6 == -1) {
                                    i6 = this.A0R;
                                }
                                this.A0I = i6;
                                i7 = this.A0G;
                                if (i7 == -1) {
                                    i7 = this.A0J;
                                }
                                this.A0G = i7;
                            }
                            f = -1.0f;
                            i4 = this.A0I;
                            if (i4 != -1) {
                                f = (this.A0J * i4) / (this.A0R * i5);
                            }
                            colorInfo = null;
                            if (this.A0b) {
                                colorInfo = new ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                            }
                            formatA0A = Format.A04(Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                        } else if (A01(693, 20, 40).equals(strA04)) {
                            i3 = 3;
                            formatA0A = Format.A01(Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                        } else if (A01(871, 10, 78).equals(strA04)) {
                            i3 = 3;
                            ArrayList arrayList111 = new ArrayList(2);
                            arrayList111.add(C1029We.A0t);
                            arrayList111.add(this.A0d);
                            formatA0A = Format.A09(Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList111);
                        } else {
                            if (!A01(675, 18, 29).equals(strA04)) {
                            }
                            i3 = 3;
                            formatA0A = Format.A0A(Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                        }
                        break;
                    }
                    this.A0W = interfaceC0537Ce.AFD(this.A0N, i3);
                    this.A0W.A5V(formatA0A);
                    return;
                }
                throw new RuntimeException();
            case 725957860:
                if (str.equals(A01(108, 13, 55))) {
                    b = 23;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 6);
                strA02 = A01(RCHTTPStatusCodes.ERROR, 27, 63);
                strA03 = A01(283, 17, 56);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 95);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 94);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 44);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 27);
                        bArr = this.A0d;
                        if (bArr == null) {
                            listSingletonList = Collections.singletonList(bArr);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 118);
                        J1 j1A0111 = J1.A00(new C0679Ij(this.A0d));
                        listSingletonList = j1A0111.A04;
                        this.A0M = j1A0111.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 71);
                        J7 j7A0111 = J7.A00(new C0679Ij(this.A0d));
                        listSingletonList = j7A0111.A01;
                        this.A0M = j7A0111.A00;
                        break;
                    case 8:
                        Pair<String, List<byte[]>> pairA0111 = A00(new C0679Ij(this.A0d));
                        strA04 = (String) pairA0111.first;
                        listSingletonList = (List) pairA0111.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 9);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 12);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 58);
                        i8 = 5760;
                        listSingletonList = new ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 54);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 21);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 42);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 58);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 15);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 105);
                        this.A0X = new Cz();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 77);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 57);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 33);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 89);
                        if (A05(new C0679Ij(this.A0d))) {
                            iA02 = C0695Iz.A02(this.A0A);
                            if (iA02 == 0) {
                                iA02 = -1;
                                strA04 = A01(853, 15, 23);
                                Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                            }
                        } else {
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, A01(RCHTTPStatusCodes.UNSUCCESSFUL, 51, 57) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 89);
                        iA02 = C0695Iz.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 40);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 78);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 29);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 25);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 5);
                        byte[] bArr113 = this.A0d;
                        listSingletonList = Collections.singletonList(new byte[]{bArr113[0], bArr113[1], bArr113[2], bArr113[3]});
                        break;
                    default:
                        throw new C0488Af(A01(470, 30, 42));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (C0672Ic.A09(strA04)) {
                    i3 = 1;
                    formatA0A = Format.A06(Integer.toString(i), strA04, null, -1, i8, this.A0B, this.A0O, iA02, listSingletonList, this.A0U, i2, this.A0g);
                } else {
                    if (C0672Ic.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            i6 = this.A0I;
                            if (i6 == -1) {
                                i6 = this.A0R;
                            }
                            this.A0I = i6;
                            i7 = this.A0G;
                            if (i7 == -1) {
                                i7 = this.A0J;
                            }
                            this.A0G = i7;
                        }
                        f = -1.0f;
                        i4 = this.A0I;
                        if (i4 != -1) {
                            f = (this.A0J * i4) / (this.A0R * i5);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = Format.A04(Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 40).equals(strA04)) {
                        i3 = 3;
                        formatA0A = Format.A01(Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 78).equals(strA04)) {
                        i3 = 3;
                        ArrayList arrayList112 = new ArrayList(2);
                        arrayList112.add(C1029We.A0t);
                        arrayList112.add(this.A0d);
                        formatA0A = Format.A09(Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList112);
                    } else {
                        if (!A01(675, 18, 29).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = Format.A0A(Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0537Ce.AFD(this.A0N, i3);
                this.A0W.A5V(formatA0A);
                return;
            case 738597099:
                if (str.equals(A01(369, 10, 94))) {
                    b = 25;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 6);
                strA02 = A01(RCHTTPStatusCodes.ERROR, 27, 63);
                strA03 = A01(283, 17, 56);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 95);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 94);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 44);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 27);
                        bArr = this.A0d;
                        if (bArr == null) {
                            listSingletonList = Collections.singletonList(bArr);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 118);
                        J1 j1A0112 = J1.A00(new C0679Ij(this.A0d));
                        listSingletonList = j1A0112.A04;
                        this.A0M = j1A0112.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 71);
                        J7 j7A0112 = J7.A00(new C0679Ij(this.A0d));
                        listSingletonList = j7A0112.A01;
                        this.A0M = j7A0112.A00;
                        break;
                    case 8:
                        Pair<String, List<byte[]>> pairA0112 = A00(new C0679Ij(this.A0d));
                        strA04 = (String) pairA0112.first;
                        listSingletonList = (List) pairA0112.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 9);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 12);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 58);
                        i8 = 5760;
                        listSingletonList = new ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 54);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 21);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 42);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 58);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 15);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 105);
                        this.A0X = new Cz();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 77);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 57);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 33);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 89);
                        if (A05(new C0679Ij(this.A0d))) {
                            iA02 = C0695Iz.A02(this.A0A);
                            if (iA02 == 0) {
                                iA02 = -1;
                                strA04 = A01(853, 15, 23);
                                Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                            }
                        } else {
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, A01(RCHTTPStatusCodes.UNSUCCESSFUL, 51, 57) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 89);
                        iA02 = C0695Iz.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 40);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 78);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 29);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 25);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 5);
                        byte[] bArr114 = this.A0d;
                        listSingletonList = Collections.singletonList(new byte[]{bArr114[0], bArr114[1], bArr114[2], bArr114[3]});
                        break;
                    default:
                        throw new C0488Af(A01(470, 30, 42));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (C0672Ic.A09(strA04)) {
                    i3 = 1;
                    formatA0A = Format.A06(Integer.toString(i), strA04, null, -1, i8, this.A0B, this.A0O, iA02, listSingletonList, this.A0U, i2, this.A0g);
                } else {
                    if (C0672Ic.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            i6 = this.A0I;
                            if (i6 == -1) {
                                i6 = this.A0R;
                            }
                            this.A0I = i6;
                            i7 = this.A0G;
                            if (i7 == -1) {
                                i7 = this.A0J;
                            }
                            this.A0G = i7;
                        }
                        f = -1.0f;
                        i4 = this.A0I;
                        if (i4 != -1) {
                            f = (this.A0J * i4) / (this.A0R * i5);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = Format.A04(Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 40).equals(strA04)) {
                        i3 = 3;
                        formatA0A = Format.A01(Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 78).equals(strA04)) {
                        i3 = 3;
                        ArrayList arrayList113 = new ArrayList(2);
                        arrayList113.add(C1029We.A0t);
                        arrayList113.add(this.A0d);
                        formatA0A = Format.A09(Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList113);
                    } else {
                        if (!A01(675, 18, 29).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = Format.A0A(Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0537Ce.AFD(this.A0N, i3);
                this.A0W.A5V(formatA0A);
                return;
            case 855502857:
                if (str.equals(A01(592, 16, 48))) {
                    b = 7;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 6);
                strA02 = A01(RCHTTPStatusCodes.ERROR, 27, 63);
                strA03 = A01(283, 17, 56);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 95);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 94);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 44);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 27);
                        bArr = this.A0d;
                        if (bArr == null) {
                            listSingletonList = Collections.singletonList(bArr);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 118);
                        J1 j1A0113 = J1.A00(new C0679Ij(this.A0d));
                        listSingletonList = j1A0113.A04;
                        this.A0M = j1A0113.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 71);
                        J7 j7A0113 = J7.A00(new C0679Ij(this.A0d));
                        listSingletonList = j7A0113.A01;
                        this.A0M = j7A0113.A00;
                        break;
                    case 8:
                        Pair<String, List<byte[]>> pairA0113 = A00(new C0679Ij(this.A0d));
                        strA04 = (String) pairA0113.first;
                        listSingletonList = (List) pairA0113.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 9);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 12);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 58);
                        i8 = 5760;
                        listSingletonList = new ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 54);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 21);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 42);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 58);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 15);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 105);
                        this.A0X = new Cz();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 77);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 57);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 33);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 89);
                        if (A05(new C0679Ij(this.A0d))) {
                            iA02 = C0695Iz.A02(this.A0A);
                            if (iA02 == 0) {
                                iA02 = -1;
                                strA04 = A01(853, 15, 23);
                                Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                            }
                        } else {
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, A01(RCHTTPStatusCodes.UNSUCCESSFUL, 51, 57) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 89);
                        iA02 = C0695Iz.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 40);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 78);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 29);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 25);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 5);
                        byte[] bArr115 = this.A0d;
                        listSingletonList = Collections.singletonList(new byte[]{bArr115[0], bArr115[1], bArr115[2], bArr115[3]});
                        break;
                    default:
                        throw new C0488Af(A01(470, 30, 42));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (C0672Ic.A09(strA04)) {
                    i3 = 1;
                    formatA0A = Format.A06(Integer.toString(i), strA04, null, -1, i8, this.A0B, this.A0O, iA02, listSingletonList, this.A0U, i2, this.A0g);
                } else {
                    if (C0672Ic.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            i6 = this.A0I;
                            if (i6 == -1) {
                                i6 = this.A0R;
                            }
                            this.A0I = i6;
                            i7 = this.A0G;
                            if (i7 == -1) {
                                i7 = this.A0J;
                            }
                            this.A0G = i7;
                        }
                        f = -1.0f;
                        i4 = this.A0I;
                        if (i4 != -1) {
                            f = (this.A0J * i4) / (this.A0R * i5);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = Format.A04(Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 40).equals(strA04)) {
                        i3 = 3;
                        formatA0A = Format.A01(Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 78).equals(strA04)) {
                        i3 = 3;
                        ArrayList arrayList114 = new ArrayList(2);
                        arrayList114.add(C1029We.A0t);
                        arrayList114.add(this.A0d);
                        formatA0A = Format.A09(Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList114);
                    } else {
                        if (!A01(675, 18, 29).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = Format.A0A(Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0537Ce.AFD(this.A0N, i3);
                this.A0W.A5V(formatA0A);
                return;
            case 1422270023:
                if (str.equals(A01(379, 11, 2))) {
                    b = 24;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 6);
                strA02 = A01(RCHTTPStatusCodes.ERROR, 27, 63);
                strA03 = A01(283, 17, 56);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 95);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 94);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 44);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 27);
                        bArr = this.A0d;
                        if (bArr == null) {
                            listSingletonList = Collections.singletonList(bArr);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 118);
                        J1 j1A0114 = J1.A00(new C0679Ij(this.A0d));
                        listSingletonList = j1A0114.A04;
                        this.A0M = j1A0114.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 71);
                        J7 j7A0114 = J7.A00(new C0679Ij(this.A0d));
                        listSingletonList = j7A0114.A01;
                        this.A0M = j7A0114.A00;
                        break;
                    case 8:
                        Pair<String, List<byte[]>> pairA0114 = A00(new C0679Ij(this.A0d));
                        strA04 = (String) pairA0114.first;
                        listSingletonList = (List) pairA0114.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 9);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 12);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 58);
                        i8 = 5760;
                        listSingletonList = new ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 54);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 21);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 42);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 58);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 15);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 105);
                        this.A0X = new Cz();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 77);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 57);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 33);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 89);
                        if (A05(new C0679Ij(this.A0d))) {
                            iA02 = C0695Iz.A02(this.A0A);
                            if (iA02 == 0) {
                                iA02 = -1;
                                strA04 = A01(853, 15, 23);
                                Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                            }
                        } else {
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, A01(RCHTTPStatusCodes.UNSUCCESSFUL, 51, 57) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 89);
                        iA02 = C0695Iz.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 40);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 78);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 29);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 25);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 5);
                        byte[] bArr116 = this.A0d;
                        listSingletonList = Collections.singletonList(new byte[]{bArr116[0], bArr116[1], bArr116[2], bArr116[3]});
                        break;
                    default:
                        throw new C0488Af(A01(470, 30, 42));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (C0672Ic.A09(strA04)) {
                    i3 = 1;
                    formatA0A = Format.A06(Integer.toString(i), strA04, null, -1, i8, this.A0B, this.A0O, iA02, listSingletonList, this.A0U, i2, this.A0g);
                } else {
                    if (C0672Ic.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            i6 = this.A0I;
                            if (i6 == -1) {
                                i6 = this.A0R;
                            }
                            this.A0I = i6;
                            i7 = this.A0G;
                            if (i7 == -1) {
                                i7 = this.A0J;
                            }
                            this.A0G = i7;
                        }
                        f = -1.0f;
                        i4 = this.A0I;
                        if (i4 != -1) {
                            f = (this.A0J * i4) / (this.A0R * i5);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = Format.A04(Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 40).equals(strA04)) {
                        i3 = 3;
                        formatA0A = Format.A01(Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 78).equals(strA04)) {
                        i3 = 3;
                        ArrayList arrayList115 = new ArrayList(2);
                        arrayList115.add(C1029We.A0t);
                        arrayList115.add(this.A0d);
                        formatA0A = Format.A09(Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList115);
                    } else {
                        if (!A01(675, 18, 29).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = Format.A0A(Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0537Ce.AFD(this.A0N, i3);
                this.A0W.A5V(formatA0A);
                return;
            case 1809237540:
                if (str.equals(A01(527, 7, 22))) {
                    b = 2;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 6);
                strA02 = A01(RCHTTPStatusCodes.ERROR, 27, 63);
                strA03 = A01(283, 17, 56);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 95);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 94);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 44);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 27);
                        bArr = this.A0d;
                        if (bArr == null) {
                            listSingletonList = Collections.singletonList(bArr);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 118);
                        J1 j1A0115 = J1.A00(new C0679Ij(this.A0d));
                        listSingletonList = j1A0115.A04;
                        this.A0M = j1A0115.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 71);
                        J7 j7A0115 = J7.A00(new C0679Ij(this.A0d));
                        listSingletonList = j7A0115.A01;
                        this.A0M = j7A0115.A00;
                        break;
                    case 8:
                        Pair<String, List<byte[]>> pairA0115 = A00(new C0679Ij(this.A0d));
                        strA04 = (String) pairA0115.first;
                        listSingletonList = (List) pairA0115.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 9);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 12);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 58);
                        i8 = 5760;
                        listSingletonList = new ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 54);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 21);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 42);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 58);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 15);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 105);
                        this.A0X = new Cz();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 77);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 57);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 33);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 89);
                        if (A05(new C0679Ij(this.A0d))) {
                            iA02 = C0695Iz.A02(this.A0A);
                            if (iA02 == 0) {
                                iA02 = -1;
                                strA04 = A01(853, 15, 23);
                                Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                            }
                        } else {
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, A01(RCHTTPStatusCodes.UNSUCCESSFUL, 51, 57) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 89);
                        iA02 = C0695Iz.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 40);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 78);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 29);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 25);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 5);
                        byte[] bArr117 = this.A0d;
                        listSingletonList = Collections.singletonList(new byte[]{bArr117[0], bArr117[1], bArr117[2], bArr117[3]});
                        break;
                    default:
                        throw new C0488Af(A01(470, 30, 42));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (C0672Ic.A09(strA04)) {
                    i3 = 1;
                    formatA0A = Format.A06(Integer.toString(i), strA04, null, -1, i8, this.A0B, this.A0O, iA02, listSingletonList, this.A0U, i2, this.A0g);
                } else {
                    if (C0672Ic.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            i6 = this.A0I;
                            if (i6 == -1) {
                                i6 = this.A0R;
                            }
                            this.A0I = i6;
                            i7 = this.A0G;
                            if (i7 == -1) {
                                i7 = this.A0J;
                            }
                            this.A0G = i7;
                        }
                        f = -1.0f;
                        i4 = this.A0I;
                        if (i4 != -1) {
                            f = (this.A0J * i4) / (this.A0R * i5);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = Format.A04(Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 40).equals(strA04)) {
                        i3 = 3;
                        formatA0A = Format.A01(Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 78).equals(strA04)) {
                        i3 = 3;
                        ArrayList arrayList116 = new ArrayList(2);
                        arrayList116.add(C1029We.A0t);
                        arrayList116.add(this.A0d);
                        formatA0A = Format.A09(Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList116);
                    } else {
                        if (!A01(675, 18, 29).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = Format.A0A(Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0537Ce.AFD(this.A0N, i3);
                this.A0W.A5V(formatA0A);
                return;
            case 1950749482:
                if (str.equals(A01(64, 6, 22))) {
                    b = 16;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 6);
                strA02 = A01(RCHTTPStatusCodes.ERROR, 27, 63);
                strA03 = A01(283, 17, 56);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 95);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 94);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 44);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 27);
                        bArr = this.A0d;
                        if (bArr == null) {
                            listSingletonList = Collections.singletonList(bArr);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 118);
                        J1 j1A0116 = J1.A00(new C0679Ij(this.A0d));
                        listSingletonList = j1A0116.A04;
                        this.A0M = j1A0116.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 71);
                        J7 j7A0116 = J7.A00(new C0679Ij(this.A0d));
                        listSingletonList = j7A0116.A01;
                        this.A0M = j7A0116.A00;
                        break;
                    case 8:
                        Pair<String, List<byte[]>> pairA0116 = A00(new C0679Ij(this.A0d));
                        strA04 = (String) pairA0116.first;
                        listSingletonList = (List) pairA0116.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 9);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 12);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 58);
                        i8 = 5760;
                        listSingletonList = new ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 54);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 21);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 42);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 58);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 15);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 105);
                        this.A0X = new Cz();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 77);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 57);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 33);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 89);
                        if (A05(new C0679Ij(this.A0d))) {
                            iA02 = C0695Iz.A02(this.A0A);
                            if (iA02 == 0) {
                                iA02 = -1;
                                strA04 = A01(853, 15, 23);
                                Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                            }
                        } else {
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, A01(RCHTTPStatusCodes.UNSUCCESSFUL, 51, 57) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 89);
                        iA02 = C0695Iz.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 40);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 78);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 29);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 25);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 5);
                        byte[] bArr118 = this.A0d;
                        listSingletonList = Collections.singletonList(new byte[]{bArr118[0], bArr118[1], bArr118[2], bArr118[3]});
                        break;
                    default:
                        throw new C0488Af(A01(470, 30, 42));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (C0672Ic.A09(strA04)) {
                    i3 = 1;
                    formatA0A = Format.A06(Integer.toString(i), strA04, null, -1, i8, this.A0B, this.A0O, iA02, listSingletonList, this.A0U, i2, this.A0g);
                } else {
                    if (C0672Ic.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            i6 = this.A0I;
                            if (i6 == -1) {
                                i6 = this.A0R;
                            }
                            this.A0I = i6;
                            i7 = this.A0G;
                            if (i7 == -1) {
                                i7 = this.A0J;
                            }
                            this.A0G = i7;
                        }
                        f = -1.0f;
                        i4 = this.A0I;
                        if (i4 != -1) {
                            f = (this.A0J * i4) / (this.A0R * i5);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = Format.A04(Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 40).equals(strA04)) {
                        i3 = 3;
                        formatA0A = Format.A01(Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 78).equals(strA04)) {
                        i3 = 3;
                        ArrayList arrayList117 = new ArrayList(2);
                        arrayList117.add(C1029We.A0t);
                        arrayList117.add(this.A0d);
                        formatA0A = Format.A09(Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList117);
                    } else {
                        if (!A01(675, 18, 29).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = Format.A0A(Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0537Ce.AFD(this.A0N, i3);
                this.A0W.A5V(formatA0A);
                return;
            case 1950789798:
                if (str.equals(A01(70, 6, 86))) {
                    b = 21;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 6);
                strA02 = A01(RCHTTPStatusCodes.ERROR, 27, 63);
                strA03 = A01(283, 17, 56);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 95);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 94);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 44);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 27);
                        bArr = this.A0d;
                        if (bArr == null) {
                            listSingletonList = Collections.singletonList(bArr);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 118);
                        J1 j1A0117 = J1.A00(new C0679Ij(this.A0d));
                        listSingletonList = j1A0117.A04;
                        this.A0M = j1A0117.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 71);
                        J7 j7A0117 = J7.A00(new C0679Ij(this.A0d));
                        listSingletonList = j7A0117.A01;
                        this.A0M = j7A0117.A00;
                        break;
                    case 8:
                        Pair<String, List<byte[]>> pairA0117 = A00(new C0679Ij(this.A0d));
                        strA04 = (String) pairA0117.first;
                        listSingletonList = (List) pairA0117.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 9);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 12);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 58);
                        i8 = 5760;
                        listSingletonList = new ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 54);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 21);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 42);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 58);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 15);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 105);
                        this.A0X = new Cz();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 77);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 57);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 33);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 89);
                        if (A05(new C0679Ij(this.A0d))) {
                            iA02 = C0695Iz.A02(this.A0A);
                            if (iA02 == 0) {
                                iA02 = -1;
                                strA04 = A01(853, 15, 23);
                                Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                            }
                        } else {
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, A01(RCHTTPStatusCodes.UNSUCCESSFUL, 51, 57) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 89);
                        iA02 = C0695Iz.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 40);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 78);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 29);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 25);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 5);
                        byte[] bArr119 = this.A0d;
                        listSingletonList = Collections.singletonList(new byte[]{bArr119[0], bArr119[1], bArr119[2], bArr119[3]});
                        break;
                    default:
                        throw new C0488Af(A01(470, 30, 42));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (C0672Ic.A09(strA04)) {
                    i3 = 1;
                    formatA0A = Format.A06(Integer.toString(i), strA04, null, -1, i8, this.A0B, this.A0O, iA02, listSingletonList, this.A0U, i2, this.A0g);
                } else {
                    if (C0672Ic.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            i6 = this.A0I;
                            if (i6 == -1) {
                                i6 = this.A0R;
                            }
                            this.A0I = i6;
                            i7 = this.A0G;
                            if (i7 == -1) {
                                i7 = this.A0J;
                            }
                            this.A0G = i7;
                        }
                        f = -1.0f;
                        i4 = this.A0I;
                        if (i4 != -1) {
                            f = (this.A0J * i4) / (this.A0R * i5);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = Format.A04(Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 40).equals(strA04)) {
                        i3 = 3;
                        formatA0A = Format.A01(Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 78).equals(strA04)) {
                        i3 = 3;
                        ArrayList arrayList118 = new ArrayList(2);
                        arrayList118.add(C1029We.A0t);
                        arrayList118.add(this.A0d);
                        formatA0A = Format.A09(Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList118);
                    } else {
                        if (!A01(675, 18, 29).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = Format.A0A(Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0537Ce.AFD(this.A0N, i3);
                this.A0W.A5V(formatA0A);
                return;
            case 1951062397:
                if (str.equals(A01(102, 6, 74))) {
                    b = 11;
                } else {
                    b = -1;
                }
                strA01 = A01(0, 22, 6);
                strA02 = A01(RCHTTPStatusCodes.ERROR, 27, 63);
                strA03 = A01(283, 17, 56);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 95);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 94);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 44);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 27);
                        bArr = this.A0d;
                        if (bArr == null) {
                            listSingletonList = Collections.singletonList(bArr);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 118);
                        J1 j1A0118 = J1.A00(new C0679Ij(this.A0d));
                        listSingletonList = j1A0118.A04;
                        this.A0M = j1A0118.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 71);
                        J7 j7A0118 = J7.A00(new C0679Ij(this.A0d));
                        listSingletonList = j7A0118.A01;
                        this.A0M = j7A0118.A00;
                        break;
                    case 8:
                        Pair<String, List<byte[]>> pairA0118 = A00(new C0679Ij(this.A0d));
                        strA04 = (String) pairA0118.first;
                        listSingletonList = (List) pairA0118.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 9);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 12);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 58);
                        i8 = 5760;
                        listSingletonList = new ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 54);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 21);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 42);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 58);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 15);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 105);
                        this.A0X = new Cz();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 77);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 57);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 33);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 89);
                        if (A05(new C0679Ij(this.A0d))) {
                            iA02 = C0695Iz.A02(this.A0A);
                            if (iA02 == 0) {
                                iA02 = -1;
                                strA04 = A01(853, 15, 23);
                                Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                            }
                        } else {
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, A01(RCHTTPStatusCodes.UNSUCCESSFUL, 51, 57) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 89);
                        iA02 = C0695Iz.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 40);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 78);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 29);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 25);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 5);
                        byte[] bArr1110 = this.A0d;
                        listSingletonList = Collections.singletonList(new byte[]{bArr1110[0], bArr1110[1], bArr1110[2], bArr1110[3]});
                        break;
                    default:
                        throw new C0488Af(A01(470, 30, 42));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (C0672Ic.A09(strA04)) {
                    i3 = 1;
                    formatA0A = Format.A06(Integer.toString(i), strA04, null, -1, i8, this.A0B, this.A0O, iA02, listSingletonList, this.A0U, i2, this.A0g);
                } else {
                    if (C0672Ic.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            i6 = this.A0I;
                            if (i6 == -1) {
                                i6 = this.A0R;
                            }
                            this.A0I = i6;
                            i7 = this.A0G;
                            if (i7 == -1) {
                                i7 = this.A0J;
                            }
                            this.A0G = i7;
                        }
                        f = -1.0f;
                        i4 = this.A0I;
                        if (i4 != -1) {
                            f = (this.A0J * i4) / (this.A0R * i5);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = Format.A04(Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 40).equals(strA04)) {
                        i3 = 3;
                        formatA0A = Format.A01(Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 78).equals(strA04)) {
                        i3 = 3;
                        ArrayList arrayList119 = new ArrayList(2);
                        arrayList119.add(C1029We.A0t);
                        arrayList119.add(this.A0d);
                        formatA0A = Format.A09(Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList119);
                    } else {
                        if (!A01(675, 18, 29).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = Format.A0A(Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0537Ce.AFD(this.A0N, i3);
                this.A0W.A5V(formatA0A);
                return;
            default:
                b = -1;
                strA01 = A01(0, 22, 6);
                strA02 = A01(RCHTTPStatusCodes.ERROR, 27, 63);
                strA03 = A01(283, 17, 56);
                switch (b) {
                    case 0:
                        strA04 = A01(959, 19, 95);
                        break;
                    case 1:
                        strA04 = A01(978, 19, 94);
                        break;
                    case 2:
                        strA04 = A01(923, 11, 44);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strA04 = A01(910, 13, 27);
                        bArr = this.A0d;
                        if (bArr == null) {
                            listSingletonList = Collections.singletonList(bArr);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 6:
                        strA04 = A01(891, 9, 118);
                        J1 j1A0119 = J1.A00(new C0679Ij(this.A0d));
                        listSingletonList = j1A0119.A04;
                        this.A0M = j1A0119.A02;
                        break;
                    case 7:
                        strA04 = A01(900, 10, 71);
                        J7 j7A0119 = J7.A00(new C0679Ij(this.A0d));
                        listSingletonList = j7A0119.A01;
                        this.A0M = j7A0119.A00;
                        break;
                    case 8:
                        Pair<String, List<byte[]>> pairA0119 = A00(new C0679Ij(this.A0d));
                        strA04 = (String) pairA0119.first;
                        listSingletonList = (List) pairA0119.second;
                        break;
                    case 9:
                        strA04 = A01(944, 15, 9);
                        break;
                    case 10:
                        strA04 = A01(841, 12, 12);
                        i8 = 8192;
                        listSingletonList = A03(this.A0d);
                        break;
                    case 11:
                        strA04 = A01(780, 10, 58);
                        i8 = 5760;
                        listSingletonList = new ArrayList(3);
                        listSingletonList.add(this.A0d);
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0S).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0T).array());
                        break;
                    case 12:
                        strA04 = A01(742, 15, 54);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 13:
                        strA04 = A01(767, 13, 21);
                        i8 = 4096;
                        break;
                    case 14:
                        strA04 = A01(757, 10, 42);
                        i8 = 4096;
                        break;
                    case 15:
                        strA04 = A01(713, 9, 58);
                        break;
                    case 16:
                        strA04 = A01(722, 10, 15);
                        break;
                    case 17:
                        strA04 = A01(799, 13, 105);
                        this.A0X = new Cz();
                        break;
                    case 18:
                    case 19:
                        strA04 = A01(812, 13, 77);
                        break;
                    case 20:
                        strA04 = A01(825, 16, 57);
                        break;
                    case 21:
                        strA04 = A01(732, 10, 33);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 22:
                        strA04 = A01(790, 9, 89);
                        if (A05(new C0679Ij(this.A0d))) {
                            iA02 = C0695Iz.A02(this.A0A);
                            if (iA02 == 0) {
                                iA02 = -1;
                                strA04 = A01(853, 15, 23);
                                Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                            }
                        } else {
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, A01(RCHTTPStatusCodes.UNSUCCESSFUL, 51, 57) + strA04);
                        }
                        break;
                    case 23:
                        strA04 = A01(790, 9, 89);
                        iA02 = C0695Iz.A02(this.A0A);
                        if (iA02 == 0) {
                            iA02 = -1;
                            strA04 = A01(853, 15, 23);
                            Log.w(strA03, strA02 + this.A0A + strA01 + strA04);
                        }
                        break;
                    case 24:
                        strA04 = A01(693, 20, 40);
                        break;
                    case 25:
                        strA04 = A01(871, 10, 78);
                        break;
                    case 26:
                        strA04 = A01(675, 18, 29);
                        listSingletonList = Collections.singletonList(this.A0d);
                        break;
                    case 27:
                        strA04 = A01(660, 15, 25);
                        break;
                    case 28:
                        strA04 = A01(641, 19, 5);
                        byte[] bArr1111 = this.A0d;
                        listSingletonList = Collections.singletonList(new byte[]{bArr1111[0], bArr1111[1], bArr1111[2], bArr1111[3]});
                        break;
                    default:
                        throw new C0488Af(A01(470, 30, 42));
                }
                i2 = 0 | (this.A0Z ? 1 : 0) | (this.A0a ? 2 : 0);
                if (C0672Ic.A09(strA04)) {
                    i3 = 1;
                    formatA0A = Format.A06(Integer.toString(i), strA04, null, -1, i8, this.A0B, this.A0O, iA02, listSingletonList, this.A0U, i2, this.A0g);
                } else {
                    if (C0672Ic.A0B(strA04)) {
                        i3 = 2;
                        if (this.A0H == 0) {
                            i6 = this.A0I;
                            if (i6 == -1) {
                                i6 = this.A0R;
                            }
                            this.A0I = i6;
                            i7 = this.A0G;
                            if (i7 == -1) {
                                i7 = this.A0J;
                            }
                            this.A0G = i7;
                        }
                        f = -1.0f;
                        i4 = this.A0I;
                        if (i4 != -1) {
                            f = (this.A0J * i4) / (this.A0R * i5);
                        }
                        colorInfo = null;
                        if (this.A0b) {
                            colorInfo = new ColorInfo(this.A0D, this.A0C, this.A0E, A06());
                        }
                        formatA0A = Format.A04(Integer.toString(i), strA04, null, -1, i8, this.A0R, this.A0J, -1.0f, listSingletonList, -1, f, this.A0e, this.A0P, colorInfo, this.A0U);
                    } else if (A01(693, 20, 40).equals(strA04)) {
                        i3 = 3;
                        formatA0A = Format.A01(Integer.toString(i), strA04, i2, this.A0g, this.A0U);
                    } else if (A01(871, 10, 78).equals(strA04)) {
                        i3 = 3;
                        ArrayList arrayList1110 = new ArrayList(2);
                        arrayList1110.add(C1029We.A0t);
                        arrayList1110.add(this.A0d);
                        formatA0A = Format.A09(Integer.toString(i), strA04, null, -1, i2, this.A0g, -1, this.A0U, Long.MAX_VALUE, arrayList1110);
                    } else {
                        if (!A01(675, 18, 29).equals(strA04)) {
                        }
                        i3 = 3;
                        formatA0A = Format.A0A(Integer.toString(i), strA04, null, -1, i2, listSingletonList, this.A0g, this.A0U);
                    }
                    break;
                }
                this.A0W = interfaceC0537Ce.AFD(this.A0N, i3);
                this.A0W.A5V(formatA0A);
                return;
        }
    }
}
