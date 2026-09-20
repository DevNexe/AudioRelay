package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;

/* JADX INFO: loaded from: classes3.dex */
public class la2 extends Drawable implements c85, ij4 {
    public static final Paint S = new Paint(1);
    public boolean A;
    public final Matrix B;
    public final Path C;
    public final Path D;
    public final RectF E;
    public final RectF F;
    public final Region G;
    public final Region H;
    public ej4 I;
    public final Paint J;
    public final Paint K;
    public final aj4 L;
    public final QnHx M;
    public final fj4 N;
    public PorterDuffColorFilter O;
    public PorterDuffColorFilter P;
    public final RectF Q;
    public final boolean R;
    public CQf w;
    public final hj4.YKK[] x;
    public final hj4.YKK[] y;
    public final BitSet z;

    public class QnHx {
        public QnHx() {
        }
    }

    public la2() {
        this(new ej4());
    }

    public final void b(RectF rectF, Path path) {
        fj4 fj4Var = this.N;
        CQf cQf = this.w;
        fj4Var.a(cQf.a, cQf.j, rectF, this.M, path);
        if (this.w.i != 1.0f) {
            Matrix matrix = this.B;
            matrix.reset();
            float f = this.w.i;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.Q, true);
    }

    public final PorterDuffColorFilter c(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        int color;
        int iD;
        if (colorStateList == null || mode == null) {
            return (!z || (iD = d((color = paint.getColor()))) == color) ? null : new PorterDuffColorFilter(iD, PorterDuff.Mode.SRC_IN);
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = d(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    public final int d(int i) {
        CQf cQf = this.w;
        float f = cQf.n + cQf.o + cQf.m;
        cr0 cr0Var = cQf.b;
        if (cr0Var == null || !cr0Var.a) {
            return i;
        }
        if (!(lv.d(i, 255) == cr0Var.c)) {
            return i;
        }
        float f2 = cr0Var.d;
        float fMin = 0.0f;
        if (f2 > 0.0f && f > 0.0f) {
            fMin = Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        }
        return lv.d(X.x(fMin, lv.d(i, 255), cr0Var.b), Color.alpha(i));
    }

    /* JADX WARN: Code duplicated, block: B:58:0x012d  */
    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.J;
        paint.setColorFilter(this.O);
        int alpha = paint.getAlpha();
        int i = this.w.l;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.K;
        paint2.setColorFilter(this.P);
        paint2.setStrokeWidth(this.w.k);
        int alpha2 = paint2.getAlpha();
        int i2 = this.w.l;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z2 = this.A;
        Path path = this.D;
        Path path2 = this.C;
        RectF rectF = this.F;
        if (z2) {
            Paint.Style style = this.w.u;
            float f = -((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && (paint2.getStrokeWidth() > 0.0f ? 1 : (paint2.getStrokeWidth() == 0.0f ? 0 : -1)) > 0 ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            ej4 ej4Var = this.w.a;
            ej4Var.getClass();
            ej4.QnHx qnHx = new ej4.QnHx(ej4Var);
            ia0 c1644x = ej4Var.e;
            if (!(c1644x instanceof sl3)) {
                c1644x = new C1644x(f, c1644x);
            }
            qnHx.e = c1644x;
            ia0 c1644x2 = ej4Var.f;
            if (!(c1644x2 instanceof sl3)) {
                c1644x2 = new C1644x(f, c1644x2);
            }
            qnHx.f = c1644x2;
            ia0 c1644x3 = ej4Var.h;
            if (!(c1644x3 instanceof sl3)) {
                c1644x3 = new C1644x(f, c1644x3);
            }
            qnHx.h = c1644x3;
            ia0 c1644x4 = ej4Var.g;
            if (!(c1644x4 instanceof sl3)) {
                c1644x4 = new C1644x(f, c1644x4);
            }
            qnHx.g = c1644x4;
            ej4 ej4Var2 = new ej4(qnHx);
            this.I = ej4Var2;
            fj4 fj4Var = this.N;
            float f2 = this.w.j;
            rectF.set(g());
            Paint.Style style2 = this.w.u;
            float strokeWidth = (style2 == Paint.Style.FILL_AND_STROKE || style2 == Paint.Style.STROKE) && (paint2.getStrokeWidth() > 0.0f ? 1 : (paint2.getStrokeWidth() == 0.0f ? 0 : -1)) > 0 ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            fj4Var.a(ej4Var2, f2, rectF, null, path);
            b(g(), path2);
            this.A = false;
        }
        CQf cQf = this.w;
        int i3 = cQf.p;
        if (i3 == 1 || cQf.q <= 0) {
            z = false;
        } else {
            if (i3 != 2) {
                if (!((cQf.a.d(g()) || path2.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true)) {
                    z = false;
                }
            }
            z = true;
        }
        if (z) {
            canvas.save();
            CQf cQf2 = this.w;
            int iSin = (int) (Math.sin(Math.toRadians(cQf2.s)) * ((double) cQf2.r));
            CQf cQf3 = this.w;
            canvas.translate(iSin, (int) (Math.cos(Math.toRadians(cQf3.s)) * ((double) cQf3.r)));
            if (this.R) {
                RectF rectF2 = this.Q;
                int iWidth = (int) (rectF2.width() - getBounds().width());
                int iHeight = (int) (rectF2.height() - getBounds().height());
                if (iWidth < 0 || iHeight < 0) {
                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.w.q * 2) + ((int) rectF2.width()) + iWidth, (this.w.q * 2) + ((int) rectF2.height()) + iHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                float f3 = (getBounds().left - this.w.q) - iWidth;
                float f4 = (getBounds().top - this.w.q) - iHeight;
                canvas2.translate(-f3, -f4);
                e(canvas2);
                canvas.drawBitmap(bitmapCreateBitmap, f3, f4, (Paint) null);
                bitmapCreateBitmap.recycle();
                canvas.restore();
            } else {
                e(canvas);
                canvas.restore();
            }
        }
        CQf cQf4 = this.w;
        Paint.Style style3 = cQf4.u;
        if (style3 == Paint.Style.FILL_AND_STROKE || style3 == Paint.Style.FILL) {
            f(canvas, paint, path2, cQf4.a, g());
        }
        Paint.Style style4 = this.w.u;
        if ((style4 == Paint.Style.FILL_AND_STROKE || style4 == Paint.Style.STROKE) && paint2.getStrokeWidth() > 0.0f) {
            ej4 ej4Var3 = this.I;
            rectF.set(g());
            Paint.Style style5 = this.w.u;
            float strokeWidth2 = (style5 == Paint.Style.FILL_AND_STROKE || style5 == Paint.Style.STROKE) && (paint2.getStrokeWidth() > 0.0f ? 1 : (paint2.getStrokeWidth() == 0.0f ? 0 : -1)) > 0 ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth2, strokeWidth2);
            f(canvas, paint2, path, ej4Var3, rectF);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public final void e(Canvas canvas) {
        if (this.z.cardinality() > 0) {
            Log.w("la2", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.w.r;
        Path path = this.C;
        aj4 aj4Var = this.L;
        if (i != 0) {
            canvas.drawPath(path, aj4Var.a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            hj4.YKK ykk = this.x[i2];
            int i3 = this.w.q;
            Matrix matrix = hj4.YKK.a;
            ykk.a(matrix, aj4Var, i3, canvas);
            this.y[i2].a(matrix, aj4Var, this.w.q, canvas);
        }
        if (this.R) {
            CQf cQf = this.w;
            int iSin = (int) (Math.sin(Math.toRadians(cQf.s)) * ((double) cQf.r));
            CQf cQf2 = this.w;
            int iCos = (int) (Math.cos(Math.toRadians(cQf2.s)) * ((double) cQf2.r));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, S);
            canvas.translate(iSin, iCos);
        }
    }

    public final void f(Canvas canvas, Paint paint, Path path, ej4 ej4Var, RectF rectF) {
        if (!ej4Var.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = ej4Var.f.a(rectF) * this.w.j;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    public final RectF g() {
        RectF rectF = this.E;
        rectF.set(getBounds());
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.w;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        CQf cQf = this.w;
        if (cQf.p == 2) {
            return;
        }
        if (cQf.a.d(g())) {
            outline.setRoundRect(getBounds(), this.w.a.e.a(g()) * this.w.j);
            return;
        }
        RectF rectFG = g();
        Path path = this.C;
        b(rectFG, path);
        if (path.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.w.h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.G;
        region.set(bounds);
        RectF rectFG = g();
        Path path = this.C;
        b(rectFG, path);
        Region region2 = this.H;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final void h(Context context) {
        this.w.b = new cr0(context);
        m();
    }

    public final void i(float f) {
        CQf cQf = this.w;
        if (cQf.n != f) {
            cQf.n = f;
            m();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.A = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.w.f) != null && colorStateList.isStateful()) || (((colorStateList2 = this.w.e) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.w.d) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.w.c) != null && colorStateList4.isStateful())));
    }

    public final void j(ColorStateList colorStateList) {
        CQf cQf = this.w;
        if (cQf.c != colorStateList) {
            cQf.c = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean k(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.w.c == null || color2 == (colorForState2 = this.w.c.getColorForState(iArr, (color2 = (paint2 = this.J).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.w.d == null || color == (colorForState = this.w.d.getColorForState(iArr, (color = (paint = this.K).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean l() {
        PorterDuffColorFilter porterDuffColorFilter = this.O;
        PorterDuffColorFilter porterDuffColorFilter2 = this.P;
        CQf cQf = this.w;
        this.O = c(cQf.f, cQf.g, this.J, true);
        CQf cQf2 = this.w;
        this.P = c(cQf2.e, cQf2.g, this.K, false);
        CQf cQf3 = this.w;
        if (cQf3.t) {
            this.L.a(cQf3.f.getColorForState(getState(), 0));
        }
        return (uq2.a(porterDuffColorFilter, this.O) && uq2.a(porterDuffColorFilter2, this.P)) ? false : true;
    }

    public final void m() {
        CQf cQf = this.w;
        float f = cQf.n + cQf.o;
        cQf.q = (int) Math.ceil(0.75f * f);
        this.w.r = (int) Math.ceil(f * 0.25f);
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.w = new CQf(this.w);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.A = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, j25.CQf
    public boolean onStateChange(int[] iArr) {
        boolean z = k(iArr) || l();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        CQf cQf = this.w;
        if (cQf.l != i) {
            cQf.l = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.w.getClass();
        super.invalidateSelf();
    }

    @Override // defpackage.ij4
    public final void setShapeAppearanceModel(ej4 ej4Var) {
        this.w.a = ej4Var;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.w.f = colorStateList;
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        CQf cQf = this.w;
        if (cQf.g != mode) {
            cQf.g = mode;
            l();
            super.invalidateSelf();
        }
    }

    public la2(Context context, AttributeSet attributeSet, int i, int i2) {
        this(ej4.b(context, attributeSet, i, i2).a());
    }

    public la2(ej4 ej4Var) {
        this(new CQf(ej4Var));
    }

    public la2(CQf cQf) {
        fj4 fj4Var;
        this.x = new hj4.YKK[4];
        this.y = new hj4.YKK[4];
        this.z = new BitSet(8);
        this.B = new Matrix();
        this.C = new Path();
        this.D = new Path();
        this.E = new RectF();
        this.F = new RectF();
        this.G = new Region();
        this.H = new Region();
        Paint paint = new Paint(1);
        this.J = paint;
        Paint paint2 = new Paint(1);
        this.K = paint2;
        this.L = new aj4();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            fj4Var = fj4.QnHx.a;
        } else {
            fj4Var = new fj4();
        }
        this.N = fj4Var;
        this.Q = new RectF();
        this.R = true;
        this.w = cQf;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = S;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        l();
        k(getState());
        this.M = new QnHx();
    }

    public static final class CQf extends Drawable.ConstantState {
        public ej4 a;
        public cr0 b;
        public ColorStateList c;
        public ColorStateList d;
        public final ColorStateList e;
        public ColorStateList f;
        public PorterDuff.Mode g;
        public Rect h;
        public final float i;
        public float j;
        public float k;
        public int l;
        public float m;
        public float n;
        public final float o;
        public final int p;
        public int q;
        public int r;
        public int s;
        public final boolean t;
        public final Paint.Style u;

        public CQf(ej4 ej4Var) {
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = PorterDuff.Mode.SRC_IN;
            this.h = null;
            this.i = 1.0f;
            this.j = 1.0f;
            this.l = 255;
            this.m = 0.0f;
            this.n = 0.0f;
            this.o = 0.0f;
            this.p = 0;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = false;
            this.u = Paint.Style.FILL_AND_STROKE;
            this.a = ej4Var;
            this.b = null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            la2 la2Var = new la2(this);
            la2Var.A = true;
            return la2Var;
        }

        public CQf(CQf cQf) {
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = PorterDuff.Mode.SRC_IN;
            this.h = null;
            this.i = 1.0f;
            this.j = 1.0f;
            this.l = 255;
            this.m = 0.0f;
            this.n = 0.0f;
            this.o = 0.0f;
            this.p = 0;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = false;
            this.u = Paint.Style.FILL_AND_STROKE;
            this.a = cQf.a;
            this.b = cQf.b;
            this.k = cQf.k;
            this.c = cQf.c;
            this.d = cQf.d;
            this.g = cQf.g;
            this.f = cQf.f;
            this.l = cQf.l;
            this.i = cQf.i;
            this.r = cQf.r;
            this.p = cQf.p;
            this.t = cQf.t;
            this.j = cQf.j;
            this.m = cQf.m;
            this.n = cQf.n;
            this.o = cQf.o;
            this.q = cQf.q;
            this.s = cQf.s;
            this.e = cQf.e;
            this.u = cQf.u;
            if (cQf.h != null) {
                this.h = new Rect(cQf.h);
            }
        }
    }
}
