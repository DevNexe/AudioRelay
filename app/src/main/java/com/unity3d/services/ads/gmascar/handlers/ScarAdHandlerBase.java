package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.core.misc.EventSubject;
import com.unity3d.services.core.misc.IEventListener;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import defpackage.ih1;
import defpackage.t91;
import defpackage.z34;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ScarAdHandlerBase implements ih1 {
    protected final EventSubject<t91> _eventSubject;
    protected final GMAEventSender _gmaEventSender = new GMAEventSender();
    protected final z34 _scarAdMetadata;

    public ScarAdHandlerBase(z34 z34Var, EventSubject<t91> eventSubject) {
        this._scarAdMetadata = z34Var;
        this._eventSubject = eventSubject;
    }

    @Override // defpackage.ih1
    public void onAdClosed() {
        this._gmaEventSender.send(t91.AD_CLOSED, new Object[0]);
        this._eventSubject.unsubscribe();
    }

    @Override // defpackage.ih1
    public void onAdFailedToLoad(int i, String str) {
        GMAEventSender gMAEventSender = this._gmaEventSender;
        t91 t91Var = t91.LOAD_ERROR;
        z34 z34Var = this._scarAdMetadata;
        gMAEventSender.send(t91Var, z34Var.a, z34Var.b, str, Integer.valueOf(i));
    }

    @Override // defpackage.ih1
    public void onAdLoaded() {
        GMAEventSender gMAEventSender = this._gmaEventSender;
        t91 t91Var = t91.AD_LOADED;
        z34 z34Var = this._scarAdMetadata;
        gMAEventSender.send(t91Var, z34Var.a, z34Var.b);
    }

    @Override // defpackage.ih1
    public void onAdOpened() {
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.GMA, t91.AD_STARTED, new Object[0]);
        this._eventSubject.subscribe(new IEventListener<t91>() { // from class: com.unity3d.services.ads.gmascar.handlers.ScarAdHandlerBase.1
            @Override // com.unity3d.services.core.misc.IEventListener
            public void onNextEvent(t91 t91Var) {
                ScarAdHandlerBase.this._gmaEventSender.send(t91Var, new Object[0]);
            }
        });
    }

    public void onAdSkipped() {
        this._gmaEventSender.send(t91.AD_SKIPPED, new Object[0]);
    }
}
