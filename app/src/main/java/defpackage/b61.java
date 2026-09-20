package defpackage;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.RBi;
import androidx.lifecycle.LPt6Fixed;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class b61 extends jj5 {
    public static final QnHx j = new QnHx();
    public final boolean g;
    public final HashMap<String, Fragment> d = new HashMap<>();
    public final HashMap<String, b61> e = new HashMap<>();
    public final HashMap<String, lj5> f = new HashMap<>();
    public boolean h = false;
    public boolean i = false;

    public class QnHx implements LPt6Fixed.CQf {
        @Override // androidx.lifecycle.LPt6Fixed.CQf
        public final <T extends jj5> T a(Class<T> cls) {
            return new b61(true);
        }

        @Override // androidx.lifecycle.LPt6Fixed.CQf
        public final jj5 b(Class cls, bi2 bi2Var) {
            return a(cls);
        }
    }

    public b61(boolean z) {
        this.g = z;
    }

    @Override // defpackage.jj5
    public final void c() {
        if (RBi.H(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.h = true;
    }

    public final void e(Fragment fragment) {
        if (this.i) {
            if (RBi.H(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if ((this.d.remove(fragment.A) != null) && RBi.H(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b61.class != obj.getClass()) {
            return false;
        }
        b61 b61Var = (b61) obj;
        return this.d.equals(b61Var.d) && this.e.equals(b61Var.e) && this.f.equals(b61Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
