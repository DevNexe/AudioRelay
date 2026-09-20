package defpackage;

import android.graphics.PathMeasure;

/* JADX INFO: loaded from: classes.dex */
public final class tmHX implements tz2 {
    public final PathMeasure a;

    public tmHX(PathMeasure pathMeasure) {
        this.a = pathMeasure;
    }

    @Override // defpackage.tz2
    public final boolean a(float f, float f2, TQ2_ tq2_) {
        if (tq2_ instanceof TQ2_) {
            return this.a.getSegment(f, f2, tq2_.a, true);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // defpackage.tz2
    public final float b() {
        return this.a.getLength();
    }

    @Override // defpackage.tz2
    public final void c(TQ2_ tq2_) {
        this.a.setPath(tq2_ != null ? tq2_.a : null, false);
    }
}
