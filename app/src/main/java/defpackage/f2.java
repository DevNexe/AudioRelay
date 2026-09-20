package defpackage;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class f2 implements kq2<w75> {
    public static final f2 a = new f2();
    public static final yw0 b;
    public static final yw0 c;

    static {
        iyM iym = new iyM(1);
        HashMap map = new HashMap();
        map.put(dg3.class, iym);
        b = new yw0("startMs", Collections.unmodifiableMap(new HashMap(map)));
        iyM iym2 = new iyM(2);
        HashMap map2 = new HashMap();
        map2.put(dg3.class, iym2);
        c = new yw0("endMs", Collections.unmodifiableMap(new HashMap(map2)));
    }

    @Override // defpackage.ms0
    public final void a(Object obj, lq2 lq2Var) {
        w75 w75Var = (w75) obj;
        lq2 lq2Var2 = lq2Var;
        lq2Var2.f(b, w75Var.a);
        lq2Var2.f(c, w75Var.b);
    }
}
