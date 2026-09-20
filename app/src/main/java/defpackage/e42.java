package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.facebook.ads.AdError;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class e42 implements ek4 {
    public static final Method V;
    public static final Method W;
    public static final Method X;
    public int B;
    public int C;
    public boolean E;
    public boolean F;
    public boolean G;
    public LPt8Fixed J;
    public View K;
    public AdapterView.OnItemClickListener L;
    public final Handler Q;
    public Rect S;
    public boolean T;
    public final vr$z U;
    public final Context w;
    public ListAdapter x;
    public zp0 y;
    public final int z = -2;
    public int A = -2;
    public final int D = AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE;
    public int H = 0;
    public final int I = Integer.MAX_VALUE;
    public final auxFixed M = new auxFixed();
    public final YKK N = new YKK();
    public final NUlFixed O = new NUlFixed();
    public final F1 P = new F1();
    public final Rect R = new Rect();

    public static class CQf {
        public static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        public static void b(PopupWindow popupWindow, boolean z) {
            popupWindow.setIsClippedToScreen(z);
        }
    }

    public class F1 implements Runnable {
        public F1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            zp0 zp0Var = e42.this.y;
            if (zp0Var != null) {
                zp0Var.setListSelectionHidden(true);
                zp0Var.requestLayout();
            }
        }
    }

    public class LPt8Fixed extends DataSetObserver {
        public LPt8Fixed() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            e42 e42Var = e42.this;
            if (e42Var.c()) {
                e42Var.show();
            }
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            e42.this.dismiss();
        }
    }

    public class NUlFixed implements AbsListView.OnScrollListener {
        public NUlFixed() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1) {
                e42 e42Var = e42.this;
                if ((e42Var.U.getInputMethodMode() == 2) || e42Var.U.getContentView() == null) {
                    return;
                }
                Handler handler = e42Var.Q;
                auxFixed auxVar = e42Var.M;
                handler.removeCallbacks(auxVar);
                auxVar.run();
            }
        }
    }

    public static class QnHx {
        public static int a(PopupWindow popupWindow, View view, int i, boolean z) {
            return popupWindow.getMaxAvailableHeight(view, i, z);
        }
    }

    public class YKK implements View.OnTouchListener {
        public YKK() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            vr$z vr_z;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            e42 e42Var = e42.this;
            if (action == 0 && (vr_z = e42Var.U) != null && vr_z.isShowing() && x >= 0) {
                vr$z vr_z2 = e42Var.U;
                if (x < vr_z2.getWidth() && y >= 0 && y < vr_z2.getHeight()) {
                    e42Var.Q.postDelayed(e42Var.M, 250L);
                    return false;
                }
            }
            if (action != 1) {
                return false;
            }
            e42Var.Q.removeCallbacks(e42Var.M);
            return false;
        }
    }

    public class auxFixed implements Runnable {
        public auxFixed() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            e42 e42Var = e42.this;
            zp0 zp0Var = e42Var.y;
            if (zp0Var != null) {
                Field field = bi5.a;
                if (!bi5.auxFixed.b(zp0Var) || e42Var.y.getCount() <= e42Var.y.getChildCount() || e42Var.y.getChildCount() > e42Var.I) {
                    return;
                }
                e42Var.U.setInputMethodMode(2);
                e42Var.show();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                V = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                X = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                W = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public e42(Context context, AttributeSet attributeSet, int i, int i2) {
        this.w = context;
        this.Q = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xApe.I, i, i2);
        this.B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.C = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.E = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        vr$z vr_z = new vr$z(context, attributeSet, i, i2);
        this.U = vr_z;
        vr_z.setInputMethodMode(1);
    }

    @Override // defpackage.ek4
    public final boolean c() {
        return this.U.isShowing();
    }

    public zp0 d(Context context, boolean z) {
        throw null;
    }

    @Override // defpackage.ek4
    public final void dismiss() {
        vr$z vr_z = this.U;
        vr_z.dismiss();
        vr_z.setContentView(null);
        this.y = null;
        this.Q.removeCallbacks(this.M);
    }

    public final int e() {
        if (this.E) {
            return this.C;
        }
        return 0;
    }

    public void f(ListAdapter listAdapter) {
        LPt8Fixed lPt8 = this.J;
        if (lPt8 == null) {
            this.J = new LPt8Fixed();
        } else {
            ListAdapter listAdapter2 = this.x;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(lPt8);
            }
        }
        this.x = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.J);
        }
        zp0 zp0Var = this.y;
        if (zp0Var != null) {
            zp0Var.setAdapter(this.x);
        }
    }

    public final void g(int i) {
        Drawable background = this.U.getBackground();
        if (background == null) {
            this.A = i;
            return;
        }
        Rect rect = this.R;
        background.getPadding(rect);
        this.A = rect.left + rect.right + i;
    }

    @Override // defpackage.ek4
    public final zp0 h() {
        return this.y;
    }

    public final void i(int i) {
        this.C = i;
        this.E = true;
    }

    @Override // defpackage.ek4
    public final void show() {
        int i;
        int iA;
        int iMakeMeasureSpec;
        int paddingBottom;
        zp0 zp0Var;
        zp0 zp0Var2 = this.y;
        vr$z vr_z = this.U;
        Context context = this.w;
        if (zp0Var2 == null) {
            zp0 zp0VarD = d(context, !this.T);
            this.y = zp0VarD;
            zp0VarD.setAdapter(this.x);
            this.y.setOnItemClickListener(this.L);
            this.y.setFocusable(true);
            this.y.setFocusableInTouchMode(true);
            this.y.setOnItemSelectedListener(new c42(this));
            this.y.setOnScrollListener(this.O);
            vr_z.setContentView(this.y);
        }
        Drawable background = vr_z.getBackground();
        Rect rect = this.R;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.E) {
                this.C = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        boolean z = vr_z.getInputMethodMode() == 2;
        View view = this.K;
        int i3 = this.C;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = W;
            if (method != null) {
                try {
                    iA = ((Integer) method.invoke(vr_z, view, Integer.valueOf(i3), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                    iA = vr_z.getMaxAvailableHeight(view, i3);
                }
            } else {
                iA = vr_z.getMaxAvailableHeight(view, i3);
            }
        } else {
            iA = QnHx.a(vr_z, view, i3, z);
        }
        int i4 = this.z;
        if (i4 == -1) {
            paddingBottom = iA + i;
        } else {
            int i5 = this.A;
            if (i5 != -2) {
                iMakeMeasureSpec = i5 != -1 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int iA2 = this.y.a(iMakeMeasureSpec, iA + 0);
            paddingBottom = iA2 + (iA2 > 0 ? this.y.getPaddingBottom() + this.y.getPaddingTop() + i + 0 : 0);
        }
        boolean z2 = vr_z.getInputMethodMode() == 2;
        ia3.b(vr_z, this.D);
        if (vr_z.isShowing()) {
            View view2 = this.K;
            Field field = bi5.a;
            if (bi5.auxFixed.b(view2)) {
                int width = this.A;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.K.getWidth();
                }
                if (i4 == -1) {
                    i4 = z2 ? paddingBottom : -1;
                    if (z2) {
                        vr_z.setWidth(this.A == -1 ? -1 : 0);
                        vr_z.setHeight(0);
                    } else {
                        vr_z.setWidth(this.A == -1 ? -1 : 0);
                        vr_z.setHeight(-1);
                    }
                } else if (i4 == -2) {
                    i4 = paddingBottom;
                }
                vr_z.setOutsideTouchable(true);
                View view3 = this.K;
                int i6 = this.B;
                int i7 = this.C;
                if (width < 0) {
                    width = -1;
                }
                vr_z.update(view3, i6, i7, width, i4 < 0 ? -1 : i4);
                return;
            }
            return;
        }
        int width2 = this.A;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.K.getWidth();
        }
        if (i4 == -1) {
            i4 = -1;
        } else if (i4 == -2) {
            i4 = paddingBottom;
        }
        vr_z.setWidth(width2);
        vr_z.setHeight(i4);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = V;
            if (method2 != null) {
                try {
                    method2.invoke(vr_z, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            CQf.b(vr_z, true);
        }
        vr_z.setOutsideTouchable(true);
        vr_z.setTouchInterceptor(this.N);
        if (this.G) {
            ia3.a(vr_z, this.F);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = X;
            if (method3 != null) {
                try {
                    method3.invoke(vr_z, this.S);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            CQf.a(vr_z, this.S);
        }
        ia3.QnHx.a(vr_z, this.K, this.B, this.C, this.H);
        this.y.setSelection(-1);
        if ((!this.T || this.y.isInTouchMode()) && (zp0Var = this.y) != null) {
            zp0Var.setListSelectionHidden(true);
            zp0Var.requestLayout();
        }
        if (this.T) {
            return;
        }
        this.Q.post(this.P);
    }
}
