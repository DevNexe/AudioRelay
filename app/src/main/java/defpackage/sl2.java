package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sl2 {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final String j;

    public static final class QnHx {
        public String b;
        public boolean c;
        public boolean d;
        public int a = -1;
        public int e = -1;
        public int f = -1;
        public int g = -1;
        public int h = -1;
    }

    public sl2(boolean z, boolean z2, int i, boolean z3, boolean z4, int i2, int i3, int i4, int i5) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = z3;
        this.e = z4;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !ur1.a(sl2.class, obj.getClass())) {
            return false;
        }
        sl2 sl2Var = (sl2) obj;
        return this.a == sl2Var.a && this.b == sl2Var.b && this.c == sl2Var.c && ur1.a(this.j, sl2Var.j) && this.d == sl2Var.d && this.e == sl2Var.e && this.f == sl2Var.f && this.g == sl2Var.g && this.h == sl2Var.h && this.i == sl2Var.i;
    }

    public final int hashCode() {
        int i = (((((this.a ? 1 : 0) * 31) + (this.b ? 1 : 0)) * 31) + this.c) * 31;
        String str = this.j;
        return ((((((((((((i + (str != null ? str.hashCode() : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public sl2(boolean z, boolean z2, String str, boolean z3, boolean z4, int i, int i2, int i3, int i4) {
        this(z, z2, dl2.QnHx.a(str).hashCode(), z3, z4, i, i2, i3, i4);
        int i5 = dl2.E;
        this.j = str;
    }
}
