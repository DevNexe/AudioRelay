package defpackage;

import android.view.View;
import android.view.WindowId;

/* JADX INFO: loaded from: classes.dex */
public final class fm5 implements gm5 {
    public final WindowId a;

    public fm5(View view) {
        this.a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fm5) && ((fm5) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
