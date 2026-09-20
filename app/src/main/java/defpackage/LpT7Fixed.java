package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class LpT7Fixed {
    public final List<String> a;

    public LpT7Fixed(List<String> list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LpT7Fixed) && ur1.a(this.a, ((LpT7Fixed) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AdKeywordsConfig(admob=" + this.a + ")";
    }
}
