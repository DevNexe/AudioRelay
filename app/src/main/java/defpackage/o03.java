package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface o03 {

    public static final class CQf implements o03 {
        public static final CQf a = new CQf();
    }

    public static final class QnHx implements o03 {
        public final boolean a;

        public QnHx(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof QnHx) && this.a == ((QnHx) obj).a;
        }

        public final int hashCode() {
            boolean z = this.a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            return dj.c(new StringBuilder("Denied(shouldShowRationale="), this.a, ')');
        }
    }
}
