package com.google.ads.mediation.unity;

import android.content.Context;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.metadata.MediationMetaData;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public class UnityInitializer {
    public static UnityInitializer a;

    public static synchronized UnityInitializer a() {
        if (a == null) {
            a = new UnityInitializer();
        }
        return a;
    }

    public void initializeUnityAds(Context context, String str, IUnityAdsInitializationListener iUnityAdsInitializationListener) throws JSONException {
        if (UnityAds.isInitialized()) {
            iUnityAdsInitializationListener.onInitializationComplete();
            return;
        }
        MediationMetaData mediationMetaData = new MediationMetaData(context);
        mediationMetaData.setName("AdMob");
        mediationMetaData.setVersion(UnityAds.getVersion());
        mediationMetaData.set("adapter_version", BuildConfig.ADAPTER_VERSION);
        mediationMetaData.commit();
        UnityAds.initialize(context, str, false, iUnityAdsInitializationListener);
    }
}
