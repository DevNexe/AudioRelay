package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a4 extends e54 {
    public final at a;
    public final Map<ie3, e54.QnHx> b;

    public a4(at atVar, Map<ie3, e54.QnHx> map) {
        if (atVar == null) {
            throw new NullPointerException("Null clock");
        }
        this.a = atVar;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.b = map;
    }

    @Override // defpackage.e54
    public final at a() {
        return this.a;
    }

    @Override // defpackage.e54
    public final Map<ie3, e54.QnHx> c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e54)) {
            return false;
        }
        e54 e54Var = (e54) obj;
        return this.a.equals(e54Var.a()) && this.b.equals(e54Var.c());
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}
