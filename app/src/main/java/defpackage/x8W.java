package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class x8W {

    public static final class CQf extends x8W {
        public static final CQf a = new CQf();
    }

    public static final class F1 extends x8W {
        public static final F1 a = new F1();
    }

    public static final class LPt8Fixed extends x8W {
        public final rv2<V> a;
        public final Kgd b;

        public LPt8Fixed(rv2<V> rv2Var, Kgd kgd) {
            this.a = rv2Var;
            this.b = kgd;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LPt8Fixed)) {
                return false;
            }
            LPt8Fixed lPt8 = (LPt8Fixed) obj;
            return ur1.a(this.a, lPt8.a) && this.b == lPt8.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "InitializationLoaded(bannerOptionsOpt=" + this.a + ", shouldHideBanner=" + this.b + ")";
        }
    }

    public static final class NUlFixed extends x8W {
        public static final NUlFixed a = new NUlFixed();
    }

    public static final class QnHx extends x8W {
        public static final QnHx a = new QnHx();
    }

    public static final class YKK extends x8W {
        public static final YKK a = new YKK();
    }
}
