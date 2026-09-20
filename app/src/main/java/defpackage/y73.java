package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class y73 {
    public final f83 a;

    public static final class CQf extends y73 {
        public static final CQf b = new CQf();

        public CQf() {
            super(f83.Idle);
        }
    }

    public static final class F1 extends y73 implements ym5 {
        public final fc4 b;

        public F1(fc4 fc4Var) {
            super(f83.Retrying);
            this.b = fc4Var;
        }

        @Override // defpackage.ym5
        public final fc4 a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof F1) {
                return ur1.a(this.b, ((F1) obj).b);
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "RetryConnecting(endpoint=" + this.b + ")";
        }
    }

    public static final class LPt8Fixed extends y73 implements ym5 {
        public final fc4 b;

        public LPt8Fixed(fc4 fc4Var) {
            super(f83.Running);
            this.b = fc4Var;
        }

        @Override // defpackage.ym5
        public final fc4 a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof LPt8Fixed) {
                return ur1.a(this.b, ((LPt8Fixed) obj).b);
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Running(endpoint=" + this.b + ")";
        }
    }

    public static final class NUlFixed extends y73 {
        public final zt4 b;
        public final long c;

        public NUlFixed(zt4 zt4Var, long j) {
            super(f83.Stopping);
            this.b = zt4Var;
            this.c = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NUlFixed)) {
                return false;
            }
            NUlFixed nUl = (NUlFixed) obj;
            return ur1.a(this.b, nUl.b) && this.c == nUl.c;
        }

        public final int hashCode() {
            int iHashCode = this.b.hashCode() * 31;
            long j = this.c;
            return iHashCode + ((int) (j ^ (j >>> 32)));
        }

        public final String toString() {
            return "Stopping(reason=" + this.b + ", elapsedTimeInMs=" + this.c + ")";
        }
    }

    public static final class QnHx extends y73 implements ym5 {
        public final fc4 b;

        public QnHx(fc4 fc4Var) {
            super(f83.Connecting);
            this.b = fc4Var;
        }

        @Override // defpackage.ym5
        public final fc4 a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof QnHx) {
                return ur1.a(this.b, ((QnHx) obj).b);
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Connecting(endpoint=" + this.b + ")";
        }
    }

    public y73(f83 f83Var) {
        this.a = f83Var;
    }
}
