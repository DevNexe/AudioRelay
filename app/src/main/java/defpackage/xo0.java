package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public class xo0 extends Drawable implements Drawable.Callback {
    public static final /* synthetic */ int I = 0;
    public boolean B;
    public boolean D;
    public QnHx E;
    public long F;
    public long G;
    public CQf H;
    public F1 w;
    public Rect x;
    public Drawable y;
    public Drawable z;
    public int A = 255;
    public int C = -1;

    public static class CQf implements Drawable.Callback {
        public Drawable.Callback w;

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Drawable.Callback callback = this.w;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.w;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    public static abstract class F1 extends Drawable.ConstantState {
        public boolean A;
        public ColorFilter B;
        public boolean C;
        public ColorStateList D;
        public PorterDuff.Mode E;
        public boolean F;
        public boolean G;
        public final xo0 a;
        public Resources b;
        public int c;
        public int d;
        public int e;
        public SparseArray<Drawable.ConstantState> f;
        public Drawable[] g;
        public int h;
        public boolean i;
        public boolean j;
        public Rect k;
        public boolean l;
        public boolean m;
        public int n;
        public int o;
        public int p;
        public int q;
        public boolean r;
        public int s;
        public boolean t;
        public boolean u;
        public boolean v;
        public boolean w;
        public int x;
        public int y;
        public int z;

        public F1(F1 f1, xo0 xo0Var, Resources resources) {
            this.i = false;
            this.l = false;
            this.w = true;
            this.y = 0;
            this.z = 0;
            this.a = xo0Var;
            this.b = resources != null ? resources : f1 != null ? f1.b : null;
            int i = f1 != null ? f1.c : 0;
            int i2 = xo0.I;
            i = resources != null ? resources.getDisplayMetrics().densityDpi : i;
            i = i == 0 ? 160 : i;
            this.c = i;
            if (f1 == null) {
                this.g = new Drawable[10];
                this.h = 0;
                return;
            }
            this.d = f1.d;
            this.e = f1.e;
            this.u = true;
            this.v = true;
            this.i = f1.i;
            this.l = f1.l;
            this.w = f1.w;
            this.x = f1.x;
            this.y = f1.y;
            this.z = f1.z;
            this.A = f1.A;
            this.B = f1.B;
            this.C = f1.C;
            this.D = f1.D;
            this.E = f1.E;
            this.F = f1.F;
            this.G = f1.G;
            if (f1.c == i) {
                if (f1.j) {
                    this.k = f1.k != null ? new Rect(f1.k) : null;
                    this.j = true;
                }
                if (f1.m) {
                    this.n = f1.n;
                    this.o = f1.o;
                    this.p = f1.p;
                    this.q = f1.q;
                    this.m = true;
                }
            }
            if (f1.r) {
                this.s = f1.s;
                this.r = true;
            }
            if (f1.t) {
                this.t = true;
            }
            Drawable[] drawableArr = f1.g;
            this.g = new Drawable[drawableArr.length];
            this.h = f1.h;
            SparseArray<Drawable.ConstantState> sparseArray = f1.f;
            if (sparseArray != null) {
                this.f = sparseArray.clone();
            } else {
                this.f = new SparseArray<>(this.h);
            }
            int i3 = this.h;
            for (int i4 = 0; i4 < i3; i4++) {
                Drawable drawable = drawableArr[i4];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f.put(i4, constantState);
                    } else {
                        this.g[i4] = drawableArr[i4];
                    }
                }
            }
        }

        public final int a(Drawable drawable) {
            int i = this.h;
            if (i >= this.g.length) {
                int i2 = i + 10;
                os4.QnHx qnHx = (os4.QnHx) this;
                Drawable[] drawableArr = new Drawable[i2];
                Drawable[] drawableArr2 = qnHx.g;
                if (drawableArr2 != null) {
                    System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
                }
                qnHx.g = drawableArr;
                int[][] iArr = new int[i2][];
                System.arraycopy(qnHx.H, 0, iArr, 0, i);
                qnHx.H = iArr;
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.a);
            this.g[i] = drawable;
            this.h++;
            this.e = drawable.getChangingConfigurations() | this.e;
            this.r = false;
            this.t = false;
            this.k = null;
            this.j = false;
            this.m = false;
            this.u = false;
            return i;
        }

        public final void b() {
            this.m = true;
            c();
            int i = this.h;
            Drawable[] drawableArr = this.g;
            this.o = -1;
            this.n = -1;
            this.q = 0;
            this.p = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.n) {
                    this.n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.o) {
                    this.o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.p) {
                    this.p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.q) {
                    this.q = minimumHeight;
                }
            }
        }

        public final void c() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    int iKeyAt = this.f.keyAt(i);
                    Drawable.ConstantState constantStateValueAt = this.f.valueAt(i);
                    Drawable[] drawableArr = this.g;
                    Drawable drawableNewDrawable = constantStateValueAt.newDrawable(this.b);
                    if (Build.VERSION.SDK_INT >= 23) {
                        uo0.c(drawableNewDrawable, this.x);
                    }
                    Drawable drawableMutate = drawableNewDrawable.mutate();
                    drawableMutate.setCallback(this.a);
                    drawableArr[iKeyAt] = drawableMutate;
                }
                this.f = null;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            int i = this.h;
            Drawable[] drawableArr = this.g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f.get(i2);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (uo0.CQf.b(drawable)) {
                    return true;
                }
            }
            return false;
        }

        public final Drawable d(int i) {
            int iIndexOfKey;
            Drawable drawable = this.g[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f;
            if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable drawableNewDrawable = this.f.valueAt(iIndexOfKey).newDrawable(this.b);
            if (Build.VERSION.SDK_INT >= 23) {
                uo0.c(drawableNewDrawable, this.x);
            }
            Drawable drawableMutate = drawableNewDrawable.mutate();
            drawableMutate.setCallback(this.a);
            this.g[i] = drawableMutate;
            this.f.removeAt(iIndexOfKey);
            if (this.f.size() == 0) {
                this.f = null;
            }
            return drawableMutate;
        }

        public abstract void e();

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return this.d | this.e;
        }
    }

    public class QnHx implements Runnable {
        public final /* synthetic */ xo0 w;

        public QnHx(os4 os4Var) {
            this.w = os4Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            xo0 xo0Var = this.w;
            xo0Var.a(true);
            xo0Var.invalidateSelf();
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    /* JADX WARN: Code duplicated, block: B:18:0x0049  */
    /* JADX WARN: Code duplicated, block: B:19:0x0052  */
    /* JADX WARN: Code duplicated, block: B:20:0x0065  */
    /* JADX WARN: Code duplicated, block: B:23:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    public final void a(boolean z) {
        boolean z2;
        Drawable drawable;
        long j;
        boolean z3 = true;
        this.B = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.y;
        if (drawable2 != null) {
            long j2 = this.F;
            if (j2 != 0) {
                if (j2 <= jUptimeMillis) {
                    drawable2.setAlpha(this.A);
                    this.F = 0L;
                } else {
                    drawable2.setAlpha(((255 - (((int) ((j2 - jUptimeMillis) * 255)) / this.w.y)) * this.A) / 255);
                    z2 = true;
                }
            }
            drawable = this.z;
            if (drawable != null) {
                j = this.G;
                if (j == 0) {
                    if (j <= jUptimeMillis) {
                        drawable.setVisible(false, false);
                        this.z = null;
                        this.G = 0L;
                    } else {
                        drawable.setAlpha(((((int) ((j - jUptimeMillis) * 255)) / this.w.z) * this.A) / 255);
                    }
                }
                if (z || !z3) {
                }
                scheduleSelf(this.E, jUptimeMillis + 16);
                return;
            }
            this.G = 0L;
            z3 = z2;
            if (z) {
            }
        }
        this.F = 0L;
        z2 = false;
        drawable = this.z;
        if (drawable != null) {
            j = this.G;
            if (j == 0) {
                if (j <= jUptimeMillis) {
                    drawable.setVisible(false, false);
                    this.z = null;
                    this.G = 0L;
                } else {
                    drawable.setAlpha(((((int) ((j - jUptimeMillis) * 255)) / this.w.z) * this.A) / 255);
                }
            }
            if (z) {
            }
        }
        this.G = 0L;
        z3 = z2;
        if (z) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        F1 f1 = this.w;
        if (theme == null) {
            f1.getClass();
            return;
        }
        f1.c();
        int i = f1.h;
        Drawable[] drawableArr = f1.g;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable != null && uo0.CQf.b(drawable)) {
                uo0.CQf.a(drawableArr[i2], theme);
                f1.e |= drawableArr[i2].getChangingConfigurations();
            }
        }
        Resources resources = theme.getResources();
        if (resources != null) {
            f1.b = resources;
            int i3 = resources.getDisplayMetrics().densityDpi;
            if (i3 == 0) {
                i3 = 160;
            }
            int i4 = f1.c;
            f1.c = i3;
            if (i4 != i3) {
                f1.m = false;
                f1.j = false;
            }
        }
    }

    public F1 b() {
        throw null;
    }

    public final void c(Drawable drawable) {
        if (this.H == null) {
            this.H = new CQf();
        }
        CQf cQf = this.H;
        cQf.w = drawable.getCallback();
        drawable.setCallback(cQf);
        try {
            if (this.w.y <= 0 && this.B) {
                drawable.setAlpha(this.A);
            }
            F1 f1 = this.w;
            if (f1.C) {
                drawable.setColorFilter(f1.B);
            } else {
                if (f1.F) {
                    uo0.CQf.h(drawable, f1.D);
                }
                F1 f2 = this.w;
                if (f2.G) {
                    uo0.CQf.i(drawable, f2.E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.w.w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                uo0.c(drawable, uo0.b(this));
            }
            uo0.QnHx.e(drawable, this.w.A);
            Rect rect = this.x;
            if (rect != null) {
                uo0.CQf.f(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            CQf cQf2 = this.H;
            Drawable.Callback callback = cQf2.w;
            cQf2.w = null;
            drawable.setCallback(callback);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.w.canApplyTheme();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    public final boolean d(int i) {
        if (i == this.C) {
            return false;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.w.z > 0) {
            Drawable drawable = this.z;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.y;
            if (drawable2 != null) {
                this.z = drawable2;
                this.G = ((long) this.w.z) + jUptimeMillis;
            } else {
                this.z = null;
                this.G = 0L;
            }
        } else {
            Drawable drawable3 = this.y;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i >= 0) {
            F1 f1 = this.w;
            if (i < f1.h) {
                Drawable drawableD = f1.d(i);
                this.y = drawableD;
                this.C = i;
                if (drawableD != null) {
                    int i2 = this.w.y;
                    if (i2 > 0) {
                        this.F = jUptimeMillis + ((long) i2);
                    }
                    c(drawableD);
                }
            } else {
                this.y = null;
                this.C = -1;
            }
        } else {
            this.y = null;
            this.C = -1;
        }
        if (this.F != 0 || this.G != 0) {
            QnHx qnHx = this.E;
            if (qnHx == null) {
                this.E = new QnHx((os4) this);
            } else {
                unscheduleSelf(qnHx);
            }
            a(true);
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.y;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.z;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public void e(F1 f1) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.A;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        F1 f1 = this.w;
        return changingConfigurations | f1.e | f1.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z;
        F1 f1 = this.w;
        if (!f1.u) {
            f1.c();
            f1.u = true;
            int i = f1.h;
            Drawable[] drawableArr = f1.g;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    f1.v = true;
                    z = true;
                    break;
                }
                if (drawableArr[i2].getConstantState() == null) {
                    f1.v = false;
                    z = false;
                    break;
                }
                i2++;
            }
        } else {
            z = f1.v;
        }
        if (!z) {
            return null;
        }
        this.w.d = getChangingConfigurations();
        return this.w;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.y;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.x;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        F1 f1 = this.w;
        if (f1.l) {
            if (!f1.m) {
                f1.b();
            }
            return f1.o;
        }
        Drawable drawable = this.y;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        F1 f1 = this.w;
        if (f1.l) {
            if (!f1.m) {
                f1.b();
            }
            return f1.n;
        }
        Drawable drawable = this.y;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        F1 f1 = this.w;
        if (f1.l) {
            if (!f1.m) {
                f1.b();
            }
            return f1.q;
        }
        Drawable drawable = this.y;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        F1 f1 = this.w;
        if (f1.l) {
            if (!f1.m) {
                f1.b();
            }
            return f1.p;
        }
        Drawable drawable = this.y;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.y;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        F1 f1 = this.w;
        if (f1.r) {
            return f1.s;
        }
        f1.c();
        int i = f1.h;
        Drawable[] drawableArr = f1.g;
        int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
        for (int i2 = 1; i2 < i; i2++) {
            opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
        }
        f1.s = opacity;
        f1.r = true;
        return opacity;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.y;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        boolean padding;
        F1 f1 = this.w;
        Rect rect2 = null;
        if (!f1.i) {
            Rect rect3 = f1.k;
            if (rect3 != null || f1.j) {
                rect2 = rect3;
            } else {
                f1.c();
                Rect rect4 = new Rect();
                int i = f1.h;
                Drawable[] drawableArr = f1.g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i3 = rect4.left;
                        if (i3 > rect2.left) {
                            rect2.left = i3;
                        }
                        int i4 = rect4.top;
                        if (i4 > rect2.top) {
                            rect2.top = i4;
                        }
                        int i5 = rect4.right;
                        if (i5 > rect2.right) {
                            rect2.right = i5;
                        }
                        int i6 = rect4.bottom;
                        if (i6 > rect2.bottom) {
                            rect2.bottom = i6;
                        }
                    }
                }
                f1.j = true;
                f1.k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            padding = (((rect2.left | rect2.top) | rect2.bottom) | rect2.right) != 0;
        } else {
            Drawable drawable = this.y;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.w.A && uo0.b(this) == 1) {
            int i7 = rect.left;
            rect.left = rect.right;
            rect.right = i7;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        F1 f1 = this.w;
        if (f1 != null) {
            f1.r = false;
            f1.t = false;
        }
        if (drawable != this.y || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.w.A;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.z;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.z = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.y;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.B) {
                this.y.setAlpha(this.A);
            }
        }
        if (this.G != 0) {
            this.G = 0L;
            z = true;
        }
        if (this.F != 0) {
            this.F = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.D && super.mutate() == this) {
            F1 f1B = b();
            f1B.e();
            e(f1B);
            this.D = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.z;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.y;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        F1 f1 = this.w;
        int i2 = this.C;
        int i3 = f1.h;
        Drawable[] drawableArr = f1.g;
        boolean z = false;
        for (int i4 = 0; i4 < i3; i4++) {
            Drawable drawable = drawableArr[i4];
            if (drawable != null) {
                boolean zC = Build.VERSION.SDK_INT >= 23 ? uo0.c(drawable, i) : false;
                if (i4 == i2) {
                    z = zC;
                }
            }
        }
        f1.x = i;
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.z;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.y;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.z;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.y;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable != this.y || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.B && this.A == i) {
            return;
        }
        this.B = true;
        this.A = i;
        Drawable drawable = this.y;
        if (drawable != null) {
            if (this.F == 0) {
                drawable.setAlpha(i);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        F1 f1 = this.w;
        if (f1.A != z) {
            f1.A = z;
            Drawable drawable = this.y;
            if (drawable != null) {
                uo0.QnHx.e(drawable, z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        F1 f1 = this.w;
        f1.C = true;
        if (f1.B != colorFilter) {
            f1.B = colorFilter;
            Drawable drawable = this.y;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        F1 f1 = this.w;
        if (f1.w != z) {
            f1.w = z;
            Drawable drawable = this.y;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        Drawable drawable = this.y;
        if (drawable != null) {
            uo0.CQf.e(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.x;
        if (rect == null) {
            this.x = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.y;
        if (drawable != null) {
            uo0.CQf.f(drawable, i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        F1 f1 = this.w;
        f1.F = true;
        if (f1.D != colorStateList) {
            f1.D = colorStateList;
            uo0.e(this.y, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        F1 f1 = this.w;
        f1.G = true;
        if (f1.E != mode) {
            f1.E = mode;
            uo0.f(this.y, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.z;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.y;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.y || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
