package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class bi1 {

    public static final class CQf extends bi1 {
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
            return "FailedToOpenPermissionSettings(error=" + this.a + ")";
        }
    }

    public static final class F1 extends bi1 {
        public final Throwable a;

        public F1(Throwable th) {
            this.a = th;
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
            return "FailedToShowTetheringOptions(error=" + this.a + ")";
        }
    }

    public static final class LPt8Fixed extends bi1 {
        public static final LPt8Fixed a = new LPt8Fixed();
    }

    public static final class NUlFixed extends bi1 {
        public static final NUlFixed a = new NUlFixed();
    }

    public static final class QnHx extends bi1 {
        public static final QnHx a = new QnHx();
    }

    public static final class T23 extends bi1 {
        public static final T23 a = new T23();
    }

    public static final class YKK extends bi1 {
        public final boolean a;
        public final boolean b;
        public final boolean c;

        public YKK(boolean z, boolean z2, boolean z3) {
            this.a = z;
            this.b = z2;
            this.c = z3;
        }
    }

    public static final class auxFixed extends bi1 {
        public static final auxFixed a = new auxFixed();
    }
}
