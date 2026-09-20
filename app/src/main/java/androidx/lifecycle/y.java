package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import defpackage.b34;
import defpackage.bi2;
import defpackage.c34;
import defpackage.jj5;
import defpackage.nWE;
import defpackage.u24;
import defpackage.v24;
import defpackage.z24;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes.dex */
public final class y extends LPt6Fixed.LPt8Fixed implements LPt6Fixed.CQf {
    public final Application a;
    public final LPt6Fixed.QnHx b;
    public final Bundle c;
    public final YKK d;
    public final z24 e;

    public y() {
        this.b = new LPt6Fixed.QnHx(null);
    }

    @Override // androidx.lifecycle.LPt6Fixed.CQf
    public final <T extends jj5> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) d(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.LPt6Fixed.CQf
    public final jj5 b(Class cls, bi2 bi2Var) {
        String str = (String) bi2Var.a(Xn1.a);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (bi2Var.a(v24.a) == null || bi2Var.a(v24.b) == null) {
            if (this.d != null) {
                return d(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) bi2Var.a(MZ.a);
        boolean zIsAssignableFrom = nWE.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? c34.a(cls, c34.b) : c34.a(cls, c34.a);
        if (constructorA == null) {
            return this.b.b(cls, bi2Var);
        }
        return (!zIsAssignableFrom || application == null) ? c34.b(cls, constructorA, v24.a(bi2Var)) : c34.b(cls, constructorA, application, v24.a(bi2Var));
    }

    @Override // androidx.lifecycle.LPt6Fixed.LPt8Fixed
    public final void c(jj5 jj5Var) {
        YKK ykk = this.d;
        if (ykk != null) {
            NUlFixed.a(jj5Var, this.e, ykk);
        }
    }

    public final jj5 d(Class cls, String str) {
        YKK ykk = this.d;
        if (ykk == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = nWE.class.isAssignableFrom(cls);
        Application application = this.a;
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? c34.a(cls, c34.b) : c34.a(cls, c34.a);
        if (constructorA == null) {
            if (application != null) {
                return this.b.a(cls);
            }
            if (LPt6Fixed.F1.a == null) {
                LPt6Fixed.F1.a = new LPt6Fixed.F1();
            }
            return LPt6Fixed.F1.a.a(cls);
        }
        z24 z24Var = this.e;
        Bundle bundleA = z24Var.a(str);
        Class<? extends Object>[] clsArr = u24.f;
        u24 u24VarA = u24.QnHx.a(bundleA, this.c);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, u24VarA);
        if (savedStateHandleController.x) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        savedStateHandleController.x = true;
        ykk.a(savedStateHandleController);
        z24Var.c(str, u24VarA.e);
        NUlFixed.b(ykk, z24Var);
        jj5 jj5VarB = (!zIsAssignableFrom || application == null) ? c34.b(cls, constructorA, u24VarA) : c34.b(cls, constructorA, application, u24VarA);
        jj5VarB.d(savedStateHandleController, "androidx.lifecycle.savedstate.vm.tag");
        return jj5VarB;
    }

    @SuppressLint({"LambdaLast"})
    public y(Application application, b34 b34Var, Bundle bundle) {
        LPt6Fixed.QnHx qnHx;
        this.e = b34Var.U();
        this.d = b34Var.c();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            if (LPt6Fixed.QnHx.c == null) {
                LPt6Fixed.QnHx.c = new LPt6Fixed.QnHx(application);
            }
            qnHx = LPt6Fixed.QnHx.c;
        } else {
            qnHx = new LPt6Fixed.QnHx(null);
        }
        this.b = qnHx;
    }
}
