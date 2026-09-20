package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rp2<T> {
    public static final rp2<Object> b = new rp2<>(null);
    public final Object a;

    public rp2(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rp2) {
            return mq2.a(this.a, ((rp2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        Object obj = this.a;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (obj instanceof gq2.CQf) {
            return "OnErrorNotification[" + ((gq2.CQf) obj).w + "]";
        }
        return "OnNextNotification[" + obj + "]";
    }
}
