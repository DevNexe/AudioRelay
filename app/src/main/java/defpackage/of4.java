package defpackage;

import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class of4 {
    public final UUID a;

    public of4(UUID uuid) {
        this.a = uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof of4) && ur1.a(this.a, ((of4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SessionId(value=" + this.a + ")";
    }
}
