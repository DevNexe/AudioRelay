package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class vv1 {
    public static final /* synthetic */ int c = 0;
    public final int a;
    public final sv1 b;

    public /* synthetic */ class QnHx {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[O.j(3).length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
            a = iArr;
        }
    }

    static {
        new vv1(0, null);
    }

    public vv1(int i, xb5 xb5Var) {
        String str;
        this.a = i;
        this.b = xb5Var;
        if ((i == 0) == (xb5Var == null)) {
            return;
        }
        if (i == 0) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + dj.d(i) + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv1)) {
            return false;
        }
        vv1 vv1Var = (vv1) obj;
        return this.a == vv1Var.a && ur1.a(this.b, vv1Var.b);
    }

    public final int hashCode() {
        int i = this.a;
        int iH = (i == 0 ? 0 : O.h(i)) * 31;
        sv1 sv1Var = this.b;
        return iH + (sv1Var != null ? sv1Var.hashCode() : 0);
    }

    public final String toString() {
        int i = this.a;
        int i2 = i == 0 ? -1 : QnHx.a[O.h(i)];
        if (i2 == -1) {
            return "*";
        }
        sv1 sv1Var = this.b;
        if (i2 == 1) {
            return String.valueOf(sv1Var);
        }
        if (i2 == 2) {
            return "in " + sv1Var;
        }
        if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return "out " + sv1Var;
    }
}
