package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class f63 {

    public static final class CQf extends f63 {
        public final Throwable a;

        public CQf(Throwable th) {
            this.a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CQf) && ur1.a(this.a, ((CQf) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "NetworkPlayerFailed(error=" + this.a + ")";
        }
    }

    public static final class F1 extends f63 {
        public final y61 a;

        public F1(y61 y61Var) {
            this.a = y61Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof F1) && this.a == ((F1) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ShowFullscreenAds(strategy=" + this.a + ")";
        }
    }

    public static final class LPt8Fixed extends f63 {
        public final sr4 a;

        public LPt8Fixed(sr4 sr4Var) {
            this.a = sr4Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LPt8Fixed) && ur1.a(this.a, ((LPt8Fixed) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "StartPlayer(startOptions=" + this.a + ")";
        }
    }

    public static final class QnHx extends f63 {
        public static final QnHx a = new QnHx();
    }
}
