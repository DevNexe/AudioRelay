package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ot0<Key, Value> implements Map.Entry<Key, Value>, mv1.QnHx {
    public final Key w;
    public Value x;

    public ot0(Key key, Value value) {
        this.w = key;
        this.x = value;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return ur1.a(entry.getKey(), this.w) && ur1.a(entry.getValue(), this.x);
    }

    @Override // java.util.Map.Entry
    public final Key getKey() {
        return this.w;
    }

    @Override // java.util.Map.Entry
    public final Value getValue() {
        return this.x;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.x.hashCode() + this.w.hashCode() + 527;
    }

    @Override // java.util.Map.Entry
    public final Value setValue(Value value) {
        this.x = value;
        return value;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.w);
        sb.append('=');
        sb.append(this.x);
        return sb.toString();
    }
}
