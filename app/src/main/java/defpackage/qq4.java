package defpackage;

import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes.dex */
public final class qq4 {
    public final Object a;
    public final int b;
    public final int c;

    public qq4(int i, int i2, MetricAffectingSpan metricAffectingSpan) {
        this.a = metricAffectingSpan;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq4)) {
            return false;
        }
        qq4 qq4Var = (qq4) obj;
        return ur1.a(this.a, qq4Var.a) && this.b == qq4Var.b && this.c == qq4Var.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanRange(span=");
        sb.append(this.a);
        sb.append(", start=");
        sb.append(this.b);
        sb.append(", end=");
        return qc0.a(sb, this.c, ')');
    }
}
