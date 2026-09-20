package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class k82 {

    public static final class CQf extends k82 {
        public static final CQf a = new CQf();
    }

    public static final class F1 extends k82 {
        public final String a;

        public F1(String str) {
            this.a = str;
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
            return i5.b(new StringBuilder("Connect(address="), this.a, ")");
        }
    }

    public static final class LPt8Fixed extends k82 {
        public static final LPt8Fixed a = new LPt8Fixed();
    }

    public static final class NUlFixed extends k82 {
        public final String a;

        public NUlFixed(String str) {
            this.a = str;
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
            return i5.b(new StringBuilder("LastAddressLoaded(address="), this.a, ")");
        }
    }

    public static final class QnHx extends k82 {
        public static final QnHx a = new QnHx();
    }

    public static final class YKK extends k82 {
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
            return i5.b(new StringBuilder("Written(address="), this.a, ")");
        }
    }
}
