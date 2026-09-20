package com.revenuecat.purchases.google.attribution;

import android.annotation.SuppressLint;
import android.app.Application;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher;
import com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey;
import com.revenuecat.purchases.strings.AttributionStrings;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import defpackage.Md5A;
import defpackage.fr0;
import defpackage.j81;
import defpackage.sd5;
import defpackage.t92;
import defpackage.uy2;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public final class GoogleDeviceIdentifiersFetcher implements DeviceIdentifiersFetcher {
    private final Dispatcher dispatcher;

    public GoogleDeviceIdentifiersFetcher(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    private final String getAdvertisingID(Application application) {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(application);
            if (!advertisingIdInfo.isLimitAdTrackingEnabled()) {
                return advertisingIdInfo.getId();
            }
        } catch (GooglePlayServicesNotAvailableException e) {
            Md5A.h(new Object[]{e.getLocalizedMessage()}, 1, AttributionStrings.GOOGLE_PLAY_SERVICES_NOT_INSTALLED_FETCHING_ADVERTISING_IDENTIFIER, LogIntent.GOOGLE_ERROR);
        } catch (GooglePlayServicesRepairableException e2) {
            Md5A.h(new Object[]{e2.getLocalizedMessage()}, 1, AttributionStrings.GOOGLE_PLAY_SERVICES_REPAIRABLE_EXCEPTION_WHEN_FETCHING_ADVERTISING_IDENTIFIER, LogIntent.GOOGLE_ERROR);
        } catch (IOException e3) {
            Md5A.h(new Object[]{e3.getLocalizedMessage()}, 1, AttributionStrings.IO_EXCEPTION_WHEN_FETCHING_ADVERTISING_IDENTIFIER, LogIntent.GOOGLE_ERROR);
        } catch (TimeoutException e4) {
            Md5A.h(new Object[]{e4.getLocalizedMessage()}, 1, AttributionStrings.TIMEOUT_EXCEPTION_WHEN_FETCHING_ADVERTISING_IDENTIFIER, LogIntent.GOOGLE_ERROR);
        }
        return null;
    }

    @SuppressLint({"HardwareIds"})
    private final String getAndroidID(Application application) {
        return Settings.Secure.getString(application.getContentResolver(), "android_id");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getDeviceIdentifiers$lambda-0, reason: not valid java name */
    public static final void m28getDeviceIdentifiers$lambda0(GoogleDeviceIdentifiersFetcher googleDeviceIdentifiersFetcher, Application application, j81 j81Var) {
        j81Var.invoke(MapExtensionsKt.filterNotNullValues(t92.Q(new uy2(SubscriberAttributeKey.DeviceIdentifiers.GPSAdID.INSTANCE.getBackendKey(), googleDeviceIdentifiersFetcher.getAdvertisingID(application)), new uy2(SubscriberAttributeKey.DeviceIdentifiers.AndroidID.INSTANCE.getBackendKey(), googleDeviceIdentifiersFetcher.getAndroidID(application)), new uy2(SubscriberAttributeKey.DeviceIdentifiers.IP.INSTANCE.getBackendKey(), "true"))));
    }

    @Override // com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher
    public void getDeviceIdentifiers(Application application, j81<? super Map<String, String>, sd5> j81Var) {
        Dispatcher.enqueue$default(this.dispatcher, new fr0(this, application, j81Var, 1), false, 2, null);
    }
}
