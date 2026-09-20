package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class h70 {
    public static final h70 i = new h70(new QnHx());
    public co2 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public long f;
    public long g;
    public p80 h;

    public static final class QnHx {
        public co2 a = co2.NOT_REQUIRED;
        public final p80 b = new p80();
    }

    public h70() {
        this.a = co2.NOT_REQUIRED;
        this.f = -1L;
        this.g = -1L;
        this.h = new p80();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h70.class != obj.getClass()) {
            return false;
        }
        h70 h70Var = (h70) obj;
        if (this.b == h70Var.b && this.c == h70Var.c && this.d == h70Var.d && this.e == h70Var.e && this.f == h70Var.f && this.g == h70Var.g && this.a == h70Var.a) {
            return this.h.equals(h70Var.h);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31;
        long j = this.f;
        int i2 = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.g;
        return this.h.hashCode() + ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public h70(QnHx qnHx) {
        this.a = co2.NOT_REQUIRED;
        this.f = -1L;
        this.g = -1L;
        this.h = new p80();
        this.b = false;
        int i2 = Build.VERSION.SDK_INT;
        this.c = false;
        this.a = qnHx.a;
        this.d = false;
        this.e = false;
        if (i2 >= 24) {
            this.h = qnHx.b;
            this.f = -1L;
            this.g = -1L;
        }
    }

    public h70(h70 h70Var) {
        this.a = co2.NOT_REQUIRED;
        this.f = -1L;
        this.g = -1L;
        this.h = new p80();
        this.b = h70Var.b;
        this.c = h70Var.c;
        this.a = h70Var.a;
        this.d = h70Var.d;
        this.e = h70Var.e;
        this.h = h70Var.h;
    }
}
