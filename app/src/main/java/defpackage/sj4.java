package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class sj4 implements uy4 {
    public final zy4 a;

    public static final class CQf extends sj4 {
        public final String b;

        public CQf(String str) {
            super(new zy4("OPUS_SET_BITRATE"));
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
            return i5.b(new StringBuilder("SetBitrateFailure(nativeCode="), this.b, ")");
        }
    }

    public static final class F1 extends sj4 {
        public final String b;

        public F1(String str) {
            super(new zy4("OPUS_START_ERROR"));
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof F1) && ur1.a(this.b, ((F1) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return i5.b(new StringBuilder("StartFailure(nativeCode="), this.b, ")");
        }
    }

    public static final class QnHx extends sj4 {
        public static final QnHx b = new QnHx();

        public QnHx() {
            super(new zy4("OPUS_LOAD_ERROR"));
        }
    }

    public sj4(zy4 zy4Var) {
        this.a = zy4Var;
    }

    @Override // defpackage.uy4
    public final zy4 getId() {
        return this.a;
    }
}
