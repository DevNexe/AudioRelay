package com.revenuecat.purchases.common;

import android.content.Context;
import com.revenuecat.purchases.DangerousSettings;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.strings.ConfigureStrings;
import defpackage.bl2;
import defpackage.kg0;
import defpackage.ur1;
import java.net.URL;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class AppConfig {
    private final URL baseURL;
    private final DangerousSettings dangerousSettings;
    private boolean finishTransactions;
    private final String languageTag;
    private final PlatformInfo platformInfo;
    private final Store store;
    private final String versionName;

    public AppConfig(Context context, boolean z, PlatformInfo platformInfo, URL url, Store store, DangerousSettings dangerousSettings) {
        String bcp47;
        this.platformInfo = platformInfo;
        this.store = store;
        this.dangerousSettings = dangerousSettings;
        Locale locale = UtilsKt.getLocale(context);
        this.languageTag = (locale == null || (bcp47 = UtilsKt.toBCP47(locale)) == null) ? "" : bcp47;
        String versionName = UtilsKt.getVersionName(context);
        this.versionName = versionName != null ? versionName : "";
        this.finishTransactions = !z;
        if (url != null) {
            LogWrapperKt.log(LogIntent.INFO, ConfigureStrings.CONFIGURING_PURCHASES_PROXY_URL_SET);
        } else {
            url = new URL("https://api.revenuecat.com/");
        }
        this.baseURL = url;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ur1.a(AppConfig.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.revenuecat.purchases.common.AppConfig");
        }
        AppConfig appConfig = (AppConfig) obj;
        return ur1.a(this.platformInfo, appConfig.platformInfo) && this.store == appConfig.store && ur1.a(this.dangerousSettings, appConfig.dangerousSettings) && ur1.a(this.languageTag, appConfig.languageTag) && ur1.a(this.versionName, appConfig.versionName) && this.finishTransactions == appConfig.finishTransactions && ur1.a(this.baseURL, appConfig.baseURL);
    }

    public final URL getBaseURL() {
        return this.baseURL;
    }

    public final DangerousSettings getDangerousSettings() {
        return this.dangerousSettings;
    }

    public final boolean getFinishTransactions() {
        return this.finishTransactions;
    }

    public final String getLanguageTag() {
        return this.languageTag;
    }

    public final PlatformInfo getPlatformInfo() {
        return this.platformInfo;
    }

    public final Store getStore() {
        return this.store;
    }

    public final String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        return this.baseURL.hashCode() + ((bl2.a(this.versionName, bl2.a(this.languageTag, (this.dangerousSettings.hashCode() + ((this.store.hashCode() + (this.platformInfo.hashCode() * 31)) * 31)) * 31, 31), 31) + (this.finishTransactions ? 1231 : 1237)) * 31);
    }

    public final void setFinishTransactions(boolean z) {
        this.finishTransactions = z;
    }

    public String toString() {
        return "AppConfig(platformInfo=" + this.platformInfo + ", store=" + this.store + ", dangerousSettings=" + this.dangerousSettings + ", languageTag='" + this.languageTag + "', versionName='" + this.versionName + "', finishTransactions=" + this.finishTransactions + ", baseURL=" + this.baseURL + ')';
    }

    public /* synthetic */ AppConfig(Context context, boolean z, PlatformInfo platformInfo, URL url, Store store, DangerousSettings dangerousSettings, int i, kg0 kg0Var) {
        this(context, z, platformInfo, url, store, (i & 32) != 0 ? new DangerousSettings(true) : dangerousSettings);
    }
}
