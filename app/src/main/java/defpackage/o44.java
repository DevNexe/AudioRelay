package defpackage;

import com.google.android.gms.ads.AdListener;
import com.unity3d.services.ads.gmascar.handlers.ScarInterstitialAdHandler;

/* JADX INFO: loaded from: classes3.dex */
public final class o44 {
    public final ScarInterstitialAdHandler a;
    public kh1 b;
    public final QnHx c = new QnHx();

    public class QnHx extends AdListener {
        public QnHx() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdClicked() {
            o44.this.a.onAdClicked();
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdClosed() {
            o44.this.a.onAdClosed();
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdLoaded() {
            o44 o44Var = o44.this;
            o44Var.a.onAdLoaded();
            kh1 kh1Var = o44Var.b;
            if (kh1Var != null) {
                kh1Var.onAdLoaded();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdOpened() {
            o44.this.a.onAdOpened();
        }
    }

    public o44(ScarInterstitialAdHandler scarInterstitialAdHandler) {
        this.a = scarInterstitialAdHandler;
    }

    public final QnHx a() {
        return this.c;
    }

    public final void b(kh1 kh1Var) {
        this.b = kh1Var;
    }
}
