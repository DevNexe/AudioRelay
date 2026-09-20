package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o43 {
    public final String a;

    public o43(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o43) && ur1.a(this.a, ((o43) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return i5.b(new StringBuilder("PlanId(value="), this.a, ")");
    }
}
