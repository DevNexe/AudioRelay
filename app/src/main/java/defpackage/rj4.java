package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class rj4 implements uy4 {
    public final zy4 a;

    public static final class CQf extends rj4 {
        public final String b;

        public CQf(String str) {
            super(new zy4("OPUS_START_ERROR"));
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CQf) && ur1.a(this.b, ((CQf) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return i5.b(new StringBuilder("StartFailure(nativeCode="), this.b, ")");
        }
    }

    public static final class QnHx extends rj4 {
        public static final QnHx b = new QnHx();

        public QnHx() {
            super(new zy4("OPUS_LOAD_ERROR"));
        }
    }

    public rj4(zy4 zy4Var) {
        this.a = zy4Var;
    }

    @Override // defpackage.uy4
    public final zy4 getId() {
        return this.a;
    }
}
