package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class cd0 {

    public static final class CQf extends cd0 {
        public static final CQf a = new CQf();
    }

    public static final class F1 extends cd0 {
        public final ce0.CQf a;

        public F1(ce0.CQf cQf) {
            this.a = cQf;
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
            return "Save(values=" + this.a + ")";
        }
    }

    public static final class LPt8Fixed extends cd0 {
        public final ce0.CQf a;

        public LPt8Fixed(ce0.CQf cQf) {
            this.a = cQf;
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
            return "Validate(values=" + this.a + ")";
        }
    }

    public static final class QnHx extends cd0 {
        public static final QnHx a = new QnHx();
    }
}
