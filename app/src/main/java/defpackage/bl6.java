package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bl6 {
    public final ft a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();

    public bl6(ft ftVar) {
        this.a = ftVar;
    }

    public final void a(String str, String str2) {
        HashMap map = this.b;
        if (!map.containsKey(str)) {
            map.put(str, new ArrayList());
        }
        ((List) map.get(str)).add(str2);
    }
}
