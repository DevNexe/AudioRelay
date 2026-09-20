package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Semaphore;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.e2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@SuppressLint({"BadMethodUse-java.lang.String.length"})
public final class C1372e2 implements AnonymousClass00 {
    public static byte[] A09;
    public static String[] A0A = {"2hmAfzTadn", "1uDqsMr9wv4o5ZghfCOZg4FuDp7sllqp", "nT1KYDstdBBAZ5nN", "UVqk4rMzzgqbiyaJgpoGMOUy0jQCoEBq", "ewXxsmpHr", "rT44HeCpkJQ", "C3kiv90mrVS0BL1BSM5Dfu9lHf0n3Csl", "grgxNBq6hb"};
    public static final String A0B;
    public final int A00;
    public final int A01;
    public final AnonymousClass08 A02;
    public final C0L A04;
    public final C8U A05;
    public final boolean A08;
    public final Map<String, File> A06 = Collections.synchronizedMap(new HashMap());
    public final Map<String, Semaphore> A07 = new HashMap();
    public final C0A A03 = new C0A();

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            int i5 = bArrCopyOfRange[i4] - i3;
            String[] strArr = A0A;
            if (strArr[5].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[5] = "m9U6X0moZlc";
            strArr2[7] = "IfCNkNm6kG";
            bArrCopyOfRange[i4] = (byte) (i5 - 76);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A09 = new byte[]{-105, -33, -40, -22, -105, -39, -36, -36, -27, -105, -32, -27, -21, -36, -23, -23, -20, -25, -21, -36, -37, -91, -63, -75, -5, -2, 1, -6, -75, -8, 1, -6, -10, 3, -6, -7, -49, -75, -125, 117, -106, -55, -55, -70, -62, -59, -55, -113, 117, -7, 23, 25, 30, 31, 36, 29, -42, 28, 31, 34, 27, -42, 25, 37, 35, 38, 34, 27, 42, 27, -42, 4, 34, 36, 41, 42, 47, 40, -31, 39, 42, 45, 38, -31, 47, 48, 53, -31, 36, 48, 46, 49, 45, 38, 53, 38, -31, -91, -61, -59, -54, -53, -48, -55, -126, -47, -56, -126, -32, -2, 11, -60, 17, -67, 0, 9, 12, 16, 2, -67, 0, -2, 0, 5, 2, -67, 3, 6, 9, 2, -53, -80, -50, -37, -108, -31, -115, -33, -46, -50, -47, -115, -50, -32, -32, -46, -31, -32, -101, -69, -39, -26, -97, -20, -104, -22, -35, -39, -36, -104, -28, -35, -26, -33, -20, -32, -104, -25, -34, -104, -72, -39, -32, -39, -24, -35, -30, -37, -108, -41, -43, -41, -36, -39, -108, -38, -35, -32, -39, -108, -43, -38, -24, -39, -26, -108, -39, -20, -41, -39, -39, -40, -35, -30, -37, -108, -26, -39, -24, -26, -19, -108, -43, -24, -24, -39, -31, -28, -24, -25, -82, -108, -43, 2, 2, -1, 2, -80, -13, -15, -13, -8, -7, -2, -9, -80, 4, -8, -11, -80, -10, -7, -4, -11, -54, -9, -9, -12, -9, -91, -24, -15, -22, -26, -13, -18, -13, -20, -91, -21, -18, -15, -22, -72, -27, -27, -30, -27, -109, -42, -33, -30, -26, -36, -31, -38, -109, -26, -30, -24, -27, -42, -40, -72, -35, -46, -34, -36, -33, -37, -44, -29, -44, -113, -31, -44, -30, -33, -34, -35, -30, -44, -99, -65, -35, -28, -44, -39, -46, -117, -33, -38, -117, -35, -48, -52, -49, -117, -73, -70, -60, -51, -125, -68, -65, -62, -69, -125, -71, -73, -71, -66, -69, -18, 0, 0, -14, 1, -57, -68, -68, -68, 5, 8, 11, 4, -39, -50, -50, -50, 0, 13, 3, 17, 14, 8, 3, -2, 0, 18, 18, 4, 19, -50};
        String[] strArr = A0A;
        if (strArr[1].charAt(5) == strArr[3].charAt(5)) {
            throw new RuntimeException();
        }
        A0A[6] = "1YrvosXM8zHw8wsMUb3ulJ8Xgx5scBHO";
    }

