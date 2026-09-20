package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ap<T> {
    public static final CQf b = new CQf();
    public final Object a;

    public static class CQf {
        public String toString() {
            return "Failed";
        }
    }

    public static final class QnHx extends CQf {
        public final Throwable a;

        public QnHx(Throwable th) {
            this.a = th;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof QnHx) {
                if (ur1.a(this.a, ((QnHx) obj).a)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            Throwable th = this.a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // ap.CQf
        public final String toString() {
            return "Closed(" + this.a + ')';
        }
    }

    public static final Throwable a(Object obj) {
        QnHx qnHx = obj instanceof QnHx ? (QnHx) obj : null;
        if (qnHx != null) {
            return qnHx.a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final T b(Object obj) {
        if (obj instanceof CQf) {
            return null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ap) {
            return ur1.a(this.a, ((ap) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof QnHx) {
            return ((QnHx) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
