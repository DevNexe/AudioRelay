package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class Oe {
    public static final CopyOnWriteArraySet<Logger> a = new CopyOnWriteArraySet<>();
    public static final Map<String, String> b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = rt2.class.getPackage();
        String name = r2 == null ? null : r2.getName();
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(rt2.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(wd1.class.getName(), "okhttp.Http2");
        linkedHashMap.put(h15.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        b = t92.W(linkedHashMap);
    }
}
