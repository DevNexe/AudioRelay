package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ew2 {

    public static final class CQf extends ew2 {
        public final dl3 a;

        public CQf(dl3 dl3Var) {
            this.a = dl3Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof CQf) {
                return ur1.a(this.a, ((CQf) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    public static final class F1 extends ew2 {
        public final ku3 a;
        public final TQ2_ b;

        /* JADX WARN: Code duplicated, block: B:19:0x0044  */
        /* JADX WARN: Code duplicated, block: B:36:0x007a  */
        public F1(ku3 ku3Var) {
            boolean z;
            boolean z2;
            TQ2_ tq2_G;
            this.a = ku3Var;
            long j = ku3Var.h;
            float fB = ha0.b(j);
            long j2 = ku3Var.g;
            boolean z3 = false;
            boolean z4 = fB == ha0.b(j2);
            long j3 = ku3Var.e;
            long j4 = ku3Var.f;
            if (z4) {
                if (ha0.b(j2) == ha0.b(j4)) {
                    if (ha0.b(j4) == ha0.b(j3)) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (ha0.c(j) == ha0.c(j2)) {
                if (ha0.c(j2) == ha0.c(j4)) {
                    if (ha0.c(j4) == ha0.c(j3)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            if (z && z2) {
                z3 = true;
            }
            if (z3) {
                tq2_G = null;
            } else {
                tq2_G = hH.g();
                tq2_G.i(ku3Var);
            }
            this.b = tq2_G;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof F1) {
                return ur1.a(this.a, ((F1) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    public static final class QnHx extends ew2 {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QnHx)) {
                return false;
            }
            ((QnHx) obj).getClass();
            return ur1.a(null, null);
        }

        public final int hashCode() {
            throw null;
        }
    }
}
