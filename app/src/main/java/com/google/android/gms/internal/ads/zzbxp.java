package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import defpackage.iq5;
import defpackage.li;
import defpackage.q66;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbxp implements MediationInterstitialAdapter {
    public Activity a;
    public MediationInterstitialListener b;
    public Uri c;

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onDestroy() {
        zzcgn.zze("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onPause() {
        zzcgn.zze("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onResume() {
        zzcgn.zze("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.b = mediationInterstitialListener;
        if (mediationInterstitialListener == null) {
            zzcgn.zzj("Listener not set for mediation. Returning.");
            return;
        }
        if (!(context instanceof Activity)) {
            zzcgn.zzj("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.b.onAdFailedToLoad(this, 0);
            return;
        }
        if (!zzbjw.zzg(context)) {
            zzcgn.zzj("Default browser does not support custom tabs. Bailing out.");
            this.b.onAdFailedToLoad(this, 0);
            return;
        }
        String string = bundle.getString("tab_url");
        if (TextUtils.isEmpty(string)) {
            zzcgn.zzj("The tab_url retrieved from mediation metadata is empty. Bailing out.");
            this.b.onAdFailedToLoad(this, 0);
        } else {
            this.a = (Activity) context;
            this.c = Uri.parse(string);
            this.b.onAdLoaded(this);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        Intent intent = new Intent("android.intent.action.VIEW");
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            li.b(bundle, "android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        intent.putExtras(new Bundle());
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        intent.setData(this.c);
        com.google.android.gms.ads.internal.util.zzs.zza.post(new iq5(4, this, new AdOverlayInfoParcel(new com.google.android.gms.ads.internal.overlay.zzc(intent, null), null, new q66(this), null, new zzcgt(0, 0, false, false, false), null, null)));
        com.google.android.gms.ads.internal.zzt.zzp().zzo();
    }
}
