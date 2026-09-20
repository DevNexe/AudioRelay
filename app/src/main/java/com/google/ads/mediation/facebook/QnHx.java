package com.google.ads.mediation.facebook;

import android.content.Context;
import com.facebook.ads.AudienceNetworkAds;
import com.google.android.gms.ads.AdError;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class QnHx implements AudienceNetworkAds.InitListener {
    public static QnHx d;
    public boolean a = false;
    public boolean b = false;
    public final ArrayList<InterfaceC0071QnHx> c = new ArrayList<>();

    /* JADX INFO: renamed from: com.google.ads.mediation.facebook.QnHx$QnHx, reason: collision with other inner class name */
    public interface InterfaceC0071QnHx {
        void a(AdError adError);

        void b();
    }

    public static QnHx a() {
        if (d == null) {
            d = new QnHx();
        }
        return d;
    }

    public static void b(Context context, String str, InterfaceC0071QnHx interfaceC0071QnHx) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(str);
        a().c(context, arrayList, interfaceC0071QnHx);
    }

    public final void c(Context context, ArrayList<String> arrayList, InterfaceC0071QnHx interfaceC0071QnHx) {
        if (this.a) {
            this.c.add(interfaceC0071QnHx);
        } else {
            if (this.b) {
                interfaceC0071QnHx.b();
                return;
            }
            this.a = true;
            a().c.add(interfaceC0071QnHx);
            AudienceNetworkAds.buildInitSettings(context).withMediationService("GOOGLE:6.11.0.1").withPlacementIds(arrayList).withInitListener(this).initialize();
        }
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitListener
    public final void onInitialized(AudienceNetworkAds.InitResult initResult) {
        this.a = false;
        this.b = initResult.isSuccess();
        ArrayList<InterfaceC0071QnHx> arrayList = this.c;
        for (InterfaceC0071QnHx interfaceC0071QnHx : arrayList) {
            if (initResult.isSuccess()) {
                interfaceC0071QnHx.b();
            } else {
                interfaceC0071QnHx.a(new AdError(104, initResult.getMessage(), "com.google.ads.mediation.facebook"));
            }
        }
        arrayList.clear();
    }
}
