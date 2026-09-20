package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ck, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0541Ck {
    public static byte[] A02;
    public final C0543Cm A00;
    public final C0543Cm A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 78);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-54, -66, 1, 22};
    }

    public C0541Ck(C0543Cm c0543Cm) {
        this(c0543Cm, c0543Cm);
    }

    public C0541Ck(C0543Cm c0543Cm, C0543Cm c0543Cm2) {
        this.A00 = (C0543Cm) IK.A01(c0543Cm);
        this.A01 = (C0543Cm) IK.A01(c0543Cm2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0541Ck c0541Ck = (C0541Ck) obj;
        return this.A00.equals(c0541Ck.A00) && this.A01.equals(c0541Ck.A01);
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final String toString() {
        String strA00;
        StringBuilder sb = new StringBuilder();
        sb.append(A00(2, 1, 88));
        sb.append(this.A00);
        if (this.A00.equals(this.A01)) {
            strA00 = A00(0, 0, 98);
        } else {
            strA00 = A00(0, 2, 80) + this.A01;
        }
        sb.append(strA00);
        sb.append(A00(3, 1, 107));
        return sb.toString();
    }
}
