package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k72 {
    public final String a;
    public final p72 b;
    public final int c;

    public k72(String str, p72 p72Var, int i) {
        this.a = str;
        this.b = p72Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k72)) {
            return false;
        }
        k72 k72Var = (k72) obj;
        return ur1.a(this.a, k72Var.a) && this.b == k72Var.b && this.c == k72Var.c;
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sbA = N.a("MainDestination(destinationId=", i5.b(new StringBuilder("MainDestinationId(value="), this.a, ")"), ", destination=");
        sbA.append(this.b);
        sbA.append(", tabTitleRes=");
        return ex0.c(sbA, this.c, ")");
    }
}
