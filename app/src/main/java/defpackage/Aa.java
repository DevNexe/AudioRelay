package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Aa<K, V> implements Map<K, V>, jv1 {

    public static final class QnHx extends cx1 implements j81<Map.Entry<? extends K, ? extends V>, CharSequence> {
        public final /* synthetic */ Aa<K, V> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(Aa<K, ? extends V> aa) {
            super(1);
            this.w = aa;
        }

        @Override // defpackage.j81
        public final CharSequence invoke(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Aa<K, V> aa = this.w;
            aa.getClass();
            StringBuilder sb = new StringBuilder();
            Object key = entry.getKey();
            sb.append(key == aa ? "(this Map)" : String.valueOf(key));
            sb.append('=');
            Object value = entry.getValue();
            sb.append(value != aa ? String.valueOf(value) : "(this Map)");
            return sb.toString();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Set<Map.Entry<K, V>> setEntrySet = entrySet();
        if (setEntrySet.isEmpty()) {
            return false;
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (ur1.a(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return new i13((y03) this);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    @Override // java.util.Map
    public final boolean equals(Object obj) {
        boolean z;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        y03 y03Var = (y03) this;
        Map map = (Map) obj;
        if (y03Var.x != map.size()) {
            return false;
        }
        Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return true;
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (entry == null) {
                z = false;
            } else {
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = y03Var.get(key);
                if (ur1.a(value, obj2) && (obj2 != null || y03Var.containsKey(key))) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((y03) this).x == 0;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return new k13((y03) this);
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return ((y03) this).x;
    }

    public final String toString() {
        return wu.M0(entrySet(), ", ", "{", "}", new QnHx(this), 24);
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return new m13((y03) this);
    }
}
