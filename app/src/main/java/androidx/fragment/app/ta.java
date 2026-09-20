package androidx.fragment.app;

import android.view.View;
import defpackage.g61;
import defpackage.j61;
import defpackage.l61;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ta {
    public static final g61 a = new g61();
    public static final j61 b;

    static {
        j61 j61Var;
        try {
            j61Var = (j61) l61.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            j61Var = null;
        }
        b = j61Var;
    }

    public static void a(Fragment fragment, Fragment fragment2, boolean z) {
        if (z) {
            fragment2.getClass();
        } else {
            fragment.getClass();
        }
    }

    public static void b(ArrayList<View> arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i);
        }
    }
}
