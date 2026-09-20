package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class bs3 {

    public static final class CQf extends bs3 {
        public static final CQf a = new CQf();
    }

    public static final class QnHx extends bs3 {
        public final String a;

        public QnHx(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof QnHx) && ur1.a(this.a, ((QnHx) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return i5.b(new StringBuilder("Custom(id="), this.a, ")");
        }
    }
}
