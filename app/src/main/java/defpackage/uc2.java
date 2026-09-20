package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.CQf;
import androidx.appcompat.view.menu.LPt8Fixed;
import androidx.appcompat.view.menu.NUlFixed;
import androidx.appcompat.view.menu.T23;
import androidx.appcompat.view.menu.YKK;

/* JADX INFO: loaded from: classes.dex */
public abstract class uc2 implements ek4, T23, AdapterView.OnItemClickListener {
    public Rect w;

    public static int l(LPt8Fixed lPt8, Context context, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = lPt8.getCount();
        FrameLayout frameLayout = null;
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = lPt8.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = lPt8.getView(i4, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    public static boolean t(NUlFixed nUl) {
        int size = nUl.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = nUl.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.T23
    public final boolean e(YKK ykk) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.T23
    public final void f(Context context, NUlFixed nUl) {
    }

    @Override // androidx.appcompat.view.menu.T23
    public final boolean j(YKK ykk) {
        return false;
    }

    public abstract void k(NUlFixed nUl);

    public abstract void m(View view);

    public abstract void n(boolean z);

    public abstract void o(int i);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (LPt8Fixed) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (LPt8Fixed) listAdapter).w.p((MenuItem) listAdapter.getItem(i), this, (this instanceof CQf) ^ true ? 0 : 4);
    }

    public abstract void p(int i);

    public abstract void q(PopupWindow.OnDismissListener onDismissListener);

    public abstract void r(boolean z);

    public abstract void s(int i);
}
