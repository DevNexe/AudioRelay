package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class df4 {

    public static final class CQf extends df4 {
        public final vb4 a;
        public final long b;

        public CQf(vb4 vb4Var, long j) {
            this.a = vb4Var;
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CQf)) {
                return false;
            }
            CQf cQf = (CQf) obj;
            return ur1.a(this.a, cQf.a) && this.b == cQf.b;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            long j = this.b;
            return iHashCode + ((int) (j ^ (j >>> 32)));
        }

        public final String toString() {
            return "Running(captureConfig=" + this.a + ", startTime=" + this.b + ")";
        }
    }

    public static final class F1 extends df4 {
        public final vb4 a;

        public F1(vb4 vb4Var) {
            this.a = vb4Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof F1) && ur1.a(this.a, ((F1) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Starting(captureConfig=" + this.a + ")";
        }
    }

    public static final class LPt8Fixed extends df4 {
        public final gf4 a;

        public LPt8Fixed(gf4 gf4Var) {
            this.a = gf4Var;
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
            return "Stopping(stoppingReason=" + this.a + ")";
        }
    }

    public static final class QnHx extends df4 {
        public static final QnHx a = new QnHx();
    }
}
