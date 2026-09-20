package com.revenuecat.purchases;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public class PurchasesConfiguration {
    private final String apiKey;
    private final String appUserID;
    private final Context context;
    private final DangerousSettings dangerousSettings;
    private final boolean observerMode;
    private final ExecutorService service;
    private final Store store;

    public static class Builder {
        private final String apiKey;
        private String appUserID;
        private final Context context;
        private boolean observerMode;
        private ExecutorService service;
        private Store store = Store.PLAY_STORE;
        private DangerousSettings dangerousSettings = new DangerousSettings(false, 1, null);

        public Builder(Context context, String str) {
            this.context = context;
            this.apiKey = str;
        }

        public final Builder appUserID(String str) {
            this.appUserID = str;
            return this;
        }

        public PurchasesConfiguration build() {
            return new PurchasesConfiguration(this);
        }

        public final Builder dangerousSettings(DangerousSettings dangerousSettings) {
            this.dangerousSettings = dangerousSettings;
            return this;
        }

        public final /* synthetic */ String getApiKey$purchases_latestDependenciesRelease() {
            return this.apiKey;
        }

        public final /* synthetic */ String getAppUserID$purchases_latestDependenciesRelease() {
            return this.appUserID;
        }

        public final /* synthetic */ Context getContext$purchases_latestDependenciesRelease() {
            return this.context;
        }

        public final /* synthetic */ DangerousSettings getDangerousSettings$purchases_latestDependenciesRelease() {
            return this.dangerousSettings;
        }

        public final /* synthetic */ boolean getObserverMode$purchases_latestDependenciesRelease() {
            return this.observerMode;
        }

        public final /* synthetic */ ExecutorService getService$purchases_latestDependenciesRelease() {
            return this.service;
        }

        public final /* synthetic */ Store getStore$purchases_latestDependenciesRelease() {
            return this.store;
        }

        public final Builder observerMode(boolean z) {
            this.observerMode = z;
            return this;
        }

        public final Builder service(ExecutorService executorService) {
            this.service = executorService;
            return this;
        }

        public final /* synthetic */ void setAppUserID$purchases_latestDependenciesRelease(String str) {
            this.appUserID = str;
        }

        public final /* synthetic */ void setDangerousSettings$purchases_latestDependenciesRelease(DangerousSettings dangerousSettings) {
            this.dangerousSettings = dangerousSettings;
        }

        public final /* synthetic */ void setObserverMode$purchases_latestDependenciesRelease(boolean z) {
            this.observerMode = z;
        }

        public final /* synthetic */ void setService$purchases_latestDependenciesRelease(ExecutorService executorService) {
            this.service = executorService;
        }

        public final /* synthetic */ void setStore$purchases_latestDependenciesRelease(Store store) {
            this.store = store;
        }

        public final Builder store(Store store) {
            this.store = store;
            return this;
        }
    }

    public PurchasesConfiguration(Builder builder) {
        this.context = builder.getContext$purchases_latestDependenciesRelease();
        this.apiKey = builder.getApiKey$purchases_latestDependenciesRelease();
        this.appUserID = builder.getAppUserID$purchases_latestDependenciesRelease();
        this.observerMode = builder.getObserverMode$purchases_latestDependenciesRelease();
        this.service = builder.getService$purchases_latestDependenciesRelease();
        this.store = builder.getStore$purchases_latestDependenciesRelease();
        this.dangerousSettings = builder.getDangerousSettings$purchases_latestDependenciesRelease();
    }

    public final String getApiKey() {
        return this.apiKey;
    }

    public final String getAppUserID() {
        return this.appUserID;
    }

    public final Context getContext() {
        return this.context;
    }

    public final DangerousSettings getDangerousSettings() {
        return this.dangerousSettings;
    }

    public final boolean getObserverMode() {
        return this.observerMode;
    }

    public final ExecutorService getService() {
        return this.service;
    }

    public final Store getStore() {
        return this.store;
    }
}
