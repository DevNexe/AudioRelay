package defpackage;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class qn<Value> implements Map<String, Value>, mv1 {
    public final LinkedHashMap w = new LinkedHashMap();

    @Override // java.util.Map
    public final void clear() {
        this.w.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return this.w.containsKey(new rn((String) obj));
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.w.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, Value>> entrySet() {
        return new zi0(this.w.entrySet(), mn.w, nn.w);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof qn)) {
            return false;
        }
        return ur1.a(((qn) obj).w, this.w);
    }

    @Override // java.util.Map
    public final Value get(Object obj) {
        if (obj instanceof String) {
            return (Value) this.w.get(new rn((String) obj));
        }
        return null;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.w.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.w.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return new zi0(this.w.keySet(), on.w, pn.w);
    }

    @Override // java.util.Map
    public final Object put(String str, Object obj) {
        return this.w.put(new rn(str), obj);
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends Value> map) {
        for (Map.Entry<? extends String, ? extends Value> entry : map.entrySet()) {
            String key = entry.getKey();
            this.w.put(new rn(key), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Value remove(Object obj) {
        if (obj instanceof String) {
            return (Value) this.w.remove(new rn((String) obj));
        }
        return null;
    }

    @Override // java.util.Map
    public final int size() {
        return this.w.size();
    }

    @Override // java.util.Map
    public final Collection<Value> values() {
        return this.w.values();
    }
}
