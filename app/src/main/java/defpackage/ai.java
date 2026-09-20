package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ai {
    public static final QnHx a = new QnHx();

    public class QnHx extends HashMap<String, String> {
        public QnHx() {
            put("ENABLE_LOG_TIMING", "false");
            put("ENABLE_PREMIUM", "true");
            put("FORCE_PREMIUM_RESPONSE", "true");
            put("ENABLE_LEAKCANARY", "true");
            put("ENABLE_STORE_LOGS", "");
            put("ENABLE_MEDIATION_TESTS", "true");
            put("ENABLE_BALLAST_DEBUGGER", "true");
            put("ALLOW_MULTIPLE_CONNECTIONS", "true");
            put("ADS_INACTIVITY_PERIOD_SECS", "30");
        }
    }
}
