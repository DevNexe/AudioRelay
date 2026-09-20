package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class q3 extends vc1 {
    public final String a;
    public final List<String> b;

    public q3(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.a = str;
        this.b = arrayList;
    }

    @Override // defpackage.vc1
    public final List<String> a() {
        return this.b;
    }

    @Override // defpackage.vc1
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vc1)) {
            return false;
        }
        vc1 vc1Var = (vc1) obj;
        return this.a.equals(vc1Var.b()) && this.b.equals(vc1Var.a());
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.a + ", usedDates=" + this.b + "}";
    }
}
