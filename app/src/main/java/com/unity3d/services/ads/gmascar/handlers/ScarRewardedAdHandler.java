package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.core.misc.EventSubject;
import defpackage.t91;
import defpackage.z34;

/* JADX INFO: loaded from: classes3.dex */
public class ScarRewardedAdHandler extends ScarAdHandlerBase {
    private boolean _hasEarnedReward;

    public ScarRewardedAdHandler(z34 z34Var, EventSubject<t91> eventSubject) {
        super(z34Var, eventSubject);
        this._hasEarnedReward = false;
    }

    @Override // com.unity3d.services.ads.gmascar.handlers.ScarAdHandlerBase, defpackage.ih1
    public void onAdClosed() {
        if (!this._hasEarnedReward) {
            super.onAdSkipped();
        }
        super.onAdClosed();
    }

    public void onAdFailedToShow(int i, String str) {
        GMAEventSender gMAEventSender = this._gmaEventSender;
        t91 t91Var = t91.REWARDED_SHOW_ERROR;
        z34 z34Var = this._scarAdMetadata;
        gMAEventSender.send(t91Var, z34Var.a, z34Var.b, str, Integer.valueOf(i));
    }

    public void onAdImpression() {
        this._gmaEventSender.send(t91.REWARDED_IMPRESSION_RECORDED, new Object[0]);
    }

    public void onUserEarnedReward() {
        this._hasEarnedReward = true;
        this._gmaEventSender.send(t91.AD_EARNED_REWARD, new Object[0]);
    }
}
