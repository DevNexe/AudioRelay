package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class g63 {

    public static final class CQf extends g63 {
        public final i63 a;

        public CQf(i63 i63Var) {
            this.a = i63Var;
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
            return "SetViewState(viewState=" + this.a + ")";
        }
    }

    public static final class QnHx extends g63 {
        public static final QnHx a = new QnHx();
    }
}
