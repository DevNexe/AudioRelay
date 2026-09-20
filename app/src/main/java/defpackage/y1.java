package defpackage;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class y1 implements kq2<fa1> {
    public static final y1 a = new y1();
    public static final yw0 b;

    static {
        iyM iym = new iyM(1);
        HashMap map = new HashMap();
        map.put(dg3.class, iym);
        b = new yw0("storageMetrics", Collections.unmodifiableMap(new HashMap(map)));
    }

    @Override // defpackage.ms0
    public final void a(Object obj, lq2 lq2Var) {
        lq2Var.a(b, ((fa1) obj).a);
    }
}
