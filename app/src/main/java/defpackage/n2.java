package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n2 extends p9 {
    public final List<o52> a;

    public n2(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // defpackage.p9
    public final List<o52> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p9) {
            return this.a.equals(((p9) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.a + "}";
    }
}
