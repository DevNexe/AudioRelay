package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pt implements rt<Float> {
    public final float w;
    public final float x;

    public pt(float f, float f2) {
        this.w = f;
        this.x = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rt
    public final boolean a(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    @Override // defpackage.st
    public final Comparable b() {
        return Float.valueOf(this.w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rt
    public final boolean c(Comparable comparable) {
        float fFloatValue = ((Number) comparable).floatValue();
        return fFloatValue >= this.w && fFloatValue <= this.x;
    }

    @Override // defpackage.st
    public final Comparable e() {
        return Float.valueOf(this.x);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pt)) {
            return false;
        }
        if (!isEmpty() || !((pt) obj).isEmpty()) {
            pt ptVar = (pt) obj;
            if (!(this.w == ptVar.w)) {
                return false;
            }
            if (!(this.x == ptVar.x)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.valueOf(this.w).hashCode() * 31) + Float.valueOf(this.x).hashCode();
    }

    @Override // defpackage.rt
    public final boolean isEmpty() {
        return this.w > this.x;
    }

    public final String toString() {
        return this.w + ".." + this.x;
    }
}
