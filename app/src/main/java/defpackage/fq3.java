package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class fq3<T> implements Serializable {

    public static final class QnHx implements Serializable {
        public final Throwable w;

        public QnHx(Throwable th) {
            this.w = th;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof QnHx) {
                if (ur1.a(this.w, ((QnHx) obj).w)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.w.hashCode();
        }

        public final String toString() {
            return "Failure(" + this.w + ')';
        }
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof QnHx) {
            return ((QnHx) obj).w;
        }
        return null;
    }
}
