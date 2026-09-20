package com.facebook.ads.redexgen.X;

import android.os.Build;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ag, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1171ag implements InterfaceC04136v {
    public static String[] A01 = {"pBrDaZa5X5LjOgDS06qrKfvSDyGe8efw", "mQEhYUIy596kL", "EIforD6eBYb22Ex4JOKq", "k4SBaaSc1moa84J0CFgFz3nqLP2HVqmu", "u8nSh4T3SaBZfkGp86pLE93qaiXMklcf", "jMwuEx2OfYupc0", "IfOhRtB8SPti74hSuqBgnsqawc0MdhYN", "25E6wEyieKrSwG"};
    public final /* synthetic */ C1163aY A00;

    public C1171ag(C1163aY c1163aY) {
        this.A00 = c1163aY;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04136v
    public final C7A A5J() {
        if (Build.VERSION.SDK_INT >= 4) {
            if (this.A00.A01 != null) {
                C1163aY c1163aY = this.A00;
                String[] strArr = A01;
                if (strArr[3].charAt(9) != strArr[6].charAt(9)) {
                    String[] strArr2 = A01;
                    strArr2[7] = "fRLqK3UXRIvALx";
                    strArr2[5] = "beY33YfNkspfTw";
                    return c1163aY.A04(c1163aY.A01.targetSdkVersion);
                }
                A01[4] = "qWUfrjWL8adA9tG6bFG21ciodwCrSrmB";
                return c1163aY.A04(c1163aY.A01.targetSdkVersion);
            }
            return this.A00.A07(AnonymousClass76.A07);
        }
        C1163aY c1163aY2 = this.A00;
        String[] strArr3 = A01;
        if (strArr3[7].length() != strArr3[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr4 = A01;
        strArr4[7] = "5uTBAcIF1H8x94";
        strArr4[5] = "w8sP31VUPTTap4";
        return c1163aY2.A07(AnonymousClass76.A05);
    }
}
