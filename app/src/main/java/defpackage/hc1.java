package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class hc1 extends nj5<View> {
    public final Rect c;
    public final Rect d;
    public int e;
    public int f;

    public hc1() {
        this.c = new Rect();
        this.d = new Rect();
        this.e = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.F1
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        AppBarLayout appBarLayoutU;
        jm5 lastWindowInsets;
        int i4 = view.getLayoutParams().height;
        if ((i4 != -1 && i4 != -2) || (appBarLayoutU = u(coordinatorLayout.j(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size > 0) {
            Field field = bi5.a;
            if (bi5.LPt8Fixed.b(appBarLayoutU) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.a() + lastWindowInsets.d();
            }
        } else {
            size = coordinatorLayout.getHeight();
        }
        coordinatorLayout.r(view, i, i2, View.MeasureSpec.makeMeasureSpec((w(appBarLayoutU) + size) - appBarLayoutU.getMeasuredHeight(), i4 == -1 ? 1073741824 : Integer.MIN_VALUE));
        return true;
    }

    @Override // defpackage.nj5
    public final void t(CoordinatorLayout coordinatorLayout, View view, int i) {
        AppBarLayout appBarLayoutU = u(coordinatorLayout.j(view));
        int iM = 0;
        if (appBarLayoutU == null) {
            coordinatorLayout.q(view, i);
            this.e = 0;
            return;
        }
        CoordinatorLayout.YKK ykk = (CoordinatorLayout.YKK) view.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) ykk).leftMargin;
        int bottom = appBarLayoutU.getBottom() + ((ViewGroup.MarginLayoutParams) ykk).topMargin;
        int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) ykk).rightMargin;
        int bottom2 = ((appBarLayoutU.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) ykk).bottomMargin;
        Rect rect = this.c;
        rect.set(paddingLeft, bottom, width, bottom2);
        jm5 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null) {
            Field field = bi5.a;
            if (bi5.LPt8Fixed.b(coordinatorLayout) && !bi5.LPt8Fixed.b(view)) {
                rect.left = lastWindowInsets.b() + rect.left;
                rect.right -= lastWindowInsets.c();
            }
        }
        Rect rect2 = this.d;
        int i2 = ykk.c;
        va1.b(i2 == 0 ? 8388659 : i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
        if (this.f != 0) {
            float fV = v(appBarLayoutU);
            int i3 = this.f;
            iM = C0239D.m((int) (fV * i3), 0, i3);
        }
        view.layout(rect2.left, rect2.top - iM, rect2.right, rect2.bottom - iM);
        this.e = rect2.top - appBarLayoutU.getBottom();
    }

    public abstract AppBarLayout u(ArrayList arrayList);

    public float v(View view) {
        return 1.0f;
    }

    public int w(View view) {
        return view.getMeasuredHeight();
    }

    public hc1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new Rect();
        this.d = new Rect();
        this.e = 0;
    }
}
