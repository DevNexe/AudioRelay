package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.YKK;
import androidx.lifecycle.auxFixed;
import defpackage.b34;
import defpackage.b70;
import defpackage.d32;
import defpackage.fc2;
import defpackage.z24;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class Recreator implements auxFixed {
    public final b34 w;

    public static final class QnHx implements z24.CQf {
        public final LinkedHashSet a = new LinkedHashSet();

        public QnHx(z24 z24Var) {
            z24Var.c("androidx.savedstate.Restarter", this);
        }

        @Override // z24.CQf
        public final Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.a));
            return bundle;
        }
    }

    public Recreator(b34 b34Var) {
        this.w = b34Var;
    }

    @Override // androidx.lifecycle.auxFixed
    public final void h(d32 d32Var, YKK.CQf cQf) {
        if (cQf != YKK.CQf.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        d32Var.c().c(this);
        b34 b34Var = this.w;
        Bundle bundleA = b34Var.U().a("androidx.savedstate.Restarter");
        if (bundleA == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleA.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(z24.QnHx.class);
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    try {
                        ((z24.QnHx) declaredConstructor.newInstance(new Object[0])).a(b34Var);
                    } catch (Exception e) {
                        throw new RuntimeException(b70.a("Failed to instantiate ", str), e);
                    }
                } catch (NoSuchMethodException e2) {
                    throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                }
            } catch (ClassNotFoundException e3) {
                throw new RuntimeException(fc2.a("Class ", str, " wasn't found"), e3);
            }
        }
    }
}
