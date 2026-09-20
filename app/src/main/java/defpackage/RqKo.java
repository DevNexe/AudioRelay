package defpackage;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;

/* JADX INFO: loaded from: classes.dex */
public final class RqKo extends FullScreenContentCallback {
    public final /* synthetic */ h81<sd5> a;

    public RqKo(h81<sd5> h81Var) {
        this.a = h81Var;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        a62.a.e("dismissed_admob_interstitial");
        this.a.invoke();
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdFailedToShowFullScreenContent(AdError adError) {
        a62.a.h("ads", "failed_admob_interstitial_show", adError.getMessage());
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        a62.a.e("showed_admob_interstitial");
    }
}
