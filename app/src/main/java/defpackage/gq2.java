package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public enum gq2 {
    COMPLETE;

    public static final class CQf implements Serializable {
        public final Throwable w;

        public CQf(Throwable th) {
            this.w = th;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof CQf) {
                return mq2.a(this.w, ((CQf) obj).w);
            }
            return false;
        }

        public final int hashCode() {
            return this.w.hashCode();
        }

        public final String toString() {
            return "NotificationLite.Error[" + this.w + "]";
        }
    }

    public static final class F1 implements Serializable {
        public final mw4 w;

        public F1(mw4 mw4Var) {
            this.w = mw4Var;
        }

        public final String toString() {
            return "NotificationLite.Subscription[" + this.w + "]";
        }
    }

    public static final class QnHx implements Serializable {
        public final vl0 w;

        public QnHx(vl0 vl0Var) {
            this.w = vl0Var;
        }

        public final String toString() {
            return "NotificationLite.Disposable[" + this.w + "]";
        }
    }

    public static boolean a(ht2 ht2Var, Object obj) {
        if (obj == COMPLETE) {
            ht2Var.b();
            return true;
        }
        if (obj instanceof CQf) {
            ht2Var.onError(((CQf) obj).w);
            return true;
        }
        ht2Var.g(obj);
        return false;
    }

    public static boolean c(ht2 ht2Var, Object obj) {
        if (obj == COMPLETE) {
            ht2Var.b();
            return true;
        }
        if (obj instanceof CQf) {
            ht2Var.onError(((CQf) obj).w);
            return true;
        }
        if (obj instanceof QnHx) {
            ht2Var.c(((QnHx) obj).w);
            return false;
        }
        ht2Var.g(obj);
        return false;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "NotificationLite.Complete";
    }
}
