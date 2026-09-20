package defpackage;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class w60 {
    public final e70 b;
    public final QnHx c;
    public w60 d;
    public kq4 g;
    public HashSet<w60> a = null;
    public int e = 0;
    public int f = -1;

    public enum QnHx {
        /* JADX INFO: Fake field, exist only in values array */
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public w60(e70 e70Var, QnHx qnHx) {
        this.b = e70Var;
        this.c = qnHx;
    }

    public final void a(w60 w60Var, int i, int i2) {
        if (w60Var == null) {
            e();
            return;
        }
        this.d = w60Var;
        if (w60Var.a == null) {
            w60Var.a = new HashSet<>();
        }
        this.d.a.add(this);
        if (i > 0) {
            this.e = i;
        } else {
            this.e = 0;
        }
        this.f = i2;
    }

    public final int b() {
        w60 w60Var;
        if (this.b.X == 8) {
            return 0;
        }
        int i = this.f;
        return (i <= -1 || (w60Var = this.d) == null || w60Var.b.X != 8) ? this.e : i;
    }

    public final boolean c() {
        w60 w60Var;
        HashSet<w60> hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        for (w60 w60Var2 : hashSet) {
            QnHx qnHx = w60Var2.c;
            int iOrdinal = qnHx.ordinal();
            e70 e70Var = w60Var2.b;
            switch (iOrdinal) {
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                    w60Var = null;
                    break;
                case 1:
                    w60Var = e70Var.A;
                    break;
                case 2:
                    w60Var = e70Var.B;
                    break;
                case 3:
                    w60Var = e70Var.y;
                    break;
                case 4:
                    w60Var = e70Var.z;
                    break;
                default:
                    throw new AssertionError(qnHx.name());
            }
            if (w60Var.d()) {
                return true;
            }
        }
        return false;
    }

    public final boolean d() {
        return this.d != null;
    }

    public final void e() {
        HashSet<w60> hashSet;
        w60 w60Var = this.d;
        if (w60Var != null && (hashSet = w60Var.a) != null) {
            hashSet.remove(this);
        }
        this.d = null;
        this.e = 0;
        this.f = -1;
    }

    public final void f() {
        kq4 kq4Var = this.g;
        if (kq4Var == null) {
            this.g = new kq4(1);
        } else {
            kq4Var.c();
        }
    }

    public final String toString() {
        return this.b.Y + ":" + this.c.toString();
    }
}
