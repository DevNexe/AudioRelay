package defpackage;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.unity3d.services.ads.gmascar.handlers.ScarInterstitialAdHandler;

/* JADX INFO: loaded from: classes3.dex */
public final class p44 {
    public final ScarInterstitialAdHandler a;
    public kh1 b;
    public final QnHx c = new QnHx();

    public class QnHx extends AdListener {
        public QnHx() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdClicked() {
            p44.this.a.onAdClicked();
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdClosed() {
            p44.this.a.onAdClosed();
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdFailedToLoad(LoadAdError loadAdError) {
            p44.this.a.onAdFailedToLoad(loadAdError.getCode(), loadAdError.toString());
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdLoaded() {
            p44 p44Var = p44.this;
            p44Var.a.onAdLoaded();
            kh1 kh1Var = p44Var.b;
            if (kh1Var != null) {
                kh1Var.onAdLoaded();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdOpened() {
            p44.this.a.onAdOpened();
        }
    }

    public p44(ScarInterstitialAdHandler scarInterstitialAdHandler) {
        this.a = scarInterstitialAdHandler;
    }

    public final QnHx a() {
        return this.c;
    }

    public final void b(kh1 kh1Var) {
        this.b = kh1Var;
    }
}
