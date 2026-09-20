package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.RBi;
import androidx.lifecycle.T23;
import androidx.lifecycle.YKK;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public class u51 extends ComponentActivity implements q2H0.F1, q2H0.LPt8Fixed {
    public boolean M;
    public boolean N;
    public final w51 K = new w51(new QnHx());
    public final T23 L = new T23(this);
    public boolean O = true;

    public class QnHx extends x51<u51> implements mj5, iu2, nH, c61 {
        public QnHx() {
            super(u51.this);
        }

        @Override // defpackage.nH
        public final androidx.activity.result.QnHx E() {
            return u51.this.E;
        }

        @Override // defpackage.c61
        public final void H() {
            u51.this.getClass();
        }

        @Override // defpackage.B8C
        public final View I0(int i) {
            return u51.this.findViewById(i);
        }

        @Override // defpackage.B8C
        public final boolean L0() {
            Window window = u51.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // defpackage.mj5
        public final lj5 M() {
            return u51.this.M();
        }

        @Override // defpackage.x51
        public final u51 V0() {
            return u51.this;
        }

        @Override // defpackage.x51
        public final LayoutInflater W0() {
            u51 u51Var = u51.this;
            return u51Var.getLayoutInflater().cloneInContext(u51Var);
        }

        @Override // defpackage.x51
        public final void X0() {
            u51.this.k();
        }

        @Override // defpackage.d32
        public final YKK c() {
            return u51.this.L;
        }

        @Override // defpackage.iu2
        public final OnBackPressedDispatcher e() {
            return u51.this.D;
        }
    }

    public u51() {
        this.A.b.c("android:support:fragments", new s51(this));
        h(new t51(this));
    }

    public static boolean j(RBi rBi) {
        YKK.F1 f1 = YKK.F1.CREATED;
        boolean zJ = false;
        for (Fragment fragment : rBi.c.g()) {
            if (fragment != null) {
                x51<?> x51Var = fragment.O;
                if ((x51Var == null ? null : x51Var.V0()) != null) {
                    zJ |= j(fragment.i());
                }
                o61 o61Var = fragment.i0;
                YKK.F1 f2 = YKK.F1.STARTED;
                if (o61Var != null) {
                    o61Var.f();
                    if (o61Var.z.c.a(f2)) {
                        fragment.i0.z.h(f1);
                        zJ = true;
                    }
                }
                if (fragment.h0.c.a(f2)) {
                    fragment.h0.h(f1);
                    zJ = true;
                }
            }
        }
        return zJ;
    }

    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.M);
        printWriter.print(" mResumed=");
        printWriter.print(this.N);
        printWriter.print(" mStopped=");
        printWriter.print(this.O);
        if (getApplication() != null) {
            new n42(this, M()).V0(str2, printWriter);
        }
        this.K.a.z.u(str, fileDescriptor, printWriter, strArr);
    }

    @Override // q2H0.LPt8Fixed
    @Deprecated
    public final void f() {
    }

    @Deprecated
    public void k() {
        invalidateOptionsMenu();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.K.a();
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        w51 w51Var = this.K;
        w51Var.a();
        super.onConfigurationChanged(configuration);
        w51Var.a.z.h(configuration);
    }

    @Override // androidx.activity.ComponentActivity, defpackage.wy, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.L.f(YKK.CQf.ON_CREATE);
        a61 a61Var = this.K.a.z;
        a61Var.A = false;
        a61Var.B = false;
        a61Var.H.i = false;
        a61Var.s(1);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            super.onCreatePanelMenu(i, menu);
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        return this.K.a.z.j() | true;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = this.K.a.z.f.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.K.a.z.k();
        this.L.f(YKK.CQf.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        this.K.a.z.l();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        w51 w51Var = this.K;
        if (i == 0) {
            return w51Var.a.z.n();
        }
        if (i != 6) {
            return false;
        }
        return w51Var.a.z.i();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        this.K.a.z.m(z);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        this.K.a();
        super.onNewIntent(intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.K.a.z.o();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.N = false;
        this.K.a.z.s(5);
        this.L.f(YKK.CQf.ON_PAUSE);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        this.K.a.z.q(z);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.L.f(YKK.CQf.ON_RESUME);
        a61 a61Var = this.K.a.z;
        a61Var.A = false;
        a61Var.B = false;
        a61Var.H.i = false;
        a61Var.s(7);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        if (i == 0) {
            super.onPreparePanel(0, view, menu);
            return this.K.a.z.r() | true;
        }
        super.onPreparePanel(i, view, menu);
        return true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.K.a();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final void onResume() {
        w51 w51Var = this.K;
        w51Var.a();
        super.onResume();
        this.N = true;
        w51Var.a.z.x(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        w51 w51Var = this.K;
        w51Var.a();
        super.onStart();
        this.O = false;
        boolean z = this.M;
        x51<?> x51Var = w51Var.a;
        if (!z) {
            this.M = true;
            a61 a61Var = x51Var.z;
            a61Var.A = false;
            a61Var.B = false;
            a61Var.H.i = false;
            a61Var.s(4);
        }
        x51Var.z.x(true);
        this.L.f(YKK.CQf.ON_START);
        a61 a61Var2 = x51Var.z;
        a61Var2.A = false;
        a61Var2.B = false;
        a61Var2.H.i = false;
        a61Var2.s(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.K.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        w51 w51Var;
        super.onStop();
        this.O = true;
        do {
            w51Var = this.K;
        } while (j(w51Var.a.z));
        a61 a61Var = w51Var.a.z;
        a61Var.B = true;
        a61Var.H.i = true;
        a61Var.s(4);
        this.L.f(YKK.CQf.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = this.K.a.z.f.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }
}
