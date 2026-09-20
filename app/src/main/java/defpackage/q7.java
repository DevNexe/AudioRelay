package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q7 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final gk4.QnHx e;
    public final QnHx f;
    public final s42 g;
    public final s42 h;

    public static abstract class QnHx {

        public static final class CQf extends QnHx {
            public final long a;

            public CQf(long j) {
                this.a = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CQf) && gq0.e(this.a, ((CQf) obj).a);
            }

            public final int hashCode() {
                return gq0.m(this.a);
            }

            public final String toString() {
                return "Completed after " + ((Object) gq0.q(this.a));
            }
        }

        public static final class F1 extends QnHx {
            public final long a;
            public final String b;

            public F1(long j, String str) {
                this.a = j;
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof F1)) {
                    return false;
                }
                F1 f1 = (F1) obj;
                return gq0.e(this.a, f1.a) && ur1.a(this.b, f1.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (gq0.m(this.a) * 31);
            }

            public final String toString() {
                return "Failed after " + ((Object) gq0.q(this.a));
            }
        }

        public static final class LPt8Fixed extends QnHx {
            public static final LPt8Fixed a = new LPt8Fixed();

            public final String toString() {
                return "Queued";
            }
        }

        public static final class NUlFixed extends QnHx {
            public static final NUlFixed a = new NUlFixed();

            public final String toString() {
                return "Running";
            }
        }

        /* JADX INFO: renamed from: q7$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0184QnHx extends QnHx {
            public final long a;

            public C0184QnHx(long j) {
                this.a = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0184QnHx) && gq0.e(this.a, ((C0184QnHx) obj).a);
            }

            public final int hashCode() {
                return gq0.m(this.a);
            }

            public final String toString() {
                return "Cancelled after " + ((Object) gq0.q(this.a));
            }
        }
    }

    public q7(String str, String str2, String str3, String str4, gk4.QnHx qnHx, QnHx qnHx2, s42 s42Var, s42 s42Var2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = qnHx;
        this.f = qnHx2;
        this.g = s42Var;
        this.h = s42Var2;
    }

    public static q7 a(q7 q7Var, String str, gk4.QnHx qnHx, QnHx qnHx2, s42 s42Var, s42 s42Var2, int i) {
        String str2 = (i & 1) != 0 ? q7Var.a : null;
        String str3 = (i & 2) != 0 ? q7Var.b : null;
        String str4 = (i & 4) != 0 ? q7Var.c : null;
        String str5 = (i & 8) != 0 ? q7Var.d : str;
        gk4.QnHx qnHx3 = (i & 16) != 0 ? q7Var.e : qnHx;
        QnHx qnHx4 = (i & 32) != 0 ? q7Var.f : qnHx2;
        s42 s42Var3 = (i & 64) != 0 ? q7Var.g : s42Var;
        s42 s42Var4 = (i & 128) != 0 ? q7Var.h : s42Var2;
        q7Var.getClass();
        return new q7(str2, str3, str4, str5, qnHx3, qnHx4, s42Var3, s42Var4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q7)) {
            return false;
        }
        q7 q7Var = (q7) obj;
        return ur1.a(this.a, q7Var.a) && ur1.a(this.b, q7Var.b) && ur1.a(this.c, q7Var.c) && ur1.a(this.d, q7Var.d) && this.e == q7Var.e && ur1.a(this.f, q7Var.f) && ur1.a(this.g, q7Var.g) && ur1.a(this.h, q7Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + bl2.a(this.d, bl2.a(this.c, bl2.a(this.b, this.a.hashCode() * 31, 31), 31), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "BallastSideJobState(connectionId=" + this.a + ", viewModelName=" + this.b + ", uuid=" + this.c + ", key=" + this.d + ", restartState=" + this.e + ", status=" + this.f + ", firstSeen=" + this.g + ", lastSeen=" + this.h + ')';
    }
}
