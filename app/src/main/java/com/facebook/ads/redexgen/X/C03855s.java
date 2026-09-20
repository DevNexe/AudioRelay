package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C03855s {
    public static byte[] A00;
    public static String[] A01 = {"zJ7sRo3sU3MwvYkxVq5sKXU", "uwqdBBQkb", "sk1pAaPClwmr1DZFuM4XEVJDjMgj4luU", "2DEAuAVf", "LM1sVeBw6DNfIdZzIYsj5hqYQDPEhJFy", "hYSBjzGCwuKpFZFqojmwIwdxMJLMCyYz", "BWOi5Qn34m6VEGTMmYfzcDYeX0GTjOOy", "rscTiGR64sMWr7IEiXLU0M2EjoTwZlLg"};
    public static final AtomicReference<C03835q> A02;
    public static final AtomicReference<String> A03;

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 52);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{-98, -90, -95, -100, -84, -77, -94, -81, -81, -90, -95, -94, -95, -97, -88, -97, -84, -93, -99, -20, -25, -23, -28, -30, -14, -7, -24, -11, -11, -20, -25, -24};
    }

    static {
        A05();
        A02 = new AtomicReference<>();
        A03 = new AtomicReference<>(A04(0, 0, 68));
    }

    public static C03835q A00() {
        C03835q c03835q = A02.get();
        if (A01[6].charAt(15) == 'M') {
            String[] strArr = A01;
            strArr[3] = "GQnQs3ZS";
            strArr[1] = "yTwJu7KeR";
            C03835q c03835q2 = c03835q;
            if (c03835q2 == null) {
                C03835q c03835qA00 = C03835q.A00();
                String[] strArr2 = A01;
                if (strArr2[3].length() != strArr2[1].length()) {
                    A01[0] = "yvynwBtI7EoQ7kGRkYf58OE";
                    return c03835qA00;
                }
            } else {
                return c03835q2;
            }
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (android.text.TextUtils.isEmpty(r6.A03()) != false) goto L5;
     */
    @androidx.annotation.Nullable
    @android.annotation.SuppressLint({"CatchGeneralException"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.redexgen.X.C03835q A01(com.facebook.ads.redexgen.X.C8U r5, com.facebook.ads.redexgen.X.C03835q r6) {
        /*
            if (r6 == 0) goto Lc
            java.lang.String r0 = r6.A03()     // Catch: java.lang.Throwable -> L11
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L28
        Lc:
            com.facebook.ads.redexgen.X.5q r0 = com.facebook.ads.redexgen.X.C03905y.A00(r5)     // Catch: java.lang.Throwable -> L11
            return r0
        L11:
            r0 = move-exception
            com.facebook.ads.redexgen.X.8y r5 = r5.A06()
            int r4 = com.facebook.ads.redexgen.X.C04578z.A1Q
            com.facebook.ads.redexgen.X.90 r3 = new com.facebook.ads.redexgen.X.90
            r3.<init>(r0)
            r2 = 12
            r1 = 7
            r0 = 6
            java.lang.String r0 = A04(r2, r1, r0)
            r5.A8y(r0, r4, r3)
        L28:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C03855s.A01(com.facebook.ads.redexgen.X.8U, com.facebook.ads.redexgen.X.5q):com.facebook.ads.redexgen.X.5q");
    }

    @Nullable
    @SuppressLint({"CatchGeneralException"})
    public static C03835q A02(C8U c8u, C03835q c03835q, C03845r c03845r) {
        C03865t c03865tA00 = null;
        try {
            if (JQ.A06(c8u) && (c03835q == null || TextUtils.isEmpty(c03835q.A03()))) {
                c03865tA00 = C03875u.A00(c8u.getContentResolver());
            }
        } catch (Throwable th) {
            c8u.A06().A8y(A04(12, 7, 6), C04578z.A1S, new AnonymousClass90(th));
        }
        if (c03865tA00 != null && c03865tA00.A01 != null) {
            A03.set(c03865tA00.A01);
            c03845r.A05(c03865tA00.A01);
        }
        if (c03835q == null && c03865tA00 != null && !TextUtils.isEmpty(c03865tA00.A00)) {
            return new C03835q(c03865tA00.A00, c03865tA00.A02, EnumC03825p.A05);
        }
        return c03835q;
    }

    public static String A03() {
        String attributionId = A03.get();
        if (attributionId == null) {
            return A04(0, 0, 68);
        }
        return attributionId;
    }

    public static void A06(C03845r c03845r) {
        A02.set(c03845r.A02());
        A03.set(c03845r.A03());
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A07(C8U c8u) {
        long jA01;
        C03835q upToDateAdInfo;
        try {
            C03845r c03845r = new C03845r(c8u);
            A06(c03845r);
            if (A08()) {
                return;
            }
            C03835q c03835q = A02.get();
            if (c03835q != null && !TextUtils.isEmpty(c03835q.A03())) {
                jA01 = c03835q.A01();
            } else {
                jA01 = -1;
            }
            if (jA01 > 0 && System.currentTimeMillis() - jA01 < JQ.A00(c8u)) {
                return;
            }
            if (JQ.A07(c8u)) {
                upToDateAdInfo = A01(c8u, A02(c8u, null, c03845r));
            } else {
                upToDateAdInfo = A02(c8u, A01(c8u, null), c03845r);
            }
            if (upToDateAdInfo != null && !TextUtils.isEmpty(upToDateAdInfo.A03())) {
                A02.set(upToDateAdInfo);
                c03845r.A04(upToDateAdInfo);
            }
        } catch (Throwable th) {
            c8u.A06().A8y(A04(12, 7, 6), C04578z.A1R, new AnonymousClass90(th));
        }
    }

    public static boolean A08() {
        boolean updated = false;
        if (C0747Lc.A04()) {
            if (A01[0].length() != 23) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[3] = "OqjdKmMb";
            strArr[1] = "Sbvi0a9C0";
            String strA04 = A04(0, 12, 9);
            if (C0747Lc.A05(strA04)) {
                A03.set(C0747Lc.A01(strA04));
                updated = true;
            }
        }
        boolean zA04 = C0747Lc.A04();
        String[] strArr2 = A01;
        if (strArr2[5].charAt(29) != strArr2[4].charAt(29)) {
            A01[6] = "1QSggKSi3jrfAw1MbHCsavUz8mNGSj1M";
            if (!zA04) {
                return updated;
            }
        } else {
            A01[6] = "SqTb5lTJEle7YRZML8ItyxwGEN07wws1";
            if (!zA04) {
                return updated;
            }
        }
        String strA05 = A04(19, 13, 79);
        if (C0747Lc.A05(strA05)) {
            String strA01 = C0747Lc.A01(strA05);
            AtomicReference<C03835q> atomicReference = A02;
            if (strA01 == null) {
                strA01 = A04(0, 0, 68);
            }
            atomicReference.set(new C03835q(strA01, false, EnumC03825p.A04));
            return true;
        }
        return updated;
    }
}
