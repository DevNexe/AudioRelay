package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class lp4<K, V> extends np4<K, V, Map.Entry<K, V>> {
    public lp4(yp4<K, V> yp4Var) {
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
        if (!((obj instanceof Map.Entry) && (!(obj instanceof jv1) || (obj instanceof mv1.QnHx)))) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return ur1.a(this.w.get(entry.getKey()), entry.getValue());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        yp4<K, V> yp4Var = this.w;
        return new ss4(yp4Var, ((mj1) yp4Var.c().c.entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        if ((obj instanceof Map.Entry) && (!(obj instanceof jv1) || (obj instanceof mv1.QnHx))) {
            return this.w.remove(((Map.Entry) obj).getKey()) != null;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        Iterator<? extends Object> it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (this.w.remove(((Map.Entry) it.next()).getKey()) != null || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        p13<K, ? extends V> p13Var;
        int i;
        boolean z;
        cp4 cp4VarH;
        Collection<? extends Object> collection2 = collection;
        int iA = C0239D.A(mu.w0(collection2, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
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
            Object it2 = yp4Var.x.iterator();
            while (true) {
                z = true;
                if (!((ts4) it2).hasNext()) {
                    break;
                }
                Map.Entry entry2 = (Map.Entry) ((ss4) it2).next();
                if ((linkedHashMap.containsKey(entry2.getKey()) && ur1.a(linkedHashMap.get(entry2.getKey()), entry2.getValue())) ? false : true) {
                    a13VarBuilder.remove(entry2.getKey());
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
