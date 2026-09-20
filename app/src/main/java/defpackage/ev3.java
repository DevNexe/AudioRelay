package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class ev3 {

    public static final class Aa extends ev3 {
        public static final Aa a = new Aa();
    }

    public static final class CQf extends ev3 {
        public final pb.QnHx a;

        public CQf(pb.QnHx qnHx) {
            this.a = qnHx;
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
            return "BluetoothStateChanged(state=" + this.a + ")";
        }
    }

    public static final class Com1Fixed extends ev3 {
        public final boolean a;

        public Com1Fixed(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Com1Fixed) && this.a == ((Com1Fixed) obj).a;
        }

        public final int hashCode() {
            boolean z = this.a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            return "ToggleVolumeShaper(shouldEnable=" + this.a + ")";
        }
    }

    public static final class EQ extends ev3 {
        public final Throwable a;

        public EQ(Throwable th) {
            this.a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EQ) && ur1.a(this.a, ((EQ) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "FailedToOpenSettings(error=" + this.a + ")";
        }
    }

    public static final class F1 extends ev3 {
        public final wb4 a;

        public F1(wb4 wb4Var) {
            this.a = wb4Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof F1) && this.a == ((F1) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "CaptureTypeLoaded(type=" + this.a + ")";
        }
    }

    public static final class FJCM extends ev3 {
        public static final FJCM a = new FJCM();
    }

    public static final class LPt6Fixed extends ev3 {
        public final dg2 a;

        public LPt6Fixed(dg2 dg2Var) {
            this.a = dg2Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LPt6Fixed) && ur1.a(this.a, ((LPt6Fixed) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "MicVolumeSettingsLoaded(settings=" + this.a + ")";
        }
    }

    public static final class LPt8Fixed extends ev3 {
        public final int a;
        public final boolean b;

        public LPt8Fixed(int i, boolean z) {
            this.a = i;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LPt8Fixed)) {
                return false;
            }
            LPt8Fixed lPt8 = (LPt8Fixed) obj;
            return this.a == lPt8.a && this.b == lPt8.b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        public final int hashCode() {
            int iH = O.h(this.a) * 31;
            boolean z = this.b;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            return iH + r1;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChangeMicEffect(effect=");
            sb.append(he2.b(this.a));
            sb.append(", enabled=");
            return Md5A.f(sb, this.b, ")");
        }
    }

    public static final class LPt9Fixed extends ev3 {
        public final kc4 a;

        public LPt9Fixed(kc4 kc4Var) {
            this.a = kc4Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LPt9Fixed) && ur1.a(this.a, ((LPt9Fixed) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ServerInfoLoaded(info=" + this.a + ")";
        }
    }

    public static final class MZ extends ev3 {
        public final te2 a;

        public MZ(te2 te2Var) {
            this.a = te2Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MZ) && ur1.a(this.a, ((MZ) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "MicNoiseRemovalSettingsLoaded(settings=" + this.a + ")";
        }
    }

    public static final class NUlFixed extends ev3 {
        public final oe2 a;

        public NUlFixed(oe2 oe2Var) {
            this.a = oe2Var;
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
            return "ChangeMicMode(mode=" + this.a + ")";
        }
    }

    public static final class PRnFixed extends ev3 {
        public final boolean a;

        public PRnFixed(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PRnFixed) && this.a == ((PRnFixed) obj).a;
        }

        public final int hashCode() {
            boolean z = this.a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            return "IsPremiumLoaded(isPremium=" + this.a + ")";
        }
    }

    public static final class QnHx extends ev3 {
        public static final QnHx a = new QnHx();
    }

    public static final class RBi extends ev3 {
        public final re2 a;

        public RBi(re2 re2Var) {
            this.a = re2Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RBi) && ur1.a(this.a, ((RBi) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "MicModeSettingsLoaded(settings=" + this.a + ")";
        }
    }

    public static final class SjP extends ev3 {
        public final zk5.QnHx a;

        public SjP(zk5.QnHx.C0234QnHx c0234QnHx) {
            this.a = c0234QnHx;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SjP) && ur1.a(this.a, ((SjP) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SetVolumeShaperStrategy(strategy=" + this.a + ")";
        }
    }

    public static final class T23 extends ev3 {
        public static final T23 a = new T23();
    }

    public static final class WE extends ev3 {
        public static final WE a = new WE();
    }

    public static final class Xn1 extends ev3 {
        public final int a;

        public Xn1(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Xn1) && this.a == ((Xn1) obj).a;
        }

        public final int hashCode() {
            return O.h(this.a);
        }

        public final String toString() {
            return "NavigateToPremium(origin=" + GM.c(this.a) + ")";
        }
    }

    public static final class YKK extends ev3 {
        public final vz4.QnHx a;

        public YKK(vz4.QnHx qnHx) {
            this.a = qnHx;
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
            return "ClientListenerErrorOccurred(error=" + this.a + ")";
        }
    }

    public static final class Z extends ev3 {
        public final boolean a;

        public Z(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Z) && this.a == ((Z) obj).a;
        }

        public final int hashCode() {
            boolean z = this.a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            return "ToggleNoiseRemoval(shouldEnable=" + this.a + ")";
        }
    }

    public static final class auxFixed extends ev3 {
        public static final auxFixed a = new auxFixed();
    }

    public static final class byN extends ev3 {
        public static final byN a = new byN();
    }

    public static final class ck32 extends ev3 {
        public final int a;

        public ck32(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ck32) {
                return this.a == ((ck32) obj).a;
            }
            return false;
        }

        public final int hashCode() {
            return this.a;
        }

        public final String toString() {
            return fc2.a("SetVolumeGainAmount(gain=", ex0.c(new StringBuilder("Db(value="), this.a, ")"), ")");
        }
    }

    public static final class ct extends ev3 {
        public static final ct a = new ct();
    }

    public static final class lPt3Fixed extends ev3 {
        public final List<qf4> a;

        public lPt3Fixed(List<qf4> list) {
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lPt3Fixed) && ur1.a(this.a, ((lPt3Fixed) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SessionsChanged(sessions=" + this.a + ")";
        }
    }

    public static final class qc extends ev3 {
        public final String a;
        public final cv3 b;
        public final Map<of4, gl0> c;

        public qc(String str, cv3 cv3Var, Map<of4, gl0> map) {
            this.a = str;
            this.b = cv3Var;
            this.c = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof qc)) {
                return false;
            }
            qc qcVar = (qc) obj;
            return ur1.a(this.a, qcVar.a) && ur1.a(this.b, qcVar.b) && ur1.a(this.c, qcVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "TimerRelatedLoaded(formattedSessionTime=" + this.a + ", captureLatency=" + this.b + ", disconnectTimers=" + this.c + ")";
        }
    }

    public static final class ta extends ev3 {
        public static final ta a = new ta();
    }

    public static final class y extends ev3 {
        public final ne2 a;

        public y(ne2 ne2Var) {
            this.a = ne2Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof y) && ur1.a(this.a, ((y) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "MicEffectSettingsLoaded(settings=" + this.a + ")";
        }
    }
}
