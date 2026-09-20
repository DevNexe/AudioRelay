package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class gf4 {
    public final String a;

    public static final class CQf extends gf4 {
        public static final CQf b = new CQf();

        public CQf() {
            super("media_projection_stopped");
        }
    }

    public static final class F1 extends gf4 {
        public static final F1 b = new F1();

        public F1() {
            super("user_requested");
        }
    }

    public static final class QnHx extends gf4 {
        public final Throwable b;

        public QnHx(Throwable th) {
            super("error");
            this.b = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof QnHx) && ur1.a(this.b, ((QnHx) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Error(error=" + this.b + ")";
        }
    }

    public gf4(String str) {
        this.a = str;
    }
}
