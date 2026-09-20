package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0619Fz extends AbstractC1359dp {
    public static byte[] A02;
    public static final String A03;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 79);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{122, 93, 85, 80, 89, 88, 28, 72, 83, 28, 83, 76, 89, 82, 28, 80, 85, 82, 87, 28, 73, 78, 80, 6, 28, 43, 46, 41, 44};
    }

    static {
        A01();
        A03 = C0619Fz.class.getSimpleName();
    }

    public C0619Fz(C1075Xy c1075Xy, InterfaceC0703Jh interfaceC0703Jh, String str, Uri uri, Map<String, String> map, @Nullable C02520m c02520m, boolean z) {
        super(c1075Xy, interfaceC0703Jh, str, c02520m, z);
        this.A00 = uri;
        this.A01 = map;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02460f
    @Nullable
    public final EnumC02450e A0A() {
        try {
            LZ.A09(new LZ(), ((AbstractC02460f) this).A00, C0745La.A00(this.A00.getQueryParameter(A00(25, 4, 8))), ((AbstractC02460f) this).A02);
            return null;
        } catch (Exception unused) {
            String str = A00(0, 25, 115) + this.A00.toString();
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
