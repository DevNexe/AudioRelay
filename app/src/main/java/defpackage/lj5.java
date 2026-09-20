package defpackage;

import java.io.Closeable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class lj5 {
    public final HashMap<String, jj5> a = new HashMap<>();

    public final void a() {
        for (jj5 jj5Var : this.a.values()) {
            jj5Var.c = true;
            HashMap map = jj5Var.a;
            if (map != null) {
                synchronized (map) {
                    Iterator it = jj5Var.a.values().iterator();
                    while (it.hasNext()) {
                        jj5.b(it.next());
                    }
                }
            }
            LinkedHashSet linkedHashSet = jj5Var.b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    Iterator it2 = jj5Var.b.iterator();
                    while (it2.hasNext()) {
                        jj5.b((Closeable) it2.next());
                    }
                }
            }
            jj5Var.c();
        }
        this.a.clear();
    }
}
