package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class jj5 {
    public final HashMap a = new HashMap();
    public final LinkedHashSet b = new LinkedHashSet();
    public volatile boolean c = false;

    public static void b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void c() {
    }

    public final Object d(Object obj, String str) {
        Object obj2;
        synchronized (this.a) {
            obj2 = this.a.get(str);
            if (obj2 == null) {
                this.a.put(str, obj);
            }
        }
        if (obj2 != null) {
            obj = obj2;
        }
        if (this.c) {
            b(obj);
        }
        return obj;
    }
}
