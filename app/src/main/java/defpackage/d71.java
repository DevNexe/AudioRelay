package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class d71 {

    public static final class CQf extends d71 {
        public static final CQf a = new CQf();
    }

    public static final class F1 extends d71 {
        public static final F1 a = new F1();
    }

    public static final class LPt8Fixed extends d71 {
        public static final LPt8Fixed a = new LPt8Fixed();
    }

    public static final class NUlFixed extends d71 {
        public final JBK6 a;

        public NUlFixed(JBK6 jbk6) {
            this.a = jbk6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NUlFixed) && ur1.a(this.a, ((NUlFixed) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "LoadSuccessful(result=" + this.a + ")";
        }
    }

    public static final class QnHx extends d71 {
        public final Throwable a;

        public QnHx(Throwable th) {
            this.a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof QnHx) && ur1.a(this.a, ((QnHx) obj).a);
        }

        public final int hashCode() {
            Throwable th = this.a;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        public final String toString() {
            return "FailedToLoadAds(error=" + this.a + ")";
        }
    }

    public static final class YKK extends d71 {
        public static final YKK a = new YKK();
    }
}
