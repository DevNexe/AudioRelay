package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gj0 {
    public int a;

    public gj0() {
        this(0);
    }

    public gj0(int i) {
        this.a = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gj0) && this.a == ((gj0) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return qc0.a(new StringBuilder("DeltaCounter(count="), this.a, ')');
    }
}
