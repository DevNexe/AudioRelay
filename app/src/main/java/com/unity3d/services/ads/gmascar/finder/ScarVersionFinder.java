package com.unity3d.services.ads.gmascar.finder;

import com.google.ads.AdRequest;
import com.unity3d.services.ads.gmascar.bridges.MobileAdsBridge;
import com.unity3d.services.ads.gmascar.listeners.IInitializationStatusListener;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import defpackage.t91;

/* JADX INFO: loaded from: classes3.dex */
public class ScarVersionFinder implements IInitializationStatusListener {
    private static MobileAdsBridge _mobileAdsBridge;
    private GMAInitializer _gmaInitializer;
    private long _gmaSdkVersionCode = -1;
    private PresenceDetector _presenceDetector;

    public ScarVersionFinder(MobileAdsBridge mobileAdsBridge, PresenceDetector presenceDetector, GMAInitializer gMAInitializer) {
        _mobileAdsBridge = mobileAdsBridge;
        this._presenceDetector = presenceDetector;
        this._gmaInitializer = gMAInitializer;
        gMAInitializer.getInitializeListenerBridge().setStatusListener(this);
    }

    public void findAndSendVersion(boolean z) {
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.INIT_GMA, t91.VERSION, z ? _mobileAdsBridge.getVersionString() : AdRequest.VERSION);
    }

    public long getGoogleSdkVersionCode() {
        String versionString;
        if (this._gmaSdkVersionCode == -1 && (versionString = _mobileAdsBridge.getVersionString()) != null) {
            String[] strArrSplit = versionString.split("\\.");
            if (strArrSplit.length > 1) {
                this._gmaSdkVersionCode = Long.parseLong(strArrSplit[1]);
            }
        }
        return this._gmaSdkVersionCode;
    }

    public void getVersion() {
        try {
            if (!this._presenceDetector.areGMAClassesPresent()) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.INIT_GMA, t91.VERSION, AdRequest.VERSION);
            } else if (this._gmaInitializer.isInitialized()) {
                findAndSendVersion(true);
            } else {
                this._gmaInitializer.initializeGMA();
            }
        } catch (Exception e) {
            DeviceLog.debug("Got exception finding GMA SDK: %s", e.getLocalizedMessage());
        }
    }

    @Override // com.unity3d.services.ads.gmascar.listeners.IInitializationStatusListener
    public void onInitializationComplete(Object obj) {
        findAndSendVersion(this._gmaInitializer.initSuccessful(obj));
    }
}
