package defpackage;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;

/* JADX INFO: loaded from: classes.dex */
public final class aJjs extends AdListener {
    public final /* synthetic */ dl4<xq0<sd5, JBK6>> w;
    public final /* synthetic */ AdView x;

    public aJjs(AdView adView, yk4.QnHx qnHx) {
        this.w = qnHx;
        this.x = adView;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        a62.a.e("admob_rectangle_clicked");
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        a62.a.i(loadAdError.getCode(), "admob_rectangle_failed");
        ((yk4.QnHx) this.w).b(new xq0.QnHx(sd5.a));
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        a62.a.e("admob_rectangle_impression");
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        a62.a.e("admob_rectangle_loaded");
        ((yk4.QnHx) this.w).b(new xq0.CQf(new JBK6(this.x)));
    }
}