    static {
        A04();
        A0B = C1372e2.class.getSimpleName();
    }

    public C1372e2(C8U c8u, AnonymousClass08 anonymousClass08, C0L c0l) {
        this.A05 = c8u;
        this.A08 = anonymousClass08.A02();
        this.A00 = anonymousClass08.A00();
        this.A04 = c0l;
        this.A01 = anonymousClass08.A01();
        this.A02 = anonymousClass08;
    }

    public static C0K A00(Context context, String str) throws C0H {
        try {
            InputStream inputStreamOpen = context.getAssets().open(str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStreamOpen.read(bArr, 0, bArr.length);
                if (i != -1) {
                    byteArrayOutputStream.write(bArr, 0, i);
                } else {
                    return new C1370e0(byteArrayOutputStream.toByteArray());
                }
            }
        } catch (IOException e) {
            throw new C0H(A03(131, 18, 33), e);
        }
    }

    public static File A01(Context context) {
        return new File(context.getCacheDir(), A03(318, 15, 10));
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0101: INVOKE 
  (r9v1 ?? I:com.facebook.ads.redexgen.X.0L)
  (r10 I:java.lang.String)
  (r11 I:int)
  (r12 I:java.lang.String)
  (r13 I:java.lang.Long)
  (r14 I:java.lang.Long)
  (r15 I:com.facebook.ads.redexgen.X.06)
 INTERFACE call: com.facebook.ads.redexgen.X.0L.ADf(java.lang.String, int, java.lang.String, java.lang.Long, java.lang.Long, com.facebook.ads.redexgen.X.06):void A[MD:(java.lang.String, int, java.lang.String, java.lang.Long, java.lang.Long, com.facebook.ads.redexgen.X.06):void (m)], block:B:40:0x00f6 */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x011b: INVOKE 
  (r9v0 ?? I:com.facebook.ads.redexgen.X.0L)
  (r10 I:java.lang.String)
  (r11 I:int)
  (r12 I:java.lang.String)
  (r13 I:java.lang.Long)
  (r14 I:java.lang.Long)
  (r15 I:com.facebook.ads.redexgen.X.06)
 INTERFACE call: com.facebook.ads.redexgen.X.0L.ADf(java.lang.String, int, java.lang.String, java.lang.Long, java.lang.Long, com.facebook.ads.redexgen.X.06):void A[MD:(java.lang.String, int, java.lang.String, java.lang.Long, java.lang.Long, com.facebook.ads.redexgen.X.06):void (m)], block:B:46:0x0110 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0100: MOVE (r15 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:75008), block:B:40:0x00f6 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x011a: MOVE (r15 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:75015), block:B:46:0x0110 */
    @Nullable
    private File A02(AnonymousClass06 anonymousClass06, String str, String str2, int i, AnonymousClass09 anonymousClass09) throws Throwable {
        AnonymousClass06 anonymousClass07;
        String strADf;
        AnonymousClass06 anonymousClass08;
        String strADf2;
        C1368dy c1368dy;
        String strA03 = A03(222, 22, 68);
        try {
            String str3 = str;
            long jCurrentTimeMillis = System.currentTimeMillis();
            File file = new File(A01(this.A05), str2);
            C1368dy c1368dy2 = new C1368dy(file, new GJ(JR.A0L(this.A05)));
            if (c1368dy2.A09()) {
                if (this.A08) {
                    String str4 = A03(49, 22, 106) + c1368dy2.A00.getName();
                }
                this.A06.put(str3, file);
                c1368dy2.A06();
                this.A04.ADg(str3, true, anonymousClass06);
                return file;
            }
            if (this.A08) {
                String str5 = A03(71, 26, 117) + c1368dy2.A00.getName();
            }
            if (!anonymousClass09.A04()) {
                return null;
            }
            int i2 = 0;
            this.A04.ADg(str3, false, anonymousClass06);
            while (i2 < this.A00) {
                try {
                    str3 = str3;
                    c1368dy = c1368dy2;
                    try {
                        A05(this.A05, c1368dy2, str3, i, i2, jCurrentTimeMillis);
                        int iA03 = c1368dy.A03();
                        c1368dy.A06();
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        anonymousClass09.A00().A4B(file, this.A04);
                        this.A06.put(str3, file);
                        this.A04.ADf(str3, 2112, null, Long.valueOf(iA03), Long.valueOf(jCurrentTimeMillis2), anonymousClass06);
                        return file;
                    } catch (C0H e) {
                        e = e;
                        if (i2 == this.A00 - 1) {
                            A06(c1368dy);
                            if (!(e instanceof C1369dz)) {
                                if (e instanceof C1366dw) {
                                    throw ((C1366dw) e);
                                }
                            } else {
                                throw ((C1369dz) e);
                            }
                        }
                        i2++;
                        c1368dy2 = c1368dy;
                    }
                } catch (C0H e2) {
                    e = e2;
                    c1368dy = c1368dy2;
                }
            }
            c1368dy = c1368dy2;
            int iA04 = c1368dy.A03();
            c1368dy.A06();
            long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis;
            anonymousClass09.A00().A4B(file, this.A04);
            this.A06.put(str3, file);
            this.A04.ADf(str3, 2112, null, Long.valueOf(iA04), Long.valueOf(jCurrentTimeMillis3), anonymousClass06);
            return file;
        } catch (C1366dw e3) {
            this.A04.ADf(strADf2, 2113, e3.toString(), null, null, anonymousClass08);
            if (this.A08) {
                Log.e(A0B, strA03, e3);
                return null;
            }
            return null;
        } catch (C1369dz e4) {
            this.A04.ADf(strADf, 2119, e4.toString(), null, null, anonymousClass07);
            if (this.A08) {
                Log.e(A0B, strA03, e4);
                return null;
            }
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:20:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:23:0x00af  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b1 A[Catch: all -> 0x0114, 0H -> 0x0117, TRY_ENTER, TryCatch #11 {0H -> 0x0117, blocks: (B:12:0x0079, B:34:0x00f9, B:40:0x010c, B:32:0x00f3, B:24:0x00b1, B:26:0x00b9), top: B:107:0x0079 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x00b9 A[Catch: all -> 0x0114, 0H -> 0x0117, TryCatch #11 {0H -> 0x0117, blocks: (B:12:0x0079, B:34:0x00f9, B:40:0x010c, B:32:0x00f3, B:24:0x00b1, B:26:0x00b9), top: B:107:0x0079 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00e5 A[Catch: all -> 0x0185, 0H -> 0x0187, TRY_ENTER, TryCatch #12 {0H -> 0x0187, blocks: (B:9:0x0051, B:15:0x0085, B:38:0x0106, B:45:0x0119, B:35:0x00fd, B:37:0x0103, B:29:0x00e5, B:30:0x00ec), top: B:105:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00f3 A[Catch: all -> 0x0114, 0H -> 0x0117, LOOP:0: B:30:0x00ec->B:32:0x00f3, LOOP_END, TRY_ENTER, TryCatch #11 {0H -> 0x0117, blocks: (B:12:0x0079, B:34:0x00f9, B:40:0x010c, B:32:0x00f3, B:24:0x00b1, B:26:0x00b9), top: B:107:0x0079 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00f9 A[ADDED_TO_REGION, Catch: all -> 0x0114, 0H -> 0x0117, REMOVE, TRY_LEAVE, TryCatch #11 {0H -> 0x0117, blocks: (B:12:0x0079, B:34:0x00f9, B:40:0x010c, B:32:0x00f3, B:24:0x00b1, B:26:0x00b9), top: B:107:0x0079 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00fd A[Catch: all -> 0x0185, 0H -> 0x0187, TRY_ENTER, TryCatch #12 {0H -> 0x0187, blocks: (B:9:0x0051, B:15:0x0085, B:38:0x0106, B:45:0x0119, B:35:0x00fd, B:37:0x0103, B:29:0x00e5, B:30:0x00ec), top: B:105:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x010c A[Catch: all -> 0x0114, 0H -> 0x0117, TRY_ENTER, TRY_LEAVE, TryCatch #11 {0H -> 0x0117, blocks: (B:12:0x0079, B:34:0x00f9, B:40:0x010c, B:32:0x00f3, B:24:0x00b1, B:26:0x00b9), top: B:107:0x0079 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x017f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0190 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:26:0x00b9, please report this as an issue */
    private void A05(Context context, C1368dy c1368dy, String str, int i, int i2, long j) throws Throwable {
        C0K source;
        int iA06;
        int iA03;
        int length;
        String[] strArr;
        boolean z;
        boolean zA07;
        boolean cleaned;
        byte[] bArr;
        int i3;
        int iA07;
        String strA03 = A03(263, 20, 39);
        String strA04 = A03(342, 22, 83);
        if (str.startsWith(strA04)) {
            source = A00(context, str.substring(strA04.length()));
        } else {
            String strA05 = A03(333, 9, 65);
            if (str.startsWith(strA05)) {
                source = A00(context, str.substring(strA05.length()));
            } else {
                source = new C1367dx(str, i);
            }
        }
        try {
            if (this.A08) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(A03(303, 15, 31));
                    sb.append(str);
                    sb.append(A03(38, 11, 9));
                    try {
                        sb.append(i2);
                        sb.toString();
                        iA03 = c1368dy.A03();
                        length = source.length();
                        strArr = A0A;
                        if (strArr[1].charAt(5) != strArr[3].charAt(5)) {
                            A0A[2] = "n0eTbeye3Ey2Tfwh";
                            if (length < 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                zA07 = A07(c1368dy);
                                cleaned = this.A08;
                                if (cleaned) {
                                    String str2 = A03(149, 21, 44) + str + A03(22, 16, 73) + zA07;
                                }
                            }
                            try {
                                try {
                                    if (!z || iA03 < length) {
                                        source.ACx(iA03);
                                        bArr = new byte[8192];
                                        while (true) {
                                            i3 = source.read(bArr);
                                            if (i3 == -1) {
                                                break;
                                            } else {
                                                c1368dy.A08(bArr, i3);
                                            }
                                        }
                                        if (!z || c1368dy.A03() == length) {
                                            c1368dy.A07();
                                            iA07 = 0;
                                            if (source instanceof C1367dx) {
                                                iA07 = ((C1367dx) source).A06();
                                            }
                                            InterfaceC04568y interfaceC04568yA06 = this.A05.A06();
                                            long jCurrentTimeMillis = System.currentTimeMillis() - j;
                                            int code = c1368dy.A03();
                                            interfaceC04568yA06.A98(j, jCurrentTimeMillis, code, 0L, iA07, null);
                                            source.close();
                                            return;
                                        }
                                        throw new C1369dz(A03(283, 20, 35));
                                    }
                                    source.close();
                                    return;
                                } catch (C0H | IllegalArgumentException e) {
                                    boolean z2 = this.A08;
                                    if (A0A[2].length() != 16) {
                                        String[] strArr2 = A0A;
                                        strArr2[0] = "sKSAzhUNLb";
                                        strArr2[4] = "43RjYHHya";
                                        if (!z2) {
                                            return;
                                        }
                                    } else {
                                        String[] strArr3 = A0A;
                                        strArr3[5] = "7y2GhQHRLD5";
                                        strArr3[7] = "DFE965U4Kh";
                                        if (!z2) {
                                            return;
                                        }
                                    }
                                    Log.e(A0B, strA03, e);
                                    return;
                                }
                                if (!z) {
                                    c1368dy.A07();
                                } else {
                                    throw new C1369dz(A03(283, 20, 35));
                                }
                                iA07 = 0;
                                if (source instanceof C1367dx) {
                                    iA07 = ((C1367dx) source).A06();
                                }
                                InterfaceC04568y interfaceC04568yA07 = this.A05.A06();
                                long jCurrentTimeMillis2 = System.currentTimeMillis() - j;
                                int code2 = c1368dy.A03();
                                interfaceC04568yA07.A98(j, jCurrentTimeMillis2, code2, 0L, iA07, null);
                            } catch (C0H e2) {
                                e = e2;
                            }
                        } else {
                            throw new RuntimeException();
                        }
                    } catch (C0H e3) {
                        e = e3;
                    }
                } catch (C0H e4) {
                    e = e4;
                }
                iA06 = 0;
                if (source instanceof C1367dx) {
                    iA06 = ((C1367dx) source).A06();
                }
                try {
                    this.A05.A06().A98(j, System.currentTimeMillis() - j, 0L, 0L, iA06, null);
                    throw e;
                } catch (Throwable th) {
                    th = th;
                }
            } else {
                iA03 = c1368dy.A03();
                length = source.length();
                strArr = A0A;
                if (strArr[1].charAt(5) != strArr[3].charAt(5)) {
                    A0A[2] = "n0eTbeye3Ey2Tfwh";
                    if (length < 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        zA07 = A07(c1368dy);
                        cleaned = this.A08;
                        if (cleaned) {
                            String str3 = A03(149, 21, 44) + str + A03(22, 16, 73) + zA07;
                        }
                    }
                    if (!z) {
                        source.ACx(iA03);
                        bArr = new byte[8192];
                        while (true) {
                            i3 = source.read(bArr);
                            if (i3 == -1) {
                                break;
                            } else {
                                c1368dy.A08(bArr, i3);
                            }
                        }
                        if (!z) {
                            c1368dy.A07();
                        } else {
                            throw new C1369dz(A03(283, 20, 35));
                        }
                        iA07 = 0;
                        if (source instanceof C1367dx) {
                            iA07 = ((C1367dx) source).A06();
                        }
                        InterfaceC04568y interfaceC04568yA08 = this.A05.A06();
                        long jCurrentTimeMillis3 = System.currentTimeMillis() - j;
                        int code3 = c1368dy.A03();
                        interfaceC04568yA08.A98(j, jCurrentTimeMillis3, code3, 0L, iA07, null);
                        source.close();
                        return;
                    }
                    source.ACx(iA03);
                    bArr = new byte[8192];
                    while (true) {
                        i3 = source.read(bArr);
                        if (i3 == -1) {
                            break;
                        } else {
                            c1368dy.A08(bArr, i3);
                        }
                    }
                    if (!z) {
                        c1368dy.A07();
                    } else {
                        throw new C1369dz(A03(283, 20, 35));
                    }
                    iA07 = 0;
                    if (source instanceof C1367dx) {
                        iA07 = ((C1367dx) source).A06();
                    }
                    InterfaceC04568y interfaceC04568yA09 = this.A05.A06();
                    long jCurrentTimeMillis4 = System.currentTimeMillis() - j;
                    int code4 = c1368dy.A03();
                    interfaceC04568yA09.A98(j, jCurrentTimeMillis4, code4, 0L, iA07, null);
                    source.close();
                    return;
                    if (!z) {
                        c1368dy.A07();
                    } else {
                        throw new C1369dz(A03(283, 20, 35));
                    }
                    iA07 = 0;
                    if (source instanceof C1367dx) {
                        iA07 = ((C1367dx) source).A06();
                    }
                    InterfaceC04568y interfaceC04568yA010 = this.A05.A06();
                    long jCurrentTimeMillis5 = System.currentTimeMillis() - j;
                    int code5 = c1368dy.A03();
                    interfaceC04568yA010.A98(j, jCurrentTimeMillis5, code5, 0L, iA07, null);
                    source.close();
                    return;
                }
                throw new RuntimeException();
                iA06 = 0;
                if (source instanceof C1367dx) {
                    iA06 = ((C1367dx) source).A06();
                }
                this.A05.A06().A98(j, System.currentTimeMillis() - j, 0L, 0L, iA06, null);
                throw e;
            }
        } catch (C0H e5) {
            e = e5;
        }
        try {
            source.close();
        } catch (C0H | IllegalArgumentException e6) {
            if (this.A08) {
                Log.e(A0B, strA03, e6);
            }
        }
        throw th;
    }

    @SuppressLint({"CatchGeneralException"})
    private void A06(C1368dy c1368dy) {
        try {
            File fileA04 = c1368dy.A04();
            if (fileA04.exists()) {
                c1368dy.A06();
                boolean zDelete = fileA04.delete();
                if (this.A08) {
                    Log.i(A0B, A03(170, 52, 40) + zDelete);
                }
            }
        } catch (Exception e) {
            if (this.A08) {
                Log.e(A0B, A03(108, 23, 81), e);
            }
        }
    }

    private boolean A07(C1368dy c1368dy) {
        try {
            c1368dy.A05();
            if (A0A[6].charAt(7) == 'U') {
                throw new RuntimeException();
            }
            A0A[6] = "AEs2mSbxTVyMZvMH4XlDgcN9VznTkYzp";
            return true;
        } catch (C1366dw e) {
            if (this.A08) {
                Log.e(A0B, A03(244, 19, 57), e);
                return false;
            }
            return false;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.09 != com.facebook.ads.cache.config.CacheRequestConfig<T> */
    public final <T> AnonymousClass02<T> A08(AnonymousClass06 anonymousClass06, AnonymousClass09<T> anonymousClass09) {
        Semaphore semaphore;
        if (anonymousClass09.A03()) {
            File file = this.A06.get(anonymousClass06.A09);
            if (file != null) {
                this.A04.ADg(anonymousClass06.A09, true, anonymousClass06);
                return anonymousClass09.A00().A3A(file, this.A04);
            }
            this.A04.ADg(anonymousClass06.A09, false, anonymousClass06);
            return new AnonymousClass02<>(false, null);
        }
        String str = anonymousClass06.A09;
        String extension = anonymousClass06.A04;
        String str2 = this.A03.A03(str) + extension;
        synchronized (this.A07) {
            semaphore = this.A07.get(str2);
            if (semaphore == null) {
                semaphore = new Semaphore(1);
                this.A07.put(str2, semaphore);
            }
            try {
            } catch (Throwable th) {
                semaphore.release();
                synchronized (this.A07) {
                    this.A07.remove(str2);
                    throw th;
                }
            }
        }
        try {
            semaphore.acquire();
            File fileA02 = A02(anonymousClass06, str, str2, this.A01, anonymousClass09);
            if (fileA02 != null) {
                AnonymousClass02<T> anonymousClass02A3A = anonymousClass09.A00().A3A(fileA02, this.A04);
                semaphore.release();
                synchronized (this.A07) {
                    this.A07.remove(str2);
                }
                return anonymousClass02A3A;
            }
            AnonymousClass02<T> anonymousClass02 = new AnonymousClass02<>(false, null);
            semaphore.release();
            synchronized (this.A07) {
                this.A07.remove(str2);
            }
            return anonymousClass02;
        } catch (InterruptedException unused) {
            if (this.A08) {
                String str3 = A03(97, 11, 22) + str + A03(0, 22, 43);
            }
            AnonymousClass02<T> anonymousClass03 = new AnonymousClass02<>(false, null);
            semaphore.release();
            synchronized (this.A07) {
                this.A07.remove(str2);
                return anonymousClass03;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass00
    public final AnonymousClass02<Bitmap> AE6(AnonymousClass06 anonymousClass06, boolean z) {
        return A08(anonymousClass06, new AnonymousClass09(new C1375e5(anonymousClass06.A01, anonymousClass06.A00, this.A02.A04(), this.A02.A03(), z)));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.09 != com.facebook.ads.cache.config.CacheRequestConfig<java.io.File> */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass00
    @Nullable
    public final File AE7(AnonymousClass06 anonymousClass06) {
        AnonymousClass09 anonymousClass09 = new AnonymousClass09(new C1374e4());
        anonymousClass09.A01(true);
        anonymousClass09.A02(false);
        return (File) A08(anonymousClass06, anonymousClass09).A00();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass00
    @Nullable
    public final String AE8(AnonymousClass06 anonymousClass06) {
        return (String) A08(anonymousClass06, new AnonymousClass09(new C1373e3())).A00();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.09 != com.facebook.ads.cache.config.CacheRequestConfig<java.lang.String> */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass00
    @Nullable
    public final String AE9(AnonymousClass06 anonymousClass06) {
        AnonymousClass09 anonymousClass09 = new AnonymousClass09(new C1373e3());
        anonymousClass09.A01(true);
        anonymousClass09.A02(false);
        return (String) A08(anonymousClass06, anonymousClass09).A00();
    }
}
