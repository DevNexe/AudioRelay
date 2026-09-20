package com.facebook.ads.redexgen.X;

import android.webkit.WebView;
import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.d8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1317d8 implements C7M {
    public final C1W A00;
    public final InterfaceC02771l A01;
    public final C7U A02;
    public final C1075Xy A03;
    public final boolean A04;

    public C1317d8(C1075Xy c1075Xy, InterfaceC02771l interfaceC02771l, C7U c7u, C1W c1w, boolean z) {
        this.A03 = c1075Xy;
        this.A01 = interfaceC02771l;
        this.A02 = c7u;
        this.A00 = c1w;
        this.A04 = z;
    }

    private final void A00() {
        WebView webView = new WebView(this.A03);
        webView.getSettings().setCacheMode(1);
        webView.setWebViewClient(new C02781m(this.A00, this.A01, this.A04));
        webView.loadUrl(this.A00.A0E());
    }

    private void A01(boolean z) {
        if (this.A00.A09() == C1X.A05) {
            A00();
            return;
        }
        String strA0E = this.A00.A0E();
        if (z) {
            strA0E = this.A02.A0R(this.A00.A0E());
        }
        this.A00.A0H(strA0E);
        this.A01.ABn();
    }

    @Override // com.facebook.ads.redexgen.X.C7M
    public final void AAH() {
        if (this.A04) {
            this.A01.ABm(AdError.CACHE_ERROR);
        } else {
            A01(false);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C7M
    public final void AAO() {
        A01(true);
    }
}
