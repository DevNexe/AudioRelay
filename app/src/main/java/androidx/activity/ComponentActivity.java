package androidx.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LPt6Fixed;
import androidx.lifecycle.LPt8Fixed;
import androidx.lifecycle.MZ;
import androidx.lifecycle.PRnFixed;
import androidx.lifecycle.T23;
import androidx.lifecycle.YKK;
import androidx.lifecycle.auxFixed;
import androidx.lifecycle.y;
import com.azefsw.audioconnect.R;
import defpackage.FLr;
import defpackage.a34;
import defpackage.b34;
import defpackage.bi2;
import defpackage.d32;
import defpackage.g;
import defpackage.h95;
import defpackage.i5;
import defpackage.iu2;
import defpackage.lj5;
import defpackage.mj5;
import defpackage.mu2;
import defpackage.n70;
import defpackage.nH;
import defpackage.nc0;
import defpackage.pc2;
import defpackage.q2H0;
import defpackage.q80;
import defpackage.tj5;
import defpackage.up1;
import defpackage.uy;
import defpackage.v23;
import defpackage.v24;
import defpackage.wy;
import defpackage.xh2;
import defpackage.yc2;
import defpackage.z24;
import defpackage.zh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity extends wy implements mj5, LPt8Fixed, b34, iu2, nH {
    public final a34 A;
    public lj5 B;
    public y C;
    public final OnBackPressedDispatcher D;
    public final CQf E;
    public final CopyOnWriteArrayList<n70<Configuration>> F;
    public final CopyOnWriteArrayList<n70<Integer>> G;
    public final CopyOnWriteArrayList<n70<Intent>> H;
    public final CopyOnWriteArrayList<n70<xh2>> I;
    public final CopyOnWriteArrayList<n70<v23>> J;
    public final q80 x = new q80();
    public final pc2 y = new pc2();
    public final T23 z;

    public class CQf extends androidx.activity.result.QnHx {
        public CQf() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.activity.result.QnHx
        public final void b(int i, FLr fLr, Object obj) {
            Bundle bundle;
            ComponentActivity componentActivity = ComponentActivity.this;
            FLr.QnHx qnHxB = fLr.b(componentActivity, obj);
            if (qnHxB != null) {
                new Handler(Looper.getMainLooper()).post(new androidx.activity.QnHx(this, i, qnHxB));
                return;
            }
            Intent intentA = fLr.a(obj);
            if (intentA.getExtras() != null && intentA.getExtras().getClassLoader() == null) {
                intentA.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (intentA.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle = bundleExtra;
            } else {
                bundle = null;
            }
            if (!"androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentA.getAction())) {
                if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentA.getAction())) {
                    int i2 = q2H0.b;
                    q2H0.QnHx.b(componentActivity, intentA, i, bundle);
                    return;
                }
                up1 up1Var = (up1) intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    IntentSender intentSender = up1Var.w;
                    Intent intent = up1Var.x;
                    int i3 = up1Var.y;
                    int i4 = up1Var.z;
                    int i5 = q2H0.b;
                    q2H0.QnHx.c(componentActivity, intentSender, i, intent, i3, i4, 0, bundle);
                    return;
                } catch (IntentSender.SendIntentException e) {
                    new Handler(Looper.getMainLooper()).post(new androidx.activity.CQf(this, i, e));
                    return;
                }
            }
            String[] stringArrayExtra = intentA.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            int i6 = q2H0.b;
            HashSet hashSet = new HashSet();
            for (int i7 = 0; i7 < stringArrayExtra.length; i7++) {
                if (TextUtils.isEmpty(stringArrayExtra[i7])) {
                    throw new IllegalArgumentException(i5.b(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                }
                if (!zh.b() && TextUtils.equals(stringArrayExtra[i7], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i7));
                }
            }
            int size = hashSet.size();
            String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
            if (size > 0) {
                if (size == stringArrayExtra.length) {
                    return;
                }
                int i8 = 0;
                for (int i9 = 0; i9 < stringArrayExtra.length; i9++) {
                    if (!hashSet.contains(Integer.valueOf(i9))) {
                        strArr[i8] = stringArrayExtra[i9];
                        i8++;
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (componentActivity instanceof q2H0.LPt8Fixed) {
                    ((q2H0.LPt8Fixed) componentActivity).f();
                }
                q2H0.CQf.b(componentActivity, stringArrayExtra, i);
            } else if (componentActivity instanceof q2H0.F1) {
                new Handler(Looper.getMainLooper()).post(new g(componentActivity, strArr, i));
            }
        }
    }

    public static final class F1 {
        public lj5 a;
    }

    public class QnHx implements Runnable {
        public QnHx() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e) {
                if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e;
                }
            }
        }
    }

    public ComponentActivity() {
        T23 t23 = new T23(this);
        this.z = t23;
        a34 a34Var = new a34(this);
        this.A = a34Var;
        this.D = new OnBackPressedDispatcher(new QnHx());
        new AtomicInteger();
        this.E = new CQf();
        this.F = new CopyOnWriteArrayList<>();
        this.G = new CopyOnWriteArrayList<>();
        this.H = new CopyOnWriteArrayList<>();
        this.I = new CopyOnWriteArrayList<>();
        this.J = new CopyOnWriteArrayList<>();
        int i = Build.VERSION.SDK_INT;
        t23.a(new auxFixed() { // from class: androidx.activity.ComponentActivity.3
            @Override // androidx.lifecycle.auxFixed
            public final void h(d32 d32Var, YKK.CQf cQf) {
                if (cQf == YKK.CQf.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                    if (viewPeekDecorView != null) {
                        viewPeekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        t23.a(new auxFixed() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.lifecycle.auxFixed
            public final void h(d32 d32Var, YKK.CQf cQf) {
                if (cQf == YKK.CQf.ON_DESTROY) {
                    ComponentActivity.this.x.b = null;
                    if (ComponentActivity.this.isChangingConfigurations()) {
                        return;
                    }
                    ComponentActivity.this.M().a();
                }
            }
        });
        t23.a(new auxFixed() { // from class: androidx.activity.ComponentActivity.5
            @Override // androidx.lifecycle.auxFixed
            public final void h(d32 d32Var, YKK.CQf cQf) {
                ComponentActivity componentActivity = ComponentActivity.this;
                if (componentActivity.B == null) {
                    F1 f1 = (F1) componentActivity.getLastNonConfigurationInstance();
                    if (f1 != null) {
                        componentActivity.B = f1.a;
                    }
                    if (componentActivity.B == null) {
                        componentActivity.B = new lj5();
                    }
                }
                componentActivity.z.c(this);
            }
        });
        a34Var.a();
        v24.b(this);
        if (i <= 23) {
            t23.a(new ImmLeaksCleaner(this));
        }
        a34Var.b.c("android:support:activity-result", new uy(this, 0));
        h(new mu2() { // from class: vy
            @Override // defpackage.mu2
            public final void a() {
                ComponentActivity componentActivity = this.a;
                Bundle bundleA = componentActivity.A.b.a("android:support:activity-result");
                if (bundleA != null) {
                    ComponentActivity.CQf cQf = componentActivity.E;
                    cQf.getClass();
                    ArrayList<Integer> integerArrayList = bundleA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    cQf.e = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    cQf.a = (Random) bundleA.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                    Bundle bundle = bundleA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                    Bundle bundle2 = cQf.h;
                    bundle2.putAll(bundle);
                    for (int i2 = 0; i2 < stringArrayList.size(); i2++) {
                        String str = stringArrayList.get(i2);
                        HashMap map = cQf.c;
                        boolean zContainsKey = map.containsKey(str);
                        HashMap map2 = cQf.b;
                        if (zContainsKey) {
                            Integer num = (Integer) map.remove(str);
                            if (!bundle2.containsKey(str)) {
                                map2.remove(num);
                            }
                        }
                        int iIntValue = integerArrayList.get(i2).intValue();
                        String str2 = stringArrayList.get(i2);
                        map2.put(Integer.valueOf(iIntValue), str2);
                        map.put(str2, Integer.valueOf(iIntValue));
                    }
                }
            }
        });
    }

    @Override // defpackage.nH
    public final androidx.activity.result.QnHx E() {
        return this.E;
    }

    @Override // defpackage.mj5
    public final lj5 M() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.B == null) {
            F1 f1 = (F1) getLastNonConfigurationInstance();
            if (f1 != null) {
                this.B = f1.a;
            }
            if (this.B == null) {
                this.B = new lj5();
            }
        }
        return this.B;
    }

    @Override // defpackage.b34
    public final z24 U() {
        return this.A.b;
    }

    @Override // androidx.lifecycle.LPt8Fixed
    public final LPt6Fixed.CQf a() {
        if (this.C == null) {
            this.C = new y(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.C;
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        i();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.lifecycle.LPt8Fixed
    public final nc0 b() {
        bi2 bi2Var = new bi2(0);
        if (getApplication() != null) {
            bi2Var.b(MZ.a, getApplication());
        }
        bi2Var.b(v24.a, this);
        bi2Var.b(v24.b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            bi2Var.b(v24.c, getIntent().getExtras());
        }
        return bi2Var;
    }

    @Override // defpackage.wy, defpackage.d32
    public final YKK c() {
        return this.z;
    }

    @Override // defpackage.iu2
    public final OnBackPressedDispatcher e() {
        return this.D;
    }

    public final void h(mu2 mu2Var) {
        q80 q80Var = this.x;
        if (q80Var.b != null) {
            mu2Var.a();
        }
        q80Var.a.add(mu2Var);
    }

    public final void i() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        tj5.b(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.E.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        this.D.b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<n70<Configuration>> it = this.F.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // defpackage.wy, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.A.b(bundle);
        q80 q80Var = this.x;
        q80Var.b = this;
        Iterator it = q80Var.a.iterator();
        while (it.hasNext()) {
            ((mu2) it.next()).a();
        }
        super.onCreate(bundle);
        PRnFixed.c(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator<yc2> it = this.y.a.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        Iterator<yc2> it = this.y.a.iterator();
        while (it.hasNext()) {
            if (it.next().d()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        Iterator<n70<xh2>> it = this.I.iterator();
        while (it.hasNext()) {
            it.next().accept(new xh2(z));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<n70<Intent>> it = this.H.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        Iterator<yc2> it = this.y.a.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        Iterator<n70<v23>> it = this.J.iterator();
        while (it.hasNext()) {
            it.next().accept(new v23());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator<yc2> it = this.y.a.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
        return true;
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.E.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        F1 f1;
        lj5 lj5Var = this.B;
        if (lj5Var == null && (f1 = (F1) getLastNonConfigurationInstance()) != null) {
            lj5Var = f1.a;
        }
        if (lj5Var == null) {
            return null;
        }
        F1 f2 = new F1();
        f2.a = lj5Var;
        return f2;
    }

    @Override // defpackage.wy, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        T23 t23 = this.z;
        if (t23 instanceof T23) {
            t23.h(YKK.F1.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.A.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<n70<Integer>> it = this.G.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (h95.a()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        i();
        super.setContentView(i);
    }

    @Override // android.app.Activity
    @Deprecated
    public final void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @Deprecated
    public final void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    @Deprecated
    public final void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public final void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        Iterator<n70<xh2>> it = this.I.iterator();
        while (it.hasNext()) {
            it.next().accept(new xh2(z, configuration));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        Iterator<n70<v23>> it = this.J.iterator();
        while (it.hasNext()) {
            it.next().accept(new v23(0));
        }
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        i();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        i();
        super.setContentView(view, layoutParams);
    }
}
