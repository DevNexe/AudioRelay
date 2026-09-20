package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class og5 extends ng5 {
    public static final PorterDuff.Mode F = PorterDuff.Mode.SRC_IN;
    public boolean A;
    public boolean B;
    public final float[] C;
    public final Matrix D;
    public final Rect E;
    public auxFixed x;
    public PorterDuffColorFilter y;
    public ColorFilter z;

    public static abstract class LPt8Fixed {
        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    public static class QnHx extends NUlFixed {
        public QnHx() {
        }

        public QnHx(QnHx qnHx) {
            super(qnHx);
        }
    }

    public static class auxFixed extends Drawable.ConstantState {
        public int a;
        public YKK b;
        public ColorStateList c;
        public PorterDuff.Mode d;
        public boolean e;
        public Bitmap f;
        public ColorStateList g;
        public PorterDuff.Mode h;
        public int i;
        public boolean j;
        public boolean k;
        public Paint l;

        public auxFixed(auxFixed auxVar) {
            this.c = null;
            this.d = og5.F;
            if (auxVar != null) {
                this.a = auxVar.a;
                YKK ykk = new YKK(auxVar.b);
                this.b = ykk;
                if (auxVar.b.e != null) {
                    ykk.e = new Paint(auxVar.b.e);
                }
                if (auxVar.b.d != null) {
                    this.b.d = new Paint(auxVar.b.d);
                }
                this.c = auxVar.c;
                this.d = auxVar.d;
                this.e = auxVar.e;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new og5(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new og5(this);
        }

        public auxFixed() {
            this.c = null;
            this.d = og5.F;
            this.b = new YKK();
        }
    }

    public og5() {
        this.B = true;
        this.C = new float[9];
        this.D = new Matrix();
        this.E = new Rect();
        this.x = new auxFixed();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.w;
        if (drawable == null) {
            return false;
        }
        uo0.CQf.b(drawable);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00c1  */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.E;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.z;
        if (colorFilter == null) {
            colorFilter = this.y;
        }
        Matrix matrix = this.D;
        canvas.getMatrix(matrix);
        float[] fArr = this.C;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iHeight = (int) (rect.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && uo0.b(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        auxFixed auxVar = this.x;
        Bitmap bitmap = auxVar.f;
        if (bitmap == null) {
            auxVar.f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            auxVar.k = true;
        } else {
            if (!(iMin == bitmap.getWidth() && iMin2 == auxVar.f.getHeight())) {
                auxVar.f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
                auxVar.k = true;
            }
        }
        if (this.B) {
            auxFixed auxVar2 = this.x;
            if (!(!auxVar2.k && auxVar2.g == auxVar2.c && auxVar2.h == auxVar2.d && auxVar2.j == auxVar2.e && auxVar2.i == auxVar2.b.getRootAlpha())) {
                auxFixed auxVar3 = this.x;
                auxVar3.f.eraseColor(0);
                Canvas canvas2 = new Canvas(auxVar3.f);
                YKK ykk = auxVar3.b;
                ykk.a(ykk.g, YKK.p, canvas2, iMin, iMin2);
                auxFixed auxVar4 = this.x;
                auxVar4.g = auxVar4.c;
                auxVar4.h = auxVar4.d;
                auxVar4.i = auxVar4.b.getRootAlpha();
                auxVar4.j = auxVar4.e;
                auxVar4.k = false;
            }
        } else {
            auxFixed auxVar5 = this.x;
            auxVar5.f.eraseColor(0);
            Canvas canvas3 = new Canvas(auxVar5.f);
            YKK ykk2 = auxVar5.b;
            ykk2.a(ykk2.g, YKK.p, canvas3, iMin, iMin2);
        }
        auxFixed auxVar6 = this.x;
        if ((auxVar6.b.getRootAlpha() < 255) || colorFilter != null) {
            if (auxVar6.l == null) {
                Paint paint2 = new Paint();
                auxVar6.l = paint2;
                paint2.setFilterBitmap(true);
            }
            auxVar6.l.setAlpha(auxVar6.b.getRootAlpha());
            auxVar6.l.setColorFilter(colorFilter);
            paint = auxVar6.l;
        } else {
            paint = null;
        }
        canvas.drawBitmap(auxVar6.f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.w;
        return drawable != null ? uo0.QnHx.a(drawable) : this.x.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.w;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.x.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.w;
        return drawable != null ? uo0.CQf.c(drawable) : this.z;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.w != null && Build.VERSION.SDK_INT >= 24) {
            return new T23(this.w.getConstantState());
        }
        this.x.a = getChangingConfigurations();
        return this.x;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.w;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.x.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.w;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.x.b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.w;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.w;
        return drawable != null ? uo0.QnHx.d(drawable) : this.x.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.w;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            auxFixed auxVar = this.x;
            if (auxVar != null) {
                YKK ykk = auxVar.b;
                if (ykk.n == null) {
                    ykk.n = Boolean.valueOf(ykk.g.a());
                }
                if (ykk.n.booleanValue() || ((colorStateList = this.x.c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.A && super.mutate() == this) {
            this.x = new auxFixed(this.x);
            this.A = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.w;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        auxFixed auxVar = this.x;
        ColorStateList colorStateList = auxVar.c;
        if (colorStateList == null || (mode = auxVar.d) == null) {
            z = false;
        } else {
            this.y = a(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        YKK ykk = auxVar.b;
        if (ykk.n == null) {
            ykk.n = Boolean.valueOf(ykk.g.a());
        }
        if (ykk.n.booleanValue()) {
            boolean zB = auxVar.b.g.b(iArr);
            auxVar.k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.x.b.getRootAlpha() != i) {
            this.x.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.w;
        if (drawable != null) {
            uo0.QnHx.e(drawable, z);
        } else {
            this.x.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.z = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.w;
        if (drawable != null) {
            uo0.d(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.w;
        if (drawable != null) {
            uo0.CQf.h(drawable, colorStateList);
            return;
        }
        auxFixed auxVar = this.x;
        if (auxVar.c != colorStateList) {
            auxVar.c = colorStateList;
            this.y = a(colorStateList, auxVar.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.w;
        if (drawable != null) {
            uo0.CQf.i(drawable, mode);
            return;
        }
        auxFixed auxVar = this.x;
        if (auxVar.d != mode) {
            auxVar.d = mode;
            this.y = a(auxVar.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.w;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public static class T23 extends Drawable.ConstantState {
        public final Drawable.ConstantState a;

        public T23(Drawable.ConstantState constantState) {
            this.a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            og5 og5Var = new og5();
            og5Var.w = (VectorDrawable) this.a.newDrawable();
            return og5Var;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            og5 og5Var = new og5();
            og5Var.w = (VectorDrawable) this.a.newDrawable(resources);
            return og5Var;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            og5 og5Var = new og5();
            og5Var.w = (VectorDrawable) this.a.newDrawable(resources, theme);
            return og5Var;
        }
    }

    public static abstract class NUlFixed extends LPt8Fixed {
        public wz2.QnHx[] a;
        public String b;
        public int c;
        public final int d;

        public NUlFixed() {
            this.a = null;
            this.c = 0;
        }

        public wz2.QnHx[] getPathData() {
            return this.a;
        }

        public String getPathName() {
            return this.b;
        }

        public void setPathData(wz2.QnHx[] qnHxArr) {
            if (!wz2.a(this.a, qnHxArr)) {
                this.a = wz2.e(qnHxArr);
                return;
            }
            wz2.QnHx[] qnHxArr2 = this.a;
            for (int i = 0; i < qnHxArr.length; i++) {
                qnHxArr2[i].a = qnHxArr[i].a;
                int i2 = 0;
                while (true) {
                    float[] fArr = qnHxArr[i].b;
                    if (i2 < fArr.length) {
                        qnHxArr2[i].b[i2] = fArr[i2];
                        i2++;
                    }
                }
            }
        }

        public NUlFixed(NUlFixed nUl) {
            this.a = null;
            this.c = 0;
            this.b = nUl.b;
            this.d = nUl.d;
            this.a = wz2.e(nUl.a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i;
        Resources resources2 = resources;
        Drawable drawable = this.w;
        if (drawable != null) {
            uo0.CQf.d(drawable, resources2, xmlPullParser, attributeSet, theme);
            return;
        }
        auxFixed auxVar = this.x;
        auxVar.b = new YKK();
        TypedArray typedArrayI = zb5.i(resources2, theme, attributeSet, YYQR.a);
        auxFixed auxVar2 = this.x;
        YKK ykk = auxVar2.b;
        int iE = zb5.e(typedArrayI, xmlPullParser, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (iE == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (iE != 5) {
            if (iE != 9) {
                switch (iE) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        auxVar2.d = mode;
        ColorStateList colorStateListB = zb5.b(typedArrayI, xmlPullParser, theme);
        if (colorStateListB != null) {
            auxVar2.c = colorStateListB;
        }
        boolean z = auxVar2.e;
        if (zb5.h(xmlPullParser, "autoMirrored")) {
            z = typedArrayI.getBoolean(5, z);
        }
        auxVar2.e = z;
        ykk.j = zb5.d(typedArrayI, xmlPullParser, "viewportWidth", 7, ykk.j);
        float fD = zb5.d(typedArrayI, xmlPullParser, "viewportHeight", 8, ykk.k);
        ykk.k = fD;
        if (ykk.j <= 0.0f) {
            throw new XmlPullParserException(typedArrayI.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (fD > 0.0f) {
            ykk.h = typedArrayI.getDimension(3, ykk.h);
            int i2 = 2;
            float dimension = typedArrayI.getDimension(2, ykk.i);
            ykk.i = dimension;
            if (ykk.h <= 0.0f) {
                throw new XmlPullParserException(typedArrayI.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                ykk.setAlpha(zb5.d(typedArrayI, xmlPullParser, "alpha", 4, ykk.getAlpha()));
                String string = typedArrayI.getString(0);
                if (string != null) {
                    ykk.m = string;
                    ykk.o.put(string, ykk);
                }
                typedArrayI.recycle();
                auxVar.a = getChangingConfigurations();
                int i3 = 1;
                auxVar.k = true;
                auxFixed auxVar3 = this.x;
                YKK ykk2 = auxVar3.b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(ykk2.g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z2 = true;
                for (int i4 = 3; eventType != i3 && (xmlPullParser.getDepth() >= depth || eventType != i4); i4 = 3) {
                    if (eventType == i2) {
                        String name = xmlPullParser.getName();
                        F1 f1 = (F1) arrayDeque.peek();
                        boolean zEquals = "path".equals(name);
                        i = depth;
                        Bt7j<String, Object> bt7j = ykk2.o;
                        if (zEquals) {
                            CQf cQf = new CQf();
                            TypedArray typedArrayI2 = zb5.i(resources2, theme, attributeSet, YYQR.c);
                            if (zb5.h(xmlPullParser, "pathData")) {
                                String string2 = typedArrayI2.getString(0);
                                if (string2 != null) {
                                    cQf.b = string2;
                                }
                                String string3 = typedArrayI2.getString(2);
                                if (string3 != null) {
                                    cQf.a = wz2.c(string3);
                                }
                                cQf.g = zb5.c(typedArrayI2, xmlPullParser, theme, "fillColor", 1);
                                cQf.i = zb5.d(typedArrayI2, xmlPullParser, "fillAlpha", 12, cQf.i);
                                int iE2 = zb5.e(typedArrayI2, xmlPullParser, "strokeLineCap", 8, -1);
                                Paint.Cap cap = cQf.m;
                                if (iE2 == 0) {
                                    cap = Paint.Cap.BUTT;
                                } else if (iE2 == 1) {
                                    cap = Paint.Cap.ROUND;
                                } else if (iE2 == 2) {
                                    cap = Paint.Cap.SQUARE;
                                }
                                cQf.m = cap;
                                int iE3 = zb5.e(typedArrayI2, xmlPullParser, "strokeLineJoin", 9, -1);
                                Paint.Join join = cQf.n;
                                if (iE3 == 0) {
                                    join = Paint.Join.MITER;
                                } else if (iE3 == 1) {
                                    join = Paint.Join.ROUND;
                                } else if (iE3 == 2) {
                                    join = Paint.Join.BEVEL;
                                }
                                cQf.n = join;
                                cQf.o = zb5.d(typedArrayI2, xmlPullParser, "strokeMiterLimit", 10, cQf.o);
                                cQf.e = zb5.c(typedArrayI2, xmlPullParser, theme, "strokeColor", 3);
                                cQf.h = zb5.d(typedArrayI2, xmlPullParser, "strokeAlpha", 11, cQf.h);
                                cQf.f = zb5.d(typedArrayI2, xmlPullParser, "strokeWidth", 4, cQf.f);
                                cQf.k = zb5.d(typedArrayI2, xmlPullParser, "trimPathEnd", 6, cQf.k);
                                cQf.l = zb5.d(typedArrayI2, xmlPullParser, "trimPathOffset", 7, cQf.l);
                                cQf.j = zb5.d(typedArrayI2, xmlPullParser, "trimPathStart", 5, cQf.j);
                                cQf.c = zb5.e(typedArrayI2, xmlPullParser, "fillType", 13, cQf.c);
                            }
                            typedArrayI2.recycle();
                            f1.b.add(cQf);
                            if (cQf.getPathName() != null) {
                                bt7j.put(cQf.getPathName(), cQf);
                            }
                            auxVar3.a = cQf.d | auxVar3.a;
                            z2 = false;
                        } else {
                            ykk2 = ykk2;
                            if ("clip-path".equals(name)) {
                                QnHx qnHx = new QnHx();
                                if (zb5.h(xmlPullParser, "pathData")) {
                                    TypedArray typedArrayI3 = zb5.i(resources2, theme, attributeSet, YYQR.d);
                                    String string4 = typedArrayI3.getString(0);
                                    if (string4 != null) {
                                        qnHx.b = string4;
                                    }
                                    String string5 = typedArrayI3.getString(1);
                                    if (string5 != null) {
                                        qnHx.a = wz2.c(string5);
                                    }
                                    qnHx.c = zb5.e(typedArrayI3, xmlPullParser, "fillType", 2, 0);
                                    typedArrayI3.recycle();
                                }
                                f1.b.add(qnHx);
                                if (qnHx.getPathName() != null) {
                                    bt7j.put(qnHx.getPathName(), qnHx);
                                }
                                auxVar3.a |= qnHx.d;
                            } else if ("group".equals(name)) {
                                F1 f2 = new F1();
                                TypedArray typedArrayI4 = zb5.i(resources2, theme, attributeSet, YYQR.b);
                                f2.c = zb5.d(typedArrayI4, xmlPullParser, "rotation", 5, f2.c);
                                f2.d = typedArrayI4.getFloat(1, f2.d);
                                f2.e = typedArrayI4.getFloat(2, f2.e);
                                f2.f = zb5.d(typedArrayI4, xmlPullParser, "scaleX", 3, f2.f);
                                f2.g = zb5.d(typedArrayI4, xmlPullParser, "scaleY", 4, f2.g);
                                f2.h = zb5.d(typedArrayI4, xmlPullParser, "translateX", 6, f2.h);
                                f2.i = zb5.d(typedArrayI4, xmlPullParser, "translateY", 7, f2.i);
                                String string6 = typedArrayI4.getString(0);
                                if (string6 != null) {
                                    f2.l = string6;
                                }
                                f2.c();
                                typedArrayI4.recycle();
                                f1.b.add(f2);
                                arrayDeque.push(f2);
                                if (f2.getGroupName() != null) {
                                    bt7j.put(f2.getGroupName(), f2);
                                }
                                auxVar3.a = f2.k | auxVar3.a;
                            }
                        }
                    } else {
                        ykk2 = ykk2;
                        i = depth;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    resources2 = resources;
                    depth = i;
                    ykk2 = ykk2;
                    i3 = 1;
                    i2 = 2;
                }
                if (!z2) {
                    this.y = a(auxVar.c, auxVar.d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayI.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayI.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public og5(auxFixed auxVar) {
        this.B = true;
        this.C = new float[9];
        this.D = new Matrix();
        this.E = new Rect();
        this.x = auxVar;
        this.y = a(auxVar.c, auxVar.d);
    }

    public static class CQf extends NUlFixed {
        public my e;
        public float f;
        public my g;
        public float h;
        public float i;
        public float j;
        public float k;
        public float l;
        public Paint.Cap m;
        public Paint.Join n;
        public float o;

        public CQf() {
            this.f = 0.0f;
            this.h = 1.0f;
            this.i = 1.0f;
            this.j = 0.0f;
            this.k = 1.0f;
            this.l = 0.0f;
            this.m = Paint.Cap.BUTT;
            this.n = Paint.Join.MITER;
            this.o = 4.0f;
        }

        @Override // og5.LPt8Fixed
        public final boolean a() {
            return this.g.b() || this.e.b();
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0036  */
        /* JADX WARN: Code duplicated, block: B:7:0x001c  */
        @Override // og5.LPt8Fixed
        public final boolean b(int[] iArr) {
            boolean z;
            my myVar = this.g;
            boolean z2 = true;
            if (myVar.b()) {
                ColorStateList colorStateList = myVar.b;
                int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
                if (colorForState != myVar.c) {
                    myVar.c = colorForState;
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            my myVar2 = this.e;
            if (myVar2.b()) {
                ColorStateList colorStateList2 = myVar2.b;
                int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                if (colorForState2 != myVar2.c) {
                    myVar2.c = colorForState2;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            return z2 | z;
        }

        public float getFillAlpha() {
            return this.i;
        }

        public int getFillColor() {
            return this.g.c;
        }

        public float getStrokeAlpha() {
            return this.h;
        }

        public int getStrokeColor() {
            return this.e.c;
        }

        public float getStrokeWidth() {
            return this.f;
        }

        public float getTrimPathEnd() {
            return this.k;
        }

        public float getTrimPathOffset() {
            return this.l;
        }

        public float getTrimPathStart() {
            return this.j;
        }

        public void setFillAlpha(float f) {
            this.i = f;
        }

        public void setFillColor(int i) {
            this.g.c = i;
        }

        public void setStrokeAlpha(float f) {
            this.h = f;
        }

        public void setStrokeColor(int i) {
            this.e.c = i;
        }

        public void setStrokeWidth(float f) {
            this.f = f;
        }

        public void setTrimPathEnd(float f) {
            this.k = f;
        }

        public void setTrimPathOffset(float f) {
            this.l = f;
        }

        public void setTrimPathStart(float f) {
            this.j = f;
        }

        public CQf(CQf cQf) {
            super(cQf);
            this.f = 0.0f;
            this.h = 1.0f;
            this.i = 1.0f;
            this.j = 0.0f;
            this.k = 1.0f;
            this.l = 0.0f;
            this.m = Paint.Cap.BUTT;
            this.n = Paint.Join.MITER;
            this.o = 4.0f;
            this.e = cQf.e;
            this.f = cQf.f;
            this.h = cQf.h;
            this.g = cQf.g;
            this.c = cQf.c;
            this.i = cQf.i;
            this.j = cQf.j;
            this.k = cQf.k;
            this.l = cQf.l;
            this.m = cQf.m;
            this.n = cQf.n;
            this.o = cQf.o;
        }
    }

    public static class F1 extends LPt8Fixed {
        public final Matrix a;
        public final ArrayList<LPt8Fixed> b;
        public float c;
        public float d;
        public float e;
        public float f;
        public float g;
        public float h;
        public float i;
        public final Matrix j;
        public final int k;
        public String l;

        public F1() {
            this.a = new Matrix();
            this.b = new ArrayList<>();
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 1.0f;
            this.g = 1.0f;
            this.h = 0.0f;
            this.i = 0.0f;
            this.j = new Matrix();
            this.l = null;
        }

        @Override // og5.LPt8Fixed
        public final boolean a() {
            int i = 0;
            while (true) {
                ArrayList<LPt8Fixed> arrayList = this.b;
                if (i >= arrayList.size()) {
                    return false;
                }
                if (arrayList.get(i).a()) {
                    return true;
                }
                i++;
            }
        }

        @Override // og5.LPt8Fixed
        public final boolean b(int[] iArr) {
            int i = 0;
            boolean zB = false;
            while (true) {
                ArrayList<LPt8Fixed> arrayList = this.b;
                if (i >= arrayList.size()) {
                    return zB;
                }
                zB |= arrayList.get(i).b(iArr);
                i++;
            }
        }

        public final void c() {
            Matrix matrix = this.j;
            matrix.reset();
            matrix.postTranslate(-this.d, -this.e);
            matrix.postScale(this.f, this.g);
            matrix.postRotate(this.c, 0.0f, 0.0f);
            matrix.postTranslate(this.h + this.d, this.i + this.e);
        }

        public String getGroupName() {
            return this.l;
        }

        public Matrix getLocalMatrix() {
            return this.j;
        }

        public float getPivotX() {
            return this.d;
        }

        public float getPivotY() {
            return this.e;
        }

        public float getRotation() {
            return this.c;
        }

        public float getScaleX() {
            return this.f;
        }

        public float getScaleY() {
            return this.g;
        }

        public float getTranslateX() {
            return this.h;
        }

        public float getTranslateY() {
            return this.i;
        }

        public void setPivotX(float f) {
            if (f != this.d) {
                this.d = f;
                c();
            }
        }

        public void setPivotY(float f) {
            if (f != this.e) {
                this.e = f;
                c();
            }
        }

        public void setRotation(float f) {
            if (f != this.c) {
                this.c = f;
                c();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f) {
                this.f = f;
                c();
            }
        }

        public void setScaleY(float f) {
            if (f != this.g) {
                this.g = f;
                c();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.h) {
                this.h = f;
                c();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.i) {
                this.i = f;
                c();
            }
        }

        public F1(F1 f1, Bt7j<String, Object> bt7j) {
            NUlFixed qnHx;
            this.a = new Matrix();
            this.b = new ArrayList<>();
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 1.0f;
            this.g = 1.0f;
            this.h = 0.0f;
            this.i = 0.0f;
            Matrix matrix = new Matrix();
            this.j = matrix;
            this.l = null;
            this.c = f1.c;
            this.d = f1.d;
            this.e = f1.e;
            this.f = f1.f;
            this.g = f1.g;
            this.h = f1.h;
            this.i = f1.i;
            String str = f1.l;
            this.l = str;
            this.k = f1.k;
            if (str != null) {
                bt7j.put(str, this);
            }
            matrix.set(f1.j);
            ArrayList<LPt8Fixed> arrayList = f1.b;
            for (int i = 0; i < arrayList.size(); i++) {
                LPt8Fixed lPt8 = arrayList.get(i);
                if (lPt8 instanceof F1) {
                    this.b.add(new F1((F1) lPt8, bt7j));
                } else {
                    if (lPt8 instanceof CQf) {
                        qnHx = new CQf((CQf) lPt8);
                    } else if (lPt8 instanceof QnHx) {
                        qnHx = new QnHx((QnHx) lPt8);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.b.add(qnHx);
                    String str2 = qnHx.b;
                    if (str2 != null) {
                        bt7j.put(str2, qnHx);
                    }
                }
            }
        }
    }

    public static class YKK {
        public static final Matrix p = new Matrix();
        public final Path a;
        public final Path b;
        public final Matrix c;
        public Paint d;
        public Paint e;
        public PathMeasure f;
        public final F1 g;
        public float h;
        public float i;
        public float j;
        public float k;
        public int l;
        public String m;
        public Boolean n;
        public final Bt7j<String, Object> o;

        public YKK() {
            this.c = new Matrix();
            this.h = 0.0f;
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 255;
            this.m = null;
            this.n = null;
            this.o = new Bt7j<>();
            this.g = new F1();
            this.a = new Path();
            this.b = new Path();
        }

        public final void a(F1 f1, Matrix matrix, Canvas canvas, int i, int i2) {
            int i3;
            float f;
            boolean z;
            f1.a.set(matrix);
            Matrix matrix2 = f1.a;
            matrix2.preConcat(f1.j);
            canvas.save();
            char c = 0;
            int i4 = 0;
            while (true) {
                ArrayList<LPt8Fixed> arrayList = f1.b;
                if (i4 >= arrayList.size()) {
                    canvas.restore();
                    return;
                }
                LPt8Fixed lPt8 = arrayList.get(i4);
                if (lPt8 instanceof F1) {
                    a((F1) lPt8, matrix2, canvas, i, i2);
                } else {
                    if (lPt8 instanceof NUlFixed) {
                        NUlFixed nUl = (NUlFixed) lPt8;
                        float f2 = i / this.j;
                        float f3 = i2 / this.k;
                        float fMin = Math.min(f2, f3);
                        Matrix matrix3 = this.c;
                        matrix3.set(matrix2);
                        matrix3.postScale(f2, f3);
                        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                        matrix2.mapVectors(fArr);
                        float fHypot = (float) Math.hypot(fArr[c], fArr[1]);
                        i3 = i4;
                        float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                        float f4 = (fArr[0] * fArr[3]) - (fArr[1] * fArr[2]);
                        float fMax = Math.max(fHypot, fHypot2);
                        float fAbs = fMax > 0.0f ? Math.abs(f4) / fMax : 0.0f;
                        if (fAbs != 0.0f) {
                            nUl.getClass();
                            Path path = this.a;
                            path.reset();
                            wz2.QnHx[] qnHxArr = nUl.a;
                            if (qnHxArr != null) {
                                wz2.QnHx.b(qnHxArr, path);
                            }
                            Path path2 = this.b;
                            path2.reset();
                            if (nUl instanceof QnHx) {
                                path2.setFillType(nUl.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                path2.addPath(path, matrix3);
                                canvas.clipPath(path2);
                            } else {
                                CQf cQf = (CQf) nUl;
                                float f5 = cQf.j;
                                if (f5 != 0.0f || cQf.k != 1.0f) {
                                    float f6 = cQf.l;
                                    float f7 = (f5 + f6) % 1.0f;
                                    float f8 = (cQf.k + f6) % 1.0f;
                                    if (this.f == null) {
                                        this.f = new PathMeasure();
                                    }
                                    this.f.setPath(path, false);
                                    float length = this.f.getLength();
                                    float f9 = f7 * length;
                                    float f10 = f8 * length;
                                    path.reset();
                                    if (f9 > f10) {
                                        this.f.getSegment(f9, length, path, true);
                                        f = 0.0f;
                                        this.f.getSegment(0.0f, f10, path, true);
                                    } else {
                                        f = 0.0f;
                                        this.f.getSegment(f9, f10, path, true);
                                    }
                                    path.rLineTo(f, f);
                                }
                                path2.addPath(path, matrix3);
                                my myVar = cQf.g;
                                if ((myVar.a != null) || myVar.c != 0) {
                                    if (this.e == null) {
                                        Paint paint = new Paint(1);
                                        this.e = paint;
                                        paint.setStyle(Paint.Style.FILL);
                                    }
                                    Paint paint2 = this.e;
                                    Shader shader = myVar.a;
                                    if (shader != null) {
                                        shader.setLocalMatrix(matrix3);
                                        paint2.setShader(shader);
                                        paint2.setAlpha(Math.round(cQf.i * 255.0f));
                                    } else {
                                        paint2.setShader(null);
                                        paint2.setAlpha(255);
                                        int i5 = myVar.c;
                                        float f11 = cQf.i;
                                        PorterDuff.Mode mode = og5.F;
                                        paint2.setColor((i5 & 16777215) | (((int) (Color.alpha(i5) * f11)) << 24));
                                    }
                                    paint2.setColorFilter(null);
                                    path2.setFillType(cQf.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                    canvas.drawPath(path2, paint2);
                                }
                                my myVar2 = cQf.e;
                                if ((myVar2.a != null) || myVar2.c != 0) {
                                    if (this.d == null) {
                                        z = true;
                                        Paint paint3 = new Paint(1);
                                        this.d = paint3;
                                        paint3.setStyle(Paint.Style.STROKE);
                                    } else {
                                        z = true;
                                    }
                                    Paint paint4 = this.d;
                                    Paint.Join join = cQf.n;
                                    if (join != null) {
                                        paint4.setStrokeJoin(join);
                                    }
                                    Paint.Cap cap = cQf.m;
                                    if (cap != null) {
                                        paint4.setStrokeCap(cap);
                                    }
                                    paint4.setStrokeMiter(cQf.o);
                                    Shader shader2 = myVar2.a;
                                    if (shader2 == null) {
                                        z = false;
                                    }
                                    if (z) {
                                        shader2.setLocalMatrix(matrix3);
                                        paint4.setShader(shader2);
                                        paint4.setAlpha(Math.round(cQf.h * 255.0f));
                                    } else {
                                        paint4.setShader(null);
                                        paint4.setAlpha(255);
                                        int i6 = myVar2.c;
                                        float f12 = cQf.h;
                                        PorterDuff.Mode mode2 = og5.F;
                                        paint4.setColor((i6 & 16777215) | (((int) (Color.alpha(i6) * f12)) << 24));
                                    }
                                    paint4.setColorFilter(null);
                                    paint4.setStrokeWidth(cQf.f * fAbs * fMin);
                                    canvas.drawPath(path2, paint4);
                                }
                            }
                        }
                    }
                    i4 = i3 + 1;
                    c = 0;
                }
                i3 = i4;
                i4 = i3 + 1;
                c = 0;
            }
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.l;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.l = i;
        }

        public YKK(YKK ykk) {
            this.c = new Matrix();
            this.h = 0.0f;
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 255;
            this.m = null;
            this.n = null;
            Bt7j<String, Object> bt7j = new Bt7j<>();
            this.o = bt7j;
            this.g = new F1(ykk.g, bt7j);
            this.a = new Path(ykk.a);
            this.b = new Path(ykk.b);
            this.h = ykk.h;
            this.i = ykk.i;
            this.j = ykk.j;
            this.k = ykk.k;
            this.l = ykk.l;
            this.m = ykk.m;
            String str = ykk.m;
            if (str != null) {
                bt7j.put(str, this);
            }
            this.n = ykk.n;
        }
    }
}
