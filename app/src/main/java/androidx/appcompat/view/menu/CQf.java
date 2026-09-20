package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.azefsw.audioconnect.R;
import defpackage.bi5;
import defpackage.sc2;
import defpackage.uc2;
import defpackage.vr$z;
import defpackage.xc2;
import defpackage.zp0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class CQf extends uc2 implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public final int A;
    public final boolean B;
    public final Handler C;
    public View K;
    public View L;
    public int M;
    public boolean N;
    public boolean O;
    public int P;
    public int Q;
    public boolean S;
    public T23.QnHx T;
    public ViewTreeObserver U;
    public PopupWindow.OnDismissListener V;
    public boolean W;
    public final Context x;
    public final int y;
    public final int z;
    public final ArrayList D = new ArrayList();
    public final ArrayList E = new ArrayList();
    public final QnHx F = new QnHx();
    public final ViewOnAttachStateChangeListenerC0017CQf G = new ViewOnAttachStateChangeListenerC0017CQf();
    public final F1 H = new F1();
    public int I = 0;
    public int J = 0;
    public boolean R = false;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.CQf$CQf, reason: collision with other inner class name */
    public class ViewOnAttachStateChangeListenerC0017CQf implements View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC0017CQf() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            CQf cQf = CQf.this;
            ViewTreeObserver viewTreeObserver = cQf.U;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    cQf.U = view.getViewTreeObserver();
                }
                cQf.U.removeGlobalOnLayoutListener(cQf.F);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public class F1 implements sc2 {
        public F1() {
        }

        @Override // defpackage.sc2
        public final void a(NUlFixed nUl, YKK ykk) {
            CQf cQf = CQf.this;
            cQf.C.removeCallbacksAndMessages(null);
            ArrayList arrayList = cQf.E;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (nUl == ((LPt8Fixed) arrayList.get(i)).b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            cQf.C.postAtTime(new androidx.appcompat.view.menu.F1(this, i2 < arrayList.size() ? (LPt8Fixed) arrayList.get(i2) : null, ykk, nUl), nUl, SystemClock.uptimeMillis() + 200);
        }

        @Override // defpackage.sc2
        public final void b(NUlFixed nUl, MenuItem menuItem) {
            CQf.this.C.removeCallbacksAndMessages(nUl);
        }
    }

    public static class LPt8Fixed {
        public final xc2 a;
        public final NUlFixed b;
        public final int c;

        public LPt8Fixed(xc2 xc2Var, NUlFixed nUl, int i) {
            this.a = xc2Var;
            this.b = nUl;
            this.c = i;
        }
    }

    public class QnHx implements ViewTreeObserver.OnGlobalLayoutListener {
        public QnHx() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            CQf cQf = CQf.this;
            if (cQf.c()) {
                ArrayList arrayList = cQf.E;
                if (arrayList.size() <= 0 || ((LPt8Fixed) arrayList.get(0)).a.T) {
                    return;
                }
                View view = cQf.L;
                if (view == null || !view.isShown()) {
                    cQf.dismiss();
                    return;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((LPt8Fixed) it.next()).a.show();
                }
            }
        }
    }

    public CQf(Context context, View view, int i, int i2, boolean z) {
        this.x = context;
        this.K = view;
        this.z = i;
        this.A = i2;
        this.B = z;
        Field field = bi5.a;
        this.M = bi5.NUlFixed.d(view) != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.y = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.C = new Handler();
    }

    @Override // androidx.appcompat.view.menu.T23
    public final void a(NUlFixed nUl, boolean z) {
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (nUl == ((LPt8Fixed) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((LPt8Fixed) arrayList.get(i2)).b.c(false);
        }
        LPt8Fixed lPt8 = (LPt8Fixed) arrayList.remove(i);
        lPt8.b.q(this);
        boolean z2 = this.W;
        xc2 xc2Var = lPt8.a;
        if (z2) {
            if (Build.VERSION.SDK_INT >= 23) {
                xc2.QnHx.b(xc2Var.U, null);
            } else {
                xc2Var.getClass();
            }
            xc2Var.U.setAnimationStyle(0);
        }
        xc2Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.M = ((LPt8Fixed) arrayList.get(size2 - 1)).c;
        } else {
            View view = this.K;
            Field field = bi5.a;
            this.M = bi5.NUlFixed.d(view) == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((LPt8Fixed) arrayList.get(0)).b.c(false);
                return;
            }
            return;
        }
        dismiss();
        T23.QnHx qnHx = this.T;
        if (qnHx != null) {
            qnHx.a(nUl, true);
        }
        ViewTreeObserver viewTreeObserver = this.U;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.U.removeGlobalOnLayoutListener(this.F);
            }
            this.U = null;
        }
        this.L.removeOnAttachStateChangeListener(this.G);
        this.V.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.T23
    public final boolean b() {
        return false;
    }

    @Override // defpackage.ek4
    public final boolean c() {
        ArrayList arrayList = this.E;
        return arrayList.size() > 0 && ((LPt8Fixed) arrayList.get(0)).a.c();
    }

    @Override // androidx.appcompat.view.menu.T23
    public final void d(T23.QnHx qnHx) {
        this.T = qnHx;
    }

    @Override // defpackage.ek4
    public final void dismiss() {
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        if (size <= 0) {
            return;
        }
        LPt8Fixed[] lPt8Arr = (LPt8Fixed[]) arrayList.toArray(new LPt8Fixed[size]);
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            LPt8Fixed lPt8 = lPt8Arr[size];
            if (lPt8.a.c()) {
                lPt8.a.dismiss();
            }
        }
    }

    @Override // androidx.appcompat.view.menu.T23
    public final void g() {
        Iterator it = this.E.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((LPt8Fixed) it.next()).a.y.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((androidx.appcompat.view.menu.LPt8Fixed) adapter).notifyDataSetChanged();
        }
    }

    @Override // defpackage.ek4
    public final zp0 h() {
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((LPt8Fixed) arrayList.get(arrayList.size() - 1)).a.y;
    }

    @Override // androidx.appcompat.view.menu.T23
    public final boolean i(FJCM fjcm) {
        for (LPt8Fixed lPt8 : this.E) {
            if (fjcm == lPt8.b) {
                lPt8.a.y.requestFocus();
                return true;
            }
        }
        if (!fjcm.hasVisibleItems()) {
            return false;
        }
        k(fjcm);
        T23.QnHx qnHx = this.T;
        if (qnHx != null) {
            qnHx.b(fjcm);
        }
        return true;
    }

    @Override // defpackage.uc2
    public final void k(NUlFixed nUl) {
        nUl.b(this, this.x);
        if (c()) {
            u(nUl);
        } else {
            this.D.add(nUl);
        }
    }

    @Override // defpackage.uc2
    public final void m(View view) {
        if (this.K != view) {
            this.K = view;
            int i = this.I;
            Field field = bi5.a;
            this.J = Gravity.getAbsoluteGravity(i, bi5.NUlFixed.d(view));
        }
    }

    @Override // defpackage.uc2
    public final void n(boolean z) {
        this.R = z;
    }

    @Override // defpackage.uc2
    public final void o(int i) {
        if (this.I != i) {
            this.I = i;
            View view = this.K;
            Field field = bi5.a;
            this.J = Gravity.getAbsoluteGravity(i, bi5.NUlFixed.d(view));
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        LPt8Fixed lPt8;
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                lPt8 = null;
                break;
            }
            lPt8 = (LPt8Fixed) arrayList.get(i);
            if (!lPt8.a.c()) {
                break;
            } else {
                i++;
            }
        }
        if (lPt8 != null) {
            lPt8.b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.uc2
    public final void p(int i) {
        this.N = true;
        this.P = i;
    }

    @Override // defpackage.uc2
    public final void q(PopupWindow.OnDismissListener onDismissListener) {
        this.V = onDismissListener;
    }

    @Override // defpackage.uc2
    public final void r(boolean z) {
        this.S = z;
    }

    @Override // defpackage.uc2
    public final void s(int i) {
        this.O = true;
        this.Q = i;
    }

    @Override // defpackage.ek4
    public final void show() {
        if (c()) {
            return;
        }
        ArrayList arrayList = this.D;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            u((NUlFixed) it.next());
        }
        arrayList.clear();
        View view = this.K;
        this.L = view;
        if (view != null) {
            boolean z = this.U == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.U = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.F);
            }
            this.L.addOnAttachStateChangeListener(this.G);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0097  */
    public final void u(NUlFixed nUl) {
        View childAt;
        LPt8Fixed lPt8;
        char c;
        int i;
        int i2;
        int width;
        MenuItem item;
        androidx.appcompat.view.menu.LPt8Fixed lPt9;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.x;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        androidx.appcompat.view.menu.LPt8Fixed lPt10 = new androidx.appcompat.view.menu.LPt8Fixed(nUl, layoutInflaterFrom, this.B, R.layout.abc_cascading_menu_item_layout);
        if (!c() && this.R) {
            lPt10.y = true;
        } else if (c()) {
            lPt10.y = uc2.t(nUl);
        }
        int iL = uc2.l(lPt10, context, this.y);
        xc2 xc2Var = new xc2(context, this.z, this.A);
        xc2Var.Y = this.H;
        xc2Var.L = this;
        vr$z vr_z = xc2Var.U;
        vr_z.setOnDismissListener(this);
        xc2Var.K = this.K;
        xc2Var.H = this.J;
        xc2Var.T = true;
        vr_z.setFocusable(true);
        vr_z.setInputMethodMode(2);
        xc2Var.f(lPt10);
        xc2Var.g(iL);
        xc2Var.H = this.J;
        ArrayList arrayList = this.E;
        if (arrayList.size() > 0) {
            lPt8 = (LPt8Fixed) arrayList.get(arrayList.size() - 1);
            NUlFixed nUl2 = lPt8.b;
            int size = nUl2.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    item = null;
                    break;
                }
                item = nUl2.getItem(i3);
                if (item.hasSubMenu() && nUl == item.getSubMenu()) {
                    break;
                } else {
                    i3++;
                }
            }
            if (item == null) {
                childAt = null;
            } else {
                zp0 zp0Var = lPt8.a.y;
                ListAdapter adapter = zp0Var.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    lPt9 = (androidx.appcompat.view.menu.LPt8Fixed) headerViewListAdapter.getWrappedAdapter();
                } else {
                    lPt9 = (androidx.appcompat.view.menu.LPt8Fixed) adapter;
                    headersCount = 0;
                }
                int count = lPt9.getCount();
                int i4 = 0;
                while (true) {
                    if (i4 >= count) {
                        i4 = -1;
                        break;
                    } else if (item == lPt9.getItem(i4)) {
                        break;
                    } else {
                        i4++;
                    }
                }
                if (i4 != -1 && (firstVisiblePosition = (i4 + headersCount) - zp0Var.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < zp0Var.getChildCount()) {
                    childAt = zp0Var.getChildAt(firstVisiblePosition);
                } else {
                    childAt = null;
                }
            }
        } else {
            childAt = null;
            lPt8 = null;
        }
        if (childAt != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = xc2.Z;
                if (method != null) {
                    try {
                        method.invoke(vr_z, Boolean.FALSE);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                xc2.CQf.a(vr_z, false);
            }
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 23) {
                xc2.QnHx.a(vr_z, null);
            }
            zp0 zp0Var2 = ((LPt8Fixed) arrayList.get(arrayList.size() - 1)).a.y;
            int[] iArr = new int[2];
            zp0Var2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.L.getWindowVisibleDisplayFrame(rect);
            int i6 = (this.M != 1 ? iArr[0] - iL >= 0 : (zp0Var2.getWidth() + iArr[0]) + iL > rect.right) ? 0 : 1;
            boolean z = i6 == 1;
            this.M = i6;
            if (i5 >= 26) {
                xc2Var.K = childAt;
                i2 = 0;
                i = 0;
            } else {
                int[] iArr2 = new int[2];
                this.K.getLocationOnScreen(iArr2);
                int[] iArr3 = new int[2];
                childAt.getLocationOnScreen(iArr3);
                if ((this.J & 7) == 5) {
                    c = 0;
                    iArr2[0] = this.K.getWidth() + iArr2[0];
                    iArr3[0] = childAt.getWidth() + iArr3[0];
                } else {
                    c = 0;
                }
                i = iArr3[c] - iArr2[c];
                i2 = iArr3[1] - iArr2[1];
            }
            if ((this.J & 5) != 5) {
                width = z ? i + childAt.getWidth() : i - iL;
            } else if (z) {
                width = i + iL;
            } else {
                iL = childAt.getWidth();
            }
            xc2Var.B = width;
            xc2Var.G = true;
            xc2Var.F = true;
            xc2Var.i(i2);
        } else {
            if (this.N) {
                xc2Var.B = this.P;
            }
            if (this.O) {
                xc2Var.i(this.Q);
            }
            Rect rect2 = this.w;
            xc2Var.S = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new LPt8Fixed(xc2Var, nUl, this.M));
        xc2Var.show();
        zp0 zp0Var3 = xc2Var.y;
        zp0Var3.setOnKeyListener(this);
        if (lPt8 == null && this.S && nUl.m != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) zp0Var3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(nUl.m);
            zp0Var3.addHeaderView(frameLayout, null, false);
            xc2Var.show();
        }
    }
}
