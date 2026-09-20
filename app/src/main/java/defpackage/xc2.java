package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.LPt8Fixed;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.NUlFixed;
import androidx.appcompat.view.menu.YKK;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class xc2 extends e42 implements sc2 {
    public static final Method Z;
    public sc2 Y;

    public static class CQf {
        public static void a(PopupWindow popupWindow, boolean z) {
            popupWindow.setTouchModal(z);
        }
    }

    public static class F1 extends zp0 {
        public final int J;
        public final int K;
        public sc2 L;
        public YKK M;

        public static class QnHx {
            public static int a(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public F1(Context context, boolean z) {
            super(context, z);
            if (1 == QnHx.a(context.getResources().getConfiguration())) {
                this.J = 21;
                this.K = 22;
            } else {
                this.J = 22;
                this.K = 21;
            }
        }

        @Override // defpackage.zp0, android.view.View
        public final boolean onHoverEvent(MotionEvent motionEvent) {
            LPt8Fixed lPt8;
            int headersCount;
            int iPointToPosition;
            int i;
            if (this.L != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    lPt8 = (LPt8Fixed) headerViewListAdapter.getWrappedAdapter();
                } else {
                    lPt8 = (LPt8Fixed) adapter;
                    headersCount = 0;
                }
                YKK item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= lPt8.getCount()) ? null : lPt8.getItem(i);
                YKK ykk = this.M;
                if (ykk != item) {
                    NUlFixed nUl = lPt8.w;
                    if (ykk != null) {
                        this.L.b(nUl, ykk);
                    }
                    this.M = item;
                    if (item != null) {
                        this.L.a(nUl, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.J) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i != this.K) {
                return super.onKeyDown(i, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (LPt8Fixed) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (LPt8Fixed) adapter).w.c(false);
            return true;
        }

        public void setHoverListener(sc2 sc2Var) {
            this.L = sc2Var;
        }

        @Override // defpackage.zp0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    public static class QnHx {
        public static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        public static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                Z = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public xc2(Context context, int i, int i2) {
        super(context, null, i, i2);
    }

    @Override // defpackage.sc2
    public final void a(NUlFixed nUl, YKK ykk) {
        sc2 sc2Var = this.Y;
        if (sc2Var != null) {
            sc2Var.a(nUl, ykk);
        }
    }

    @Override // defpackage.sc2
    public final void b(NUlFixed nUl, MenuItem menuItem) {
        sc2 sc2Var = this.Y;
        if (sc2Var != null) {
            sc2Var.b(nUl, menuItem);
        }
    }

    @Override // defpackage.e42
    public final zp0 d(Context context, boolean z) {
        F1 f1 = new F1(context, z);
        f1.setHoverListener(this);
        return f1;
    }
}
