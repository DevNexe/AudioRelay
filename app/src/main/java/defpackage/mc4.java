package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface mc4 {

    public static final class CQf {
        public final String a;
        public final yb4 b;
        public final long c;

        public CQf(String str, yb4 yb4Var, long j) {
            this.a = str;
            this.b = yb4Var;
            this.c = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CQf)) {
                return false;
            }
            CQf cQf = (CQf) obj;
            return ur1.a(this.a, cQf.a) && ur1.a(this.b, cQf.b) && this.c == cQf.c;
        }

        public final int hashCode() {
            int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
            long j = this.c;
            return iHashCode + ((int) (j ^ (j >>> 32)));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Server(ipAddress=");
            sb.append(this.a);
            sb.append(", config=");
            sb.append(this.b);
            sb.append(", lastSeenTimeInMs=");
            return hc2.a(sb, this.c, ")");
        }
    }

    public enum F1 {
        Paused,
        Searching
    }

    public static abstract class QnHx {

        public static final class CQf extends QnHx {
            public final List<CQf> a;

            public CQf(List<CQf> list) {
                this.a = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CQf) && ur1.a(this.a, ((CQf) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Success(servers=" + this.a + ")";
            }
        }

        /* JADX INFO: renamed from: mc4$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0168QnHx extends QnHx {
            public final Throwable a;

            public C0168QnHx(Throwable th) {
                this.a = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0168QnHx) && ur1.a(this.a, ((C0168QnHx) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Failure(error=" + this.a + ")";
            }
        }
    }

    am a();

    Object b(vd4 vd4Var);

    am getState();
}
