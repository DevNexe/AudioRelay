package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1644x implements ia0 {
    public final ia0 a;
    public final float b;

    public C1644x(float f, ia0 ia0Var) {
        while (ia0Var instanceof C1644x) {
            ia0Var = ((C1644x) ia0Var).a;
            f += ((C1644x) ia0Var).b;
        }
        this.a = ia0Var;
        this.b = f;
    }

    @Override // defpackage.ia0
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1644x)) {
            return false;
        }
        C1644x c1644x = (C1644x) obj;
        return this.a.equals(c1644x.a) && this.b == c1644x.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
