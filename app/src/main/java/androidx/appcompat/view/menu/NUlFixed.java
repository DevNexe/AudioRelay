package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import defpackage.alJ;
import defpackage.r80;
import defpackage.wi5;
import defpackage.zw4;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class NUlFixed implements zw4 {
    public static final int[] w = {1, 4, 5, 3, 2, 0};
    public final Context a;
    public final Resources b;
    public boolean c;
    public boolean d;
    public QnHx e;
    public final ArrayList<YKK> f;
    public final ArrayList<YKK> g;
    public boolean h;
    public final ArrayList<YKK> i;
    public final ArrayList<YKK> j;
    public boolean k;
    public CharSequence m;
    public View n;
    public YKK u;
    public int l = 0;
    public boolean o = false;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public final ArrayList<YKK> s = new ArrayList<>();
    public final CopyOnWriteArrayList<WeakReference<T23>> t = new CopyOnWriteArrayList<>();
    public boolean v = false;

    public interface CQf {
        boolean a(YKK ykk);
    }

    public interface QnHx {
        boolean a(NUlFixed nUl, MenuItem menuItem);

        void b(NUlFixed nUl);
    }

    public NUlFixed(Context context) {
        boolean zB;
        boolean z = false;
        this.a = context;
        Resources resources = context.getResources();
        this.b = resources;
        this.f = new ArrayList<>();
        this.g = new ArrayList<>();
        this.h = true;
        this.i = new ArrayList<>();
        this.j = new ArrayList<>();
        this.k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = wi5.a;
            if (Build.VERSION.SDK_INT >= 28) {
                zB = wi5.CQf.b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
                zB = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zB) {
                z = true;
            }
        }
        this.d = z;
    }

    public final YKK a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (w[i5] << 16) | (65535 & i3);
        YKK ykk = new YKK(this, i, i2, i3, i6, charSequence, this.l);
        ArrayList<YKK> arrayList = this.f;
        int size = arrayList.size();
        do {
            size--;
            if (size < 0) {
                i4 = 0;
            }
            arrayList.add(i4, ykk);
            o(true);
            return ykk;
        } while (arrayList.get(size).d > i6);
        i4 = size + 1;
        arrayList.add(i4, ykk);
        o(true);
        return ykk;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            YKK ykkA = a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            ykkA.setIcon(resolveInfo.loadIcon(packageManager));
            ykkA.g = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = ykkA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(T23 t23, Context context) {
        this.t.add(new WeakReference<>(t23));
        t23.f(context, this);
        this.k = true;
    }

    public final void c(boolean z) {
        if (this.r) {
            return;
        }
        this.r = true;
        CopyOnWriteArrayList<WeakReference<T23>> copyOnWriteArrayList = this.t;
        for (WeakReference<T23> weakReference : copyOnWriteArrayList) {
            T23 t23 = weakReference.get();
            if (t23 == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                t23.a(this, z);
            }
        }
        this.r = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        YKK ykk = this.u;
        if (ykk != null) {
            d(ykk);
        }
        this.f.clear();
        o(true);
    }

    public final void clearHeader() {
        this.m = null;
        this.n = null;
        o(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(YKK ykk) {
        CopyOnWriteArrayList<WeakReference<T23>> copyOnWriteArrayList = this.t;
        boolean zE = false;
        if (!copyOnWriteArrayList.isEmpty() && this.u == ykk) {
            t();
            for (WeakReference<T23> weakReference : copyOnWriteArrayList) {
                T23 t23 = weakReference.get();
                if (t23 != null) {
                    zE = t23.e(ykk);
                    if (zE) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            s();
            if (zE) {
                this.u = null;
            }
        }
        return zE;
    }

    public boolean e(NUlFixed nUl, MenuItem menuItem) {
        QnHx qnHx = this.e;
        return qnHx != null && qnHx.a(nUl, menuItem);
    }

    public boolean f(YKK ykk) {
        CopyOnWriteArrayList<WeakReference<T23>> copyOnWriteArrayList = this.t;
        boolean zJ = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        t();
        for (WeakReference<T23> weakReference : copyOnWriteArrayList) {
            T23 t23 = weakReference.get();
            if (t23 != null) {
                zJ = t23.j(ykk);
                if (zJ) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        s();
        if (zJ) {
            this.u = ykk;
        }
        return zJ;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            YKK ykk = this.f.get(i2);
            if (ykk.a == i) {
                return ykk;
            }
            if (ykk.hasSubMenu() && (menuItemFindItem = ykk.o.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final YKK g(int i, KeyEvent keyEvent) {
        ArrayList<YKK> arrayList = this.s;
        arrayList.clear();
        h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean zM = m();
        for (int i2 = 0; i2 < size; i2++) {
            YKK ykk = arrayList.get(i2);
            char c = zM ? ykk.j : ykk.h;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (zM && c == '\b' && i == 67))) {
                return ykk;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return this.f.get(i);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x007a  */
    public final void h(ArrayList arrayList, int i, KeyEvent keyEvent) {
        boolean zM = m();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList<YKK> arrayList2 = this.f;
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                YKK ykk = arrayList2.get(i2);
                if (ykk.hasSubMenu()) {
                    ykk.o.h(arrayList, i, keyEvent);
                }
                char c = zM ? ykk.j : ykk.h;
                if (((modifiers & 69647) == ((zM ? ykk.k : ykk.i) & 69647)) && c != 0) {
                    char[] cArr = keyData.meta;
                    if (c != cArr[0] && c != cArr[2]) {
                        if (zM && c == '\b') {
                            if (i == 67) {
                            }
                        }
                    }
                    if (ykk.isEnabled()) {
                        arrayList.add(ykk);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList<YKK> arrayListK = k();
        if (this.k) {
            CopyOnWriteArrayList<WeakReference<T23>> copyOnWriteArrayList = this.t;
            boolean zB = false;
            for (WeakReference<T23> weakReference : copyOnWriteArrayList) {
                T23 t23 = weakReference.get();
                if (t23 == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zB |= t23.b();
                }
            }
            ArrayList<YKK> arrayList = this.i;
            ArrayList<YKK> arrayList2 = this.j;
            if (zB) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListK.size();
                for (int i = 0; i < size; i++) {
                    YKK ykk = arrayListK.get(i);
                    if ((ykk.x & 32) == 32) {
                        arrayList.add(ykk);
                    } else {
                        arrayList2.add(ykk);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(k());
            }
            this.k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return g(i, keyEvent) != null;
    }

    public NUlFixed j() {
        return this;
    }

    public final ArrayList<YKK> k() {
        boolean z = this.h;
        ArrayList<YKK> arrayList = this.g;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList<YKK> arrayList2 = this.f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            YKK ykk = arrayList2.get(i);
            if (ykk.isVisible()) {
                arrayList.add(ykk);
            }
        }
        this.h = false;
        this.k = true;
        return arrayList;
    }

    public boolean l() {
        return this.v;
    }

    public boolean m() {
        return this.c;
    }

    public boolean n() {
        return this.d;
    }

    public final void o(boolean z) {
        if (this.o) {
            this.p = true;
            if (z) {
                this.q = true;
                return;
            }
            return;
        }
        if (z) {
            this.h = true;
            this.k = true;
        }
        CopyOnWriteArrayList<WeakReference<T23>> copyOnWriteArrayList = this.t;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        t();
        for (WeakReference<T23> weakReference : copyOnWriteArrayList) {
            T23 t23 = weakReference.get();
            if (t23 == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                t23.g();
            }
        }
        s();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x003e  */
    /* JADX WARN: Code duplicated, block: B:32:0x004d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0054  */
    /* JADX WARN: Code duplicated, block: B:37:0x005b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0060  */
    /* JADX WARN: Code duplicated, block: B:45:0x0071  */
    /* JADX WARN: Code duplicated, block: B:47:0x0075  */
    /* JADX WARN: Code duplicated, block: B:50:0x007e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00a6 A[SYNTHETIC] */
    public final boolean p(MenuItem menuItem, T23 t23, int i) {
        alJ alj;
        boolean zExpandActionView;
        alJ alj2;
        boolean z;
        FJCM fjcm;
        CopyOnWriteArrayList<WeakReference<T23>> copyOnWriteArrayList;
        T23 t24;
        YKK ykk = (YKK) menuItem;
        boolean zI = false;
        if (ykk == null || !ykk.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = ykk.p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(ykk)) {
            NUlFixed nUl = ykk.n;
            if (nUl.e(nUl, ykk)) {
                zExpandActionView = true;
            } else {
                Intent intent = ykk.g;
                if (intent != null) {
                    try {
                        nUl.a.startActivity(intent);
                    } catch (ActivityNotFoundException e) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
                        alj = ykk.A;
                        if (alj == null) {
                        }
                        zExpandActionView = false;
                        alj2 = ykk.A;
                        if (alj2 == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (ykk.e()) {
                            zExpandActionView |= ykk.expandActionView();
                            if (zExpandActionView) {
                                c(true);
                            }
                        } else if (ykk.hasSubMenu()) {
                            if ((i & 4) == 0) {
                                c(false);
                            }
                            if (!ykk.hasSubMenu()) {
                                FJCM fjcm2 = new FJCM(this.a, this, ykk);
                                ykk.o = fjcm2;
                                fjcm2.setHeaderTitle(ykk.e);
                            }
                            fjcm = ykk.o;
                            if (z) {
                                alj2.f(fjcm);
                            }
                            copyOnWriteArrayList = this.t;
                            if (!copyOnWriteArrayList.isEmpty()) {
                                if (t23 != null) {
                                }
                                for (WeakReference<T23> weakReference : copyOnWriteArrayList) {
                                    t24 = weakReference.get();
                                    if (t24 == null) {
                                        copyOnWriteArrayList.remove(weakReference);
                                    } else if (!zI) {
                                        zI = t24.i(fjcm);
                                    }
                                }
                            }
                            zExpandActionView |= zI;
                            if (!zExpandActionView) {
                                c(true);
                            }
                        } else {
                            if ((i & 4) == 0) {
                                c(false);
                            }
                            if (!ykk.hasSubMenu()) {
                                FJCM fjcm3 = new FJCM(this.a, this, ykk);
                                ykk.o = fjcm3;
                                fjcm3.setHeaderTitle(ykk.e);
                            }
                            fjcm = ykk.o;
                            if (z) {
                                alj2.f(fjcm);
                            }
                            copyOnWriteArrayList = this.t;
                            if (!copyOnWriteArrayList.isEmpty()) {
                                zI = t23 != null ? t23.i(fjcm) : false;
                                while (r8.hasNext()) {
                                    t24 = weakReference.get();
                                    if (t24 == null) {
                                        copyOnWriteArrayList.remove(weakReference);
                                    } else if (!zI) {
                                        zI = t24.i(fjcm);
                                    }
                                }
                            }
                            zExpandActionView |= zI;
                            if (!zExpandActionView) {
                                c(true);
                            }
                        }
                        return zExpandActionView;
                    }
                    zExpandActionView = true;
                } else {
                    alj = ykk.A;
                    if (alj == null && alj.e()) {
                        zExpandActionView = true;
                    } else {
                        zExpandActionView = false;
                    }
                }
            }
        } else {
            zExpandActionView = true;
        }
        alj2 = ykk.A;
        if (alj2 == null && alj2.a()) {
            z = true;
        } else {
            z = false;
        }
        if (ykk.e()) {
            zExpandActionView |= ykk.expandActionView();
            if (zExpandActionView) {
                c(true);
            }
        } else if (ykk.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                c(false);
            }
            if (!ykk.hasSubMenu()) {
                FJCM fjcm4 = new FJCM(this.a, this, ykk);
                ykk.o = fjcm4;
                fjcm4.setHeaderTitle(ykk.e);
            }
            fjcm = ykk.o;
            if (z) {
                alj2.f(fjcm);
            }
            copyOnWriteArrayList = this.t;
            if (!copyOnWriteArrayList.isEmpty()) {
                if (t23 != null) {
                }
                while (r8.hasNext()) {
                    t24 = weakReference.get();
                    if (t24 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zI) {
                        zI = t24.i(fjcm);
                    }
                }
            }
            zExpandActionView |= zI;
            if (!zExpandActionView) {
                c(true);
            }
        } else if ((i & 1) == 0) {
            c(true);
        }
        return zExpandActionView;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return p(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        YKK ykkG = g(i, keyEvent);
        boolean zP = ykkG != null ? p(ykkG, null, i2) : false;
        if ((i2 & 2) != 0) {
            c(true);
        }
        return zP;
    }

    public final void q(T23 t23) {
        CopyOnWriteArrayList<WeakReference<T23>> copyOnWriteArrayList = this.t;
        for (WeakReference<T23> weakReference : copyOnWriteArrayList) {
            T23 t24 = weakReference.get();
            if (t24 == null || t24 == t23) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    public final void r(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.n = view;
            this.m = null;
        } else {
            if (i > 0) {
                this.m = this.b.getText(i);
            } else if (charSequence != null) {
                this.m = charSequence;
            }
            if (i2 > 0) {
                Object obj = r80.a;
                r80.CQf.b(this.a, i2);
            }
            this.n = null;
        }
        o(false);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList<YKK> arrayList;
        int size = size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            arrayList = this.f;
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (arrayList.get(i3).b == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || arrayList.get(i3).b != i) {
                    break;
                }
                if (i3 >= 0 && i3 < arrayList.size()) {
                    arrayList.remove(i3);
                }
                i2 = i4;
            }
            o(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList<YKK> arrayList;
        int size = size();
        int i2 = 0;
        while (true) {
            arrayList = this.f;
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (arrayList.get(i2).a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0 || i2 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i2);
        o(true);
    }

    public final void s() {
        this.o = false;
        if (this.p) {
            this.p = false;
            o(this.q);
        }
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList<YKK> arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            YKK ykk = arrayList.get(i2);
            if (ykk.b == i) {
                ykk.x = (ykk.x & (-5)) | (z2 ? 4 : 0);
                ykk.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.v = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList<YKK> arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            YKK ykk = arrayList.get(i2);
            if (ykk.b == i) {
                ykk.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList<YKK> arrayList = this.f;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            YKK ykk = arrayList.get(i2);
            if (ykk.b == i) {
                int i3 = ykk.x;
                int i4 = (i3 & (-9)) | (z ? 0 : 8);
                ykk.x = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            o(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.c = z;
        o(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f.size();
    }

    public final void t() {
        if (this.o) {
            return;
        }
        this.o = true;
        this.p = false;
        this.q = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        YKK ykkA = a(i, i2, i3, charSequence);
        FJCM fjcm = new FJCM(this.a, this, ykkA);
        ykkA.o = fjcm;
        fjcm.setHeaderTitle(ykkA.e);
        return fjcm;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.b.getString(i4));
    }
}
