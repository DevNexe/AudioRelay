package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z61 {
    public final y61 a;

    public z61(y61 y61Var) {
        this.a = y61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z61) && this.a == ((z61) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FullScreenAdStrategyConfig(strategy=" + this.a + ")";
    }
}
