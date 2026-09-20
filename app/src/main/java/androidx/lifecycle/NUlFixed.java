package androidx.lifecycle;

import defpackage.b34;
import defpackage.d32;
import defpackage.jj5;
import defpackage.lj5;
import defpackage.mj5;
import defpackage.z24;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class NUlFixed {

    public static final class QnHx implements z24.QnHx {
        @Override // z24.QnHx
        public final void a(b34 b34Var) {
            HashMap<String, jj5> map;
            if (!(b34Var instanceof mj5)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
            }
            lj5 lj5VarM = ((mj5) b34Var).M();
            z24 z24VarU = b34Var.U();
            lj5VarM.getClass();
            Iterator it = new HashSet(lj5VarM.a.keySet()).iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                map = lj5VarM.a;
                if (!zHasNext) {
                    break;
                } else {
                    NUlFixed.a(map.get((String) it.next()), z24VarU, b34Var.c());
                }
            }
            if (new HashSet(map.keySet()).isEmpty()) {
                return;
            }
            z24VarU.d();
        }
    }

    public static void a(jj5 jj5Var, z24 z24Var, YKK ykk) {
        Object obj;
        boolean z;
        HashMap map = jj5Var.a;
        if (map == null) {
            obj = null;
        } else {
            synchronized (map) {
                obj = jj5Var.a.get("androidx.lifecycle.savedstate.vm.tag");
            }
        }
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
        if (savedStateHandleController == null || (z = savedStateHandleController.x)) {
            return;
        }
        if (z) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        savedStateHandleController.x = true;
        ykk.a(savedStateHandleController);
        z24Var.c(savedStateHandleController.w, savedStateHandleController.y.e);
        b(ykk, z24Var);
    }

    public static void b(final YKK ykk, final z24 z24Var) {
        YKK.F1 f1B = ykk.b();
        if (f1B == YKK.F1.INITIALIZED || f1B.a(YKK.F1.STARTED)) {
            z24Var.d();
        } else {
            ykk.a(new auxFixed() { // from class: androidx.lifecycle.LegacySavedStateHandleController$1
                @Override // androidx.lifecycle.auxFixed
                public final void h(d32 d32Var, YKK.CQf cQf) {
                    if (cQf == YKK.CQf.ON_START) {
                        ykk.c(this);
                        z24Var.d();
                    }
                }
            });
        }
    }
}
