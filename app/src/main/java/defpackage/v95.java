package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v95 {
    public final mw0 a;
    public final pm4 b;
    public final io c;
    public final u34 d;

    public v95() {
        this(null, null, null, null, 15);
    }

    public v95(mw0 mw0Var, pm4 pm4Var, io ioVar, u34 u34Var) {
        this.a = mw0Var;
        this.b = pm4Var;
        this.c = ioVar;
        this.d = u34Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v95)) {
            return false;
        }
        v95 v95Var = (v95) obj;
        return ur1.a(this.a, v95Var.a) && ur1.a(this.b, v95Var.b) && ur1.a(this.c, v95Var.c) && ur1.a(this.d, v95Var.d);
    }

    public final int hashCode() {
        mw0 mw0Var = this.a;
        int iHashCode = (mw0Var == null ? 0 : mw0Var.hashCode()) * 31;
        pm4 pm4Var = this.b;
        int iHashCode2 = (iHashCode + (pm4Var == null ? 0 : pm4Var.hashCode())) * 31;
        io ioVar = this.c;
        int iHashCode3 = (iHashCode2 + (ioVar == null ? 0 : ioVar.hashCode())) * 31;
        u34 u34Var = this.d;
        return iHashCode3 + (u34Var != null ? u34Var.hashCode() : 0);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.a + ", slide=" + this.b + ", changeSize=" + this.c + ", scale=" + this.d + ')';
    }

    public /* synthetic */ v95(mw0 mw0Var, pm4 pm4Var, io ioVar, u34 u34Var, int i) {
        this((i & 1) != 0 ? null : mw0Var, (i & 2) != 0 ? null : pm4Var, (i & 4) != 0 ? null : ioVar, (i & 8) != 0 ? null : u34Var);
    }
}
