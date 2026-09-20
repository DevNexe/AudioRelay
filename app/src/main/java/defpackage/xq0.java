package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public abstract class xq0<A, B> {

    public static final class CQf<B> extends xq0 {
        public final B a;

        static {
            new CQf(sd5.a);
        }

        public CQf(B b) {
            this.a = b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CQf) && ur1.a(this.a, ((CQf) obj).a);
        }

        public final int hashCode() {
            B b = this.a;
            if (b == null) {
                return 0;
            }
            return b.hashCode();
        }

        @Override // defpackage.xq0
        public final String toString() {
            return o5.d(new StringBuilder("Either.Right("), this.a, ')');
        }
    }

    public static final class QnHx<A> extends xq0 {
        public final A a;

        static {
            new QnHx(sd5.a);
        }

        public QnHx(A a) {
            this.a = a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof QnHx) && ur1.a(this.a, ((QnHx) obj).a);
        }

        public final int hashCode() {
            A a = this.a;
            if (a == null) {
                return 0;
            }
            return a.hashCode();
        }

        @Override // defpackage.xq0
        public final String toString() {
            return o5.d(new StringBuilder("Either.Left("), this.a, ')');
        }
    }

    public String toString() {
        if (this instanceof CQf) {
            return "Either.Right(" + ((CQf) this).a + ')';
        }
        if (!(this instanceof QnHx)) {
            throw new NoWhenBranchMatchedException();
        }
        return "Either.Left(" + ((QnHx) this).a + ')';
    }
}
