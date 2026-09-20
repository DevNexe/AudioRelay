package defpackage;

import android.media.projection.MediaProjection;

/* JADX INFO: loaded from: classes.dex */
public abstract class VV4 {

    public static final class CQf extends VV4 {
        public static final CQf a = new CQf();
    }

    public static final class EQ extends VV4 {
        public final MediaProjection a;

        public EQ(MediaProjection mediaProjection) {
            this.a = mediaProjection;
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
            return "OnPlaybackCaptureGranted(mediaProjection=" + this.a + ")";
        }
    }

    public static final class F1 extends VV4 {
        public static final F1 a = new F1();
    }

    public static final class FJCM extends VV4 {
        public static final FJCM a = new FJCM();
    }

    public static final class LPt6Fixed extends VV4 {
        public final vb4 a;

        public LPt6Fixed(Qx0$ qx0$) {
            this.a = qx0$;
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
            return "StartServer(captureConfig=" + this.a + ")";
        }
    }

    public static final class LPt8Fixed extends VV4 {
        public final Throwable a;

        public LPt8Fixed(Throwable th) {
            this.a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LPt8Fixed) && ur1.a(this.a, ((LPt8Fixed) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "FailedToOpenSettings(error=" + this.a + ")";
        }
    }

    public static final class MZ extends VV4 {
        public final boolean a;

        public MZ(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MZ) && this.a == ((MZ) obj).a;
        }

        public final int hashCode() {
            boolean z = this.a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            return "SetupCardLoaded(shouldShow=" + this.a + ")";
        }
    }

    public static final class NUlFixed extends VV4 {
        public static final NUlFixed a = new NUlFixed();
    }

    public static final class PRnFixed extends VV4 {
        public final boolean a;
        public final boolean b;
        public final boolean c;

        public PRnFixed(boolean z, boolean z2, boolean z3) {
            this.a = z;
            this.b = z2;
            this.c = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PRnFixed)) {
                return false;
            }
            PRnFixed pRn = (PRnFixed) obj;
            return this.a == pRn.a && this.b == pRn.b && this.c == pRn.c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0 */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v5, types: [int] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r2v1, types: [int] */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4 */
        public final int hashCode() {
            boolean z = this.a;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            int i = r1 * 31;
            boolean z2 = this.b;
            ?? r2 = z2;
            if (z2) {
                r2 = 1;
            }
            int i2 = (i + r2) * 31;
            boolean z3 = this.c;
            return i2 + (z3 ? 1 : z3);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PermissionStateUpdated(hasPermission=");
            sb.append(this.a);
            sb.append(", shouldShowRationale=");
            sb.append(this.b);
            sb.append(", permissionRequested=");
            return Md5A.f(sb, this.c, ")");
        }
    }

    public static final class QnHx extends VV4 {
        public final wb4 a;

        public QnHx(wb4 wb4Var) {
            this.a = wb4Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof QnHx) && this.a == ((QnHx) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "AskPermissionAgain(type=" + this.a + ")";
        }
    }

    public static final class RBi extends VV4 {
        public final df4 a;

        public RBi(df4 df4Var) {
            this.a = df4Var;
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
            return "ServerStateLoaded(serverState=" + this.a + ")";
        }
    }

    public static final class T23 extends VV4 {
        public static final T23 a = new T23();
    }

    public static final class YKK extends VV4 {
        public static final YKK a = new YKK();
    }

    public static final class auxFixed extends VV4 {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof auxFixed)) {
                return false;
            }
            ((auxFixed) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "OnAudioRecordPermissionGranted(type=null)";
        }
    }

    public static final class byN extends VV4 {
        public static final byN a = new byN();
    }

    public static final class y extends VV4 {
        public final wb4 a;

        public y(wb4 wb4Var) {
            this.a = wb4Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof y) && this.a == ((y) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "RequestCapture(type=" + this.a + ")";
        }
    }
}
