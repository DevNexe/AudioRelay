package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class FTp0 implements uy4 {
    public final zy4 a;

    public static final class CQf extends FTp0 {
        public final int b;
        public final String c;

        public CQf(int i, String str) {
            super(new zy4("AUDIO_CAPTURE_READ_ERROR"));
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
            return "ReadError(errorCode=" + this.b + ", errorCodeText=" + this.c + ")";
        }
    }

    public static final class F1 extends FTp0 {
        public static final F1 b = new F1();

        public F1() {
            super(new zy4("AUDIO_CAPTURE_ERROR"));
        }
    }

    public static final class QnHx extends FTp0 {
        public static final QnHx b = new QnHx();

        public QnHx() {
            super(new zy4("AUDIO_CAPTURE_INITIALIZATION_ERROR"));
        }
    }

    public FTp0(zy4 zy4Var) {
        this.a = zy4Var;
    }

    @Override // defpackage.uy4
    public final zy4 getId() {
        return this.a;
    }
}
