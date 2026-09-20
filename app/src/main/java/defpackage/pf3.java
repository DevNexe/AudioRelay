package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class pf3 {
    public static final ig3 a;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        hg3 hg3Var = ig3.QnHx.a;
        map.put(pf3.class, d2.a);
        map2.remove(pf3.class);
        map.put(is.class, x1.a);
        map2.remove(is.class);
        map.put(w75.class, f2.a);
        map2.remove(w75.class);
        map.put(q52.class, b2.a);
        map2.remove(q52.class);
        map.put(l52.class, a2.a);
        map2.remove(l52.class);
        map.put(fa1.class, y1.a);
        map2.remove(fa1.class);
        map.put(bu4.class, e2.a);
        map2.remove(bu4.class);
        a = new ig3(new HashMap(map), new HashMap(map2), hg3Var);
    }

    public abstract is a();
}
