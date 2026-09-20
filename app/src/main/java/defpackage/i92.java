package defpackage;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class i92<K, V> extends gw1<K, V, Map.Entry<? extends K, ? extends V>> {
    public final ra4 c;

    public static final class CQf extends cx1 implements j81<br, sd5> {
        public final /* synthetic */ rv1<K> w;
        public final /* synthetic */ rv1<V> x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(rv1<K> rv1Var, rv1<V> rv1Var2) {
            super(1);
            this.w = rv1Var;
            this.x = rv1Var2;
        }

        @Override // defpackage.j81
        public final sd5 invoke(br brVar) {
            br brVar2 = brVar;
            br.a(brVar2, SubscriberAttributeKt.JSON_NAME_KEY, this.w.a());
            br.a(brVar2, "value", this.x.a());
            return sd5.a;
        }
    }

    public static final class QnHx<K, V> implements Map.Entry<K, V>, jv1 {
        public final K w;
        public final V x;

        public QnHx(K k, V v) {
            this.w = k;
            this.x = v;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QnHx)) {
                return false;
            }
            QnHx qnHx = (QnHx) obj;
            return ur1.a(this.w, qnHx.w) && ur1.a(this.x, qnHx.x);
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.w;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.x;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k = this.w;
            int iHashCode = (k == null ? 0 : k.hashCode()) * 31;
            V v = this.x;
            return iHashCode + (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MapEntry(key=");
            sb.append(this.w);
            sb.append(", value=");
            return o5.d(sb, this.x, ')');
        }
    }

    public i92(rv1<K> rv1Var, rv1<V> rv1Var2) {
        super(rv1Var, rv1Var2);
        this.c = FWT.r("kotlin.collections.Map.Entry", uv4.F1.a, new pa4[0], new CQf(rv1Var, rv1Var2));
    }

    @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
    public final pa4 a() {
        return this.c;
    }

    @Override // defpackage.gw1
    public final Object f(Object obj) {
        return ((Map.Entry) obj).getKey();
    }

    @Override // defpackage.gw1
    public final Object g(Object obj) {
        return ((Map.Entry) obj).getValue();
    }

    @Override // defpackage.gw1
    public final Object h(Object obj, Object obj2) {
        return new QnHx(obj, obj2);
    }
}
