package defpackage;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.NUlFixed;
import androidx.savedstate.Recreator;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedApi"})
public final class z24 {
    public boolean b;
    public Bundle c;
    public boolean d;
    public Recreator.QnHx e;
    public final e24<String, CQf> a = new e24<>();
    public boolean f = true;

    public interface CQf {
        Bundle a();
    }

    public interface QnHx {
        void a(b34 b34Var);
    }

    public final Bundle a(String str) {
        if (!this.d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        Bundle bundle = this.c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.c;
        boolean z = false;
        if (bundle4 != null && !bundle4.isEmpty()) {
            z = true;
        }
        if (!z) {
            this.c = null;
        }
        return bundle2;
    }

    public final CQf b() {
        String str;
        CQf cQf;
        Iterator<Map.Entry<String, CQf>> it = this.a.iterator();
        do {
            e24.NUlFixed nUl = (e24.NUlFixed) it;
            if (!nUl.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) nUl.next();
            str = (String) entry.getKey();
            cQf = (CQf) entry.getValue();
        } while (!ur1.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return cQf;
    }

    public final void c(String str, CQf cQf) {
        if (!(this.a.b(str, cQf) == null)) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final void d() {
        if (!this.f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        Recreator.QnHx qnHx = this.e;
        if (qnHx == null) {
            qnHx = new Recreator.QnHx(this);
        }
        this.e = qnHx;
        try {
            NUlFixed.QnHx.class.getDeclaredConstructor(new Class[0]);
            Recreator.QnHx qnHx2 = this.e;
            if (qnHx2 != null) {
                qnHx2.a.add(NUlFixed.QnHx.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + NUlFixed.QnHx.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }
}
