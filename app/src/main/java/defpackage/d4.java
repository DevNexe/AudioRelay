package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class d4 extends kt4 {
    public final kt4.QnHx a;
    public final kt4.F1 b;
    public final kt4.CQf c;

    public d4(e4 e4Var, h4 h4Var, f4 f4Var) {
        this.a = e4Var;
        this.b = h4Var;
        this.c = f4Var;
    }

    @Override // defpackage.kt4
    public final kt4.QnHx a() {
        return this.a;
    }

    @Override // defpackage.kt4
    public final kt4.CQf b() {
        return this.c;
    }

    @Override // defpackage.kt4
    public final kt4.F1 c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kt4)) {
            return false;
        }
        kt4 kt4Var = (kt4) obj;
        return this.a.equals(kt4Var.a()) && this.b.equals(kt4Var.c()) && this.c.equals(kt4Var.b());
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.a + ", osData=" + this.b + ", deviceData=" + this.c + "}";
    }
}
