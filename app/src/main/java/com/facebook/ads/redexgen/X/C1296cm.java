package com.facebook.ads.redexgen.X;

import android.view.View;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAdListener;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1296cm extends AbstractC02540o {
    public static byte[] A01;
    public static String[] A02 = {"", "lR4UvBki6PSdVcLREjEHAbqRd1OmLUQf", "DjKPGQUWmMf7x", "ODfaPUPPzX7KhktdCz15RADFZIjUcUTH", "SOtQhTlfKwNvvZXzwoqU2I3z2iEV30z7", "BHtVd6ktyCMEATMZK8J5wjGrCvXYI9tG", "P8UTzFKpwpJ94", "IxNcf87J3g"};
    public final /* synthetic */ C1294ck A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 126);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{99, 114, 107, 29, 17, 16, 10, 12, 17, 18, 18, 27, 12, 94, 23, 13, 94, 16, 11, 18, 18};
    }

    static {
        A01();
    }

    public C1296cm(C1294ck c1294ck) {
        this.A00 = c1294ck;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02540o
    public final void A02() {
        if (this.A00.A01 == null) {
            this.A00.A06 = false;
            this.A00.A09.onInterstitialActivityDestroyed();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02540o
    public final void A04() {
        if (this.A00.A01 != null) {
            this.A00.A01.show();
            return;
        }
        this.A00.A06 = false;
        if (this.A00.A03 != null) {
            this.A00.A03.A0M(new C1297cn(this));
            this.A00.A03.A0H();
            this.A00.A03 = null;
        }
        this.A00.A09.onInterstitialDismissed(this.A00.A0A.A01());
        this.A00.A05.A05();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02540o
    public final void A05() {
        this.A00.A09.onInterstitialDisplayed(this.A00.A0A.A01());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02540o
    public final void A06() {
        this.A00.A09.onRewardedAdServerFailed();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02540o
    public final void A07() {
        this.A00.A09.onRewardedAdServerSucceeded();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02540o
    public final void A08() {
        this.A00.A09.onRewardedAdCompleted();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02540o
    public final void A0C() {
        this.A00.A08.A0D().A2X();
        this.A00.A09.onAdClicked(this.A00.A0A.A01());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02540o
    public final void A0D() {
        this.A00.A09.onLoggingImpression(this.A00.A0A.A01());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02540o
    public final void A0E(View view) {
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0094  */
    /* JADX WARN: Code duplicated, block: B:18:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:24:0x013f  */
    @Override // com.facebook.ads.redexgen.X.AbstractC02540o
    public final void A0F(InterfaceC02530n interfaceC02530n) {
        C0746Lb c0746Lb;
        if (this.A00.A03 != null) {
            this.A00.A07 = true;
            C1294ck c1294ck = this.A00;
            c1294ck.A02 = c1294ck.A03.A0T();
            AnonymousClass18 anonymousClass18 = this.A00.A02;
            String[] strArr = A02;
            if (strArr[6].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[1] = "VeASnUkJuhfeOmGjJqk9CbDFf3FFhRFx";
            strArr2[5] = "TZLIDWk0RuIbUDThQePy8NEYvQ7OtG1H";
            if (anonymousClass18 != null) {
                int iA0G = this.A00.A02.A0G();
                String[] strArr3 = A02;
                if (strArr3[0].length() != strArr3[3].length()) {
                    String[] strArr4 = A02;
                    strArr4[6] = "g2LThTD3HDKTh";
                    strArr4[2] = "DwNNkt8z8VoEk";
                    if (iA0G > 0) {
                        c0746Lb = new C0746Lb();
                        if (c0746Lb.A09(this.A00.A08, this.A00.A0A.A07(), this.A00.A02.A0G())) {
                            c0746Lb.A08(this.A00.A08, true);
                            C1294ck c1294ck2 = this.A00;
                            c1294ck2.A01 = c0746Lb.A06(c1294ck2.A08, this.A00.A0A.A09(), this.A00.A0A.A07());
                        } else {
                            c0746Lb.A08(this.A00.A08, false);
                        }
                    }
                } else if (iA0G > 0) {
                    c0746Lb = new C0746Lb();
                    if (c0746Lb.A09(this.A00.A08, this.A00.A0A.A07(), this.A00.A02.A0G())) {
                        c0746Lb.A08(this.A00.A08, true);
                        C1294ck c1294ck3 = this.A00;
                        c1294ck3.A01 = c0746Lb.A06(c1294ck3.A08, this.A00.A0A.A09(), this.A00.A0A.A07());
                    } else {
                        c0746Lb.A08(this.A00.A08, false);
                    }
                }
            }
            if (this.A00.A01 != null) {
                this.A00.A02.A0m(true);
                this.A00.A01.loadAd(this.A00.A01.buildLoadAdConfig().withAdListener(new InterstitialAdListener() { // from class: com.facebook.ads.redexgen.X.1y
                    @Override // com.facebook.ads.AdListener
                    public final void onAdClicked(com.facebook.ads.Ad ad) {
                    }

                    @Override // com.facebook.ads.AdListener
                    public final void onAdLoaded(com.facebook.ads.Ad ad) {
                        this.A00.A00.A09.onAdLoaded(this.A00.A00.A0A.A01());
                    }

                    @Override // com.facebook.ads.AdListener
                    public final void onError(com.facebook.ads.Ad ad, AdError adError) {
                        this.A00.A00.A01 = null;
                        this.A00.A00.A02.A0m(false);
                        this.A00.A00.A09.onAdLoaded(this.A00.A00.A0A.A01());
                    }

                    @Override // com.facebook.ads.InterstitialAdListener
                    public final void onInterstitialDismissed(com.facebook.ads.Ad ad) {
                        this.A00.A00.A06 = false;
                        if (this.A00.A00.A03 != null) {
                            this.A00.A00.A03.A0M(new C1298co(this));
                            this.A00.A00.A03.A0H();
                            this.A00.A00.A03 = null;
                        }
                        this.A00.A00.A09.onInterstitialDismissed(this.A00.A00.A0A.A01());
                        this.A00.A00.A05.A05();
                    }

                    @Override // com.facebook.ads.InterstitialAdListener
                    public final void onInterstitialDisplayed(com.facebook.ads.Ad ad) {
                    }

                    @Override // com.facebook.ads.AdListener
                    public final void onLoggingImpression(com.facebook.ads.Ad ad) {
                    }
                }).withCacheFlags(this.A00.A0A.A0A()).withRewardData(this.A00.A0A.A03()).build());
                return;
            }
            this.A00.A09.onAdLoaded(this.A00.A0A.A01());
            return;
        }
        this.A00.A08.A06().A8y(A00(0, 3, 124), C04578z.A0N, new AnonymousClass90(A00(3, 18, 0)));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02540o
    public final void A0G(KH kh) {
        this.A00.A08.A0D().A2a(MJ.A01(this.A00.A00), kh.A03().getErrorCode(), kh.A04());
        this.A00.A09.onError(this.A00.A0A.A01(), C0748Ld.A00(kh));
    }
}
