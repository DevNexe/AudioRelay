package defpackage;

import android.os.Bundle;
import androidx.lifecycle.LPt6Fixed;
import androidx.lifecycle.SavedStateHandleAttacher;
import androidx.lifecycle.Xn1;
import androidx.lifecycle.YKK;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.JvmClassMappingKt;

/* JADX INFO: loaded from: classes.dex */
public final class v24 {
    public static final CQf a = new CQf();
    public static final F1 b = new F1();
    public static final QnHx c = new QnHx();

    public static final class CQf implements nc0.CQf<b34> {
    }

    public static final class F1 implements nc0.CQf<mj5> {
    }

    public static final class LPt8Fixed extends cx1 implements j81<nc0, x24> {
        public static final LPt8Fixed w = new LPt8Fixed();

        public LPt8Fixed() {
            super(1);
        }

        @Override // defpackage.j81
        public final x24 invoke(nc0 nc0Var) {
            return new x24();
        }
    }

    public static final class QnHx implements nc0.CQf<Bundle> {
    }

    public static final u24 a(bi2 bi2Var) {
        b34 b34Var = (b34) bi2Var.a(a);
        if (b34Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        mj5 mj5Var = (mj5) bi2Var.a(b);
        if (mj5Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) bi2Var.a(c);
        String str = (String) bi2Var.a(Xn1.a);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        z24.CQf cQfB = b34Var.U().b();
        w24 w24Var = cQfB instanceof w24 ? (w24) cQfB : null;
        if (w24Var == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        x24 x24VarC = c(mj5Var);
        u24 u24Var = (u24) x24VarC.d.get(str);
        if (u24Var != null) {
            return u24Var;
        }
        Class<? extends Object>[] clsArr = u24.f;
        if (!w24Var.b) {
            w24Var.c = w24Var.a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
            w24Var.b = true;
        }
        Bundle bundle2 = w24Var.c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = w24Var.c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = w24Var.c;
        if (bundle5 != null && bundle5.isEmpty()) {
            w24Var.c = null;
        }
        u24 u24VarA = u24.QnHx.a(bundle3, bundle);
        x24VarC.d.put(str, u24VarA);
        return u24VarA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends b34 & mj5> void b(T t) {
        YKK.F1 f1B = t.c().b();
        if (!(f1B == YKK.F1.INITIALIZED || f1B == YKK.F1.CREATED)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (t.U().b() == null) {
            w24 w24Var = new w24(t.U(), t);
            t.U().c("androidx.lifecycle.internal.SavedStateHandlesProvider", w24Var);
            t.c().a(new SavedStateHandleAttacher(w24Var));
        }
    }

    public static final x24 c(mj5 mj5Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new kj5(JvmClassMappingKt.getJavaClass((fv1) nl3.a(x24.class)), LPt8Fixed.w));
        Object[] array = arrayList.toArray(new kj5[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        kj5[] kj5VarArr = (kj5[]) array;
        return (x24) new LPt6Fixed(mj5Var, new ik1((kj5[]) Arrays.copyOf(kj5VarArr, kj5VarArr.length))).b(x24.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
