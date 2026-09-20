package defpackage;

import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.mediation.MediationBannerListener;

/* JADX INFO: loaded from: classes.dex */
public final class b36 extends AdListener implements AppEventListener, zza {
    public final AbstractAdViewAdapter w;
    public final MediationBannerListener x;

    public b36(AbstractAdViewAdapter abstractAdViewAdapter, MediationBannerListener mediationBannerListener) {
        this.w = abstractAdViewAdapter;
        this.x = mediationBannerListener;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        this.x.onAdClicked(this.w);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.x.onAdClosed(this.w);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.x.onAdFailedToLoad(this.w, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.x.onAdLoaded(this.w);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.x.onAdOpened(this.w);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        this.x.zzd(this.w, str, str2);
    }
}
