package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class la5 {
    public final View b;
    public final HashMap a = new HashMap();
    public final ArrayList<u95> c = new ArrayList<>();

    @Deprecated
    public la5() {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof la5)) {
            return false;
        }
        la5 la5Var = (la5) obj;
        return this.b == la5Var.b && this.a.equals(la5Var.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        String strA = rz.a(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.b + "\n", "    values:");
        HashMap map = this.a;
        for (String str : map.keySet()) {
            strA = strA + "    " + str + ": " + map.get(str) + "\n";
        }
        return strA;
    }

    public la5(View view) {
        this.b = view;
    }
}
