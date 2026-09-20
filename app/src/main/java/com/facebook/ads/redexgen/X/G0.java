package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class G0 extends AbstractC1359dp {
    public static byte[] A02;
    public static String[] A03 = {"EO73VH", "Qgz5bq7vpM6wgaeZrwJ0N", "K0RixItTLV229tIQ9volfY9Fr2yfBG4Z", "0XJd0xzB9RaoqzSBbOWrwbmO5Qd7B1Hm", "", "cDFQfUnzrKwrnb1BC8KnyL9IHyRAK9fC", "Q7Q0M0vYffDRrtcuJmKxnq", "hygqtGcON2Cep"};
    public static final String A04;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 99);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {14, 41, 49, 52, 45, 44, -24, 60, 55, -24, 55, 56, 45, 54, -24, 52, 49, 54, 51, -24, 61, 58, 52, 2, -24, -14, -17, -12, -15};
        if (A03[0].length() == 23) {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[3] = "z2LBMWL3UZ6mgEOfq1wT6wdWGhdUBaxY";
        strArr[2] = "LNV6u0tAGiEAXpu6l5ZCQkq7c5KJBKxy";
        A02 = bArr;
    }

    static {
        A01();
        A04 = G0.class.getSimpleName();
    }

    public G0(C1075Xy c1075Xy, InterfaceC0703Jh interfaceC0703Jh, String str, Uri uri, Map<String, String> map, @Nullable C02520m c02520m, boolean z) {
        super(c1075Xy, interfaceC0703Jh, str, c02520m, z);
        this.A00 = uri;
        this.A01 = map;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02460f
    @Nullable
    public final EnumC02450e A0A() {
        if (A0F(this.A00)) {
            return null;
        }
        try {
            LZ.A0A(new LZ(), ((AbstractC02460f) this).A00, C0745La.A00(this.A00.getQueryParameter(A00(25, 4, 35))), ((AbstractC02460f) this).A02);
            return null;
        } catch (Exception unused) {
            String str = A00(0, 25, 101) + this.A00.toString();
            return EnumC02450e.A02;
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1359dp
    public final void A0D() {
        EnumC02450e enumC02450eA0A = null;
        if (((AbstractC1359dp) this).A02) {
            enumC02450eA0A = A0A();
        }
        A0E(this.A01, enumC02450eA0A);
    }
}
