package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d7 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final QnHx f;
    public final s42 g;
    public final s42 h;

    public static abstract class QnHx {

        public static final class CQf extends QnHx {
            public final long a;
            public final String b;

            public CQf(long j, String str) {
                this.a = j;
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CQf)) {
                    return false;
                }
                CQf cQf = (CQf) obj;
                return gq0.e(this.a, cQf.a) && ur1.a(this.b, cQf.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (gq0.m(this.a) * 31);
            }

            public final String toString() {
                return "Failed after " + ((Object) gq0.q(this.a));
            }
        }

        public static final class F1 extends QnHx {
            public static final F1 a = new F1();

            public final String toString() {
                return "Queued";
            }
        }

        public static final class LPt8Fixed extends QnHx {
            public static final LPt8Fixed a = new LPt8Fixed();

            public final String toString() {
                return "Running";
            }
        }

        /* JADX INFO: renamed from: d7$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0115QnHx extends QnHx {
            public final long a;

            public C0115QnHx(long j) {
                this.a = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0115QnHx) && gq0.e(this.a, ((C0115QnHx) obj).a);
            }

            public final int hashCode() {
                return gq0.m(this.a);
            }

            public final String toString() {
                return "Completed after " + ((Object) gq0.q(this.a));
            }
        }
    }

    public d7(String str, String str2, String str3, String str4, String str5, QnHx qnHx, s42 s42Var, s42 s42Var2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = qnHx;
        this.g = s42Var;
        this.h = s42Var2;
    }

    public static d7 a(d7 d7Var, String str, String str2, QnHx qnHx, s42 s42Var, s42 s42Var2, int i) {
        String str3 = (i & 1) != 0 ? d7Var.a : null;
        String str4 = (i & 2) != 0 ? d7Var.b : null;
        String str5 = (i & 4) != 0 ? d7Var.c : null;
        String str6 = (i & 8) != 0 ? d7Var.d : str;
        String str7 = (i & 16) != 0 ? d7Var.e : str2;
        QnHx qnHx2 = (i & 32) != 0 ? d7Var.f : qnHx;
        s42 s42Var3 = (i & 64) != 0 ? d7Var.g : s42Var;
        s42 s42Var4 = (i & 128) != 0 ? d7Var.h : s42Var2;
        d7Var.getClass();
        return new d7(str3, str4, str5, str6, str7, qnHx2, s42Var3, s42Var4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d7)) {
            return false;
        }
        d7 d7Var = (d7) obj;
        return ur1.a(this.a, d7Var.a) && ur1.a(this.b, d7Var.b) && ur1.a(this.c, d7Var.c) && ur1.a(this.d, d7Var.d) && ur1.a(this.e, d7Var.e) && ur1.a(this.f, d7Var.f) && ur1.a(this.g, d7Var.g) && ur1.a(this.h, d7Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + bl2.a(this.e, bl2.a(this.d, bl2.a(this.c, bl2.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31)) * 31)) * 31);
    }

    public final String toString() {
        return "BallastEventState(connectionId=" + this.a + ", viewModelName=" + this.b + ", uuid=" + this.c + ", type=" + this.d + ", toStringValue=" + this.e + ", status=" + this.f + ", firstSeen=" + this.g + ", lastSeen=" + this.h + ')';
    }
}
