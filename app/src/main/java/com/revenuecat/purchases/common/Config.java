package com.revenuecat.purchases.common;

/* JADX INFO: loaded from: classes3.dex */
public final class Config {
    public static final Config INSTANCE = new Config();
    private static boolean debugLogsEnabled = false;
    public static final String frameworkVersion = "5.6.1";

    private Config() {
    }

    public final boolean getDebugLogsEnabled() {
        return debugLogsEnabled;
    }

    public final void setDebugLogsEnabled(boolean z) {
        debugLogsEnabled = z;
    }
}
