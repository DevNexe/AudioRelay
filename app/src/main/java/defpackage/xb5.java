package defpackage;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmClassMappingKt;

/* JADX INFO: loaded from: classes3.dex */
public final class xb5 implements sv1 {
    public final gv1 a;
    public final List<vv1> b;
    public final sv1 c;
    public final int d;

    public static final class QnHx extends cx1 implements j81<vv1, CharSequence> {
        public QnHx() {
            super(1);
        }

        @Override // defpackage.j81
        public final CharSequence invoke(vv1 vv1Var) {
            String strE;
            vv1 vv1Var2 = vv1Var;
            xb5.this.getClass();
            int i = vv1Var2.a;
            if (i == 0) {
                return "*";
            }
            sv1 sv1Var = vv1Var2.b;
            xb5 xb5Var = sv1Var instanceof xb5 ? (xb5) sv1Var : null;
            String strValueOf = (xb5Var == null || (strE = xb5Var.e(true)) == null) ? String.valueOf(sv1Var) : strE;
            int iH = O.h(i);
            if (iH == 0) {
                return strValueOf;
            }
            if (iH == 1) {
                return "in ".concat(strValueOf);
            }
            if (iH == 2) {
                return "out ".concat(strValueOf);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public xb5() {
        throw null;
    }

    public xb5(ar arVar, List list, boolean z) {
        this.a = arVar;
        this.b = list;
        this.c = null;
        this.d = z ? 1 : 0;
    }

    @Override // defpackage.sv1
    public final boolean a() {
        return (this.d & 1) != 0;
    }

    @Override // defpackage.sv1
    public final List<vv1> c() {
        return this.b;
    }

    @Override // defpackage.sv1
    public final gv1 d() {
        return this.a;
    }

    public final String e(boolean z) {
        String name;
        gv1 gv1Var = this.a;
        fv1 fv1Var = gv1Var instanceof fv1 ? (fv1) gv1Var : null;
        Class javaClass = fv1Var != null ? JvmClassMappingKt.getJavaClass(fv1Var) : null;
        if (javaClass == null) {
            name = gv1Var.toString();
        } else if ((this.d & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (!javaClass.isArray()) {
            name = (z && javaClass.isPrimitive()) ? JvmClassMappingKt.getJavaObjectType((fv1) gv1Var).getName() : javaClass.getName();
        } else if (ur1.a(javaClass, boolean[].class)) {
            name = "kotlin.BooleanArray";
        } else if (ur1.a(javaClass, char[].class)) {
            name = "kotlin.CharArray";
        } else if (ur1.a(javaClass, byte[].class)) {
            name = "kotlin.ByteArray";
        } else if (ur1.a(javaClass, short[].class)) {
            name = "kotlin.ShortArray";
        } else if (ur1.a(javaClass, int[].class)) {
            name = "kotlin.IntArray";
        } else if (ur1.a(javaClass, float[].class)) {
            name = "kotlin.FloatArray";
        } else if (ur1.a(javaClass, long[].class)) {
            name = "kotlin.LongArray";
        } else {
            name = ur1.a(javaClass, double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
        }
        List<vv1> list = this.b;
        String strA = LPt6Fixed.a(name, list.isEmpty() ? "" : wu.M0(list, ", ", "<", ">", new QnHx(), 24), a() ? "?" : "");
        sv1 sv1Var = this.c;
        if (!(sv1Var instanceof xb5)) {
            return strA;
        }
        String strE = ((xb5) sv1Var).e(true);
        if (ur1.a(strE, strA)) {
            return strA;
        }
        if (ur1.a(strE, strA + '?')) {
            return strA + '!';
        }
        return "(" + strA + ".." + strE + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xb5) {
            xb5 xb5Var = (xb5) obj;
            if (ur1.a(this.a, xb5Var.a)) {
                if (ur1.a(this.b, xb5Var.b) && ur1.a(this.c, xb5Var.c) && this.d == xb5Var.d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.valueOf(this.d).hashCode() + qg5.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return e(false) + " (Kotlin reflection is not available)";
    }
}
