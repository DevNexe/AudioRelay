package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ah1 {
    public static final CQf d = new CQf();
    public static final Dt<ah1> e = new Dt<>("TimeoutPlugin");
    public final Long a;
    public final Long b;
    public final Long c;

    public static final class CQf implements kf1<QnHx, ah1>, ff1<QnHx> {
        @Override // defpackage.kf1
        public final void a(ah1 ah1Var, ue1 ue1Var) {
            ue1Var.A.f(pg1.f, new bh1(ah1Var, ue1Var, null));
        }

        @Override // defpackage.kf1
        public final ah1 b(j81<? super QnHx, sd5> j81Var) {
            QnHx qnHx = new QnHx();
            j81Var.invoke(qnHx);
            return new ah1(qnHx.a, qnHx.b, qnHx.c);
        }

        @Override // defpackage.kf1
        public final Dt<ah1> getKey() {
            return ah1.e;
        }
    }

    public static final class QnHx {
        public Long a;
        public Long b;
        public Long c;

        static {
            if ("TimeoutConfiguration".length() == 0) {
                throw new IllegalStateException("Name can't be blank");
            }
        }

        public QnHx() {
            this.a = 0L;
            this.b = 0L;
            this.c = 0L;
            a(null);
            this.a = null;
            a(null);
            this.b = null;
            a(null);
            this.c = null;
        }

        public static void a(Long l) {
            if (!(l == null || l.longValue() > 0)) {
                throw new IllegalArgumentException("Only positive timeout values are allowed, for infinite timeout use HttpTimeout.INFINITE_TIMEOUT_MS".toString());
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !ur1.a(nl3.a(QnHx.class), nl3.a(obj.getClass()))) {
                return false;
            }
            QnHx qnHx = (QnHx) obj;
            return ur1.a(this.a, qnHx.a) && ur1.a(this.b, qnHx.b) && ur1.a(this.c, qnHx.c);
        }

        public final int hashCode() {
            Long l = this.a;
            int iHashCode = (l != null ? l.hashCode() : 0) * 31;
            Long l2 = this.b;
            int iHashCode2 = (iHashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
            Long l3 = this.c;
            return iHashCode2 + (l3 != null ? l3.hashCode() : 0);
        }
    }

    public ah1(Long l, Long l2, Long l3) {
        this.a = l;
        this.b = l2;
        this.c = l3;
    }
}
