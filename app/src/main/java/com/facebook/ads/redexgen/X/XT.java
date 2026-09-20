package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64OutputStream;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.DeflaterOutputStream;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class XT implements C9T {

    @Nullable
    public static PackageInfo A03;
    public static EnumC0757Lm A04;

    @Nullable
    public static String A05;
    public static boolean A06;
    public static byte[] A07;
    public static String[] A08 = {"rjWu3o3XUIKJimpXtRLH", "N3hUjd9gC1zTrolrzHWDwio6K0KaeF7v", "V8BOZxTrBek9nlJry76rEN1tEiA1lgnf", "2kaCuDD1e44XjFqxj97oS3bW7Y4jUXps", "VcJxC1jbHxk7XwGyeCWvHwY9E4qRcx1x", "dO6RHNbAuKw0kDbwpnJR", "8jPNINbp0cYAxxIn", "ugIdyp1aSJPFHYCiUHctz2XPYC5YD6Ud"};
    public static final C0T[] A09;
    public static final AtomicBoolean A0A;
    public static final AtomicInteger A0B;
    public final AnonymousClass66 A00;
    public final C8U A01;
    public final AnonymousClass99 A02;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A08[6].length() == 9) {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[1] = "AJGqtkftO03LFXDJsHlFXR4ujVWNfKsn";
            strArr[7] = "0weTThgY8dzMPuXGgH30KJvXs1017h9U";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 73);
            i4++;
        }
    }

    public static void A08() {
        A07 = new byte[]{40, 13, 21, 23, 23, 17, 7, 7, 29, 22, 29, 24, 29, 0, 13, 11, 17, 26, 21, 22, 24, 17, 16, 41, 46, 56, 45, 42, 60, 87, 98, 109, 98, 111, 108, 100, 85, 68, 68, 75, 89, 93, 90, 75, 71, 80, 95, 75, 66, 81, 70, 71, 93, 91, 90, 78, 92, 71, 78, 92, 44, 62, 36, 41, 86, 67, 67, 69, 94, 85, 66, 67, 94, 88, 89, 72, 94, 83, 106, 97, 108, 108, 109, 122, 119, 124, 103, 99, 109, 102, 119, 109, 112, 124, 122, 105, 123, 62, 41, 50, 56, 48, 57, 79, 77, 92, 92, 73, 72, 83, 69, 72, 95, 21, 23, 4, 4, 31, 19, 4, 67, 70, 83, 70, 88, 87, 85, 72, 68, 66, 84, 84, 78, 73, 64, 88, 72, 87, 83, 78, 72, 73, 84, 92, 89, 76, 89, 71, 72, 74, 87, 91, 93, 75, 75, 81, 86, 95, 71, 87, 72, 76, 81, 87, 86, 75, 71, 91, 87, 77, 86, 76, 74, 65, 111, 106, 127, 106, 116, 123, 121, 100, 104, 110, 120, 120, 98, 101, 108, 116, 100, 123, 127, 98, 100, 101, 120, 116, 120, 127, 106, 127, 110, 28, 29, 22, 11, 17, 12, 1, 13, 30, 5, 5, 14, 7, 20, 8, 4, 25, 14, 20, 14, 29, 14, 5, 31, 24, 48, 35, 56, 56, 51, 58, 41, 58, 57, 49, 49, 51, 50, 30, 57, 49, 52, 61, 60, 120, 44, 55, 120, 58, 45, 49, 52, 60, 120, 45, 43, 61, 42, 120, 44, 55, 51, 61, 54, 95, 86, 68, 72, 82, 79, 88, 71, 91, 86, 78, 82, 69, 52, 57, 59, 60, 48, 61, 38, 58, 56, 58, 49, 60, 38, 45, 42, 38, 52, 42, 37, 40, 51, 63, 35, 57, 62, 47, 41, 47, 40, 53, 50, 39, 42, 42, 35, 52, 75, 72, 68, 70, 75, 66, 109, 97, 107, 101, 5, 13, 12, 1, 9, 28, 1, 7, 6, 23, 27, 13, 26, 30, 1, 11, 13, 72, 67, 82, 81, 73, 84, 77, 89, 82, 95, 86, 67, 64, 76, 90, 67, 90, 92, 80, 90, 92, 74, 93, 80, 70, 75, 15, 18, 18, 9, 24, 25, 96, 102, 116, 109, 116, 112, 109, 115, 98, 98, 109, 123, 124, 97, 102, 115, 126, 126, 119, 118, 96, 102, 116, 109, 116, 112, 109, 115, 98, 98, 109, 100, 119, 96, 97, 123, 125, 124, 63, 47, 62, 41, 41, 34, 51, 36, 41, 37, 43, 36, 56, 127, 111, 126, 105, 105, 98, 115, 123, 101, 104, 120, 100, 53, 34, 45, 57, 37, 39, 54, 39, 36, 47, 42, 47, 50, 63, 28, 10, 28, 28, 6, 0, 1, 16, 27, 6, 2, 10, 70, 93, 90, 71, 74, 34, 36, 50, 37, 40, 54, 48, 50, 57, 35, 66, 85, 88, 68, 85, 70, 85, 89, 71, 127, 125, 118, 125, 106, 113, 123, 53, 46, 55, 55};
    }

    static {
        A08();
        A0A = new AtomicBoolean();
        A0B = new AtomicInteger(0);
        A05 = null;
        A06 = false;
        A09 = new C0T[]{C0T.A10, C0T.A0e, C0T.A11, C0T.A19, C0T.A0v, C0T.A0x, C0T.A1v, C0T.A1w, C0T.A1x};
    }

    public XT(C8U c8u, boolean z, AnonymousClass66 anonymousClass66) {
        this.A01 = c8u;
        this.A02 = new AnonymousClass99(c8u);
        this.A00 = anonymousClass66;
        A09(c8u, z);
    }

    @Nullable
    public static synchronized PackageInfo A00(C8U c8u) {
        if (!A06) {
            A03 = M0.A00(c8u);
            A06 = true;
        }
        return A03;
    }

    public static synchronized EnumC0757Lm A01(C8U c8u) {
        if (A04 == null) {
            A04 = C0758Ln.A00(c8u.A03().A8P());
        }
        return A04;
    }

    @Nullable
    @SuppressLint({"CatchGeneralException"})
    public static String A04(C8U c8u, String str) {
        try {
            PackageManager packageManager = c8u.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            return C0763Lu.A03(packageManager.getApplicationInfo(str, 0).sourceDir);
        } catch (Exception e) {
            if (A0A.compareAndSet(false, true)) {
                c8u.A06().A8y(A03(488, 7, 81), C04578z.A1P, new AnonymousClass90(e));
            }
            return null;
        }
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A09(final C8U c8u, boolean z) {
        if (!A0B.compareAndSet(0, 1)) {
            return;
        }
        A01(c8u);
        try {
            final SharedPreferences sharedPreferencesA00 = C0738Kt.A00(c8u);
            final AnonymousClass99 anonymousClass99 = new AnonymousClass99(c8u);
            final String str = A03(26, 4, 37) + anonymousClass99.A06();
            A05 = sharedPreferencesA00.getString(str, null);
            FutureTask futureTask = new FutureTask(new Callable<Boolean>() { // from class: com.facebook.ads.redexgen.X.9V
                public static byte[] A04;
                public static String[] A05 = {"XdxsWQHKmAYrPa6mv803llFsbG6xUBv1", "0ZMGl2pSIAaZIEqvxPmnMQII5PMyDfzp", "xK6bN8ERsE3qlK", "WJOztIfqKvqLg1zb8DcclROO5I1m6hYl", "NZ35AS4Ok4U2uFg9Bn0RAVLmEZFAhNaA", "i6NGDYiwjEbiTB59W8H8ewYatIcL2Rm5", "tt3j", "3tQ5yRyF2hXRO3n7qZm1zDaXW"};

                public static String A01(int i, int i2, int i3) {
                    byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
                    int i4 = 0;
                    while (true) {
                        int length = bArrCopyOfRange.length;
                        if (A05[2].length() != 14) {
                            throw new RuntimeException();
                        }
                        A05[0] = "ijq86j9eF5Bfako4vk0V9m1lrfYXSgO1";
                        if (i4 >= length) {
                            return new String(bArrCopyOfRange);
                        }
                        bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 105);
                        i4++;
                    }
                }

                public static void A02() {
                    A04 = new byte[]{124, 125, 115, 110, 125, 109, 106, 102, 100, 39, 104, 103, 109, 123, 102, 96, 109, 39, 127, 108, 103, 109, 96, 103, 110, 120, 104, 122, 107, 114, 78, 94, 65, 74, 78, 111, 109, 102, 109, 122, 97, 107};
                }

                static {
                    A02();
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX WARN: Code duplicated, block: B:10:0x0034  */
                /* JADX WARN: Code duplicated, block: B:6:0x0017  */
                /* JADX WARN: Code duplicated, block: B:8:0x001f  */
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
                public final Boolean call() throws Exception {
                    String strA01 = null;
                    if (Build.VERSION.SDK_INT < 31) {
                        if (A01(0, 1, 70).equals(Build.VERSION.CODENAME)) {
                            if (JR.A1w(c8u)) {
                                if (A01(6, 19, 96).equals(anonymousClass99.A0B())) {
                                    strA01 = C0763Lu.A01(c8u);
                                }
                            }
                        }
                    } else if (JR.A1w(c8u)) {
                        if (A01(6, 19, 96).equals(anonymousClass99.A0B())) {
                            strA01 = C0763Lu.A01(c8u);
                        }
                    }
                    if (strA01 == null) {
                        C8U c8u2 = c8u;
                        String unused = XT.A05 = XT.A04(c8u2, c8u2.getPackageName());
                    } else {
                        if (JR.A15(c8u)) {
                            C8U c8u3 = c8u;
                            String strA04 = XT.A04(c8u3, c8u3.getPackageName());
                            AnonymousClass90 anonymousClass90 = new AnonymousClass90(A01(1, 5, 119));
                            anonymousClass90.A03(1);
                            anonymousClass90.A04(1);
                            anonymousClass90.A08(false);
                            JSONObject checksumsJson = new JSONObject();
                            checksumsJson.put(A01(25, 5, 114), strA01);
                            checksumsJson.put(A01(30, 5, 68), strA04);
                            anonymousClass90.A05(checksumsJson);
                            c8u.A06().A8z(A01(35, 7, 97), C04578z.A1I, anonymousClass90);
                        }
                        String unused2 = XT.A05 = strA01;
                    }
                    sharedPreferencesA00.edit().putString(str, XT.A05).apply();
                    XT.A0B.set(2);
                    return true;
                }
            });
            Executors.newSingleThreadExecutor().submit(futureTask);
            if (z) {
                futureTask.get();
            }
        } catch (Exception unused) {
            A0B.set(0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x01ba  */
    @Override // com.facebook.ads.redexgen.X.C9T
    public final Map<String, String> A6W() {
        String strA6f;
        A09(this.A01, false);
        AnonymousClass98.A0B(this.A01);
        AnonymousClass98.A08(this.A01);
        HashMap map = new HashMap();
        C9Q.A02(this.A01, map);
        map.put(A03(316, 6, 78), Locale.getDefault().toString());
        float f = Lr.A00;
        int i = this.A01.getResources().getDisplayMetrics().widthPixels;
        int i2 = this.A01.getResources().getDisplayMetrics().heightPixels;
        map.put(A03(203, 7, 17), String.valueOf(f));
        int screenHeight = (int) (i / f);
        map.put(A03(426, 12, 101), String.valueOf(screenHeight));
        int screenHeight2 = (int) (i2 / f);
        map.put(A03(413, 13, 37), String.valueOf(screenHeight2));
        map.put(A03(64, 14, 94), C03855s.A03());
        map.put(A03(298, 9, 37), C03855s.A00().A02().name());
        map.put(A03(284, 14, 48), String.valueOf(C03855s.A00().A01()));
        map.put(A03(97, 6, 53), C9Y.A03(this.A01, this.A02));
        map.put(A03(113, 7, 31), this.A02.A08());
        map.put(A03(322, 4, 105), this.A02.A09());
        int screenHeight3 = A01(this.A01).A00;
        map.put(A03(369, 6, 20), String.valueOf(screenHeight3));
        map.put(A03(307, 9, 47), this.A02.A0B());
        map.put(A03(438, 14, 47), EnumC0749Le.A01());
        int screenHeight4 = MH.A00(this.A01).A00;
        map.put(A03(343, 12, 79), String.valueOf(screenHeight4));
        map.put(A03(452, 12, 6), MJ.A02(this.A01.A07().A01()));
        String str = A05;
        if (str != null) {
            String strA03 = A03(23, 3, 33);
            String[] strArr = A08;
            String str2 = strArr[1];
            String str3 = strArr[7];
            int iCharAt = str2.charAt(17);
            int screenHeight5 = str3.charAt(17);
            if (iCharAt != screenHeight5) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[1] = "AqiFfSJaVcvWeekshHh0ldvtL31lvyuj";
            strArr2[7] = "9HeqxNTbWRKyR8KfBHSSaEFZWfPVqzw4";
            map.put(strA03, str);
        }
        String strA02 = C0758Ln.A02(this.A01);
        String[] strArr3 = A08;
        String str4 = strArr3[0];
        String str5 = strArr3[5];
        int length = str4.length();
        int screenHeight6 = str5.length();
        if (length != screenHeight6) {
            if (strA02 != null) {
                map.put(A03(55, 5, 70), strA02);
            }
        } else {
            String[] strArr4 = A08;
            strArr4[1] = "BCkwQrwTZAh8DbNWYHcyNfiOEn9j0AAp";
            strArr4[7] = "Pk3Ope4wXmj489nPkHNYEkNTYlpVjL8G";
            if (strA02 != null) {
                map.put(A03(55, 5, 70), strA02);
            }
        }
        map.put(A03(464, 5, 90), String.valueOf(C0761Ls.A05(this.A01)));
        String strA6z = this.A01.A03().A6z();
        if (strA6z != null) {
            String mediationService = A03(326, 17, 1);
            map.put(mediationService, strA6z);
        }
        String strValueOf = String.valueOf(this.A02.A0C());
        String mediationService2 = A03(2, 21, 29);
        map.put(mediationService2, strValueOf);
        if (this.A02.A03() != -1) {
            String strValueOf2 = String.valueOf(this.A02.A03());
            String mediationService3 = A03(36, 19, 93);
            map.put(mediationService3, strValueOf2);
        }
        String strA05 = C9O.A05(this.A01);
        String mediationService4 = A03(479, 9, 93);
        map.put(mediationService4, strA05);
        String strA01 = C0766Lx.A01(AnonymousClass98.A02());
        String mediationService5 = A03(30, 6, 106);
        map.put(mediationService5, strA01);
        if (JQ.A05(this.A01) && (strA6f = this.A01.A03().A6f()) != null) {
            String fbLoginASID = A03(60, 4, 36);
            map.put(fbLoginASID, strA6f);
        }
        String strA72 = this.A01.A03().A72();
        if (!TextUtils.isEmpty(strA72)) {
            String oculusUserId = A03(355, 14, 70);
            map.put(oculusUserId, strA72);
        }
        C04428i c04428iA6K = this.A01.A05().A6K();
        String strA04 = A03(174, 29, 98);
        String strA06 = A03(143, 31, 81);
        String strA07 = A03(120, 23, 78);
        if (c04428iA6K != null) {
            String oculusUserId2 = c04428iA6K.A08();
            map.put(strA07, oculusUserId2);
            String oculusUserId3 = String.valueOf(c04428iA6K.A05());
            map.put(strA06, oculusUserId3);
            String oculusUserId4 = String.valueOf(c04428iA6K.A06());
            map.put(strA04, oculusUserId4);
        } else {
            String strA08 = A03(495, 4, 18);
            map.put(strA07, strA08);
            map.put(strA06, strA08);
            map.put(strA04, strA08);
        }
        String strA0K = C02600u.A01(this.A01).A0K();
        String oculusUserId5 = A03(103, 10, 69);
        map.put(oculusUserId5, strA0K);
        String strA09 = this.A00.A03(this.A01);
        if (strA09 != null && !TextUtils.isEmpty(strA09)) {
            String oculusUserId6 = A03(78, 19, 97);
            map.put(oculusUserId6, strA09);
        }
        String strValueOf3 = String.valueOf(this.A01.A02().A82());
        String oculusUserId7 = A03(267, 13, 94);
        map.put(oculusUserId7, strValueOf3);
        String strValueOf4 = String.valueOf(C04518t.A0H(this.A01));
        String oculusUserId8 = A03(228, 13, 63);
        map.put(oculusUserId8, strValueOf4);
        StringBuilder sb = new StringBuilder();
        C0T[] c0tArr = A09;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = c0tArr[i3].A02();
            sb.append(i4 + 4000);
            int i5 = c0tArr.length;
            if (i3 != i5 - 1) {
                sb.append(A03(1, 1, 104));
            }
        }
        map.put(A03(210, 18, 2), sb.toString());
        PackageInfo packageInfoA00 = A00(this.A01);
        map.put(A03(375, 20, 123), String.valueOf(packageInfoA00 != null));
        if (packageInfoA00 != null) {
            map.put(A03(395, 18, 123), String.valueOf(packageInfoA00.versionCode));
        }
        return map;
    }

    @Override // com.facebook.ads.redexgen.X.C9T
    public final String A7Y() {
        return A7Z(C9S.A00());
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00ed A[Catch: IOException -> 0x00f5, TryCatch #0 {IOException -> 0x00f5, blocks: (B:23:0x00e8, B:25:0x00ed, B:27:0x00f2), top: B:31:0x00e8 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x00f2 A[Catch: IOException -> 0x00f5, TRY_LEAVE, TryCatch #0 {IOException -> 0x00f5, blocks: (B:23:0x00e8, B:25:0x00ed, B:27:0x00f2), top: B:31:0x00e8 }] */
    @Override // com.facebook.ads.redexgen.X.C9T
    public final String A7Z(C9R c9r) {
        A09(this.A01, true);
        ByteArrayOutputStream byteArrayOutputStream = null;
        Base64OutputStream base64OutputStream = null;
        DeflaterOutputStream deflaterOutputStream = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 0);
                deflaterOutputStream = new DeflaterOutputStream(base64OutputStream);
                Map<String, String> mapA6W = A6W();
                if (TextUtils.isEmpty(C03855s.A00().A03())) {
                    C03855s.A07(this.A01);
                }
                mapA6W.put(A03(280, 4, 52), C03855s.A00().A03());
                mapA6W.put(A03(469, 10, 62), C9Y.A06(this.A02, this.A01, false));
                if (JR.A1K(this.A01)) {
                    mapA6W.put(A03(103, 10, 69), C02600u.A01(this.A01).A0K());
                }
                Iterator<Map.Entry<String, String>> it = mapA6W.entrySet().iterator();
                while (it.hasNext()) {
                    if (!c9r.A2N(it.next().getKey())) {
                        it.remove();
                    }
                }
                deflaterOutputStream.write(new JSONObject(mapA6W).toString().getBytes());
                deflaterOutputStream.close();
                String strReplaceAll = byteArrayOutputStream.toString().replaceAll(A03(0, 1, 107), A03(0, 0, 37));
                try {
                    deflaterOutputStream.close();
                    base64OutputStream.close();
                    byteArrayOutputStream.close();
                } catch (IOException unused) {
                }
                return strReplaceAll;
            } catch (IOException e) {
                throw new RuntimeException(A03(241, 26, 17), e);
            }
        } catch (Throwable th) {
            if (deflaterOutputStream != null) {
                try {
                    deflaterOutputStream.close();
                    if (base64OutputStream != null) {
                        base64OutputStream.close();
                    }
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                } catch (IOException unused2) {
                    throw th;
                }
            } else {
                if (base64OutputStream != null) {
                    base64OutputStream.close();
                }
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
            }
            throw th;
        }
    }
}
