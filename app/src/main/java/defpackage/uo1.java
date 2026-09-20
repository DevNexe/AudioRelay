package defpackage;

import android.graphics.Insets;

/* JADX INFO: loaded from: classes.dex */
public final class uo1 {
    public static final uo1 e = new uo1(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public static class QnHx {
        public static Insets a(int i, int i2, int i3, int i4) {
            return Insets.of(i, i2, i3, i4);
        }
    }

    public uo1(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static uo1 a(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new uo1(i, i2, i3, i4);
    }

    public static uo1 b(Insets insets) {
        return a(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets c() {
        return QnHx.a(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uo1.class != obj.getClass()) {
            return false;
        }
        uo1 uo1Var = (uo1) obj;
        return this.d == uo1Var.d && this.a == uo1Var.a && this.c == uo1Var.c && this.b == uo1Var.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return qc0.a(sb, this.d, '}');
    }
}
