package defpackage;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class x1 implements kq2<is> {
    public static final x1 a = new x1();
    public static final yw0 b;
    public static final yw0 c;
    public static final yw0 d;
    public static final yw0 e;

    static {
        iyM iym = new iyM(1);
        HashMap map = new HashMap();
        map.put(dg3.class, iym);
        b = new yw0("window", Collections.unmodifiableMap(new HashMap(map)));
        iyM iym2 = new iyM(2);
        HashMap map2 = new HashMap();
        map2.put(dg3.class, iym2);
        c = new yw0("logSourceMetrics", Collections.unmodifiableMap(new HashMap(map2)));
        iyM iym3 = new iyM(3);
        HashMap map3 = new HashMap();
        map3.put(dg3.class, iym3);
        d = new yw0("globalMetrics", Collections.unmodifiableMap(new HashMap(map3)));
        iyM iym4 = new iyM(4);
        HashMap map4 = new HashMap();
        map4.put(dg3.class, iym4);
        e = new yw0("appNamespace", Collections.unmodifiableMap(new HashMap(map4)));
    }

    @Override // defpackage.ms0
    public final void a(Object obj, lq2 lq2Var) {
        is isVar = (is) obj;
        lq2 lq2Var2 = lq2Var;
        lq2Var2.a(b, isVar.a);
        lq2Var2.a(c, isVar.b);
        lq2Var2.a(d, isVar.c);
        lq2Var2.a(e, isVar.d);
    }
}
