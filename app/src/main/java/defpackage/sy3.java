package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class sy3 {

    public static final class CQf extends sy3 {
        public static final CQf a = new CQf();
    }

    public static final class EQ extends sy3 {
        public final vy3 a;
        public final vp b;

        public EQ(vy3 vy3Var, vp vpVar) {
            this.a = vy3Var;
            this.b = vpVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EQ)) {
                return false;
            }
            EQ eq = (EQ) obj;
            return ur1.a(this.a, eq.a) && ur1.a(this.b, eq.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "StatsLoaded(stats=" + this.a + ", chartData=" + this.b + ")";
        }
    }

    public static final class F1 extends sy3 {
        public static final F1 a = new F1();
    }

    public static final class FJCM extends sy3 {
        public static final FJCM a = new FJCM();
    }

    public static final class LPt8Fixed extends sy3 {
        public static final LPt8Fixed a = new LPt8Fixed();
    }

    public static final class NUlFixed extends sy3 {
        public final List<mp2> a;

        public NUlFixed(List<mp2> list) {
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NUlFixed) && ur1.a(this.a, ((NUlFixed) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "NoticesLoaded(notices=" + this.a + ")";
        }
    }

    public static final class PRnFixed extends sy3 {
        public static final PRnFixed a = new PRnFixed();
    }

    public static final class QnHx extends sy3 {
        public final vz4.QnHx a;

        public QnHx(vz4.QnHx qnHx) {
            this.a = qnHx;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof QnHx) && ur1.a(this.a, ((QnHx) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "AudioPlayerErrorLoaded(error=" + this.a + ")";
        }
    }

    public static final class T23 extends sy3 {
        public final mp2 a;

        public T23(mp2 mp2Var) {
            this.a = mp2Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof T23) && ur1.a(this.a, ((T23) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ShowHelp(notice=" + this.a + ")";
        }
    }

    public static final class YKK extends sy3 {
        public final ty3 a;

        public YKK(ty3 ty3Var) {
            this.a = ty3Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof YKK) && ur1.a(this.a, ((YKK) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ServerLoaded(server=" + this.a + ")";
        }
    }

    public static final class auxFixed extends sy3 {
        public final boolean a;

        public auxFixed(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof auxFixed) && this.a == ((auxFixed) obj).a;
        }

        public final int hashCode() {
            boolean z = this.a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            return "ShouldShowAudioOutputSettingsCardLoaded(value=" + this.a + ")";
        }
    }

    public static final class byN extends sy3 {
        public static final byN a = new byN();
    }

    public static final class y extends sy3 {
        public static final y a = new y();
    }
}
