package com.unity3d.services.ads.gmascar;

import android.app.Activity;
import com.unity3d.scar.adapter.common.QnHx;
import com.unity3d.services.ads.gmascar.adapters.ScarAdapterFactory;
import com.unity3d.services.ads.gmascar.bridges.AdapterStatusBridge;
import com.unity3d.services.ads.gmascar.bridges.InitializationStatusBridge;
import com.unity3d.services.ads.gmascar.bridges.InitializeListenerBridge;
import com.unity3d.services.ads.gmascar.bridges.MobileAdsBridge;
import com.unity3d.services.ads.gmascar.finder.GMAInitializer;
import com.unity3d.services.ads.gmascar.finder.PresenceDetector;
import com.unity3d.services.ads.gmascar.finder.ScarVersionFinder;
import com.unity3d.services.ads.gmascar.handlers.ScarInterstitialAdHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarRewardedAdHandler;
import com.unity3d.services.ads.gmascar.handlers.SignalsHandler;
import com.unity3d.services.ads.gmascar.handlers.WebViewErrorHandler;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.core.misc.EventSubject;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.timer.DefaultIntervalTimerFactory;
import defpackage.X;
import defpackage.fc2;
import defpackage.hh1;
import defpackage.j44;
import defpackage.jh1;
import defpackage.k44;
import defpackage.s91;
import defpackage.t91;
import defpackage.z34;
import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class GMAScarAdapterBridge {
    private final AdapterStatusBridge _adapterStatusBridge;
    private final GMAEventSender _gmaEventSender;
    private final GMAInitializer _gmaInitializer;
    private final InitializeListenerBridge _initializationListenerBridge;
    private final InitializationStatusBridge _initializationStatusBridge;
    private final MobileAdsBridge _mobileAdsBridge;
    private final PresenceDetector _presenceDetector;
    private jh1 _scarAdapter;
    private final ScarAdapterFactory _scarAdapterFactory;
    private final ScarVersionFinder _scarVersionFinder;
    private final WebViewErrorHandler _webViewErrorHandler;

    public GMAScarAdapterBridge() {
        MobileAdsBridge mobileAdsBridge = new MobileAdsBridge();
        this._mobileAdsBridge = mobileAdsBridge;
        InitializationStatusBridge initializationStatusBridge = new InitializationStatusBridge();
        this._initializationStatusBridge = initializationStatusBridge;
        InitializeListenerBridge initializeListenerBridge = new InitializeListenerBridge();
        this._initializationListenerBridge = initializeListenerBridge;
        AdapterStatusBridge adapterStatusBridge = new AdapterStatusBridge();
        this._adapterStatusBridge = adapterStatusBridge;
        this._webViewErrorHandler = new WebViewErrorHandler();
        this._scarAdapterFactory = new ScarAdapterFactory();
        PresenceDetector presenceDetector = new PresenceDetector(mobileAdsBridge, initializeListenerBridge, initializationStatusBridge, adapterStatusBridge);
        this._presenceDetector = presenceDetector;
        GMAInitializer gMAInitializer = new GMAInitializer(mobileAdsBridge, initializeListenerBridge, initializationStatusBridge, adapterStatusBridge);
        this._gmaInitializer = gMAInitializer;
        this._scarVersionFinder = new ScarVersionFinder(mobileAdsBridge, presenceDetector, gMAInitializer);
        this._gmaEventSender = new GMAEventSender();
    }

    private jh1 getScarAdapterObject() {
        if (this._scarAdapter == null) {
            this._scarAdapter = this._scarAdapterFactory.createScarAdapter(this._scarVersionFinder.getGoogleSdkVersionCode(), this._webViewErrorHandler);
        }
        return this._scarAdapter;
    }

    private EventSubject getScarEventSubject(Integer num) {
        return new EventSubject(new ArrayDeque(Arrays.asList(t91.FIRST_QUARTILE, t91.MIDPOINT, t91.THIRD_QUARTILE, t91.LAST_QUARTILE)), num, new DefaultIntervalTimerFactory());
    }

    private void loadInterstitialAd(z34 z34Var) {
        this._scarAdapter.a(ClientProperties.getApplicationContext(), z34Var, new ScarInterstitialAdHandler(z34Var, getScarEventSubject(z34Var.e)));
    }

    private void loadRewardedAd(z34 z34Var) {
        this._scarAdapter.b(ClientProperties.getApplicationContext(), z34Var, new ScarRewardedAdHandler(z34Var, getScarEventSubject(z34Var.e)));
    }

    public void getSCARSignals(String[] strArr, String[] strArr2) {
        this._scarAdapter = getScarAdapterObject();
        SignalsHandler signalsHandler = new SignalsHandler();
        jh1 jh1Var = this._scarAdapter;
        if (jh1Var != null) {
            ((k44) jh1Var).a.a(ClientProperties.getApplicationContext(), strArr, strArr2, signalsHandler);
        } else {
            this._webViewErrorHandler.handleError((QnHx) new s91(t91.INTERNAL_SIGNALS_ERROR, "Could not create SCAR adapter object", "Could not create SCAR adapter object"));
        }
    }

    public void getVersion() {
        this._scarVersionFinder.getVersion();
    }

    public void initializeScar() {
        if (!this._presenceDetector.areGMAClassesPresent()) {
            this._webViewErrorHandler.handleError((QnHx) new s91(new Object[0]));
        } else {
            this._gmaEventSender.send(t91.SCAR_PRESENT, new Object[0]);
            this._gmaInitializer.initializeGMA();
        }
    }

    public boolean isInitialized() {
        return this._gmaInitializer.isInitialized();
    }

    public void load(boolean z, String str, String str2, String str3, String str4, int i) {
        z34 z34Var = new z34(str, str2, str4, str3, Integer.valueOf(i));
        jh1 scarAdapterObject = getScarAdapterObject();
        this._scarAdapter = scarAdapterObject;
        if (scarAdapterObject == null) {
            this._webViewErrorHandler.handleError((QnHx) new s91(t91.INTERNAL_LOAD_ERROR, "Scar Adapter object is null", str, str2, "Scar Adapter object is null"));
        } else if (z) {
            loadInterstitialAd(z34Var);
        } else {
            loadRewardedAd(z34Var);
        }
    }

    public void show(String str, String str2, boolean z) {
        jh1 scarAdapterObject = getScarAdapterObject();
        this._scarAdapter = scarAdapterObject;
        if (scarAdapterObject == null) {
            this._webViewErrorHandler.handleError((QnHx) new s91(t91.INTERNAL_SHOW_ERROR, "Scar Adapter object is null", str, str2, "Scar Adapter object is null"));
            return;
        }
        Activity activity = ClientProperties.getActivity();
        k44 k44Var = (k44) scarAdapterObject;
        hh1 hh1Var = (hh1) k44Var.b.get(str);
        if (hh1Var == null) {
            String strA = fc2.a("Could not find ad for placement '", str, "'.");
            k44Var.d.handleError(new s91(t91.NO_AD_ERROR, strA, str, str2, strA));
        } else {
            k44Var.c = hh1Var;
            X.C(new j44(k44Var, activity));
        }
    }
}
