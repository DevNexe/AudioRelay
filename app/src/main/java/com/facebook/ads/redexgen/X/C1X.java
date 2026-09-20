package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A05' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1X, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1X {
    public static byte[] A01;
    public static final /* synthetic */ C1X[] A02;
    public static final C1X A03;
    public static final C1X A04;
    public static final C1X A05;
    public final String A00;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 32);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{24, 23, 18, 27, 1, 14, 12, 27, 29, 31, 29, 22, 27, 3, 1, 28, 11, 10, 12, 3, 1, 22, 16, 18, 16, 27, 22, 119, 101, 98, 118, 105, 101, 119, 127, 112, 114, 101, 99, 97, 99, 104, 101};
    }

    static {
        A02();
        String strA01 = A01(27, 16, 0);
        A05 = new C1X(strA01, 0, strA01);
        String strA02 = A01(13, 14, 115);
        A04 = new C1X(strA02, 1, strA02);
        String strA03 = A01(0, 13, 126);
        A03 = new C1X(strA03, 2, strA03);
        A02 = new C1X[]{A05, A04, A03};
    }

    public C1X(String str, int i, String str2) {
        super(str, i);
        this.A00 = str2;
    }

    public static C1X A00(String str) {
        for (C1X c1x : values()) {
            if (c1x.A00.equalsIgnoreCase(str)) {
                return c1x;
            }
        }
        return A03;
    }

    public static C1X valueOf(String str) {
        return (C1X) Enum.valueOf(C1X.class, str);
    }

    public static C1X[] values() {
        return (C1X[]) A02.clone();
    }
}
