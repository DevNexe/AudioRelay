package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w54 {
    public final h81<Float> a;
    public final h81<Float> b;
    public final boolean c;

    public w54(h81<Float> h81Var, h81<Float> h81Var2, boolean z) {
        this.a = h81Var;
        this.b = h81Var2;
        this.c = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScrollAxisRange(value=");
        sb.append(this.a.invoke().floatValue());
        sb.append(", maxValue=");
        sb.append(this.b.invoke().floatValue());
        sb.append(", reverseScrolling=");
        return dj.c(sb, this.c, ')');
    }
}
