package defpackage;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a2 implements kq2<l52> {
    public static final a2 a = new a2();
    public static final yw0 b;
    public static final yw0 c;

    static {
        iyM iym = new iyM(1);
        HashMap map = new HashMap();
        map.put(dg3.class, iym);
        b = new yw0("eventsDroppedCount", Collections.unmodifiableMap(new HashMap(map)));
        iyM iym2 = new iyM(3);
        HashMap map2 = new HashMap();
        map2.put(dg3.class, iym2);
        c = new yw0("reason", Collections.unmodifiableMap(new HashMap(map2)));
    }

    @Override // defpackage.ms0
    public final void a(Object obj, lq2 lq2Var) {
        l52 l52Var = (l52) obj;
        lq2 lq2Var2 = lq2Var;
        lq2Var2.f(b, l52Var.a);
        lq2Var2.a(c, l52Var.b);
    }
}
