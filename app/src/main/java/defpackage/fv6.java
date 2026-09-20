package defpackage;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public class fv6 extends AbstractMap {
    public static final /* synthetic */ int C = 0;
    public volatile ev6 A;
    public final int w;
    public boolean z;
    public List x = Collections.emptyList();
    public Map y = Collections.emptyMap();
    public Map B = Collections.emptyMap();

    public void a() {
        if (this.z) {
            return;
        }
        this.y = this.y.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.y);
        this.B = this.B.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.B);
        this.z = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        g();
        int iC = c(comparable);
        if (iC >= 0) {
            return ((bv6) this.x.get(iC)).setValue(obj);
        }
        g();
        boolean zIsEmpty = this.x.isEmpty();
        int i = this.w;
        if (zIsEmpty && !(this.x instanceof ArrayList)) {
            this.x = new ArrayList(i);
        }
        int i2 = -(iC + 1);
        if (i2 >= i) {
            return f().put(comparable, obj);
        }
        if (this.x.size() == i) {
            bv6 bv6Var = (bv6) this.x.remove(i - 1);
            f().put(bv6Var.w, bv6Var.x);
        }
        this.x.add(i2, new bv6(this, comparable, obj));
        return null;
    }

    public final int c(Comparable comparable) {
        int size = this.x.size() - 1;
        int i = 0;
        if (size >= 0) {
            int iCompareTo = comparable.compareTo(((bv6) this.x.get(size)).w);
            if (iCompareTo > 0) {
                return -(size + 2);
            }
            if (iCompareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int iCompareTo2 = comparable.compareTo(((bv6) this.x.get(i2)).w);
            if (iCompareTo2 < 0) {
                size = i2 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i2;
                }
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        g();
        if (!this.x.isEmpty()) {
            this.x.clear();
        }
        if (this.y.isEmpty()) {
            return;
        }
        this.y.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return c(comparable) >= 0 || this.y.containsKey(comparable);
    }

    public final Object e(int i) {
        g();
        Object obj = ((bv6) this.x.remove(i)).x;
        if (!this.y.isEmpty()) {
            Iterator it = f().entrySet().iterator();
            List list = this.x;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new bv6(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.A == null) {
            this.A = new ev6(this);
        }
        return this.A;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fv6)) {
            return super.equals(obj);
        }
        fv6 fv6Var = (fv6) obj;
        int size = size();
        if (size != fv6Var.size()) {
            return false;
        }
        int size2 = this.x.size();
        if (size2 != fv6Var.x.size()) {
            return entrySet().equals(fv6Var.entrySet());
        }
        for (int i = 0; i < size2; i++) {
            if (!((Map.Entry) this.x.get(i)).equals((Map.Entry) fv6Var.x.get(i))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.y.equals(fv6Var.y);
        }
        return true;
    }

    public final SortedMap f() {
        g();
        if (this.y.isEmpty() && !(this.y instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.y = treeMap;
            this.B = treeMap.descendingMap();
        }
        return (SortedMap) this.y;
    }

    public final void g() {
        if (this.z) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iC = c(comparable);
        return iC >= 0 ? ((bv6) this.x.get(iC)).x : this.y.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.x.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += ((bv6) this.x.get(i)).hashCode();
        }
        return this.y.size() > 0 ? this.y.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int iC = c(comparable);
        if (iC >= 0) {
            return e(iC);
        }
        if (this.y.isEmpty()) {
            return null;
        }
        return this.y.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.y.size() + this.x.size();
    }
}
