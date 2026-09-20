package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h7 {
    public final String a;
    public final String b;
    public final String c;
    public final Object d;
    public final String e;
    public final String f;
    public final QnHx g;
    public final s42 h;
    public final s42 i;

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
            public static final F1 a = new F1();

            public final String toString() {
                return "Dropped";
            }
        }

        public static final class LPt8Fixed extends QnHx {
            public final long a;
            public final String b;

            public LPt8Fixed(long j, String str) {
                this.a = j;
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LPt8Fixed)) {
                    return false;
                }
                LPt8Fixed lPt8 = (LPt8Fixed) obj;
                return gq0.e(this.a, lPt8.a) && ur1.a(this.b, lPt8.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (gq0.m(this.a) * 31);
            }

            public final String toString() {
                return "Failed after " + ((Object) gq0.q(this.a));
            }
        }

        public static final class NUlFixed extends QnHx {
            public static final NUlFixed a = new NUlFixed();

            public final String toString() {
                return "Queued";
            }
        }

        /* JADX INFO: renamed from: h7$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0135QnHx extends QnHx {
            public final long a;

            public C0135QnHx(long j) {
                this.a = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0135QnHx) && gq0.e(this.a, ((C0135QnHx) obj).a);
            }

            public final int hashCode() {
                return gq0.m(this.a);
            }

            public final String toString() {
                return "Cancelled after " + ((Object) gq0.q(this.a));
            }
        }

        public static final class YKK extends QnHx {
            public static final YKK a = new YKK();

            public final String toString() {
                return "Rejected";
            }
        }

        public static final class auxFixed extends QnHx {
            public static final auxFixed a = new auxFixed();

            public final String toString() {
                return "Running";
            }
        }
    }

    public h7(String str, String str2, String str3, Object obj, String str4, String str5, QnHx qnHx, s42 s42Var, s42 s42Var2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = obj;
        this.e = str4;
        this.f = str5;
        this.g = qnHx;
        this.h = s42Var;
        this.i = s42Var2;
    }

    public static h7 a(h7 h7Var, String str, String str2, QnHx qnHx, s42 s42Var, s42 s42Var2, int i) {
        String str3 = (i & 1) != 0 ? h7Var.a : null;
        String str4 = (i & 2) != 0 ? h7Var.b : null;
        String str5 = (i & 4) != 0 ? h7Var.c : null;
        Object obj = (i & 8) != 0 ? h7Var.d : null;
        String str6 = (i & 16) != 0 ? h7Var.e : str;
        String str7 = (i & 32) != 0 ? h7Var.f : str2;
        QnHx qnHx2 = (i & 64) != 0 ? h7Var.g : qnHx;
        s42 s42Var3 = (i & 128) != 0 ? h7Var.h : s42Var;
        s42 s42Var4 = (i & 256) != 0 ? h7Var.i : s42Var2;
        h7Var.getClass();
        return new h7(str3, str4, str5, obj, str6, str7, qnHx2, s42Var3, s42Var4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h7)) {
            return false;
        }
        h7 h7Var = (h7) obj;
        return ur1.a(this.a, h7Var.a) && ur1.a(this.b, h7Var.b) && ur1.a(this.c, h7Var.c) && ur1.a(this.d, h7Var.d) && ur1.a(this.e, h7Var.e) && ur1.a(this.f, h7Var.f) && ur1.a(this.g, h7Var.g) && ur1.a(this.h, h7Var.h) && ur1.a(this.i, h7Var.i);
    }

    public final int hashCode() {
        int iA = bl2.a(this.c, bl2.a(this.b, this.a.hashCode() * 31, 31), 31);
        Object obj = this.d;
        return this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + bl2.a(this.f, bl2.a(this.e, (iA + (obj == null ? 0 : obj.hashCode())) * 31, 31), 31)) * 31)) * 31);
    }

    public final String toString() {
        return "BallastInputState(connectionId=" + this.a + ", viewModelName=" + this.b + ", uuid=" + this.c + ", actualInput=" + this.d + ", type=" + this.e + ", toStringValue=" + this.f + ", status=" + this.g + ", firstSeen=" + this.h + ", lastSeen=" + this.i + ')';
    }
}
