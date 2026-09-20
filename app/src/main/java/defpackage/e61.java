package defpackage;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.LPt6Fixed;
import androidx.fragment.app.RBi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public final class e61 {
    public final Object a;
    public final Object b;
    public Object c;

    public /* synthetic */ e61(mn2 mn2Var, ArrayBlockingQueue arrayBlockingQueue, b73 b73Var) {
        this.a = mn2Var;
        this.b = arrayBlockingQueue;
        this.c = b73Var;
    }

    public /* synthetic */ e61(mw6 mw6Var, rx5 rx5Var, gy5 gy5Var) {
        this.a = mw6Var;
        this.b = rx5Var;
        this.c = gy5Var;
    }

    public final void a(Fragment fragment) {
        if (((ArrayList) this.a).contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (((ArrayList) this.a)) {
            ((ArrayList) this.a).add(fragment);
        }
        fragment.G = true;
    }

    public final void b() {
        ((HashMap) this.b).values().removeAll(Collections.singleton(null));
    }

    public final Fragment c(String str) {
        LPt6Fixed lPt6 = (LPt6Fixed) ((HashMap) this.b).get(str);
        if (lPt6 != null) {
            return lPt6.c;
        }
        return null;
    }

    public final Fragment d(String str) {
        for (LPt6Fixed lPt6 : ((HashMap) this.b).values()) {
            if (lPt6 != null) {
                Fragment fragmentD = lPt6.c;
                if (!str.equals(fragmentD.A)) {
                    fragmentD = fragmentD.P.c.d(str);
                }
                if (fragmentD != null) {
                    return fragmentD;
                }
            }
        }
        return null;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (LPt6Fixed lPt6 : ((HashMap) this.b).values()) {
            if (lPt6 != null) {
                arrayList.add(lPt6);
            }
        }
        return arrayList;
    }

    public final ArrayList f() {
        ArrayList arrayList = new ArrayList();
        for (LPt6Fixed lPt6 : ((HashMap) this.b).values()) {
            if (lPt6 != null) {
                arrayList.add(lPt6.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List g() {
        ArrayList arrayList;
        if (((ArrayList) this.a).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.a)) {
            arrayList = new ArrayList((ArrayList) this.a);
        }
        return arrayList;
    }

    public final void h(LPt6Fixed lPt6) {
        Fragment fragment = lPt6.c;
        String str = fragment.A;
        Object obj = this.b;
        if (((HashMap) obj).get(str) != null) {
            return;
        }
        ((HashMap) obj).put(fragment.A, lPt6);
        if (RBi.H(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragment);
        }
    }

    public final void i(LPt6Fixed lPt6) {
        Fragment fragment = lPt6.c;
        if (fragment.W) {
            ((b61) this.c).e(fragment);
        }
        if (((LPt6Fixed) ((HashMap) this.b).put(fragment.A, null)) != null && RBi.H(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragment);
        }
    }

    public /* synthetic */ e61(jk1.CQf cQf, jk1.F1 f1, jk1.LPt8Fixed lPt8) {
        this.a = cQf;
        this.b = f1;
        this.c = lPt8;
    }

    public /* synthetic */ e61() {
        this.a = new ArrayList();
        this.b = new HashMap();
    }
}
