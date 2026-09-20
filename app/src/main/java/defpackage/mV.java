package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class mV extends ng5 implements Animatable {
    public final CQf x;
    public final Context y;
    public final QnHx z;

    public static class CQf extends Drawable.ConstantState {
        public og5 a;
        public AnimatorSet b;
        public ArrayList<Animator> c;
        public Bt7j<Animator, String> d;

        public CQf(QnHx qnHx) {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public class QnHx implements Drawable.Callback {
        public QnHx() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
            mV.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            mV.this.scheduleSelf(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            mV.this.unscheduleSelf(runnable);
        }
    }

    public mV() {
        this(null);
    }

    @Override // defpackage.ng5, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.w;
        if (drawable != null) {
            uo0.CQf.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.w;
        if (drawable != null) {
            return uo0.CQf.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        CQf cQf = this.x;
        cQf.a.draw(canvas);
        if (cQf.b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.w;
        return drawable != null ? uo0.QnHx.a(drawable) : this.x.a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.w;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.x.getClass();
        return changingConfigurations | 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.w;
        return drawable != null ? uo0.CQf.c(drawable) : this.x.a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.w == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new F1(this.w.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.w;
        return drawable != null ? drawable.getIntrinsicHeight() : this.x.a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.w;
        return drawable != null ? drawable.getIntrinsicWidth() : this.x.a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.w;
        return drawable != null ? drawable.getOpacity() : this.x.a.getOpacity();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v5 */
    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        CQf cQf;
        Animator animatorA;
        og5 og5Var;
        int next;
        Drawable drawable = this.w;
        if (drawable != null) {
            uo0.CQf.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            cQf = this.x;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayI = zb5.i(resources, theme, attributeSet, YYQR.e);
                    int resourceId = typedArrayI.getResourceId(0, 0);
                    if (resourceId != 0) {
                        PorterDuff.Mode mode = og5.F;
                        if (Build.VERSION.SDK_INT >= 24) {
                            og5Var = new og5();
                            ThreadLocal<TypedValue> threadLocal = sp3.a;
                            og5Var.w = sp3.QnHx.a(resources, resourceId, theme);
                            new og5.T23(og5Var.w.getConstantState());
                        } else {
                            try {
                                XmlResourceParser xml = resources.getXml(resourceId);
                                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                                do {
                                    next = xml.next();
                                    if (next == 2) {
                                        break;
                                    }
                                } while (next != 1);
                                if (next != 2) {
                                    throw new XmlPullParserException("No start tag found");
                                }
                                og5Var = new og5();
                                og5Var.inflate(resources, xml, attributeSetAsAttributeSet, theme);
                            } catch (IOException e) {
                                Log.e("VectorDrawableCompat", "parser error", e);
                                og5Var = null;
                            } catch (XmlPullParserException e2) {
                                Log.e("VectorDrawableCompat", "parser error", e2);
                                og5Var = null;
                            }
                        }
                        og5Var.B = false;
                        og5Var.setCallback(this.z);
                        og5 og5Var2 = cQf.a;
                        if (og5Var2 != null) {
                            og5Var2.setCallback(null);
                        }
                        cQf.a = og5Var;
                    }
                    typedArrayI.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, YYQR.f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        XmlResourceParser xmlResourceParser = this.y;
                        if (xmlResourceParser == 0) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        if (Build.VERSION.SDK_INT >= 24) {
                            animatorA = AnimatorInflater.loadAnimator(xmlResourceParser, resourceId2);
                        } else {
                            Resources resources2 = xmlResourceParser.getResources();
                            Resources.Theme theme2 = xmlResourceParser.getTheme();
                            try {
                                try {
                                    XmlResourceParser animation = resources2.getAnimation(resourceId2);
                                    try {
                                        animatorA = c2Z.a(xmlResourceParser, resources2, theme2, animation, Xml.asAttributeSet(animation), null, 0);
                                        animation.close();
                                    } catch (IOException e3) {
                                        e = e3;
                                        Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                        notFoundException.initCause(e);
                                        throw notFoundException;
                                    } catch (XmlPullParserException e4) {
                                        e = e4;
                                        Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                        notFoundException2.initCause(e);
                                        throw notFoundException2;
                                    } catch (Throwable th) {
                                        th = th;
                                        xmlResourceParser = animation;
                                        if (xmlResourceParser != 0) {
                                            xmlResourceParser.close();
                                        }
                                        throw th;
                                    }
                                } catch (IOException e5) {
                                    e = e5;
                                } catch (XmlPullParserException e6) {
                                    e = e6;
                                } catch (Throwable th2) {
                                    th = th2;
                                    xmlResourceParser = 0;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                        animatorA.setTarget(cQf.a.x.b.o.getOrDefault(string, null));
                        if (cQf.c == null) {
                            cQf.c = new ArrayList<>();
                            cQf.d = new Bt7j<>();
                        }
                        cQf.c.add(animatorA);
                        cQf.d.put(animatorA, string);
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (cQf.b == null) {
            cQf.b = new AnimatorSet();
        }
        cQf.b.playTogether(cQf.c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.w;
        return drawable != null ? uo0.QnHx.d(drawable) : this.x.a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.w;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.x.b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.w;
        return drawable != null ? drawable.isStateful() : this.x.a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.x.a.setBounds(rect);
        }
    }

    @Override // defpackage.ng5, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.w;
        return drawable != null ? drawable.setLevel(i) : this.x.a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.w;
        return drawable != null ? drawable.setState(iArr) : this.x.a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.x.a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.w;
        if (drawable != null) {
            uo0.QnHx.e(drawable, z);
        } else {
            this.x.a.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.x.a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.w;
        if (drawable != null) {
            uo0.d(drawable, i);
        } else {
            this.x.a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.w;
        if (drawable != null) {
            uo0.e(drawable, colorStateList);
        } else {
            this.x.a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.w;
        if (drawable != null) {
            uo0.f(drawable, mode);
        } else {
            this.x.a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.w;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.x.a.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.w;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        CQf cQf = this.x;
        if (cQf.b.isStarted()) {
            return;
        }
        cQf.b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.w;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.x.b.end();
        }
    }

    public mV(Context context) {
        QnHx qnHx = new QnHx();
        this.z = qnHx;
        this.y = context;
        this.x = new CQf(qnHx);
    }

    public static class F1 extends Drawable.ConstantState {
        public final Drawable.ConstantState a;

        public F1(Drawable.ConstantState constantState) {
            this.a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            mV mVVar = new mV();
            Drawable drawableNewDrawable = this.a.newDrawable();
            mVVar.w = drawableNewDrawable;
            drawableNewDrawable.setCallback(mVVar.z);
            return mVVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            mV mVVar = new mV();
            Drawable drawableNewDrawable = this.a.newDrawable(resources);
            mVVar.w = drawableNewDrawable;
            drawableNewDrawable.setCallback(mVVar.z);
            return mVVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            mV mVVar = new mV();
            Drawable drawableNewDrawable = this.a.newDrawable(resources, theme);
            mVVar.w = drawableNewDrawable;
            drawableNewDrawable.setCallback(mVVar.z);
            return mVVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
