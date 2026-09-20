package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jy {
    public final Object a;
    public final j81<Throwable, sd5> b;

    /* JADX WARN: Multi-variable type inference failed */
    public jy(Object obj, j81<? super Throwable, sd5> j81Var) {
        this.a = obj;
        this.b = j81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jy)) {
            return false;
        }
        jy jyVar = (jy) obj;
        return ur1.a(this.a, jyVar.a) && ur1.a(this.b, jyVar.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.a + ", onCancellation=" + this.b + ')';
    }
}
