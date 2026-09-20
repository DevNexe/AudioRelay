package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.util.Log;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0618Fy extends T8 {
    public static byte[] A02;
    public final /* synthetic */ C1348dd A00;
    public final /* synthetic */ C1339dU A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 74);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-113, -68, -68, -71, -68, 106, -81, -62, -81, -83, -65, -66, -77, -72, -79, 106, -85, -83, -66, -77, -71, -72, 2, -2, -3, 0};
    }

    public C0618Fy(C1348dd c1348dd, C1339dU c1339dU) {
        this.A00 = c1348dd;
        this.A01 = c1339dU;
    }

    @Override // com.facebook.ads.redexgen.X.O9
    public final void AA3() {
        this.A00.A0E = true;
        if (!this.A00.A0F) {
            return;
        }
        this.A00.A09();
    }

    @Override // com.facebook.ads.redexgen.X.T8, com.facebook.ads.redexgen.X.O9
    public final void AAJ(String str, Map<String, String> map) {
        this.A00.A03.A0D().A3Y();
        Uri uriA00 = C0745La.A00(str);
        if (A00(22, 4, 82).equals(uriA00.getScheme()) && C02470g.A04(uriA00.getAuthority()) && this.A00.A00 != null) {
            this.A00.A00.AAC(this.A00);
        }
        AbstractC02460f abstractC02460fA00 = C02470g.A00(this.A00.A03, this.A00.A04, this.A01.A65(), uriA00, map);
        if (abstractC02460fA00 == null) {
            return;
        }
        try {
            this.A00.A03.A0D().A3V();
            abstractC02460fA00.A0C();
        } catch (Exception e) {
            Log.e(C1348dd.A0I, A00(0, 22, 0), e);
        }
    }

    @Override // com.facebook.ads.redexgen.X.T8, com.facebook.ads.redexgen.X.O9
    public final void AAz() {
        this.A00.A03.A0D().A3Z(this.A00.A01 != null);
        if (this.A00.A01 == null) {
            return;
        }
        this.A00.A01.A02();
    }

    @Override // com.facebook.ads.redexgen.X.T8, com.facebook.ads.redexgen.X.O9
    public final void ABh() {
        this.A00.A03.A0D().A3b();
        this.A00.A01.A07();
    }

    @Override // com.facebook.ads.redexgen.X.O9
    public final void ACu() {
    }
}
