package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class ts4<K, V> {
    public Map.Entry<? extends K, ? extends V> A;
    public final yp4<K, V> w;
    public final Iterator<Map.Entry<K, V>> x;
    public int y;
    public Map.Entry<? extends K, ? extends V> z;

    /* JADX WARN: Multi-variable type inference failed */
    public ts4(yp4<K, V> yp4Var, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        this.w = yp4Var;
        this.x = it;
        this.y = yp4Var.c().d;
        a();
    }

    public final void a() {
        this.z = this.A;
        Iterator<Map.Entry<K, V>> it = this.x;
        this.A = it.hasNext() ? it.next() : null;
    }

    public final boolean hasNext() {
        return this.A != null;
    }

    public final void remove() {
        yp4<K, V> yp4Var = this.w;
        if (yp4Var.c().d != this.y) {
            throw new ConcurrentModificationException();
        }
        Map.Entry<? extends K, ? extends V> entry = this.z;
        if (entry == null) {
            throw new IllegalStateException();
        }
        yp4Var.remove(entry.getKey());
        this.z = null;
        sd5 sd5Var = sd5.a;
        this.y = yp4Var.c().d;
    }
}
