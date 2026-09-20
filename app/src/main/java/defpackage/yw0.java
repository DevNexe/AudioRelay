package defpackage;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class yw0 {
    public final String a;
    public final Map<Class<?>, Object> b;

    public yw0(String str, Map<Class<?>, Object> map) {
        this.a = str;
        this.b = map;
    }

    public static yw0 a(String str) {
        return new yw0(str, Collections.emptyMap());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yw0)) {
            return false;
        }
        yw0 yw0Var = (yw0) obj;
        return this.a.equals(yw0Var.a) && this.b.equals(yw0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + this.b.values() + "}";
    }
}
