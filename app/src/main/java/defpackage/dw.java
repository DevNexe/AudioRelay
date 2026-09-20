package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dw implements qq0 {
    public final Z7jl a;
    public final int b;

    public dw(String str, int i) {
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
        } else {
            rq0Var.d(rq0Var.b, rq0Var.c, z7jl.w);
        }
        int i2 = rq0Var.b;
        int i3 = rq0Var.c;
        if (i2 != i3) {
            i3 = -1;
        }
        int i4 = this.b;
        int i5 = i3 + i4;
        int iO = AY.o(i4 > 0 ? i5 - 1 : i5 - z7jl.w.length(), 0, rq0Var.c());
        rq0Var.f(iO, iO);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dw)) {
            return false;
        }
        dw dwVar = (dw) obj;
        return ur1.a(this.a.w, dwVar.a.w) && this.b == dwVar.b;
    }

    public final int hashCode() {
        return (this.a.w.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitTextCommand(text='");
        sb.append(this.a.w);
        sb.append("', newCursorPosition=");
        return qc0.a(sb, this.b, ')');
    }
}
