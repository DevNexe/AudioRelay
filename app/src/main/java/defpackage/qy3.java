package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class qy3 {

    public static final class CQf extends qy3 {
        public static final CQf a = new CQf();
    }

    public static final class F1 extends qy3 {
        public final vp a;

        public F1(vp vpVar) {
            this.a = vpVar;
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
            return "Visible(chartData=" + this.a + ")";
        }
    }

    public static final class QnHx extends qy3 {
        public static final QnHx a = new QnHx();
    }
}
