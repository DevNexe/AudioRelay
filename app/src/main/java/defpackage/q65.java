package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class q65 {
    public final List<r65> a;

    public q65() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q65) && ur1.a(this.a, ((q65) obj).a);
    }

    public final int hashCode() {
        List<r65> list = this.a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return "State(themes=" + this.a + ")";
    }

    public q65(List<r65> list) {
        this.a = list;
    }
}
