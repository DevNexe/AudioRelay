package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u93 {
    public final List<Float> a;
    public final float b;

    public u93(ArrayList arrayList, float f) {
        this.a = arrayList;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u93)) {
            return false;
        }
        u93 u93Var = (u93) obj;
        return ur1.a(this.a, u93Var.a) && ur1.a(Float.valueOf(this.b), Float.valueOf(u93Var.b));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PolynomialFit(coefficients=");
        sb.append(this.a);
        sb.append(", confidence=");
        return dj.b(sb, this.b, ')');
    }
}
