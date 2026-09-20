package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class f73 {

    public static final class CQf extends f73 {
        public static final CQf a = new CQf();
    }

    public static final class F1 extends f73 {
        public static final F1 a = new F1();
    }

    public static final class LPt8Fixed extends f73 {
        public static final LPt8Fixed a = new LPt8Fixed();
    }

    public static final class NUlFixed extends f73 {
        public static final NUlFixed a = new NUlFixed();
    }

    public static final class QnHx extends f73 {
        public static final QnHx a = new QnHx();
    }

    public static final class T23 extends f73 {
        public final boolean a;

        public T23(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof T23) && this.a == ((T23) obj).a;
        }

        public final int hashCode() {
            boolean z = this.a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            return "ToggleMediaStyleNotification(newValue=" + this.a + ")";
        }
    }

    public static final class YKK extends f73 {
        public final boolean a;
        public final boolean b;

        public YKK(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }
    }

    public static final class auxFixed extends f73 {
        public final boolean a;

        public auxFixed(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof auxFixed) && this.a == ((auxFixed) obj).a;
        }

        public final int hashCode() {
            boolean z = this.a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            return "ToggleHandleNoisyEvents(newValue=" + this.a + ")";
        }
    }
}
