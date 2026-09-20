package defpackage;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public final class xv1 {
    public final KeyEvent a;

    public final boolean equals(Object obj) {
        if (obj instanceof xv1) {
            return ur1.a(this.a, ((xv1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.a + ')';
    }
}
