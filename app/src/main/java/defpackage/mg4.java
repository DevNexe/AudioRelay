package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mg4 implements qq0 {
    public final Z7jl a;
    public final int b;

    public mg4(String str, int i) {
        this.a = new Z7jl(str, null, 6);
        this.b = i;
    }

    @Override // defpackage.qq0
    public final void a(rq0 rq0Var) {
        int i = rq0Var.d;
        boolean z = i != -1;
        Z7jl z7jl = this.a;
        if (z) {
            rq0Var.d(i, rq0Var.e, z7jl.w);
            String str = z7jl.w;
            if (str.length() > 0) {
                rq0Var.e(i, str.length() + i);
            }
        } else {
            int i2 = rq0Var.b;
            rq0Var.d(i2, rq0Var.c, z7jl.w);
            String str2 = z7jl.w;
            if (str2.length() > 0) {
                rq0Var.e(i2, str2.length() + i2);
            }
        }
        int i3 = rq0Var.b;
        int i4 = rq0Var.c;
        int i5 = i3 == i4 ? i4 : -1;
        int i6 = this.b;
        int i7 = i5 + i6;
        int iO = AY.o(i6 > 0 ? i7 - 1 : i7 - z7jl.w.length(), 0, rq0Var.c());
        rq0Var.f(iO, iO);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mg4)) {
            return false;
        }
        mg4 mg4Var = (mg4) obj;
        return ur1.a(this.a.w, mg4Var.a.w) && this.b == mg4Var.b;
    }

    public final int hashCode() {
        return (this.a.w.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingTextCommand(text='");
        sb.append(this.a.w);
        sb.append("', newCursorPosition=");
        return qc0.a(sb, this.b, ')');
    }
}
