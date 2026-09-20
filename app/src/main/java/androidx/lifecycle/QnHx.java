package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.os.Bundle;
import defpackage.bi2;
import defpackage.jj5;
import defpackage.kk2;
import defpackage.u24;
import defpackage.v24;
import defpackage.z24;

/* JADX INFO: loaded from: classes.dex */
public abstract class QnHx extends LPt6Fixed.LPt8Fixed implements LPt6Fixed.CQf {
    public final z24 a;
    public final YKK b;
    public final Bundle c = null;

    @SuppressLint({"LambdaLast"})
    public QnHx(kk2 kk2Var) {
        this.a = kk2Var.E.b;
        this.b = kk2Var.D;
    }

    @Override // androidx.lifecycle.LPt6Fixed.CQf
    public final <T extends jj5> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        YKK ykk = this.b;
        if (ykk == null) {
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        z24 z24Var = this.a;
        Bundle bundleA = z24Var.a(canonicalName);
        Class<? extends Object>[] clsArr = u24.f;
        u24 u24VarA = u24.QnHx.a(bundleA, this.c);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(canonicalName, u24VarA);
        if (savedStateHandleController.x) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        savedStateHandleController.x = true;
        ykk.a(savedStateHandleController);
        z24Var.c(canonicalName, u24VarA.e);
        NUlFixed.b(ykk, z24Var);
        kk2.F1 f1 = new kk2.F1(u24VarA);
        f1.d(savedStateHandleController, "androidx.lifecycle.savedstate.vm.tag");
        return f1;
    }

    @Override // androidx.lifecycle.LPt6Fixed.CQf
    public final jj5 b(Class cls, bi2 bi2Var) {
        String str = (String) bi2Var.a(Xn1.a);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        z24 z24Var = this.a;
        if (z24Var == null) {
            return new kk2.F1(v24.a(bi2Var));
        }
        Bundle bundleA = z24Var.a(str);
        Class<? extends Object>[] clsArr = u24.f;
        u24 u24VarA = u24.QnHx.a(bundleA, this.c);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, u24VarA);
        if (savedStateHandleController.x) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        savedStateHandleController.x = true;
        YKK ykk = this.b;
        ykk.a(savedStateHandleController);
        z24Var.c(str, u24VarA.e);
        NUlFixed.b(ykk, z24Var);
        kk2.F1 f1 = new kk2.F1(u24VarA);
        f1.d(savedStateHandleController, "androidx.lifecycle.savedstate.vm.tag");
        return f1;
    }

    @Override // androidx.lifecycle.LPt6Fixed.LPt8Fixed
    public final void c(jj5 jj5Var) {
        z24 z24Var = this.a;
        if (z24Var != null) {
            NUlFixed.a(jj5Var, z24Var, this.b);
        }
    }
}
