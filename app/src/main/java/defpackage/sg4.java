package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class sg4 {

    public static final class CQf extends sg4 {
        public static final CQf a = new CQf();
    }

    public static final class EQ extends sg4 {
        public static final EQ a = new EQ();
    }

    public static final class F1 extends sg4 {
        public static final F1 a = new F1();
    }

    public static final class LPt8Fixed extends sg4 {
        public static final LPt8Fixed a = new LPt8Fixed();
    }

    public static final class NUlFixed extends sg4 {
        public static final NUlFixed a = new NUlFixed();
    }

    public static final class QnHx extends sg4 {
        public static final QnHx a = new QnHx();
    }

    public static final class T23 extends sg4 {
        public static final T23 a = new T23();
    }

    public static final class YKK extends sg4 {
        public final String a;

        public YKK(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof YKK) && ur1.a(this.a, ((YKK) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return i5.b(new StringBuilder("OpenUri(uri="), this.a, ")");
        }
    }

    public static final class auxFixed extends sg4 {
        public static final auxFixed a = new auxFixed();
    }

    public static final class byN extends sg4 {
        public static final byN a = new byN();
    }
}
