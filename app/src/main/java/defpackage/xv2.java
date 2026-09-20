package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xv2 {
    public static final List<wv2> a = ps0.M(new wv2(10000, false), new wv2(24000, true), new wv2(32000, true), new wv2(64000, true), new wv2(96000, true), wv2.c, new wv2(256000, true), new wv2(450000, true));

    public static final wv2 a(int i) {
        Object next;
        Iterator<T> it = a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((wv2) next).a == i));
        wv2 wv2Var = (wv2) next;
        return wv2Var == null ? wv2.c : wv2Var;
    }
}
