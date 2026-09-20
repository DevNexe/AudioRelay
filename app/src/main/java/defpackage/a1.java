package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class a1 implements uy4 {
    public final zy4 a;

    public static final class CQf extends a1 {
        public static final CQf b = new CQf();

        public CQf() {
            super(new zy4("UNKNOWN_OPEN_SL_ERROR"));
        }
    }

    public static final class QnHx extends a1 {
        public final String b;

        public QnHx(String str) {
            super(new zy4("OPENSL_SL_ERROR"));
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof QnHx) && ur1.a(this.b, ((QnHx) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return i5.b(new StringBuilder("OpenSLError(errorCodeText="), this.b, ")");
        }
    }

    public a1(zy4 zy4Var) {
        this.a = zy4Var;
    }

    @Override // defpackage.uy4
    public final zy4 getId() {
        return this.a;
    }
}
