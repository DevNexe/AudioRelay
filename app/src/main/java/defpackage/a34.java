package defpackage;

import android.os.Bundle;
import androidx.lifecycle.YKK;
import androidx.savedstate.Recreator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a34 {
    public final b34 a;
    public final z24 b = new z24();
    public boolean c;

    public a34(b34 b34Var) {
        this.a = b34Var;
    }

    public final void a() {
        b34 b34Var = this.a;
        YKK ykkC = b34Var.c();
        if (!(ykkC.b() == YKK.F1.INITIALIZED)) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        ykkC.a(new Recreator(b34Var));
        z24 z24Var = this.b;
        if (!(!z24Var.b)) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        ykkC.a(new y24(z24Var, 0));
        z24Var.b = true;
        this.c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.c) {
            a();
        }
        YKK ykkC = this.a.c();
        if (!(!ykkC.b().a(YKK.F1.STARTED))) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + ykkC.b()).toString());
        }
        z24 z24Var = this.b;
        if (!z24Var.b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!z24Var.d)) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        z24Var.c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        z24Var.d = true;
    }

    public final void c(Bundle bundle) {
        z24 z24Var = this.b;
        z24Var.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = z24Var.c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        e24<String, z24.CQf> e24Var = z24Var.a;
        e24Var.getClass();
        e24.LPt8Fixed lPt8 = new e24.LPt8Fixed();
        e24Var.y.put(lPt8, Boolean.FALSE);
        while (lPt8.hasNext()) {
            Map.Entry entry = (Map.Entry) lPt8.next();
            bundle2.putBundle((String) entry.getKey(), ((z24.CQf) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
