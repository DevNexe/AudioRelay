package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.core.misc.EventSubject;
import defpackage.t91;
import defpackage.z34;

/* JADX INFO: loaded from: classes3.dex */
public class ScarInterstitialAdHandler extends ScarAdHandlerBase {
    public ScarInterstitialAdHandler(z34 z34Var, EventSubject<t91> eventSubject) {
        super(z34Var, eventSubject);
    }

    public void onAdClicked() {
        this._gmaEventSender.send(t91.AD_CLICKED, new Object[0]);
    }

    @Override // com.unity3d.services.ads.gmascar.handlers.ScarAdHandlerBase, defpackage.ih1
    public void onAdClosed() {
        if (!this._eventSubject.eventQueueIsEmpty()) {
            super.onAdSkipped();
        }
        super.onAdClosed();
    }

    public void onAdFailedToShow(int i, String str) {
        GMAEventSender gMAEventSender = this._gmaEventSender;
        t91 t91Var = t91.INTERSTITIAL_SHOW_ERROR;
        z34 z34Var = this._scarAdMetadata;
        gMAEventSender.send(t91Var, z34Var.a, z34Var.b, str, Integer.valueOf(i));
    }

    public void onAdImpression() {
        this._gmaEventSender.send(t91.INTERSTITIAL_IMPRESSION_RECORDED, new Object[0]);
    }

    public void onAdLeftApplication() {
        this._gmaEventSender.send(t91.AD_LEFT_APPLICATION, new Object[0]);
    }
}
