package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class If$ {

    public static final class CQf extends If$ {
        public final A$Y4 a;

        public CQf(A$Y4 a$y4) {
            this.a = a$y4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CQf) && this.a == ((CQf) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ChangeOutputType(type=" + this.a + ")";
        }
    }

    public static final class F1 extends If$ {
        public static final F1 a = new F1();
    }

    public static final class LPt8Fixed extends If$ {
        public final A$Y4 a;
        public final q1 b;
        public final jv2 c;

        public LPt8Fixed(A$Y4 a$y4, q1 q1Var, jv2 jv2Var) {
            this.a = a$y4;
            this.b = q1Var;
            this.c = jv2Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LPt8Fixed)) {
                return false;
            }
            LPt8Fixed lPt8 = (LPt8Fixed) obj;
            return this.a == lPt8.a && ur1.a(this.b, lPt8.b) && ur1.a(this.c, lPt8.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "Loaded(audioOutputType=" + this.a + ", audioTrackOptions=" + this.b + ", openSLOptions=" + this.c + ")";
        }
    }

    public static final class NUlFixed extends If$ {
        public final boolean a;

        public NUlFixed(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NUlFixed) && this.a == ((NUlFixed) obj).a;
        }

        public final int hashCode() {
            boolean z = this.a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            return "ToggleAudioTrackLowLatency(isEnabled=" + this.a + ")";
        }
    }

    public static final class QnHx extends If$ {
        public final kv2 a;

        public QnHx(kv2 kv2Var) {
            this.a = kv2Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof QnHx) && this.a == ((QnHx) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ChangeOpenSLPerformanceMode(mode=" + this.a + ")";
        }
    }
}
