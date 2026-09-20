package defpackage;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ey6 extends hy6 {
    public static final ey6 w = new ey6();

    @Override // defpackage.hy6
    public final Object a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // defpackage.hy6
    public final boolean b() {
        return false;
    }

    public final boolean equals(@CheckForNull Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
