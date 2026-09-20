package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hw0 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof hw0) {
            return this.a == ((hw0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return this.a == 0 ? "FabPosition.Center" : "FabPosition.End";
    }
}
