package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class mp4<K, V> extends np4<K, V, K> {
    public mp4(yp4<K, V> yp4Var) {
        super(yp4Var);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        zp4.a();
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        zp4.a();
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.w.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!this.w.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        yp4<K, V> yp4Var = this.w;
        return new us4(yp4Var, ((mj1) yp4Var.c().c.entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.w.remove(obj) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        Iterator<T> it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (this.w.remove(it.next()) != null || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        p13<K, ? extends V> p13Var;
        int i;
        boolean z;
        cp4 cp4VarH;
        Set setH1 = wu.h1(collection);
        yp4<K, V> yp4Var = this.w;
        boolean z2 = false;
        do {
            synchronized (zp4.a) {
                yp4.QnHx qnHx = (yp4.QnHx) ip4.g(yp4Var.w, ip4.h());
                p13Var = qnHx.c;
                i = qnHx.d;
                sd5 sd5Var = sd5.a;
            }
            a13 a13VarBuilder = p13Var.builder();
            Object it = yp4Var.x.iterator();
            while (true) {
                z = true;
                if (!((ts4) it).hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) ((ss4) it).next();
                if (!setH1.contains(entry.getKey())) {
                    a13VarBuilder.remove(entry.getKey());
                    z2 = true;
                }
            }
            sd5 sd5Var2 = sd5.a;
            y03<K, V> y03VarA = a13VarBuilder.a();
            if (ur1.a(y03VarA, p13Var)) {
                break;
            }
            synchronized (zp4.a) {
                yp4.QnHx qnHx2 = yp4Var.w;
                synchronized (ip4.c) {
                    cp4VarH = ip4.h();
                    yp4.QnHx qnHx3 = (yp4.QnHx) ip4.q(qnHx2, yp4Var, cp4VarH);
                    int i2 = qnHx3.d;
                    if (i2 == i) {
                        qnHx3.c = y03VarA;
                        qnHx3.d = i2 + 1;
                    } else {
                        z = false;
                    }
                }
                ip4.k(cp4VarH, yp4Var);
            }
        } while (!z);
        return z2;
    }
}
