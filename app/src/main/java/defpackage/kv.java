package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kv implements h25 {
    public final long a;

    public kv(long j) {
        this.a = j;
        if (!(j != yu.h)) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextDrawStyle.Unspecified instead.".toString());
        }
    }

    @Override // defpackage.h25
    public final long a() {
        return this.a;
    }

    @Override // defpackage.h25
    public final /* synthetic */ h25 b(h25 h25Var) {
        return ry0.a(this, h25Var);
    }

    @Override // defpackage.h25
    public final h25 c(h81 h81Var) {
        return !ur1.a(this, h25.QnHx.a) ? this : (h25) h81Var.invoke();
    }

    @Override // defpackage.h25
    public final void d() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kv) && yu.c(this.a, ((kv) obj).a);
    }

    public final int hashCode() {
        int i = yu.i;
        return xc5.a(this.a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) yu.i(this.a)) + ')';
    }
}
