package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.azefsw.audioconnect.R;
import defpackage.bi5;
import defpackage.uc2;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class auxFixed {
    public final Context a;
    public final NUlFixed b;
    public final boolean c;
    public final int d;
    public final int e;
    public View f;
    public int g;
    public boolean h;
    public T23.QnHx i;
    public uc2 j;
    public PopupWindow.OnDismissListener k;
    public final QnHx l;

    public static class CQf {
        public static void a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public class QnHx implements PopupWindow.OnDismissListener {
        public QnHx() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            auxFixed.this.c();
        }
    }

    public auxFixed(Context context, NUlFixed nUl, View view, boolean z) {
        this(R.attr.actionOverflowMenuStyle, 0, context, view, nUl, z);
    }

    public final uc2 a() {
        uc2 eq;
        if (this.j == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            CQf.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                eq = new androidx.appcompat.view.menu.CQf(this.a, this.f, this.d, this.e, this.c);
            } else {
                eq = new EQ(this.d, this.e, this.a, this.f, this.b, this.c);
            }
            eq.k(this.b);
            eq.q(this.l);
            eq.m(this.f);
            eq.d(this.i);
            eq.n(this.h);
            eq.o(this.g);
            this.j = eq;
        }
        return this.j;
    }

    public final boolean b() {
        uc2 uc2Var = this.j;
        return uc2Var != null && uc2Var.c();
    }

    public void c() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        uc2 uc2VarA = a();
        uc2VarA.r(z2);
        if (z) {
            int i3 = this.g;
            View view = this.f;
            Field field = bi5.a;
            if ((Gravity.getAbsoluteGravity(i3, bi5.NUlFixed.d(view)) & 7) == 5) {
                i -= this.f.getWidth();
            }
            uc2VarA.p(i);
            uc2VarA.s(i2);
            int i4 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            uc2VarA.w = new Rect(i - i4, i2 - i4, i + i4, i2 + i4);
        }
        uc2VarA.show();
    }

    public auxFixed(int i, int i2, Context context, View view, NUlFixed nUl, boolean z) {
        this.g = 8388611;
        this.l = new QnHx();
        this.a = context;
        this.b = nUl;
        this.f = view;
        this.c = z;
        this.d = i;
        this.e = i2;
    }
}
