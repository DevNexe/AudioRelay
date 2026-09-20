package defpackage;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class rw1<T> implements hq0<T> {
    public final CQf<T> a;

    public static final class CQf<T> {
        public int a = RCHTTPStatusCodes.UNSUCCESSFUL;
        public final LinkedHashMap b = new LinkedHashMap();

        public final QnHx a(int i, Float f) {
            QnHx qnHx = new QnHx(f);
            this.b.put(Integer.valueOf(i), qnHx);
            return qnHx;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof CQf) {
                CQf cQf = (CQf) obj;
                cQf.getClass();
                if (this.a == cQf.a && ur1.a(this.b, cQf.b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + Xs.a(this.a, 31, 0, 31);
        }
    }

    public static final class QnHx<T> {
        public final T a;
        public mq0 b;

        public QnHx() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(Float f) {
            nq0.QnHx qnHx = nq0.QnHx.a;
            this.a = f;
            this.b = qnHx;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof QnHx) {
                QnHx qnHx = (QnHx) obj;
                if (ur1.a(qnHx.a, this.a) && ur1.a(qnHx.b, this.b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            T t = this.a;
            return this.b.hashCode() + ((t != null ? t.hashCode() : 0) * 31);
        }
    }

    public rw1(CQf<T> cQf) {
        this.a = cQf;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rw1) {
            if (ur1.a(this.a, ((rw1) obj).a)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hq0, defpackage.Ah
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final <V extends z_Mm> jh5<V> a(pb5<T, V> pb5Var) {
        CQf<T> cQf = this.a;
        LinkedHashMap linkedHashMap = cQf.b;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C0239D.A(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            QnHx qnHx = (QnHx) entry.getValue();
            linkedHashMap2.put(key, new uy2(pb5Var.a().invoke(qnHx.a), qnHx.b));
        }
        return new jh5<>(linkedHashMap2, cQf.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
