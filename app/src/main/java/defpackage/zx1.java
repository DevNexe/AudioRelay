package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class zx1 {

    public static final class CQf extends zx1 {
        public static final CQf a = new CQf();

        @Override // defpackage.zx1
        public final boolean a(gx1 gx1Var) {
            return false;
        }
    }

    public static final class QnHx extends zx1 {
        public final gx1 a;

        public QnHx(gx1 gx1Var) {
            this.a = gx1Var;
        }

        @Override // defpackage.zx1
        public final boolean a(gx1 gx1Var) {
            return ur1.a(gx1Var, this.a);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof QnHx) && ur1.a(this.a, ((QnHx) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Forced(language=" + this.a + ")";
        }
    }

    public abstract boolean a(gx1 gx1Var);
}
