package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class TN6 implements uy4 {
    public final zy4 a;

    public static final class CQf extends TN6 {
        public final int b;
        public final String c;

        public CQf(int i, String str) {
            super(new zy4("AUDIO_TRACK_WRITE"));
            this.b = i;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CQf)) {
                return false;
            }
            CQf cQf = (CQf) obj;
            return this.b == cQf.b && ur1.a(this.c, cQf.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b * 31);
        }

        public final String toString() {
            return "WriteError(errorCode=" + this.b + ", errorCodeText=" + this.c + ")";
        }
    }

    public static final class QnHx extends TN6 {
        public static final QnHx b = new QnHx();

        public QnHx() {
            super(new zy4("UNKNOWN_AUDIO_TRACK_ERROR"));
        }
    }

    public TN6(zy4 zy4Var) {
        this.a = zy4Var;
    }

    @Override // defpackage.uy4
    public final zy4 getId() {
        return this.a;
    }
}
