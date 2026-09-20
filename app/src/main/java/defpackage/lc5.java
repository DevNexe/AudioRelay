package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lc5 {
    public final e41 a;
    public final x41 b;
    public final int c;
    public final int d;
    public final Object e;

    public lc5(e41 e41Var, x41 x41Var, int i, int i2, Object obj) {
        this.a = e41Var;
        this.b = x41Var;
        this.c = i;
        this.d = i2;
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lc5)) {
            return false;
        }
        lc5 lc5Var = (lc5) obj;
        if (!ur1.a(this.a, lc5Var.a) || !ur1.a(this.b, lc5Var.b)) {
            return false;
        }
        if (this.c == lc5Var.c) {
            return (this.d == lc5Var.d) && ur1.a(this.e, lc5Var.e);
        }
        return false;
    }

    public final int hashCode() {
        e41 e41Var = this.a;
        int iHashCode = (((((((e41Var == null ? 0 : e41Var.hashCode()) * 31) + this.b.w) * 31) + this.c) * 31) + this.d) * 31;
        Object obj = this.e;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.a);
        sb.append(", fontWeight=");
        sb.append(this.b);
        sb.append(", fontStyle=");
        sb.append((Object) v41.a(this.c));
        sb.append(", fontSynthesis=");
        sb.append((Object) w41.a(this.d));
        sb.append(", resourceLoaderCacheKey=");
        return o5.d(sb, this.e, ')');
    }
}
