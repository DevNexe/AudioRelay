package defpackage;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b2 implements kq2<q52> {
    public static final b2 a = new b2();
    public static final yw0 b;
    public static final yw0 c;

    static {
        iyM iym = new iyM(1);
        HashMap map = new HashMap();
        map.put(dg3.class, iym);
        b = new yw0("logSource", Collections.unmodifiableMap(new HashMap(map)));
        iyM iym2 = new iyM(2);
        HashMap map2 = new HashMap();
        map2.put(dg3.class, iym2);
        c = new yw0("logEventDropped", Collections.unmodifiableMap(new HashMap(map2)));
    }

    @Override // defpackage.ms0
    public final void a(Object obj, lq2 lq2Var) {
        q52 q52Var = (q52) obj;
        lq2 lq2Var2 = lq2Var;
        lq2Var2.a(b, q52Var.a);
        lq2Var2.a(c, q52Var.b);
    }
}
