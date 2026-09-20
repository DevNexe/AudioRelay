package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class q07 {
    public static volatile q07 b;
    public static final q07 c = new q07(0);
    public final Map a;

    public q07() {
        this.a = new HashMap();
    }

    public final q17 a(q37 q37Var, int i) {
        return (q17) this.a.get(new o07(q37Var, i));
    }

    public q07(int i) {
        this.a = Collections.emptyMap();
    }
}
