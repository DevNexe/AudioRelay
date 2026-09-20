package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wj4 implements g43 {
    public final long a;
    public final ak1<Float> b;
    public final float c;

    public wj4() {
        throw null;
    }

    public wj4(long j, ak1 ak1Var, float f) {
        this.a = j;
        this.b = ak1Var;
        this.c = f;
    }

    @Override // defpackage.g43
    public final rh3 a(long j, float f) {
        long j2 = this.a;
        List listM = ps0.M(new yu(yu.b(j2, 0.0f)), new yu(j2), new yu(yu.b(j2, 0.0f)));
        long jA = X.a(0.0f, 0.0f);
        float fMax = Math.max(cm4.e(j), cm4.c(j)) * f * 2;
        return new rh3(listM, jA, fMax < 0.01f ? 0.01f : fMax, 0);
    }

    @Override // defpackage.g43
    public final ak1<Float> b() {
        return this.b;
    }

    @Override // defpackage.g43
    public final float c(float f) {
        float f2 = this.c;
        return f <= f2 ? C0239D.y(0.0f, 1.0f, f / f2) : C0239D.y(1.0f, 0.0f, (f - f2) / (1.0f - f2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wj4)) {
            return false;
        }
        wj4 wj4Var = (wj4) obj;
        return yu.c(this.a, wj4Var.a) && ur1.a(this.b, wj4Var.b) && ur1.a(Float.valueOf(this.c), Float.valueOf(wj4Var.c));
    }

    public final int hashCode() {
        int i = yu.i;
        return Float.floatToIntBits(this.c) + ((this.b.hashCode() + (xc5.a(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shimmer(highlightColor=");
        sb.append((Object) yu.i(this.a));
        sb.append(", animationSpec=");
        sb.append(this.b);
        sb.append(", progressForMaxAlpha=");
        return dj.b(sb, this.c, ')');
    }
}
