package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class dd6 extends Fragment implements b32 {
    public final Map o0 = DesugarCollections.synchronizedMap(new Bt7j());
    public int p0 = 0;
    public Bundle q0;

    static {
        new WeakHashMap();
    }

    @Override // androidx.fragment.app.Fragment
    public final void A() {
        this.Y = true;
        this.p0 = 4;
        Iterator it = this.o0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).g();
        }
    }

    @Override // defpackage.b32
    public final Activity d() {
        x51<?> x51Var = this.O;
        if (x51Var == null) {
            return null;
        }
        return (u51) x51Var.w;
    }

    @Override // androidx.fragment.app.Fragment
    public final void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.g(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.o0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).getClass();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void p(int i, int i2, Intent intent) {
        super.p(i, i2, intent);
        Iterator it = this.o0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).b(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void r(Bundle bundle) {
        super.r(bundle);
        this.p0 = 1;
        this.q0 = bundle;
        for (Map.Entry entry : this.o0.entrySet()) {
            ((LifecycleCallback) entry.getValue()).c(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void t() {
        this.Y = true;
        this.p0 = 5;
        Iterator it = this.o0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).getClass();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void x() {
        this.Y = true;
        this.p0 = 3;
        Iterator it = this.o0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).d();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void y(Bundle bundle) {
        for (Map.Entry entry : this.o0.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).e(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void z() {
        this.Y = true;
        this.p0 = 2;
        Iterator it = this.o0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).f();
        }
    }
}
