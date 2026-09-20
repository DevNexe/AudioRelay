package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class er0 {
    public final h22 a;
    public final h22 b;

    public er0(rp3 rp3Var, hg5 hg5Var) {
        this.a = rp3Var;
        this.b = hg5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er0)) {
            return false;
        }
        er0 er0Var = (er0) obj;
        return ur1.a(this.a, er0Var.a) && ur1.a(this.b, er0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "EmailFeedbackSenderConfig(appName=" + this.a + ", email=" + this.b + ")";
    }
}
