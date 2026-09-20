package defpackage;

import android.os.Bundle;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class TW {
    public final boolean a;
    public final Bundle b;

    public TW(boolean z) {
        Map mapSingletonMap;
        this.a = z;
        if (z) {
            mapSingletonMap = ds0.w;
        } else {
            a62.a.k("Disabling ads personalization");
            mapSingletonMap = Collections.singletonMap("npa", "1");
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : mapSingletonMap.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        this.b = bundle;
    }
}
