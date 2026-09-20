package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LPt6Fixed;
import androidx.lifecycle.LPt8Fixed;
import androidx.lifecycle.T23;
import androidx.lifecycle.YKK;
import androidx.lifecycle.y;

/* JADX INFO: loaded from: classes.dex */
public final class o61 implements LPt8Fixed, b34, mj5 {
    public final Fragment w;
    public final lj5 x;
    public LPt6Fixed.CQf y;
    public T23 z = null;
    public a34 A = null;

    public o61(Fragment fragment, lj5 lj5Var) {
        this.w = fragment;
        this.x = lj5Var;
    }

    @Override // defpackage.mj5
    public final lj5 M() {
        f();
        return this.x;
    }

    @Override // defpackage.b34
    public final z24 U() {
        f();
        return this.A.b;
    }

    @Override // androidx.lifecycle.LPt8Fixed
    public final LPt6Fixed.CQf a() {
        Application application;
        Fragment fragment = this.w;
        LPt6Fixed.CQf cQfA = fragment.a();
        if (!cQfA.equals(fragment.k0)) {
            this.y = cQfA;
            return cQfA;
        }
        if (this.y == null) {
            Context applicationContext = fragment.I().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.y = new y(application, this, fragment.B);
        }
        return this.y;
    }

    @Override // androidx.lifecycle.LPt8Fixed
    public final nc0 b() {
        return nc0.QnHx.b;
    }

    @Override // defpackage.d32
    public final YKK c() {
        f();
        return this.z;
    }

    public final void d(YKK.CQf cQf) {
        this.z.f(cQf);
    }

    public final void f() {
        if (this.z == null) {
            this.z = new T23(this);
            this.A = new a34(this);
        }
    }
}
