package defpackage;

import androidx.lifecycle.LPt6Fixed;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class xk2 extends jj5 implements xl2 {
    public static final QnHx e = new QnHx();
    public final LinkedHashMap d = new LinkedHashMap();

    public static final class QnHx implements LPt6Fixed.CQf {
        @Override // androidx.lifecycle.LPt6Fixed.CQf
        public final <T extends jj5> T a(Class<T> cls) {
            return new xk2();
        }

        @Override // androidx.lifecycle.LPt6Fixed.CQf
        public final jj5 b(Class cls, bi2 bi2Var) {
            return new xk2();
        }
    }

    @Override // defpackage.xl2
    public final lj5 a(String str) {
        LinkedHashMap linkedHashMap = this.d;
        lj5 lj5Var = (lj5) linkedHashMap.get(str);
        if (lj5Var != null) {
            return lj5Var;
        }
        lj5 lj5Var2 = new lj5();
        linkedHashMap.put(str, lj5Var2);
        return lj5Var2;
    }

    @Override // defpackage.jj5
    public final void c() {
        LinkedHashMap linkedHashMap = this.d;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((lj5) it.next()).a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator it = this.d.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
