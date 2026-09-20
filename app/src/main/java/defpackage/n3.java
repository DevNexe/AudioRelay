package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n3<T> extends wt0<T> {
    public final Integer a;
    public final T b;
    public final ie3 c;

    /* JADX WARN: Multi-variable type inference failed */
    public n3(bc0 bc0Var) {
        ie3 ie3Var = ie3.HIGHEST;
        this.a = null;
        if (bc0Var == 0) {
            throw new NullPointerException("Null payload");
        }
        this.b = bc0Var;
        this.c = ie3Var;
    }

    @Override // defpackage.wt0
    public final Integer a() {
        return this.a;
    }

    @Override // defpackage.wt0
    public final T b() {
        return this.b;
    }

    @Override // defpackage.wt0
    public final ie3 c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wt0)) {
            return false;
        }
        wt0 wt0Var = (wt0) obj;
        Integer num = this.a;
        if (num != null ? num.equals(wt0Var.a()) : wt0Var.a() == null) {
            if (this.b.equals(wt0Var.b()) && this.c.equals(wt0Var.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "Event{code=" + this.a + ", payload=" + this.b + ", priority=" + this.c + "}";
    }
}
