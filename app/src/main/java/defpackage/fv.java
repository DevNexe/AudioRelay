package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class fv {
    public final String a;
    public final long b;
    public final int c;

    public fv(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i < -1 || i > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public abstract float[] a(float[] fArr);

    public abstract float b(int i);

    public abstract float c(int i);

    public boolean d() {
        return false;
    }

    public abstract float[] e(float[] fArr);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !ur1.a(nl3.a(getClass()), nl3.a(obj.getClass()))) {
            return false;
        }
        fv fvVar = (fv) obj;
        if (this.c == fvVar.c && ur1.a(this.a, fvVar.a)) {
            return dv.a(this.b, fvVar.b);
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = dv.e;
        long j = this.b;
        return ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.c;
    }

    public final String toString() {
        return this.a + " (id=" + this.c + ", model=" + ((Object) dv.b(this.b)) + ')';
    }
}
