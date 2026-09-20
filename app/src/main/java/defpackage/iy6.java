package defpackage;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class iy6 extends hy6 {
    public final Object w;

    public iy6(Object obj) {
        this.w = obj;
    }

    @Override // defpackage.hy6
    public final Object a() {
        return this.w;
    }

    @Override // defpackage.hy6
    public final boolean b() {
        return true;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof iy6) {
            return this.w.equals(((iy6) obj).w);
        }
        return false;
    }

    public final int hashCode() {
        return this.w.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.w + ")";
    }
}
