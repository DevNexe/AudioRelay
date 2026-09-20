package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.azefsw.audioconnect.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class zp0 extends ListView {
    public int A;
    public int B;
    public final Field C;
    public F1 D;
    public boolean E;
    public final boolean F;
    public boolean G;
    public h42 H;
    public LPt8Fixed I;
    public final Rect w;
    public int x;
    public int y;
    public int z;

    public static class CQf {
        public static final Method a;
        public static final Method b;
        public static final Method c;
        public static final boolean d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
                a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                d = true;
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }
    }

    public static class F1 extends cp0 {
        public boolean x;

        public F1(Drawable drawable) {
            super(drawable);
            this.x = true;
        }

        @Override // defpackage.cp0, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            if (this.x) {
                super.draw(canvas);
            }
        }

        @Override // defpackage.cp0, android.graphics.drawable.Drawable
        public final void setHotspot(float f, float f2) {
            if (this.x) {
                super.setHotspot(f, f2);
            }
        }

        @Override // defpackage.cp0, android.graphics.drawable.Drawable
        public final void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.x) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // defpackage.cp0, android.graphics.drawable.Drawable
        public final boolean setState(int[] iArr) {
            if (this.x) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // defpackage.cp0, android.graphics.drawable.Drawable
        public final boolean setVisible(boolean z, boolean z2) {
            if (this.x) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    public class LPt8Fixed implements Runnable {
        public LPt8Fixed() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            zp0 zp0Var = zp0.this;
            zp0Var.I = null;
            zp0Var.drawableStateChanged();
        }
    }

    public static class QnHx {
        public static void a(View view, float f, float f2) {
            view.drawableHotspotChanged(f, f2);
        }
    }

    public zp0(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.w = new Rect();
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.F = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.C = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    private void setSelectorEnabled(boolean z) {
        F1 f1 = this.D;
        if (f1 != null) {
            f1.x = z;
        }
    }

    public final int a(int i, int i2) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return measuredHeight;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = adapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            view = adapter.getView(i4, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i5 = layoutParams.height;
            view.measure(i, i5 > 0 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i4 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i2) {
                return i2;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0128  */
    /* JADX WARN: Code duplicated, block: B:69:0x013e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0143  */
    /* JADX WARN: Code duplicated, block: B:73:0x0147  */
    /* JADX WARN: Code duplicated, block: B:75:0x0159  */
    /* JADX WARN: Code duplicated, block: B:77:0x015d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0161  */
    public final boolean b(MotionEvent motionEvent, int i) {
        boolean z;
        boolean z2;
        View childAt;
        View childAt2;
        h42 h42Var;
        int actionMasked = motionEvent.getActionMasked();
        boolean z3 = false;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                z = true;
            } else if (actionMasked != 3) {
                z = true;
            } else {
                z = false;
            }
            if (z || z3) {
                this.G = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.B - getFirstVisiblePosition());
                if (childAt2 != null) {
                    childAt2.setPressed(false);
                }
            }
            if (z) {
                if (this.H == null) {
                    this.H = new h42(this);
                }
                h42 h42Var2 = this.H;
                boolean z4 = h42Var2.L;
                h42Var2.L = true;
                h42Var2.onTouch(this, motionEvent);
            } else {
                h42Var = this.H;
                if (h42Var != null) {
                    if (h42Var.L) {
                        h42Var.d();
                    }
                    h42Var.L = false;
                }
            }
            return z;
        }
        z = false;
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        if (iFindPointerIndex < 0) {
            z = false;
        } else {
            int x = (int) motionEvent.getX(iFindPointerIndex);
            int y = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x, y);
            if (iPointToPosition == -1) {
                z3 = true;
            } else {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f = x;
                float f2 = y;
                this.G = true;
                QnHx.a(this, f, f2);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i2 = this.B;
                if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.B = iPointToPosition;
                QnHx.a(childAt3, f - childAt3.getLeft(), f2 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z5 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z5) {
                    selector.setVisible(false, false);
                }
                Field field = this.C;
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.w;
                rect.set(left, top, right, bottom);
                rect.left -= this.x;
                rect.top -= this.y;
                rect.right += this.z;
                rect.bottom += this.A;
                try {
                    boolean z6 = field.getBoolean(this);
                    if (childAt3.isEnabled() != z6) {
                        field.set(this, Boolean.valueOf(!z6));
                        if (iPointToPosition != -1) {
                            refreshDrawableState();
                        }
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                if (z5) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    z2 = false;
                    selector.setVisible(getVisibility() == 0, false);
                    uo0.CQf.e(selector, fExactCenterX, fExactCenterY);
                } else {
                    z2 = false;
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    uo0.CQf.e(selector2, f, f2);
                }
                setSelectorEnabled(z2);
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z = true;
                z3 = false;
            }
        }
        if (z) {
            this.G = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.B - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.G = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.B - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        if (z) {
            if (this.H == null) {
                this.H = new h42(this);
            }
            h42 h42Var3 = this.H;
            boolean z7 = h42Var3.L;
            h42Var3.L = true;
            h42Var3.onTouch(this, motionEvent);
        } else {
            h42Var = this.H;
            if (h42Var != null) {
                if (h42Var.L) {
                    h42Var.d();
                }
                h42Var.L = false;
            }
        }
        return z;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.w;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.I != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        Drawable selector = getSelector();
        if (selector != null && this.G && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.F || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.F || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.F || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.F && this.E) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.I = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.I == null) {
            LPt8Fixed lPt8 = new LPt8Fixed();
            this.I = lPt8;
            post(lPt8);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i < 30 || !CQf.d) {
                        setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                    } else {
                        try {
                            CQf.a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                            CQf.b.invoke(this, Integer.valueOf(iPointToPosition));
                            CQf.c.invoke(this, Integer.valueOf(iPointToPosition));
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (InvocationTargetException e2) {
                            e2.printStackTrace();
                        }
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.G && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.B = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        LPt8Fixed lPt8 = this.I;
        if (lPt8 != null) {
            zp0 zp0Var = zp0.this;
            zp0Var.I = null;
            zp0Var.removeCallbacks(lPt8);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.E = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        F1 f1 = drawable != null ? new F1(drawable) : null;
        this.D = f1;
        super.setSelector(f1);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.x = rect.left;
        this.y = rect.top;
        this.z = rect.right;
        this.A = rect.bottom;
    }
}
