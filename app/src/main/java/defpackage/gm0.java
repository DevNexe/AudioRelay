package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class gm0 implements z24.CQf {
    public final /* synthetic */ m24 a;

    public gm0(n24 n24Var) {
        this.a = n24Var;
    }

    @Override // z24.CQf
    public final Bundle a() {
        Map<String, List<Object>> mapC = this.a.c();
        Bundle bundle = new Bundle();
        for (Map.Entry<String, List<Object>> entry : mapC.entrySet()) {
            String key = entry.getKey();
            List<Object> value = entry.getValue();
            bundle.putParcelableArrayList(key, value instanceof ArrayList ? (ArrayList) value : new ArrayList<>(value));
        }
        return bundle;
    }
}
