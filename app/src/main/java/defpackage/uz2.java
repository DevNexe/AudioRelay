package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class uz2 {
    public final boolean a;
    public final boolean b;

    public static final class CQf extends uz2 {
        public static final CQf c = new CQf();

        public CQf() {
            super(false, false, 3);
        }
    }

    public static final class EQ extends uz2 {
        public final float c;
        public final float d;
        public final float e;
        public final boolean f;
        public final boolean g;
        public final float h;
        public final float i;

        public EQ(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            super(false, false, 3);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = z;
            this.g = z2;
            this.h = f4;
            this.i = f5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EQ)) {
                return false;
            }
            EQ eq = (EQ) obj;
            return ur1.a(Float.valueOf(this.c), Float.valueOf(eq.c)) && ur1.a(Float.valueOf(this.d), Float.valueOf(eq.d)) && ur1.a(Float.valueOf(this.e), Float.valueOf(eq.e)) && this.f == eq.f && this.g == eq.g && ur1.a(Float.valueOf(this.h), Float.valueOf(eq.h)) && ur1.a(Float.valueOf(this.i), Float.valueOf(eq.i));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        /* JADX WARN: Type inference failed for: r0v7, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r2v2, types: [int] */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v6 */
        public final int hashCode() {
            int iB = ry0.b(this.e, ry0.b(this.d, Float.floatToIntBits(this.c) * 31, 31), 31);
            boolean z = this.f;
            ?? r2 = z;
            if (z) {
                r2 = 1;
            }
            int i = (iB + r2) * 31;
            boolean z2 = this.g;
            return Float.floatToIntBits(this.i) + ry0.b(this.h, (i + (z2 ? 1 : z2)) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
            sb.append(this.c);
            sb.append(", verticalEllipseRadius=");
            sb.append(this.d);
            sb.append(", theta=");
            sb.append(this.e);
            sb.append(", isMoreThanHalf=");
            sb.append(this.f);
            sb.append(", isPositiveArc=");
            sb.append(this.g);
            sb.append(", arcStartDx=");
            sb.append(this.h);
            sb.append(", arcStartDy=");
            return dj.b(sb, this.i, ')');
        }
    }

    public static final class F1 extends uz2 {
        public final float c;
        public final float d;
        public final float e;
        public final float f;
        public final float g;
        public final float h;

        public F1(float f, float f2, float f3, float f4, float f5, float f6) {
            super(true, false, 2);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = f4;
            this.g = f5;
            this.h = f6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof F1)) {
                return false;
            }
            F1 f1 = (F1) obj;
            return ur1.a(Float.valueOf(this.c), Float.valueOf(f1.c)) && ur1.a(Float.valueOf(this.d), Float.valueOf(f1.d)) && ur1.a(Float.valueOf(this.e), Float.valueOf(f1.e)) && ur1.a(Float.valueOf(this.f), Float.valueOf(f1.f)) && ur1.a(Float.valueOf(this.g), Float.valueOf(f1.g)) && ur1.a(Float.valueOf(this.h), Float.valueOf(f1.h));
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.h) + ry0.b(this.g, ry0.b(this.f, ry0.b(this.e, ry0.b(this.d, Float.floatToIntBits(this.c) * 31, 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CurveTo(x1=");
            sb.append(this.c);
            sb.append(", y1=");
            sb.append(this.d);
            sb.append(", x2=");
            sb.append(this.e);
            sb.append(", y2=");
            sb.append(this.f);
            sb.append(", x3=");
            sb.append(this.g);
            sb.append(", y3=");
            return dj.b(sb, this.h, ')');
        }
    }

    public static final class FJCM extends uz2 {
        public final float c;
        public final float d;
        public final float e;
        public final float f;
        public final float g;
        public final float h;

        public FJCM(float f, float f2, float f3, float f4, float f5, float f6) {
            super(true, false, 2);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = f4;
            this.g = f5;
            this.h = f6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FJCM)) {
                return false;
            }
            FJCM fjcm = (FJCM) obj;
            return ur1.a(Float.valueOf(this.c), Float.valueOf(fjcm.c)) && ur1.a(Float.valueOf(this.d), Float.valueOf(fjcm.d)) && ur1.a(Float.valueOf(this.e), Float.valueOf(fjcm.e)) && ur1.a(Float.valueOf(this.f), Float.valueOf(fjcm.f)) && ur1.a(Float.valueOf(this.g), Float.valueOf(fjcm.g)) && ur1.a(Float.valueOf(this.h), Float.valueOf(fjcm.h));
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.h) + ry0.b(this.g, ry0.b(this.f, ry0.b(this.e, ry0.b(this.d, Float.floatToIntBits(this.c) * 31, 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeCurveTo(dx1=");
            sb.append(this.c);
            sb.append(", dy1=");
            sb.append(this.d);
            sb.append(", dx2=");
            sb.append(this.e);
            sb.append(", dy2=");
            sb.append(this.f);
            sb.append(", dx3=");
            sb.append(this.g);
            sb.append(", dy3=");
            return dj.b(sb, this.h, ')');
        }
    }

    public static final class LPt6Fixed extends uz2 {
        public final float c;
        public final float d;
        public final float e;
        public final float f;

        public LPt6Fixed(float f, float f2, float f3, float f4) {
            super(true, false, 2);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = f4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LPt6Fixed)) {
                return false;
            }
            LPt6Fixed lPt6 = (LPt6Fixed) obj;
            return ur1.a(Float.valueOf(this.c), Float.valueOf(lPt6.c)) && ur1.a(Float.valueOf(this.d), Float.valueOf(lPt6.d)) && ur1.a(Float.valueOf(this.e), Float.valueOf(lPt6.e)) && ur1.a(Float.valueOf(this.f), Float.valueOf(lPt6.f));
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f) + ry0.b(this.e, ry0.b(this.d, Float.floatToIntBits(this.c) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
            sb.append(this.c);
            sb.append(", dy1=");
            sb.append(this.d);
            sb.append(", dx2=");
            sb.append(this.e);
            sb.append(", dy2=");
            return dj.b(sb, this.f, ')');
        }
    }

    public static final class LPt8Fixed extends uz2 {
        public final float c;

        public LPt8Fixed(float f) {
            super(false, false, 3);
            this.c = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LPt8Fixed) && ur1.a(Float.valueOf(this.c), Float.valueOf(((LPt8Fixed) obj).c));
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.c);
        }

        public final String toString() {
            return dj.b(new StringBuilder("HorizontalTo(x="), this.c, ')');
        }
    }

    public static final class LPt9Fixed extends uz2 {
        public final float c;

        public LPt9Fixed(float f) {
            super(false, false, 3);
            this.c = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LPt9Fixed) && ur1.a(Float.valueOf(this.c), Float.valueOf(((LPt9Fixed) obj).c));
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.c);
        }

        public final String toString() {
            return dj.b(new StringBuilder("VerticalTo(y="), this.c, ')');
        }
    }

    public static final class MZ extends uz2 {
        public final float c;
        public final float d;
        public final float e;
        public final float f;

        public MZ(float f, float f2, float f3, float f4) {
            super(false, true, 1);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = f4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MZ)) {
                return false;
            }
            MZ mz = (MZ) obj;
            return ur1.a(Float.valueOf(this.c), Float.valueOf(mz.c)) && ur1.a(Float.valueOf(this.d), Float.valueOf(mz.d)) && ur1.a(Float.valueOf(this.e), Float.valueOf(mz.e)) && ur1.a(Float.valueOf(this.f), Float.valueOf(mz.f));
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f) + ry0.b(this.e, ry0.b(this.d, Float.floatToIntBits(this.c) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeQuadTo(dx1=");
            sb.append(this.c);
            sb.append(", dy1=");
            sb.append(this.d);
            sb.append(", dx2=");
            sb.append(this.e);
            sb.append(", dy2=");
            return dj.b(sb, this.f, ')');
        }
    }

    public static final class NUlFixed extends uz2 {
        public final float c;
        public final float d;

        public NUlFixed(float f, float f2) {
            super(false, false, 3);
            this.c = f;
            this.d = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NUlFixed)) {
                return false;
            }
            NUlFixed nUl = (NUlFixed) obj;
            return ur1.a(Float.valueOf(this.c), Float.valueOf(nUl.c)) && ur1.a(Float.valueOf(this.d), Float.valueOf(nUl.d));
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.d) + (Float.floatToIntBits(this.c) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LineTo(x=");
            sb.append(this.c);
            sb.append(", y=");
            return dj.b(sb, this.d, ')');
        }
    }

    public static final class PRnFixed extends uz2 {
        public final float c;

        public PRnFixed(float f) {
            super(false, false, 3);
            this.c = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PRnFixed) && ur1.a(Float.valueOf(this.c), Float.valueOf(((PRnFixed) obj).c));
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.c);
        }

        public final String toString() {
            return dj.b(new StringBuilder("RelativeHorizontalTo(dx="), this.c, ')');
        }
    }

    public static final class QnHx extends uz2 {
        public final float c;
        public final float d;
        public final float e;
        public final boolean f;
        public final boolean g;
        public final float h;
        public final float i;

        public QnHx(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            super(false, false, 3);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = z;
            this.g = z2;
            this.h = f4;
            this.i = f5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QnHx)) {
                return false;
            }
            QnHx qnHx = (QnHx) obj;
            return ur1.a(Float.valueOf(this.c), Float.valueOf(qnHx.c)) && ur1.a(Float.valueOf(this.d), Float.valueOf(qnHx.d)) && ur1.a(Float.valueOf(this.e), Float.valueOf(qnHx.e)) && this.f == qnHx.f && this.g == qnHx.g && ur1.a(Float.valueOf(this.h), Float.valueOf(qnHx.h)) && ur1.a(Float.valueOf(this.i), Float.valueOf(qnHx.i));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        /* JADX WARN: Type inference failed for: r0v7, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r2v2, types: [int] */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v6 */
        public final int hashCode() {
            int iB = ry0.b(this.e, ry0.b(this.d, Float.floatToIntBits(this.c) * 31, 31), 31);
            boolean z = this.f;
            ?? r2 = z;
            if (z) {
                r2 = 1;
            }
            int i = (iB + r2) * 31;
            boolean z2 = this.g;
            return Float.floatToIntBits(this.i) + ry0.b(this.h, (i + (z2 ? 1 : z2)) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ArcTo(horizontalEllipseRadius=");
            sb.append(this.c);
            sb.append(", verticalEllipseRadius=");
            sb.append(this.d);
            sb.append(", theta=");
            sb.append(this.e);
            sb.append(", isMoreThanHalf=");
            sb.append(this.f);
            sb.append(", isPositiveArc=");
            sb.append(this.g);
            sb.append(", arcStartX=");
            sb.append(this.h);
            sb.append(", arcStartY=");
            return dj.b(sb, this.i, ')');
        }
    }

    public static final class RBi extends uz2 {
        public final float c;
        public final float d;

        public RBi(float f, float f2) {
            super(false, false, 3);
            this.c = f;
            this.d = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RBi)) {
                return false;
            }
            RBi rBi = (RBi) obj;
            return ur1.a(Float.valueOf(this.c), Float.valueOf(rBi.c)) && ur1.a(Float.valueOf(this.d), Float.valueOf(rBi.d));
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.d) + (Float.floatToIntBits(this.c) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeMoveTo(dx=");
            sb.append(this.c);
            sb.append(", dy=");
            return dj.b(sb, this.d, ')');
        }
    }

    public static final class T23 extends uz2 {
        public final float c;
        public final float d;
        public final float e;
        public final float f;

        public T23(float f, float f2, float f3, float f4) {
            super(true, false, 2);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = f4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof T23)) {
                return false;
            }
            T23 t23 = (T23) obj;
            return ur1.a(Float.valueOf(this.c), Float.valueOf(t23.c)) && ur1.a(Float.valueOf(this.d), Float.valueOf(t23.d)) && ur1.a(Float.valueOf(this.e), Float.valueOf(t23.e)) && ur1.a(Float.valueOf(this.f), Float.valueOf(t23.f));
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f) + ry0.b(this.e, ry0.b(this.d, Float.floatToIntBits(this.c) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ReflectiveCurveTo(x1=");
            sb.append(this.c);
            sb.append(", y1=");
            sb.append(this.d);
            sb.append(", x2=");
            sb.append(this.e);
            sb.append(", y2=");
            return dj.b(sb, this.f, ')');
        }
    }

    public static final class Xn1 extends uz2 {
        public final float c;
        public final float d;

        public Xn1(float f, float f2) {
            super(false, true, 1);
            this.c = f;
            this.d = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Xn1)) {
                return false;
            }
            Xn1 xn1 = (Xn1) obj;
            return ur1.a(Float.valueOf(this.c), Float.valueOf(xn1.c)) && ur1.a(Float.valueOf(this.d), Float.valueOf(xn1.d));
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.d) + (Float.floatToIntBits(this.c) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeReflectiveQuadTo(dx=");
            sb.append(this.c);
            sb.append(", dy=");
            return dj.b(sb, this.d, ')');
        }
    }

    public static final class YKK extends uz2 {
        public final float c;
        public final float d;

        public YKK(float f, float f2) {
            super(false, false, 3);
            this.c = f;
            this.d = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof YKK)) {
                return false;
            }
            YKK ykk = (YKK) obj;
            return ur1.a(Float.valueOf(this.c), Float.valueOf(ykk.c)) && ur1.a(Float.valueOf(this.d), Float.valueOf(ykk.d));
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.d) + (Float.floatToIntBits(this.c) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MoveTo(x=");
            sb.append(this.c);
            sb.append(", y=");
            return dj.b(sb, this.d, ')');
        }
    }

    public static final class auxFixed extends uz2 {
        public final float c;
        public final float d;
        public final float e;
        public final float f;

        public auxFixed(float f, float f2, float f3, float f4) {
            super(false, true, 1);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = f4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof auxFixed)) {
                return false;
            }
            auxFixed auxVar = (auxFixed) obj;
            return ur1.a(Float.valueOf(this.c), Float.valueOf(auxVar.c)) && ur1.a(Float.valueOf(this.d), Float.valueOf(auxVar.d)) && ur1.a(Float.valueOf(this.e), Float.valueOf(auxVar.e)) && ur1.a(Float.valueOf(this.f), Float.valueOf(auxVar.f));
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f) + ry0.b(this.e, ry0.b(this.d, Float.floatToIntBits(this.c) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("QuadTo(x1=");
            sb.append(this.c);
            sb.append(", y1=");
            sb.append(this.d);
            sb.append(", x2=");
            sb.append(this.e);
            sb.append(", y2=");
            return dj.b(sb, this.f, ')');
        }
    }

    public static final class byN extends uz2 {
        public final float c;
        public final float d;

        public byN(float f, float f2) {
            super(false, true, 1);
            this.c = f;
            this.d = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof byN)) {
                return false;
            }
            byN byn = (byN) obj;
            return ur1.a(Float.valueOf(this.c), Float.valueOf(byn.c)) && ur1.a(Float.valueOf(this.d), Float.valueOf(byn.d));
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.d) + (Float.floatToIntBits(this.c) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ReflectiveQuadTo(x=");
            sb.append(this.c);
            sb.append(", y=");
            return dj.b(sb, this.d, ')');
        }
    }

    public static final class ta extends uz2 {
        public final float c;

        public ta(float f) {
            super(false, false, 3);
            this.c = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ta) && ur1.a(Float.valueOf(this.c), Float.valueOf(((ta) obj).c));
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.c);
        }

        public final String toString() {
            return dj.b(new StringBuilder("RelativeVerticalTo(dy="), this.c, ')');
        }
    }

    public static final class y extends uz2 {
        public final float c;
        public final float d;

        public y(float f, float f2) {
            super(false, false, 3);
            this.c = f;
            this.d = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof y)) {
                return false;
            }
            y yVar = (y) obj;
            return ur1.a(Float.valueOf(this.c), Float.valueOf(yVar.c)) && ur1.a(Float.valueOf(this.d), Float.valueOf(yVar.d));
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.d) + (Float.floatToIntBits(this.c) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeLineTo(dx=");
            sb.append(this.c);
            sb.append(", dy=");
            return dj.b(sb, this.d, ')');
        }
    }

    public uz2(boolean z, boolean z2, int i) {
        z = (i & 1) != 0 ? false : z;
        z2 = (i & 2) != 0 ? false : z2;
        this.a = z;
        this.b = z2;
    }
}
